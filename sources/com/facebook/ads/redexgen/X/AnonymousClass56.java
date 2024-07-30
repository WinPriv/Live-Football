package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import com.anythink.core.c.e;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass56 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", e.f4869a, "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final AnonymousClass59 A01;
    public final C1316Wj A02;
    public final IT A03;

    public static String A0O(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A04 = new byte[]{51, 54, Ascii.CR, 54, 51, 38, 51, Ascii.CR, 48, 39, 60, 54, 62, 55, Ascii.DC2, Ascii.GS, 8, Ascii.NAK, 10, Ascii.EM, 61, Ascii.CAN, 56, Ascii.GS, 8, Ascii.GS, 62, 9, Ascii.DC2, Ascii.CAN, Ascii.DLE, Ascii.EM, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, Ascii.DEL, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0P();
    }

    public AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, IT it, C1316Wj c1316Wj) {
        this.A01 = anonymousClass59;
        this.A00 = intent;
        this.A03 = it;
        this.A02 = c1316Wj;
    }

    public /* synthetic */ AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, IT it, C1316Wj c1316Wj, AnonymousClass55 anonymousClass55) {
        this(anonymousClass59, intent, it, c1316Wj);
    }

    private C1375Ys A00() {
        return (C1375Ys) this.A00.getSerializableExtra(A0O(0, 14, 29));
    }

    public InterfaceC1030Ld A02() {
        AnonymousClass59 anonymousClass59 = this.A01;
        return new SO(anonymousClass59, this.A02, this.A03, new XR(anonymousClass59));
    }

    public InterfaceC1030Ld A03() {
        return new C07278p(this.A02, this.A03, new XR(this.A01), A00(), new S6(), 1);
    }

    public InterfaceC1030Ld A04() {
        return new C07278p(this.A02, this.A03, new XR(this.A01), (C1371Yo) this.A00.getSerializableExtra(A0O(32, 25, 116)), new S5(), 0);
    }

    public InterfaceC1030Ld A05() {
        AnonymousClass18 dataBundle = (AnonymousClass18) this.A00.getSerializableExtra(A0O(14, 18, 51));
        if (dataBundle == null) {
            return null;
        }
        String A0Z = dataBundle.A0Z();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        C1099Nw A02 = C1100Nx.A02(A0Z);
        if (A02 == null) {
            return null;
        }
        return new RM(this.A02, new XR(this.A01), A02);
    }

    public InterfaceC1030Ld A06() {
        if (ID.A23(this.A02)) {
            C1316Wj c1316Wj = this.A02;
            return new AnonymousClass79(c1316Wj, this.A03, new C6G(c1316Wj), new XR(this.A01), A00());
        }
        C1316Wj c1316Wj2 = this.A02;
        return new AnonymousClass77(c1316Wj2, this.A03, new C6G(c1316Wj2), new XR(this.A01), A00());
    }

    public InterfaceC1030Ld A07() {
        return new AnonymousClass80(this.A02, new S6(), this.A03, A00(), new C6G(this.A02), new XR(this.A01));
    }

    public InterfaceC1030Ld A08() {
        return new S9(this.A02, this.A03, new XR(this.A01), A00(), null, new S6());
    }

    public InterfaceC1030Ld A09() {
        return new C7C(this.A02, new S6(), this.A03, A00(), new C6G(this.A02), new XR(this.A01));
    }

    public InterfaceC1030Ld A0A() {
        return new C7C(this.A02, new S5(), this.A03, (C1371Yo) this.A00.getSerializableExtra(A0O(32, 25, 116)), new C6G(this.A02), new Du(this.A01));
    }

    public InterfaceC1030Ld A0B() {
        C1371Yo c1371Yo = (C1371Yo) this.A00.getSerializableExtra(A0O(32, 25, 116));
        return new S9(this.A02, this.A03, new Du(this.A01), c1371Yo, c1371Yo.A0a(), new S5());
    }

    public InterfaceC1030Ld A0C(RelativeLayout relativeLayout) {
        S7 s72 = new S7(this.A02, new XQ(this), this.A03, new XR(this.A01));
        s72.A05(relativeLayout);
        s72.A04(this.A00.getIntExtra(A0O(57, 27, 124), 200));
        LE.A0M(relativeLayout, -16777216);
        return s72;
    }
}
