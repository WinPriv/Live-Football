package com.vungle.warren.downloader;

/* loaded from: classes2.dex */
class RangeResponse {
    private static String TAG = "com.vungle.warren.downloader.RangeResponse";
    public final String dimension;
    public final long rangeEnd;
    public final long rangeStart;
    public final long total;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RangeResponse(java.lang.String r12) {
        /*
            r11 = this;
            r11.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = -1
            r3 = 0
            if (r0 != 0) goto L80
            java.lang.String r12 = r12.trim()
            java.lang.String r0 = "\\s+"
            java.lang.String[] r12 = r12.split(r0)
            int r0 = r12.length
            r4 = 2
            if (r0 < r4) goto L80
            int r0 = r12.length
            r5 = 0
            if (r0 <= 0) goto L20
            r3 = r12[r5]
        L20:
            int r0 = r12.length
            r6 = 1
            if (r0 <= r6) goto L80
            r0 = r12[r6]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L80
            r12 = r12[r6]
            java.lang.String r0 = "/"
            java.lang.String[] r12 = r12.split(r0)
            int r0 = r12.length
            if (r0 != r4) goto L80
            r0 = r12[r5]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6b
            r0 = r12[r5]
            java.lang.String r7 = "-"
            java.lang.String[] r0 = r0.split(r7)
            int r7 = r0.length
            if (r7 != r4) goto L6b
            r4 = r0[r5]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L6b
            r4 = r0[r6]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L6b
            r4 = r0[r5]     // Catch: java.lang.Throwable -> L61
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
            r4 = r1
        L62:
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L69
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r7 = r1
            goto L6d
        L6b:
            r4 = r1
            r7 = r4
        L6d:
            r0 = r12[r6]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7b
            r12 = r12[r6]     // Catch: java.lang.Throwable -> L7b
            long r1 = java.lang.Long.parseLong(r12)     // Catch: java.lang.Throwable -> L7b
        L7b:
            r12 = r3
            r9 = r1
            r1 = r4
            r3 = r9
            goto L83
        L80:
            r7 = r1
            r12 = r3
            r3 = r7
        L83:
            r11.rangeStart = r1
            r11.rangeEnd = r7
            r11.total = r3
            r11.dimension = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.RangeResponse.<init>(java.lang.String):void");
    }
}
