package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import gb.r0;

/* loaded from: classes2.dex */
public class dj {
    private static dj I;
    private static final byte[] V = new byte[0];
    private BroadcastReceiver B;
    private Context Z;

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if ("com.huawei.hms.pps.action.PPS_SPLASH_INTERACT_CLOSE_CONFIG_CHANGED".equals(intent.getAction())) {
                    ec.Code(context).B(intent.getStringExtra("splash_interact_close_expiretime"));
                }
            } catch (Throwable th) {
                ex.I("SplashAdInteractConfigHandler", "SplashAdBroadcastReceiver error: %s", th.getClass().getSimpleName());
            }
            dj.I.V();
        }
    }

    private dj(Context context) {
        if (context != null) {
            this.Z = context.getApplicationContext();
        }
    }

    private static synchronized dj V(Context context) {
        dj djVar;
        synchronized (dj.class) {
            synchronized (V) {
                if (I == null) {
                    I = new dj(context);
                }
                djVar = I;
            }
        }
        return djVar;
    }

    public static dj Code(Context context) {
        return V(context);
    }

    public void V() {
        if (this.B != null) {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dj.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ex.V("SplashAdInteractConfigHandler", "unregisterPpsReceiver");
                        dj.this.Z.unregisterReceiver(dj.this.B);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
    }

    public void Code() {
        Code(new a());
    }

    public void Code(final BroadcastReceiver broadcastReceiver) {
        ex.Code("SplashAdInteractConfigHandler", "registerPpsReceiver ");
        if (this.B != null) {
            V();
        }
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.dj.1
            @Override // java.lang.Runnable
            public void run() {
                IntentFilter intentFilter = new IntentFilter("com.huawei.hms.pps.action.PPS_SPLASH_INTERACT_CLOSE_CONFIG_CHANGED");
                dj.this.B = broadcastReceiver;
                if (r0.a(dj.this.Z)) {
                    dj.this.Z.registerReceiver(dj.this.B, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
                } else {
                    a0.a.p(dj.this.Z, com.huawei.openalliance.ad.constant.bi.Z, new NotifyCallback() { // from class: com.huawei.hms.ads.dj.1.1
                        @Override // com.huawei.openalliance.ad.msgnotify.NotifyCallback
                        public void onMessageNotify(String str, Intent intent) {
                            if (dj.this.B != null) {
                                dj.this.B.onReceive(dj.this.Z, intent);
                            }
                        }
                    });
                }
                ex.V("SplashAdInteractConfigHandler", "registerPpsReceiver");
            }
        });
    }
}
