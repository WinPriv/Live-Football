package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1253Tv implements GQ {
    public static byte[] A03;
    public static String[] A04 = {"moGtNK96e9Al47TRfaGhqgNZaCCQZMrY", "dDjGu6T1nGcXaD4MN5VqyIi9xIOLfrVa", "SRI2bo", "WZDamcSmsks0kneQaoNnaVFzgRD59bga", "Euhi8Hajh73EHZ", "h73c4EBBc1ElpNHDE1RNYorrMsvABQfz", "Cft6Vy93uvDnG7biqQNtEhDJ3", "YtIQrPkH6VpJaJVwafduIvy1b"};
    public int A00;
    public GU A01;
    public byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, -32, 7, 6, Ascii.CAN, 10, -37, -39, -2, 43, 43, 40, 43, -39, 48, 33, 34, 37, Ascii.RS, -39, 41, Ascii.SUB, 43, 44, 34, 39, 32, -39, -5, Ascii.SUB, 44, Ascii.RS, -17, -19, -39, Ascii.RS, 39, Ascii.FS, 40, Ascii.GS, Ascii.RS, Ascii.GS, -39, 44, 45, 43, 34, 39, 32, -13, -39, -24, -26, -64, -44, -26, -42, -36, -36, -91, -66, -75, -56, -64, -75, -77, -60, -75, -76, 112, -91, -94, -103, 112, -74, -65, -62, -67, -79, -60, -118, 112, -13, Ascii.FF, 17, 19, Ascii.SO, Ascii.SO, Ascii.CR, Ascii.DLE, Ascii.DC2, 3, 2, -66, 17, 1, 6, 3, Ascii.VT, 3, -40, -66, -35, -38, -19, -38};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        GU gu = this.A01;
        if (gu != null) {
            return gu.A04;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        this.A01 = gu;
        Uri uri = gu.A04;
        String scheme = uri.getScheme();
        if (A00(102, 4, 62).equals(scheme)) {
            String[] uriParts = C0940Hl.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 18));
            if (uriParts.length == 2) {
                String str = uriParts[1];
                String str2 = uriParts[0];
                String[] uriParts2 = A04;
                String scheme2 = uriParts2[4];
                if (scheme2.length() == uriParts2[0].length()) {
                    throw new RuntimeException();
                }
                A04[5] = "WIkZ4UHmbJsePGJfUuOe0OgY6EWx9D8V";
                if (str2.contains(A00(1, 7, 106))) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        String scheme3 = A00(8, 43, 126) + str;
                        throw new C9R(scheme3, e10);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, A00(51, 8, 88)).getBytes();
                }
                return this.A02.length;
            }
            String scheme4 = A00(59, 23, 21) + uri;
            throw new C9R(scheme4);
        }
        String scheme5 = A00(82, 20, 99) + scheme;
        throw new C9R(scheme5);
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int length = this.A02.length - this.A00;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i11, length);
        byte[] bArr2 = this.A02;
        int remainingBytes = this.A00;
        System.arraycopy(bArr2, remainingBytes, bArr, i10, min);
        int remainingBytes2 = this.A00;
        this.A00 = remainingBytes2 + min;
        return min;
    }
}
