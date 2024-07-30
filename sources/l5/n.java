package l5;

import c6.g0;
import j5.e0;
import java.io.IOException;
import k4.i0;
import p4.w;

/* compiled from: SingleSampleMediaChunk.java */
/* loaded from: classes2.dex */
public final class n extends a {
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f32538p;

    /* renamed from: q, reason: collision with root package name */
    public long f32539q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32540r;

    public n(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12, int i11, i0 i0Var2) {
        super(jVar, mVar, i0Var, i10, obj, j10, j11, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, j12);
        this.o = i11;
        this.f32538p = i0Var2;
    }

    @Override // l5.l
    public final boolean c() {
        return this.f32540r;
    }

    @Override // c6.b0.d
    public final void load() throws IOException {
        g0 g0Var = this.f32512i;
        c cVar = this.f32486m;
        d6.a.e(cVar);
        for (e0 e0Var : cVar.f32492b) {
            if (e0Var.F != 0) {
                e0Var.F = 0L;
                e0Var.f29735z = true;
            }
        }
        w a10 = cVar.a(this.o);
        a10.b(this.f32538p);
        try {
            long f = g0Var.f(this.f32506b.a(this.f32539q));
            if (f != -1) {
                f += this.f32539q;
            }
            p4.e eVar = new p4.e(this.f32512i, this.f32539q, f);
            for (int i10 = 0; i10 != -1; i10 = a10.a(eVar, Integer.MAX_VALUE, true)) {
                this.f32539q += i10;
            }
            a10.c(this.f32510g, 1, (int) this.f32539q, 0, null);
            androidx.activity.n.o0(g0Var);
            this.f32540r = true;
        } catch (Throwable th) {
            androidx.activity.n.o0(g0Var);
            throw th;
        }
    }

    @Override // c6.b0.d
    public final void a() {
    }
}
