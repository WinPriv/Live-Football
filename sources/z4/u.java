package z4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.g0;
import java.io.IOException;
import p4.a;

/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes2.dex */
public final class u extends p4.a {

    /* compiled from: PsBinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final d6.d0 f37267a;

        /* renamed from: b, reason: collision with root package name */
        public final d6.w f37268b = new d6.w();

        public a(d6.d0 d0Var) {
            this.f37267a = d0Var;
        }

        @Override // p4.a.f
        public final a.e a(p4.e eVar, long j10) throws IOException {
            int d10;
            long j11 = eVar.f34314d;
            int min = (int) Math.min(20000L, eVar.f34313c - j11);
            d6.w wVar = this.f37268b;
            wVar.B(min);
            eVar.c(wVar.f27384a, 0, min, false);
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (true) {
                int i12 = wVar.f27386c;
                int i13 = wVar.f27385b;
                if (i12 - i13 >= 4) {
                    if (u.d(i13, wVar.f27384a) != 442) {
                        wVar.F(1);
                    } else {
                        wVar.F(4);
                        long c10 = v.c(wVar);
                        if (c10 != com.anythink.expressad.exoplayer.b.f7291b) {
                            long b10 = this.f37267a.b(c10);
                            if (b10 > j10) {
                                if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
                                    return new a.e(-1, b10, j11);
                                }
                                return a.e.a(j11 + i11);
                            }
                            if (100000 + b10 > j10) {
                                return a.e.a(j11 + wVar.f27385b);
                            }
                            i11 = wVar.f27385b;
                            j12 = b10;
                        }
                        int i14 = wVar.f27386c;
                        if (i14 - wVar.f27385b < 10) {
                            wVar.E(i14);
                        } else {
                            wVar.F(9);
                            int t10 = wVar.t() & 7;
                            if (wVar.f27386c - wVar.f27385b < t10) {
                                wVar.E(i14);
                            } else {
                                wVar.F(t10);
                                int i15 = wVar.f27386c;
                                int i16 = wVar.f27385b;
                                if (i15 - i16 < 4) {
                                    wVar.E(i14);
                                } else {
                                    if (u.d(i16, wVar.f27384a) == 443) {
                                        wVar.F(4);
                                        int y = wVar.y();
                                        if (wVar.f27386c - wVar.f27385b < y) {
                                            wVar.E(i14);
                                        } else {
                                            wVar.F(y);
                                        }
                                    }
                                    while (true) {
                                        int i17 = wVar.f27386c;
                                        int i18 = wVar.f27385b;
                                        if (i17 - i18 < 4 || (d10 = u.d(i18, wVar.f27384a)) == 442 || d10 == 441 || (d10 >>> 8) != 1) {
                                            break;
                                        }
                                        wVar.F(4);
                                        if (wVar.f27386c - wVar.f27385b < 2) {
                                            wVar.E(i14);
                                            break;
                                        }
                                        wVar.E(Math.min(wVar.f27386c, wVar.f27385b + wVar.y()));
                                    }
                                }
                            }
                        }
                        i10 = wVar.f27385b;
                    }
                } else {
                    if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                        return new a.e(-2, j12, j11 + i10);
                    }
                    return a.e.f34296d;
                }
            }
        }

        @Override // p4.a.f
        public final void b() {
            byte[] bArr = g0.f;
            d6.w wVar = this.f37268b;
            wVar.getClass();
            wVar.C(bArr.length, bArr);
        }
    }

    public u(d6.d0 d0Var, long j10, long j11) {
        super(new a.b(), new a(d0Var), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int d(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }
}
