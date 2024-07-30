package com.vungle.warren.utility;

import a0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class NetworkProvider {
    private static NetworkProvider INSTANCE = null;
    static final long NETWORK_CHECK_DELAY = 30000;
    private static final String TAG = "NetworkProvider";
    public static final int TYPE_NONE = -1;
    private final ConnectivityManager cm;
    private final Context ctx;
    private final AtomicInteger currentNetwork;
    private boolean enabled;
    private final Handler handler;
    private final Set<NetworkListener> listeners;
    private ConnectivityManager.NetworkCallback networkCallback;
    private Runnable typeRunnable;

    /* loaded from: classes2.dex */
    public interface NetworkListener {
        void onChanged(int i10);
    }

    private NetworkProvider(Context context) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.currentNetwork = atomicInteger;
        this.listeners = new CopyOnWriteArraySet();
        this.handler = new Handler(Looper.getMainLooper());
        this.typeRunnable = new Runnable() { // from class: com.vungle.warren.utility.NetworkProvider.3
            @Override // java.lang.Runnable
            public void run() {
                if (!NetworkProvider.this.listeners.isEmpty()) {
                    NetworkProvider.this.onNetworkChanged();
                    NetworkProvider.this.handler.postDelayed(NetworkProvider.this.typeRunnable, NetworkProvider.NETWORK_CHECK_DELAY);
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        this.ctx = applicationContext;
        this.cm = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        atomicInteger.set(getCurrentNetworkType());
    }

    public static synchronized NetworkProvider getInstance(Context context) {
        NetworkProvider networkProvider;
        synchronized (NetworkProvider.class) {
            if (INSTANCE == null) {
                INSTANCE = new NetworkProvider(context);
            }
            networkProvider = INSTANCE;
        }
        return networkProvider;
    }

    @SuppressLint({"newApi"})
    private ConnectivityManager.NetworkCallback getNetworkCallback() {
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback == null) {
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.vungle.warren.utility.NetworkProvider.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    NetworkProvider.this.onNetworkChanged();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    NetworkProvider.this.onNetworkChanged();
                }
            };
            this.networkCallback = networkCallback2;
            return networkCallback2;
        }
        return networkCallback;
    }

    private void postToListeners(final int i10) {
        this.handler.post(new Runnable() { // from class: com.vungle.warren.utility.NetworkProvider.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = NetworkProvider.this.listeners.iterator();
                while (it.hasNext()) {
                    ((NetworkListener) it.next()).onChanged(i10);
                }
            }
        });
    }

    private synchronized void setEnableNetworkListener(boolean z10) {
        if (this.enabled != z10) {
            this.enabled = z10;
            ConnectivityManager connectivityManager = this.cm;
            if (connectivityManager != null) {
                try {
                    if (z10) {
                        NetworkRequest.Builder builder = new NetworkRequest.Builder();
                        builder.addCapability(12);
                        this.cm.registerNetworkCallback(builder.build(), getNetworkCallback());
                    } else {
                        connectivityManager.unregisterNetworkCallback(getNetworkCallback());
                    }
                } catch (Exception e10) {
                    if (!TextUtils.isEmpty(e10.getMessage())) {
                        Log.e(TAG, e10.getMessage());
                    }
                }
            }
        }
    }

    public void addListener(NetworkListener networkListener) {
        this.listeners.add(networkListener);
        setEnableNetworkListener(true);
    }

    public int getCurrentNetworkType() {
        int i10 = -1;
        if (this.cm != null && a.x0(this.ctx, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkInfo activeNetworkInfo = this.cm.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                i10 = activeNetworkInfo.getType();
            }
            int andSet = this.currentNetwork.getAndSet(i10);
            if (i10 != andSet) {
                Log.d(TAG, "on network changed: " + andSet + "->" + i10);
                postToListeners(i10);
            }
            setEnableNetworkListener(!this.listeners.isEmpty());
            return i10;
        }
        this.currentNetwork.set(-1);
        return -1;
    }

    public void onNetworkChanged() {
        getCurrentNetworkType();
    }

    public void removeListener(NetworkListener networkListener) {
        this.listeners.remove(networkListener);
        setEnableNetworkListener(!this.listeners.isEmpty());
    }
}
