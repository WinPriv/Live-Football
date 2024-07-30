package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.e.m;
import com.anythink.expressad.exoplayer.h.w;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x implements com.anythink.expressad.exoplayer.e.m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8569a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8570b = 32;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.b f8571c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8572d;

    /* renamed from: e, reason: collision with root package name */
    private final w f8573e;
    private final w.a f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.s f8574g;

    /* renamed from: h, reason: collision with root package name */
    private a f8575h;

    /* renamed from: i, reason: collision with root package name */
    private a f8576i;

    /* renamed from: j, reason: collision with root package name */
    private a f8577j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.m f8578k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8579l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.m f8580m;

    /* renamed from: n, reason: collision with root package name */
    private long f8581n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8582p;

    /* renamed from: q, reason: collision with root package name */
    private b f8583q;

    /* loaded from: classes.dex */
    public interface b {
        void i();
    }

    public x(com.anythink.expressad.exoplayer.j.b bVar) {
        this.f8571c = bVar;
        int d10 = bVar.d();
        this.f8572d = d10;
        this.f8573e = new w();
        this.f = new w.a();
        this.f8574g = new com.anythink.expressad.exoplayer.k.s(32);
        a aVar = new a(0L, d10);
        this.f8575h = aVar;
        this.f8576i = aVar;
        this.f8577j = aVar;
    }

    private void c(int i10) {
        this.f8573e.b(i10);
    }

    private void l() {
        this.f8573e.a();
        a(this.f8575h);
        a aVar = new a(0L, this.f8572d);
        this.f8575h = aVar;
        this.f8576i = aVar;
        this.f8577j = aVar;
        this.o = 0L;
        this.f8571c.b();
    }

    private void m() {
        this.f8582p = true;
    }

    private int n() {
        return this.f8573e.e();
    }

    private void o() {
        c(this.f8573e.l());
    }

    public final void a(int i10) {
        long a10 = this.f8573e.a(i10);
        this.o = a10;
        if (a10 != 0) {
            a aVar = this.f8575h;
            if (a10 != aVar.f8584a) {
                while (this.o > aVar.f8585b) {
                    aVar = aVar.f8588e;
                }
                a aVar2 = aVar.f8588e;
                a(aVar2);
                a aVar3 = new a(aVar.f8585b, this.f8572d);
                aVar.f8588e = aVar3;
                if (this.o == aVar.f8585b) {
                    aVar = aVar3;
                }
                this.f8577j = aVar;
                if (this.f8576i == aVar2) {
                    this.f8576i = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f8575h);
        a aVar4 = new a(this.o, this.f8572d);
        this.f8575h = aVar4;
        this.f8576i = aVar4;
        this.f8577j = aVar4;
    }

    public final int b() {
        return this.f8573e.b();
    }

    public final int d() {
        return this.f8573e.c();
    }

    public final int e() {
        return this.f8573e.d();
    }

    public final com.anythink.expressad.exoplayer.m f() {
        return this.f8573e.g();
    }

    public final long g() {
        return this.f8573e.h();
    }

    public final long h() {
        return this.f8573e.i();
    }

    public final void i() {
        this.f8573e.j();
        this.f8576i = this.f8575h;
    }

    public final void j() {
        c(this.f8573e.m());
    }

    public final int k() {
        return this.f8573e.k();
    }

    private int d(int i10) {
        a aVar = this.f8577j;
        if (!aVar.f8586c) {
            aVar.a(this.f8571c.a(), new a(this.f8577j.f8585b, this.f8572d));
        }
        return Math.min(i10, (int) (this.f8577j.f8585b - this.o));
    }

    private void e(int i10) {
        long j10 = this.o + i10;
        this.o = j10;
        a aVar = this.f8577j;
        if (j10 == aVar.f8585b) {
            this.f8577j = aVar.f8588e;
        }
    }

    public final boolean b(int i10) {
        return this.f8573e.c(i10);
    }

    public final boolean c() {
        return this.f8573e.f();
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f8584a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8585b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8586c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.expressad.exoplayer.j.a f8587d;

        /* renamed from: e, reason: collision with root package name */
        public a f8588e;

        public a(long j10, int i10) {
            this.f8584a = j10;
            this.f8585b = j10 + i10;
        }

        public final void a(com.anythink.expressad.exoplayer.j.a aVar, a aVar2) {
            this.f8587d = aVar;
            this.f8588e = aVar2;
            this.f8586c = true;
        }

        public final int a(long j10) {
            return ((int) (j10 - this.f8584a)) + this.f8587d.f8696b;
        }

        public final a a() {
            this.f8587d = null;
            a aVar = this.f8588e;
            this.f8588e = null;
            return aVar;
        }
    }

    private void b(long j10) {
        while (true) {
            a aVar = this.f8576i;
            if (j10 < aVar.f8585b) {
                return;
            } else {
                this.f8576i = aVar.f8588e;
            }
        }
    }

    private void c(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f8575h;
            if (j10 < aVar.f8585b) {
                break;
            }
            this.f8571c.a(aVar.f8587d);
            this.f8575h = this.f8575h.a();
        }
        if (this.f8576i.f8584a < aVar.f8584a) {
            this.f8576i = aVar;
        }
    }

    public final void a(long j10, boolean z10, boolean z11) {
        c(this.f8573e.a(j10, z10, z11));
    }

    public final int a(long j10, boolean z10) {
        return this.f8573e.a(j10, z10);
    }

    public final int a(com.anythink.expressad.exoplayer.n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10, boolean z11, long j10) {
        int a10 = this.f8573e.a(nVar, eVar, z10, z11, this.f8578k, this.f);
        if (a10 == -5) {
            this.f8578k = nVar.f9274a;
            return -5;
        }
        if (a10 != -4) {
            if (a10 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!eVar.c()) {
            if (eVar.f < j10) {
                eVar.b(Integer.MIN_VALUE);
            }
            if (eVar.g()) {
                w.a aVar = this.f;
                long j11 = aVar.f8567b;
                int i10 = 1;
                this.f8574g.a(1);
                a(j11, this.f8574g.f9123a, 1);
                long j12 = j11 + 1;
                byte b10 = this.f8574g.f9123a[0];
                boolean z12 = (b10 & 128) != 0;
                int i11 = b10 & Ascii.DEL;
                com.anythink.expressad.exoplayer.c.b bVar = eVar.f7593d;
                if (bVar.f7571a == null) {
                    bVar.f7571a = new byte[16];
                }
                a(j12, bVar.f7571a, i11);
                long j13 = j12 + i11;
                if (z12) {
                    this.f8574g.a(2);
                    a(j13, this.f8574g.f9123a, 2);
                    j13 += 2;
                    i10 = this.f8574g.e();
                }
                int i12 = i10;
                com.anythink.expressad.exoplayer.c.b bVar2 = eVar.f7593d;
                int[] iArr = bVar2.f7574d;
                if (iArr == null || iArr.length < i12) {
                    iArr = new int[i12];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = bVar2.f7575e;
                if (iArr3 == null || iArr3.length < i12) {
                    iArr3 = new int[i12];
                }
                int[] iArr4 = iArr3;
                if (z12) {
                    int i13 = i12 * 6;
                    this.f8574g.a(i13);
                    a(j13, this.f8574g.f9123a, i13);
                    j13 += i13;
                    this.f8574g.c(0);
                    for (int i14 = 0; i14 < i12; i14++) {
                        iArr2[i14] = this.f8574g.e();
                        iArr4[i14] = this.f8574g.m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = aVar.f8566a - ((int) (j13 - aVar.f8567b));
                }
                m.a aVar2 = aVar.f8568c;
                com.anythink.expressad.exoplayer.c.b bVar3 = eVar.f7593d;
                bVar3.a(i12, iArr2, iArr4, aVar2.f7959b, bVar3.f7571a, aVar2.f7958a, aVar2.f7960c, aVar2.f7961d);
                long j14 = aVar.f8567b;
                int i15 = (int) (j13 - j14);
                aVar.f8567b = j14 + i15;
                aVar.f8566a -= i15;
            }
            eVar.d(this.f.f8566a);
            w.a aVar3 = this.f;
            long j15 = aVar3.f8567b;
            ByteBuffer byteBuffer = eVar.f7594e;
            int i16 = aVar3.f8566a;
            b(j15);
            while (i16 > 0) {
                int min = Math.min(i16, (int) (this.f8576i.f8585b - j15));
                a aVar4 = this.f8576i;
                byteBuffer.put(aVar4.f8587d.f8695a, aVar4.a(j15), min);
                i16 -= min;
                j15 += min;
                a aVar5 = this.f8576i;
                if (j15 == aVar5.f8585b) {
                    this.f8576i = aVar5.f8588e;
                }
            }
        }
        return -4;
    }

    private void a(com.anythink.expressad.exoplayer.c.e eVar, w.a aVar) {
        long j10 = aVar.f8567b;
        int i10 = 1;
        this.f8574g.a(1);
        a(j10, this.f8574g.f9123a, 1);
        long j11 = j10 + 1;
        byte b10 = this.f8574g.f9123a[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Ascii.DEL;
        com.anythink.expressad.exoplayer.c.b bVar = eVar.f7593d;
        if (bVar.f7571a == null) {
            bVar.f7571a = new byte[16];
        }
        a(j11, bVar.f7571a, i11);
        long j12 = j11 + i11;
        if (z10) {
            this.f8574g.a(2);
            a(j12, this.f8574g.f9123a, 2);
            j12 += 2;
            i10 = this.f8574g.e();
        }
        int i12 = i10;
        com.anythink.expressad.exoplayer.c.b bVar2 = eVar.f7593d;
        int[] iArr = bVar2.f7574d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f7575e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            this.f8574g.a(i13);
            a(j12, this.f8574g.f9123a, i13);
            j12 += i13;
            this.f8574g.c(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = this.f8574g.e();
                iArr4[i14] = this.f8574g.m();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f8566a - ((int) (j12 - aVar.f8567b));
        }
        m.a aVar2 = aVar.f8568c;
        com.anythink.expressad.exoplayer.c.b bVar3 = eVar.f7593d;
        bVar3.a(i12, iArr2, iArr4, aVar2.f7959b, bVar3.f7571a, aVar2.f7958a, aVar2.f7960c, aVar2.f7961d);
        long j13 = aVar.f8567b;
        int i15 = (int) (j12 - j13);
        aVar.f8567b = j13 + i15;
        aVar.f8566a -= i15;
    }

    private void a(long j10, ByteBuffer byteBuffer, int i10) {
        b(j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (this.f8576i.f8585b - j10));
            a aVar = this.f8576i;
            byteBuffer.put(aVar.f8587d.f8695a, aVar.a(j10), min);
            i10 -= min;
            j10 += min;
            a aVar2 = this.f8576i;
            if (j10 == aVar2.f8585b) {
                this.f8576i = aVar2.f8588e;
            }
        }
    }

    private void a(long j10, byte[] bArr, int i10) {
        b(j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.f8576i.f8585b - j10));
            a aVar = this.f8576i;
            System.arraycopy(aVar.f8587d.f8695a, aVar.a(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            a aVar2 = this.f8576i;
            if (j10 == aVar2.f8585b) {
                this.f8576i = aVar2.f8588e;
            }
        }
    }

    public final void a(b bVar) {
        this.f8583q = bVar;
    }

    public final void a(long j10) {
        if (this.f8581n != j10) {
            this.f8581n = j10;
            this.f8579l = true;
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final void a(com.anythink.expressad.exoplayer.m mVar) {
        com.anythink.expressad.exoplayer.m mVar2;
        long j10 = this.f8581n;
        if (mVar == null) {
            mVar2 = null;
        } else {
            if (j10 != 0) {
                long j11 = mVar.f9261l;
                if (j11 != Long.MAX_VALUE) {
                    mVar2 = mVar.a(j11 + j10);
                }
            }
            mVar2 = mVar;
        }
        boolean a10 = this.f8573e.a(mVar2);
        this.f8580m = mVar;
        this.f8579l = false;
        b bVar = this.f8583q;
        if (bVar == null || !a10) {
            return;
        }
        bVar.i();
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final int a(com.anythink.expressad.exoplayer.e.f fVar, int i10, boolean z10) {
        int d10 = d(i10);
        a aVar = this.f8577j;
        int a10 = fVar.a(aVar.f8587d.f8695a, aVar.a(this.o), d10);
        if (a10 != -1) {
            e(a10);
            return a10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final void a(com.anythink.expressad.exoplayer.k.s sVar, int i10) {
        while (i10 > 0) {
            int d10 = d(i10);
            a aVar = this.f8577j;
            sVar.a(aVar.f8587d.f8695a, aVar.a(this.o), d10);
            i10 -= d10;
            e(d10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.m
    public final void a(long j10, int i10, int i11, int i12, m.a aVar) {
        if (this.f8579l) {
            a(this.f8580m);
        }
        if (this.f8582p) {
            if ((i10 & 1) == 0 || !this.f8573e.a(j10)) {
                return;
            } else {
                this.f8582p = false;
            }
        }
        this.f8573e.a(j10 + this.f8581n, i10, (this.o - i11) - i12, i11, aVar);
    }

    private void a(a aVar) {
        if (aVar.f8586c) {
            a aVar2 = this.f8577j;
            int i10 = (((int) (aVar2.f8584a - aVar.f8584a)) / this.f8572d) + (aVar2.f8586c ? 1 : 0);
            com.anythink.expressad.exoplayer.j.a[] aVarArr = new com.anythink.expressad.exoplayer.j.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f8587d;
                aVar = aVar.a();
            }
            this.f8571c.a(aVarArr);
        }
    }

    private static com.anythink.expressad.exoplayer.m a(com.anythink.expressad.exoplayer.m mVar, long j10) {
        if (mVar == null) {
            return null;
        }
        if (j10 == 0) {
            return mVar;
        }
        long j11 = mVar.f9261l;
        return j11 != Long.MAX_VALUE ? mVar.a(j11 + j10) : mVar;
    }

    public final void a() {
        this.f8573e.a();
        a(this.f8575h);
        a aVar = new a(0L, this.f8572d);
        this.f8575h = aVar;
        this.f8576i = aVar;
        this.f8577j = aVar;
        this.o = 0L;
        this.f8571c.b();
    }
}
