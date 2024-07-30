package com.applovin.exoplayer2.l;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f16292a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f16293b = {"", "A", "B", "C"};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        y yVar = new y(bArr);
        yVar.d(9);
        int h10 = yVar.h();
        yVar.d(20);
        return Pair.create(Integer.valueOf(yVar.w()), Integer.valueOf(h10));
    }

    public static List<byte[]> a(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String a(z zVar) {
        zVar.a(24);
        int c10 = zVar.c(2);
        boolean b10 = zVar.b();
        int c11 = zVar.c(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (zVar.b()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 6;
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = zVar.c(8);
        }
        int c12 = zVar.c(8);
        Object[] objArr = new Object[5];
        objArr[0] = f16293b[c10];
        objArr[1] = Integer.valueOf(c11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(b10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(c12);
        StringBuilder sb2 = new StringBuilder(ai.a("hvc1.%s%d.%X.%c%d", objArr));
        while (i12 > 0 && iArr[i12 - 1] == 0) {
            i12--;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f16292a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }
}
