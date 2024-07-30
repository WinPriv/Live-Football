package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements com.anythink.expressad.e.b, Serializable {
    public static final String A = "cam_tpl_url";
    public static final String B = "cam_html";
    public static final String C = "cam_tpl_url";
    public static final String D = "cam_html";
    public static final String E = "nscpt";
    public static final String F = "mof_template_url";
    public static final String G = "mof_tplid";
    public static final String H = "req_ext_data";
    public static final String I = "replace_tmp";
    private static final String K = "d";
    private static final long L = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final String f9537a = "a";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9538b = "pv_urls";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9539c = "parent_session_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9540d = "ad_type";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9541e = "unit_size";
    public static final String f = "html_url";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9542g = "only_impression_url";

    /* renamed from: h, reason: collision with root package name */
    public static final String f9543h = "ads";

    /* renamed from: i, reason: collision with root package name */
    public static final String f9544i = "template";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9545j = "frames";

    /* renamed from: k, reason: collision with root package name */
    public static final String f9546k = "end_screen_url";

    /* renamed from: l, reason: collision with root package name */
    public static final String f9547l = "jm_do";

    /* renamed from: m, reason: collision with root package name */
    public static final String f9548m = "rks";

    /* renamed from: n, reason: collision with root package name */
    public static final String f9549n = "vcn";
    public static final String o = "token_r";

    /* renamed from: p, reason: collision with root package name */
    public static final String f9550p = "encrypt_p";

    /* renamed from: q, reason: collision with root package name */
    public static final String f9551q = "irlfa";

    /* renamed from: r, reason: collision with root package name */
    public static final String f9552r = "csp";

    /* renamed from: s, reason: collision with root package name */
    public static final String f9553s = "do";

    /* renamed from: t, reason: collision with root package name */
    public static final String f9554t = "sh";

    /* renamed from: u, reason: collision with root package name */
    public static final String f9555u = "ia_icon";

    /* renamed from: v, reason: collision with root package name */
    public static final String f9556v = "ia_rst";

    /* renamed from: w, reason: collision with root package name */
    public static final String f9557w = "ia_url";

    /* renamed from: x, reason: collision with root package name */
    public static final String f9558x = "ia_ori";
    public static final String y = "ia_all_ext1";

    /* renamed from: z, reason: collision with root package name */
    public static final String f9559z = "ia_all_ext2";
    public ArrayList<c> J;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private int S;
    private String T;
    private int U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private String f9560aa;

    /* renamed from: ab, reason: collision with root package name */
    private String f9561ab;

    /* renamed from: ac, reason: collision with root package name */
    private String f9562ac;

    /* renamed from: ad, reason: collision with root package name */
    private int f9563ad;
    private List<com.anythink.expressad.out.l> ae;
    private HashMap<String, String> ag;
    private HashMap<String, String> ah;
    private String ai;
    private String aj;
    private String ak;
    private int al;
    private int am;
    private int ao;
    private String ap;
    private String M = "";
    private StringBuffer af = new StringBuffer();
    private String an = "";

    private String A() {
        return this.f9560aa;
    }

    private String B() {
        return this.f9561ab;
    }

    private String C() {
        return this.f9562ac;
    }

    private ArrayList<c> D() {
        return this.J;
    }

    private int E() {
        return this.f9563ad;
    }

    private static Object a(Object obj) {
        return obj == null ? "" : obj;
    }

    private void b(String str) {
        this.M = str;
    }

    private void c(String str) {
        this.N = str;
    }

    private void d(String str) {
        this.O = str;
    }

    private void e(String str) {
        this.P = str;
    }

    private void f(String str) {
        this.Q = str;
    }

    private String g() {
        return this.M;
    }

    private String h() {
        return this.N;
    }

    private String i() {
        return this.O;
    }

    private String j() {
        return this.P;
    }

    private String k() {
        return this.Q;
    }

    private String l() {
        return this.R;
    }

    private int m() {
        return this.S;
    }

    private String n() {
        return this.T;
    }

    private int o() {
        return this.U;
    }

    private String p() {
        return this.V;
    }

    private String q() {
        return this.W;
    }

    private String r() {
        return this.an;
    }

    private int s() {
        int i10 = this.al;
        if (i10 > 1) {
            return i10;
        }
        return 1;
    }

    private int t() {
        int i10 = this.am;
        if (i10 == 1) {
            return i10;
        }
        return 0;
    }

    private String u() {
        return this.ai;
    }

    private String v() {
        return this.aj;
    }

    private String w() {
        return this.ak;
    }

    private int x() {
        return this.ao;
    }

    private List<com.anythink.expressad.out.l> y() {
        return this.ae;
    }

    private String z() {
        return this.Y;
    }

    private void a(int i10) {
        this.S = i10;
    }

    private void b(int i10) {
        this.U = i10;
    }

    private void c(int i10) {
        this.al = i10;
    }

    private void d(int i10) {
        this.am = i10;
    }

    private void e(int i10) {
        this.ao = i10;
    }

    private void f(int i10) {
        this.Z = i10;
    }

    private void g(String str) {
        this.R = str;
    }

    private void h(String str) {
        this.T = str;
    }

    private void i(String str) {
        this.V = str;
    }

    private void j(String str) {
        this.W = str;
    }

    private void k(String str) {
        this.an = str;
    }

    private void l(String str) {
        this.ai = str;
    }

    private void m(String str) {
        this.aj = str;
    }

    private void n(String str) {
        this.ak = str;
    }

    private void o(String str) {
        this.X = str;
    }

    private void p(String str) {
        this.Y = str;
    }

    private void q(String str) {
        this.f9560aa = str;
    }

    private void r(String str) {
        this.f9561ab = str;
    }

    private void s(String str) {
        this.f9562ac = str;
    }

    private void g(int i10) {
        this.f9563ad = i10;
    }

    public final HashMap<String, String> a() {
        return this.ag;
    }

    public final HashMap<String, String> b() {
        return this.ah;
    }

    public final String c() {
        return this.X;
    }

    public final int d() {
        return this.Z;
    }

    public final String e() {
        StringBuffer stringBuffer = this.af;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.af.toString();
        }
        try {
            String f10 = com.anythink.core.common.k.d.f();
            String c10 = com.anythink.core.common.k.d.c(com.anythink.core.common.b.n.a().g());
            String b10 = com.anythink.core.common.k.d.b(com.anythink.core.common.b.n.a().g());
            com.anythink.core.common.b.n.a().g();
            String valueOf = String.valueOf(com.anythink.expressad.foundation.h.k.a());
            String str = com.anythink.expressad.foundation.h.k.e(com.anythink.core.common.b.n.a().g()) + "x" + com.anythink.expressad.foundation.h.k.f(com.anythink.core.common.b.n.a().g());
            StringBuffer stringBuffer2 = this.af;
            stringBuffer2.append(this.Z);
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) "1"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) Build.VERSION.RELEASE));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.expressad.out.b.f10461a));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.k.d.a()));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) str));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a(Integer.valueOf(com.anythink.expressad.foundation.h.k.b(com.anythink.expressad.foundation.b.a.b().d()))));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.k.d.f(com.anythink.expressad.foundation.b.a.b().d())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) valueOf));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) b10));
            stringBuffer2.append(a((Object) c10));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) "at_device1"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) "at_device2"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.k.d.d(com.anythink.core.common.b.n.a().g())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) f10));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.k.d.b()));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append("||");
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) (com.anythink.core.common.b.n.a().y() + "," + com.anythink.core.common.b.n.a().z())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            this.af = stringBuffer2;
            IExHandler b11 = com.anythink.core.common.b.n.a().b();
            if (b11 != null) {
                return b11.fillCDataParam(this.af.toString());
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(K, th.getMessage(), th);
        }
        String stringBuffer3 = this.af.toString();
        stringBuffer3.replaceAll("at_device1", "");
        stringBuffer3.replaceAll("at_device2", "");
        return stringBuffer3;
    }

    public final String f() {
        try {
            if (!TextUtils.isEmpty(this.ap)) {
                return this.ap;
            }
            if (TextUtils.isEmpty(this.f9562ac)) {
                return "";
            }
            Uri parse = Uri.parse(this.f9562ac);
            if (parse != null) {
                this.ap = parse.getQueryParameter("k");
            }
            return this.ap;
        } catch (Exception unused) {
            return "";
        }
    }

    private void a(HashMap<String, String> hashMap) {
        this.ag = hashMap;
    }

    private void b(HashMap<String, String> hashMap) {
        this.ah = hashMap;
    }

    private void a(List<com.anythink.expressad.out.l> list) {
        this.ae = list;
    }

    private static d b(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    private void a(ArrayList<c> arrayList) {
        this.J = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.anythink.expressad.foundation.d.d] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v16, types: [com.anythink.expressad.foundation.d.d] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v6 */
    private static d b(JSONObject jSONObject, String str) {
        String str2;
        String str3;
        int i10;
        ArrayList arrayList;
        String str4;
        String str5;
        int i11;
        String str6;
        JSONObject jSONObject2 = jSONObject;
        String str7 = f9543h;
        String str8 = "template";
        String str9 = "a";
        String str10 = f9542g;
        String str11 = f;
        if (jSONObject2 != null) {
            try {
                ?? dVar = new d();
                try {
                    String optString = jSONObject2.optString(f9548m);
                    if (!TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject3 = new JSONObject(optString);
                        Iterator<String> keys = jSONObject3.keys();
                        HashMap<String, String> hashMap = new HashMap<>();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject3.optString(next));
                        }
                        ((d) dVar).ag = hashMap;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        hashMap2.put("encrypt_p", "");
                        hashMap2.put(f9551q, "");
                        ((d) dVar).ah = hashMap2;
                    }
                    JSONObject optJSONObject = jSONObject2.optJSONObject(H);
                    int optInt = jSONObject2.optInt(E, 1);
                    String optString2 = jSONObject2.optString(F, "");
                    int optInt2 = jSONObject2.optInt(G, 0);
                    String jSONObject4 = optJSONObject != null ? optJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        str3 = jSONObject4;
                        i10 = optInt2;
                        arrayList = null;
                    } else {
                        str3 = jSONObject4;
                        arrayList = new ArrayList(optJSONArray.length());
                        i10 = optInt2;
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            arrayList.add(optJSONArray.getString(i12));
                        }
                    }
                    com.anythink.expressad.foundation.c.a.a.a().a(jSONObject2.optJSONObject(I));
                    ((d) dVar).X = jSONObject2.optString("a");
                    ((d) dVar).Y = jSONObject2.optString("parent_session_id");
                    ((d) dVar).Z = jSONObject2.optInt("ad_type");
                    ((d) dVar).f9560aa = jSONObject2.optString(f9541e);
                    ((d) dVar).f9561ab = jSONObject2.optString(f);
                    ((d) dVar).f9562ac = jSONObject2.optString(f9542g);
                    ((d) dVar).f9563ad = jSONObject2.optInt("template");
                    ((d) dVar).ao = jSONObject2.optInt(f9547l);
                    ((d) dVar).R = jSONObject2.optString("ia_icon");
                    ((d) dVar).S = jSONObject2.optInt("ia_rst");
                    ((d) dVar).T = jSONObject2.optString("ia_url");
                    ((d) dVar).U = jSONObject2.optInt("ia_ori");
                    ((d) dVar).V = jSONObject2.optString(y);
                    ((d) dVar).W = jSONObject2.optString(f9559z);
                    ((d) dVar).al = jSONObject2.optInt("vcn");
                    ((d) dVar).am = jSONObject2.optInt("token_r");
                    ((d) dVar).an = jSONObject2.optString("encrypt_p");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray(f9543h);
                    JSONArray optJSONArray3 = jSONObject2.optJSONArray(f9545j);
                    String str12 = f9546k;
                    try {
                        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            String str13 = "parse campaign error ,campaign is null";
                            String str14 = optString2;
                            int i13 = 0;
                            dVar = dVar;
                            while (i13 < optJSONArray3.length()) {
                                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i13);
                                int i14 = i13;
                                JSONArray jSONArray = optJSONObject2.getJSONArray(str7);
                                String str15 = str7;
                                ArrayList arrayList3 = new ArrayList();
                                String str16 = str8;
                                JSONObject jSONObject5 = optJSONObject2;
                                int i15 = 0;
                                d dVar2 = dVar;
                                while (i15 < jSONArray.length()) {
                                    JSONObject optJSONObject3 = jSONArray.optJSONObject(i15);
                                    String optString3 = jSONObject2.optString(str10);
                                    String optString4 = jSONObject2.optString(str11);
                                    String str17 = str12;
                                    String str18 = str13;
                                    JSONObject jSONObject6 = jSONObject5;
                                    JSONArray jSONArray2 = optJSONArray3;
                                    String str19 = str3;
                                    String str20 = str11;
                                    int i16 = i10;
                                    String str21 = str10;
                                    ArrayList arrayList4 = arrayList2;
                                    String str22 = str14;
                                    int i17 = i14;
                                    JSONArray jSONArray3 = jSONArray;
                                    int i18 = optInt;
                                    String str23 = str9;
                                    d dVar3 = dVar2;
                                    c a10 = c.a(optJSONObject3, optString3, optString4, jSONObject2.optString(str12), false, dVar2, str);
                                    if (a10 != null) {
                                        a10.i(dVar3.T);
                                        a10.h(dVar3.U);
                                        a10.g(dVar3.S);
                                        a10.h(dVar3.R);
                                        a10.f(jSONObject2.optInt("ad_type"));
                                        a10.f(jSONObject2.optString(c.aS));
                                        a10.g(jSONObject2.optString(c.aT));
                                        a10.d(dVar3.s());
                                        a10.c(dVar3.t());
                                        a10.c(dVar3.an);
                                        a10.k(i16);
                                        a10.r(str22);
                                        i11 = i18;
                                        a10.j(i11);
                                        a10.a((List<String>) arrayList);
                                        str5 = str19;
                                        a10.s(str5);
                                        arrayList3.add(a10);
                                        str6 = str18;
                                    } else {
                                        str5 = str19;
                                        i11 = i18;
                                        str6 = str18;
                                        dVar3.M = str6;
                                    }
                                    i15++;
                                    optJSONArray3 = jSONArray2;
                                    arrayList2 = arrayList4;
                                    str12 = str17;
                                    jSONObject5 = jSONObject6;
                                    str13 = str6;
                                    jSONArray = jSONArray3;
                                    i14 = i17;
                                    str14 = str22;
                                    str10 = str21;
                                    i10 = i16;
                                    str11 = str20;
                                    str3 = str5;
                                    optInt = i11;
                                    dVar2 = dVar3;
                                    str9 = str23;
                                }
                                String str24 = str9;
                                d dVar4 = dVar2;
                                JSONObject jSONObject7 = jSONObject5;
                                ArrayList arrayList5 = arrayList2;
                                int i19 = optInt;
                                String str25 = str3;
                                String str26 = str11;
                                int i20 = i10;
                                com.anythink.expressad.out.l lVar = new com.anythink.expressad.out.l();
                                lVar.b(jSONObject2.optString("parent_session_id"));
                                lVar.a(jSONObject2.optString(str24));
                                lVar.a(arrayList3);
                                lVar.a(jSONObject7.optInt(str16));
                                arrayList5.add(lVar);
                                arrayList2 = arrayList5;
                                str14 = str14;
                                optJSONArray3 = optJSONArray3;
                                str10 = str10;
                                str7 = str15;
                                i10 = i20;
                                str13 = str13;
                                str11 = str26;
                                i13 = i14 + 1;
                                str8 = str16;
                                str3 = str25;
                                optInt = i19;
                                dVar = dVar4;
                                str9 = str24;
                                str12 = str12;
                            }
                            d dVar5 = dVar;
                            dVar5.ae = arrayList2;
                            return dVar5;
                        }
                        String str27 = f9546k;
                        int i21 = optInt;
                        String str28 = str3;
                        String str29 = f;
                        int i22 = i10;
                        String str30 = f9542g;
                        String str31 = "parse campaign error ,campaign is null";
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            ArrayList<c> arrayList6 = new ArrayList<>();
                            int i23 = 0;
                            while (i23 < optJSONArray2.length()) {
                                String str32 = str30;
                                String str33 = str29;
                                String str34 = str31;
                                String str35 = str27;
                                JSONArray jSONArray4 = optJSONArray2;
                                String str36 = str28;
                                str30 = str32;
                                int i24 = i21;
                                c a11 = c.a(optJSONArray2.optJSONObject(i23), jSONObject2.optString(str32), jSONObject2.optString(str33), jSONObject2.optString(str35), false, dVar, str);
                                if (a11 != null) {
                                    a11.k(i22);
                                    a11.r(optString2);
                                    a11.j(i24);
                                    a11.a((List<String>) arrayList);
                                    str4 = str36;
                                    a11.s(str4);
                                    a11.d(dVar.s());
                                    a11.c(dVar.t());
                                    a11.c(((d) dVar).an);
                                    arrayList6.add(a11);
                                } else {
                                    str4 = str36;
                                    ((d) dVar).M = str34;
                                }
                                i23++;
                                str31 = str34;
                                i21 = i24;
                                str28 = str4;
                                str27 = str35;
                                optJSONArray2 = jSONArray4;
                                jSONObject2 = jSONObject;
                                str29 = str33;
                            }
                            dVar.J = arrayList6;
                        }
                        str2 = dVar;
                    } catch (Exception unused) {
                        str2 = str9;
                        com.anythink.expressad.foundation.h.o.d(K, "parse campaign unit exception");
                        return str2;
                    }
                } catch (Exception unused2) {
                    str9 = dVar;
                }
            } catch (Exception unused3) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        return str2;
    }

    private static d a(JSONObject jSONObject, String str) {
        return b(jSONObject, str);
    }

    public static d a(String str) {
        try {
            return b(new JSONObject(str), "");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static d a(JSONObject jSONObject) {
        return b(jSONObject, "");
    }
}
