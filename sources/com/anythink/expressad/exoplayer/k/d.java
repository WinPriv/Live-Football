package com.anythink.expressad.exoplayer.k;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final int f9018b = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9020d = -1;
    private static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9022g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f9023h = 22;

    /* renamed from: i, reason: collision with root package name */
    private static final int f9024i = 29;

    /* renamed from: j, reason: collision with root package name */
    private static final int f9025j = 31;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f9017a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9019c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f9021e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private d() {
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        r rVar = new r(bArr);
        int b10 = b(rVar);
        int c10 = c(rVar);
        int c11 = rVar.c(4);
        if (b10 == 5 || b10 == 29) {
            c10 = c(rVar);
            if (b(rVar) == 22) {
                c11 = rVar.c(4);
            }
        }
        int i10 = f9021e[c11];
        a.a(i10 != -1);
        return Pair.create(Integer.valueOf(c10), Integer.valueOf(i10));
    }

    private static byte[] b(int i10, int i11) {
        return new byte[]{(byte) (((i10 >> 1) & 7) | 16), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    private static int c(r rVar) {
        boolean z10;
        int c10 = rVar.c(4);
        if (c10 == 15) {
            return rVar.c(24);
        }
        if (c10 < 13) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.a(z10);
        return f9019c[c10];
    }

    private static byte[][] b(byte[] bArr) {
        if (!b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            i10 = a(bArr, i10 + f9017a.length);
        } while (i10 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int intValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }

    private static Pair<Integer, Integer> a(r rVar) {
        int b10 = b(rVar);
        int c10 = c(rVar);
        int c11 = rVar.c(4);
        if (b10 == 5 || b10 == 29) {
            c10 = c(rVar);
            if (b(rVar) == 22) {
                c11 = rVar.c(4);
            }
        }
        int i10 = f9021e[c11];
        a.a(i10 != -1);
        return Pair.create(Integer.valueOf(c10), Integer.valueOf(i10));
    }

    private static boolean b(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f9017a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f9017a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private static int b(r rVar) {
        int c10 = rVar.c(5);
        return c10 == 31 ? rVar.c(6) + 32 : c10;
    }

    private static byte[] a(int i10, int i11) {
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[] iArr = f9019c;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i12 = i13;
            }
            i13++;
        }
        int i14 = -1;
        int i15 = 0;
        while (true) {
            int[] iArr2 = f9021e;
            if (i15 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i15]) {
                i14 = i15;
            }
            i15++;
        }
        if (i10 == -1 || i14 == -1) {
            throw new IllegalArgumentException(a3.k.j("Invalid sample rate or number of channels: ", i10, ", ", i11));
        }
        return new byte[]{(byte) (((i12 >> 1) & 7) | 16), (byte) (((i12 << 7) & 128) | ((i14 << 3) & 120))};
    }

    public static byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f9017a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    private static int a(byte[] bArr, int i10) {
        int length = bArr.length - f9017a.length;
        while (i10 <= length) {
            if (b(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static void a(r rVar, int i10, int i11) {
        rVar.b(1);
        if (rVar.d()) {
            rVar.b(14);
        }
        boolean d10 = rVar.d();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            rVar.b(3);
        }
        if (d10) {
            if (i10 == 22) {
                rVar.b(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                rVar.b(3);
            }
            rVar.b(1);
        }
    }
}
