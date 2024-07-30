package com.huawei.openalliance.ad.ppskit.utils;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes2.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f23007a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23008b = new byte[256];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            f23008b[i10] = -1;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f23008b[i11] = (byte) (i11 - 65);
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            f23008b[i12] = (byte) ((i12 - 97) + 26);
        }
        for (int i13 = 48; i13 <= 57; i13++) {
            f23008b[i13] = (byte) ((i13 - 48) + 26 + 26);
        }
        byte[] bArr = f23008b;
        bArr[43] = 62;
        bArr[45] = 63;
    }

    public static String a(byte[] bArr) {
        boolean z10;
        int i10;
        int length = bArr.length;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = (bArr[i11] & DefaultClassResolver.NAME) << 8;
            int i14 = i11 + 1;
            boolean z11 = true;
            if (i14 < length) {
                i13 |= bArr[i14] & DefaultClassResolver.NAME;
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = i13 << 8;
            int i16 = i11 + 2;
            if (i16 < length) {
                i15 |= bArr[i16] & DefaultClassResolver.NAME;
            } else {
                z11 = false;
            }
            int i17 = i12 + 3;
            int i18 = 64;
            if (z11) {
                i10 = i15 & 63;
            } else {
                i10 = 64;
            }
            char[] cArr2 = f23007a;
            cArr[i17] = cArr2[i10];
            int i19 = i15 >> 6;
            int i20 = i12 + 2;
            if (z10) {
                i18 = i19 & 63;
            }
            cArr[i20] = cArr2[i18];
            int i21 = i19 >> 6;
            cArr[i12 + 1] = cArr2[i21 & 63];
            cArr[i12] = cArr2[(i21 >> 6) & 63];
            i11 += 3;
            i12 += 4;
        }
        return new String(cArr);
    }
}
