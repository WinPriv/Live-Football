package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EncryptionField;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y0 extends y {
    public y0() {
        super(com.huawei.openalliance.ad.constant.s.f22123s);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        JSONObject jSONObject = new JSONObject(str3);
        String optString = jSONObject.optString("content_id");
        String optString2 = jSONObject.optString("unique_id");
        boolean optBoolean = jSONObject.optBoolean(av.I);
        String optString3 = jSONObject.optString(av.Z);
        n7.c("CmdQueryAdContentData", "query %s ad content data, contentId: %s, uniqueId: %s", str, optString, optString2);
        boolean isEmpty = TextUtils.isEmpty(optString);
        String str5 = this.f32203a;
        if (isEmpty) {
            n7.g("CmdQueryAdContentData", "empty request parameters");
            y.d(aVar, str5, -1, "");
            return;
        }
        ContentRecord n10 = j7.r.n(context, str, optString, jSONObject);
        if (n10 == null) {
            n7.b("CmdQueryAdContentData", "contentRecord is null");
            y.d(aVar, str5, -1, "");
            return;
        }
        AdContentData f = AdContentData.f(context, n10);
        if (optBoolean) {
            EncryptionField<String> P0 = n10.P0();
            if (P0 != null) {
                str4 = P0.a(context);
            } else {
                str4 = null;
            }
            f.z(com.huawei.openalliance.ad.ppskit.utils.y1.m(optString3, str4));
        }
        y.d(aVar, str5, 200, com.huawei.openalliance.ad.ppskit.utils.y0.c(null, f));
    }
}
