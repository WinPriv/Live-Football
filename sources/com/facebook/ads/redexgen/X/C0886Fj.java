package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.d.a.b;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0886Fj {
    public static byte[] A00;
    public static String[] A01 = {"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0890Fn A00(C0890Fn c0890Fn, String[] strArr, Map<String, C0890Fn> map) {
        if (c0890Fn == null && strArr == null) {
            return null;
        }
        int i10 = 0;
        if (c0890Fn == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (c0890Fn == null && strArr.length > 1) {
            C0890Fn c0890Fn2 = new C0890Fn();
            int length = strArr.length;
            while (i10 < length) {
                c0890Fn2.A0E(map.get(strArr[i10]));
                i10++;
            }
            return c0890Fn2;
        }
        if (c0890Fn != null && strArr != null && strArr.length == 1) {
            return c0890Fn.A0E(map.get(strArr[0]));
        }
        if (c0890Fn == null || strArr == null || strArr.length <= 1) {
            return c0890Fn;
        }
        int length2 = strArr.length;
        while (i10 < length2) {
            c0890Fn.A0E(map.get(strArr[i10]));
            i10++;
        }
        return c0890Fn;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, Ascii.FF, Ascii.VT, 53, Ascii.ESC, 17, 49, Ascii.ESC, 17, 100, Ascii.US, 54, 99, 71, Ascii.SI, 125, 51, 50, 98, Ascii.DC4};
    }

    static {
        A03();
    }

    public static String A02(String str) {
        String A012 = A01(0, 1, 106);
        String replaceAll = str.replaceAll(A01(1, 2, 93), A012).replaceAll(A01(4, 5, 103), A012);
        String A013 = A01(3, 1, 73);
        String replaceAll2 = replaceAll.replaceAll(A012, A013);
        String out = A01(9, 11, 99);
        return replaceAll2.replaceAll(out, A013);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i10, int i11, C0890Fn c0890Fn) {
        if (c0890Fn.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c0890Fn.A07()), i10, i11, 33);
        }
        if (c0890Fn.A0P()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (c0890Fn.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (c0890Fn.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c0890Fn.A05()), i10, i11, 33);
        }
        if (c0890Fn.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c0890Fn.A04()), i10, i11, 33);
        }
        if (c0890Fn.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c0890Fn.A0L()), i10, i11, 33);
        }
        Layout.Alignment A08 = c0890Fn.A08();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = b.dH;
        strArr2[2] = "ujiHtYdg";
        if (A08 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c0890Fn.A08()), i10, i11, 33);
        }
        int A06 = c0890Fn.A06();
        if (A06 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c0890Fn.A03(), true), i10, i11, 33);
        } else if (A06 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0890Fn.A03()), i10, i11, 33);
        } else {
            if (A06 != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0890Fn.A03() / 100.0f), i10, i11, 33);
        }
    }
}
