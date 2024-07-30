package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14330a = ai.c("OpusHead");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14331a;

        /* renamed from: b, reason: collision with root package name */
        public int f14332b;

        /* renamed from: c, reason: collision with root package name */
        public int f14333c;

        /* renamed from: d, reason: collision with root package name */
        public long f14334d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f14335e;
        private final y f;

        /* renamed from: g, reason: collision with root package name */
        private final y f14336g;

        /* renamed from: h, reason: collision with root package name */
        private int f14337h;

        /* renamed from: i, reason: collision with root package name */
        private int f14338i;

        public a(y yVar, y yVar2, boolean z10) throws com.applovin.exoplayer2.ai {
            this.f14336g = yVar;
            this.f = yVar2;
            this.f14335e = z10;
            yVar2.d(12);
            this.f14331a = yVar2.w();
            yVar.d(12);
            this.f14338i = yVar.w();
            com.applovin.exoplayer2.e.k.a(yVar.q() == 1, "first_chunk must be 1");
            this.f14332b = -1;
        }

        public boolean a() {
            long o;
            int i10;
            int i11 = this.f14332b + 1;
            this.f14332b = i11;
            if (i11 == this.f14331a) {
                return false;
            }
            if (this.f14335e) {
                o = this.f.y();
            } else {
                o = this.f.o();
            }
            this.f14334d = o;
            if (this.f14332b == this.f14337h) {
                this.f14333c = this.f14336g.w();
                this.f14336g.e(4);
                int i12 = this.f14338i - 1;
                this.f14338i = i12;
                if (i12 > 0) {
                    i10 = this.f14336g.w() - 1;
                } else {
                    i10 = -1;
                }
                this.f14337h = i10;
            }
            return true;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0167b {
        int a();

        int b();

        int c();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final l[] f14339a;

        /* renamed from: b, reason: collision with root package name */
        public v f14340b;

        /* renamed from: c, reason: collision with root package name */
        public int f14341c;

        /* renamed from: d, reason: collision with root package name */
        public int f14342d = 0;

        public c(int i10) {
            this.f14339a = new l[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0167b {

        /* renamed from: a, reason: collision with root package name */
        private final int f14343a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14344b;

        /* renamed from: c, reason: collision with root package name */
        private final y f14345c;

        public d(a.b bVar, v vVar) {
            y yVar = bVar.f14329b;
            this.f14345c = yVar;
            yVar.d(12);
            int w10 = yVar.w();
            if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l)) {
                int c10 = ai.c(vVar.A, vVar.y);
                if (w10 == 0 || w10 % c10 != 0) {
                    q.c("AtomParsers", "Audio sample size mismatch. stsd sample size: " + c10 + ", stsz sample size: " + w10);
                    w10 = c10;
                }
            }
            this.f14343a = w10 == 0 ? -1 : w10;
            this.f14344b = yVar.w();
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0167b
        public int a() {
            return this.f14344b;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0167b
        public int b() {
            return this.f14343a;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0167b
        public int c() {
            int i10 = this.f14343a;
            if (i10 == -1) {
                return this.f14345c.w();
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements InterfaceC0167b {

        /* renamed from: a, reason: collision with root package name */
        private final y f14346a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14347b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14348c;

        /* renamed from: d, reason: collision with root package name */
        private int f14349d;

        /* renamed from: e, reason: collision with root package name */
        private int f14350e;

        public e(a.b bVar) {
            y yVar = bVar.f14329b;
            this.f14346a = yVar;
            yVar.d(12);
            this.f14348c = yVar.w() & com.anythink.expressad.exoplayer.k.p.f9095b;
            this.f14347b = yVar.w();
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0167b
        public int a() {
            return this.f14347b;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0167b
        public int b() {
            return -1;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0167b
        public int c() {
            int i10 = this.f14348c;
            if (i10 == 8) {
                return this.f14346a.h();
            }
            if (i10 == 16) {
                return this.f14346a.i();
            }
            int i11 = this.f14349d;
            this.f14349d = i11 + 1;
            if (i11 % 2 == 0) {
                int h10 = this.f14346a.h();
                this.f14350e = h10;
                return (h10 & 240) >> 4;
            }
            return this.f14350e & 15;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f14351a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14352b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14353c;

        public f(int i10, long j10, int i11) {
            this.f14351a = i10;
            this.f14352b = j10;
            this.f14353c = i11;
        }
    }

    private static int a(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static com.applovin.exoplayer2.g.a b(y yVar, int i10) {
        yVar.e(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.c() < i10) {
            a.InterfaceC0172a a10 = com.applovin.exoplayer2.e.g.f.a(yVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static com.applovin.exoplayer2.g.a c(y yVar, int i10) {
        yVar.e(12);
        while (yVar.c() < i10) {
            int c10 = yVar.c();
            int q10 = yVar.q();
            if (yVar.q() == 1935766900) {
                if (q10 < 14) {
                    return null;
                }
                yVar.e(5);
                int h10 = yVar.h();
                if (h10 != 12 && h10 != 13) {
                    return null;
                }
                float f10 = h10 == 12 ? 240.0f : 120.0f;
                yVar.e(1);
                return new com.applovin.exoplayer2.g.a(new com.applovin.exoplayer2.g.f.d(f10, yVar.h()));
            }
            yVar.d(c10 + q10);
        }
        return null;
    }

    private static int d(y yVar) {
        yVar.d(16);
        return yVar.q();
    }

    private static Pair<Long, String> e(y yVar) {
        yVar.d(8);
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(a10 == 0 ? 8 : 16);
        long o = yVar.o();
        yVar.e(a10 == 0 ? 4 : 8);
        int i10 = yVar.i();
        return Pair.create(Long.valueOf(o), "" + ((char) (((i10 >> 10) & 31) + 96)) + ((char) (((i10 >> 5) & 31) + 96)) + ((char) ((i10 & 31) + 96)));
    }

    private static int f(y yVar) {
        int h10 = yVar.h();
        int i10 = h10 & com.anythink.expressad.video.module.a.a.R;
        while ((h10 & 128) == 128) {
            h10 = yVar.h();
            i10 = (i10 << 7) | (h10 & com.anythink.expressad.video.module.a.a.R);
        }
        return i10;
    }

    public static List<n> a(a.C0166a c0166a, r rVar, long j10, com.applovin.exoplayer2.d.e eVar, boolean z10, boolean z11, Function<k, k> function) throws com.applovin.exoplayer2.ai {
        k apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0166a.f14328d.size(); i10++) {
            a.C0166a c0166a2 = c0166a.f14328d.get(i10);
            if (c0166a2.f14325a == 1953653099 && (apply = function.apply(a(c0166a2, (a.b) com.applovin.exoplayer2.l.a.b(c0166a.d(1836476516)), j10, eVar, z10, z11))) != null) {
                arrayList.add(a(apply, (a.C0166a) com.applovin.exoplayer2.l.a.b(((a.C0166a) com.applovin.exoplayer2.l.a.b(((a.C0166a) com.applovin.exoplayer2.l.a.b(c0166a2.e(1835297121))).e(1835626086))).e(1937007212)), rVar));
            }
        }
        return arrayList;
    }

    private static float d(y yVar, int i10) {
        yVar.d(i10 + 8);
        return yVar.w() / yVar.w();
    }

    private static byte[] d(y yVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            yVar.d(i12);
            int q10 = yVar.q();
            if (yVar.q() == 1886547818) {
                return Arrays.copyOfRange(yVar.d(), i12, q10 + i12);
            }
            i12 += q10;
        }
        return null;
    }

    private static long b(y yVar) {
        yVar.d(8);
        yVar.e(com.applovin.exoplayer2.e.g.a.a(yVar.q()) != 0 ? 16 : 8);
        return yVar.o();
    }

    private static Pair<String, byte[]> e(y yVar, int i10) {
        yVar.d(i10 + 8 + 4);
        yVar.e(1);
        f(yVar);
        yVar.e(2);
        int h10 = yVar.h();
        if ((h10 & 128) != 0) {
            yVar.e(2);
        }
        if ((h10 & 64) != 0) {
            yVar.e(yVar.i());
        }
        if ((h10 & 32) != 0) {
            yVar.e(2);
        }
        yVar.e(1);
        f(yVar);
        String a10 = u.a(yVar.h());
        if (!com.anythink.expressad.exoplayer.k.o.f9085t.equals(a10) && !com.anythink.expressad.exoplayer.k.o.D.equals(a10) && !com.anythink.expressad.exoplayer.k.o.E.equals(a10)) {
            yVar.e(12);
            yVar.e(1);
            int f10 = f(yVar);
            byte[] bArr = new byte[f10];
            yVar.a(bArr, 0, f10);
            return Pair.create(a10, bArr);
        }
        return Pair.create(a10, null);
    }

    private static Pair<long[], long[]> b(a.C0166a c0166a) {
        a.b d10 = c0166a.d(1701606260);
        if (d10 == null) {
            return null;
        }
        y yVar = d10.f14329b;
        yVar.d(8);
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        int w10 = yVar.w();
        long[] jArr = new long[w10];
        long[] jArr2 = new long[w10];
        for (int i10 = 0; i10 < w10; i10++) {
            jArr[i10] = a10 == 1 ? yVar.y() : yVar.o();
            jArr2[i10] = a10 == 1 ? yVar.s() : yVar.q();
            if (yVar.k() == 1) {
                yVar.e(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static f c(y yVar) {
        boolean z10;
        yVar.d(8);
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(a10 == 0 ? 8 : 16);
        int q10 = yVar.q();
        yVar.e(4);
        int c10 = yVar.c();
        int i10 = a10 == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (yVar.d()[c10 + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = com.anythink.expressad.exoplayer.b.f7291b;
        if (z10) {
            yVar.e(i10);
        } else {
            long o = a10 == 0 ? yVar.o() : yVar.y();
            if (o != 0) {
                j10 = o;
            }
        }
        yVar.e(16);
        int q11 = yVar.q();
        int q12 = yVar.q();
        yVar.e(4);
        int q13 = yVar.q();
        int q14 = yVar.q();
        if (q11 == 0 && q12 == 65536 && q13 == -65536 && q14 == 0) {
            i11 = 90;
        } else if (q11 == 0 && q12 == -65536 && q13 == 65536 && q14 == 0) {
            i11 = 270;
        } else if (q11 == -65536 && q12 == 0 && q13 == 0 && q14 == -65536) {
            i11 = 180;
        }
        return new f(q10, j10, i11);
    }

    public static Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> a(a.b bVar) {
        y yVar = bVar.f14329b;
        yVar.d(8);
        com.applovin.exoplayer2.g.a aVar = null;
        com.applovin.exoplayer2.g.a aVar2 = null;
        while (yVar.a() >= 8) {
            int c10 = yVar.c();
            int q10 = yVar.q();
            int q11 = yVar.q();
            if (q11 == 1835365473) {
                yVar.d(c10);
                aVar = a(yVar, c10 + q10);
            } else if (q11 == 1936553057) {
                yVar.d(c10);
                aVar2 = c(yVar, c10 + q10);
            }
            yVar.d(c10 + q10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static int b(y yVar, int i10, int i11) throws com.applovin.exoplayer2.ai {
        int c10 = yVar.c();
        while (c10 - i10 < i11) {
            yVar.d(c10);
            int q10 = yVar.q();
            com.applovin.exoplayer2.e.k.a(q10 > 0, "childAtomSize must be positive");
            if (yVar.q() == 1702061171) {
                return c10;
            }
            c10 += q10;
        }
        return -1;
    }

    public static com.applovin.exoplayer2.g.a a(a.C0166a c0166a) {
        a.b d10 = c0166a.d(1751411826);
        a.b d11 = c0166a.d(1801812339);
        a.b d12 = c0166a.d(1768715124);
        if (d10 == null || d11 == null || d12 == null || d(d10.f14329b) != 1835299937) {
            return null;
        }
        y yVar = d11.f14329b;
        yVar.d(12);
        int q10 = yVar.q();
        String[] strArr = new String[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            int q11 = yVar.q();
            yVar.e(4);
            strArr[i10] = yVar.f(q11 - 8);
        }
        y yVar2 = d12.f14329b;
        yVar2.d(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() > 8) {
            int c10 = yVar2.c();
            int q12 = yVar2.q();
            int q13 = yVar2.q() - 1;
            if (q13 >= 0 && q13 < q10) {
                com.applovin.exoplayer2.g.f.a a10 = com.applovin.exoplayer2.e.g.f.a(yVar2, c10 + q12, strArr[q13]);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            } else {
                a3.k.y("Skipped metadata with unknown key index: ", q13, "AtomParsers");
            }
            yVar2.d(c10 + q12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static Pair<Integer, l> c(y yVar, int i10, int i11) throws com.applovin.exoplayer2.ai {
        Pair<Integer, l> a10;
        int c10 = yVar.c();
        while (c10 - i10 < i11) {
            yVar.d(c10);
            int q10 = yVar.q();
            com.applovin.exoplayer2.e.k.a(q10 > 0, "childAtomSize must be positive");
            if (yVar.q() == 1936289382 && (a10 = a(yVar, c10, q10)) != null) {
                return a10;
            }
            c10 += q10;
        }
        return null;
    }

    public static void a(y yVar) {
        int c10 = yVar.c();
        yVar.e(4);
        if (yVar.q() != 1751411826) {
            c10 += 4;
        }
        yVar.d(c10);
    }

    private static k a(a.C0166a c0166a, a.b bVar, long j10, com.applovin.exoplayer2.d.e eVar, boolean z10, boolean z11) throws com.applovin.exoplayer2.ai {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0166a e10;
        Pair<long[], long[]> b10;
        a.C0166a c0166a2 = (a.C0166a) com.applovin.exoplayer2.l.a.b(c0166a.e(1835297121));
        int a10 = a(d(((a.b) com.applovin.exoplayer2.l.a.b(c0166a2.d(1751411826))).f14329b));
        if (a10 == -1) {
            return null;
        }
        f c10 = c(((a.b) com.applovin.exoplayer2.l.a.b(c0166a.d(1953196132))).f14329b);
        long j12 = com.anythink.expressad.exoplayer.b.f7291b;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            bVar2 = bVar;
            j11 = c10.f14352b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long b11 = b(bVar2.f14329b);
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            j12 = ai.d(j11, 1000000L, b11);
        }
        long j13 = j12;
        a.C0166a c0166a3 = (a.C0166a) com.applovin.exoplayer2.l.a.b(((a.C0166a) com.applovin.exoplayer2.l.a.b(c0166a2.e(1835626086))).e(1937007212));
        Pair<Long, String> e11 = e(((a.b) com.applovin.exoplayer2.l.a.b(c0166a2.d(1835296868))).f14329b);
        c a11 = a(((a.b) com.applovin.exoplayer2.l.a.b(c0166a3.d(1937011556))).f14329b, c10.f14351a, c10.f14353c, (String) e11.second, eVar, z11);
        if (z10 || (e10 = c0166a.e(1701082227)) == null || (b10 = b(e10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) b10.first;
            jArr2 = (long[]) b10.second;
            jArr = jArr3;
        }
        if (a11.f14340b == null) {
            return null;
        }
        return new k(c10.f14351a, a10, ((Long) e11.first).longValue(), b11, j13, a11.f14340b, a11.f14342d, a11.f14339a, a11.f14341c, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0409 A[EDGE_INSN: B:96:0x0409->B:97:0x0409 BREAK  A[LOOP:2: B:76:0x03aa->B:92:0x0402], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0414  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.e.g.n a(com.applovin.exoplayer2.e.g.k r35, com.applovin.exoplayer2.e.g.a.C0166a r36, com.applovin.exoplayer2.e.r r37) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.b.a(com.applovin.exoplayer2.e.g.k, com.applovin.exoplayer2.e.g.a$a, com.applovin.exoplayer2.e.r):com.applovin.exoplayer2.e.g.n");
    }

    private static com.applovin.exoplayer2.g.a a(y yVar, int i10) {
        yVar.e(8);
        a(yVar);
        while (yVar.c() < i10) {
            int c10 = yVar.c();
            int q10 = yVar.q();
            if (yVar.q() == 1768715124) {
                yVar.d(c10);
                return b(yVar, c10 + q10);
            }
            yVar.d(c10 + q10);
        }
        return null;
    }

    private static c a(y yVar, int i10, int i11, String str, com.applovin.exoplayer2.d.e eVar, boolean z10) throws com.applovin.exoplayer2.ai {
        int i12;
        yVar.d(12);
        int q10 = yVar.q();
        c cVar = new c(q10);
        for (int i13 = 0; i13 < q10; i13++) {
            int c10 = yVar.c();
            int q11 = yVar.q();
            com.applovin.exoplayer2.e.k.a(q11 > 0, "childAtomSize must be positive");
            int q12 = yVar.q();
            if (q12 == 1635148593 || q12 == 1635148595 || q12 == 1701733238 || q12 == 1831958048 || q12 == 1836070006 || q12 == 1752589105 || q12 == 1751479857 || q12 == 1932670515 || q12 == 1211250227 || q12 == 1987063864 || q12 == 1987063865 || q12 == 1635135537 || q12 == 1685479798 || q12 == 1685479729 || q12 == 1685481573 || q12 == 1685481521) {
                i12 = c10;
                a(yVar, q12, i12, q11, i10, i11, eVar, cVar, i13);
            } else if (q12 == 1836069985 || q12 == 1701733217 || q12 == 1633889587 || q12 == 1700998451 || q12 == 1633889588 || q12 == 1685353315 || q12 == 1685353317 || q12 == 1685353320 || q12 == 1685353324 || q12 == 1685353336 || q12 == 1935764850 || q12 == 1935767394 || q12 == 1819304813 || q12 == 1936684916 || q12 == 1953984371 || q12 == 778924082 || q12 == 778924083 || q12 == 1835557169 || q12 == 1835560241 || q12 == 1634492771 || q12 == 1634492791 || q12 == 1970037111 || q12 == 1332770163 || q12 == 1716281667) {
                i12 = c10;
                a(yVar, q12, c10, q11, i10, str, z10, eVar, cVar, i13);
            } else {
                if (q12 == 1414810956 || q12 == 1954034535 || q12 == 2004251764 || q12 == 1937010800 || q12 == 1664495672) {
                    a(yVar, q12, c10, q11, i10, str, cVar);
                } else if (q12 == 1835365492) {
                    a(yVar, q12, c10, i10, cVar);
                } else if (q12 == 1667329389) {
                    cVar.f14340b = new v.a().a(i10).f(com.anythink.expressad.exoplayer.k.o.ah).a();
                }
                i12 = c10;
            }
            yVar.d(i12 + q11);
        }
        return cVar;
    }

    private static void a(y yVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        yVar.d(i11 + 8 + 8);
        String str2 = com.anythink.expressad.exoplayer.k.o.Z;
        s sVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                yVar.a(bArr, 0, i14);
                sVar = s.a(bArr);
                str2 = com.anythink.expressad.exoplayer.k.o.f9065aa;
            } else if (i10 == 2004251764) {
                str2 = com.anythink.expressad.exoplayer.k.o.f9066ab;
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                cVar.f14342d = 1;
                str2 = com.anythink.expressad.exoplayer.k.o.f9067ac;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f14340b = new v.a().a(i13).f(str2).c(str).a(j10).a(sVar).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
    
        if (r1 != 3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.applovin.exoplayer2.l.y r20, int r21, int r22, int r23, int r24, int r25, com.applovin.exoplayer2.d.e r26, com.applovin.exoplayer2.e.g.b.c r27, int r28) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.b.a(com.applovin.exoplayer2.l.y, int, int, int, int, int, com.applovin.exoplayer2.d.e, com.applovin.exoplayer2.e.g.b$c, int):void");
    }

    private static void a(y yVar, int i10, int i11, int i12, c cVar) {
        yVar.d(i11 + 8 + 8);
        if (i10 == 1835365492) {
            yVar.B();
            String B = yVar.B();
            if (B != null) {
                cVar.f14340b = new v.a().a(i12).f(B).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.applovin.exoplayer2.l.y r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.exoplayer2.d.e r27, com.applovin.exoplayer2.e.g.b.c r28, int r29) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.b.a(com.applovin.exoplayer2.l.y, int, int, int, int, java.lang.String, boolean, com.applovin.exoplayer2.d.e, com.applovin.exoplayer2.e.g.b$c, int):void");
    }

    public static Pair<Integer, l> a(y yVar, int i10, int i11) throws com.applovin.exoplayer2.ai {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            yVar.d(i12);
            int q10 = yVar.q();
            int q11 = yVar.q();
            if (q11 == 1718775137) {
                num = Integer.valueOf(yVar.q());
            } else if (q11 == 1935894637) {
                yVar.e(4);
                str = yVar.f(4);
            } else if (q11 == 1935894633) {
                i13 = i12;
                i14 = q10;
            }
            i12 += q10;
        }
        if (!com.anythink.expressad.exoplayer.b.f7295bd.equals(str) && !com.anythink.expressad.exoplayer.b.be.equals(str) && !com.anythink.expressad.exoplayer.b.bf.equals(str) && !com.anythink.expressad.exoplayer.b.bg.equals(str)) {
            return null;
        }
        com.applovin.exoplayer2.e.k.a(num != null, "frma atom is mandatory");
        com.applovin.exoplayer2.e.k.a(i13 != -1, "schi atom is mandatory");
        l a10 = a(yVar, i13, i14, str);
        com.applovin.exoplayer2.e.k.a(a10 != null, "tenc atom is mandatory");
        return Pair.create(num, (l) ai.a(a10));
    }

    private static l a(y yVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            yVar.d(i14);
            int q10 = yVar.q();
            if (yVar.q() == 1952804451) {
                int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
                yVar.e(1);
                if (a10 == 0) {
                    yVar.e(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int h10 = yVar.h();
                    i12 = h10 & 15;
                    i13 = (h10 & 240) >> 4;
                }
                boolean z10 = yVar.h() == 1;
                int h11 = yVar.h();
                byte[] bArr2 = new byte[16];
                yVar.a(bArr2, 0, 16);
                if (z10 && h11 == 0) {
                    int h12 = yVar.h();
                    bArr = new byte[h12];
                    yVar.a(bArr, 0, h12);
                }
                return new l(z10, str, h11, bArr2, i13, i12, bArr);
            }
            i14 += q10;
        }
    }

    private static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[ai.a(4, 0, length)] && jArr[ai.a(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }
}
