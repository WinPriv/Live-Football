package m4;

import k4.z0;

/* compiled from: AacUtil.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f32666a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f32667b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* renamed from: m4.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0440a {

        /* renamed from: a, reason: collision with root package name */
        public final int f32668a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32669b;

        /* renamed from: c, reason: collision with root package name */
        public final String f32670c;

        public C0440a(int i10, int i11, String str) {
            this.f32668a = i10;
            this.f32669b = i11;
            this.f32670c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static int b(d6.v vVar) throws z0 {
        int g6 = vVar.g(4);
        if (g6 == 15) {
            if (vVar.b() >= 24) {
                return vVar.g(24);
            }
            throw z0.a("AAC header insufficient data", null);
        }
        if (g6 < 13) {
            return f32666a[g6];
        }
        throw z0.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static C0440a c(d6.v vVar, boolean z10) throws z0 {
        int g6 = vVar.g(5);
        if (g6 == 31) {
            g6 = vVar.g(6) + 32;
        }
        int b10 = b(vVar);
        int g10 = vVar.g(4);
        String i10 = a3.l.i("mp4a.40.", g6);
        if (g6 == 5 || g6 == 29) {
            b10 = b(vVar);
            int g11 = vVar.g(5);
            if (g11 == 31) {
                g11 = vVar.g(6) + 32;
            }
            g6 = g11;
            if (g6 == 22) {
                g10 = vVar.g(4);
            }
        }
        if (z10) {
            if (g6 != 1 && g6 != 2 && g6 != 3 && g6 != 4 && g6 != 6 && g6 != 7 && g6 != 17) {
                switch (g6) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw z0.c("Unsupported audio object type: " + g6);
                }
            }
            if (vVar.f()) {
                d6.p.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (vVar.f()) {
                vVar.m(14);
            }
            boolean f = vVar.f();
            if (g10 != 0) {
                if (g6 == 6 || g6 == 20) {
                    vVar.m(3);
                }
                if (f) {
                    if (g6 == 22) {
                        vVar.m(16);
                    }
                    if (g6 == 17 || g6 == 19 || g6 == 20 || g6 == 23) {
                        vVar.m(3);
                    }
                    vVar.m(1);
                }
                switch (g6) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int g12 = vVar.g(2);
                        if (g12 == 2 || g12 == 3) {
                            throw z0.c("Unsupported epConfig: " + g12);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i11 = f32667b[g10];
        if (i11 != -1) {
            return new C0440a(b10, i11, i10);
        }
        throw z0.a(null, null);
    }
}
