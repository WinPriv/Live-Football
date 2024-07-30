package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05240g {
    public static byte[] A00;
    public static final String A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AbstractC05230f A01(com.facebook.ads.redexgen.X.C1316Wj r14, com.facebook.ads.redexgen.X.IT r15, java.lang.String r16, @androidx.annotation.Nullable android.net.Uri r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05240g.A01(com.facebook.ads.redexgen.X.Wj, com.facebook.ads.redexgen.X.IT, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.redexgen.X.0f");
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 80, 73, 85, 84, Ascii.SUB, 94, 91, 78, 91, Ascii.SUB, 83, 84, Ascii.SUB, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, Ascii.DC4, 19, Ascii.SYN, 3, Ascii.SYN, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, Ascii.ESC, 10, Ascii.CAN, Ascii.CAN, Ascii.US, 3, Ascii.EM, 4, Ascii.RS, Ascii.FF, 3, 39, 32, 59, 38, 49, 47, 41, 46, 62, 51, 44, 33, 32, 42, Ascii.SUB, 48, 55, 41};
    }

    static {
        A03();
        A01 = C05240g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC05230f A00(C1316Wj c1316Wj, IT it, String str, @Nullable Uri uri, Map<String, String> extraData) {
        return A01(c1316Wj, it, str, uri, extraData, true, false);
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
