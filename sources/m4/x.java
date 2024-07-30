package m4;

/* compiled from: MpegAudioUtil.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f32869a = {com.anythink.expressad.exoplayer.k.o.f9086u, com.anythink.expressad.exoplayer.k.o.f9087v, com.anythink.expressad.exoplayer.k.o.f9085t};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f32870b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f32871c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f32872d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f32873e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f32874g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f32875a;

        /* renamed from: b, reason: collision with root package name */
        public String f32876b;

        /* renamed from: c, reason: collision with root package name */
        public int f32877c;

        /* renamed from: d, reason: collision with root package name */
        public int f32878d;

        /* renamed from: e, reason: collision with root package name */
        public int f32879e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f32880g;

        public final boolean a(int i10) {
            boolean z10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            if ((i10 & (-2097152)) == -2097152) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f32875a = i11;
            this.f32876b = x.f32869a[3 - i12];
            int i17 = x.f32870b[i14];
            this.f32878d = i17;
            int i18 = 2;
            if (i11 == 2) {
                this.f32878d = i17 / 2;
            } else if (i11 == 0) {
                this.f32878d = i17 / 4;
            }
            int i19 = (i10 >>> 9) & 1;
            int i20 = 1152;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i20 = 384;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else if (i11 != 3) {
                i20 = 576;
            }
            this.f32880g = i20;
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = x.f32871c[i13 - 1];
                } else {
                    i16 = x.f32872d[i13 - 1];
                }
                this.f = i16;
                this.f32877c = (((i16 * 12) / this.f32878d) + i19) * 4;
            } else {
                int i21 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = x.f32873e[i13 - 1];
                    } else {
                        i15 = x.f[i13 - 1];
                    }
                    this.f = i15;
                    this.f32877c = ((i15 * 144) / this.f32878d) + i19;
                } else {
                    int i22 = x.f32874g[i13 - 1];
                    this.f = i22;
                    if (i12 == 1) {
                        i21 = 72;
                    }
                    this.f32877c = ((i21 * i22) / this.f32878d) + i19;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.f32879e = i18;
            return true;
        }
    }

    public static int a(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f32870b[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f32871c[i13 - 1];
            } else {
                i16 = f32872d[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f32873e[i13 - 1];
            } else {
                i15 = f[i13 - 1];
            }
        } else {
            i15 = f32874g[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i17) + i18;
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return ((i19 * i15) / i17) + i18;
    }

    public static int b(int i10) {
        boolean z10;
        int i11;
        int i12;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                return 1152;
            }
            if (i12 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        if (i11 == 3) {
            return 1152;
        }
        return 576;
    }
}
