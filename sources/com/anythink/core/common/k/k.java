package com.anythink.core.common.k;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f6194a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f6195b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private k() {
    }

    private static char[] a(byte[] bArr, boolean z10) {
        return a(bArr, z10 ? f6195b : f6194a);
    }

    private static char[] b(byte[] bArr) {
        return a(bArr, false);
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & Ascii.SI];
        }
        return cArr2;
    }

    public static String a(byte[] bArr) {
        return new String(a(bArr, true));
    }
}
