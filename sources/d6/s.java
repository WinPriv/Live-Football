package d6;

import java.util.Arrays;

/* compiled from: NalUnitUtil.java */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27347a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f27348b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f27349c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f27350d = new int[10];

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27351a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27352b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27353c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27354d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f27355e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final float f27356g;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, float f) {
            this.f27351a = i10;
            this.f27352b = z10;
            this.f27353c = i11;
            this.f27354d = i12;
            this.f27355e = iArr;
            this.f = i13;
            this.f27356g = f;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27357a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27358b;

        public b(int i10, int i11, boolean z10) {
            this.f27357a = i11;
            this.f27358b = z10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f27359a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27360b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27361c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27362d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27363e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final float f27364g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f27365h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f27366i;

        /* renamed from: j, reason: collision with root package name */
        public final int f27367j;

        /* renamed from: k, reason: collision with root package name */
        public final int f27368k;

        /* renamed from: l, reason: collision with root package name */
        public final int f27369l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f27370m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f27359a = i10;
            this.f27360b = i11;
            this.f27361c = i12;
            this.f27362d = i13;
            this.f27363e = i14;
            this.f = i15;
            this.f27364g = f;
            this.f27365h = z10;
            this.f27366i = z11;
            this.f27367j = i16;
            this.f27368k = i17;
            this.f27369l = i18;
            this.f27370m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1 : bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        zArr[0] = z11;
        if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr[1] = z12;
        if (bArr[i13] == 0) {
            z13 = true;
        }
        zArr[2] = z13;
        return i11;
    }

    public static a c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 2;
        p4.y yVar = new p4.y(bArr, i10 + 2, i11);
        yVar.j(4);
        int e10 = yVar.e(3);
        yVar.i();
        int e11 = yVar.e(2);
        boolean d10 = yVar.d();
        int e12 = yVar.e(5);
        int i22 = 0;
        for (int i23 = 0; i23 < 32; i23++) {
            if (yVar.d()) {
                i22 |= 1 << i23;
            }
        }
        int i24 = 6;
        int[] iArr2 = new int[6];
        for (int i25 = 0; i25 < 6; i25++) {
            iArr2[i25] = yVar.e(8);
        }
        int e13 = yVar.e(8);
        int i26 = 0;
        for (int i27 = 0; i27 < e10; i27++) {
            if (yVar.d()) {
                i26 += 89;
            }
            if (yVar.d()) {
                i26 += 8;
            }
        }
        yVar.j(i26);
        if (e10 > 0) {
            yVar.j((8 - e10) * 2);
        }
        yVar.f();
        int f = yVar.f();
        if (f == 3) {
            yVar.i();
        }
        int f10 = yVar.f();
        int f11 = yVar.f();
        if (yVar.d()) {
            int f12 = yVar.f();
            int f13 = yVar.f();
            int f14 = yVar.f();
            int f15 = yVar.f();
            if (f != 1 && f != 2) {
                i19 = 1;
            } else {
                i19 = 2;
            }
            if (f == 1) {
                i20 = 2;
            } else {
                i20 = 1;
            }
            f10 -= (f12 + f13) * i19;
            f11 -= (f14 + f15) * i20;
        }
        yVar.f();
        yVar.f();
        int f16 = yVar.f();
        if (yVar.d()) {
            i12 = 0;
        } else {
            i12 = e10;
        }
        for (int i28 = i12; i28 <= e10; i28++) {
            yVar.f();
            yVar.f();
            yVar.f();
        }
        yVar.f();
        yVar.f();
        yVar.f();
        yVar.f();
        yVar.f();
        yVar.f();
        if (yVar.d() && yVar.d()) {
            int i29 = 0;
            int i30 = 4;
            while (i29 < i30) {
                int i31 = 0;
                while (i31 < i24) {
                    if (!yVar.d()) {
                        yVar.f();
                    } else {
                        int min = Math.min(64, 1 << ((i29 << 1) + 4));
                        if (i29 > 1) {
                            yVar.g();
                        }
                        for (int i32 = 0; i32 < min; i32++) {
                            yVar.g();
                        }
                    }
                    if (i29 == 3) {
                        i18 = 3;
                    } else {
                        i18 = 1;
                    }
                    i31 += i18;
                    i24 = 6;
                }
                i29++;
                i30 = 4;
                i24 = 6;
                i21 = 2;
            }
        }
        yVar.j(i21);
        if (yVar.d()) {
            yVar.j(8);
            yVar.f();
            yVar.f();
            yVar.i();
        }
        int f17 = yVar.f();
        int i33 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i34 = -1;
        boolean z10 = true;
        int i35 = -1;
        while (i33 < f17) {
            if (i33 == 0 || !yVar.d()) {
                z10 = false;
            }
            if (z10) {
                i13 = f17;
                int i36 = i34 + i35;
                int f18 = (1 - ((yVar.d() ? 1 : 0) * 2)) * (yVar.f() + 1);
                i17 = f10;
                int i37 = i36 + 1;
                i16 = e13;
                boolean[] zArr = new boolean[i37];
                iArr = iArr2;
                for (int i38 = 0; i38 <= i36; i38++) {
                    if (!yVar.d()) {
                        zArr[i38] = yVar.d();
                    } else {
                        zArr[i38] = true;
                    }
                }
                int[] iArr5 = new int[i37];
                int[] iArr6 = new int[i37];
                int i39 = 0;
                for (int i40 = i35 - 1; i40 >= 0; i40--) {
                    int i41 = iArr4[i40] + f18;
                    if (i41 < 0 && zArr[i34 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (f18 < 0 && zArr[i36]) {
                    iArr5[i39] = f18;
                    i39++;
                }
                i15 = i22;
                i14 = e12;
                int i42 = i39;
                for (int i43 = 0; i43 < i34; i43++) {
                    int i44 = iArr3[i43] + f18;
                    if (i44 < 0 && zArr[i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i42);
                int i45 = 0;
                for (int i46 = i34 - 1; i46 >= 0; i46--) {
                    int i47 = iArr3[i46] + f18;
                    if (i47 > 0 && zArr[i46]) {
                        iArr6[i45] = i47;
                        i45++;
                    }
                }
                if (f18 > 0 && zArr[i36]) {
                    iArr6[i45] = f18;
                    i45++;
                }
                int i48 = i45;
                for (int i49 = 0; i49 < i35; i49++) {
                    int i50 = iArr4[i49] + f18;
                    if (i50 > 0 && zArr[i34 + i49]) {
                        iArr6[i48] = i50;
                        i48++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i48);
                i35 = i48;
                i34 = i42;
                iArr3 = copyOf;
            } else {
                i13 = f17;
                i14 = e12;
                i15 = i22;
                iArr = iArr2;
                i16 = e13;
                i17 = f10;
                int f19 = yVar.f();
                int f20 = yVar.f();
                int[] iArr7 = new int[f19];
                for (int i51 = 0; i51 < f19; i51++) {
                    iArr7[i51] = yVar.f() + 1;
                    yVar.i();
                }
                int i52 = 1;
                int[] iArr8 = new int[f20];
                int i53 = 0;
                while (i53 < f20) {
                    iArr8[i53] = yVar.f() + i52;
                    yVar.i();
                    i53++;
                    i52 = 1;
                }
                i34 = f19;
                i35 = f20;
                iArr3 = iArr7;
                iArr4 = iArr8;
            }
            i33++;
            z10 = true;
            f17 = i13;
            f10 = i17;
            e13 = i16;
            e12 = i14;
            iArr2 = iArr;
            i22 = i15;
        }
        int i54 = e12;
        int i55 = i22;
        int[] iArr9 = iArr2;
        int i56 = e13;
        int i57 = f10;
        if (yVar.d()) {
            for (int i58 = 0; i58 < yVar.f(); i58++) {
                yVar.j(f16 + 4 + 1);
            }
        }
        yVar.j(2);
        float f21 = 1.0f;
        if (yVar.d()) {
            if (yVar.d()) {
                int e14 = yVar.e(8);
                if (e14 == 255) {
                    int e15 = yVar.e(16);
                    int e16 = yVar.e(16);
                    if (e15 != 0 && e16 != 0) {
                        f21 = e15 / e16;
                    }
                } else if (e14 < 17) {
                    f21 = f27348b[e14];
                } else {
                    a3.k.s("Unexpected aspect_ratio_idc value: ", e14, "NalUnitUtil");
                }
            }
            if (yVar.d()) {
                yVar.i();
            }
            if (yVar.d()) {
                yVar.j(4);
                if (yVar.d()) {
                    yVar.j(24);
                }
            }
            if (yVar.d()) {
                yVar.f();
                yVar.f();
            }
            yVar.i();
            if (yVar.d()) {
                f11 *= 2;
            }
        }
        return new a(e11, d10, i54, i55, iArr9, i56, i57, f11, f21);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d6.s.c d(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.s.d(byte[], int, int):d6.s$c");
    }

    public static int e(int i10, byte[] bArr) {
        int i11;
        synchronized (f27349c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 < i10 - 2) {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = i10;
                        break;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f27350d;
                    if (iArr.length <= i13) {
                        f27350d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f27350d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f27350d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
