package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0814Cl {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C1261Ud A00(com.facebook.ads.redexgen.X.BP r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0814Cl.A00(com.facebook.ads.redexgen.X.BP):com.facebook.ads.redexgen.X.Ud");
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{10, 76, 69, 88, 10, 94, 83, 90, 79, 10, 66, 89, Ascii.RS, Ascii.SYN, Ascii.CR, 67, 89, 84, Ascii.DEL, 98, 121, 124, 55, 126, 100, 55, 99, 120, 120, 55, 123, 118, 101, 112, 114, 55, 63, 105, 37, 80, 85, 60, 62, 55, 99, 120, 55, 100, 124, 126, 103, 44, 55, 126, 115, 45, 55, 84, 105, 97, 116, 114, 101, 116, 117, 49, 115, 125, 126, 114, 122, 49, 112, 125, 120, 118, Ascii.DEL, 124, 116, Ascii.DEL, 101, 43, 49, 92, 114, 123, 122, 103, 124, 123, 114, 53, 96, 123, 126, 123, 122, 98, 123, 53, 66, 84, 67, 53, 118, 125, 96, 123, 126, 47, 53, 108, 119, 120, 120, 119, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 2, 112, 107, 100, 100, 2, 68, 77, 80, 79, 67, 86, Ascii.CAN, 2, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, Ascii.CAN, 111, 121, 110, Ascii.CAN, 90, 81, 76, Ascii.CAN, 92, 93, 72, 76, 80, Ascii.CAN, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, Ascii.US, 104, 126, 105, Ascii.US, 89, 80, 77, 82, 94, 75, Ascii.US, 75, 70, 79, 90, 5, Ascii.US, 5, 19, 4, Ascii.ETB, Ascii.CAN, 46, 57, 7, 42, 46, 43, 42, 61, Ascii.GS, 42, 46, 43, 42, 61, 102, 99, 118, 99, 19, Ascii.CAN, 1, 85};
    }

    public static void A03(BP bp, C1261Ud c1261Ud) throws IOException, InterruptedException {
        H6.A01(bp);
        H6.A01(c1261Ud);
        bp.AE3();
        HV hv = new HV(8);
        C0813Ck A002 = C0813Ck.A00(bp, hv);
        while (A002.A00 != C0940Hl.A08(A01(214, 4, 50))) {
            Log.w(A01(199, 15, a.R), A01(83, 28, 37) + A002.A00);
            long j10 = A002.A01 + 8;
            if (A002.A00 == C0940Hl.A08(A01(111, 4, 14))) {
                j10 = 12;
            }
            if (j10 <= 2147483647L) {
                bp.AEk((int) j10);
                A002 = C0813Ck.A00(bp, hv);
            } else {
                throw new C9R(A01(17, 40, 39) + A002.A00);
            }
        }
        bp.AEk(8);
        c1261Ud.A06(bp.A7D(), A002.A01);
    }
}
