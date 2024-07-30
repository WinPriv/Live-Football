package com.anythink.expressad.exoplayer.e.a;

import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.s;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7887a = 4096;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7888b = {af.f("isom"), af.f("iso2"), af.f("iso3"), af.f("iso4"), af.f("iso5"), af.f("iso6"), af.f("avc1"), af.f("hvc1"), af.f("hev1"), af.f("mp41"), af.f("mp42"), af.f("3g2a"), af.f("3g2b"), af.f("3gr6"), af.f("3gs6"), af.f("3ge6"), af.f("3gg6"), af.f("M4V "), af.f("M4A "), af.f("f4v "), af.f("kddi"), af.f("M4VP"), af.f("qt  "), af.f("MSNV")};

    private i() {
    }

    public static boolean a(com.anythink.expressad.exoplayer.e.f fVar) {
        return a(fVar, true);
    }

    public static boolean b(com.anythink.expressad.exoplayer.e.f fVar) {
        return a(fVar, false);
    }

    private static boolean a(com.anythink.expressad.exoplayer.e.f fVar, boolean z10) {
        boolean z11;
        int i10;
        long d10 = fVar.d();
        long j10 = -1;
        if (d10 == -1 || d10 > 4096) {
            d10 = 4096;
        }
        int i11 = (int) d10;
        s sVar = new s(64);
        int i12 = 0;
        boolean z12 = false;
        while (i12 < i11) {
            sVar.a(8);
            fVar.d(sVar.f9123a, 0, 8);
            long h10 = sVar.h();
            int i13 = sVar.i();
            if (h10 == 1) {
                fVar.d(sVar.f9123a, 8, 8);
                sVar.b(16);
                i10 = 16;
                h10 = sVar.n();
            } else {
                if (h10 == 0) {
                    long d11 = fVar.d();
                    if (d11 != j10) {
                        h10 = 8 + (d11 - fVar.c());
                    }
                }
                i10 = 8;
            }
            long j11 = i10;
            if (h10 >= j11) {
                i12 += i10;
                if (i13 != a.G) {
                    if (i13 != a.P && i13 != a.R) {
                        if ((i12 + h10) - j11 >= i11) {
                            break;
                        }
                        int i14 = (int) (h10 - j11);
                        i12 += i14;
                        if (i13 == a.f) {
                            if (i14 < 8) {
                                return false;
                            }
                            sVar.a(i14);
                            fVar.d(sVar.f9123a, 0, i14);
                            int i15 = i14 / 4;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= i15) {
                                    break;
                                }
                                if (i16 == 1) {
                                    sVar.d(4);
                                } else if (a(sVar.i())) {
                                    z12 = true;
                                    break;
                                }
                                i16++;
                            }
                            if (!z12) {
                                return false;
                            }
                        } else if (i14 != 0) {
                            fVar.e(i14);
                        }
                        j10 = -1;
                    } else {
                        z11 = true;
                        break;
                    }
                }
            } else {
                return false;
            }
        }
        z11 = false;
        return z12 && z10 == z11;
    }

    private static boolean a(int i10) {
        if ((i10 >>> 8) == af.f("3gp")) {
            return true;
        }
        for (int i11 : f7888b) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }
}
