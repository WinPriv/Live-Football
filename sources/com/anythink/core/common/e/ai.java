package com.anythink.core.common.e;

import com.anythink.core.api.ATAdConst;

/* loaded from: classes.dex */
public class ai implements Comparable<ai> {
    private String A;
    private int B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private String H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int O;
    private int P;
    private String Q;
    private long R;
    private long S;
    private double T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a, reason: collision with root package name */
    int f5485a;

    /* renamed from: aa, reason: collision with root package name */
    private m f5486aa;

    /* renamed from: ab, reason: collision with root package name */
    private int f5487ab;

    /* renamed from: ac, reason: collision with root package name */
    private int f5488ac;

    /* renamed from: ad, reason: collision with root package name */
    private String f5489ad;
    private int ae;
    private int af;

    /* renamed from: c, reason: collision with root package name */
    int f5491c;

    /* renamed from: d, reason: collision with root package name */
    int f5492d;

    /* renamed from: e, reason: collision with root package name */
    String f5493e;
    int f;

    /* renamed from: g, reason: collision with root package name */
    int f5494g;

    /* renamed from: h, reason: collision with root package name */
    double f5495h;

    /* renamed from: i, reason: collision with root package name */
    int f5496i;

    /* renamed from: j, reason: collision with root package name */
    double f5497j;

    /* renamed from: k, reason: collision with root package name */
    String f5498k;

    /* renamed from: l, reason: collision with root package name */
    boolean f5499l;

    /* renamed from: m, reason: collision with root package name */
    private int f5500m;

    /* renamed from: n, reason: collision with root package name */
    private String f5501n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f5502p;

    /* renamed from: q, reason: collision with root package name */
    private String f5503q;

    /* renamed from: r, reason: collision with root package name */
    private String f5504r;

    /* renamed from: s, reason: collision with root package name */
    private String f5505s;

    /* renamed from: t, reason: collision with root package name */
    private long f5506t;

    /* renamed from: u, reason: collision with root package name */
    private String f5507u;

    /* renamed from: v, reason: collision with root package name */
    private int f5508v;

    /* renamed from: w, reason: collision with root package name */
    private int f5509w;

    /* renamed from: x, reason: collision with root package name */
    private double f5510x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private String f5511z;

    /* renamed from: b, reason: collision with root package name */
    int f5490b = 0;
    private int ag = -1;
    private ATAdConst.CURRENCY ah = ATAdConst.CURRENCY.USD;

    private long ak() {
        return this.I;
    }

    public final long A() {
        return this.J;
    }

    public final long B() {
        return this.K;
    }

    public final int C() {
        return this.M;
    }

    public final int D() {
        return this.N;
    }

    public final int E() {
        return this.O;
    }

    public final int F() {
        return this.P;
    }

    public final String G() {
        return this.Q;
    }

    public final long H() {
        return this.R;
    }

    public final long I() {
        return this.S;
    }

    public final double J() {
        return this.T;
    }

    public final int K() {
        return this.U;
    }

    public final int L() {
        return this.V;
    }

    public final boolean M() {
        if (this.W == 2) {
            return true;
        }
        return false;
    }

    public final m N() {
        return this.f5486aa;
    }

    public final int O() {
        return this.f5487ab;
    }

    public final int P() {
        return this.f5488ac;
    }

    public final void Q() {
        this.f5488ac = 1;
    }

    public final String R() {
        return this.f5489ad;
    }

    public final int S() {
        return this.af;
    }

    public final int T() {
        int i10 = this.f5490b;
        if (i10 <= 0) {
            return 1;
        }
        return i10;
    }

    public final int U() {
        return this.f5491c;
    }

    public final int V() {
        return this.f5492d;
    }

    public final String W() {
        return this.f5493e;
    }

    public final int X() {
        return this.f5485a;
    }

    public final int Y() {
        return this.ag;
    }

    public final int Z() {
        int i10;
        m mVar = this.f5486aa;
        if (mVar != null && (i10 = mVar.f5702n) != 0) {
            return i10;
        }
        return this.f;
    }

    public final int a() {
        return this.Y;
    }

    public final boolean aa() {
        if (this.f5500m == 1 && this.Z == 1) {
            return true;
        }
        return false;
    }

    public final String ab() {
        return "networkFirmId: " + this.f5500m + ", adSourceId: " + this.H + ", content: " + this.f5503q + ", price: " + this.f5510x + ", sortPrice: " + this.f5497j;
    }

    public final int ac() {
        return this.ae;
    }

    public final ATAdConst.CURRENCY ad() {
        return this.ah;
    }

    public final int ae() {
        return this.f5494g;
    }

    public final int af() {
        return this.f5496i;
    }

    public final double ag() {
        return this.f5497j;
    }

    public final String ah() {
        return this.f5498k;
    }

    public final boolean ai() {
        return this.f5499l;
    }

    public final void aj() {
        this.f5499l = true;
    }

    public final void b() {
        this.Y = -1;
    }

