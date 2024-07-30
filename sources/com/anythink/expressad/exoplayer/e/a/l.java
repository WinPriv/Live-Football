package com.anythink.expressad.exoplayer.e.a;

import com.anythink.expressad.exoplayer.k.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public c f7906a;

    /* renamed from: b, reason: collision with root package name */
    public long f7907b;

    /* renamed from: c, reason: collision with root package name */
    public long f7908c;

    /* renamed from: d, reason: collision with root package name */
    public long f7909d;

    /* renamed from: e, reason: collision with root package name */
    public int f7910e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f7911g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7912h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f7913i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f7914j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f7915k;

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f7916l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7917m;

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f7918n;
    public k o;

    /* renamed from: p, reason: collision with root package name */
    public int f7919p;

    /* renamed from: q, reason: collision with root package name */
    public s f7920q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7921r;

    /* renamed from: s, reason: collision with root package name */
    public long f7922s;

    public final void a() {
        this.f7910e = 0;
        this.f7922s = 0L;
        this.f7917m = false;
        this.f7921r = false;
        this.o = null;
    }

    public final long b(int i10) {
        return this.f7915k[i10] + this.f7914j[i10];
    }

    public final void a(int i10, int i11) {
        this.f7910e = i10;
        this.f = i11;
        int[] iArr = this.f7912h;
        if (iArr == null || iArr.length < i10) {
            this.f7911g = new long[i10];
            this.f7912h = new int[i10];
        }
        int[] iArr2 = this.f7913i;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f7913i = new int[i12];
            this.f7914j = new int[i12];
            this.f7915k = new long[i12];
            this.f7916l = new boolean[i12];
            this.f7918n = new boolean[i12];
        }
    }

    public final void a(int i10) {
        s sVar = this.f7920q;
        if (sVar == null || sVar.b() < i10) {
            this.f7920q = new s(i10);
        }
        this.f7919p = i10;
        this.f7917m = true;
        this.f7921r = true;
    }

    private void a(com.anythink.expressad.exoplayer.e.f fVar) {
        fVar.b(this.f7920q.f9123a, 0, this.f7919p);
        this.f7920q.c(0);
        this.f7921r = false;
    }

    public final void a(s sVar) {
        sVar.a(this.f7920q.f9123a, 0, this.f7919p);
        this.f7920q.c(0);
        this.f7921r = false;
    }
}
