package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1247Tp implements GQ {
    public static byte[] A00;
    public static final GP A01;
    public static final C1247Tp A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 59, 51, 51, 63, -26, 57, 53, 59, 56, 41, 43};
    }

    static {
        A01();
        A02 = new C1247Tp();
        A01 = new C1248Tq();
    }

    public C1247Tp() {
    }

    public /* synthetic */ C1247Tp(C1248Tq c1248Tq) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        throw new IOException(A00(0, 12, 126));
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
