package j5;

import j5.s;
import j5.u;
import java.io.IOException;
import k4.m1;

/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes2.dex */
public final class p implements s, s.a {

    /* renamed from: s, reason: collision with root package name */
    public final u.b f29819s;

    /* renamed from: t, reason: collision with root package name */
    public final long f29820t;

    /* renamed from: u, reason: collision with root package name */
    public final c6.b f29821u;

    /* renamed from: v, reason: collision with root package name */
    public u f29822v;

    /* renamed from: w, reason: collision with root package name */
    public s f29823w;

    /* renamed from: x, reason: collision with root package name */
    public s.a f29824x;
    public long y = com.anythink.expressad.exoplayer.b.f7291b;

    public p(u.b bVar, c6.b bVar2, long j10) {
        this.f29819s = bVar;
        this.f29821u = bVar2;
        this.f29820t = j10;
    }

    @Override // j5.s.a
    public final void a(s sVar) {
        s.a aVar = this.f29824x;
        int i10 = d6.g0.f27302a;
        aVar.a(this);
    }

    @Override // j5.s, j5.g0
    public final long b() {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.b();
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        s sVar = this.f29823w;
        if (sVar != null && sVar.c(j10)) {
            return true;
        }
        return false;
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.d(j10, m1Var);
    }

    @Override // j5.s, j5.g0
    public final long e() {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.e();
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        sVar.f(j10);
    }

    @Override // j5.g0.a
    public final void g(s sVar) {
        s.a aVar = this.f29824x;
        int i10 = d6.g0.f27302a;
        aVar.g(this);
    }

    public final void h(u.b bVar) {
        long j10 = this.y;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = this.f29820t;
        }
        u uVar = this.f29822v;
        uVar.getClass();
        s p10 = uVar.p(bVar, this.f29821u, j10);
        this.f29823w = p10;
        if (this.f29824x != null) {
            p10.k(this, j10);
        }
    }

    public final void i() {
        if (this.f29823w != null) {
            u uVar = this.f29822v;
            uVar.getClass();
            uVar.c(this.f29823w);
        }
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        s sVar = this.f29823w;
        if (sVar != null && sVar.isLoading()) {
            return true;
        }
        return false;
    }

    @Override // j5.s
    public final void j() throws IOException {
        try {
            s sVar = this.f29823w;
            if (sVar != null) {
                sVar.j();
                return;
            }
            u uVar = this.f29822v;
            if (uVar != null) {
                uVar.j();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        this.f29824x = aVar;
        s sVar = this.f29823w;
        if (sVar != null) {
            long j11 = this.y;
            if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                j11 = this.f29820t;
            }
            sVar.k(this, j11);
        }
    }

    @Override // j5.s
    public final long l(long j10) {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.l(j10);
    }

    @Override // j5.s
    public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.y;
        if (j12 != com.anythink.expressad.exoplayer.b.f7291b && j10 == this.f29820t) {
            this.y = com.anythink.expressad.exoplayer.b.f7291b;
            j11 = j12;
        } else {
            j11 = j10;
        }
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.o(fVarArr, zArr, f0VarArr, zArr2, j11);
    }

    @Override // j5.s
    public final long p() {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.p();
    }

    @Override // j5.s
    public final n0 r() {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        return sVar.r();
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        s sVar = this.f29823w;
        int i10 = d6.g0.f27302a;
        sVar.t(j10, z10);
    }
}
