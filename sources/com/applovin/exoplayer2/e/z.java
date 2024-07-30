package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14953a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14954b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f14955c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14956d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14957e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f14953a = i10;
            this.f14954b = i11;
            this.f14955c = jArr;
            this.f14956d = i12;
            this.f14957e = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f14958a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f14959b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14960c;

        public b(String str, String[] strArr, int i10) {
            this.f14958a = str;
            this.f14959b = strArr;
            this.f14960c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14961a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14962b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14963c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14964d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f14961a = z10;
            this.f14962b = i10;
            this.f14963c = i11;
            this.f14964d = i12;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f14965a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14966b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14967c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14968d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14969e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f14970g;

        /* renamed from: h, reason: collision with root package name */
        public final int f14971h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f14972i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f14973j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f14965a = i10;
            this.f14966b = i11;
            this.f14967c = i12;
            this.f14968d = i13;
            this.f14969e = i14;
            this.f = i15;
            this.f14970g = i16;
            this.f14971h = i17;
            this.f14972i = z10;
            this.f14973j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static b b(com.applovin.exoplayer2.l.y yVar) throws ai {
        return a(yVar, true, true);
    }

    private static void c(y yVar) throws ai {
        int a10 = yVar.a(6) + 1;
        for (int i10 = 0; i10 < a10; i10++) {
            int a11 = yVar.a(16);
            if (a11 != 0) {
                if (a11 == 1) {
                    int a12 = yVar.a(5);
                    int[] iArr = new int[a12];
                    int i11 = -1;
                    for (int i12 = 0; i12 < a12; i12++) {
                        int a13 = yVar.a(4);
                        iArr[i12] = a13;
                        if (a13 > i11) {
                            i11 = a13;
                        }
                    }
                    int i13 = i11 + 1;
                    int[] iArr2 = new int[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        iArr2[i14] = yVar.a(3) + 1;
                        int a14 = yVar.a(2);
                        if (a14 > 0) {
                            yVar.b(8);
                        }
                        for (int i15 = 0; i15 < (1 << a14); i15++) {
                            yVar.b(8);
                        }
                    }
                    yVar.b(2);
                    int a15 = yVar.a(4);
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 0; i18 < a12; i18++) {
                        i16 += iArr2[iArr[i18]];
                        while (i17 < i16) {
                            yVar.b(a15);
                            i17++;
                        }
                    }
                } else {
                    throw ai.b("floor type greater than 1 not decodable: " + a11, null);
                }
            } else {
                yVar.b(8);
                yVar.b(16);
                yVar.b(16);
                yVar.b(6);
                yVar.b(8);
                int a16 = yVar.a(4) + 1;
                for (int i19 = 0; i19 < a16; i19++) {
                    yVar.b(8);
                }
            }
        }
    }

    private static a d(y yVar) throws ai {
        if (yVar.a(24) == 5653314) {
            int a10 = yVar.a(16);
            int a11 = yVar.a(24);
            long[] jArr = new long[a11];
            boolean a12 = yVar.a();
            long j10 = 0;
            if (!a12) {
                boolean a13 = yVar.a();
                for (int i10 = 0; i10 < a11; i10++) {
                    if (a13) {
                        if (yVar.a()) {
                            jArr[i10] = yVar.a(5) + 1;
                        } else {
                            jArr[i10] = 0;
                        }
                    } else {
                        jArr[i10] = yVar.a(5) + 1;
                    }
                }
            } else {
                int a14 = yVar.a(5) + 1;
                int i11 = 0;
                while (i11 < a11) {
                    int a15 = yVar.a(a(a11 - i11));
                    for (int i12 = 0; i12 < a15 && i11 < a11; i12++) {
                        jArr[i11] = a14;
                        i11++;
                    }
                    a14++;
                }
            }
            int a16 = yVar.a(4);
            if (a16 <= 2) {
                if (a16 == 1 || a16 == 2) {
                    yVar.b(32);
                    yVar.b(32);
                    int a17 = yVar.a(4) + 1;
                    yVar.b(1);
                    if (a16 == 1) {
                        if (a10 != 0) {
                            j10 = a(a11, a10);
                        }
                    } else {
                        j10 = a11 * a10;
                    }
                    yVar.b((int) (j10 * a17));
                }
                return new a(a10, a11, jArr, a16, a12);
            }
            throw ai.b("lookup type greater than 2 not decodable: " + a16, null);
        }
        throw ai.b("expected code book to start with [0x56, 0x43, 0x42] at " + yVar.b(), null);
    }

    public static d a(com.applovin.exoplayer2.l.y yVar) throws ai {
        a(1, yVar, false);
        int x10 = yVar.x();
        int h10 = yVar.h();
        int x11 = yVar.x();
        int r10 = yVar.r();
        if (r10 <= 0) {
            r10 = -1;
        }
        int r11 = yVar.r();
        if (r11 <= 0) {
            r11 = -1;
        }
        int r12 = yVar.r();
        if (r12 <= 0) {
            r12 = -1;
        }
        int h11 = yVar.h();
        return new d(x10, h10, x11, r10, r11, r12, (int) Math.pow(2.0d, h11 & 15), (int) Math.pow(2.0d, (h11 & 240) >> 4), (yVar.h() & 1) > 0, Arrays.copyOf(yVar.d(), yVar.b()));
    }

    private static void b(y yVar) throws ai {
        int a10 = yVar.a(6) + 1;
        for (int i10 = 0; i10 < a10; i10++) {
            if (yVar.a(16) <= 2) {
                yVar.b(24);
                yVar.b(24);
                yVar.b(24);
                int a11 = yVar.a(6) + 1;
                yVar.b(8);
                int[] iArr = new int[a11];
                for (int i11 = 0; i11 < a11; i11++) {
                    iArr[i11] = ((yVar.a() ? yVar.a(5) : 0) * 8) + yVar.a(3);
                }
                for (int i12 = 0; i12 < a11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            yVar.b(8);
                        }
                    }
                }
            } else {
                throw ai.b("residueType greater than 2 is not decodable", null);
            }
        }
    }

    public static b a(com.applovin.exoplayer2.l.y yVar, boolean z10, boolean z11) throws ai {
        if (z10) {
            a(3, yVar, false);
        }
        String f = yVar.f((int) yVar.p());
        int length = f.length() + 11;
        long p10 = yVar.p();
        String[] strArr = new String[(int) p10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < p10; i11++) {
            String f10 = yVar.f((int) yVar.p());
            strArr[i11] = f10;
            i10 = i10 + 4 + f10.length();
        }
        if (z11 && (yVar.h() & 1) == 0) {
            throw ai.b("framing bit expected to be set", null);
        }
        return new b(f, strArr, i10 + 1);
    }

    public static boolean a(int i10, com.applovin.exoplayer2.l.y yVar, boolean z10) throws ai {
        if (yVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ai.b("too short header: " + yVar.a(), null);
        }
        if (yVar.h() != i10) {
            if (z10) {
                return false;
            }
            throw ai.b("expected header type " + Integer.toHexString(i10), null);
        }
        if (yVar.h() == 118 && yVar.h() == 111 && yVar.h() == 114 && yVar.h() == 98 && yVar.h() == 105 && yVar.h() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ai.b("expected characters 'vorbis'", null);
    }

    public static c[] a(com.applovin.exoplayer2.l.y yVar, int i10) throws ai {
        a(5, yVar, false);
        int h10 = yVar.h() + 1;
        y yVar2 = new y(yVar.d());
        yVar2.b(yVar.c() * 8);
        for (int i11 = 0; i11 < h10; i11++) {
            d(yVar2);
        }
        int a10 = yVar2.a(6) + 1;
        for (int i12 = 0; i12 < a10; i12++) {
            if (yVar2.a(16) != 0) {
                throw ai.b("placeholder of time domain transforms not zeroed out", null);
            }
        }
        c(yVar2);
        b(yVar2);
        a(i10, yVar2);
        c[] a11 = a(yVar2);
        if (yVar2.a()) {
            return a11;
        }
        throw ai.b("framing bit after modes not set as expected", null);
    }

    private static c[] a(y yVar) {
        int a10 = yVar.a(6) + 1;
        c[] cVarArr = new c[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            cVarArr[i10] = new c(yVar.a(), yVar.a(16), yVar.a(16), yVar.a(8));
        }
        return cVarArr;
    }

    private static void a(int i10, y yVar) throws ai {
        int a10 = yVar.a(6) + 1;
        for (int i11 = 0; i11 < a10; i11++) {
            int a11 = yVar.a(16);
            if (a11 != 0) {
                com.applovin.exoplayer2.l.q.d("VorbisUtil", "mapping type other than 0 not supported: " + a11);
            } else {
                int a12 = yVar.a() ? yVar.a(4) + 1 : 1;
                if (yVar.a()) {
                    int a13 = yVar.a(8) + 1;
                    for (int i12 = 0; i12 < a13; i12++) {
                        int i13 = i10 - 1;
                        yVar.b(a(i13));
                        yVar.b(a(i13));
                    }
                }
                if (yVar.a(2) != 0) {
                    throw ai.b("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (a12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        yVar.b(4);
                    }
                }
                for (int i15 = 0; i15 < a12; i15++) {
                    yVar.b(8);
                    yVar.b(8);
                    yVar.b(8);
                }
            }
        }
    }

    private static long a(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }
}
