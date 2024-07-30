package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1023Kw {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, Ascii.DLE, 5, 45, 2, 90, 42, Ascii.DLE, 92, Ascii.VT, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, Ascii.ESC, 72, 79, 90, 88, 80, Ascii.ESC, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i10) {
        if (i10 <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i10) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        int A0H = ID.A0H(context);
        int maxStacktraceLines = ID.A02(context);
        return A06(th, A0H, maxStacktraceLines, ID.A15(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i10, int i11, boolean z10) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C1208Sb c1208Sb = new C1208Sb();
            InterfaceC1021Ku result = c1208Sb;
            if (i11 >= 0) {
                result = new SZ(result, i11);
            }
            if (i10 >= 0) {
                result = new SY(result, i10, i10);
            }
            if (z10) {
                result = new C1207Sa(result);
            }
            InterfaceC1021Ku input = new C1209Sc(c1208Sb, 1, result);
            th.printStackTrace(new PrintWriter(new C1022Kv(input)));
            input.flush();
            return c1208Sb.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(C1020Kt c1020Kt) {
        String middle = c1020Kt.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        Iterator<String> it = c1020Kt.A01().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = c1020Kt.A00().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
