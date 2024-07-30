package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.ai;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13324a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13325b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.applovin.exoplayer2.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0152a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13329a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13330b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13331c;

        private C0152a(int i10, int i11, String str) {
            this.f13329a = i10;
            this.f13330b = i11;
            this.f13331c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(com.applovin.exoplayer2.l.x xVar) throws ai {
        int c10 = xVar.c(4);
        if (c10 == 15) {
            return xVar.c(24);
        }
        if (c10 < 13) {
            return f13324a[c10];
        }
        throw ai.b(null, null);
    }

    public static C0152a a(byte[] bArr) throws ai {
        return a(new com.applovin.exoplayer2.l.x(bArr), false);
    }

    public static C0152a a(com.applovin.exoplayer2.l.x xVar, boolean z10) throws ai {
        int a10 = a(xVar);
        int b10 = b(xVar);
        int c10 = xVar.c(4);
        String i10 = a3.l.i("mp4a.40.", a10);
        if (a10 == 5 || a10 == 29) {
            b10 = b(xVar);
            a10 = a(xVar);
            if (a10 == 22) {
                c10 = xVar.c(4);
            }
        }
        if (z10) {
            if (a10 != 1 && a10 != 2 && a10 != 3 && a10 != 4 && a10 != 6 && a10 != 7 && a10 != 17) {
                switch (a10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ai.a("Unsupported audio object type: " + a10);
                }
            }
            a(xVar, a10, c10);
            switch (a10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int c11 = xVar.c(2);
                    if (c11 == 2 || c11 == 3) {
                        throw ai.a("Unsupported epConfig: " + c11);
                    }
            }
        }
        int i11 = f13325b[c10];
        if (i11 != -1) {
            return new C0152a(b10, i11, i10);
        }
        throw ai.b(null, null);
    }

    private static int a(com.applovin.exoplayer2.l.x xVar) {
        int c10 = xVar.c(5);
        return c10 == 31 ? xVar.c(6) + 32 : c10;
    }

    private static void a(com.applovin.exoplayer2.l.x xVar, int i10, int i11) {
        if (xVar.e()) {
            com.applovin.exoplayer2.l.q.c("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.e()) {
            xVar.b(14);
        }
        boolean e10 = xVar.e();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            xVar.b(3);
        }
        if (e10) {
            if (i10 == 22) {
                xVar.b(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                xVar.b(3);
            }
            xVar.b(1);
        }
    }
}
