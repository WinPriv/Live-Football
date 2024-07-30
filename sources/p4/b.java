package p4;

/* compiled from: CeaUtil.java */
/* loaded from: classes2.dex */
public final class b {
    public static void a(long j10, d6.w wVar, w[] wVarArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (wVar.f27386c - wVar.f27385b > 1) {
                int i12 = 0;
                while (true) {
                    if (wVar.f27386c - wVar.f27385b == 0) {
                        i10 = -1;
                        break;
                    }
                    int t10 = wVar.t();
                    i12 += t10;
                    if (t10 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (wVar.f27386c - wVar.f27385b == 0) {
                        i13 = -1;
                        break;
                    }
                    int t11 = wVar.t();
                    i13 += t11;
                    if (t11 != 255) {
                        break;
                    }
                }
                int i14 = wVar.f27385b;
                int i15 = i14 + i13;
                if (i13 != -1 && i13 <= wVar.f27386c - i14) {
                    if (i10 == 4 && i13 >= 8) {
                        int t12 = wVar.t();
                        int y = wVar.y();
                        if (y == 49) {
                            i11 = wVar.d();
                        } else {
                            i11 = 0;
                        }
                        int t13 = wVar.t();
                        if (y == 47) {
                            wVar.F(1);
                        }
                        if (t12 == 181 && ((y == 49 || y == 47) && t13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (y == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, wVar, wVarArr);
                        }
                    }
                } else {
                    d6.p.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i15 = wVar.f27386c;
                }
                wVar.E(i15);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, d6.w wVar, w[] wVarArr) {
        boolean z10;
        int t10 = wVar.t();
        if ((t10 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        wVar.F(1);
        int i10 = (t10 & 31) * 3;
        int i11 = wVar.f27385b;
        for (w wVar2 : wVarArr) {
            wVar.E(i11);
            wVar2.f(i10, wVar);
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                wVar2.c(j10, 1, i10, 0, null);
            }
        }
    }
}
