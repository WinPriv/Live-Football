package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f14911a;
    }

    public static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, int i10, a aVar) {
        int c10 = yVar.c();
        long o = yVar.o();
        long j10 = o >>> 16;
        if (j10 != i10) {
            return false;
        }
        return a((int) ((o >> 4) & 15), pVar) && b((int) ((o >> 1) & 7), pVar) && !(((o & 1) > 1L ? 1 : ((o & 1) == 1L ? 0 : -1)) == 0) && a(yVar, pVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(yVar, pVar, (int) ((o >> 12) & 15)) && b(yVar, pVar, (int) ((o >> 8) & 15)) && b(yVar, c10);
    }

    private static boolean b(int i10, p pVar) {
        return i10 == 0 || i10 == pVar.f14922i;
    }

    private static boolean b(com.applovin.exoplayer2.l.y yVar, p pVar, int i10) {
        int i11 = pVar.f14919e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == pVar.f;
        }
        if (i10 == 12) {
            return yVar.h() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int i12 = yVar.i();
        if (i10 == 14) {
            i12 *= 10;
        }
        return i12 == i11;
    }

    private static boolean b(com.applovin.exoplayer2.l.y yVar, int i10) {
        return yVar.h() == ai.b(yVar.d(), i10, yVar.c() - 1, 0);
    }

    public static boolean a(i iVar, p pVar, int i10, a aVar) throws IOException {
        long b10 = iVar.b();
        byte[] bArr = new byte[2];
        iVar.d(bArr, 0, 2);
        if ((((bArr[0] & DefaultClassResolver.NAME) << 8) | (bArr[1] & DefaultClassResolver.NAME)) != i10) {
            iVar.a();
            iVar.c((int) (b10 - iVar.c()));
            return false;
        }
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(16);
        System.arraycopy(bArr, 0, yVar.d(), 0, 2);
        yVar.c(k.a(iVar, yVar.d(), 2, 14));
        iVar.a();
        iVar.c((int) (b10 - iVar.c()));
        return a(yVar, pVar, i10, aVar);
    }

    public static long a(i iVar, p pVar) throws IOException {
        iVar.a();
        iVar.c(1);
        byte[] bArr = new byte[1];
        iVar.d(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        iVar.c(2);
        int i10 = z10 ? 7 : 6;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        yVar.c(k.a(iVar, yVar.d(), 0, i10));
        iVar.a();
        a aVar = new a();
        if (a(yVar, pVar, z10, aVar)) {
            return aVar.f14911a;
        }
        throw com.applovin.exoplayer2.ai.b(null, null);
    }

    public static int a(com.applovin.exoplayer2.l.y yVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return yVar.h() + 1;
            case 7:
                return yVar.i() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    private static boolean a(int i10, p pVar) {
        return i10 <= 7 ? i10 == pVar.f14920g - 1 : i10 <= 10 && pVar.f14920g == 2;
    }

    private static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, boolean z10, a aVar) {
        try {
            long D = yVar.D();
            if (!z10) {
                D *= pVar.f14916b;
            }
            aVar.f14911a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, int i10) {
        int a10 = a(yVar, i10);
        return a10 != -1 && a10 <= pVar.f14916b;
    }
}
