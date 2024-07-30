package z4;

import d6.g0;
import java.io.IOException;
import p4.a;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes2.dex */
public final class a0 extends p4.a {

    /* compiled from: TsBinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final d6.d0 f36981a;

        /* renamed from: b, reason: collision with root package name */
        public final d6.w f36982b = new d6.w();

        /* renamed from: c, reason: collision with root package name */
        public final int f36983c;

        /* renamed from: d, reason: collision with root package name */
        public final int f36984d;

        public a(int i10, d6.d0 d0Var, int i11) {
            this.f36983c = i10;
            this.f36981a = d0Var;
            this.f36984d = i11;
        }

        @Override // p4.a.f
        public final a.e a(p4.e eVar, long j10) throws IOException {
            long j11 = eVar.f34314d;
            int min = (int) Math.min(this.f36984d, eVar.f34313c - j11);
            d6.w wVar = this.f36982b;
            wVar.B(min);
            eVar.c(wVar.f27384a, 0, min, false);
            int i10 = wVar.f27386c;
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (true) {
                int i11 = wVar.f27386c;
                int i12 = wVar.f27385b;
                if (i11 - i12 < 188) {
                    break;
                }
                byte[] bArr = wVar.f27384a;
                while (i12 < i10 && bArr[i12] != 71) {
                    i12++;
                }
                int i13 = i12 + 188;
                if (i13 > i10) {
                    break;
                }
                long H0 = androidx.activity.n.H0(i12, this.f36983c, wVar);
                if (H0 != com.anythink.expressad.exoplayer.b.f7291b) {
                    long b10 = this.f36981a.b(H0);
                    if (b10 > j10) {
                        if (j14 == com.anythink.expressad.exoplayer.b.f7291b) {
                            return new a.e(-1, b10, j11);
                        }
                        return a.e.a(j11 + j13);
                    }
                    if (100000 + b10 > j10) {
                        return a.e.a(j11 + i12);
                    }
                    j13 = i12;
                    j14 = b10;
                }
                wVar.E(i13);
                j12 = i13;
            }
            if (j14 != com.anythink.expressad.exoplayer.b.f7291b) {
                return new a.e(-2, j14, j11 + j12);
            }
            return a.e.f34296d;
        }

        @Override // p4.a.f
        public final void b() {
            byte[] bArr = g0.f;
            d6.w wVar = this.f36982b;
            wVar.getClass();
            wVar.C(bArr.length, bArr);
        }
    }

    public a0(d6.d0 d0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, d0Var, i11), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}
