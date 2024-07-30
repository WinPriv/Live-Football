package com.anythink.core.common.e;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.e.k;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i<T extends k> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5632c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5633d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5634e = 3;
    public static final int f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5635g = 10;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5636w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5637x = 2;
    protected String A;
    protected int B;
    protected String C;
    protected String D;
    protected String E;
    protected String F;
    protected String G;
    protected String H;
    protected Bitmap I;
    protected k J;
    protected String K;
    protected String L;
    protected int M;
    protected String N;
    protected String O;
    protected String P;
    protected String Q;

    /* renamed from: h, reason: collision with root package name */
    protected String f5638h;

    /* renamed from: i, reason: collision with root package name */
    protected String f5639i;

    /* renamed from: j, reason: collision with root package name */
    protected String f5640j;

    /* renamed from: k, reason: collision with root package name */
    protected String f5641k;

    /* renamed from: l, reason: collision with root package name */
    protected String f5642l;

    /* renamed from: m, reason: collision with root package name */
    protected String f5643m;

    /* renamed from: n, reason: collision with root package name */
    protected String f5644n;
    protected String o;

    /* renamed from: p, reason: collision with root package name */
    protected String f5645p;

    /* renamed from: q, reason: collision with root package name */
    protected String f5646q;

    /* renamed from: r, reason: collision with root package name */
    protected String f5647r;

    /* renamed from: s, reason: collision with root package name */
    protected String f5648s;

    /* renamed from: t, reason: collision with root package name */
    protected String f5649t;

    /* renamed from: u, reason: collision with root package name */
    protected String f5650u;

    /* renamed from: v, reason: collision with root package name */
    protected int f5651v;
    protected int y;

    /* renamed from: z, reason: collision with root package name */
    protected int f5652z;

    private String N() {
        return this.A;
    }

    private int a() {
        return this.M;
    }

    public final String A() {
        return this.f5649t;
    }

    public final String B() {
        return this.f5650u;
    }

    public final int C() {
        return this.f5651v;
    }

    public final int D() {
        return this.y;
    }

    public final boolean E() {
        if (!TextUtils.isEmpty(this.f5646q)) {
            return true;
        }
        return false;
    }

    public final String F() {
        return this.D;
    }

    public final String G() {
        return this.E;
    }

    public final String H() {
        return this.F;
    }

    public final String I() {
        return this.G;
    }

    public final Bitmap J() {
        return this.I;
    }

    public final boolean K() {
        if (!TextUtils.isEmpty(this.E) && !TextUtils.isEmpty(this.D) && !TextUtils.isEmpty(this.F) && !TextUtils.isEmpty(this.G)) {
            return true;
        }
        return false;
    }

    public boolean L() {
        return false;
    }

    public final String M() {
        return this.L;
    }

    public abstract List<String> b(T t10);

    public final void b(int i10) {
        this.M = i10;
    }

    public final void c(String str) {
        this.P = str;
    }

    public abstract int d();

    public final void d(String str) {
        this.Q = str;
    }

    public final String e() {
        return this.P;
    }

    public final String f() {
        return this.Q;
    }

    public final boolean g() {
        return this.M == 1;
    }

    public final String h() {
        return this.N;
    }

    public final String i() {
        return this.O;
    }

    public final String j() {
        return this.K;
    }

    public final k k() {
        return this.J;
    }

    public final String l() {
        return this.H;
    }

    public abstract String m();

    public final void m(String str) {
        this.f5641k = str;
    }

    public final int n() {
        return this.B;
    }

    public final String o() {
        return this.C;
    }

    public final String p() {
        return this.f5638h;
    }

    public final String q() {
        return this.f5639i;
    }

    public final String r() {
        return this.f5640j;
    }

    public final String s() {
        return this.f5641k;
    }

    public final String t() {
        return this.f5642l;
    }

    public final String u() {
        return this.f5644n;
    }

    public final String v() {
        return this.o;
    }

    public final String w() {
        return this.f5645p;
    }

    public final String x() {
        return this.f5646q;
    }

    public final String y() {
        return this.f5647r;
    }

    public final String z() {
        return this.f5648s;
    }

    private String b() {
        return this.f5643m;
    }

    public final void A(String str) {
        this.F = str;
    }

    public final void B(String str) {
        this.G = str;
    }

    public final void C(String str) {
        this.L = str;
    }

    public final boolean D(String str) {
        return TextUtils.equals(this.f5646q, str) && !TextUtils.isEmpty(str);
    }

    public final void a(k kVar) {
        this.J = kVar;
    }

    public final void c(int i10) {
        this.B = i10;
    }

    public final void d(int i10) {
        this.f5651v = i10;
    }

    public final void e(String str) {
        this.N = str;
    }

    public final void f(String str) {
        this.O = str;
    }

    public final void g(String str) {
        this.K = str;
    }

    public final void h(String str) {
        this.H = str;
    }

    public final void i(String str) {
        this.C = str;
    }

    public final void j(String str) {
        this.f5638h = str;
    }

    public final void k(String str) {
        this.f5639i = str;
    }

    public final void l(String str) {
        this.f5640j = str;
    }

    public final void n(String str) {
        this.f5642l = str;
    }

    public final void o(String str) {
        this.f5643m = str;
    }

    public final void p(String str) {
        this.f5644n = str;
    }

    public final void q(String str) {
        this.o = str;
    }

    public final void r(String str) {
        this.f5645p = str;
    }

    public final void s(String str) {
        this.f5646q = str;
    }

    public final void t(String str) {
        this.f5647r = str;
    }

    public final void u(String str) {
        this.f5648s = str;
    }

    public final void v(String str) {
        this.f5649t = str;
    }

    public final void w(String str) {
        this.f5650u = str;
    }

    public final void x(String str) {
        this.A = str;
    }

    public final void y(String str) {
        this.D = str;
    }

    public final void z(String str) {
        this.E = str;
    }

    private int c() {
        return this.f5652z;
    }

    public final void a(Bitmap bitmap) {
        this.I = bitmap;
    }

    public final void e(int i10) {
        this.y = i10;
    }

    public final void f(int i10) {
        this.f5652z = i10;
    }
}
