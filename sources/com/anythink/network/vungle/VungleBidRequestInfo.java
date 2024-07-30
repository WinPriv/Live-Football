package com.anythink.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.vungle.warren.Vungle;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VungleBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    String f12873a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f12874b = new JSONObject();

    public VungleBidRequestInfo(Context context, Map<String, Object> map) {
        try {
            String obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ACCOUNT_ID).toString();
            String obj2 = map.get("app_id").toString();
            String obj3 = map.get("placement_id").toString();
            this.f12873a = Vungle.getAvailableBidTokens(context);
            this.f12874b.put("app_id", obj2);
            this.f12874b.put("unit_id", obj3);
            this.f12874b.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ACCOUNT_ID, obj);
            this.f12874b.put("bid_token", this.f12873a);
        } catch (Throwable unused) {
        }
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.f12873a)) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f12874b;
    }
}
