package m5;

import d6.g0;
import j5.f0;
import java.io.IOException;
import k4.i0;
import n4.g;

/* compiled from: EventSampleStream.java */
/* loaded from: classes2.dex */
public final class f implements f0 {

    /* renamed from: s, reason: collision with root package name */
    public final i0 f32898s;

    /* renamed from: u, reason: collision with root package name */
    public long[] f32900u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32901v;

    /* renamed from: w, reason: collision with root package name */
    public n5.f f32902w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32903x;
    public int y;

    /* renamed from: t, reason: collision with root package name */
    public final e5.b f32899t = new e5.b();

    /* renamed from: z, reason: collision with root package name */
    public long f32904z = com.anythink.expressad.exoplayer.b.f7291b;

    public f(n5.f fVar, i0 i0Var, boolean z10) {
        this.f32898s = i0Var;
        this.f32902w = fVar;
        this.f32900u = fVar.f33383b;
        c(fVar, z10);
    }

    public final void b(long j10) {
        boolean z10 = true;
        int b10 = g0.b(this.f32900u, j10, true);
        this.y = b10;
        if (!this.f32901v || b10 != this.f32900u.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f32904z = j10;
    }

    public final void c(n5.f fVar, boolean z10) {
        long j10;
        int i10 = this.y;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f32900u[i10 - 1];
        }
        this.f32901v = z10;
        this.f32902w = fVar;
        long[] jArr = fVar.f33383b;
        this.f32900u = jArr;
        long j11 = this.f32904z;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            b(j11);
        } else if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.y = g0.b(jArr, j10, false);
        }
    }

    @Override // j5.f0
    public final int i(long j10) {
        int max = Math.max(this.y, g0.b(this.f32900u, j10, true));
        int i10 = max - this.y;
        this.y = max;
        return i10;
    }

    @Override // j5.f0
    public final boolean isReady() {
        return true;
    }

    @Override // j5.f0
    public final int m(j1.a aVar, g gVar, int i10) {
        boolean z10;
        int i11 = this.y;
        if (i11 == this.f32900u.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f32901v) {
            gVar.f33298s = 4;
            return -4;
        }
        if ((i10 & 2) == 0 && this.f32903x) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.y = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f32899t.a(this.f32902w.f33382a[i11]);
                gVar.j(a10.length);
                gVar.f33322u.put(a10);
            }
            gVar.f33324w = this.f32900u[i11];
            gVar.f33298s = 1;
            return -4;
        }
        aVar.f29569u = this.f32898s;
        this.f32903x = true;
        return -5;
    }

    @Override // j5.f0
    public final void a() throws IOException {
    }
}
