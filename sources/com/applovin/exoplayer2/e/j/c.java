package com.applovin.exoplayer2.e.j;

import android.util.Pair;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* loaded from: classes.dex */
final class c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14903a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14904b;

        private a(int i10, long j10) {
            this.f14903a = i10;
            this.f14904b = j10;
        }

        public static a a(i iVar, y yVar) throws IOException {
            iVar.d(yVar.d(), 0, 8);
            yVar.d(0);
            return new a(yVar.q(), yVar.p());
        }
    }

    public static b a(i iVar) throws IOException {
        boolean z10;
        byte[] bArr;
        com.applovin.exoplayer2.l.a.b(iVar);
        y yVar = new y(16);
        if (a.a(iVar, yVar).f14903a != 1380533830) {
            return null;
        }
        iVar.d(yVar.d(), 0, 4);
        yVar.d(0);
        int q10 = yVar.q();
        if (q10 != 1463899717) {
            q.d("WavHeaderReader", "Unsupported RIFF format: " + q10);
            return null;
        }
        a a10 = a.a(iVar, yVar);
        while (a10.f14903a != 1718449184) {
            iVar.c((int) a10.f14904b);
            a10 = a.a(iVar, yVar);
        }
        if (a10.f14904b >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        iVar.d(yVar.d(), 0, 16);
        yVar.d(0);
        int j10 = yVar.j();
        int j11 = yVar.j();
        int x10 = yVar.x();
        int x11 = yVar.x();
        int j12 = yVar.j();
        int j13 = yVar.j();
        int i10 = ((int) a10.f14904b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            iVar.d(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = ai.f;
        }
        return new b(j10, j11, x10, x11, j12, j13, bArr);
    }

    public static Pair<Long, Long> b(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.b(iVar);
        iVar.a();
        y yVar = new y(8);
        a a10 = a.a(iVar, yVar);
        while (true) {
            int i10 = a10.f14903a;
            if (i10 != 1684108385) {
                if (i10 != 1380533830 && i10 != 1718449184) {
                    q.c("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f14903a);
                }
                long j10 = a10.f14904b + 8;
                if (a10.f14903a == 1380533830) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    iVar.b((int) j10);
                    a10 = a.a(iVar, yVar);
                } else {
                    throw com.applovin.exoplayer2.ai.a("Chunk is too large (~2GB+) to skip; id: " + a10.f14903a);
                }
            } else {
                iVar.b(8);
                long c10 = iVar.c();
                long j11 = a10.f14904b + c10;
                long d10 = iVar.d();
                if (d10 != -1 && j11 > d10) {
                    StringBuilder k10 = com.ironsource.adapters.facebook.a.k("Data exceeds input length: ", j11, ", ");
                    k10.append(d10);
                    q.c("WavHeaderReader", k10.toString());
                    j11 = d10;
                }
                return Pair.create(Long.valueOf(c10), Long.valueOf(j11));
            }
        }
    }
}
