package com.applovin.exoplayer2.e;

/* loaded from: classes.dex */
public final class b {
    public static void a(long j10, com.applovin.exoplayer2.l.y yVar, x[] xVarArr) {
        while (true) {
            if (yVar.a() <= 1) {
                return;
            }
            int a10 = a(yVar);
            int a11 = a(yVar);
            int c10 = yVar.c() + a11;
            if (a11 == -1 || a11 > yVar.a()) {
                com.applovin.exoplayer2.l.q.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                c10 = yVar.b();
            } else if (a10 == 4 && a11 >= 8) {
                int h10 = yVar.h();
                int i10 = yVar.i();
                int q10 = i10 == 49 ? yVar.q() : 0;
                int h11 = yVar.h();
                if (i10 == 47) {
                    yVar.e(1);
                }
                boolean z10 = h10 == 181 && (i10 == 49 || i10 == 47) && h11 == 3;
                if (i10 == 49) {
                    z10 &= q10 == 1195456820;
                }
                if (z10) {
                    b(j10, yVar, xVarArr);
                }
            }
            yVar.d(c10);
        }
    }

    public static void b(long j10, com.applovin.exoplayer2.l.y yVar, x[] xVarArr) {
        boolean z10;
        int h10 = yVar.h();
        if ((h10 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        yVar.e(1);
        int i10 = (h10 & 31) * 3;
        int c10 = yVar.c();
        for (x xVar : xVarArr) {
            yVar.d(c10);
            xVar.a(yVar, i10);
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                xVar.a(j10, 1, i10, 0, null);
            }
        }
    }

    private static int a(com.applovin.exoplayer2.l.y yVar) {
        int i10 = 0;
        while (yVar.a() != 0) {
            int h10 = yVar.h();
            i10 += h10;
            if (h10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
