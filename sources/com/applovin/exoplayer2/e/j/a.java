package com.applovin.exoplayer2.e.j;

import a3.k;
import android.util.Pair;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.openalliance.ad.constant.ag;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a */
    public static final l f14872a = new com.applovin.exoplayer2.e.f.h(3);

    /* renamed from: b */
    private j f14873b;

    /* renamed from: c */
    private x f14874c;

    /* renamed from: d */
    private b f14875d;

    /* renamed from: e */
    private int f14876e = -1;
    private long f = -1;

    /* renamed from: com.applovin.exoplayer2.e.j.a$a */
    /* loaded from: classes.dex */
    public static final class C0170a implements b {

        /* renamed from: a */
        private static final int[] f14877a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: b */
        private static final int[] f14878b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, com.anythink.expressad.foundation.g.a.aT, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, ag.f22003n, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: c */
        private final j f14879c;

        /* renamed from: d */
        private final x f14880d;

        /* renamed from: e */
        private final com.applovin.exoplayer2.e.j.b f14881e;
        private final int f;

        /* renamed from: g */
        private final byte[] f14882g;

        /* renamed from: h */
        private final y f14883h;

        /* renamed from: i */
        private final int f14884i;

        /* renamed from: j */
        private final v f14885j;

        /* renamed from: k */
        private int f14886k;

        /* renamed from: l */
        private long f14887l;

        /* renamed from: m */
        private int f14888m;

        /* renamed from: n */
        private long f14889n;

        public C0170a(j jVar, x xVar, com.applovin.exoplayer2.e.j.b bVar) throws ai {
            this.f14879c = jVar;
            this.f14880d = xVar;
            this.f14881e = bVar;
            int max = Math.max(1, bVar.f14899c / 10);
            this.f14884i = max;
            y yVar = new y(bVar.f14902g);
            yVar.j();
            int j10 = yVar.j();
            this.f = j10;
            int i10 = bVar.f14898b;
            int i11 = (((bVar.f14901e - (i10 * 4)) * 8) / (bVar.f * i10)) + 1;
            if (j10 == i11) {
                int a10 = com.applovin.exoplayer2.l.ai.a(max, j10);
                this.f14882g = new byte[bVar.f14901e * a10];
                this.f14883h = new y(a10 * a(j10, i10));
                int i12 = ((bVar.f14899c * bVar.f14901e) * 8) / j10;
                this.f14885j = new v.a().f(o.f9088w).d(i12).e(i12).f(a(max, i10)).k(bVar.f14898b).l(bVar.f14899c).m(2).a();
                return;
            }
            throw ai.b("Expected frames per block: " + i11 + "; got: " + j10, null);
        }

        private static int a(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private int b(int i10) {
            return i10 / (this.f14881e.f14898b * 2);
        }

        private int c(int i10) {
            return a(i10, this.f14881e.f14898b);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(long j10) {
            this.f14886k = 0;
            this.f14887l = j10;
            this.f14888m = 0;
            this.f14889n = 0L;
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(int i10, long j10) {
            this.f14879c.a(new d(this.f14881e, this.f, i10, j10));
            this.f14880d.a(this.f14885j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // com.applovin.exoplayer2.e.j.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(com.applovin.exoplayer2.e.i r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f14884i
                int r1 = r6.f14888m
                int r1 = r6.b(r1)
                int r0 = r0 - r1
                int r1 = r6.f
                int r0 = com.applovin.exoplayer2.l.ai.a(r0, r1)
                com.applovin.exoplayer2.e.j.b r1 = r6.f14881e
                int r1 = r1.f14901e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f14886k
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f14882g
                int r5 = r6.f14886k
                int r3 = r7.a(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f14886k
                int r4 = r4 + r3
                r6.f14886k = r4
                goto L1e
            L3e:
                int r7 = r6.f14886k
                com.applovin.exoplayer2.e.j.b r8 = r6.f14881e
                int r8 = r8.f14901e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f14882g
                com.applovin.exoplayer2.l.y r9 = r6.f14883h
                r6.a(r8, r7, r9)
                int r8 = r6.f14886k
                com.applovin.exoplayer2.e.j.b r9 = r6.f14881e
                int r9 = r9.f14901e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f14886k = r8
                com.applovin.exoplayer2.l.y r7 = r6.f14883h
                int r7 = r7.b()
                com.applovin.exoplayer2.e.x r8 = r6.f14880d
                com.applovin.exoplayer2.l.y r9 = r6.f14883h
                r8.a(r9, r7)
                int r8 = r6.f14888m
                int r8 = r8 + r7
                r6.f14888m = r8
                int r7 = r6.b(r8)
                int r8 = r6.f14884i
                if (r7 < r8) goto L75
                r6.a(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f14888m
                int r7 = r6.b(r7)
                if (r7 <= 0) goto L82
                r6.a(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.j.a.C0170a.a(com.applovin.exoplayer2.e.i, long):boolean");
        }

        private void a(int i10) {
            long d10 = this.f14887l + com.applovin.exoplayer2.l.ai.d(this.f14889n, 1000000L, this.f14881e.f14899c);
            int c10 = c(i10);
            this.f14880d.a(d10, 1, c10, this.f14888m - c10, null);
            this.f14889n += i10;
            this.f14888m -= c10;
        }

        private void a(byte[] bArr, int i10, y yVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f14881e.f14898b; i12++) {
                    a(bArr, i11, i12, yVar.d());
                }
            }
            int c10 = c(this.f * i10);
            yVar.d(0);
            yVar.c(c10);
        }

        private void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
            com.applovin.exoplayer2.e.j.b bVar = this.f14881e;
            int i12 = bVar.f14901e;
            int i13 = bVar.f14898b;
            int i14 = (i11 * 4) + (i10 * i12);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & DefaultClassResolver.NAME) << 8) | (bArr[i14] & DefaultClassResolver.NAME));
            int min = Math.min(bArr[i14 + 2] & DefaultClassResolver.NAME, 88);
            int i18 = f14878b[min];
            int i19 = ((i10 * this.f * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & p.f9095b);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & DefaultClassResolver.NAME;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = com.applovin.exoplayer2.l.ai.a(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & p.f9095b);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f14877a[i22];
                int[] iArr = f14878b;
                min = com.applovin.exoplayer2.l.ai.a(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, long j10) throws ai;

        void a(long j10);

        boolean a(i iVar, long j10) throws IOException;
    }

    public static /* synthetic */ h[] b() {
        return new h[]{new a()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return com.applovin.exoplayer2.e.j.c.a(iVar) != null;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f14873b = jVar;
        this.f14874c = jVar.a(0, 1);
        jVar.a();
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final j f14890a;

        /* renamed from: b */
        private final x f14891b;

        /* renamed from: c */
        private final com.applovin.exoplayer2.e.j.b f14892c;

        /* renamed from: d */
        private final v f14893d;

        /* renamed from: e */
        private final int f14894e;
        private long f;

        /* renamed from: g */
        private int f14895g;

        /* renamed from: h */
        private long f14896h;

        public c(j jVar, x xVar, com.applovin.exoplayer2.e.j.b bVar, String str, int i10) throws ai {
            this.f14890a = jVar;
            this.f14891b = xVar;
            this.f14892c = bVar;
            int i11 = (bVar.f14898b * bVar.f) / 8;
            if (bVar.f14901e == i11) {
                int i12 = bVar.f14899c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f14894e = max;
                this.f14893d = new v.a().f(str).d(i13).e(i13).f(max).k(bVar.f14898b).l(bVar.f14899c).m(i10).a();
                return;
            }
            StringBuilder n10 = k.n("Expected block size: ", i11, "; got: ");
            n10.append(bVar.f14901e);
            throw ai.b(n10.toString(), null);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(long j10) {
            this.f = j10;
            this.f14895g = 0;
            this.f14896h = 0L;
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(int i10, long j10) {
            this.f14890a.a(new d(this.f14892c, 1, i10, j10));
            this.f14891b.a(this.f14893d);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public boolean a(i iVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f14895g) < (i11 = this.f14894e)) {
                int a10 = this.f14891b.a((g) iVar, (int) Math.min(i11 - i10, j11), true);
                if (a10 == -1) {
                    j11 = 0;
                } else {
                    this.f14895g += a10;
                    j11 -= a10;
                }
            }
            int i12 = this.f14892c.f14901e;
            int i13 = this.f14895g / i12;
            if (i13 > 0) {
                long d10 = this.f + com.applovin.exoplayer2.l.ai.d(this.f14896h, 1000000L, r1.f14899c);
                int i14 = i13 * i12;
                int i15 = this.f14895g - i14;
                this.f14891b.a(d10, 1, i14, i15, null);
                this.f14896h += i13;
                this.f14895g = i15;
            }
            return j11 <= 0;
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        b bVar = this.f14875d;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        a();
        if (this.f14875d == null) {
            com.applovin.exoplayer2.e.j.b a10 = com.applovin.exoplayer2.e.j.c.a(iVar);
            if (a10 != null) {
                int i10 = a10.f14897a;
                if (i10 == 17) {
                    this.f14875d = new C0170a(this.f14873b, this.f14874c, a10);
                } else if (i10 == 6) {
                    this.f14875d = new c(this.f14873b, this.f14874c, a10, o.f9089x, -1);
                } else if (i10 == 7) {
                    this.f14875d = new c(this.f14873b, this.f14874c, a10, o.y, -1);
                } else {
                    int a11 = com.applovin.exoplayer2.b.y.a(i10, a10.f);
                    if (a11 != 0) {
                        this.f14875d = new c(this.f14873b, this.f14874c, a10, o.f9088w, a11);
                    } else {
                        throw ai.a("Unsupported WAV format type: " + a10.f14897a);
                    }
                }
            } else {
                throw ai.b("Unsupported or unrecognized wav header.", null);
            }
        }
        if (this.f14876e == -1) {
            Pair<Long, Long> b10 = com.applovin.exoplayer2.e.j.c.b(iVar);
            this.f14876e = ((Long) b10.first).intValue();
            long longValue = ((Long) b10.second).longValue();
            this.f = longValue;
            this.f14875d.a(this.f14876e, longValue);
        } else if (iVar.c() == 0) {
            iVar.b(this.f14876e);
        }
        com.applovin.exoplayer2.l.a.b(this.f != -1);
        return this.f14875d.a(iVar, this.f - iVar.c()) ? -1 : 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f14874c);
        com.applovin.exoplayer2.l.ai.a(this.f14873b);
    }
}
