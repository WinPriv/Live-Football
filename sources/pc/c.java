package pc;

import android.text.TextUtils;
import androidx.activity.n;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.appsflyer.AppsFlyerLib;
import j7.r;
import ka.y6;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ sc.a f34493s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f34494t;

    public c(n nVar, sc.a aVar) {
        this.f34494t = nVar;
        this.f34493s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34494t) {
            if (this.f34493s.a() != 1) {
                return;
            }
            String q10 = r.q(this.f34493s);
            sc.a aVar = this.f34493s;
            try {
                y6 y6Var = new y6(1);
                y6Var.f32209a = AppsFlyerLib.getInstance().getSdkVersion();
                y6Var.f32210b = 1;
                String b10 = g.b(jc.b.a().e(), "appsflyer-data", "attributionId");
                if (!TextUtils.isEmpty(b10)) {
                    y6Var.f32211c = b10;
                    JSONObject a10 = y6Var.a();
                    String b11 = g.b(jc.b.a().e(), "tramini", "S_ASF_ATT");
                    if (a10 != null && !TextUtils.equals(b11, b10)) {
                        g.a(jc.b.a().e(), "S_ASF_ATT", b10);
                        oc.b.a().c(q10, aVar.c(), n.f520z0, a10);
                    }
                }
            } catch (Throwable unused) {
            }
            sc.a aVar2 = this.f34493s;
            y6 y6Var2 = new y6(1);
            y6Var2.f32209a = Adjust.getSdkVersion();
            y6Var2.f32210b = 2;
            AdjustAttribution attribution = Adjust.getAttribution();
            if (attribution != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adgroup", attribution.adgroup);
                jSONObject.put("adid", attribution.adid);
                jSONObject.put("campaign", attribution.campaign);
                jSONObject.put("clickLabel", attribution.clickLabel);
                jSONObject.put("creative", attribution.creative);
                jSONObject.put("network", attribution.network);
                jSONObject.put("trackerName", attribution.trackerName);
                jSONObject.put("trackerToken", attribution.trackerToken);
                jSONObject.put("attr", attribution.toString());
                y6Var2.f32211c = jSONObject.toString();
                JSONObject a11 = y6Var2.a();
                if (!TextUtils.equals(g.b(jc.b.a().e(), "tramini", "S_AJS_ATT"), jSONObject.toString())) {
                    g.a(jc.b.a().e(), "S_AJS_ATT", jSONObject.toString());
                    oc.b.a().c(q10, aVar2.c(), n.f520z0, a11);
                }
            }
        }
    }
}
