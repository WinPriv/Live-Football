package com.applovin.exoplayer2.i.g;

import android.text.Layout;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f15781a;

    /* renamed from: b, reason: collision with root package name */
    private int f15782b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15783c;

    /* renamed from: d, reason: collision with root package name */
    private int f15784d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15785e;

    /* renamed from: k, reason: collision with root package name */
    private float f15790k;

    /* renamed from: l, reason: collision with root package name */
    private String f15791l;
    private Layout.Alignment o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f15794p;

    /* renamed from: r, reason: collision with root package name */
    private b f15796r;
    private int f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f15786g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f15787h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f15788i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f15789j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f15792m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f15793n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f15795q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f15797s = Float.MAX_VALUE;

    public int a() {
        int i10 = this.f15787h;
        if (i10 == -1 && this.f15788i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f15788i == 1 ? 2 : 0);
    }

    public boolean b() {
        return this.f == 1;
    }

    public boolean c() {
        return this.f15786g == 1;
    }

    public g d(boolean z10) {
        this.f15788i = z10 ? 1 : 0;
        return this;
    }

    public int e() {
        if (this.f15783c) {
            return this.f15782b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public boolean f() {
        return this.f15783c;
    }

    public int g() {
        if (this.f15785e) {
            return this.f15784d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public boolean h() {
        return this.f15785e;
    }

    public float i() {
        return this.f15797s;
    }

    public String j() {
        return this.f15791l;
    }

    public int k() {
        return this.f15792m;
    }

    public int l() {
        return this.f15793n;
    }

    public Layout.Alignment m() {
        return this.o;
    }

    public Layout.Alignment n() {
        return this.f15794p;
    }

    public boolean o() {
        if (this.f15795q == 1) {
            return true;
        }
        return false;
    }

    public b p() {
        return this.f15796r;
    }

    public int q() {
        return this.f15789j;
    }

    public float r() {
        return this.f15790k;
    }

    public g b(boolean z10) {
        this.f15786g = z10 ? 1 : 0;
        return this;
    }

    public g c(boolean z10) {
        this.f15787h = z10 ? 1 : 0;
        return this;
    }

    public String d() {
        return this.f15781a;
    }

    public g a(boolean z10) {
        this.f = z10 ? 1 : 0;
        return this;
    }

    public g b(int i10) {
        this.f15784d = i10;
        this.f15785e = true;
        return this;
    }

    public g c(int i10) {
        this.f15792m = i10;
        return this;
    }

    public g d(int i10) {
        this.f15793n = i10;
        return this;
    }

    public g a(String str) {
        this.f15781a = str;
        return this;
    }

    public g e(boolean z10) {
        this.f15795q = z10 ? 1 : 0;
        return this;
    }

    public g a(int i10) {
        this.f15782b = i10;
        this.f15783c = true;
        return this;
    }

    public g b(String str) {
        this.f15791l = str;
        return this;
    }

    public g e(int i10) {
        this.f15789j = i10;
        return this;
    }

    public g b(Layout.Alignment alignment) {
        this.f15794p = alignment;
        return this;
    }

    public g a(float f) {
        this.f15797s = f;
        return this;
    }

    public g b(float f) {
        this.f15790k = f;
        return this;
    }

    public g a(g gVar) {
        return a(gVar, true);
    }

    private g a(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f15783c && gVar.f15783c) {
                a(gVar.f15782b);
            }
            if (this.f15787h == -1) {
                this.f15787h = gVar.f15787h;
            }
            if (this.f15788i == -1) {
                this.f15788i = gVar.f15788i;
            }
            if (this.f15781a == null && (str = gVar.f15781a) != null) {
                this.f15781a = str;
            }
            if (this.f == -1) {
                this.f = gVar.f;
            }
            if (this.f15786g == -1) {
                this.f15786g = gVar.f15786g;
            }
            if (this.f15793n == -1) {
                this.f15793n = gVar.f15793n;
            }
            if (this.o == null && (alignment2 = gVar.o) != null) {
                this.o = alignment2;
            }
            if (this.f15794p == null && (alignment = gVar.f15794p) != null) {
                this.f15794p = alignment;
            }
            if (this.f15795q == -1) {
                this.f15795q = gVar.f15795q;
            }
            if (this.f15789j == -1) {
                this.f15789j = gVar.f15789j;
                this.f15790k = gVar.f15790k;
            }
            if (this.f15796r == null) {
                this.f15796r = gVar.f15796r;
            }
            if (this.f15797s == Float.MAX_VALUE) {
                this.f15797s = gVar.f15797s;
            }
            if (z10 && !this.f15785e && gVar.f15785e) {
                b(gVar.f15784d);
            }
            if (z10 && this.f15792m == -1 && (i10 = gVar.f15792m) != -1) {
                this.f15792m = i10;
            }
        }
        return this;
    }

    public g a(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public g a(b bVar) {
        this.f15796r = bVar;
        return this;
    }
}
