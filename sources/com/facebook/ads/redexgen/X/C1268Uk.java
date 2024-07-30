package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1268Uk implements InterfaceC0805Cc {
    public static byte[] A03;
    public static String[] A04 = {"9dIhF2X5qYPGZcPrMQjFeU2FMq4Icb5t", "C7lZKzl2OzNugbLE4QJixcZrlcSgCGI7", "v7kvgcbsYqtq4Ou8B7XlURjv8wkzUozH", "8BzUB2zJ4MAZsKVthH28T9QXZJlG29jD", "wOgdV6BnuyxARX3Rbc0CvFDDXWIKfgjM", "mpBmZ", "f47n1mRwiFyOsV4myeWB5UC2YKJiwKop", "3tKYH9iJUyIyPmbH9Trftcv4NWgUsp5b"};
    public InterfaceC0789Ba A00;
    public C0936Hh A01;
    public boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.VT, Ascii.SUB, Ascii.SUB, Ascii.SYN, 19, Ascii.CR, Ascii.VT, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -39, 34, -41, Ascii.GS, Ascii.CR, Ascii.RS, Ascii.SI, -35, -33};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Cc
    public final void A48(HV hv) {
        if (!this.A02) {
            if (this.A01.A05() == b.f7291b) {
                return;
            }
            this.A00.A5T(Format.A02(null, A00(0, 20, 74), this.A01.A05()));
            this.A02 = true;
        }
        int A042 = hv.A04();
        this.A00.AE8(hv, A042);
        InterfaceC0789Ba interfaceC0789Ba = this.A00;
        if (A04[0].charAt(13) != 'c') {
            throw new RuntimeException();
        }
        A04[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        interfaceC0789Ba.AE9(this.A01.A04(), 1, A042, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Cc
    public final void A8I(C0936Hh c0936Hh, BQ bq, C0811Ci c0811Ci) {
        this.A01 = c0936Hh;
        c0811Ci.A05();
        this.A00 = bq.AF2(c0811Ci.A03(), 4);
        this.A00.A5T(Format.A0B(c0811Ci.A04(), A00(0, 20, 74), null, -1, null));
    }
}
