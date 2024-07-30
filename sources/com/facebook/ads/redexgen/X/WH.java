package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* loaded from: assets/audience_network.dex */
public final class WH implements C7I {
    public static WH A06;
    public static byte[] A07;
    public static String[] A08 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};

    @Nullable
    public C0U A00;

    @Nullable
    public C7H A01;

    @Nullable
    public C7X A02;

    @Nullable
    public C8B A03;

    @Nullable
    public InterfaceC0958If A04;

    @Nullable
    public FH A05;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.X.WH.A07
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WH.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WH.A08
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WH.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            goto L1c
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WH.A08
            java.lang.String r1 = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw"
            r0 = 3
            r2[r0] = r1
            int r0 = r5 + (-98)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L5c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WH.A06(int, int, int):java.lang.String");
    }

    public static void A07() {
        A07 = new byte[]{-63, -10, -55, -55, -60, -58, -55, -14, -16, 2, Ascii.DLE, Ascii.DLE, 6, Ascii.FF, Ascii.VT, -67, 1, -2, 17, -2, -67, 6, Ascii.VT, 6, 17, 6, -2, 9, 6, Ascii.ETB, 2, 1, 33, Ascii.DC4, Ascii.US, Ascii.RS, 33, 35, 2, Ascii.DC4, 34, 34, Ascii.CAN, Ascii.RS, Ascii.GS, -13, Ascii.DLE, 35, Ascii.DLE, -8, Ascii.GS, Ascii.CAN, 35, Ascii.CAN, Ascii.DLE, Ascii.ESC, Ascii.CAN, 41, Ascii.DC4, 19};
        if (A08[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1315Wi c1315Wi) {
        if (this.A05 != null) {
            return;
        }
        this.A02 = A01(c1315Wi);
        this.A05 = A05(c1315Wi, this.A02, A03(c1315Wi));
        A09(c1315Wi, A00(c1315Wi, this.A05));
        A0A(c1315Wi, this.A05);
        A0B(c1315Wi, this.A05);
        if (this.A05 != null) {
            this.A05.A5S();
        }
    }

    static {
        A07();
    }

    @Nullable
    public static InterfaceC06545k A00(C1315Wi c1315Wi, @Nullable FH fh) {
        if (!ID.A1D(c1315Wi) || fh == null) {
            return null;
        }
        return AbstractC06555l.A00().A01(fh);
    }

    public static C7X A01(C1315Wi c1315Wi) {
        return C7Y.A00().A01(c1315Wi, new WO());
    }

    public static synchronized WH A02() {
        WH wh;
        synchronized (WH.class) {
            if (A06 == null) {
                A06 = new WH();
            }
            wh = A06;
        }
        return wh;
    }

    @Nullable
    public static InterfaceC1143Po A03(C1315Wi c1315Wi) {
        if (!ID.A19(c1315Wi)) {
            return null;
        }
        return Q6.A01(c1315Wi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C7I
    @Nullable
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized FH A7b() {
        return this.A05;
    }

    @Nullable
    public static FH A05(C1315Wi c1315Wi, C7X c7x, @Nullable InterfaceC1143Po interfaceC1143Po) {
        if (!ID.A1w(c1315Wi) || interfaceC1143Po == null) {
            return null;
        }
        return QT.A00().A01(c1315Wi, c7x, interfaceC1143Po, C0979Ja.A04(c1315Wi), new WI(new JT(c1315Wi, A06(0, 0, 122), null, J8.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c1315Wi), AdSettings.isMixedAudience(), new JD(), C1023Kw.A01(ID.A0I(c1315Wi)), null, null), c1315Wi), QR.A00().A00());
    }

    public static void A08() {
        String A062 = A06(32, 28, 77);
        if (A08[5].length() == 20) {
            throw new RuntimeException();
        }
        A08[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        JH.A05(A062, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C1315Wi c1315Wi, @Nullable InterfaceC06545k interfaceC06545k) {
        if (!ID.A1D(c1315Wi) || interfaceC06545k == null) {
            return;
        }
        AbstractC06525i.A00().A01(interfaceC06545k, c1315Wi);
    }

    public static void A0A(C1315Wi c1315Wi, @Nullable FH fh) {
        if (!ID.A0j(c1315Wi) || fh == null) {
            return;
        }
        new AnonymousClass65(c1315Wi, fh, new AnonymousClass66(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1315Wi c1315Wi, @Nullable FH fh) {
        if (fh == null) {
            return;
        }
        IG.A00(c1315Wi, fh);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final IT A5a(C1315Wi c1315Wi) {
        return TI.A01(c1315Wi);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized C7H A5o(C7G c7g) {
        if (this.A01 == null) {
            this.A01 = new WJ(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized C7X A6J(C7G c7g) {
        if (this.A02 == null) {
            this.A02 = A01(c7g.A00());
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized InterfaceC06967k A6K(C7G c7g) {
        return new WX(c7g);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized C7J A6T(C7G c7g) {
        return new DW(this, c7g);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    @Nullable
    public final synchronized C0U A6g(C7G c7g) {
        if (!ID.A0u(c7g)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0V.A00().A01(new WM(c7g));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized C7L A7J(C7G c7g) {
        return new WK(c7g);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final C1315Wi A7K(Context context) {
        C1315Wi sdkContext = C7F.A00();
        if (sdkContext == null) {
            C1315Wi sdkContext2 = new C1315Wi(context, this);
            C7F.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized InterfaceC0958If A7L(C1315Wi c1315Wi) {
        if (this.A04 == null) {
            this.A04 = new TP(c1315Wi);
        }
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final synchronized C8B A7R() {
        if (this.A03 == null) {
            this.A03 = new C8B();
            A08();
        }
        return this.A03;
    }
}
