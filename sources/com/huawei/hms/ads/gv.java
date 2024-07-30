package com.huawei.hms.ads;

import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public class gv {
    public static gw Code(AdContentData adContentData) {
        if (adContentData == null) {
            return new gu();
        }
        if (adContentData.Y0() == null && (adContentData.Z0() == null || !"video/mp4".equals(adContentData.Z0().q()))) {
            if (gr.Code()) {
                return new gr();
            }
        } else if (gz.C()) {
            return new gz();
        }
        return new gu();
    }
}
