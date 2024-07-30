package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i0 extends y {
    public i0() {
        super(com.huawei.openalliance.ad.constant.s.y);
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        boolean z10;
        String str4;
        JSONObject jSONObject = new JSONObject(str3);
        if (jSONObject.optInt("apiVer", -1) != 3) {
            return String.valueOf(false);
        }
        ContentRecord o = com.huawei.openalliance.ad.ppskit.handlers.f0.E(context).o(str, jSONObject.optString("content_id"), jSONObject.optString("templateId"), jSONObject.optString("slotid"));
        if (o != null) {
            ContentTemplateRecord n10 = new com.huawei.openalliance.ad.ppskit.handlers.p(context).n(str, o.h(), o.Z0());
            if (n10 == null) {
                o = null;
            } else {
                o.M2(n10.C());
                o.D0(new TemplateData(n10.E(), n10.F(), n10.H()));
            }
        }
        n7.b("TDownloadUtil", "checkAndDownloadContent");
        if (o == null) {
            str4 = "content is null";
        } else if (androidx.transition.n.M(o.b1())) {
            str4 = "assets is null";
        } else {
            d5 a10 = y4.a(context, "tplate");
            com.huawei.openalliance.ad.ppskit.handlers.i0 d10 = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
            z10 = true;
            for (Asset asset : o.b1()) {
                if (asset != null && asset.q() != null && !com.huawei.openalliance.ad.ppskit.utils.x.q(a10.h(context, a10.j(context, asset.q().a())))) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.a(new di(asset, d10), 4);
                    z10 = false;
                }
            }
            if (o.c1() != null && !androidx.transition.n.M(o.c1().p())) {
                for (MotionData motionData : o.c1().p()) {
                    if (motionData != null && !com.huawei.openalliance.ad.ppskit.utils.x.q(a10.h(context, a10.j(context, motionData.k())))) {
                        com.huawei.openalliance.ad.ppskit.utils.p2.a(new ei(motionData, d10), 4);
                        z10 = false;
                    }
                }
            }
            n7.f("TDownloadUtil", "result: %s", Boolean.valueOf(z10));
            n7.f("CmdDownloadContent", "down result: %s", Boolean.valueOf(z10));
            return String.valueOf(z10);
        }
        n7.e("TDownloadUtil", str4);
        z10 = false;
        n7.f("CmdDownloadContent", "down result: %s", Boolean.valueOf(z10));
        return String.valueOf(z10);
    }
}
