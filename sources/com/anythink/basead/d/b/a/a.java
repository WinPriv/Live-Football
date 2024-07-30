package com.anythink.basead.d.b.a;

import android.net.Uri;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00a1: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:26:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.basead.c.d a(com.anythink.core.common.e.j r9, com.anythink.core.common.e.i r10, java.lang.String r11) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r2 = 0
            r1.setInstanceFollowRedirects(r2)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r2 = 30000(0x7530, float:4.2039E-41)
            r1.setConnectTimeout(r2)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r1.connect()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            int r2 = r1.getResponseCode()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L73
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r3.<init>(r2)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r4.<init>(r3)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
        L38:
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            if (r6 == 0) goto L42
            r5.append(r6)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            goto L38
        L42:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r6.<init>(r5)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r6.optJSONObject(r5)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r6 = "dstlink"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r7 = "clickid"
            java.lang.String r5 = r5.optString(r7)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            com.anythink.basead.c.d r7 = new com.anythink.basead.c.d     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r8 = ""
            r7.<init>(r6, r8, r5)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r4.close()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            r3.close()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            if (r2 == 0) goto L6f
            r2.close()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
        L6f:
            r1.disconnect()
            return r7
        L73:
            java.lang.String r5 = r10.A()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            java.lang.String r8 = ""
            r3 = r9
            r4 = r10
            r6 = r11
            com.anythink.core.common.j.c.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La0
            goto L9c
        L84:
            r2 = move-exception
            goto L8a
        L86:
            r9 = move-exception
            goto La2
        L88:
            r2 = move-exception
            r1 = r0
        L8a:
            java.lang.String r5 = r10.A()     // Catch: java.lang.Throwable -> La0
            java.lang.String r7 = ""
            java.lang.String r8 = r2.getMessage()     // Catch: java.lang.Throwable -> La0
            r3 = r9
            r4 = r10
            r6 = r11
            com.anythink.core.common.j.c.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9f
        L9c:
            r1.disconnect()
        L9f:
            return r0
        La0:
            r9 = move-exception
            r0 = r1
        La2:
            if (r0 == 0) goto La7
            r0.disconnect()
        La7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.d.b.a.a.a(com.anythink.core.common.e.j, com.anythink.core.common.e.i, java.lang.String):com.anythink.basead.c.d");
    }

    public static String a(String str) {
        try {
            return Uri.parse(str).getQueryParameter("qz_gdt");
        } catch (Throwable unused) {
            return null;
        }
    }
}
