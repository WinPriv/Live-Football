package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import com.anythink.core.common.b.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12464a = 2;
    private static com.anythink.expressad.foundation.c.c ak = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12465b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12466c = 5;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12467d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12468e = 7;
    public static final int f = -2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12469g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12470h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12471i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12472j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12473k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12474l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12475m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12476n = 0;
    public static final int o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12477p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12478q = -1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12479r = -2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f12480s = -3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f12481t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f12482u = -1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f12483v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f12484w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static String f12485x;
    private List<com.anythink.expressad.videocommon.c.b> A;
    private long B;
    private ArrayList<Integer> V;
    private int ai;
    private int al;
    private String y;

    /* renamed from: z, reason: collision with root package name */
    private String f12490z;
    private int C = -1;
    private int D = 0;
    private int E = 0;
    private int F = 1;
    private int G = 1;
    private int H = 1;
    private int I = 1;
    private double J = 1.0d;
    private int K = 2;
    private int L = 5;
    private int M = 1;
    private int N = 3;
    private int O = 80;
    private int P = 100;
    private int Q = 0;
    private double R = 1.0d;
    private int S = -1;
    private int T = 2;
    private double U = 1.0d;
    private int W = 3;
    private int X = 1;
    private int Y = 0;
    private int Z = 10;

    /* renamed from: aa, reason: collision with root package name */
    private int f12486aa = 60;

    /* renamed from: ab, reason: collision with root package name */
    private String f12487ab = "";

    /* renamed from: ac, reason: collision with root package name */
    private int f12488ac = 0;

    /* renamed from: ad, reason: collision with root package name */
    private int f12489ad = 70;
    private int ae = 0;
    private int af = -1;
    private int ag = -1;
    private int ah = -1;
    private int aj = 20;
    private int am = 0;
    private int an = 1;
    private String ao = "";
    private int ap = 1;
    private String aq = "";
    private int ar = 1;
    private String as = "Virtual Item";
    private int at = 0;
    private int au = 1;
    private int av = 60;

    public static String J() {
        return f12485x;
    }

    private String W() {
        return this.f12487ab;
    }

    private int X() {
        return this.Z;
    }

    private int Y() {
        return this.f12486aa;
    }

    private ArrayList<Integer> Z() {
        return this.V;
    }

    private int aa() {
        return this.ae;
    }

    private int ab() {
        return this.D;
    }

    private int ac() {
        return this.am;
    }

    private int ad() {
        return this.an;
    }

    private String ae() {
        return this.ao;
    }

    private String af() {
        return this.aq;
    }

    private int ag() {
        return this.ar;
    }

    private int ah() {
        return this.N;
    }

    private int ai() {
        return this.O;
    }

    private int aj() {
        return this.G;
    }

    private int ak() {
        return this.I;
    }

    private double al() {
        return this.J;
    }

    private int am() {
        return this.K;
    }

    private int an() {
        return this.F;
    }

    private long ao() {
        return this.B;
    }

    private String ap() {
        return this.y;
    }

    private double aq() {
        return this.R;
    }

    private int ar() {
        return this.W;
    }

    private Queue<Integer> as() {
        LinkedList linkedList;
        Exception e10;
        List<com.anythink.expressad.videocommon.c.b> list;
        try {
            list = this.A;
        } catch (Exception e11) {
            linkedList = null;
            e10 = e11;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            try {
                linkedList.add(Integer.valueOf(this.A.get(i10).a()));
            } catch (Exception e12) {
                e10 = e12;
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
                return linkedList;
            }
        }
        return linkedList;
    }

    private int at() {
        return this.at;
    }

    private void b(int i10) {
        this.Z = i10;
    }

    private void c(int i10) {
        this.f12486aa = i10;
    }

    private void d(String str) {
        this.f12487ab = str;
    }

    public final int A() {
        return this.H;
    }

    public final void B() {
        this.H = 1;
    }

    public final void C() {
        this.I = 1;
    }

    public final int D() {
        return this.L;
    }

    public final void E() {
        this.L = 1;
    }

    public final int F() {
        return this.M;
    }

    public final void G() {
        this.M = 1;
    }

    public final void H() {
        this.F = 1;
    }

    public final List<com.anythink.expressad.videocommon.c.b> I() {
        return this.A;
    }

    public final int K() {
        return this.T;
    }

    public final double L() {
        return this.U;
    }

    public final int M() {
        return this.X;
    }

    public final void N() {
        this.X = 1;
    }

    public final String O() {
        return this.f12490z;
    }

    public final void P() {
        this.W = 3;
    }

    public final Queue<Integer> Q() {
        LinkedList linkedList;
        Exception e10;
        List<com.anythink.expressad.videocommon.c.b> list;
        try {
            list = this.A;
        } catch (Exception e11) {
            linkedList = null;
            e10 = e11;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            try {
                linkedList.add(Integer.valueOf(this.A.get(i10).b()));
            } catch (Exception e12) {
                e10 = e12;
                e10.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final JSONObject R() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.y);
            jSONObject.put(b.f12440g, this.F);
            List<com.anythink.expressad.videocommon.c.b> list = this.A;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.anythink.expressad.videocommon.c.b bVar : this.A) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.G);
            jSONObject.put("acn", this.H);
            jSONObject.put("vcn", this.I);
            jSONObject.put("cbp", this.J);
            jSONObject.put("ttc_type", this.K);
            jSONObject.put("offset", this.L);
            jSONObject.put("dlnet", this.M);
            jSONObject.put(b.J, this.N);
            jSONObject.put(b.K, this.O);
            jSONObject.put("ready_rate", this.P);
            jSONObject.put("endscreen_type", this.al);
            jSONObject.put(b.O, this.ae);
            jSONObject.put(b.P, this.af);
            jSONObject.put(b.Q, this.ag);
            jSONObject.put(b.R, this.ah);
            jSONObject.put("orientation", this.f12488ac);
            jSONObject.put(b.S, this.ai);
            jSONObject.put("playclosebtn_tm", this.C);
            jSONObject.put("play_ctdown", this.D);
            jSONObject.put("close_alert", this.E);
            jSONObject.put(b.f12434ac, this.S);
            jSONObject.put(b.f12432aa, this.R);
            jSONObject.put(b.ar, this.T);
            jSONObject.put(b.as, this.U);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.V;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.V.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put(b.ao, jSONArray2);
            }
            jSONObject.put(b.ap, this.W);
            jSONObject.put("tmorl", this.X);
            jSONObject.put(b.ax, this.Y);
            jSONObject.put("placementid", this.f12490z);
            jSONObject.put("ltafemty", this.Z);
            jSONObject.put("ltorwc", this.f12486aa);
            jSONObject.put("amount_max", this.am);
            jSONObject.put("callback_rule", this.an);
            jSONObject.put("virtual_currency", this.ao);
            jSONObject.put("amount", this.ap);
            jSONObject.put("icon", this.aq);
            jSONObject.put("currency_id", this.ar);
            jSONObject.put("name", this.as);
            jSONObject.put("isDefault", this.at);
            jSONObject.put(b.aN, this.au);
            jSONObject.put(b.aO, this.av);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public final int S() {
        return this.f12489ad;
    }

    public final void T() {
        this.f12489ad = 70;
    }

    public final int U() {
        return this.au;
    }

    public final int V() {
        return this.av;
    }

    public final int a() {
        return this.Y;
    }

    public final int e() {
        return this.af;
    }

    public final int f() {
        return this.ag;
    }

    public final void g() {
        this.ag = 2;
    }

    public final int h() {
        return this.ah;
    }

    public final void i() {
        this.ah = -1;
    }

    public final int j() {
        return this.C;
    }

    public final int k() {
        return this.E;
    }

    public final void l() {
        this.E = 1;
    }

    public final int m() {
        return this.ap;
    }

    public final String n() {
        return this.as;
    }

    public final int o() {
        return this.aj;
    }

    public final int p() {
        return this.ai;
    }

    public final void q() {
        this.ai = 1;
    }

    public final int r() {
        return this.al;
    }

    public final void s() {
        this.al = 2;
    }

    public final void t() {
        this.N = 3;
    }

    public final void u() {
        this.O = 80;
    }

    public final int v() {
        return this.P;
    }

    public final void w() {
        this.P = 100;
    }

    public final int x() {
        return this.Q;
    }

    public final void y() {
        this.Q = 0;
    }

    public final void z() {
        this.G = 1;
    }

    private void d(int i10) {
        this.Y = i10;
    }

    private void e(int i10) {
        this.C = i10;
    }

    private void f(int i10) {
        this.D = i10;
    }

    private void g(int i10) {
        this.am = i10;
    }

    private void h(int i10) {
        this.an = i10;
    }

    private void i(int i10) {
        if (i10 <= 0) {
            this.ap = 1;
        } else {
            this.ap = i10;
        }
    }

    private void j(int i10) {
        this.ar = i10;
    }

    private void k(int i10) {
        this.aj = i10;
    }

    private void l(int i10) {
        this.K = i10;
    }

    private int m(int i10) {
        int i11 = this.S;
        if (i11 == -1) {
            if (i10 == 94) {
                return 2;
            }
            if (i10 == 287) {
                return 3;
            }
        }
        return i11;
    }

    private void n(int i10) {
        this.T = i10;
    }

    private boolean o(int i10) {
        ArrayList<Integer> arrayList = this.V;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.V.contains(Integer.valueOf(i10));
    }

    private void p(int i10) {
        this.S = i10;
    }

    private void q(int i10) {
        this.at = i10;
    }

    private void r(int i10) {
        this.au = i10;
    }

    private void s(int i10) {
        this.av = i10;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.V = arrayList;
    }

    public final int b() {
        return this.f12488ac;
    }

    public final void c() {
        this.f12488ac = 0;
    }

    private void b(double d10) {
        this.R = d10;
    }

    private void c(double d10) {
        this.U = d10;
    }

    private void e(String str) {
        this.ao = str;
    }

    private void f(String str) {
        this.aq = str;
    }

    private void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.as = this.ao;
        } else {
            this.as = str;
        }
    }

    private static void h(String str) {
        f12485x = str;
    }

    public final void a(int i10) {
        this.af = i10;
    }

    public final void d() {
        this.ae = 0;
    }

    private void a(double d10) {
        this.J = d10;
    }

    public static d c(String str) {
        JSONObject optJSONObject;
        int i10;
        if (ak == null) {
            ak = com.anythink.expressad.foundation.c.c.a(n.a().g());
        }
        d dVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString = optJSONObject.optString("unitId");
                if (TextUtils.isEmpty(optString)) {
                    return null;
                }
                d dVar2 = new d();
                try {
                    List<com.anythink.expressad.videocommon.c.b> a10 = com.anythink.expressad.videocommon.c.b.a(optJSONObject.optJSONArray("adSourceList"));
                    dVar2.y = optString;
                    dVar2.A = a10;
                    dVar2.F = optJSONObject.optInt(b.f12440g);
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    dVar2.G = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    dVar2.H = optInt2;
                    dVar2.I = optJSONObject.optInt("vcn", 5);
                    dVar2.J = optJSONObject.optDouble("cbp", 1.0d);
                    dVar2.K = optJSONObject.optInt("ttc_type", 2);
                    dVar2.L = optJSONObject.optInt("offset", 5);
                    dVar2.M = optJSONObject.optInt("dlnet", 1);
                    dVar2.al = optJSONObject.optInt("endscreen_type", 2);
                    dVar2.N = optJSONObject.optInt(b.J, 3);
                    dVar2.O = optJSONObject.optInt(b.K, 80);
                    dVar2.P = optJSONObject.optInt("ready_rate", 100);
                    dVar2.Q = optJSONObject.optInt("cd_rate", 0);
                    dVar2.B = jSONObject.optLong("current_time");
                    dVar2.f12488ac = optJSONObject.optInt("orientation", 0);
                    dVar2.ae = optJSONObject.optInt(b.O, 0);
                    dVar2.af = optJSONObject.optInt(b.P, -1);
                    dVar2.ag = optJSONObject.optInt(b.Q, 2);
                    dVar2.ah = optJSONObject.optInt(b.R, -1);
                    dVar2.ai = optJSONObject.optInt(b.S, 1);
                    dVar2.C = optJSONObject.optInt("playclosebtn_tm", -1);
                    dVar2.D = optJSONObject.optInt("play_ctdown", 0);
                    dVar2.E = optJSONObject.optInt("close_alert", 0);
                    dVar2.aj = optJSONObject.optInt(b.I, 20);
                    dVar2.f12489ad = optJSONObject.optInt(b.aC, 70);
                    dVar2.S = optJSONObject.optInt(b.f12434ac, -1);
                    dVar2.R = optJSONObject.optDouble(b.f12432aa, 1.0d);
                    dVar2.T = optJSONObject.optInt(b.ar, 2);
                    dVar2.U = optJSONObject.optDouble(b.as, 1.0d);
                    f12485x = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray(b.ao);
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i11)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        dVar2.V = arrayList;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt(b.ap, 0);
                    dVar2.W = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    dVar2.X = optInt4;
                    if (dVar2.J != 1.0d && new Random().nextDouble() > dVar2.J) {
                        i10 = 1;
                        dVar2.Y = i10;
                        dVar2.f12490z = optJSONObject.optString("placementid");
                        dVar2.Z = optJSONObject.optInt("ltafemty", 10);
                        dVar2.f12486aa = optJSONObject.optInt("ltorwc", 60);
                        dVar2.f12487ab = optJSONObject.optString(com.anythink.expressad.d.a.b.dI);
                        dVar2.am = optJSONObject.optInt("amount_max", 0);
                        dVar2.an = optJSONObject.optInt("callback_rule", 1);
                        dVar2.ao = optJSONObject.optString("virtual_currency", "");
                        dVar2.i(optJSONObject.optInt("amount", 1));
                        dVar2.aq = optJSONObject.optString("icon", "");
                        dVar2.ar = optJSONObject.optInt("currency_id", 1);
                        dVar2.g(optJSONObject.optString("name", "Virtual Item"));
                        dVar2.au = optJSONObject.optInt(b.aN, 1);
                        dVar2.av = optJSONObject.optInt(b.aO, 60);
                        return dVar2;
                    }
                    i10 = 0;
                    dVar2.Y = i10;
                    dVar2.f12490z = optJSONObject.optString("placementid");
                    dVar2.Z = optJSONObject.optInt("ltafemty", 10);
                    dVar2.f12486aa = optJSONObject.optInt("ltorwc", 60);
                    dVar2.f12487ab = optJSONObject.optString(com.anythink.expressad.d.a.b.dI);
                    dVar2.am = optJSONObject.optInt("amount_max", 0);
                    dVar2.an = optJSONObject.optInt("callback_rule", 1);
                    dVar2.ao = optJSONObject.optString("virtual_currency", "");
                    dVar2.i(optJSONObject.optInt("amount", 1));
                    dVar2.aq = optJSONObject.optString("icon", "");
                    dVar2.ar = optJSONObject.optInt("currency_id", 1);
                    dVar2.g(optJSONObject.optString("name", "Virtual Item"));
                    dVar2.au = optJSONObject.optInt(b.aN, 1);
                    dVar2.av = optJSONObject.optInt(b.aO, 60);
                    return dVar2;
                } catch (Exception e11) {
                    e = e11;
                    dVar = dVar2;
                    e.printStackTrace();
                    return dVar;
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return dVar;
    }

    public final void b(String str) {
        this.f12490z = str;
    }

    private void a(long j10) {
        this.B = j10;
    }

    public final void a(String str) {
        this.y = str;
    }

    public final void a(List<com.anythink.expressad.videocommon.c.b> list) {
        this.A = list;
    }

    public static d a(JSONObject jSONObject) {
        d dVar;
        int i10;
        d dVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            dVar = new d();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            dVar.A = com.anythink.expressad.videocommon.c.b.a(jSONObject.optJSONArray("adSourceList"));
            dVar.F = jSONObject.optInt(b.f12440g);
            int optInt = jSONObject.optInt("aqn", 1);
            if (optInt <= 0) {
                optInt = 1;
            }
            dVar.G = optInt;
            int optInt2 = jSONObject.optInt("acn", 1);
            if (optInt2 < 0) {
                optInt2 = 1;
            }
            dVar.H = optInt2;
            dVar.I = jSONObject.optInt("vcn", 5);
            dVar.J = jSONObject.optDouble("cbp", 1.0d);
            dVar.K = jSONObject.optInt("ttc_type", 2);
            dVar.L = jSONObject.optInt("offset", 5);
            dVar.M = jSONObject.optInt("dlnet", 2);
            dVar.al = jSONObject.optInt("endscreen_type", 2);
            dVar.N = jSONObject.optInt(b.J, 3);
            dVar.O = jSONObject.optInt(b.K, 80);
            dVar.P = jSONObject.optInt("ready_rate", 100);
            dVar.B = jSONObject.optLong("current_time");
            dVar.f12488ac = jSONObject.optInt("orientation", 0);
            dVar.ae = jSONObject.optInt(b.O, 0);
            dVar.af = jSONObject.optInt(b.P, -1);
            dVar.ag = jSONObject.optInt(b.Q, 2);
            dVar.ah = jSONObject.optInt(b.R, -1);
            dVar.ai = jSONObject.optInt(b.S, 1);
            dVar.C = jSONObject.optInt("playclosebtn_tm", -1);
            dVar.D = jSONObject.optInt("play_ctdown", 0);
            dVar.E = jSONObject.optInt("close_alert", 0);
            dVar.aj = jSONObject.optInt(b.I, 20);
            dVar.S = jSONObject.optInt(b.f12434ac, -1);
            dVar.R = jSONObject.optDouble(b.f12432aa, 1.0d);
            dVar.T = jSONObject.optInt(b.ar, 2);
            dVar.U = jSONObject.optDouble(b.as, 1.0d);
            dVar.f12489ad = jSONObject.optInt(b.aC, 70);
            JSONArray optJSONArray = jSONObject.optJSONArray(b.ao);
            ArrayList<Integer> arrayList = new ArrayList<>();
            try {
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        arrayList.add(Integer.valueOf(optJSONArray.getInt(i11)));
                    }
                } else {
                    arrayList.add(4);
                    arrayList.add(6);
                }
                dVar.V = arrayList;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            dVar.W = jSONObject.optInt(b.ap, 3);
            int optInt3 = jSONObject.optInt("tmorl", 1);
            if (optInt3 > 2 || optInt3 <= 0) {
                optInt3 = 1;
            }
            dVar.X = optInt3;
            if (dVar.J != 1.0d && new Random().nextDouble() > dVar.J) {
                i10 = 1;
                dVar.Y = i10;
                dVar.f12490z = jSONObject.optString("placementid");
                dVar.Z = jSONObject.optInt("ltafemty", 10);
                dVar.f12486aa = jSONObject.optInt("ltorwc", 60);
                dVar.f12487ab = jSONObject.optString(com.anythink.expressad.d.a.b.dI);
                dVar.am = jSONObject.optInt("amount_max", 0);
                dVar.an = jSONObject.optInt("callback_rule", 1);
                dVar.ao = jSONObject.optString("virtual_currency", "");
                dVar.i(jSONObject.optInt("amount", 1));
                dVar.aq = jSONObject.optString("icon", "");
                dVar.ar = jSONObject.optInt("currency_id", 1);
                dVar.g(jSONObject.optString("name", "Virtual Item"));
                dVar.au = jSONObject.optInt(b.aN, 1);
                dVar.av = jSONObject.optInt(b.aO, 60);
                return dVar;
            }
            i10 = 0;
            dVar.Y = i10;
            dVar.f12490z = jSONObject.optString("placementid");
            dVar.Z = jSONObject.optInt("ltafemty", 10);
            dVar.f12486aa = jSONObject.optInt("ltorwc", 60);
            dVar.f12487ab = jSONObject.optString(com.anythink.expressad.d.a.b.dI);
            dVar.am = jSONObject.optInt("amount_max", 0);
            dVar.an = jSONObject.optInt("callback_rule", 1);
            dVar.ao = jSONObject.optString("virtual_currency", "");
            dVar.i(jSONObject.optInt("amount", 1));
            dVar.aq = jSONObject.optString("icon", "");
            dVar.ar = jSONObject.optInt("currency_id", 1);
            dVar.g(jSONObject.optString("name", "Virtual Item"));
            dVar.au = jSONObject.optInt(b.aN, 1);
            dVar.av = jSONObject.optInt(b.aO, 60);
            return dVar;
        } catch (Exception e12) {
            e = e12;
            dVar2 = dVar;
            e.printStackTrace();
            return dVar2;
        }
    }
}
