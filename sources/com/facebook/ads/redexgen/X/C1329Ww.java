package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1329Ww implements InterfaceC06515h {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC06545k A00;
    public final C6G A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, Ascii.SI, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, Ascii.CR, -13, -8, 70, Ascii.EM, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, Ascii.FF, 9, Ascii.FF, Ascii.CR, Ascii.NAK, Ascii.FF};
    }

    static {
        A02();
        A03 = C1329Ww.class.getSimpleName();
    }

    public C1329Ww(InterfaceC06545k interfaceC06545k, C1315Wi c1315Wi) {
        this.A00 = interfaceC06545k;
        this.A00.A3D(new C1331Wy(this));
        this.A01 = new C6G(c1315Wi);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5h().size()));
        }
        for (InterfaceC06575n asset : this.A00.A5h()) {
            int i10 = C06535j.A00[asset.A7h().ordinal()];
            if (i10 == 1) {
                A04(asset.getUrl());
            } else if (i10 == 2) {
                A06(asset.getUrl());
            } else if (i10 == 3) {
                A05(asset.getUrl());
            }
        }
        this.A01.A0W(new C1330Wx(this), new AnonymousClass69(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C6E c6e = new C6E(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c6e.A01 = A00(117, 8, 90);
        this.A01.A0b(c6e);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C6C c6c = new C6C(str, A00(81, 36, 11), A00(125, 7, 46));
        c6c.A04 = true;
        c6c.A02 = A00(117, 8, 90);
        this.A01.A0X(c6c);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C6C c6c = new C6C(str, A00(81, 36, 11), A00(125, 7, 46));
        c6c.A04 = false;
        c6c.A02 = A00(117, 8, 90);
        this.A01.A0a(c6c);
    }
}
