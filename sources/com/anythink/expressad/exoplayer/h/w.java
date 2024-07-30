package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.e.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8549a = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int f8557j;

    /* renamed from: k, reason: collision with root package name */
    private int f8558k;

    /* renamed from: l, reason: collision with root package name */
    private int f8559l;

    /* renamed from: m, reason: collision with root package name */
    private int f8560m;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.m f8564r;

    /* renamed from: s, reason: collision with root package name */
    private int f8565s;

    /* renamed from: b, reason: collision with root package name */
    private int f8550b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private int[] f8551c = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    private long[] f8552d = new long[1000];

    /* renamed from: g, reason: collision with root package name */
    private long[] f8554g = new long[1000];
    private int[] f = new int[1000];

    /* renamed from: e, reason: collision with root package name */
    private int[] f8553e = new int[1000];

    /* renamed from: h, reason: collision with root package name */
    private m.a[] f8555h = new m.a[1000];

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.m[] f8556i = new com.anythink.expressad.exoplayer.m[1000];

    /* renamed from: n, reason: collision with root package name */
    private long f8561n = Long.MIN_VALUE;
    private long o = Long.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8563q = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8562p = true;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8566a;

        /* renamed from: b, reason: collision with root package name */
        public long f8567b;

        /* renamed from: c, reason: collision with root package name */
        public m.a f8568c;
    }

    public final void a() {
        this.f8557j = 0;
        this.f8558k = 0;
        this.f8559l = 0;
        this.f8560m = 0;
        this.f8562p = true;
        this.f8561n = Long.MIN_VALUE;
        this.o = Long.MIN_VALUE;
    }

    public final int b() {
        return this.f8558k + this.f8557j;
    }

    public final int c() {
        return this.f8558k;
    }

    public final int d() {
        return this.f8558k + this.f8560m;
    }

    public final int e() {
        return f() ? this.f8551c[f(this.f8560m)] : this.f8565s;
    }

    public final synchronized boolean f() {
        return this.f8560m != this.f8557j;
    }

    public final synchronized com.anythink.expressad.exoplayer.m g() {
        if (this.f8563q) {
            return null;
        }
        return this.f8564r;
    }

    public final synchronized long h() {
        return this.o;
    }

    public final synchronized long i() {
        if (this.f8557j == 0) {
            return Long.MIN_VALUE;
        }
        return this.f8554g[this.f8559l];
    }

    public final synchronized void j() {
        this.f8560m = 0;
    }

    public final synchronized int k() {
        int i10;
        int i11 = this.f8557j;
        i10 = i11 - this.f8560m;
        this.f8560m = i11;
        return i10;
    }

    public final synchronized long l() {
        int i10 = this.f8560m;
        if (i10 == 0) {
            return -1L;
        }
        return d(i10);
    }

    public final synchronized long m() {
        int i10 = this.f8557j;
        if (i10 == 0) {
            return -1L;
        }
        return d(i10);
    }

    private long d(int i10) {
        this.f8561n = Math.max(this.f8561n, e(i10));
        int i11 = this.f8557j - i10;
        this.f8557j = i11;
        this.f8558k += i10;
        int i12 = this.f8559l + i10;
        this.f8559l = i12;
        int i13 = this.f8550b;
        if (i12 >= i13) {
            this.f8559l = i12 - i13;
        }
        int i14 = this.f8560m - i10;
        this.f8560m = i14;
        if (i14 < 0) {
            this.f8560m = 0;
        }
        if (i11 == 0) {
            int i15 = this.f8559l;
            if (i15 != 0) {
                i13 = i15;
            }
            return this.f8552d[i13 - 1] + this.f8553e[r2];
        }
        return this.f8552d[this.f8559l];
    }

    private int f(int i10) {
        int i11 = this.f8559l + i10;
        int i12 = this.f8550b;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final void b(int i10) {
        this.f8565s = i10;
    }

    public final synchronized boolean c(int i10) {
        int i11 = this.f8558k;
        if (i11 > i10 || i10 > this.f8557j + i11) {
            return false;
        }
        this.f8560m = i10 - i11;
        return true;
    }

    private synchronized void b(long j10) {
        this.o = Math.max(this.o, j10);
    }

    private long e(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int f = f(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f8554g[f]);
            if ((this.f[f] & 1) != 0) {
                break;
            }
            f--;
            if (f == -1) {
                f = this.f8550b - 1;
            }
        }
        return j10;
    }

    public final long a(int i10) {
        int b10 = b() - i10;
        com.anythink.expressad.exoplayer.k.a.a(b10 >= 0 && b10 <= this.f8557j - this.f8560m);
        int i11 = this.f8557j - b10;
        this.f8557j = i11;
        this.o = Math.max(this.f8561n, e(i11));
        int i12 = this.f8557j;
        if (i12 == 0) {
            return 0L;
        }
        return this.f8552d[f(i12 - 1)] + this.f8553e[r6];
    }

    public final synchronized int a(com.anythink.expressad.exoplayer.n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10, boolean z11, com.anythink.expressad.exoplayer.m mVar, a aVar) {
        if (!f()) {
            if (z11) {
                eVar.a(4);
                return -4;
            }
            com.anythink.expressad.exoplayer.m mVar2 = this.f8564r;
            if (mVar2 == null || (!z10 && mVar2 == mVar)) {
                return -3;
            }
            nVar.f9274a = mVar2;
            return -5;
        }
        int f = f(this.f8560m);
        if (!z10 && this.f8556i[f] == mVar) {
            if (eVar.f()) {
                return -3;
            }
            eVar.f = this.f8554g[f];
            eVar.a(this.f[f]);
            aVar.f8566a = this.f8553e[f];
            aVar.f8567b = this.f8552d[f];
            aVar.f8568c = this.f8555h[f];
            this.f8560m++;
            return -4;
        }
        nVar.f9274a = this.f8556i[f];
        return -5;
    }

    public final synchronized int a(long j10, boolean z10) {
        int f = f(this.f8560m);
        if (f() && j10 >= this.f8554g[f] && (j10 <= this.o || z10)) {
            int a10 = a(f, this.f8557j - this.f8560m, j10, true);
            if (a10 == -1) {
                return -1;
            }
            this.f8560m += a10;
            return a10;
        }
        return -1;
    }

    public final synchronized long a(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f8557j;
        if (i11 != 0) {
            long[] jArr = this.f8554g;
            int i12 = this.f8559l;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f8560m) != i11) {
                    i11 = i10 + 1;
                }
                int a10 = a(i12, i11, j10, z10);
                if (a10 == -1) {
                    return -1L;
                }
                return d(a10);
            }
        }
        return -1L;
    }

    public final synchronized boolean a(com.anythink.expressad.exoplayer.m mVar) {
        if (mVar == null) {
            this.f8563q = true;
            return false;
        }
        this.f8563q = false;
        if (com.anythink.expressad.exoplayer.k.af.a(mVar, this.f8564r)) {
            return false;
        }
        this.f8564r = mVar;
        return true;
    }

    public final synchronized void a(long j10, int i10, long j11, int i11, m.a aVar) {
        if (this.f8562p) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f8562p = false;
            }
        }
        com.anythink.expressad.exoplayer.k.a.b(!this.f8563q);
        b(j10);
        int f = f(this.f8557j);
        this.f8554g[f] = j10;
        long[] jArr = this.f8552d;
        jArr[f] = j11;
        this.f8553e[f] = i11;
        this.f[f] = i10;
        this.f8555h[f] = aVar;
        this.f8556i[f] = this.f8564r;
        this.f8551c[f] = this.f8565s;
        int i12 = this.f8557j + 1;
        this.f8557j = i12;
        int i13 = this.f8550b;
        if (i12 == i13) {
            int i14 = i13 + 1000;
            int[] iArr = new int[i14];
            long[] jArr2 = new long[i14];
            long[] jArr3 = new long[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            m.a[] aVarArr = new m.a[i14];
            com.anythink.expressad.exoplayer.m[] mVarArr = new com.anythink.expressad.exoplayer.m[i14];
            int i15 = this.f8559l;
            int i16 = i13 - i15;
            System.arraycopy(jArr, i15, jArr2, 0, i16);
            System.arraycopy(this.f8554g, this.f8559l, jArr3, 0, i16);
            System.arraycopy(this.f, this.f8559l, iArr2, 0, i16);
            System.arraycopy(this.f8553e, this.f8559l, iArr3, 0, i16);
            System.arraycopy(this.f8555h, this.f8559l, aVarArr, 0, i16);
            System.arraycopy(this.f8556i, this.f8559l, mVarArr, 0, i16);
            System.arraycopy(this.f8551c, this.f8559l, iArr, 0, i16);
            int i17 = this.f8559l;
            System.arraycopy(this.f8552d, 0, jArr2, i16, i17);
            System.arraycopy(this.f8554g, 0, jArr3, i16, i17);
            System.arraycopy(this.f, 0, iArr2, i16, i17);
            System.arraycopy(this.f8553e, 0, iArr3, i16, i17);
            System.arraycopy(this.f8555h, 0, aVarArr, i16, i17);
            System.arraycopy(this.f8556i, 0, mVarArr, i16, i17);
            System.arraycopy(this.f8551c, 0, iArr, i16, i17);
            this.f8552d = jArr2;
            this.f8554g = jArr3;
            this.f = iArr2;
            this.f8553e = iArr3;
            this.f8555h = aVarArr;
            this.f8556i = mVarArr;
            this.f8551c = iArr;
            this.f8559l = 0;
            this.f8557j = this.f8550b;
            this.f8550b = i14;
        }
    }

    public final synchronized boolean a(long j10) {
        if (this.f8557j == 0) {
            return j10 > this.f8561n;
        }
        if (Math.max(this.f8561n, e(this.f8560m)) >= j10) {
            return false;
        }
        int i10 = this.f8557j;
        int f = f(i10 - 1);
        while (i10 > this.f8560m && this.f8554g[f] >= j10) {
            i10--;
            f--;
            if (f == -1) {
                f = this.f8550b - 1;
            }
        }
        a(this.f8558k + i10);
        return true;
    }

    private int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.f8554g[i10] <= j10; i13++) {
            if (!z10 || (this.f[i10] & 1) != 0) {
                i12 = i13;
            }
            i10++;
            if (i10 == this.f8550b) {
                i10 = 0;
            }
        }
        return i12;
    }
}
