package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FU {
    public static byte[] A00;
    public static String[] A01 = {"ijZd2SvY", "Ph5fJqf6OowbUT2cqzgcB298kDhnW2OX", "wB5WDB4JU6krUWdN", "eBmlwoifn7sQacvwvpCdDN7mM49lFTV9", "8TaUd8AxspPDe4hMAHd3njvqxnnZalZZ", "my8xvAbSAhbAvtjE", "sCujs14tvAISPjVlxjJqhwIZMpV4htIn", "ZuHVfppKLGIB3c7uxsgIg35bH7izaigq"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-52, -18, -22, -34, -3, -14, -11, 113, -127, 116, 94, -71, -77, -85, -90, -99, -75, -77, -70, -70, -77, -72, -79, 106, -68, -81, -73, -85, -77, -72, -82, -81, -68, 106, -71, -80, 106, -73, -85, -74, -80, -71, -68, -73, -81, -82, 106, -99, -113, -109, 106, -104, -117, -106, 106, -65, -72, -77, -66, 120};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A03(long j10, HV hv, InterfaceC0789Ba[] interfaceC0789BaArr) {
        while (hv.A04() > 1) {
            int A002 = A00(hv);
            int A003 = A00(hv);
            int A06 = hv.A06() + A003;
            if (A003 == -1 || A003 > hv.A04()) {
                Log.w(A01(0, 7, 125), A01(15, 45, 62));
                A06 = hv.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = hv.A0E();
                int A0I = hv.A0I();
                int A08 = A0I == 49 ? hv.A08() : 0;
                int A0E2 = hv.A0E();
                if (A0I == 47) {
                    hv.A0Z(1);
                }
                boolean z10 = A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3;
                if (A0I == 49) {
                    z10 &= A08 == A03 || A08 == A02;
                }
                if (z10) {
                    int A0E3 = hv.A0E() & 31;
                    hv.A0Z(1);
                    int i10 = A0E3 * 3;
                    int A062 = hv.A06();
                    for (InterfaceC0789Ba interfaceC0789Ba : interfaceC0789BaArr) {
                        hv.A0Y(A062);
                        interfaceC0789Ba.AE8(hv, i10);
                        interfaceC0789Ba.AE9(j10, 1, i10, 0, null);
                    }
                }
            }
            hv.A0Y(A06);
        }
    }

    static {
        A02();
        A03 = C0940Hl.A08(A01(11, 4, 102));
        A02 = C0940Hl.A08(A01(7, 4, 33));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.X.HV r5) {
        /*
            r4 = 0
        L1:
            int r0 = r5.A04()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r3 = r5.A0E()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FU.A01
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L25
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L25:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FU.A01
            java.lang.String r1 = "2iVFcVRayhlXICIL"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "cB88SmkuRLYvydLN"
            r0 = 5
            r2[r0] = r1
            int r4 = r4 + r3
            r0 = 255(0xff, float:3.57E-43)
            if (r3 == r0) goto L1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FU.A00(com.facebook.ads.redexgen.X.HV):int");
    }
}
