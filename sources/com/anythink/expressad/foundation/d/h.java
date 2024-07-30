package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.a.c;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends com.anythink.expressad.out.j {
    public static final String cA = "adv_id";
    public static final String cB = "ttc_type";
    public static final String cC = "ttc_ct2";
    public static final String cD = "gh_id";
    public static final String cE = "gh_path";
    public static final String cF = "bind_id";
    public static final String cG = "mark";
    public static final String cH = "isPost";
    public static final int cI = 604800;
    public static final int cJ = 1800;
    public static final String cK = "apk_download_start";
    public static final String cL = "apk_download_end";
    public static final String cM = "apk_install";
    public static final String cN = "loopback";
    public static final String cO = "domain";
    public static final String cP = "key";
    public static final String cQ = "value";
    public static final String co = "h";
    public static final String cp = "apk_alt";
    public static final String cq = "disableApkAlt";
    public static final String cr = "apk_info";
    public static final String cs = "ntbarpt";
    public static final String ct = "ntbarpasbl";
    public static final String cu = "atat_type";
    public static final String cv = "akdlui";
    public static final String cw = "ttc";
    public static final String cx = "ttc_ct";
    public static final String cy = "ttc_pe";
    public static final String cz = "ttc_po";

    /* renamed from: l, reason: collision with root package name */
    private static final long f9595l = 1;

    /* renamed from: d, reason: collision with root package name */
    private a f9599d;

    /* renamed from: i, reason: collision with root package name */
    private String f9603i;

    /* renamed from: j, reason: collision with root package name */
    private String f9604j;

    /* renamed from: k, reason: collision with root package name */
    private String f9605k;

    /* renamed from: n, reason: collision with root package name */
    private int f9607n;
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private int f9608p;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, String> f9609q;

    /* renamed from: r, reason: collision with root package name */
    private String f9610r;

    /* renamed from: s, reason: collision with root package name */
    private String f9611s;

    /* renamed from: t, reason: collision with root package name */
    private int f9612t;

    /* renamed from: u, reason: collision with root package name */
    private int f9613u;

    /* renamed from: v, reason: collision with root package name */
    private c.b f9614v;

    /* renamed from: a, reason: collision with root package name */
    private int f9596a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f9597b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f9598c = "";

    /* renamed from: e, reason: collision with root package name */
    private int f9600e = 0;
    private int f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f9601g = 0;

    /* renamed from: h, reason: collision with root package name */
    private String f9602h = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f9606m = false;

    private void a(a aVar) {
        this.f9599d = aVar;
    }

    private void b(int i10) {
        this.f9596a = i10;
    }

    private void c(int i10) {
        this.f9600e = i10;
    }

    private void d(int i10) {
        this.f = i10;
    }

    private void e(int i10) {
        this.f9601g = i10;
    }

    private void f(String str) {
        this.o = str;
    }

    private void g(int i10) {
        this.f9613u = i10;
    }

    private void h(int i10) {
        this.f9612t = i10;
    }

    private void i(int i10) {
        this.f9607n = i10;
    }

    public final a aG() {
        return this.f9599d;
    }

    public final int aH() {
        return this.f9597b;
    }

    public final int aI() {
        return this.f9596a;
    }

    public final int aJ() {
        return this.f9600e;
    }

    public final int aK() {
        return this.f;
    }

    public final int aL() {
        return this.f9601g;
    }

    public final String aM() {
        return this.f9602h;
    }

    public final String aN() {
        return this.f9603i;
    }

    public final String aO() {
        return this.f9604j;
    }

    @Deprecated
    public final String aP() {
        return this.f9605k;
    }

    public final String aQ() {
        return this.o;
    }

    public final int aR() {
        return this.f9608p;
    }

    public final int aS() {
        return this.f9613u;
    }

    public final int aT() {
        return this.f9612t;
    }

    public final String aU() {
        return this.f9611s;
    }

    public final int aV() {
        return this.f9607n;
    }

    public final boolean aW() {
        return this.f9606m;
    }

    public c.b aj() {
        return this.f9614v;
    }

    public final String u(String str) {
        Map<String, String> map;
        String str2;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f9609q) != null && map.size() > 0) {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                String str3 = map.get("domain");
                if (!TextUtils.isEmpty(host) && host.contains(str3)) {
                    String str4 = map.get("key");
                    String str5 = map.get("value");
                    if (!str.contains(str4) && TextUtils.isEmpty(parse.getQueryParameter(str4)) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                        return str + ContainerUtils.FIELD_DELIMITER + str4 + ContainerUtils.KEY_VALUE_DELIMITER + str5;
                    }
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                        if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                            str2 = "";
                        } else {
                            str2 = parse.getQueryParameter(str4);
                        }
                        return str.replace(str4 + ContainerUtils.KEY_VALUE_DELIMITER + str2, str4 + ContainerUtils.KEY_VALUE_DELIMITER + str5);
                    }
                    return str;
                }
                return str;
            }
            return str;
        } catch (Throwable unused) {
            com.anythink.expressad.foundation.h.o.d("", "matchLoopback error");
            return str;
        }
    }

    private void a(int i10) {
        this.f9597b = i10;
    }

    private void b(String str) {
        this.f9603i = str;
    }

    private void c(String str) {
        this.f9604j = str;
    }

    private void d(String str) {
        this.f9605k = str;
    }

    private void e(String str) {
        this.f9610r = str;
    }

    private void f(int i10) {
        this.f9608p = i10;
    }

    private void g(String str) {
        this.f9611s = str;
    }

    private static Map<String, String> h(String str) {
        HashMap hashMap = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap2.put("domain", jSONObject.getString("domain"));
                hashMap2.put("key", jSONObject.getString("key"));
                hashMap2.put("value", jSONObject.getString("value"));
                return hashMap2;
            } catch (Throwable unused) {
                hashMap = hashMap2;
                com.anythink.expressad.foundation.h.o.d("", "loopbackStrToMap error");
                return hashMap;
            }
        } catch (Throwable unused2) {
        }
    }

    private void a(String str) {
        this.f9602h = str;
    }

    private String b() {
        return this.f9610r;
    }

    private static JSONObject c(JSONObject jSONObject, c cVar) {
        if (cVar == null) {
            return jSONObject;
        }
        jSONObject.put(cw, ((h) cVar).f9606m);
        jSONObject.put(cx, ((h) cVar).f9607n);
        jSONObject.put(cA, ((h) cVar).f9611s);
        jSONObject.put("ttc_type", ((h) cVar).f9612t);
        jSONObject.put(cC, ((h) cVar).f9613u);
        jSONObject.put(cD, ((h) cVar).f9603i);
        jSONObject.put(cE, com.anythink.expressad.foundation.h.j.a(((h) cVar).f9604j));
        jSONObject.put(cF, ((h) cVar).f9605k);
        jSONObject.put(cp, ((h) cVar).f9596a);
        jSONObject.put(cq, ((h) cVar).f9597b);
        a aVar = ((h) cVar).f9599d;
        if (aVar != null) {
            jSONObject.put(cr, aVar.g());
        }
        jSONObject.put(cG, ((h) cVar).o);
        jSONObject.put(cH, ((h) cVar).f9608p);
        jSONObject.put(c.f9455bc, cVar.x());
        jSONObject.put(ct, ((h) cVar).f);
        jSONObject.put(cs, ((h) cVar).f9600e);
        jSONObject.put(cu, ((h) cVar).f9601g);
        jSONObject.put(cv, ((h) cVar).f9602h);
        return jSONObject;
    }

    private Map<String, String> a() {
        return this.f9609q;
    }

    public static c b(JSONObject jSONObject, c cVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((h) cVar).f9606m = jSONObject.optBoolean(cw);
            ((h) cVar).f9607n = jSONObject.optInt(cx, 604800);
            ((h) cVar).f9611s = jSONObject.optString(cA);
            ((h) cVar).f9612t = jSONObject.optInt("ttc_type", 3);
            ((h) cVar).f9613u = jSONObject.optInt(cC, 1800);
            ((h) cVar).o = jSONObject.optString(cG);
            ((h) cVar).f9608p = jSONObject.optInt(cH);
            try {
                if (jSONObject.has(cN)) {
                    String optString = jSONObject.optString(cN);
                    if (!TextUtils.isEmpty(optString)) {
                        ((h) cVar).f9610r = optString;
                        ((h) cVar).f9609q = h(optString);
                    }
                }
            } catch (Exception unused) {
                com.anythink.expressad.foundation.h.o.d("", "loopback parser error");
            }
            String optString2 = jSONObject.optString(cD);
            if (!TextUtils.isEmpty(optString2)) {
                ((h) cVar).f9603i = optString2;
                String optString3 = jSONObject.optString(cE);
                if (!TextUtils.isEmpty(optString3)) {
                    ((h) cVar).f9604j = com.anythink.expressad.foundation.h.j.b(optString3);
                }
                ((h) cVar).f9605k = jSONObject.optString(cF);
            }
            cVar.e(jSONObject.optString("cam_html"));
            cVar.b(jSONObject.optString("cam_html"));
            ((h) cVar).f9596a = jSONObject.optInt(cp, 0);
            ((h) cVar).f9597b = jSONObject.optInt(cq, 0);
            ((h) cVar).f9599d = a.a(jSONObject.optString(cr));
            ((h) cVar).f = jSONObject.optInt(ct, 0);
            ((h) cVar).f9600e = jSONObject.optInt(cs, 0);
            ((h) cVar).f9601g = jSONObject.optInt(cu, 0);
            ((h) cVar).f9602h = jSONObject.optString(cv, "");
            return cVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            com.anythink.expressad.foundation.h.o.d(co, "parse campaign json exception: " + e10.getLocalizedMessage());
            return cVar;
        }
    }

    private void a(Map<String, String> map) {
        this.f9609q = map;
    }

    private void a(boolean z10) {
        this.f9606m = z10;
    }

    public void a(c.b bVar) {
        this.f9614v = bVar;
    }

    public static c a(JSONObject jSONObject, c cVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ((h) cVar).f9606m = jSONObject.optBoolean(cw);
            ((h) cVar).f9607n = jSONObject.optInt(cx, 604800);
            ((h) cVar).f9611s = jSONObject.optString(cA);
            ((h) cVar).f9612t = jSONObject.optInt("ttc_type", 3);
            ((h) cVar).f9613u = jSONObject.optInt(cC, 1800);
            cVar.a(System.currentTimeMillis());
            cVar.m(jSONObject.optString(d.f));
            cVar.n(jSONObject.optString(d.f9546k));
            ((h) cVar).o = jSONObject.optString(cG);
            ((h) cVar).f9608p = jSONObject.optInt(cH);
            try {
                if (jSONObject.has(cN)) {
                    String optString = jSONObject.optString(cN);
                    if (!TextUtils.isEmpty(optString)) {
                        ((h) cVar).f9610r = optString;
                        ((h) cVar).f9609q = h(optString);
                    }
                }
            } catch (Exception unused) {
                com.anythink.expressad.foundation.h.o.d("", "loopback parser error");
            }
            String optString2 = jSONObject.optString(cD);
            if (!TextUtils.isEmpty(optString2)) {
                ((h) cVar).f9603i = optString2;
                String optString3 = jSONObject.optString(cE);
                if (!TextUtils.isEmpty(optString3)) {
                    ((h) cVar).f9604j = com.anythink.expressad.foundation.h.j.b(optString3);
                }
                ((h) cVar).f9605k = jSONObject.optString(cF);
            }
            ((h) cVar).f9596a = jSONObject.optInt(cp, 0);
            ((h) cVar).f9597b = jSONObject.optInt(cq, 0);
            ((h) cVar).f9599d = a.a(jSONObject.optString(cr));
            ((h) cVar).f = jSONObject.optInt(ct, 0);
            ((h) cVar).f9600e = jSONObject.optInt(cs, 0);
            ((h) cVar).f9601g = jSONObject.optInt(cu, 0);
            ((h) cVar).f9602h = jSONObject.optString(cv, "");
            return cVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            com.anythink.expressad.foundation.h.o.d(co, "parse campaign json exception: " + e10.getLocalizedMessage());
            return cVar;
        }
    }

    public final boolean b(c cVar) {
        boolean z10 = this.f9596a == 1 && cVar.Q() == 3 && ((h) cVar).f9597b != 1;
        if (!z10) {
            return z10;
        }
        try {
            return t.a(com.anythink.core.common.b.n.a().g(), ba()) ? false : z10;
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.a(co, th.getMessage());
            return z10;
        }
    }

    public static String a(d dVar, c cVar, String str) {
        if (dVar != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap<String, String> a10 = dVar.a();
                if (a10 != null) {
                    a10.entrySet().iterator();
                    for (Map.Entry<String, String> entry : a10.entrySet()) {
                        String key = entry.getKey();
                        str = str.replaceAll("\\{" + key + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> z10 = cVar.z();
                if (z10 != null) {
                    z10.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : z10.entrySet()) {
                        String key2 = entry2.getKey();
                        str = str.replaceAll("\\{" + key2 + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> b10 = dVar.b();
                if (b10 != null) {
                    for (Map.Entry<String, String> entry3 : b10.entrySet()) {
                        String key3 = entry3.getKey();
                        str = str.replaceAll("\\{" + key3 + "\\}", entry3.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(dVar.e(), com.anythink.expressad.foundation.g.a.bN));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), ContainerUtils.KEY_VALUE_DELIMITER);
                }
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.o.b(co, th.getMessage(), th);
            }
        }
        return str;
    }
}
