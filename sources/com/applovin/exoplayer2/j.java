package com.applovin.exoplayer2;

@Deprecated
/* loaded from: classes.dex */
public class j implements i {

    /* renamed from: b, reason: collision with root package name */
    private final long f15883b = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: a, reason: collision with root package name */
    private final long f15882a = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15884c = false;

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar) {
        anVar.w();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b(an anVar) {
        anVar.g();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean c(an anVar) {
        anVar.j();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean d(an anVar) {
        if (!this.f15884c) {
            anVar.c();
            return true;
        }
        if (a() && anVar.o()) {
            a(anVar, -this.f15882a);
            return true;
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean e(an anVar) {
        if (!this.f15884c) {
            anVar.d();
            return true;
        }
        if (b() && anVar.o()) {
            a(anVar, this.f15883b);
            return true;
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, boolean z10) {
        anVar.a(z10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b(an anVar, boolean z10) {
        anVar.b(z10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, int i10, long j10) {
        anVar.a(i10, j10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b() {
        return !this.f15884c || this.f15883b > 0;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, int i10) {
        anVar.c(i10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a() {
        return !this.f15884c || this.f15882a > 0;
    }

    private static void a(an anVar, long j10) {
        long I = anVar.I() + j10;
        long H = anVar.H();
        if (H != com.anythink.expressad.exoplayer.b.f7291b) {
            I = Math.min(I, H);
        }
        anVar.a(Math.max(I, 0L));
    }
}
