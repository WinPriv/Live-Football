package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends d {
    public h(JSONObject jSONObject, p pVar) {
        super(jSONObject, pVar);
    }

    public String e() {
        return a("main_screen_title");
    }

    public String f() {
        return a("applovin_learn_more_screen_title");
    }

    public String g() {
        return StringUtils.join("\n\n", this.f17272a.ae().e());
    }

    public String h() {
        return StringUtils.join("\n\n", this.f17272a.ae().f());
    }
}
