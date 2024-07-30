package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1259Ub implements InterfaceC0825Cw {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{72, 87, 90, 91, 81, 17, 95, 72, 93};
    }

    public C1259Ub() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final int A64() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final MediaCodecInfo A65(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final boolean A8c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 51).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final boolean AEB() {
        return false;
    }
}
