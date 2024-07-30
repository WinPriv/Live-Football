package sc;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f35305a;

    /* renamed from: b, reason: collision with root package name */
    public long f35306b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f35307c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap<String, lc.b> f35308d;

    /* renamed from: e, reason: collision with root package name */
    public String f35309e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f35310g;

    /* renamed from: h, reason: collision with root package name */
    public String f35311h;

    /* renamed from: i, reason: collision with root package name */
    public String f35312i;

    /* renamed from: j, reason: collision with root package name */
    public String f35313j;

    /* renamed from: k, reason: collision with root package name */
    public String f35314k;

    /* renamed from: l, reason: collision with root package name */
    public String f35315l;

    /* renamed from: m, reason: collision with root package name */
    public int f35316m;

    /* renamed from: n, reason: collision with root package name */
    public HashSet f35317n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public String f35318p;

    /* renamed from: q, reason: collision with root package name */
    public String f35319q;

    public static a b(String str) {
        JSONArray jSONArray;
        int length;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("si")) {
                aVar.f35305a = "";
            } else {
                aVar.f35305a = jSONObject.optString("si");
            }
            if (jSONObject.isNull("scto")) {
                aVar.f35306b = 3600000L;
            } else {
                aVar.f35306b = jSONObject.optInt("scto");
            }
            if (jSONObject.isNull("att_sw")) {
                aVar.o = 0;
            } else {
                aVar.o = jSONObject.optInt("att_sw");
            }
            if (!jSONObject.isNull("plst_addr")) {
                aVar.f35318p = jSONObject.optString("plst_addr");
            }
            if (!jSONObject.isNull("pltk_addr")) {
                aVar.f35319q = jSONObject.optString("pltk_addr");
            }
            if (!jSONObject.isNull("cn_plst_addr")) {
                jSONObject.optString("cn_plst_addr");
            }
            if (!jSONObject.isNull("cn_pltk_addr")) {
                jSONObject.optString("cn_pltk_addr");
            }
            if (!jSONObject.isNull("tf")) {
                ConcurrentHashMap<String, lc.b> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString("tf"));
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            lc.b bVar = new lc.b();
                            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                            bVar.f32599d = optJSONObject.optString("pml");
                            bVar.f32596a = optJSONObject.optString("uu");
                            bVar.f32597b = optJSONObject.optInt("dmin");
                            bVar.f32598c = optJSONObject.optInt("dmax");
                            if (optJSONObject.has("p_s") && !TextUtils.isEmpty(optJSONObject.optString("p_s"))) {
                                bVar.f32600e = new JSONArray(optJSONObject.optString("p_s"));
                            }
                            concurrentHashMap.put(next, bVar);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                aVar.f35308d = concurrentHashMap;
            }
            if (!jSONObject.isNull("nl")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("nl"));
                aVar.f35309e = jSONObject3.optString("p1");
                aVar.f = jSONObject3.optString(com.anythink.core.common.g.c.X);
                aVar.f35310g = jSONObject3.optString("p3");
                aVar.f35311h = jSONObject3.optString("p4");
                aVar.f35312i = jSONObject3.optString("p5");
                aVar.f35313j = jSONObject3.optString("p6");
                aVar.f35314k = jSONObject3.optString("p7");
                aVar.f35315l = jSONObject3.optString("p8");
                if (!jSONObject3.isNull("notifications") && (length = (jSONArray = new JSONArray(jSONObject3.optString("notifications"))).length()) > 0) {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        arrayList.add(jSONArray.optString(i10));
                    }
                    aVar.f35307c = arrayList;
                }
            }
            if (jSONObject.isNull("t_sw")) {
                aVar.f35316m = 0;
            } else {
                aVar.f35316m = jSONObject.optInt("t_sw");
            }
            if (!jSONObject.isNull("pil")) {
                JSONObject jSONObject4 = new JSONObject(jSONObject.optString("pil"));
                Iterator<String> keys2 = jSONObject4.keys();
                HashSet hashSet = new HashSet();
                while (keys2.hasNext()) {
                    lc.c cVar = new lc.c();
                    String next2 = keys2.next();
                    cVar.f32601s = next2;
                    cVar.f32602t = jSONObject4.optString(next2);
                    hashSet.add(cVar);
                }
                aVar.f35317n = hashSet;
            }
            return aVar;
        } catch (JSONException unused3) {
            return null;
        }
    }

    public final int a() {
        return this.o;
    }

    public final String c() {
        return this.f35305a;
    }
}
