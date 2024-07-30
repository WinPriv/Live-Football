package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class EB extends AbstractC1358Yb {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, Ascii.FF, 69, 95, Ascii.FF, 66, 67, 88, Ascii.FF, 94, 73, 77, 72, 85, Ascii.FF, 67, 94, Ascii.FF, 77, 64, 94, 73, 77, 72, 85, Ascii.FF, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public EB(C1316Wj c1316Wj, C05581p c05581p) {
        super(c1316Wj, c05581p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j10));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new Q8(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0J() {
        Z9 z92 = (Z9) this.A01;
        if (z92.A0T()) {
            if (this.A06 != null) {
                this.A06.A0B(z92);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0L(InterfaceC05300n interfaceC05300n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C05591q c05591q) {
        Z9 z92 = (Z9) interfaceC05300n;
        long currentTimeMillis = System.currentTimeMillis();
        YY yy = new YY(this, c05591q, z92, currentTimeMillis, anonymousClass81);
        A0C().postDelayed(yy, anonymousClass83.A05().A05());
        z92.A0L(this.A0B, new YX(this, yy, currentTimeMillis, anonymousClass81), this.A08, c05591q, C1228Sw.A0K());
    }
}
