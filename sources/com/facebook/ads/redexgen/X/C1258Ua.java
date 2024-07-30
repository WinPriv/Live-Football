package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1258Ua implements InterfaceC0825Cw {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, Ascii.FS, Ascii.SUB, Ascii.FF, Ascii.VT, Ascii.FS, 84, 9, Ascii.NAK, Ascii.CAN, 0, Ascii.ESC, Ascii.CAN, Ascii.SUB, Ascii.DC2};
    }

    public C1258Ua(boolean z10) {
        this.A01 = z10 ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final int A64() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final MediaCodecInfo A65(int i10) {
        A01();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final boolean A8c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 94));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Cw
    public final boolean AEB() {
        return true;
    }
}
