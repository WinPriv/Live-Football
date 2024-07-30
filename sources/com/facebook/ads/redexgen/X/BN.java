package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class BN {
    public static byte[] A00;

    static {
        A03();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static long A00(Map<String, String> map, String str) {
        if (map == null) {
            return b.f7291b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : b.f7291b;
        } catch (NumberFormatException unused) {
            return b.f7291b;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Long, Long> A01(B7<?> b72) {
        Map<String, String> ADM = b72.ADM();
        if (ADM == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(ADM, A02(0, 24, 28))), Long.valueOf(A00(ADM, A02(24, 25, 25))));
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Ascii.RS, 59, 49, 55, 60, 33, 55, Ascii.SYN, 39, 32, 51, 38, 59, 61, 60, 0, 55, 63, 51, 59, 60, 59, 60, 53, 7, 59, 54, 46, 53, 54, 52, 60, 19, 34, 37, 54, 35, 62, 56, 57, 5, 50, 58, 54, 62, 57, 62, 57, 48};
    }
}
