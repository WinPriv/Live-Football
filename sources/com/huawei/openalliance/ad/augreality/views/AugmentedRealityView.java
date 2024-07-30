package com.huawei.openalliance.ad.augreality.views;

import com.huawei.hms.ads.df;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout;
import z9.a;

/* loaded from: classes2.dex */
public class AugmentedRealityView extends AutoScaleSizeRelativeLayout implements a {
    public AdContentData y;

    public df getPresenter() {
        return null;
    }

    public void setAdContentData(AdContentData adContentData) {
        if (adContentData != null) {
            if (this.y == null) {
                this.y = adContentData;
            }
            throw null;
        }
    }
}
