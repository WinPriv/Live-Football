package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;

/* loaded from: classes2.dex */
public final class s0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f23546s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23547t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s0 s0Var = s0.this;
            RewardVideoView rewardVideoView = s0Var.f23547t.D;
            if (rewardVideoView != null) {
                rewardVideoView.g();
                PPSRewardView pPSRewardView = s0Var.f23547t;
                pPSRewardView.f23257m0 = true;
                pPSRewardView.f23266v0 = false;
                pPSRewardView.D.v(true, pPSRewardView.f23263s0);
            }
        }
    }

    public s0(PPSRewardView pPSRewardView, VideoInfo videoInfo) {
        this.f23547t = pPSRewardView;
        this.f23546s = videoInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.this.B == false) goto L6;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            com.huawei.openalliance.ad.ppskit.views.PPSRewardView r0 = r3.f23547t
            va.b r1 = r0.J0
            if (r1 == 0) goto L13
            com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo r2 = r3.f23546s
            r2.getVideoFileSize()
            com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity$k r1 = (com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.k) r1
            com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity r1 = com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity.this
            boolean r1 = r1.B
            if (r1 != 0) goto L1b
        L13:
            ua.b r1 = r0.B
            if (r1 == 0) goto L2b
            boolean r1 = r1.f35838v
            if (r1 != 0) goto L2b
        L1b:
            java.lang.String r0 = "PPSRewardView"
            java.lang.String r1 = "app has handled, do not pop up dialog"
            ka.n7.e(r0, r1)
            com.huawei.openalliance.ad.ppskit.views.s0$a r0 = new com.huawei.openalliance.ad.ppskit.views.s0$a
            r0.<init>()
            com.huawei.openalliance.ad.ppskit.utils.d2.a(r0)
            goto L33
        L2b:
            com.huawei.openalliance.ad.ppskit.views.t0 r1 = new com.huawei.openalliance.ad.ppskit.views.t0
            r1.<init>(r0)
            com.huawei.openalliance.ad.ppskit.utils.d2.a(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.s0.run():void");
    }
}
