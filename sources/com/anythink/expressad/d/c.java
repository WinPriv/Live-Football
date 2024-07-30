package com.anythink.expressad.d;

import a3.l;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7207a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7208b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7209c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7210d = 3;
    private String A;
    private int B;
    private long C;
    private long D;
    private int F;
    private int G;
    private int H;
    private int N;
    private int P;
    private int Q;

    /* renamed from: e, reason: collision with root package name */
    private int f7211e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f7212g;

    /* renamed from: i, reason: collision with root package name */
    private String f7214i;

    /* renamed from: j, reason: collision with root package name */
    private String f7215j;

    /* renamed from: k, reason: collision with root package name */
    private List<Integer> f7216k;

    /* renamed from: l, reason: collision with root package name */
    private long f7217l;

    /* renamed from: n, reason: collision with root package name */
    private int f7219n;
    private List<Integer> o;

    /* renamed from: p, reason: collision with root package name */
    private int f7220p;

    /* renamed from: q, reason: collision with root package name */
    private int f7221q;

    /* renamed from: r, reason: collision with root package name */
    private int f7222r;

    /* renamed from: s, reason: collision with root package name */
    private int f7223s;

    /* renamed from: t, reason: collision with root package name */
    private String f7224t;

    /* renamed from: u, reason: collision with root package name */
    private int f7225u;

    /* renamed from: x, reason: collision with root package name */
    private int f7228x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private long f7229z;

    /* renamed from: h, reason: collision with root package name */
    private int f7213h = 30;

    /* renamed from: m, reason: collision with root package name */
    private int f7218m = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f7226v = 1;

    /* renamed from: w, reason: collision with root package name */
    private int f7227w = 5000;
    private int E = 60;
    private String I = "";
    private int J = 10;
    private int K = 60;
    private double L = 1.0d;
    private int M = 1;
    private int O = 0;

    private int A() {
        return this.H;
    }

    private int B() {
        return this.M;
    }

    private int C() {
        return this.Q;
    }

    private String D() {
        return this.f7224t;
    }

    private int E() {
        return this.f7225u;
    }

    private int F() {
        return this.P;
    }

    private long G() {
        return this.C;
    }

    private long H() {
        return this.D;
    }

    private String I() {
        return this.A;
    }

    private int J() {
        return this.B;
    }

    private int K() {
        return this.f7211e;
    }

    private int L() {
        return this.f;
    }

    private int M() {
        return this.f7212g;
    }

    private int N() {
        int i10 = this.f7213h;
        if (i10 <= 0 || i10 > 100) {
            this.f7213h = 30;
        }
        return this.f7213h;
    }

    private static c O() {
        return new c();
    }

    private int P() {
        return this.f7223s;
    }

    private int Q() {
        return this.f7226v;
    }

    private int R() {
        return this.f7227w;
    }

    private int S() {
        return this.f7220p;
    }

    private int T() {
        return this.f7221q;
    }

    private int U() {
        return this.f7222r;
    }

    private String V() {
        return this.f7214i;
    }

    private List<Integer> W() {
        return this.f7216k;
    }

    private List<Integer> X() {
        return this.o;
    }

    private long Y() {
        return this.f7217l;
    }

    private int Z() {
        return this.f7219n;
    }

    private String aa() {
        return this.I;
    }

    private int ab() {
        return this.J;
    }

    private int ac() {
        return this.K;
    }

    private void e(int i10) {
        this.M = i10;
    }

    private void f(int i10) {
        this.F = i10;
    }

    private void g(int i10) {
        this.f7225u = i10;
    }

    public static c y() {
        c cVar = new c();
        cVar.f7228x = 0;
        return cVar;
    }

    private int z() {
        return this.G;
    }

    public final double a() {
        return this.L;
    }

    public final void b(int i10) {
        this.H = i10;
    }

    public final void c() {
        this.E = 60;
    }

    public final int d() {
        return this.F;
    }

    public final void h() {
        this.P = 1;
    }

    public final long i() {
        return this.f7229z;
    }

    public final void j() {
        this.y = 2;
    }

    public final int k() {
        return this.f7228x;
    }

    public final void l() {
        this.f7228x = 1;
    }

    public final int m() {
        return this.y;
    }

    public final void n() {
        this.f7229z = com.anythink.expressad.d.a.b.P;
    }

    public final void o() {
        this.f7223s = 5;
    }

    public final void p() {
        this.f7220p = 1;
    }

    public final void q() {
        this.f7221q = -2;
    }

    public final void r() {
        this.f7222r = -2;
    }

    public final JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f7216k;
            if (list != null && list.size() > 0) {
                int size = this.f7216k.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(this.f7216k.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.o;
            if (list2 != null && list2.size() > 0) {
                int size2 = this.o.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(this.o.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put(com.anythink.expressad.d.a.b.J, this.f7220p);
            jSONObject.put("aqn", this.f7221q);
            jSONObject.put("acn", this.f7222r);
            jSONObject.put(com.anythink.expressad.d.a.b.R, this.f7223s);
            jSONObject.put("current_time", this.f7217l);
            jSONObject.put("offset", this.f7218m);
            jSONObject.put("dlct", this.f7229z);
            jSONObject.put(com.anythink.expressad.d.a.b.aX, this.f7228x);
            jSONObject.put("dlnet", this.y);
            jSONObject.put(com.anythink.expressad.d.a.b.aL, this.A);
            jSONObject.put(com.anythink.expressad.d.a.b.aM, this.B);
            jSONObject.put(com.anythink.expressad.d.a.b.aN, this.C);
            jSONObject.put(com.anythink.expressad.d.a.b.aO, this.D);
            jSONObject.put("ready_rate", this.N);
            jSONObject.put("content", this.P);
            jSONObject.put(com.anythink.expressad.d.a.b.bC, this.Q);
            jSONObject.put(com.anythink.expressad.d.a.b.cf, this.f7225u);
            jSONObject.put(com.anythink.expressad.d.a.b.f7154cd, this.f7224t);
            jSONObject.put("playclosebtn_tm", this.f7211e);
            jSONObject.put("play_ctdown", this.f);
            jSONObject.put("close_alert", this.f7212g);
            jSONObject.put(com.anythink.expressad.d.a.b.f7160dd, this.F);
            jSONObject.put(com.anythink.expressad.d.a.b.f7158db, this.E);
            jSONObject.put("countdown", this.H);
            jSONObject.put(com.anythink.expressad.d.a.b.dm, this.G);
            jSONObject.put("tmorl", this.M);
            jSONObject.put("unitId", this.f7214i);
            jSONObject.put("placementid", this.I);
            jSONObject.put("ltafemty", this.J);
            jSONObject.put("ltorwc", this.K);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public final int t() {
        return this.f7218m;
    }

    public final String toString() {
        List<Integer> list = this.f7216k;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f7216k.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb2 = new StringBuilder("offset = ");
        sb2.append(this.f7218m);
        sb2.append(" unitId = ");
        sb2.append(this.f7214i);
        sb2.append(" fbPlacementId = ");
        return l.p(sb2, this.f7215j, str);
    }

    public final void u() {
        this.f7218m = 1;
    }

    public final void v() {
        this.f7219n = 2;
    }

    public final void w() {
        this.J = 10;
    }

    public final void x() {
        this.K = 60;
    }

    private void a(double d10) {
        this.L = d10;
    }

    private void f(String str) {
        this.f7224t = str;
    }

    private void h(int i10) {
        this.B = i10;
    }

    private void i(int i10) {
        this.f7211e = i10;
    }

    private void j(int i10) {
        this.f = i10;
    }

    private void k(int i10) {
        this.f7212g = i10;
    }

    private void l(int i10) {
        this.f7213h = i10;
    }

    private void m(int i10) {
        this.f7226v = i10;
    }

    private void n(int i10) {
        this.f7227w = i10;
    }

    public final int b() {
        return this.E;
    }

    public final void c(int i10) {
        try {
            this.N = i10;
        } catch (Exception unused) {
            this.N = 100;
        }
    }

    public final void d(int i10) {
        try {
            this.O = i10;
        } catch (Exception unused) {
            this.O = 0;
        }
    }

    public final void e() {
        this.Q = 0;
    }

    public final int g() {
        return this.O;
    }

    private void b(long j10) {
        this.D = j10;
    }

    private void g(String str) {
        this.A = str;
    }

    public final void a(int i10) {
        this.G = i10;
    }

    public final void e(String str) {
        this.I = str;
    }

    public final int f() {
        return this.N;
    }

    private void a(long j10) {
        this.C = j10;
    }

    private void c(long j10) {
        this.f7217l = j10;
    }

    public static c d(String str) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            cVar.f7216k = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            cVar.o = arrayList2;
            cVar.f7214i = str;
            cVar.f7218m = 1;
            cVar.f7220p = 1;
            cVar.f7222r = -2;
            cVar.f7221q = -2;
            cVar.f7223s = 5;
            cVar.f7229z = com.anythink.expressad.d.a.b.P;
            cVar.y = 2;
            cVar.f7228x = 3;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return cVar;
    }

    public final void b(List<Integer> list) {
        this.o = list;
    }

    public static c b(String str) {
        c cVar = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            c cVar2 = new c();
            try {
                JSONObject jSONObject = new JSONObject(str);
                cVar2.f7214i = jSONObject.optString("unitId");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i10)));
                    }
                    cVar2.f7216k = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i11)));
                    }
                    cVar2.o = arrayList2;
                }
                cVar2.f7220p = jSONObject.optInt(com.anythink.expressad.d.a.b.J);
                cVar2.f7221q = jSONObject.optInt("aqn");
                cVar2.f7222r = jSONObject.optInt("acn");
                cVar2.f7223s = jSONObject.optInt(com.anythink.expressad.d.a.b.R);
                int i12 = 1;
                cVar2.f7226v = jSONObject.optInt(com.anythink.expressad.d.a.b.S, 1);
                cVar2.f7227w = jSONObject.optInt(com.anythink.expressad.d.a.b.T, 5000);
                cVar2.f7217l = jSONObject.optLong("current_time");
                cVar2.f7218m = jSONObject.optInt("offset");
                cVar2.f7229z = jSONObject.optLong("dlct", com.anythink.expressad.d.a.b.P);
                cVar2.f7228x = jSONObject.optInt(com.anythink.expressad.d.a.b.aX, 0);
                cVar2.y = jSONObject.optInt("dlnet", 2);
                cVar2.A = jSONObject.optString(com.anythink.expressad.d.a.b.aL);
                cVar2.B = jSONObject.optInt(com.anythink.expressad.d.a.b.aM);
                cVar2.C = jSONObject.optLong(com.anythink.expressad.d.a.b.aN, com.anythink.expressad.d.a.b.aT);
                cVar2.D = jSONObject.optLong(com.anythink.expressad.d.a.b.aO, 300L);
                cVar2.c(jSONObject.optInt("ready_rate", 100));
                cVar2.d(jSONObject.optInt("cd_rate", 0));
                cVar2.P = jSONObject.optInt("content", 1);
                cVar2.Q = jSONObject.optInt(com.anythink.expressad.d.a.b.bC, 0);
                cVar2.f7225u = jSONObject.optInt(com.anythink.expressad.d.a.b.cf, 1);
                cVar2.f7224t = jSONObject.optString(com.anythink.expressad.d.a.b.f7154cd, "");
                cVar2.f7211e = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f = jSONObject.optInt("play_ctdown", 0);
                cVar2.f7212g = jSONObject.optInt("close_alert", 0);
                cVar2.f7213h = jSONObject.optInt(com.anythink.expressad.d.a.b.cr, 30);
                cVar2.E = jSONObject.optInt(com.anythink.expressad.d.a.b.f7158db, 60);
                cVar2.F = jSONObject.optInt(com.anythink.expressad.d.a.b.f7160dd, 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i12 = optInt;
                }
                cVar2.M = i12;
                cVar2.I = jSONObject.optString("placementid", "");
                cVar2.J = jSONObject.optInt("ltafemty", 10);
                cVar2.K = jSONObject.optInt("ltorwc", 60);
                return cVar2;
            } catch (Exception e10) {
                e = e10;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static c c(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.f7218m = 1;
        cVar.f7214i = str;
        cVar.f7216k = arrayList;
        cVar.o = arrayList2;
        cVar.f7220p = 1;
        cVar.f7222r = -2;
        cVar.f7221q = -2;
        cVar.f7223s = 5;
        cVar.f7229z = com.anythink.expressad.d.a.b.P;
        cVar.y = 2;
        cVar.f7228x = 1;
        cVar.c(100);
        cVar.d(0);
        cVar.P = 1;
        cVar.Q = 0;
        cVar.E = 60;
        cVar.J = 10;
        cVar.K = 60;
        return cVar;
    }

    public final void a(String str) {
        this.f7214i = str;
    }

    public final void a(List<Integer> list) {
        this.f7216k = list;
    }

    private Queue<Integer> d(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        try {
            List<Integer> list2 = this.f7216k;
            if (list2 != null && list2.size() > 0) {
                for (Integer num : list) {
                    if (num != null) {
                        linkedList.add(Integer.valueOf(num.intValue() * 1000));
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return linkedList;
    }

    private static Queue<Integer> c(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Integer num : list) {
                        if (num != null) {
                            linkedList.add(num);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return linkedList;
    }
}
