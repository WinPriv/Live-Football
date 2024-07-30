package fb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ck;
import com.huawei.hms.ads.ep;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jf;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.p;
import java.util.Map;

/* loaded from: classes2.dex */
public class g extends m {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28342e;
    public final ep f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28343g;

    public g(Context context, AdContentData adContentData, boolean z10, Map<String, String> map) {
        super(context, adContentData);
        ep epVar = new ep();
        this.f = epVar;
        this.f28343g = false;
        this.f28342e = z10;
        ex.Code("InnerWebAction", "buildLinkedAdConfig");
        if (map != null && !map.isEmpty()) {
            String orDefault = map.getOrDefault(ba.f22065n, String.valueOf(0));
            String orDefault2 = map.getOrDefault(ba.f22064m, String.valueOf(0));
            String orDefault3 = map.getOrDefault(ba.f22067q, ep.V);
            String orDefault4 = map.getOrDefault(ba.o, null);
            String orDefault5 = map.getOrDefault(ba.f22066p, "n");
            Integer g6 = p.g(orDefault);
            if (g6 != null) {
                epVar.V(g6.intValue());
            } else {
                epVar.V(0);
            }
            epVar.V(orDefault2);
            Integer g10 = p.g(orDefault4);
            if (g10 != null) {
                epVar.Code(g10.intValue());
                ex.V("InnerWebAction", "set progress from native view " + g10);
            } else {
                epVar.Code(0);
            }
            epVar.Code(orDefault5);
            epVar.Code(ep.Code.equals(orDefault3));
        }
    }

    @Override // fb.m
    public final boolean a() {
        AdContentData adContentData = this.f28347b;
        if (adContentData == null) {
            return d();
        }
        ex.V("InnerWebAction", "handle inner web action");
        boolean z10 = this.f28342e;
        adContentData.z(z10);
        ex.V("InnerWebAction", "needAppDownload: %s", Boolean.valueOf(z10));
        if (TextUtils.isEmpty(adContentData.h())) {
            return d();
        }
        boolean Code = jf.Code(adContentData.a1());
        Context context = this.f28346a;
        if (!Code && !a0.a.v(context)) {
            return d();
        }
        this.f28348c = v.B;
        ck.Code(context, adContentData, this.f, this.f28343g);
        return true;
    }
}
