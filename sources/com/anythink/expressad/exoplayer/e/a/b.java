package com.anythink.expressad.exoplayer.e.a;

import android.util.Pair;
import com.anythink.expressad.exoplayer.e.a.a;
import com.anythink.expressad.exoplayer.g.a;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.anythink.expressad.exoplayer.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7763a = "AtomParsers";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7764b = af.f("vide");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7765c = af.f("soun");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7766d = af.f(o.f9070c);

    /* renamed from: e, reason: collision with root package name */
    private static final int f7767e = af.f("sbtl");
    private static final int f = af.f("subt");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7768g = af.f("clcp");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7769h = af.f("meta");

    /* renamed from: i, reason: collision with root package name */
    private static final int f7770i = 3;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7771a;

        /* renamed from: b, reason: collision with root package name */
        public int f7772b;

        /* renamed from: c, reason: collision with root package name */
        public int f7773c;

        /* renamed from: d, reason: collision with root package name */
        public long f7774d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7775e;
        private final s f;

        /* renamed from: g, reason: collision with root package name */
        private final s f7776g;

        /* renamed from: h, reason: collision with root package name */
        private int f7777h;

        /* renamed from: i, reason: collision with root package name */
        private int f7778i;

        public a(s sVar, s sVar2, boolean z10) {
            this.f7776g = sVar;
            this.f = sVar2;
            this.f7775e = z10;
            sVar2.c(12);
            this.f7771a = sVar2.m();
            sVar.c(12);
            this.f7778i = sVar.m();
            com.anythink.expressad.exoplayer.k.a.b(sVar.i() == 1, "first_chunk must be 1");
            this.f7772b = -1;
        }

        public final boolean a() {
            long h10;
            int i10;
            int i11 = this.f7772b + 1;
            this.f7772b = i11;
            if (i11 == this.f7771a) {
                return false;
            }
            if (this.f7775e) {
                h10 = this.f.n();
            } else {
                h10 = this.f.h();
            }
            this.f7774d = h10;
            if (this.f7772b == this.f7777h) {
                this.f7773c = this.f7776g.m();
                this.f7776g.d(4);
                int i12 = this.f7778i - 1;
                this.f7778i = i12;
                if (i12 > 0) {
                    i10 = this.f7776g.m() - 1;
                } else {
                    i10 = -1;
                }
                this.f7777h = i10;
            }
            return true;
        }
    }

    /* renamed from: com.anythink.expressad.exoplayer.e.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0102b {
        int a();

        int b();

        boolean c();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7779a = 8;

        /* renamed from: b, reason: collision with root package name */
        public final k[] f7780b;

        /* renamed from: c, reason: collision with root package name */
        public com.anythink.expressad.exoplayer.m f7781c;

        /* renamed from: d, reason: collision with root package name */
        public int f7782d;

        /* renamed from: e, reason: collision with root package name */
        public int f7783e = 0;

        public c(int i10) {
            this.f7780b = new k[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0102b {

        /* renamed from: a, reason: collision with root package name */
        private final int f7784a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7785b;

        /* renamed from: c, reason: collision with root package name */
        private final s f7786c;

        public d(a.b bVar) {
            s sVar = bVar.aV;
            this.f7786c = sVar;
            sVar.c(12);
            this.f7784a = sVar.m();
            this.f7785b = sVar.m();
        }

        @Override // com.anythink.expressad.exoplayer.e.a.b.InterfaceC0102b
        public final int a() {
            return this.f7785b;
        }

        @Override // com.anythink.expressad.exoplayer.e.a.b.InterfaceC0102b
        public final int b() {
            int i10 = this.f7784a;
            if (i10 == 0) {
                return this.f7786c.m();
            }
            return i10;
        }

        @Override // com.anythink.expressad.exoplayer.e.a.b.InterfaceC0102b
        public final boolean c() {
            if (this.f7784a != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements InterfaceC0102b {

        /* renamed from: a, reason: collision with root package name */
        private final s f7787a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7788b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7789c;

        /* renamed from: d, reason: collision with root package name */
        private int f7790d;

        /* renamed from: e, reason: collision with root package name */
        private int f7791e;

        public e(a.b bVar) {
            s sVar = bVar.aV;
            this.f7787a = sVar;
            sVar.c(12);
            this.f7789c = sVar.m() & p.f9095b;
            this.f7788b = sVar.m();
        }

        @Override // com.anythink.expressad.exoplayer.e.a.b.InterfaceC0102b
        public final int a() {
            return this.f7788b;
        }

        @Override // com.anythink.expressad.exoplayer.e.a.b.InterfaceC0102b
        public final int b() {
            int i10 = this.f7789c;
            if (i10 == 8) {
                return this.f7787a.d();
            }
            if (i10 == 16) {
                return this.f7787a.e();
            }
            int i11 = this.f7790d;
            this.f7790d = i11 + 1;
            if (i11 % 2 == 0) {
                int d10 = this.f7787a.d();
                this.f7791e = d10;
                return (d10 & 240) >> 4;
            }
            return this.f7791e & 15;
        }

        @Override // com.anythink.expressad.exoplayer.e.a.b.InterfaceC0102b
        public final boolean c() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f7792a;

        /* renamed from: b, reason: collision with root package name */
        private final long f7793b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7794c;

        public f(int i10, long j10, int i11) {
            this.f7792a = i10;
            this.f7793b = j10;
            this.f7794c = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends t {
    }

    private b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a1, code lost:
    
        if (r5 == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.expressad.exoplayer.e.a.j a(com.anythink.expressad.exoplayer.e.a.a.C0101a r25, com.anythink.expressad.exoplayer.e.a.a.b r26, long r27, com.anythink.expressad.exoplayer.d.e r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.b.a(com.anythink.expressad.exoplayer.e.a.a$a, com.anythink.expressad.exoplayer.e.a.a$b, long, com.anythink.expressad.exoplayer.d.e, boolean, boolean):com.anythink.expressad.exoplayer.e.a.j");
    }

    private static com.anythink.expressad.exoplayer.g.a b(s sVar, int i10) {
        sVar.d(8);
        ArrayList arrayList = new ArrayList();
        while (sVar.c() < i10) {
            a.InterfaceC0105a a10 = com.anythink.expressad.exoplayer.e.a.f.a(sVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.anythink.expressad.exoplayer.g.a(arrayList);
    }

    private static int c(s sVar) {
        sVar.c(16);
        int i10 = sVar.i();
        if (i10 == f7765c) {
            return 1;
        }
        if (i10 == f7764b) {
            return 2;
        }
        if (i10 == f7766d || i10 == f7767e || i10 == f || i10 == f7768g) {
            return 3;
        }
        return i10 == f7769h ? 4 : -1;
    }

    private static Pair<Long, String> d(s sVar) {
        sVar.c(8);
        int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a10 == 0 ? 8 : 16);
        long h10 = sVar.h();
        sVar.d(a10 == 0 ? 4 : 8);
        int e10 = sVar.e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((e10 >> 10) & 31) + 96));
        sb2.append((char) (((e10 >> 5) & 31) + 96));
        sb2.append((char) ((e10 & 31) + 96));
        return Pair.create(Long.valueOf(h10), sb2.toString());
    }

    private static int e(s sVar) {
        int d10 = sVar.d();
        int i10 = d10 & com.anythink.expressad.video.module.a.a.R;
        while ((d10 & 128) == 128) {
            d10 = sVar.d();
            i10 = (i10 << 7) | (d10 & com.anythink.expressad.video.module.a.a.R);
        }
        return i10;
    }

    private static f b(s sVar) {
        boolean z10;
        sVar.c(8);
        int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a10 == 0 ? 8 : 16);
        int i10 = sVar.i();
        sVar.d(4);
        int c10 = sVar.c();
        int i11 = a10 == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= i11) {
                z10 = true;
                break;
            }
            if (sVar.f9123a[c10 + i13] != -1) {
                z10 = false;
                break;
            }
            i13++;
        }
        long j10 = com.anythink.expressad.exoplayer.b.f7291b;
        if (z10) {
            sVar.d(i11);
        } else {
            long h10 = a10 == 0 ? sVar.h() : sVar.n();
            if (h10 != 0) {
                j10 = h10;
            }
        }
        sVar.d(16);
        int i14 = sVar.i();
        int i15 = sVar.i();
        sVar.d(4);
        int i16 = sVar.i();
        int i17 = sVar.i();
        if (i14 == 0 && i15 == 65536 && i16 == -65536 && i17 == 0) {
            i12 = 90;
        } else if (i14 == 0 && i15 == -65536 && i16 == 65536 && i17 == 0) {
            i12 = 270;
        } else if (i14 == -65536 && i15 == 0 && i16 == 0 && i17 == -65536) {
            i12 = 180;
        }
        return new f(i10, j10, i12);
    }

    private static float c(s sVar, int i10) {
        sVar.c(i10 + 8);
        return sVar.m() / sVar.m();
    }

    private static Pair<Integer, k> c(s sVar, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            sVar.c(i12);
            int i15 = sVar.i();
            int i16 = sVar.i();
            if (i16 == com.anythink.expressad.exoplayer.e.a.a.ag) {
                num = Integer.valueOf(sVar.i());
            } else if (i16 == com.anythink.expressad.exoplayer.e.a.a.f7738ab) {
                sVar.d(4);
                str = sVar.o();
            } else if (i16 == com.anythink.expressad.exoplayer.e.a.a.f7739ac) {
                i13 = i12;
                i14 = i15;
            }
            i12 += i15;
        }
        if (!com.anythink.expressad.exoplayer.b.f7295bd.equals(str) && !com.anythink.expressad.exoplayer.b.be.equals(str) && !com.anythink.expressad.exoplayer.b.bf.equals(str) && !com.anythink.expressad.exoplayer.b.bg.equals(str)) {
            return null;
        }
        com.anythink.expressad.exoplayer.k.a.a(num != null, "frma atom is mandatory");
        com.anythink.expressad.exoplayer.k.a.a(i13 != -1, "schi atom is mandatory");
        k a10 = a(sVar, i13, i14, str);
        com.anythink.expressad.exoplayer.k.a.a(a10 != null, "tenc atom is mandatory");
        return Pair.create(num, a10);
    }

    private static Pair<String, byte[]> d(s sVar, int i10) {
        sVar.c(i10 + 8 + 4);
        sVar.d(1);
        e(sVar);
        sVar.d(2);
        int d10 = sVar.d();
        if ((d10 & 128) != 0) {
            sVar.d(2);
        }
        if ((d10 & 64) != 0) {
            sVar.d(sVar.e());
        }
        if ((d10 & 32) != 0) {
            sVar.d(2);
        }
        sVar.d(1);
        e(sVar);
        String a10 = o.a(sVar.d());
        if (!o.f9085t.equals(a10) && !o.D.equals(a10) && !o.E.equals(a10)) {
            sVar.d(12);
            sVar.d(1);
            int e10 = e(sVar);
            byte[] bArr = new byte[e10];
            sVar.a(bArr, 0, e10);
            return Pair.create(a10, bArr);
        }
        return Pair.create(a10, null);
    }

    private static Pair<Integer, k> b(s sVar, int i10, int i11) {
        Pair<Integer, k> c10;
        int c11 = sVar.c();
        while (c11 - i10 < i11) {
            sVar.c(c11);
            int i12 = sVar.i();
            com.anythink.expressad.exoplayer.k.a.a(i12 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.f7737aa && (c10 = c(sVar, c11, i12)) != null) {
                return c10;
            }
            c11 += i12;
        }
        return null;
    }

    private static byte[] d(s sVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            sVar.c(i12);
            int i13 = sVar.i();
            if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.aO) {
                return Arrays.copyOfRange(sVar.f9123a, i12, i13 + i12);
            }
            i12 += i13;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.expressad.exoplayer.e.a.m a(com.anythink.expressad.exoplayer.e.a.j r38, com.anythink.expressad.exoplayer.e.a.a.C0101a r39, com.anythink.expressad.exoplayer.e.i r40) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.b.a(com.anythink.expressad.exoplayer.e.a.j, com.anythink.expressad.exoplayer.e.a.a$a, com.anythink.expressad.exoplayer.e.i):com.anythink.expressad.exoplayer.e.a.m");
    }

    public static com.anythink.expressad.exoplayer.g.a a(a.b bVar, boolean z10) {
        if (z10) {
            return null;
        }
        s sVar = bVar.aV;
        sVar.c(8);
        while (sVar.a() >= 8) {
            int c10 = sVar.c();
            int i10 = sVar.i();
            if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.aG) {
                sVar.c(c10);
                int i11 = c10 + i10;
                sVar.d(12);
                while (true) {
                    if (sVar.c() >= i11) {
                        break;
                    }
                    int c11 = sVar.c();
                    int i12 = sVar.i();
                    if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.aH) {
                        sVar.c(c11);
                        int i13 = c11 + i12;
                        sVar.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (sVar.c() < i13) {
                            a.InterfaceC0105a a10 = com.anythink.expressad.exoplayer.e.a.f.a(sVar);
                            if (a10 != null) {
                                arrayList.add(a10);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new com.anythink.expressad.exoplayer.g.a(arrayList);
                        }
                    } else {
                        sVar.d(i12 - 8);
                    }
                }
                return null;
            }
            sVar.d(i10 - 8);
        }
        return null;
    }

    private static com.anythink.expressad.exoplayer.g.a a(s sVar, int i10) {
        sVar.d(12);
        while (sVar.c() < i10) {
            int c10 = sVar.c();
            int i11 = sVar.i();
            if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.aH) {
                sVar.c(c10);
                int i12 = c10 + i11;
                sVar.d(8);
                ArrayList arrayList = new ArrayList();
                while (sVar.c() < i12) {
                    a.InterfaceC0105a a10 = com.anythink.expressad.exoplayer.e.a.f.a(sVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new com.anythink.expressad.exoplayer.g.a(arrayList);
            }
            sVar.d(i11 - 8);
        }
        return null;
    }

    private static long a(s sVar) {
        sVar.c(8);
        sVar.d(com.anythink.expressad.exoplayer.e.a.a.a(sVar.i()) != 0 ? 16 : 8);
        return sVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.expressad.exoplayer.e.a.b.c a(com.anythink.expressad.exoplayer.k.s r44, int r45, int r46, java.lang.String r47, com.anythink.expressad.exoplayer.d.e r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.b.a(com.anythink.expressad.exoplayer.k.s, int, int, java.lang.String, com.anythink.expressad.exoplayer.d.e, boolean):com.anythink.expressad.exoplayer.e.a.b$c");
    }

    private static void a(s sVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        sVar.c(i11 + 8 + 8);
        int i14 = com.anythink.expressad.exoplayer.e.a.a.ao;
        String str2 = o.Z;
        List list = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != i14) {
            if (i10 == com.anythink.expressad.exoplayer.e.a.a.az) {
                int i15 = (i12 - 8) - 8;
                byte[] bArr = new byte[i15];
                sVar.a(bArr, 0, i15);
                list = Collections.singletonList(bArr);
                str2 = o.f9065aa;
            } else if (i10 == com.anythink.expressad.exoplayer.e.a.a.aA) {
                str2 = o.f9066ab;
            } else if (i10 == com.anythink.expressad.exoplayer.e.a.a.aB) {
                j10 = 0;
            } else if (i10 == com.anythink.expressad.exoplayer.e.a.a.aC) {
                cVar.f7783e = 1;
                str2 = o.f9067ac;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f7781c = com.anythink.expressad.exoplayer.m.a(Integer.toString(i13), str2, (String) null, -1, 0, str, -1, (com.anythink.expressad.exoplayer.d.e) null, j10, (List<byte[]>) list);
    }

    private static void a(s sVar, int i10, int i11, int i12, int i13, int i14, com.anythink.expressad.exoplayer.d.e eVar, c cVar, int i15) {
        int i16 = i11;
        com.anythink.expressad.exoplayer.d.e eVar2 = eVar;
        sVar.c(i16 + 8 + 8);
        sVar.d(16);
        int e10 = sVar.e();
        int e11 = sVar.e();
        sVar.d(50);
        int c10 = sVar.c();
        int i17 = i10;
        if (i17 == com.anythink.expressad.exoplayer.e.a.a.ae) {
            Pair<Integer, k> b10 = b(sVar, i16, i12);
            if (b10 != null) {
                i17 = ((Integer) b10.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b10.second).f7902b);
                cVar.f7780b[i15] = (k) b10.second;
            }
            sVar.c(c10);
        }
        com.anythink.expressad.exoplayer.d.e eVar3 = eVar2;
        float f10 = 1.0f;
        int i18 = -1;
        boolean z10 = false;
        String str = null;
        List<byte[]> list = null;
        byte[] bArr = null;
        while (c10 - i16 < i12) {
            sVar.c(c10);
            int c11 = sVar.c();
            int i19 = sVar.i();
            if (i19 == 0 && sVar.c() - i16 == i12) {
                break;
            }
            com.anythink.expressad.exoplayer.k.a.a(i19 > 0, "childAtomSize should be positive");
            int i20 = sVar.i();
            if (i20 == com.anythink.expressad.exoplayer.e.a.a.M) {
                com.anythink.expressad.exoplayer.k.a.b(str == null);
                sVar.c(c11 + 8);
                com.anythink.expressad.exoplayer.l.a a10 = com.anythink.expressad.exoplayer.l.a.a(sVar);
                list = a10.f9164a;
                cVar.f7782d = a10.f9165b;
                if (!z10) {
                    f10 = a10.f9168e;
                }
                str = o.f9074h;
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.N) {
                com.anythink.expressad.exoplayer.k.a.b(str == null);
                sVar.c(c11 + 8);
                com.anythink.expressad.exoplayer.l.d a11 = com.anythink.expressad.exoplayer.l.d.a(sVar);
                list = a11.f9187a;
                cVar.f7782d = a11.f9188b;
                str = o.f9075i;
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.aR) {
                com.anythink.expressad.exoplayer.k.a.b(str == null);
                str = i17 == com.anythink.expressad.exoplayer.e.a.a.aP ? o.f9076j : o.f9077k;
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.f7750l) {
                com.anythink.expressad.exoplayer.k.a.b(str == null);
                str = o.f9073g;
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.O) {
                com.anythink.expressad.exoplayer.k.a.b(str == null);
                Pair<String, byte[]> d10 = d(sVar, c11);
                str = (String) d10.first;
                list = Collections.singletonList((byte[]) d10.second);
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.an) {
                sVar.c(c11 + 8);
                f10 = sVar.m() / sVar.m();
                z10 = true;
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.aN) {
                int i21 = c11 + 8;
                while (true) {
                    if (i21 - c11 >= i19) {
                        bArr = null;
                        break;
                    }
                    sVar.c(i21);
                    int i22 = sVar.i();
                    if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.aO) {
                        bArr = Arrays.copyOfRange(sVar.f9123a, i21, i22 + i21);
                        break;
                    }
                    i21 += i22;
                }
            } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.aM) {
                int d11 = sVar.d();
                sVar.d(3);
                if (d11 == 0) {
                    int d12 = sVar.d();
                    if (d12 == 0) {
                        i18 = 0;
                    } else if (d12 == 1) {
                        i18 = 1;
                    } else if (d12 == 2) {
                        i18 = 2;
                    } else if (d12 == 3) {
                        i18 = 3;
                    }
                }
            }
            c10 += i19;
            i16 = i11;
        }
        if (str == null) {
            return;
        }
        cVar.f7781c = com.anythink.expressad.exoplayer.m.a(Integer.toString(i13), str, null, -1, -1, e10, e11, -1.0f, list, i14, f10, bArr, i18, null, eVar3);
    }

    private static Pair<long[], long[]> a(a.C0101a c0101a) {
        a.b d10;
        if (c0101a != null && (d10 = c0101a.d(com.anythink.expressad.exoplayer.e.a.a.V)) != null) {
            s sVar = d10.aV;
            sVar.c(8);
            int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
            int m10 = sVar.m();
            long[] jArr = new long[m10];
            long[] jArr2 = new long[m10];
            for (int i10 = 0; i10 < m10; i10++) {
                jArr[i10] = a10 == 1 ? sVar.n() : sVar.h();
                jArr2[i10] = a10 == 1 ? sVar.j() : sVar.i();
                if (sVar.f() == 1) {
                    sVar.d(2);
                } else {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
            }
            return Pair.create(jArr, jArr2);
        }
        return Pair.create(null, null);
    }

    private static void a(s sVar, int i10, int i11, int i12, int i13, String str, boolean z10, com.anythink.expressad.exoplayer.d.e eVar, c cVar, int i14) {
        int i15;
        int k10;
        int i16;
        String str2;
        int i17;
        int i18;
        String str3;
        String str4;
        com.anythink.expressad.exoplayer.d.e eVar2;
        boolean z11;
        int c10;
        int i19 = i11;
        com.anythink.expressad.exoplayer.d.e eVar3 = eVar;
        sVar.c(i19 + 8 + 8);
        if (z10) {
            i15 = sVar.e();
            sVar.d(6);
        } else {
            sVar.d(8);
            i15 = 0;
        }
        boolean z12 = true;
        if (i15 == 0 || i15 == 1) {
            int e10 = sVar.e();
            sVar.d(6);
            k10 = sVar.k();
            if (i15 == 1) {
                sVar.d(16);
            }
            i16 = e10;
        } else {
            if (i15 != 2) {
                return;
            }
            sVar.d(16);
            k10 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
            i16 = sVar.m();
            sVar.d(20);
        }
        int c11 = sVar.c();
        int i20 = i10;
        if (i20 == com.anythink.expressad.exoplayer.e.a.a.af) {
            Pair<Integer, k> b10 = b(sVar, i19, i12);
            if (b10 != null) {
                i20 = ((Integer) b10.first).intValue();
                eVar3 = eVar3 == null ? null : eVar3.a(((k) b10.second).f7902b);
                cVar.f7780b[i14] = (k) b10.second;
            }
            sVar.c(c11);
        }
        com.anythink.expressad.exoplayer.d.e eVar4 = eVar3;
        int i21 = com.anythink.expressad.exoplayer.e.a.a.f7756s;
        String str5 = o.f9088w;
        if (i20 == i21) {
            str2 = o.f9090z;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.f7758u) {
            str2 = o.A;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.f7760w) {
            str2 = o.D;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.f7761x || i20 == com.anythink.expressad.exoplayer.e.a.a.y) {
            str2 = o.E;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.f7762z) {
            str2 = o.F;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.aD) {
            str2 = o.I;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.aE) {
            str2 = o.J;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.f7754q || i20 == com.anythink.expressad.exoplayer.e.a.a.f7755r) {
            str2 = o.f9088w;
        } else if (i20 == com.anythink.expressad.exoplayer.e.a.a.o) {
            str2 = o.f9085t;
        } else {
            str2 = i20 == com.anythink.expressad.exoplayer.e.a.a.aT ? o.L : null;
        }
        String str6 = str2;
        int i22 = k10;
        int i23 = i16;
        int i24 = c11;
        byte[] bArr = null;
        while (i24 - i19 < i12) {
            sVar.c(i24);
            int i25 = sVar.i();
            com.anythink.expressad.exoplayer.k.a.a(i25 > 0 ? z12 : false, "childAtomSize should be positive");
            int i26 = sVar.i();
            int i27 = com.anythink.expressad.exoplayer.e.a.a.O;
            if (i26 == i27 || (z10 && i26 == com.anythink.expressad.exoplayer.e.a.a.f7753p)) {
                i17 = i25;
                i18 = i24;
                str3 = str6;
                str4 = str5;
                eVar2 = eVar4;
                z11 = true;
                if (i26 != i27) {
                    c10 = sVar.c();
                    while (true) {
                        if (c10 - i18 >= i17) {
                            c10 = -1;
                            break;
                        }
                        sVar.c(c10);
                        int i28 = sVar.i();
                        com.anythink.expressad.exoplayer.k.a.a(i28 > 0, "childAtomSize should be positive");
                        if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.O) {
                            break;
                        } else {
                            c10 += i28;
                        }
                    }
                } else {
                    c10 = i18;
                }
                if (c10 != -1) {
                    Pair<String, byte[]> d10 = d(sVar, c10);
                    String str7 = (String) d10.first;
                    byte[] bArr2 = (byte[]) d10.second;
                    if (o.f9083r.equals(str7)) {
                        Pair<Integer, Integer> a10 = com.anythink.expressad.exoplayer.k.d.a(bArr2);
                        int intValue = ((Integer) a10.first).intValue();
                        bArr = bArr2;
                        str6 = str7;
                        i23 = ((Integer) a10.second).intValue();
                        i22 = intValue;
                    } else {
                        bArr = bArr2;
                        str6 = str7;
                    }
                    i24 = i18 + i17;
                    i19 = i11;
                    eVar4 = eVar2;
                    z12 = z11;
                    str5 = str4;
                }
            } else {
                if (i26 == com.anythink.expressad.exoplayer.e.a.a.f7757t) {
                    sVar.c(i24 + 8);
                    cVar.f7781c = com.anythink.expressad.exoplayer.b.a.a(sVar, Integer.toString(i13), str, eVar4);
                } else if (i26 == com.anythink.expressad.exoplayer.e.a.a.f7759v) {
                    sVar.c(i24 + 8);
                    cVar.f7781c = com.anythink.expressad.exoplayer.b.a.b(sVar, Integer.toString(i13), str, eVar4);
                } else if (i26 == com.anythink.expressad.exoplayer.e.a.a.A) {
                    i17 = i25;
                    str3 = str6;
                    str4 = str5;
                    eVar2 = eVar4;
                    i18 = i24;
                    z11 = true;
                    cVar.f7781c = com.anythink.expressad.exoplayer.m.a(Integer.toString(i13), str6, null, -1, i23, i22, null, eVar4, str);
                } else {
                    i17 = i25;
                    i18 = i24;
                    str3 = str6;
                    str4 = str5;
                    eVar2 = eVar4;
                    z11 = true;
                    if (i26 == com.anythink.expressad.exoplayer.e.a.a.aT) {
                        byte[] bArr3 = new byte[i17];
                        sVar.c(i18);
                        sVar.a(bArr3, 0, i17);
                        bArr = bArr3;
                    }
                }
                i17 = i25;
                i18 = i24;
                str3 = str6;
                str4 = str5;
                eVar2 = eVar4;
                z11 = true;
            }
            str6 = str3;
            i24 = i18 + i17;
            i19 = i11;
            eVar4 = eVar2;
            z12 = z11;
            str5 = str4;
        }
        String str8 = str6;
        String str9 = str5;
        com.anythink.expressad.exoplayer.d.e eVar5 = eVar4;
        if (cVar.f7781c != null || str8 == null) {
            return;
        }
        cVar.f7781c = com.anythink.expressad.exoplayer.m.a(Integer.toString(i13), str8, (String) null, -1, i23, i22, str9.equals(str8) ? 2 : -1, (List<byte[]>) (bArr == null ? null : Collections.singletonList(bArr)), eVar5, str);
    }

    private static int a(s sVar, int i10, int i11) {
        int c10 = sVar.c();
        while (c10 - i10 < i11) {
            sVar.c(c10);
            int i12 = sVar.i();
            com.anythink.expressad.exoplayer.k.a.a(i12 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.O) {
                return c10;
            }
            c10 += i12;
        }
        return -1;
    }

    private static k a(s sVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            sVar.c(i14);
            int i15 = sVar.i();
            if (sVar.i() == com.anythink.expressad.exoplayer.e.a.a.f7740ad) {
                int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
                sVar.d(1);
                if (a10 == 0) {
                    sVar.d(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int d10 = sVar.d();
                    i12 = d10 & 15;
                    i13 = (d10 & 240) >> 4;
                }
                boolean z10 = sVar.d() == 1;
                int d11 = sVar.d();
                byte[] bArr2 = new byte[16];
                sVar.a(bArr2, 0, 16);
                if (z10 && d11 == 0) {
                    int d12 = sVar.d();
                    bArr = new byte[d12];
                    sVar.a(bArr, 0, d12);
                }
                return new k(z10, str, d11, bArr2, i13, i12, bArr);
            }
            i14 += i15;
        }
    }

    private static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[af.a(3, 0, length)] && jArr[af.a(jArr.length - 3, 0, length)] < j12 && j12 <= j10;
    }
}