    public final int c() {
        return this.f5500m;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(ai aiVar) {
        if (com.anythink.core.common.k.g.a(this) > com.anythink.core.common.k.g.a(aiVar)) {
            return -1;
        }
        return 1;
    }

    public final String d() {
        return this.f5501n;
    }

    public final int e() {
        return this.o;
    }

    public final int f() {
        return this.f5502p;
    }

    public final String g() {
        return this.f5503q;
    }

    public final String h() {
        return this.f5504r;
    }

    public final int i() {
        return this.y;
    }

    public final boolean j() {
        return this.y == 1;
    }

    public final long k() {
        return this.D;
    }

    public final int l() {
        return this.Z;
    }

    public final int m() {
        return this.X;
    }

    public final long n() {
        return this.L;
    }

    public final int o() {
        return this.B;
    }

    public final long p() {
        return this.E;
    }

    public final long q() {
        return this.F;
    }

    public final int r() {
        return this.G;
    }

    public final long s() {
        return this.f5506t;
    }

    public final String t() {
        return this.H;
    }

    public final String u() {
        return this.f5507u;
    }

    public final int v() {
        return this.f5508v;
    }

    public final int w() {
        return this.f5509w;
    }

    public final double x() {
        return this.f5510x;
    }

    public final String y() {
        return this.f5511z;
    }

    public final String z() {
        return this.A;
    }

    private void B(int i10) {
        this.f5487ab = i10;
    }

    public final void A(int i10) {
        this.f5496i = i10;
    }

    public final void a(int i10) {
        this.f5500m = i10;
    }

    public final void b(int i10) {
        this.o = i10;
    }

    public final void c(int i10) {
        this.f5502p = i10;
    }

    public final void d(String str) {
        this.f5505s = str;
    }

    public final void e(int i10) {
        this.Z = i10;
    }

    public final void f(int i10) {
        this.X = i10;
    }

    public final void g(int i10) {
        this.B = i10;
    }

    public final void h(int i10) {
        this.G = i10;
    }

    public final void i(int i10) {
        this.f5508v = i10;
    }

    public final void j(int i10) {
        this.f5509w = i10;
    }

    public final void k(int i10) {
        this.M = i10;
    }

    public final void l(int i10) {
        this.N = i10;
    }

    public final void m(int i10) {
        this.O = i10;
    }

    public final void n(int i10) {
        this.P = i10;
    }

    public final void o(int i10) {
        this.U = i10;
    }

    public final void p(int i10) {
        this.V = i10;
    }

    public final void q(int i10) {
        this.W = i10;
    }

    public final void r(int i10) {
        this.af = i10;
    }

    public final void s(int i10) {
        this.f5490b = i10;
    }

    public final void t(int i10) {
        this.f5491c = i10;
    }

    public final void u(int i10) {
        this.f5492d = i10;
    }

    public final void v(int i10) {
        this.f5485a = i10;
    }

    public final void w(int i10) {
        this.ag = i10;
    }

    public final void x(int i10) {
        this.f = i10;
    }

    public final void y(int i10) {
        this.ae = i10;
    }

    public final void z(int i10) {
        this.f5494g = i10;
    }

    private void l(String str) {
        this.f5489ad = str;
    }

    public final void a(String str) {
        this.f5501n = str;
    }

    public final void b(String str) {
        this.f5503q = str;
    }

    public final void c(String str) {
        this.f5504r = str;
    }

    public final void d(int i10) {
        this.y = i10;
    }

    public final void e(long j10) {
        this.f5506t = j10;
    }

    public final void f(String str) {
        this.f5507u = str;
    }

    public final void g(String str) {
        this.f5511z = str;
    }

    public final void h(String str) {
        this.A = str;
    }

    public final void i(String str) {
        this.Q = str;
    }

    public final void j(long j10) {
        this.S = j10;
    }

    public final void k(String str) {
        this.f5498k = str;
    }

    public final void a(long j10) {
        this.D = j10;
    }

    public final void b(long j10) {
        this.L = j10;
    }

    public final void c(long j10) {
        this.E = j10;
    }

    public final void d(long j10) {
        this.F = j10;
    }

    public final void e(String str) {
        this.H = str;
    }

    public final void f(long j10) {
        this.I = j10;
    }

    public final void g(long j10) {
        this.J = j10;
    }

    public final void h(long j10) {
        this.K = j10;
    }

    public final void i(long j10) {
        this.R = j10;
    }

    public final void j(String str) {
        this.f5493e = str;
    }

    public final void a(double d10) {
        this.f5510x = d10;
    }

    public final void b(double d10) {
        this.T = d10;
    }

    public final void c(double d10) {
        this.f5495h = d10;
    }

    public final void d(double d10) {
        this.f5497j = d10;
    }

    private void a(m mVar) {
        this.f5486aa = mVar;
    }

    private int a(ai aiVar) {
        return com.anythink.core.common.k.g.a(this) > com.anythink.core.common.k.g.a(aiVar) ? -1 : 1;
    }

    public final synchronized void a(ai aiVar, int i10, int i11, int i12) {
        if (aiVar.H.equals(this.H)) {
            this.f5510x = aiVar.f5510x;
            this.f5497j = aiVar.f5497j;
            this.B = i11;
            this.f5511z = aiVar.f5511z;
            this.f5489ad = aiVar.f5489ad;
            this.Y = 0;
            if (i10 == 0) {
                this.f5487ab = aiVar.f5487ab;
            } else {
                this.f5487ab = i10;
            }
            this.A = aiVar.A;
            this.f5486aa = aiVar.f5486aa;
            this.f5488ac = i12;
        }
    }

    public final void a(ATAdConst.CURRENCY currency) {
        this.ah = currency;
    }

    public final double a(com.anythink.core.c.d dVar) {
        double d10 = this.f5495h;
        if (d10 > 0.0d) {
            return d10;
        }
        if (dVar != null) {
            double as = dVar.as();
            if (as > 0.0d) {
                return as;
            }
        }
        double d11 = this.f5495h;
        if (d11 > 0.0d) {
            return d11;
        }
        return 0.0d;
    }

    public final void a(m mVar, int i10, int i11, int i12) {
        this.B = i11;
        this.f5510x = mVar.getPrice();
        this.f5497j = mVar.getSortPrice();
        this.f5511z = mVar.token;
        this.f5489ad = mVar.f5701m;
        this.Y = 0;
        this.f5487ab = i10;
        this.f5486aa = mVar;
        this.f5488ac = i12;
        if (i12 == 1) {
            this.A = "";
        }
    }
}
