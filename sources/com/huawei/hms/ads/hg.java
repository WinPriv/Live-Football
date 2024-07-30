package com.huawei.hms.ads;

import android.content.Context;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import com.iab.omid.library.huawei.adsession.Partner;
import com.iab.omid.library.huawei.adsession.VerificationScriptResource;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class hg implements hm {
    private static final String Code = "AdSessionContextWrapper";
    private static boolean I = hb.Code(hb.f21703i);
    private static final String V = "Huawei";
    private Context Z;

    public hg(Context context) {
        this.Z = context;
    }

    public AdSessionContext Code(hp hpVar, String str) {
        String str2;
        if (!hb.Code(hb.f21709p) || !hb.Code(hb.f21710q) || !hb.Code(hb.f21703i)) {
            ex.I(Code, "createNativeAdSessionContext, not available ");
            return null;
        }
        List<VerificationScriptResource> V2 = hpVar.V();
        if (V2.isEmpty()) {
            return null;
        }
        try {
            str2 = gb.p.d(this.Z);
        } catch (IOException e10) {
            ex.I(Code, "getNativeAdSession: " + androidx.transition.n.e(e10.getMessage()));
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return AdSessionContext.createNativeAdSessionContext(Partner.createPartner(V, "13.4.65.300"), str2, V2, str, (String) null);
    }

    public static boolean Code() {
        return I;
    }
}
