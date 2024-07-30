package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.instreamad.InstreamAd;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import java.util.List;

/* loaded from: classes2.dex */
public class x extends InstreamAd {
    private Context I;
    private com.huawei.openalliance.ad.inter.data.k V;

    public x(Context context, com.huawei.openalliance.ad.inter.data.f fVar) {
        this.I = context;
        if (fVar instanceof com.huawei.openalliance.ad.inter.data.k) {
            this.V = (com.huawei.openalliance.ad.inter.data.k) fVar;
        }
    }

    private boolean V() {
        if (this.V == null) {
            return true;
        }
        return false;
    }

    public com.huawei.openalliance.ad.inter.data.f Code() {
        return this.V;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public String getAdSign() {
        if (V()) {
            return "2";
        }
        return this.V.a();
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public String getAdSource() {
        if (V()) {
            return null;
        }
        return this.V.d();
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public List<AdvertiserInfo> getAdvertiserInfo() {
        if (!V()) {
            return this.V.l();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public String getCallToAction() {
        if (V()) {
            return null;
        }
        return ch.Code(this.I, this.V.w(), this.V.D());
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public String getDspLogo() {
        if (!V()) {
            return this.V.N();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public String getDspName() {
        if (!V()) {
            return this.V.M();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public long getDuration() {
        com.huawei.openalliance.ad.inter.data.l S;
        if (V() || (S = this.V.S()) == null) {
            return 0L;
        }
        return S.A;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public String getWhyThisAd() {
        if (V()) {
            return null;
        }
        return this.V.h();
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public boolean hasAdvertiserInfo() {
        if (!V()) {
            return this.V.r();
        }
        return false;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public boolean isClicked() {
        if (V()) {
            return false;
        }
        return this.V.f22279s;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public boolean isExpired() {
        if (V()) {
            return true;
        }
        return this.V.g();
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public boolean isImageAd() {
        if (V()) {
            return false;
        }
        return this.V.E();
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public boolean isShown() {
        if (V()) {
            return false;
        }
        this.V.getClass();
        return false;
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public boolean isVideoAd() {
        if (V()) {
            return false;
        }
        return this.V.V();
    }

    @Override // com.huawei.hms.ads.instreamad.InstreamAd
    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        if (!V()) {
            this.V.Code(rewardVerifyConfig);
        }
    }
}
