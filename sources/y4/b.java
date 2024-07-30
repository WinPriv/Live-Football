package y4;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.g0;
import d6.w;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p4.m;
import p4.n;
import p4.o;
import p4.p;
import p4.u;
import y4.h;

/* compiled from: FlacReader.java */
/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: n, reason: collision with root package name */
    public p f36660n;
    public a o;

    /* compiled from: FlacReader.java */
    /* loaded from: classes2.dex */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final p f36661a;

        /* renamed from: b, reason: collision with root package name */
        public final p.a f36662b;

        /* renamed from: c, reason: collision with root package name */
        public long f36663c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f36664d = -1;

        public a(p pVar, p.a aVar) {
            this.f36661a = pVar;
            this.f36662b = aVar;
        }

        @Override // y4.f
        public final long a(p4.e eVar) {
            long j10 = this.f36664d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f36664d = -1L;
            return j11;
        }

        @Override // y4.f
        public final u b() {
            boolean z10;
            if (this.f36663c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            return new o(this.f36661a, this.f36663c);
        }

        @Override // y4.f
        public final void c(long j10) {
            long[] jArr = this.f36662b.f34339a;
            this.f36664d = jArr[g0.f(jArr, j10, true)];
        }
    }

    @Override // y4.h
    public final long b(w wVar) {
        boolean z10;
        byte[] bArr = wVar.f27384a;
        if (bArr[0] == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return -1L;
        }
        int i10 = (bArr[2] & DefaultClassResolver.NAME) >> 4;
        if (i10 == 6 || i10 == 7) {
            wVar.F(4);
            wVar.z();
        }
        int b10 = m.b(i10, wVar);
        wVar.E(0);
        return b10;
    }

    @Override // y4.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(w wVar, long j10, h.a aVar) {
        boolean z10;
        byte[] bArr = wVar.f27384a;
        p pVar = this.f36660n;
        if (pVar == null) {
            p pVar2 = new p(bArr, 17);
            this.f36660n = pVar2;
            aVar.f36693a = pVar2.c(Arrays.copyOfRange(bArr, 9, wVar.f27386c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Ascii.DEL) == 3) {
            p.a a10 = n.a(wVar);
            p pVar3 = new p(pVar.f34328a, pVar.f34329b, pVar.f34330c, pVar.f34331d, pVar.f34332e, pVar.f34333g, pVar.f34334h, pVar.f34336j, a10, pVar.f34338l);
            this.f36660n = pVar3;
            this.o = new a(pVar3, a10);
            return true;
        }
        if (b10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.f36663c = j10;
            aVar.f36694b = aVar2;
        }
        aVar.f36693a.getClass();
        return false;
    }

    @Override // y4.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f36660n = null;
            this.o = null;
        }
    }
}
