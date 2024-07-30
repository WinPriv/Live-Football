package com.applovin.impl.b.a;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    public static List<d> a(p pVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, pVar);
    }

    public static List<d> b(p pVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, pVar);
    }

    public static List<d> c(p pVar) {
        return a(R.raw.applovin_consent_flow_gdpr, pVar);
    }

    private static List<d> a(int i10, p pVar) {
        String rawResourceString = Utils.getRawResourceString(i10, p.y(), pVar);
        if (!TextUtils.isEmpty(rawResourceString)) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(rawResourceString, null);
            if (jsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(d.a(JsonUtils.getJSONObject(jSONArray, i11, new JSONObject()), pVar));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }
}
