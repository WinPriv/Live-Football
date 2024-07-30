package t5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import d6.g0;
import d6.v;

/* compiled from: DvbParser.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f35461h = {0, 7, 8, Ascii.SI};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f35462i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f35463j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f35464a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f35465b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f35466c;

    /* renamed from: d, reason: collision with root package name */
    public final C0487b f35467d;

    /* renamed from: e, reason: collision with root package name */
    public final a f35468e;
    public final h f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f35469g;

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f35470a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f35471b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f35472c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f35473d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f35470a = i10;
            this.f35471b = iArr;
            this.f35472c = iArr2;
            this.f35473d = iArr3;
        }
    }

    /* compiled from: DvbParser.java */
    /* renamed from: t5.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0487b {

        /* renamed from: a, reason: collision with root package name */
        public final int f35474a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35475b;

        /* renamed from: c, reason: collision with root package name */
        public final int f35476c;

        /* renamed from: d, reason: collision with root package name */
        public final int f35477d;

        /* renamed from: e, reason: collision with root package name */
        public final int f35478e;
        public final int f;

        public C0487b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f35474a = i10;
            this.f35475b = i11;
            this.f35476c = i12;
            this.f35477d = i13;
            this.f35478e = i14;
            this.f = i15;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f35479a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35480b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f35481c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f35482d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f35479a = i10;
            this.f35480b = z10;
            this.f35481c = bArr;
            this.f35482d = bArr2;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f35483a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35484b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f35485c;

        public d(int i10, int i11, SparseArray sparseArray) {
            this.f35483a = i10;
            this.f35484b = i11;
            this.f35485c = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f35486a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35487b;

        public e(int i10, int i11) {
            this.f35486a = i10;
            this.f35487b = i11;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f35488a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35489b;

        /* renamed from: c, reason: collision with root package name */
        public final int f35490c;

        /* renamed from: d, reason: collision with root package name */
        public final int f35491d;

        /* renamed from: e, reason: collision with root package name */
        public final int f35492e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f35493g;

        /* renamed from: h, reason: collision with root package name */
        public final int f35494h;

        /* renamed from: i, reason: collision with root package name */
        public final int f35495i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f35496j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f35488a = i10;
            this.f35489b = z10;
            this.f35490c = i11;
            this.f35491d = i12;
            this.f35492e = i13;
            this.f = i14;
            this.f35493g = i15;
            this.f35494h = i16;
            this.f35495i = i17;
            this.f35496j = sparseArray;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f35497a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35498b;

        public g(int i10, int i11) {
            this.f35497a = i10;
            this.f35498b = i11;
        }
    }

    /* compiled from: DvbParser.java */
    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f35499a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35500b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f35501c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f35502d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f35503e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f35504g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0487b f35505h;

        /* renamed from: i, reason: collision with root package name */
        public d f35506i;

        public h(int i10, int i11) {
            this.f35499a = i10;
            this.f35500b = i11;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f35464a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f35465b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f35466c = new Canvas();
        this.f35467d = new C0487b(719, 575, 0, 719, 0, 575);
        this.f35468e = new a(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f = new h(i10, i11);
    }

    public static int[] a() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = c(p.f9095b, i12, i13, i14);
            } else {
                int i16 = i15 & 1;
                int i17 = com.anythink.expressad.video.module.a.a.R;
                if (i16 != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i17 = 0;
                }
                iArr[i15] = c(p.f9095b, i10, i11, i17);
            }
        }
        return iArr;
    }

    public static int[] b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = p.f9095b;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = c(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = c(p.f9095b, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + com.anythink.expressad.video.module.a.a.R;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + com.anythink.expressad.video.module.a.a.R;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + com.anythink.expressad.video.module.a.a.R;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = c(p.f9095b, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = c(com.anythink.expressad.video.module.a.a.R, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = c(p.f9095b, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139 A[LOOP:2: B:42:0x009d->B:53:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e8 A[LOOP:3: B:88:0x015e->B:99:0x01e8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.b.d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a e(v vVar, int i10) {
        int[] iArr;
        int g6;
        int g10;
        int i11;
        int i12;
        int i13 = 8;
        int g11 = vVar.g(8);
        vVar.m(8);
        int i14 = i10 - 2;
        int i15 = 4;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] a10 = a();
        int[] b10 = b();
        while (i14 > 0) {
            int g12 = vVar.g(i13);
            int g13 = vVar.g(i13);
            int i16 = i14 - 2;
            if ((g13 & 128) != 0) {
                iArr = iArr2;
            } else if ((g13 & 64) != 0) {
                iArr = a10;
            } else {
                iArr = b10;
            }
            if ((g13 & 1) != 0) {
                i11 = vVar.g(i13);
                i12 = vVar.g(i13);
                g6 = vVar.g(i13);
                g10 = vVar.g(i13);
                i14 = i16 - 4;
            } else {
                int g14 = vVar.g(6) << 2;
                int g15 = vVar.g(i15) << i15;
                i14 = i16 - 2;
                g6 = vVar.g(i15) << i15;
                g10 = vVar.g(2) << 6;
                i11 = g14;
                i12 = g15;
            }
            if (i11 == 0) {
                g10 = 255;
                i12 = 0;
                g6 = 0;
            }
            double d10 = i11;
            double d11 = i12 - 128;
            double d12 = g6 - 128;
            iArr[g12] = c((byte) (255 - (g10 & p.f9095b)), g0.h((int) ((1.402d * d11) + d10), 0, p.f9095b), g0.h((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, p.f9095b), g0.h((int) ((d12 * 1.772d) + d10), 0, p.f9095b));
            iArr2 = iArr2;
            g11 = g11;
            i13 = 8;
            i15 = 4;
        }
        return new a(g11, iArr2, a10, b10);
    }

    public static c f(v vVar) {
        byte[] bArr;
        int g6 = vVar.g(16);
        vVar.m(4);
        int g10 = vVar.g(2);
        boolean f10 = vVar.f();
        vVar.m(1);
        byte[] bArr2 = g0.f;
        if (g10 == 1) {
            vVar.m(vVar.g(8) * 16);
        } else if (g10 == 0) {
            int g11 = vVar.g(16);
            int g12 = vVar.g(16);
            if (g11 > 0) {
                bArr2 = new byte[g11];
                vVar.i(bArr2, g11);
            }
            if (g12 > 0) {
                bArr = new byte[g12];
                vVar.i(bArr, g12);
                return new c(g6, f10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(g6, f10, bArr2, bArr);
    }
}
