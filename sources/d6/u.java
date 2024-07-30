package d6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static u f27372e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f27373a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<a>> f27374b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f27375c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f27376d = 0;

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes2.dex */
    public interface a {
        void onNetworkTypeChanged(int i10);
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes2.dex */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i10;
            int i11;
            u uVar;
            Executor mainExecutor;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    i10 = 1;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        int type = activeNetworkInfo.getType();
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i10 = type != 9 ? 8 : 7;
                                    }
                                    i10 = 5;
                                }
                            }
                            i10 = 2;
                        }
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (g0.f27302a >= 29) {
                                    i10 = 9;
                                    break;
                                }
                                break;
                        }
                    }
                } catch (SecurityException unused) {
                }
                i11 = g0.f27302a;
                uVar = u.this;
                if (i11 < 31 && i10 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        t tVar = new t(uVar);
                        mainExecutor = context.getMainExecutor();
                        telephonyManager.registerTelephonyCallback(mainExecutor, tVar);
                        telephonyManager.unregisterTelephonyCallback(tVar);
                        return;
                    } catch (RuntimeException unused2) {
                        u.a(uVar, 5);
                        return;
                    }
                }
                u.a(uVar, i10);
            }
            i10 = 0;
            i11 = g0.f27302a;
            uVar = u.this;
            if (i11 < 31) {
            }
            u.a(uVar, i10);
        }
    }

    public u(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new b(), intentFilter);
    }

    public static void a(u uVar, int i10) {
        synchronized (uVar.f27375c) {
            if (uVar.f27376d != i10) {
                uVar.f27376d = i10;
                Iterator<WeakReference<a>> it = uVar.f27374b.iterator();
                while (it.hasNext()) {
                    WeakReference<a> next = it.next();
                    a aVar = next.get();
                    if (aVar != null) {
                        aVar.onNetworkTypeChanged(i10);
                    } else {
                        uVar.f27374b.remove(next);
                    }
                }
            }
        }
    }

    public static synchronized u b(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f27372e == null) {
                f27372e = new u(context);
            }
            uVar = f27372e;
        }
        return uVar;
    }
}
