package com.applovin.exoplayer2.e.h;

import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.e.z;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: a, reason: collision with root package name */
    private a f14531a;

    /* renamed from: b, reason: collision with root package name */
    private int f14532b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14533c;

    /* renamed from: d, reason: collision with root package name */
    private z.d f14534d;

    /* renamed from: e, reason: collision with root package name */
    private z.b f14535e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final z.d f14536a;

        /* renamed from: b, reason: collision with root package name */
        public final z.b f14537b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f14538c;

        /* renamed from: d, reason: collision with root package name */
        public final z.c[] f14539d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14540e;

        public a(z.d dVar, z.b bVar, byte[] bArr, z.c[] cVarArr, int i10) {
            this.f14536a = dVar;
            this.f14537b = bVar;
            this.f14538c = bArr;
            this.f14539d = cVarArr;
            this.f14540e = i10;
        }
    }

    public static int a(byte b10, int i10, int i11) {
        return (b10 >> i11) & (p.f9095b >>> (8 - i10));
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public long b(y yVar) {
        int i10 = 0;
        if ((yVar.d()[0] & 1) == 1) {
            return -1L;
        }
        int a10 = a(yVar.d()[0], (a) com.applovin.exoplayer2.l.a.a(this.f14531a));
        if (this.f14533c) {
            i10 = (this.f14532b + a10) / 4;
        }
        long j10 = i10;
        a(yVar, j10);
        this.f14533c = true;
        this.f14532b = a10;
        return j10;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void c(long j10) {
        super.c(j10);
        this.f14533c = j10 != 0;
        z.d dVar = this.f14534d;
        this.f14532b = dVar != null ? dVar.f14970g : 0;
    }

    public static boolean a(y yVar) {
        try {
            return z.a(1, yVar, true);
        } catch (ai unused) {
            return false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f14531a = null;
            this.f14534d = null;
            this.f14535e = null;
        }
        this.f14532b = 0;
        this.f14533c = false;
    }

    public a c(y yVar) throws IOException {
        z.d dVar = this.f14534d;
        if (dVar == null) {
            this.f14534d = z.a(yVar);
            return null;
        }
        z.b bVar = this.f14535e;
        if (bVar == null) {
            this.f14535e = z.b(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.b()];
        System.arraycopy(yVar.d(), 0, bArr, 0, yVar.b());
        return new a(dVar, bVar, bArr, z.a(yVar, dVar.f14966b), z.a(r4.length - 1));
    }

    @Override // com.applovin.exoplayer2.e.h.h
    public boolean a(y yVar, long j10, h.a aVar) throws IOException {
        if (this.f14531a != null) {
            com.applovin.exoplayer2.l.a.b(aVar.f14529a);
            return false;
        }
        a c10 = c(yVar);
        this.f14531a = c10;
        if (c10 == null) {
            return true;
        }
        z.d dVar = c10.f14536a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f14973j);
        arrayList.add(c10.f14538c);
        aVar.f14529a = new v.a().f(o.G).d(dVar.f14969e).e(dVar.f14968d).k(dVar.f14966b).l(dVar.f14967c).a(arrayList).a();
        return true;
    }

    public static void a(y yVar, long j10) {
        if (yVar.e() < yVar.b() + 4) {
            yVar.a(Arrays.copyOf(yVar.d(), yVar.b() + 4));
        } else {
            yVar.c(yVar.b() + 4);
        }
        byte[] d10 = yVar.d();
        d10[yVar.b() - 4] = (byte) (j10 & 255);
        d10[yVar.b() - 3] = (byte) ((j10 >>> 8) & 255);
        d10[yVar.b() - 2] = (byte) ((j10 >>> 16) & 255);
        d10[yVar.b() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int a(byte b10, a aVar) {
        if (!aVar.f14539d[a(b10, aVar.f14540e, 1)].f14961a) {
            return aVar.f14536a.f14970g;
        }
        return aVar.f14536a.f14971h;
    }
}
