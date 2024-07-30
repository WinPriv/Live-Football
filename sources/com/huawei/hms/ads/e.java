package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.ads.inter.data.IInterstitialAd;
import com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener;
import com.huawei.hms.ads.reward.RewardAdListener;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import gb.r0;

/* loaded from: classes2.dex */
public class e {
    private static final byte[] V = new byte[0];
    private static e Z;
    private Context B;
    private BroadcastReceiver C;

    /* renamed from: com.huawei.hms.ads.e$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntentFilter intentFilter = new IntentFilter("com.huawei.hms.pps.action.PPS_INTERSTITIAL_STATUS_CHANGED");
            e.this.C = new a(null);
            if (r0.a(e.this.B)) {
                e.this.B.registerReceiver(e.this.C, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
            } else {
                a0.a.p(e.this.B, com.huawei.openalliance.ad.constant.bi.V, new NotifyCallback() { // from class: com.huawei.hms.ads.e.1.1
                    @Override // com.huawei.openalliance.ad.msgnotify.NotifyCallback
                    public void onMessageNotify(String str, final Intent intent) {
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.e.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (e.this.C != null) {
                                    e.this.C.onReceive(e.this.B, intent);
                                }
                            }
                        });
                    }
                });
            }
            ex.V("InterstitialAdStatusHandler", "registerPpsReceiver");
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        private boolean Code(int i10, RewardAdListener rewardAdListener) {
            if (rewardAdListener == null) {
                return false;
            }
            if (i10 == 8) {
                rewardAdListener.onRewardAdLeftApp();
                return false;
            }
            if (i10 != 9) {
                return false;
            }
            rewardAdListener.onRewardAdStarted();
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ex.V("InterstitialAdStatusHandler", "onReceive:" + intent.getAction());
            if ("com.huawei.hms.pps.action.PPS_INTERSTITIAL_STATUS_CHANGED".equals(intent.getAction())) {
                try {
                    IInterstitialAd Code = f.Code();
                    if (!(Code instanceof com.huawei.hms.ads.inter.data.a)) {
                        ex.I("InterstitialAdStatusHandler", "can not get interstitial ad.");
                        return;
                    }
                    com.huawei.hms.ads.inter.data.a aVar = (com.huawei.hms.ads.inter.data.a) Code;
                    IInterstitialAdStatusListener I = aVar.I();
                    RewardAdListener Code2 = aVar.Code();
                    int intExtra = intent.getIntExtra("interstitial_ad_status", -1);
                    ex.V("InterstitialAdStatusHandler", "status:" + intExtra);
                    if (Code(intExtra, Code2)) {
                        return;
                    }
                    if (I == null) {
                        ex.I("InterstitialAdStatusHandler", "there is no status listener");
                        return;
                    }
                    switch (intExtra) {
                        case 1:
                            I.onAdShown();
                            aVar.V(true);
                            return;
                        case 2:
                            I.onAdClicked();
                            return;
                        case 3:
                            I.onAdCompleted();
                            return;
                        case 4:
                            I.onAdClosed();
                            return;
                        case 5:
                            if (!aVar.C()) {
                                I.onRewarded();
                                aVar.Code(true);
                                jh.Code(context, aVar.m(), aVar.G(), aVar.H(), "");
                                return;
                            }
                            return;
                        case 6:
                            I.onAdError(intent.getIntExtra("interstitial_ad_error", -1), intent.getIntExtra("interstitial_ad_extra", -1));
                            return;
                        case 7:
                            if (e.Z != null) {
                                e.Z.I();
                                return;
                            }
                            return;
                        case 8:
                            I.onLeftApp();
                            return;
                        default:
                            return;
                    }
                } catch (Exception e10) {
                    ex.Z("InterstitialAdStatusHandler", "handler interstitial status changed error,".concat(e10.getClass().getSimpleName()));
                }
            }
        }
    }

    private e(Context context) {
        if (context != null) {
            this.B = context.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        if (this.C != null) {
            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.e.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ex.V("InterstitialAdStatusHandler", "unregisterPpsReceiver");
                        e.this.B.unregisterReceiver(e.this.C);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
        a0.a.o(this.B, com.huawei.openalliance.ad.constant.bi.V);
    }

    public static e Code(Context context) {
        return V(context);
    }

    private static synchronized e V(Context context) {
        e eVar;
        synchronized (e.class) {
            synchronized (V) {
                if (Z == null) {
                    Z = new e(context);
                }
                eVar = Z;
            }
        }
        return eVar;
    }

    public void Code() {
        if (this.C != null) {
            I();
        }
        gb.w.b(new AnonymousClass1());
    }
}
