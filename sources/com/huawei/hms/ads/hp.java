package com.huawei.hms.ads;

import com.huawei.openalliance.ad.beans.metadata.Om;
import com.iab.omid.library.huawei.adsession.VerificationScriptResource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class hp implements hm {
    private static final String Code = "VerficationScriptResourceWrapper";
    private static boolean V = hb.Code(hb.f21710q);
    private List<VerificationScriptResource> I = new ArrayList();

    private URL Code(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            ex.I(Code, "parseURL: " + androidx.transition.n.e(e10.getMessage()));
            return null;
        }
    }

    public List<VerificationScriptResource> V() {
        return this.I;
    }

    public void Code(Om om) {
        if (om == null || !V) {
            ex.V(Code, "om is not avalible");
            return;
        }
        String k10 = om.k();
        URL Code2 = Code(om.q());
        String p10 = om.p();
        if (k10 == null || Code2 == null || p10 == null) {
            ex.V(Code, "Parameters is null");
            return;
        }
        VerificationScriptResource createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(k10, Code2, p10);
        if (createVerificationScriptResourceWithParameters == null) {
            ex.V(Code, "Create verificationScriptResource failed");
        } else {
            this.I.add(createVerificationScriptResourceWithParameters);
        }
    }

    public static boolean Code() {
        return V;
    }
}
