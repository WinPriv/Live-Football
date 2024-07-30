package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class a extends c implements Serializable {
    private static final String I = "AwardAd";
    private static final long Z = 30424300;
    private VideoInfo B;
    private boolean C;
    private RewardItem F;
    private boolean S;

    public a(AdContentData adContentData) {
        super(adContentData);
        this.C = false;
        if (adContentData.M() != null && adContentData.H() != 0) {
            this.F = new RewardItem(adContentData.M(), adContentData.H());
        }
    }

    private VideoInfo Code() {
        MetaData h_;
        if (this.B == null && (h_ = h_()) != null) {
            this.B = h_.x();
        }
        return this.B;
    }

    public RewardItem B() {
        return this.F;
    }

    public boolean C() {
        return this.S;
    }

    public void V(boolean z10) {
        this.C = z10;
    }

    public boolean Z() {
        return this.C;
    }

    public void Code(RewardItem rewardItem) {
        this.F = rewardItem;
    }

    public boolean V() {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            this.B = adContentData.Y0();
        }
        return this.B != null;
    }

    public void Code(boolean z10) {
        this.S = z10;
    }
}
