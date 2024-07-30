package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f15461a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15462b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f15463c;

    /* renamed from: d, reason: collision with root package name */
    private a f15464d;

    /* renamed from: e, reason: collision with root package name */
    private a f15465e;
    private a f;

    /* renamed from: g, reason: collision with root package name */
    private long f15466g;

    public v(com.applovin.exoplayer2.k.b bVar) {
        this.f15461a = bVar;
        int c10 = bVar.c();
        this.f15462b = c10;
        this.f15463c = new com.applovin.exoplayer2.l.y(32);
        a aVar = new a(0L, c10);
        this.f15464d = aVar;
        this.f15465e = aVar;
        this.f = aVar;
    }

    public void a() {
        a(this.f15464d);
        a aVar = new a(0L, this.f15462b);
        this.f15464d = aVar;
        this.f15465e = aVar;
        this.f = aVar;
        this.f15466g = 0L;
        this.f15461a.b();
    }

    public void b() {
        this.f15465e = this.f15464d;
    }

    public long c() {
        return this.f15466g;
    }

    public void b(com.applovin.exoplayer2.c.g gVar, w.a aVar) {
        a(this.f15465e, gVar, aVar, this.f15463c);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f15467a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15468b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15469c;

        /* renamed from: d, reason: collision with root package name */
        public com.applovin.exoplayer2.k.a f15470d;

        /* renamed from: e, reason: collision with root package name */
        public a f15471e;

        public a(long j10, int i10) {
            this.f15467a = j10;
            this.f15468b = j10 + i10;
        }

        public void a(com.applovin.exoplayer2.k.a aVar, a aVar2) {
            this.f15470d = aVar;
            this.f15471e = aVar2;
            this.f15469c = true;
        }

        public int a(long j10) {
            return ((int) (j10 - this.f15467a)) + this.f15470d.f16052b;
        }

        public a a() {
            this.f15470d = null;
            a aVar = this.f15471e;
            this.f15471e = null;
            return aVar;
        }
    }

    private void b(int i10) {
        long j10 = this.f15466g + i10;
        this.f15466g = j10;
        a aVar = this.f;
        if (j10 == aVar.f15468b) {
            this.f = aVar.f15471e;
        }
    }

    private static a b(a aVar, com.applovin.exoplayer2.c.g gVar, w.a aVar2, com.applovin.exoplayer2.l.y yVar) {
        long j10 = aVar2.f15496b;
        int i10 = 1;
        yVar.a(1);
        a a10 = a(aVar, j10, yVar.d(), 1);
        long j11 = j10 + 1;
        byte b10 = yVar.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Ascii.DEL;
        com.applovin.exoplayer2.c.c cVar = gVar.f13644a;
        byte[] bArr = cVar.f13623a;
        if (bArr == null) {
            cVar.f13623a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a a11 = a(a10, j11, cVar.f13623a, i11);
        long j12 = j11 + i11;
        if (z10) {
            yVar.a(2);
            a11 = a(a11, j12, yVar.d(), 2);
            j12 += 2;
            i10 = yVar.i();
        }
        int i12 = i10;
        int[] iArr = cVar.f13626d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f13627e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            yVar.a(i13);
            a11 = a(a11, j12, yVar.d(), i13);
            j12 += i13;
            yVar.d(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = yVar.i();
                iArr4[i14] = yVar.w();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f15495a - ((int) (j12 - aVar2.f15496b));
        }
        x.a aVar3 = (x.a) ai.a(aVar2.f15497c);
        cVar.a(i12, iArr2, iArr4, aVar3.f14946b, cVar.f13623a, aVar3.f14945a, aVar3.f14947c, aVar3.f14948d);
        long j13 = aVar2.f15496b;
        int i15 = (int) (j12 - j13);
        aVar2.f15496b = j13 + i15;
        aVar2.f15495a -= i15;
        return a11;
    }

    public void a(com.applovin.exoplayer2.c.g gVar, w.a aVar) {
        this.f15465e = a(this.f15465e, gVar, aVar, this.f15463c);
    }

    public void a(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f15464d;
            if (j10 < aVar.f15468b) {
                break;
            }
            this.f15461a.a(aVar.f15470d);
            this.f15464d = this.f15464d.a();
        }
        if (this.f15465e.f15467a < aVar.f15467a) {
            this.f15465e = aVar;
        }
    }

    public int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10) throws IOException {
        int a10 = a(i10);
        a aVar = this.f;
        int a11 = gVar.a(aVar.f15470d.f16051a, aVar.a(this.f15466g), a10);
        if (a11 != -1) {
            b(a11);
            return a11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(com.applovin.exoplayer2.l.y yVar, int i10) {
        while (i10 > 0) {
            int a10 = a(i10);
            a aVar = this.f;
            yVar.a(aVar.f15470d.f16051a, aVar.a(this.f15466g), a10);
            i10 -= a10;
            b(a10);
        }
    }

    private void a(a aVar) {
        if (aVar.f15469c) {
            a aVar2 = this.f;
            int i10 = (((int) (aVar2.f15467a - aVar.f15467a)) / this.f15462b) + (aVar2.f15469c ? 1 : 0);
            com.applovin.exoplayer2.k.a[] aVarArr = new com.applovin.exoplayer2.k.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f15470d;
                aVar = aVar.a();
            }
            this.f15461a.a(aVarArr);
        }
    }

    private int a(int i10) {
        a aVar = this.f;
        if (!aVar.f15469c) {
            aVar.a(this.f15461a.a(), new a(this.f.f15468b, this.f15462b));
        }
        return Math.min(i10, (int) (this.f.f15468b - this.f15466g));
    }

    private static a a(a aVar, com.applovin.exoplayer2.c.g gVar, w.a aVar2, com.applovin.exoplayer2.l.y yVar) {
        if (gVar.g()) {
            aVar = b(aVar, gVar, aVar2, yVar);
        }
        if (gVar.e()) {
            yVar.a(4);
            a a10 = a(aVar, aVar2.f15496b, yVar.d(), 4);
            int w10 = yVar.w();
            aVar2.f15496b += 4;
            aVar2.f15495a -= 4;
            gVar.f(w10);
            a a11 = a(a10, aVar2.f15496b, gVar.f13645b, w10);
            aVar2.f15496b += w10;
            int i10 = aVar2.f15495a - w10;
            aVar2.f15495a = i10;
            gVar.e(i10);
            return a(a11, aVar2.f15496b, gVar.f13648e, aVar2.f15495a);
        }
        gVar.f(aVar2.f15495a);
        return a(aVar, aVar2.f15496b, gVar.f13645b, aVar2.f15495a);
    }

    private static a a(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a a10 = a(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (a10.f15468b - j10));
            byteBuffer.put(a10.f15470d.f16051a, a10.a(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == a10.f15468b) {
                a10 = a10.f15471e;
            }
        }
        return a10;
    }

    private static a a(a aVar, long j10, byte[] bArr, int i10) {
        a a10 = a(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (a10.f15468b - j10));
            System.arraycopy(a10.f15470d.f16051a, a10.a(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == a10.f15468b) {
                a10 = a10.f15471e;
            }
        }
        return a10;
    }

    private static a a(a aVar, long j10) {
        while (j10 >= aVar.f15468b) {
            aVar = aVar.f15471e;
        }
        return aVar;
    }
}
