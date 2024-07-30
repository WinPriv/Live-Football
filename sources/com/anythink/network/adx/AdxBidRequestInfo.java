package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdxBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f12635a;

    public AdxBidRequestInfo(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        this.f12635a = jSONObject;
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SUPPORT_TEMPLATE_VERSION, 1);
            d b10 = e.a(context).b(str);
            if (b10 != null) {
                int au = b10.au();
                if (au > 0) {
                    List<com.anythink.core.common.a.d> a10 = b.a().a(au);
                    if (a10.size() > 0) {
                        this.f12635a.put(d.a.P, a(a10));
                    }
                }
                int at = b10.at();
                if (at > 0) {
                    List<com.anythink.core.common.a.d> b11 = b.a().b(at);
                    if (b11.size() > 0) {
                        this.f12635a.put(d.a.O, a(b11));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static JSONObject a(List<com.anythink.core.common.a.d> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            for (com.anythink.core.common.a.d dVar : list) {
                List list2 = (List) hashMap.get(dVar.a());
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(dVar.a(), list2);
                }
                list2.add(dVar.b());
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void fillAdAcceptType() {
        try {
            JSONObject jSONObject = this.f12635a;
            if (jSONObject != null) {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY));
            }
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString();
            if (!TextUtils.isEmpty(obj)) {
                String[] split = obj.split("x");
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                this.f12635a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, parseInt);
                this.f12635a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, parseInt2);
                this.f12635a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY));
            }
        } catch (Throwable unused) {
        }
    }

    public void fillInterstitial(Map<String, Object> map) {
        try {
            if (map.containsKey("unit_type")) {
                String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_type");
                if (!TextUtils.isEmpty(stringFromMap)) {
                    this.f12635a.put("unit_type", Integer.parseInt(stringFromMap));
                }
                if (TextUtils.equals(ATInitMediation.getStringFromMap(map, "inter_type", "1"), "1")) {
                    fillAdAcceptType();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void fillSplashData() {
        try {
            this.f12635a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
            fillAdAcceptType();
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f12635a;
    }
}
