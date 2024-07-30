package gb;

/* loaded from: classes2.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:9:0x0022, B:11:0x002d, B:13:0x0035, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x005a, B:23:0x0064, B:26:0x0068, B:29:0x006b, B:37:0x0070, B:39:0x0076, B:41:0x007c, B:46:0x0085), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = ""
            java.lang.String r2 = "PackageNameUtil"
            if (r0 != 0) goto L10
            java.lang.String r8 = "pm is null"
            com.huawei.hms.ads.ex.I(r2, r8)
            return r1
        L10:
            int r0 = android.os.Binder.getCallingUid()
            int r3 = android.os.Binder.getCallingPid()
            java.lang.String r4 = "pkg="
            android.content.pm.PackageManager r5 = r8.getPackageManager()
            if (r5 != 0) goto L22
            goto L8d
        L22:
            java.lang.String r1 = r5.getNameForUid(r0)     // Catch: java.lang.Throwable -> L88
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L88
            r7 = 0
            if (r6 != 0) goto L70
            java.lang.String r6 = ":"
            boolean r6 = r1.contains(r6)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L70
            java.lang.String r4 = r4.concat(r1)     // Catch: java.lang.Throwable -> L88
            com.huawei.hms.ads.ex.V(r2, r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "activity"
            java.lang.Object r8 = r8.getSystemService(r4)     // Catch: java.lang.Throwable -> L88
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch: java.lang.Throwable -> L88
            java.util.List r8 = r8.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L6e
            int r4 = r8.size()     // Catch: java.lang.Throwable -> L88
            if (r4 <= 0) goto L6e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L88
        L54:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L88
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4     // Catch: java.lang.Throwable -> L88
            int r6 = r4.pid     // Catch: java.lang.Throwable -> L88
            if (r6 != r3) goto L54
            java.lang.String[] r4 = r4.pkgList     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L54
            int r6 = r4.length     // Catch: java.lang.Throwable -> L88
            if (r6 <= 0) goto L54
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L88
            goto L6f
        L6e:
            r8 = 0
        L6f:
            r1 = r8
        L70:
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L8d
            java.lang.String[] r8 = r5.getPackagesForUid(r0)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L82
            int r0 = r8.length     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L80
            goto L82
        L80:
            r0 = r7
            goto L83
        L82:
            r0 = 1
        L83:
            if (r0 != 0) goto L8d
            r1 = r8[r7]     // Catch: java.lang.Throwable -> L88
            goto L8d
        L88:
            java.lang.String r8 = "get name for uid error"
            com.huawei.hms.ads.ex.I(r2, r8)
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.k.a(android.content.Context):java.lang.String");
    }
}
