package ka;

import android.content.Context;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import com.iab.omid.library.huawei.adsession.Partner;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class mb {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f31460b = jb.a(com.huawei.hms.ads.hb.f21703i);

    /* renamed from: a, reason: collision with root package name */
    public final Context f31461a;

    public mb(Context context) {
        this.f31461a = context;
    }

    public final AdSessionContext a(rb rbVar) {
        String str;
        if (!jb.a(com.huawei.hms.ads.hb.f21709p) || !jb.a(com.huawei.hms.ads.hb.f21710q) || !jb.a(com.huawei.hms.ads.hb.f21703i)) {
            return null;
        }
        ArrayList a10 = rbVar.a();
        if (a10.isEmpty()) {
            return null;
        }
        try {
            str = com.huawei.openalliance.ad.ppskit.utils.y1.b(this.f31461a);
        } catch (IOException e10) {
            n7.g("AdSessionContextWrapper", "getNativeAdSession: " + androidx.transition.n.u(e10.getMessage()));
            str = null;
        }
        if (str == null) {
            return null;
        }
        return AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Huawei", "3.4.65.300"), str, a10, (String) null, (String) null);
    }
}
