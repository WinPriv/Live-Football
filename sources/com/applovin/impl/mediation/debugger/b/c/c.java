package com.applovin.impl.mediation.debugger.b.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17991a = e.a(p.y()).a();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17992b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17993c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17994d;

    public c(JSONObject jSONObject, p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z10 = false;
        if (jSONObject2 != null) {
            this.f17992b = true;
            this.f17994d = JsonUtils.getString(jSONObject2, "description", "");
            if (i.a()) {
                this.f17993c = true;
                return;
            }
            List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!i.a((String) it.next())) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                this.f17993c = z10;
                return;
            }
            this.f17993c = false;
            return;
        }
        this.f17992b = false;
        this.f17994d = "";
        this.f17993c = i.a();
    }

    public boolean a() {
        return this.f17992b;
    }

    public boolean b() {
        boolean z10 = this.f17993c;
        if (z10 && (this.f17991a || z10)) {
            return true;
        }
        return false;
    }

    public String c() {
        if (this.f17991a) {
            return this.f17994d;
        }
        return "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
