package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VL extends AbstractC0793Bp {
    public static byte[] A03;
    public final long A00;
    public final List<VL> A01;
    public final List<VK> A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, Ascii.SUB, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public VL(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final VL A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            VL vl = this.A01.get(i11);
            int childrenSize = ((AbstractC0793Bp) vl).A00;
            if (childrenSize == i10) {
                return vl;
            }
        }
        return null;
    }

    public final VK A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            VK vk = this.A02.get(i11);
            int childrenSize = ((AbstractC0793Bp) vk).A00;
            if (childrenSize == i10) {
                return vk;
            }
        }
        return null;
    }

    public final void A08(VL vl) {
        this.A01.add(vl);
    }

    public final void A09(VK vk) {
        this.A02.add(vk);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0793Bp
    public final String toString() {
        return AbstractC0793Bp.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}
