package l5;

import c6.g0;
import j5.e0;
import java.io.IOException;
import k4.i0;

/* compiled from: ContainerMediaChunk.java */
/* loaded from: classes2.dex */
public final class i extends a {
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final long f32525p;

    /* renamed from: q, reason: collision with root package name */
    public final f f32526q;

    /* renamed from: r, reason: collision with root package name */
    public long f32527r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f32528s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32529t;

    public i(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(jVar, mVar, i0Var, i10, obj, j10, j11, j12, j13, j14);
        this.o = i11;
        this.f32525p = j15;
        this.f32526q = fVar;
    }

    @Override // c6.b0.d
    public final void a() {
        this.f32528s = true;
    }

    @Override // l5.l
    public final long b() {
        return this.f32536j + this.o;
    }

    @Override // l5.l
    public final boolean c() {
        return this.f32529t;
    }

    @Override // c6.b0.d
    public final void load() throws IOException {
        boolean z10;
        boolean z11;
        long j10;
        if (this.f32527r == 0) {
            c cVar = this.f32486m;
            d6.a.e(cVar);
            long j11 = this.f32525p;
            for (e0 e0Var : cVar.f32492b) {
                if (e0Var.F != j11) {
                    e0Var.F = j11;
                    e0Var.f29735z = true;
                }
            }
            f fVar = this.f32526q;
            long j12 = this.f32484k;
            long j13 = com.anythink.expressad.exoplayer.b.f7291b;
            if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.f32525p;
            }
            long j14 = this.f32485l;
            if (j14 != com.anythink.expressad.exoplayer.b.f7291b) {
                j13 = j14 - this.f32525p;
            }
            ((d) fVar).a(cVar, j10, j13);
        }
        try {
            c6.m a10 = this.f32506b.a(this.f32527r);
            g0 g0Var = this.f32512i;
            p4.e eVar = new p4.e(g0Var, a10.f, g0Var.f(a10));
            while (!this.f32528s) {
                try {
                    int c10 = ((d) this.f32526q).f32493s.c(eVar, d.B);
                    if (c10 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d6.a.d(z10);
                    if (c10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                } finally {
                    this.f32527r = eVar.f34314d - this.f32506b.f;
                }
            }
            androidx.activity.n.o0(this.f32512i);
            this.f32529t = !this.f32528s;
        } catch (Throwable th) {
            androidx.activity.n.o0(this.f32512i);
            throw th;
        }
    }
}
