package com.applovin.exoplayer2.k;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16197a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f16198b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder k10 = com.ironsource.adapters.facebook.a.k("bytes=", j10, "-");
        if (j11 != -1) {
            k10.append((j10 + j11) - 1);
        }
        return k10.toString();
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f16198b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "]"
            java.lang.String r3 = "HttpUtil"
            if (r1 != 0) goto L25
            long r4 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L11
            goto L27
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.applovin.exoplayer2.l.q.d(r3, r1)
        L25:
            r4 = -1
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L9b
            java.util.regex.Pattern r1 = com.applovin.exoplayer2.k.u.f16197a
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r6 = r1.matches()
            if (r6 == 0) goto L9b
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.Object r6 = com.applovin.exoplayer2.l.a.b(r6)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L87
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L87
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.Object r1 = com.applovin.exoplayer2.l.a.b(r1)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L87
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L87
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L63
            r4 = r6
            goto L9b
        L63:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L87
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r10 = "] ["
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r10 = r1.toString()     // Catch: java.lang.NumberFormatException -> L87
            com.applovin.exoplayer2.l.q.c(r3, r10)     // Catch: java.lang.NumberFormatException -> L87
            long r10 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L87
            r4 = r10
            goto L9b
        L87:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r10.<init>(r0)
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.applovin.exoplayer2.l.q.d(r3, r10)
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.u.a(java.lang.String, java.lang.String):long");
    }
}
