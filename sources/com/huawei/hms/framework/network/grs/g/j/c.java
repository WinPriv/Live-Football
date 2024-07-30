package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f21910a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21911b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f21912c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f21910a = grsBaseInfo;
        this.f21911b = context;
    }

    private String e() {
        Set<String> b10 = com.huawei.hms.framework.network.grs.f.b.a(this.f21911b.getPackageName()).b();
        if (b10.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = b10.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f21912c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.f21911b;
    }

    public GrsBaseInfo b() {
        return this.f21910a;
    }

    public String c() {
        if (this.f21912c.size() == 0) {
            return e();
        }
        return f();
    }

    public Set<String> d() {
        return this.f21912c;
    }

    public void a(String str) {
        this.f21912c.add(str);
    }
}
