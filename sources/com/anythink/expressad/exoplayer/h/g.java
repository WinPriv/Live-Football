package com.anythink.expressad.exoplayer.h;

/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    protected final z[] f8368a;

    public g(z[] zVarArr) {
        this.f8368a = zVarArr;
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
        for (z zVar : this.f8368a) {
            zVar.a_(j10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (z zVar : this.f8368a) {
                long e11 = zVar.e();
                if (e11 != Long.MIN_VALUE && e11 <= j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (e11 == e10 || z11) {
                    z10 |= zVar.c(j10);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final long d() {
        long j10 = Long.MAX_VALUE;
        for (z zVar : this.f8368a) {
            long d10 = zVar.d();
            if (d10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, d10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.z
    public final long e() {
        long j10 = Long.MAX_VALUE;
        for (z zVar : this.f8368a) {
            long e10 = zVar.e();
            if (e10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }
}
