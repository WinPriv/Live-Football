package com.huawei.hms.ads;

import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;

/* loaded from: classes2.dex */
public class bx {
    private NativeAd Code;
    private com.huawei.openalliance.ad.inter.data.p I;
    private VideoConfiguration V;

    public bx(NativeAd nativeAd) {
        NativeAdConfiguration nativeAdConfiguration;
        this.Code = nativeAd;
        if (nativeAd instanceof bw) {
            bw bwVar = (bw) nativeAd;
            this.I = bwVar.Code().B();
            com.huawei.openalliance.ad.inter.data.e Code = bwVar.Code();
            if ((Code instanceof com.huawei.openalliance.ad.inter.data.j) && (nativeAdConfiguration = ((com.huawei.openalliance.ad.inter.data.j) Code).J) != null) {
                this.V = nativeAdConfiguration.getVideoConfiguration();
            }
        }
    }

    public boolean Code() {
        if (this.I != null) {
            return true;
        }
        return false;
    }

    public float I() {
        Float f;
        com.huawei.openalliance.ad.inter.data.p pVar = this.I;
        if (pVar == null || (f = pVar.D) == null) {
            return gl.Code;
        }
        return f.floatValue();
    }

    public boolean V() {
        com.huawei.openalliance.ad.inter.data.p pVar = this.I;
        if (pVar != null && "n".equals(pVar.f22309z)) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        VideoConfiguration videoConfiguration = this.V;
        if (videoConfiguration != null && videoConfiguration.isCustomizeOperateRequested()) {
            return true;
        }
        return false;
    }
}
