package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import gb.r0;

/* loaded from: classes2.dex */
public class er {
    private static final String Code = "LinkedAdStatusHandler";
    private static final int I = 0;
    private static final byte[] V = new byte[0];
    private static er Z;
    private Context B;
    private BroadcastReceiver C;

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (es.Code.equals(intent.getAction())) {
                    boolean booleanExtra = intent.getBooleanExtra(es.I, false);
                    int intExtra = intent.getIntExtra(es.Z, 0);
                    ex.V(er.Code, "LinkedAdBroadcastReceiver playProgress " + intExtra);
                    ep epVar = new ep();
                    epVar.V(booleanExtra);
                    epVar.Code(intExtra);
                    eq.Code(epVar);
                }
            } catch (Throwable th) {
                ex.I(er.Code, "LinkedAdBroadcastReceiver error: %s", th.getClass().getSimpleName());
            }
        }
    }

    private er(Context context) {
        if (context != null) {
            this.B = context.getApplicationContext();
        }
    }

    private static synchronized er V(Context context) {
        er erVar;
        synchronized (er.class) {
            synchronized (V) {
                if (Z == null) {
                    Z = new er(context);
                }
                erVar = Z;
            }
        }
        return erVar;
    }

    public static er Code(Context context) {
        return V(context);
    }

    public void V() {
        if (this.C != null) {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.er.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ex.V(er.Code, "unregisterPpsReceiver");
                        er.this.B.unregisterReceiver(er.this.C);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
        a0.a.o(this.B, com.huawei.openalliance.ad.constant.bi.I);
    }

    public void Code() {
        Code(new a());
    }

    public void Code(final BroadcastReceiver broadcastReceiver) {
        ex.Code(Code, "registerPpsReceiver ");
        if (this.C != null) {
            V();
        }
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.er.1
            @Override // java.lang.Runnable
            public void run() {
                IntentFilter intentFilter = new IntentFilter(es.Code);
                intentFilter.addAction(es.V);
                er.this.C = broadcastReceiver;
                if (r0.a(er.this.B)) {
                    er.this.B.registerReceiver(er.this.C, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
                } else {
                    a0.a.p(er.this.B, com.huawei.openalliance.ad.constant.bi.I, new NotifyCallback() { // from class: com.huawei.hms.ads.er.1.1
                        @Override // com.huawei.openalliance.ad.msgnotify.NotifyCallback
                        public void onMessageNotify(String str, Intent intent) {
                            if (er.this.C != null) {
                                er.this.C.onReceive(er.this.B, intent);
                            }
                        }
                    });
                }
                ex.V(er.Code, "registerPpsReceiver");
            }
        });
    }
}
