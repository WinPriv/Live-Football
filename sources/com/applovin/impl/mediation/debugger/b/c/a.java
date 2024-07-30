package com.applovin.impl.mediation.debugger.b.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17952a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17953b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17954c;

    public a(JSONObject jSONObject, p pVar) {
        this.f17952a = JsonUtils.getString(jSONObject, "name", "");
        this.f17953b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f17954c = Utils.checkClassesExistence(list);
        } else {
            this.f17954c = Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f17952a;
    }

    public String b() {
        return this.f17953b;
    }

    public boolean c() {
        return this.f17954c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }
}
