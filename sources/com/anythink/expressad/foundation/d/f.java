package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9568a = "cid";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9569b = "click_type";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9570c = "network_type";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9571d = "network_str";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9572e = "click_duration";
    public static final String f = "last_url";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9573g = "type";

    /* renamed from: h, reason: collision with root package name */
    public static final String f9574h = "code";

    /* renamed from: i, reason: collision with root package name */
    public static final String f9575i = "exception";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9576j = "header";

    /* renamed from: k, reason: collision with root package name */
    public static final String f9577k = "content";

    /* renamed from: l, reason: collision with root package name */
    public static final String f9578l = "network_type";

    /* renamed from: m, reason: collision with root package name */
    public static final String f9579m = "rid";

    /* renamed from: n, reason: collision with root package name */
    public static final String f9580n = "key";
    public static final String o = "rid_n";

    /* renamed from: p, reason: collision with root package name */
    public static final String f9581p = "unit_id";

    /* renamed from: q, reason: collision with root package name */
    public static final String f9582q = "landing_type";

    /* renamed from: r, reason: collision with root package name */
    public static final String f9583r = "link_type";

    /* renamed from: s, reason: collision with root package name */
    public static final String f9584s = "click_time";

    /* renamed from: t, reason: collision with root package name */
    public static final String f9585t = "market_result";

    /* renamed from: u, reason: collision with root package name */
    public static final String f9586u = "2000013";

    /* renamed from: v, reason: collision with root package name */
    public static final String f9587v = "2000012";
    private String A;
    private int B;
    private String C;
    private String D;
    private String E;
    private int F;
    private int G;
    private String H;
    private int I;
    private int J;
    private String K;
    private int L;
    private String M;
    private int N;

    /* renamed from: w, reason: collision with root package name */
    private int f9588w;

    /* renamed from: x, reason: collision with root package name */
    private String f9589x;
    private String y;

    /* renamed from: z, reason: collision with root package name */
    private String f9590z;

    public f() {
    }

    private int b() {
        return this.N;
    }

    private int c() {
        return this.L;
    }

    private String d() {
        return this.M;
    }

    private void e(int i10) {
        this.N = i10;
    }

    private void f(int i10) {
        this.L = i10;
    }

    private int g() {
        return this.J;
    }

    private String h() {
        return this.K;
    }

    private int i() {
        return this.G;
    }

    private void j(String str) {
        this.M = str;
    }

    private int k() {
        return this.B;
    }

    private String l() {
        return this.D;
    }

    private String m() {
        return this.E;
    }

    private int n() {
        return this.F;
    }

    private String o() {
        return this.A;
    }

    private String p() {
        return this.y;
    }

    private String q() {
        return this.f9590z;
    }

    private int r() {
        return this.f9588w;
    }

    private String s() {
        return this.f9589x;
    }

    public final void a(String str) {
        this.H = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickTime [campaignId=");
        sb2.append(this.y);
        sb2.append(", click_duration=");
        sb2.append(this.f9590z);
        sb2.append(", lastUrl=");
        sb2.append(this.A);
        sb2.append(", code=");
        sb2.append(this.B);
        sb2.append(", excepiton=");
        sb2.append(this.C);
        sb2.append(", header=");
        sb2.append(this.D);
        sb2.append(", content=");
        sb2.append(this.E);
        sb2.append(", type=");
        sb2.append(this.F);
        sb2.append(", click_type=");
        return com.ironsource.adapters.facebook.a.i(sb2, this.G, "]");
    }

    private f(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, int i11, int i12, String str8, int i13, int i14, String str9, int i15, int i16, String str10) {
        this.f9589x = str;
        this.y = str2;
        this.f9590z = str3;
        this.A = str4;
        this.B = i10;
        this.C = str5;
        this.D = str6;
        this.E = str7;
        this.F = i11;
        this.G = i12;
        this.H = str8;
        this.I = i13;
        this.J = i14;
        this.K = str9;
        this.L = i15;
        this.M = str10;
        this.N = i16;
    }

    private String e() {
        return this.H;
    }

    private int f() {
        return this.I;
    }

    private String j() {
        return this.C;
    }

    public final void a(int i10) {
        this.I = i10;
    }

    public final void b(int i10) {
        this.J = i10;
    }

    public final void c(String str) {
        this.C = str;
    }

    public final void d(String str) {
        this.D = str;
    }

    public final void g(String str) {
        this.y = str;
    }

    public final void h(String str) {
        this.f9590z = str;
    }

    public final void i(String str) {
        this.f9589x = str;
    }

    private void g(int i10) {
        this.f9588w = i10;
    }

    public final void a() {
        this.G = 1;
    }

    public final void b(String str) {
        this.K = str;
    }

    public final void c(int i10) {
        this.B = i10;
    }

    public final void d(int i10) {
        this.F = i10;
    }

    public final void e(String str) {
        this.E = str;
    }

    public final void f(String str) {
        this.A = str;
    }

    public static String a(List<f> list) {
        if (list.size() <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (f fVar : list) {
            sb2.append("rid_n=" + fVar.f9589x);
            sb2.append("&cid=" + fVar.y);
            sb2.append("&click_type=" + fVar.G);
            sb2.append("&type=" + fVar.F);
            sb2.append("&click_duration=" + fVar.f9590z);
            sb2.append("&key=2000013");
            sb2.append("&unit_id=" + fVar.H);
            sb2.append("&last_url=" + fVar.A);
            sb2.append("&content=" + fVar.E);
            sb2.append("&code=" + fVar.B);
            sb2.append("&exception=" + fVar.C);
            sb2.append("&header=" + fVar.D);
            sb2.append("&landing_type=" + fVar.I);
            sb2.append("&link_type=" + fVar.J);
            sb2.append("&click_time=" + fVar.K + "\n");
        }
        return sb2.toString();
    }

    private static String a(f fVar) {
        if (fVar == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = fVar.A;
        sb2.append("rid_n=" + fVar.f9589x);
        sb2.append("&click_type=" + fVar.G);
        sb2.append("&type=" + fVar.F);
        sb2.append("&cid=" + fVar.y);
        sb2.append("&click_duration=" + fVar.f9590z);
        sb2.append("&key=2000012");
        sb2.append("&unit_id=" + fVar.H);
        sb2.append("&last_url=".concat(String.valueOf(str)));
        sb2.append("&code=" + fVar.B);
        sb2.append("&exception=" + fVar.C);
        sb2.append("&landing_type=" + fVar.I);
        sb2.append("&link_type=" + fVar.J);
        sb2.append("&click_time=" + fVar.K + "\n");
        return sb2.toString();
    }
}
