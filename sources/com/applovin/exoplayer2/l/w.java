package com.applovin.exoplayer2.l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.applovin.exoplayer2.b.d0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static w f16355a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f16356b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f16357c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final Object f16358d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private int f16359e = 0;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile boolean f16360a;
    }

    /* loaded from: classes.dex */
    public interface b {
        void onNetworkTypeChanged(int i10);
    }

    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int c10 = w.c(context);
            int i10 = ai.f16274a;
            if (i10 >= 29 && !a.f16360a && c10 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) com.applovin.exoplayer2.l.a.b((TelephonyManager) context.getSystemService("phone"));
                    d dVar = new d();
                    if (i10 < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, com.anythink.expressad.exoplayer.h.o.f8460d);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            w.this.a(c10);
        }
    }

    /* loaded from: classes.dex */
    public class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            boolean z10;
            int i10;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType != 3 && overrideNetworkType != 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            w wVar = w.this;
            if (z10) {
                i10 = 10;
            } else {
                i10 = 5;
            }
            wVar.a(i10);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2;
            boolean z10;
            int i10;
            if (serviceState == null) {
                serviceState2 = "";
            } else {
                serviceState2 = serviceState.toString();
            }
            if (!serviceState2.contains("nrState=CONNECTED") && !serviceState2.contains("nrState=NOT_RESTRICTED")) {
                z10 = false;
            } else {
                z10 = true;
            }
            w wVar = w.this;
            if (z10) {
                i10 = 10;
            } else {
                i10 = 5;
            }
            wVar.a(i10);
        }
    }

    private w(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 4 && type != 5) {
                            if (type == 6) {
                                return 5;
                            }
                            if (type != 9) {
                                return 8;
                            }
                            return 7;
                        }
                    } else {
                        return 2;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        bVar.onNetworkTypeChanged(a());
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f16355a == null) {
                f16355a = new w(context);
            }
            wVar = f16355a;
        }
        return wVar;
    }

    private void b() {
        Iterator<WeakReference<b>> it = this.f16357c.iterator();
        while (it.hasNext()) {
            WeakReference<b> next = it.next();
            if (next.get() == null) {
                this.f16357c.remove(next);
            }
        }
    }

    public void a(b bVar) {
        b();
        this.f16357c.add(new WeakReference<>(bVar));
        this.f16356b.post(new d0(2, this, bVar));
    }

    public int a() {
        int i10;
        synchronized (this.f16358d) {
            i10 = this.f16359e;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        synchronized (this.f16358d) {
            if (this.f16359e == i10) {
                return;
            }
            this.f16359e = i10;
            Iterator<WeakReference<b>> it = this.f16357c.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                b bVar = next.get();
                if (bVar != null) {
                    bVar.onNetworkTypeChanged(i10);
                } else {
                    this.f16357c.remove(next);
                }
            }
        }
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
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
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return ai.f16274a >= 29 ? 9 : 0;
        }
    }
}
