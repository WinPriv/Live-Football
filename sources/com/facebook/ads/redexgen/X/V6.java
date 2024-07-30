package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.facebook.ads.internal.exoplayer2.Format;
import com.huawei.openalliance.ad.constant.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class V6 extends CK {
    public static byte[] A01;
    public static String[] A02 = {"nsRNjMJCINzttEcy6gRH", "iLBhdjTg3OKb8ywbNnp8pgqKlG", "RImCZo78JGnCd", "MQCM5Bft3v5AKfjxIzCtQe6XKQuHj9cI", "eIxys3n1xHnYXLY6XFR5ULs5u2Lm7Uxd", "C5r06ne3nHFGIipq1ktKTjeYxK5IlnNR", "VUYnCtCcQXjB1sQxVfFNmblLRJpOLxas", "bjyChy1rj1vSDo4qa0ykMaouAr"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{119, -104, -99, -101, -59, -39, -56, -51, -45, -109, -45, -44, -39, -41};
    }

    static {
        A02();
        A03 = C0940Hl.A08(A01(0, 4, 33));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i10;
        int i11;
        int i12 = bArr[0] & DefaultClassResolver.NAME;
        int i13 = i12 & 3;
        if (i13 == 0) {
            i10 = 1;
        } else if (i13 != 1 && i13 != 2) {
            int toc = bArr[1];
            i10 = toc & 63;
        } else {
            i10 = 2;
        }
        int frames = i12 >> 3;
        int i14 = frames & 3;
        if (frames >= 16) {
            i11 = 2500 << i14;
        } else if (frames >= 12) {
            int toc2 = i14 & 1;
            i11 = 10000 << toc2;
        } else {
            String[] strArr = A02;
            String str = strArr[0];
            String str2 = strArr[2];
            int frames2 = str.length();
            int toc3 = str2.length();
            if (frames2 == toc3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "5xugLvQ3PcyvpmKVP2TF";
            strArr2[2] = "0gGe0pFYIsJYF";
            if (i14 == 3) {
                i11 = w.f22171t;
            } else {
                i11 = 10000 << i14;
            }
        }
        return i10 * i11;
    }

    private void A03(List<byte[]> initializationData, int i10) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i10 * b.f7300h) / 48000).array());
    }

    public static boolean A04(HV hv) {
        int A042 = hv.A04();
        byte[] bArr = A04;
        if (A042 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        hv.A0c(bArr2, 0, bArr.length);
        byte[] header = A04;
        return Arrays.equals(bArr2, header);
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final long A07(HV hv) {
        return A04(A00(hv.A00));
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean A0A(HV hv, long j10, CJ cj) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(hv.A00, hv.A07());
            int i10 = copyOf[9] & DefaultClassResolver.NAME;
            int i11 = ((copyOf[11] & DefaultClassResolver.NAME) << 8) | (copyOf[10] & DefaultClassResolver.NAME);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, i11);
            A03(arrayList, 3840);
            cj.A00 = Format.A07(null, A01(4, 10, 93), null, -1, -1, i10, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z10 = hv.A08() == A03;
        hv.A0Y(0);
        return z10;
    }
}
