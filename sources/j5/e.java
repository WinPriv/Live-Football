package j5;

import j5.u;
import java.io.IOException;
import java.util.ArrayList;
import k4.q1;

/* compiled from: ClippingMediaSource.java */
/* loaded from: classes2.dex */
public final class e extends p0 {
    public final long D;
    public final long E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final ArrayList<d> I;
    public final q1.c J;
    public a K;
    public b L;
    public long M;
    public long N;

    /* compiled from: ClippingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends m {

        /* renamed from: u, reason: collision with root package name */
        public final long f29709u;

        /* renamed from: v, reason: collision with root package name */
        public final long f29710v;

        /* renamed from: w, reason: collision with root package name */
        public final long f29711w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f29712x;

        public a(q1 q1Var, long j10, long j11) throws b {
            super(q1Var);
            long max;
            long j12;
            boolean z10 = false;
            if (q1Var.h() == 1) {
                q1.c m10 = q1Var.m(0, new q1.c());
                long max2 = Math.max(0L, j10);
                if (!m10.D && max2 != 0 && !m10.f30766z) {
                    throw new b(1);
                }
                if (j11 == Long.MIN_VALUE) {
                    max = m10.F;
                } else {
                    max = Math.max(0L, j11);
                }
                long j13 = m10.F;
                if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                    max = max > j13 ? j13 : max;
                    if (max2 > max) {
                        throw new b(2);
                    }
                }
                this.f29709u = max2;
                this.f29710v = max;
                if (max == com.anythink.expressad.exoplayer.b.f7291b) {
                    j12 = -9223372036854775807L;
                } else {
                    j12 = max - max2;
                }
                this.f29711w = j12;
                if (m10.A && (max == com.anythink.expressad.exoplayer.b.f7291b || (j13 != com.anythink.expressad.exoplayer.b.f7291b && max == j13))) {
                    z10 = true;
                }
                this.f29712x = z10;
                return;
            }
            throw new b(0);
        }

        @Override // j5.m, k4.q1
        public final q1.b f(int i10, q1.b bVar, boolean z10) {
            long j10;
            this.f29798t.f(0, bVar, z10);
            long j11 = bVar.f30758w - this.f29709u;
            long j12 = this.f29711w;
            if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - j11;
            }
            bVar.h(bVar.f30754s, bVar.f30755t, 0, j10, j11, k5.a.y, false);
            return bVar;
        }

        @Override // j5.m, k4.q1
        public final q1.c n(int i10, q1.c cVar, long j10) {
            this.f29798t.n(0, cVar, 0L);
            long j11 = cVar.I;
            long j12 = this.f29709u;
            cVar.I = j11 + j12;
            cVar.F = this.f29711w;
            cVar.A = this.f29712x;
            long j13 = cVar.E;
            if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                long max = Math.max(j13, j12);
                cVar.E = max;
                long j14 = this.f29710v;
                if (j14 != com.anythink.expressad.exoplayer.b.f7291b) {
                    max = Math.min(max, j14);
                }
                cVar.E = max - j12;
            }
            long S = d6.g0.S(j12);
            long j15 = cVar.f30764w;
            if (j15 != com.anythink.expressad.exoplayer.b.f7291b) {
                cVar.f30764w = j15 + S;
            }
            long j16 = cVar.f30765x;
            if (j16 != com.anythink.expressad.exoplayer.b.f7291b) {
                cVar.f30765x = j16 + S;
            }
            return cVar;
        }
    }

    /* compiled from: ClippingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L11
                r0 = 1
                if (r2 == r0) goto Le
                r0 = 2
                if (r2 == r0) goto Lb
                java.lang.String r2 = "unknown"
                goto L13
            Lb:
                java.lang.String r2 = "start exceeds end"
                goto L13
            Le:
                java.lang.String r2 = "not seekable to start"
                goto L13
            L11:
                java.lang.String r2 = "invalid period count"
            L13:
                java.lang.String r0 = "Illegal clipping: "
                java.lang.String r2 = r0.concat(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.e.b.<init>(int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u uVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(uVar);
        boolean z13;
        uVar.getClass();
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        d6.a.a(z13);
        this.D = j10;
        this.E = j11;
        this.F = z10;
        this.G = z11;
        this.H = z12;
        this.I = new ArrayList<>();
        this.J = new q1.c();
    }

    @Override // j5.p0
    public final void D(q1 q1Var) {
        if (this.L != null) {
            return;
        }
        F(q1Var);
    }

    public final void F(q1 q1Var) {
        long j10;
        long j11;
        long j12;
        q1.c cVar = this.J;
        q1Var.m(0, cVar);
        long j13 = cVar.I;
        a aVar = this.K;
        long j14 = this.E;
        long j15 = Long.MIN_VALUE;
        ArrayList<d> arrayList = this.I;
        if (aVar != null && !arrayList.isEmpty() && !this.G) {
            long j16 = this.M - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.N - j13;
            }
            j12 = j15;
            j11 = j16;
        } else {
            boolean z10 = this.H;
            long j17 = this.D;
            if (z10) {
                long j18 = cVar.E;
                j17 += j18;
                j10 = j18 + j14;
            } else {
                j10 = j14;
            }
            this.M = j13 + j17;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j10;
            }
            this.N = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = arrayList.get(i10);
                long j19 = this.M;
                long j20 = this.N;
                dVar.f29694w = j19;
                dVar.f29695x = j20;
            }
            j11 = j17;
            j12 = j10;
        }
        try {
            a aVar2 = new a(q1Var, j11, j12);
            this.K = aVar2;
            v(aVar2);
        } catch (b e10) {
            this.L = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).y = this.L;
            }
        }
    }

    @Override // j5.u
    public final void c(s sVar) {
        ArrayList<d> arrayList = this.I;
        d6.a.d(arrayList.remove(sVar));
        this.C.c(((d) sVar).f29690s);
        if (arrayList.isEmpty() && !this.G) {
            a aVar = this.K;
            aVar.getClass();
            F(aVar.f29798t);
        }
    }

    @Override // j5.g, j5.u
    public final void j() throws IOException {
        b bVar = this.L;
        if (bVar == null) {
            super.j();
            return;
        }
        throw bVar;
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        d dVar = new d(this.C.p(bVar, bVar2, j10), this.F, this.M, this.N);
        this.I.add(dVar);
        return dVar;
    }

    @Override // j5.g, j5.a
    public final void w() {
        super.w();
        this.L = null;
        this.K = null;
    }
}
