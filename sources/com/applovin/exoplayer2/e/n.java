package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.e.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public p f14912a;

        public a(p pVar) {
            this.f14912a = pVar;
        }
    }

    public static com.applovin.exoplayer2.g.a a(i iVar, boolean z10) throws IOException {
        com.applovin.exoplayer2.g.a a10 = new s().a(iVar, z10 ? null : com.applovin.exoplayer2.g.e.g.f15157a);
        if (a10 == null || a10.a() == 0) {
            return null;
        }
        return a10;
    }

    public static com.applovin.exoplayer2.g.a b(i iVar, boolean z10) throws IOException {
        iVar.a();
        long b10 = iVar.b();
        com.applovin.exoplayer2.g.a a10 = a(iVar, z10);
        iVar.b((int) (iVar.b() - b10));
        return a10;
    }

    public static int c(i iVar) throws IOException {
        iVar.a();
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(2);
        iVar.d(yVar.d(), 0, 2);
        int i10 = yVar.i();
        if ((i10 >> 2) == 16382) {
            iVar.a();
            return i10;
        }
        iVar.a();
        throw ai.b("First frame does not start with sync code.", null);
    }

    private static p d(i iVar) throws IOException {
        byte[] bArr = new byte[38];
        iVar.b(bArr, 0, 38);
        return new p(bArr, 4);
    }

    public static boolean a(i iVar) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        iVar.d(yVar.d(), 0, 4);
        return yVar.o() == 1716281667;
    }

    public static void b(i iVar) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        iVar.b(yVar.d(), 0, 4);
        if (yVar.o() != 1716281667) {
            throw ai.b("Failed to read FLAC stream marker.", null);
        }
    }

    public static boolean a(i iVar, a aVar) throws IOException {
        iVar.a();
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[4]);
        iVar.d(xVar.f16363a, 0, 4);
        boolean e10 = xVar.e();
        int c10 = xVar.c(7);
        int c11 = xVar.c(24) + 4;
        if (c10 == 0) {
            aVar.f14912a = d(iVar);
        } else {
            p pVar = aVar.f14912a;
            if (pVar == null) {
                throw new IllegalArgumentException();
            }
            if (c10 == 3) {
                aVar.f14912a = pVar.a(a(iVar, c11));
            } else if (c10 == 4) {
                aVar.f14912a = pVar.a(b(iVar, c11));
            } else if (c10 == 6) {
                aVar.f14912a = pVar.b(Collections.singletonList(c(iVar, c11)));
            } else {
                iVar.b(c11);
            }
        }
        return e10;
    }

    private static com.applovin.exoplayer2.g.c.a c(i iVar, int i10) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        iVar.b(yVar.d(), 0, i10);
        yVar.e(4);
        int q10 = yVar.q();
        String a10 = yVar.a(yVar.q(), Charsets.US_ASCII);
        String f = yVar.f(yVar.q());
        int q11 = yVar.q();
        int q12 = yVar.q();
        int q13 = yVar.q();
        int q14 = yVar.q();
        int q15 = yVar.q();
        byte[] bArr = new byte[q15];
        yVar.a(bArr, 0, q15);
        return new com.applovin.exoplayer2.g.c.a(q10, a10, f, q11, q12, q13, q14, bArr);
    }

    private static List<String> b(i iVar, int i10) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        iVar.b(yVar.d(), 0, i10);
        yVar.e(4);
        return Arrays.asList(z.a(yVar, false, false).f14959b);
    }

    public static p.a a(com.applovin.exoplayer2.l.y yVar) {
        yVar.e(1);
        int m10 = yVar.m();
        long c10 = yVar.c() + m10;
        int i10 = m10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long s10 = yVar.s();
            if (s10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = s10;
            jArr2[i11] = yVar.s();
            yVar.e(2);
            i11++;
        }
        yVar.e((int) (c10 - yVar.c()));
        return new p.a(jArr, jArr2);
    }

    private static p.a a(i iVar, int i10) throws IOException {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        iVar.b(yVar.d(), 0, i10);
        return a(yVar);
    }
}
