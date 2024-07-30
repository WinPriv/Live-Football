package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.y;
import com.huawei.openalliance.ad.constant.w;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15861a = Pattern.compile("^NOTE([ \t].*)?$");

    public static void a(y yVar) throws ai {
        int c10 = yVar.c();
        if (b(yVar)) {
            return;
        }
        yVar.d(c10);
        throw ai.b("Expected WEBVTT. Got " + yVar.C(), null);
    }

    public static boolean b(y yVar) {
        String C = yVar.C();
        return C != null && C.startsWith("WEBVTT");
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long a(String str) throws NumberFormatException {
        String[] b10 = com.applovin.exoplayer2.l.ai.b(str, "\\.");
        long j10 = 0;
        for (String str2 : com.applovin.exoplayer2.l.ai.a(b10[0], w.bE)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (b10.length == 2) {
            j11 += Long.parseLong(b10[1]);
        }
        return j11 * 1000;
    }
}
