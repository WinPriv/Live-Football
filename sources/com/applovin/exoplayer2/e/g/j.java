package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f14437a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return a(iVar, true, false);
    }

    public static boolean a(com.applovin.exoplayer2.e.i iVar, boolean z10) throws IOException {
        return a(iVar, false, z10);
    }

    private static boolean a(com.applovin.exoplayer2.e.i iVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        boolean z16;
        long d10 = iVar.d();
        long j10 = -1;
        int i11 = (d10 > (-1L) ? 1 : (d10 == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && d10 <= 4096) {
            j11 = d10;
        }
        int i12 = (int) j11;
        y yVar = new y(64);
        boolean z17 = false;
        int i13 = 0;
        boolean z18 = false;
        while (i13 < i12) {
            yVar.a(8);
            if (!iVar.b(yVar.d(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long o = yVar.o();
            int q10 = yVar.q();
            if (o == 1) {
                iVar.d(yVar.d(), 8, 8);
                yVar.c(16);
                i10 = 16;
                o = yVar.s();
            } else {
                if (o == 0) {
                    long d11 = iVar.d();
                    if (d11 != j10) {
                        o = (d11 - iVar.b()) + 8;
                    }
                }
                i10 = 8;
            }
            long j12 = i10;
            if (o < j12) {
                return z17;
            }
            i13 += i10;
            if (q10 == 1836019574) {
                i12 += (int) o;
                if (i11 != 0 && i12 > d10) {
                    i12 = (int) d10;
                }
            } else {
                if (q10 == 1836019558 || q10 == 1836475768) {
                    z12 = z17 ? 1 : 0;
                    z13 = true;
                    z14 = true;
                    break;
                }
                int i14 = i11;
                if ((i13 + o) - j12 >= i12) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i15 = (int) (o - j12);
                i13 += i15;
                if (q10 != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i15 != 0) {
                        iVar.c(i15);
                        z18 = z18;
                    }
                } else {
                    if (i15 < 8) {
                        return false;
                    }
                    yVar.a(i15);
                    iVar.d(yVar.d(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            z16 = z18;
                            break;
                        }
                        if (i17 == 1) {
                            yVar.e(4);
                        } else if (a(yVar.q(), z11)) {
                            z16 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z16) {
                        return false;
                    }
                    z15 = false;
                    z18 = z16;
                }
                z17 = z15;
                i11 = i14;
            }
            j10 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12;
        return (z18 && z10 == z14) ? z13 : z12;
    }

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f14437a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }
}
