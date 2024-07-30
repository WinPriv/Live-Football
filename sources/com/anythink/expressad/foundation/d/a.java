package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements com.anythink.expressad.e.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9428a = "https://img.toponad.com/sdk/app-permissions.html?key=";

    /* renamed from: b, reason: collision with root package name */
    private static String f9429b = "app_name";

    /* renamed from: c, reason: collision with root package name */
    private static String f9430c = "perm_desc";

    /* renamed from: d, reason: collision with root package name */
    private static String f9431d = "ori_perm_desc";

    /* renamed from: e, reason: collision with root package name */
    private static String f9432e = "ori_perm_all";
    private static String f = "pri_url";

    /* renamed from: g, reason: collision with root package name */
    private static String f9433g = "upd_time";

    /* renamed from: h, reason: collision with root package name */
    private static String f9434h = "app_ver";

    /* renamed from: i, reason: collision with root package name */
    private static String f9435i = "dev_name";

    /* renamed from: j, reason: collision with root package name */
    private String f9436j;

    /* renamed from: k, reason: collision with root package name */
    private String f9437k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<String> f9438l = new ArrayList<>(3);

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f9439m = new ArrayList<>(3);

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f9440n = new ArrayList<>(3);
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private String f9441p;

    /* renamed from: q, reason: collision with root package name */
    private String f9442q;

    /* renamed from: r, reason: collision with root package name */
    private String f9443r;

    /* renamed from: s, reason: collision with root package name */
    private String f9444s;

    private void b(String str) {
        this.f9436j = str;
    }

    private void c(String str) {
        this.o = str;
    }

    private void d(String str) {
        this.f9437k = str;
    }

    private void e(String str) {
        this.f9441p = str;
    }

    private void f(String str) {
        this.f9442q = str;
    }

    private void g(String str) {
        this.f9443r = str;
    }

    private String h() {
        return this.f9436j;
    }

    private ArrayList<String> i() {
        return this.f9438l;
    }

    private ArrayList<String> j() {
        return this.f9439m;
    }

    private ArrayList<String> k() {
        return this.f9440n;
    }

    public final String a() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApkDisplayInfo{appName='");
        sb2.append(this.f9437k);
        sb2.append("', permDescJArray=");
        sb2.append(this.f9438l);
        sb2.append(", permDescOriJArray=");
        sb2.append(this.f9439m);
        sb2.append(", permDescAll=");
        sb2.append(this.f9440n);
        sb2.append(", priUrl='");
        sb2.append(this.f9441p);
        sb2.append("', updateTime='");
        sb2.append(this.f9442q);
        sb2.append("', appVersion='");
        sb2.append(this.f9443r);
        sb2.append("', devName='");
        return a3.l.p(sb2, this.f9444s, "'}");
    }

    private void a(ArrayList<String> arrayList) {
        this.f9438l = arrayList;
    }

    private void c(ArrayList<String> arrayList) {
        this.f9440n = arrayList;
    }

    private void h(String str) {
        this.f9444s = str;
    }

    public final String b() {
        return this.f9437k;
    }

    public final String d() {
        return this.f9442q;
    }

    public final String e() {
        return this.f9443r;
    }

    public final String f() {
        return this.f9444s;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject(this.f9436j);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static a a(a aVar) {
        return aVar == null ? new a() : aVar;
    }

    private void b(ArrayList<String> arrayList) {
        this.f9439m = arrayList;
    }

    private static JSONArray d(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jSONArray.put(arrayList.get(i10));
        }
        return jSONArray;
    }

    public final String c() {
        return this.f9441p;
    }

    public static a a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.optString(i10));
        }
        return arrayList;
    }

    private static a a(JSONObject jSONObject) {
        a aVar = null;
        if (jSONObject.has(f9429b)) {
            aVar = a((a) null);
            aVar.f9437k = jSONObject.optString(f9429b);
        }
        if (jSONObject.has(f9430c)) {
            aVar = a(aVar);
            JSONArray optJSONArray = jSONObject.optJSONArray(f9430c);
            if (optJSONArray != null) {
                aVar.f9438l = a(optJSONArray);
                ArrayList<String> arrayList = aVar.f9440n;
                String str = f9428a;
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    try {
                        if (optJSONArray.get(i10) instanceof String) {
                            str = i10 == 0 ? str + optJSONArray.optString(i10) : str + "," + optJSONArray.optString(i10);
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                aVar.o = str;
                aVar.f9440n = arrayList;
            }
        }
        if (jSONObject.has(f9431d)) {
            aVar = a(aVar);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(f9431d);
            if (optJSONArray2 != null) {
                aVar.f9439m = a(optJSONArray2);
                ArrayList<String> arrayList2 = aVar.f9440n;
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    try {
                        Object obj = optJSONArray2.get(i11);
                        if (obj instanceof String) {
                            arrayList2.add((String) obj);
                        }
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
                aVar.f9440n = arrayList2;
            }
        }
        if (jSONObject.has(f)) {
            aVar = a(aVar);
            aVar.f9441p = jSONObject.optString(f);
        }
        if (jSONObject.has(f9433g)) {
            aVar = a(aVar);
            aVar.f9442q = jSONObject.optString(f9433g);
        }
        if (jSONObject.has(f9434h)) {
            aVar = a(aVar);
            aVar.f9443r = jSONObject.optString(f9434h);
        }
        if (jSONObject.has(f9435i)) {
            aVar = a(aVar);
            aVar.f9444s = jSONObject.optString(f9435i);
        }
        if (aVar != null) {
            aVar.f9436j = jSONObject.toString();
        }
        return aVar;
    }
}
