package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class X5 implements InterfaceC05611s {
    public static byte[] A03;
    public C5Q A00;
    public C1316Wj A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Ascii.DEL, 122, Ascii.DEL, 126, 102, Ascii.DEL};
    }

    public X5(C5Q c5q, C1316Wj c1316Wj, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5q;
        this.A01 = c1316Wj;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05611s
    public final void AAc(J3 j32) {
        C0989Jl.A00(new X8(this, j32));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05611s
    public final void ABX(List<Z9> list) {
        C6G manager = new C6G(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (Z9 z92 : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = z92.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (z92.A0E().A0G() != null) {
                    manager.A0b(new C6E(z92.A0E().A0G().getUrl(), z92.A0E().A0G().getHeight(), z92.A0E().A0G().getWidth(), z92.A0G(), A02(0, 6, 2)));
                }
                if (z92.A0E().A0F() != null) {
                    manager.A0b(new C6E(z92.A0E().A0F().getUrl(), z92.A0E().A0F().getHeight(), z92.A0E().A0F().getWidth(), z92.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(z92.A0E().A0d())) {
                    manager.A0a(new C6C(z92.A0E().A0d(), z92.A0G(), A02(0, 6, 2), z92.A0E().A0A()));
                }
            }
        }
        manager.A0W(new X6(this, list), new AnonymousClass69(firstRequestId, A02(0, 6, 2)));
    }
}
