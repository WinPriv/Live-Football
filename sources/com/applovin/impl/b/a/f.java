package com.applovin.impl.b.a;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final p f17281a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f17282b;

    /* loaded from: classes.dex */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private f(JSONObject jSONObject, p pVar) {
        this.f17281a = pVar;
        this.f17282b = jSONObject;
    }

    public static f a(JSONObject jSONObject, p pVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && pVar.ae().d() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && pVar.ae().c() == null) {
            return null;
        }
        return new f(jSONObject, pVar);
    }

    public a b() {
        String string = JsonUtils.getString(this.f17282b, "style", null);
        if (CallMraidJS.f.equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        if (!"destructive".equalsIgnoreCase(string) && !com.anythink.expressad.d.a.b.dO.equalsIgnoreCase(string)) {
            return a.NEUTRAL;
        }
        return a.NEGATIVE;
    }

    public String c() {
        return JsonUtils.getString(this.f17282b, "destination_state_id", null);
    }

    public String d() {
        return JsonUtils.getString(this.f17282b, "event", null);
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + a() + "destinationStateId=" + c() + "event=" + d() + "}";
    }

    public String a() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f17282b, "title", (JSONObject) null);
        return p.a(JsonUtils.getString(jSONObject, "key", ""), (List<String>) JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }
}
