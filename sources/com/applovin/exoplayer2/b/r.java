package com.applovin.exoplayer2.b;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f13508a = {com.anythink.expressad.exoplayer.k.o.f9086u, com.anythink.expressad.exoplayer.k.o.f9087v, com.anythink.expressad.exoplayer.k.o.f9085t};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13509b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13510c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13511d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f13512e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f13513g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13514a;

        /* renamed from: b, reason: collision with root package name */
        public String f13515b;

        /* renamed from: c, reason: collision with root package name */
        public int f13516c;

        /* renamed from: d, reason: collision with root package name */
        public int f13517d;

        /* renamed from: e, reason: collision with root package name */
        public int f13518e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f13519g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            if (!r.d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f13514a = i11;
            this.f13515b = r.f13508a[3 - i12];
            int i17 = r.f13509b[i14];
            this.f13517d = i17;
            int i18 = 2;
            if (i11 == 2) {
                this.f13517d = i17 / 2;
            } else if (i11 == 0) {
                this.f13517d = i17 / 4;
            }
            int i19 = (i10 >>> 9) & 1;
            this.f13519g = r.b(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = r.f13510c[i13 - 1];
                } else {
                    i16 = r.f13511d[i13 - 1];
                }
                this.f = i16;
                this.f13516c = (((i16 * 12) / this.f13517d) + i19) * 4;
            } else {
                int i20 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = r.f13512e[i13 - 1];
                    } else {
                        i15 = r.f[i13 - 1];
                    }
                    this.f = i15;
                    this.f13516c = ((i15 * 144) / this.f13517d) + i19;
                } else {
                    int i21 = r.f13513g[i13 - 1];
                    this.f = i21;
                    if (i12 == 1) {
                        i20 = 72;
                    }
                    this.f13516c = ((i20 * i21) / this.f13517d) + i19;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.f13518e = i18;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int b(int i10) {
        int i11;
        int i12;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return b(i11, i12);
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f13509b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f13510c[i13 - 1] : f13511d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f13512e[i13 - 1] : f[i13 - 1];
        } else {
            i15 = f13513g[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
