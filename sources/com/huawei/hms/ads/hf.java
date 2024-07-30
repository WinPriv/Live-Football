package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.AdSessionConfiguration;

/* loaded from: classes2.dex */
public class hf implements hm {
    private static boolean Code = hb.Code(hb.f21701g);
    private static final String V = "AdSessionConfiguration";
    private AdSessionConfiguration I;

    private hf(hi hiVar, hn hnVar, ho hoVar, ho hoVar2, boolean z10) {
        this.I = null;
        if (hi.Code() && hn.Code() && ho.Code()) {
            this.I = AdSessionConfiguration.createAdSessionConfiguration(hi.Code(hiVar), hn.Code(hnVar), ho.Code(hoVar), ho.Code(hoVar2), z10);
        }
    }

    public static hf Code(hi hiVar, hn hnVar, ho hoVar, ho hoVar2, boolean z10) {
        if (Code) {
            return new hf(hiVar, hnVar, hoVar, hoVar2, z10);
        }
        return null;
    }

    public AdSessionConfiguration V() {
        return this.I;
    }

    public static boolean Code() {
        return Code;
    }
}
