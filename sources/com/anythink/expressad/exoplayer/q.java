package com.anythink.expressad.exoplayer;

import android.util.Log;
import com.anythink.expressad.exoplayer.h.af;

/* loaded from: classes.dex */
final class q {

    /* renamed from: l, reason: collision with root package name */
    private static final String f9278l = "MediaPeriodHolder";

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.h.r f9279a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9280b;

    /* renamed from: c, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.h.y[] f9281c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f9282d;

    /* renamed from: e, reason: collision with root package name */
    public long f9283e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9284g;

    /* renamed from: h, reason: collision with root package name */
    public r f9285h;

    /* renamed from: i, reason: collision with root package name */
    public q f9286i;

    /* renamed from: j, reason: collision with root package name */
    public af f9287j;

    /* renamed from: k, reason: collision with root package name */
    public com.anythink.expressad.exoplayer.i.i f9288k;

    /* renamed from: m, reason: collision with root package name */
    private final z[] f9289m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.i.h f9290n;
    private final com.anythink.expressad.exoplayer.h.s o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.i.i f9291p;

    public q(z[] zVarArr, long j10, com.anythink.expressad.exoplayer.i.h hVar, com.anythink.expressad.exoplayer.j.b bVar, com.anythink.expressad.exoplayer.h.s sVar, Object obj, r rVar) {
        this.f9289m = zVarArr;
        this.f9283e = j10 - rVar.f9293b;
        this.f9290n = hVar;
        this.o = sVar;
        this.f9280b = com.anythink.expressad.exoplayer.k.a.a(obj);
        this.f9285h = rVar;
        this.f9281c = new com.anythink.expressad.exoplayer.h.y[zVarArr.length];
        this.f9282d = new boolean[zVarArr.length];
        com.anythink.expressad.exoplayer.h.r a10 = sVar.a(rVar.f9292a, bVar);
        long j11 = rVar.f9294c;
        this.f9279a = j11 != Long.MIN_VALUE ? new com.anythink.expressad.exoplayer.h.d(a10, true, 0L, j11) : a10;
    }

    private long d() {
        return this.f9283e;
    }

    private long e() {
        return this.f9285h.f9296e;
    }

    public final boolean a() {
        if (this.f) {
            return !this.f9284g || this.f9279a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long b() {
        if (this.f) {
            return this.f9279a.e();
        }
        return 0L;
    }

    public final void c() {
        a((com.anythink.expressad.exoplayer.i.i) null);
        try {
            if (this.f9285h.f9294c != Long.MIN_VALUE) {
                this.o.a(((com.anythink.expressad.exoplayer.h.d) this.f9279a).f8330a);
            } else {
                this.o.a(this.f9279a);
            }
        } catch (RuntimeException e10) {
            Log.e(f9278l, "Period release failed.", e10);
        }
    }

    private void b(float f) {
        this.f = true;
        this.f9287j = this.f9279a.b();
        a(f);
        long b10 = b(this.f9285h.f9293b);
        long j10 = this.f9283e;
        r rVar = this.f9285h;
        this.f9283e = (rVar.f9293b - b10) + j10;
        this.f9285h = new r(rVar.f9292a, b10, rVar.f9294c, rVar.f9295d, rVar.f9296e, rVar.f, rVar.f9297g);
    }

    private long d(long j10) {
        return j10 - this.f9283e;
    }

    private void e(long j10) {
        if (this.f) {
            this.f9279a.a_(j10 - this.f9283e);
        }
    }

    public final long a(boolean z10) {
        if (!this.f) {
            return this.f9285h.f9293b;
        }
        long d10 = this.f9279a.d();
        return (d10 == Long.MIN_VALUE && z10) ? this.f9285h.f9296e : d10;
    }

    private static void c(com.anythink.expressad.exoplayer.i.i iVar) {
        for (int i10 = 0; i10 < iVar.f8687a; i10++) {
            iVar.a(i10);
            iVar.f8689c.a(i10);
        }
    }

    public final boolean a(float f) {
        com.anythink.expressad.exoplayer.i.i a10 = this.f9290n.a(this.f9289m, this.f9287j);
        if (a10.a(this.f9291p)) {
            return false;
        }
        this.f9288k = a10;
        for (com.anythink.expressad.exoplayer.i.f fVar : a10.f8689c.a()) {
            if (fVar != null) {
                fVar.a(f);
            }
        }
        return true;
    }

    private long c(long j10) {
        return j10 + this.f9283e;
    }

    public final long b(long j10) {
        return a(j10, false, new boolean[this.f9289m.length]);
    }

    private static void b(com.anythink.expressad.exoplayer.i.i iVar) {
        for (int i10 = 0; i10 < iVar.f8687a; i10++) {
            boolean a10 = iVar.a(i10);
            com.anythink.expressad.exoplayer.i.f a11 = iVar.f8689c.a(i10);
            if (a10 && a11 != null) {
                a11.a();
            }
        }
    }

    public final long a(long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            com.anythink.expressad.exoplayer.i.i iVar = this.f9288k;
            boolean z11 = true;
            if (i10 >= iVar.f8687a) {
                break;
            }
            boolean[] zArr2 = this.f9282d;
            if (z10 || !iVar.a(this.f9291p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        a(this.f9281c);
        a(this.f9288k);
        com.anythink.expressad.exoplayer.i.g gVar = this.f9288k.f8689c;
        long a10 = this.f9279a.a(gVar.a(), this.f9282d, this.f9281c, zArr, j10);
        b(this.f9281c);
        this.f9284g = false;
        int i11 = 0;
        while (true) {
            com.anythink.expressad.exoplayer.h.y[] yVarArr = this.f9281c;
            if (i11 >= yVarArr.length) {
                return a10;
            }
            if (yVarArr[i11] != null) {
                com.anythink.expressad.exoplayer.k.a.b(this.f9288k.a(i11));
                if (this.f9289m[i11].a() != 5) {
                    this.f9284g = true;
                }
            } else {
                com.anythink.expressad.exoplayer.k.a.b(gVar.a(i11) == null);
            }
            i11++;
        }
    }

    private void b(com.anythink.expressad.exoplayer.h.y[] yVarArr) {
        int i10 = 0;
        while (true) {
            z[] zVarArr = this.f9289m;
            if (i10 >= zVarArr.length) {
                return;
            }
            if (zVarArr[i10].a() == 5 && this.f9288k.a(i10)) {
                yVarArr[i10] = new com.anythink.expressad.exoplayer.h.m();
            }
            i10++;
        }
    }

    private void a(com.anythink.expressad.exoplayer.i.i iVar) {
        com.anythink.expressad.exoplayer.i.i iVar2 = this.f9291p;
        if (iVar2 != null) {
            c(iVar2);
        }
        this.f9291p = iVar;
        if (iVar != null) {
            b(iVar);
        }
    }

    private void a(com.anythink.expressad.exoplayer.h.y[] yVarArr) {
        int i10 = 0;
        while (true) {
            z[] zVarArr = this.f9289m;
            if (i10 >= zVarArr.length) {
                return;
            }
            if (zVarArr[i10].a() == 5) {
                yVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final void a(long j10) {
        this.f9279a.c(j10 - this.f9283e);
    }
}
