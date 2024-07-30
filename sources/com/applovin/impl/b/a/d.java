package com.applovin.impl.b.a;

import com.anythink.core.api.ATAdConst;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final p f17272a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f17273b;

    /* loaded from: classes.dex */
    public enum a {
        ALERT,
        GDPR_ALERT,
        EVENT,
        TERMS_OF_SERVICE,
        PRIVACY_POLICY,
        HAS_USER_CONSENT,
        REINIT
    }

    public d(JSONObject jSONObject, p pVar) {
        this.f17272a = pVar;
        this.f17273b = jSONObject;
    }

    public static d a(JSONObject jSONObject, p pVar) {
        a b10 = b(JsonUtils.getString(jSONObject, "type", null));
        if (b10 == a.ALERT) {
            return new e(jSONObject, pVar);
        }
        if (b10 == a.GDPR_ALERT) {
            return new h(jSONObject, pVar);
        }
        if (b10 == a.EVENT) {
            return new g(jSONObject, pVar);
        }
        return new d(jSONObject, pVar);
    }

    public a b() {
        return b(JsonUtils.getString(this.f17273b, "type", null));
    }

    public boolean c() {
        return JsonUtils.getBoolean(this.f17273b, "is_initial_state", Boolean.FALSE).booleanValue();
    }

    public String d() {
        return JsonUtils.getString(this.f17273b, "destination_state_id", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + a() + "type=" + b() + "isInitialState=" + c() + "destinationStateId=" + d() + "}";
    }

    private static a b(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return a.ALERT;
        }
        if ("gdpr_alert".equalsIgnoreCase(str)) {
            return a.GDPR_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return a.EVENT;
        }
        if ("tos".equalsIgnoreCase(str)) {
            return a.TERMS_OF_SERVICE;
        }
        if ("pp".equalsIgnoreCase(str)) {
            return a.PRIVACY_POLICY;
        }
        if (AppLovinSdkExtraParameterKey.HAS_USER_CONSENT.equalsIgnoreCase(str)) {
            return a.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return a.REINIT;
        }
        throw new IllegalArgumentException(s.f.b("Invalid type provided: ", str));
    }

    public String a() {
        return JsonUtils.getString(this.f17273b, "id", null);
    }

    public String a(String str) {
        String str2;
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f17273b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                if (this.f17272a.S() != null) {
                    str2 = this.f17272a.Q().B().b();
                } else {
                    str2 = (String) this.f17272a.R().c().get(ATAdConst.KEY.APP_NAME);
                }
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(p.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return p.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }
}
