package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    private p f14490a;

    /* renamed from: b, reason: collision with root package name */
    private a f14491b;

    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private p f14492a;

        /* renamed from: b, reason: collision with root package name */
        private p.a f14493b;

        /* renamed from: c, reason: collision with root package name */
        private long f14494c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f14495d = -1;

        public a(p pVar, p.a aVar) {
            this.f14492a = pVar;
            this.f14493b = aVar;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public long a(com.applovin.exoplayer2.e.i iVar) {
            long j10 = this.f14495d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f14495d = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f14494c = j10;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public v b() {
            com.applovin.exoplayer2.l.a.b(this.f14494c != -1);
            return new o(this.f14492a, this.f14494c);
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public void a(long j10) {
            long[] jArr = this.f14493b.f14926a;
            this.f14495d = jArr[ai.a(jArr, j10, true, true)];
        }
    }

    public static boolean a(y yVar) {
        return yVar.a() >= 5 && yVar.h() == 127 && yVar.o() == 1179402563;
    }

    private int c(y yVar) {
        int i10 = (yVar.d()[2] & DefaultClassResolver.NAME) >> 4;
        if (i10 == 6 || i10 == 7) {
            yVar.e(4);
            yVar.D();
        }
        int a10 = m.a(yVar, i10);
        yVar.d(0);
        return a10;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public long b(y yVar) {
        if (!a(yVar.d())) {
            return -1L;
        }
        return c(yVar);
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f14490a = null;
            this.f14491b = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public boolean a(y yVar, long j10, h.a aVar) {
        byte[] d10 = yVar.d();
        p pVar = this.f14490a;
        if (pVar == null) {
            p pVar2 = new p(d10, 17);
            this.f14490a = pVar2;
            aVar.f14529a = pVar2.a(Arrays.copyOfRange(d10, 9, yVar.b()), (com.applovin.exoplayer2.g.a) null);
            return true;
        }
        if ((d10[0] & Ascii.DEL) == 3) {
            p.a a10 = n.a(yVar);
            p a11 = pVar.a(a10);
            this.f14490a = a11;
            this.f14491b = new a(a11, a10);
            return true;
        }
        if (!a(d10)) {
            return true;
        }
        a aVar2 = this.f14491b;
        if (aVar2 != null) {
            aVar2.b(j10);
            aVar.f14530b = this.f14491b;
        }
        com.applovin.exoplayer2.l.a.b(aVar.f14529a);
        return false;
    }
}
