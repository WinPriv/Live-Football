package r5;

import java.util.List;

/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes2.dex */
public abstract class l extends n4.h implements g {

    /* renamed from: u, reason: collision with root package name */
    public g f34928u;

    /* renamed from: v, reason: collision with root package name */
    public long f34929v;

    @Override // r5.g
    public final int a(long j10) {
        g gVar = this.f34928u;
        gVar.getClass();
        return gVar.a(j10 - this.f34929v);
    }

    @Override // r5.g
    public final long b(int i10) {
        g gVar = this.f34928u;
        gVar.getClass();
        return gVar.b(i10) + this.f34929v;
    }

    @Override // r5.g
    public final List<a> c(long j10) {
        g gVar = this.f34928u;
        gVar.getClass();
        return gVar.c(j10 - this.f34929v);
    }

    @Override // r5.g
    public final int d() {
        g gVar = this.f34928u;
        gVar.getClass();
        return gVar.d();
    }

    public final void i(long j10, g gVar, long j11) {
        this.f33327t = j10;
        this.f34928u = gVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f34929v = j10;
    }
}
