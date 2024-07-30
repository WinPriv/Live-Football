package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import gb.r0;

/* loaded from: classes2.dex */
public class di {
    private static di V;
    private static final byte[] Z = new byte[0];
    private BroadcastReceiver B;
    private Context I;

    /* renamed from: com.huawei.hms.ads.di$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntentFilter intentFilter = new IntentFilter("com.huawei.hms.pps.action.PPS_REWARD_STATUS_CHANGED");
            di.this.B = new a(null);
            if (r0.a(di.this.I)) {
                di.this.I.registerReceiver(di.this.B, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
            } else {
                a0.a.p(di.this.I, com.huawei.openalliance.ad.constant.bi.Code, new NotifyCallback() { // from class: com.huawei.hms.ads.di.1.1
                    @Override // com.huawei.openalliance.ad.msgnotify.NotifyCallback
                    public void onMessageNotify(String str, final Intent intent) {
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.di.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (di.this.B != null) {
                                    di.this.B.onReceive(di.this.I, intent);
                                }
                            }
                        });
                    }
                });
            }
            ex.V("RewardAdStatusHandler", "registerPPSReceiver");
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        private boolean Code(int i10, ga.f fVar) {
            if (fVar == null) {
                return false;
            }
            if (8 == i10) {
                fVar.S();
                return true;
            }
            if (9 != i10) {
                return false;
            }
            fVar.C();
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ex.V("RewardAdStatusHandler", "onReceive:" + intent.getAction());
            if ("com.huawei.hms.pps.action.PPS_REWARD_STATUS_CHANGED".equals(intent.getAction())) {
                try {
                    com.huawei.openalliance.ad.inter.data.g Code = dg.Code();
                    if (Code != null && (Code instanceof com.huawei.openalliance.ad.inter.data.m)) {
                        com.huawei.openalliance.ad.inter.data.m mVar = (com.huawei.openalliance.ad.inter.data.m) Code;
                        ga.e eVar = mVar.f22291u;
                        ga.f fVar = mVar.f22294x;
                        int intExtra = intent.getIntExtra("reward_ad_status", -1);
                        String stringExtra = intent.getStringExtra(com.huawei.openalliance.ad.constant.ba.f22057e);
                        ex.V("RewardAdStatusHandler", "status:" + intExtra);
                        if (Code(intExtra, fVar)) {
                            return;
                        }
                        if (eVar == null) {
                            ex.I("RewardAdStatusHandler", "there is no status listener");
                            return;
                        }
                        switch (intExtra) {
                            case 1:
                                eVar.Code();
                                mVar.f22290t = true;
                                return;
                            case 2:
                                eVar.V();
                                return;
                            case 3:
                                eVar.I();
                                return;
                            case 4:
                                eVar.Z();
                                return;
                            case 5:
                                if (!mVar.f22292v) {
                                    eVar.B();
                                    mVar.f22292v = true;
                                    AdContentData m10 = mVar.m();
                                    m10.y(stringExtra);
                                    jh.Code(context, m10, mVar.G(), mVar.H(), "");
                                    return;
                                }
                                return;
                            case 6:
                                eVar.Code(intent.getIntExtra("reward_ad_error", -1), intent.getIntExtra("reward_ad_extra", -1));
                                return;
                            case 7:
                                if (di.V != null) {
                                    di.V.V();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    ex.I("RewardAdStatusHandler", "can not get reward");
                } catch (Exception e10) {
                    ex.Z("RewardAdStatusHandler", "handler reward status changed error,".concat(e10.getClass().getSimpleName()));
                }
            }
        }
    }

    private di(Context context) {
        this.I = context.getApplicationContext();
    }

    private static di V(Context context) {
        di diVar;
        synchronized (Z) {
            if (V == null) {
                V = new di(context);
            }
            diVar = V;
        }
        return diVar;
    }

    public static di Code(Context context) {
        return V(context);
    }

    public void V() {
        if (this.B != null) {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.di.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ex.V("RewardAdStatusHandler", "unregisterPPSReceiver");
                        di.this.I.unregisterReceiver(di.this.B);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
        a0.a.o(this.I, com.huawei.openalliance.ad.constant.bi.Code);
    }

    public void Code() {
        if (this.B != null) {
            V();
        }
        gb.w.b(new AnonymousClass1());
    }
}
