package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.Om;
import com.iab.omid.library.huawei.adsession.VerificationScriptResource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class rb {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f31754b = jb.a(com.huawei.hms.ads.hb.f21710q);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31755a = new ArrayList();

    public final ArrayList a() {
        return this.f31755a;
    }

    public final void b(Om om) {
        URL url;
        if (om != null && f31754b) {
            String a10 = om.a();
            String k10 = om.k();
            if (k10 != null) {
                try {
                    url = new URL(k10);
                } catch (MalformedURLException e10) {
                    n7.g("VerficationScriptResourceWrapper", "parseURL: " + com.huawei.openalliance.ad.ppskit.utils.y1.j(e10.getMessage()));
                }
                String c10 = om.c();
                if (a10 == null && url != null && c10 != null) {
                    VerificationScriptResource createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(a10, url, c10);
                    if (createVerificationScriptResourceWithParameters == null) {
                        n7.e("VerficationScriptResourceWrapper", "Create verificationScriptResource failed");
                        return;
                    } else {
                        this.f31755a.add(createVerificationScriptResourceWithParameters);
                        return;
                    }
                }
                n7.e("VerficationScriptResourceWrapper", "Parameters is null");
                return;
            }
            url = null;
            String c102 = om.c();
            if (a10 == null) {
            }
            n7.e("VerficationScriptResourceWrapper", "Parameters is null");
            return;
        }
        n7.e("VerficationScriptResourceWrapper", "om is not avalible");
    }
}
