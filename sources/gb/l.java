package gb;

/* loaded from: classes2.dex */
public abstract class l {
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:7:0x001b, B:15:0x0022, B:17:0x0028, B:21:0x002f, B:24:0x0036, B:26:0x003c, B:28:0x0046, B:34:0x0050, B:36:0x0052), top: B:6:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "PermissionUtil"
            r1 = 0
            if (r8 == 0) goto L6e
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto Ld
            goto L6e
        Ld:
            java.lang.String r2 = r8.getPackageName()
            int r3 = android.os.Process.myPid()
            int r4 = android.os.Process.myUid()
            r5 = 1
            r6 = -1
            int r3 = r8.checkPermission(r9, r3, r4)     // Catch: java.lang.Throwable -> L64
            if (r6 != r3) goto L22
            goto L6a
        L22:
            android.content.pm.ApplicationInfo r3 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L2f
            int r3 = r3.targetSdkVersion     // Catch: java.lang.Throwable -> L64
            r7 = 23
            if (r3 <= r7) goto L2f
            goto L62
        L2f:
            java.lang.String r9 = android.app.AppOpsManager.permissionToOp(r9)     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L36
            goto L62
        L36:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L52
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L64
            java.lang.String[] r2 = r2.getPackagesForUid(r4)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L4c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L4a
            goto L4c
        L4a:
            r3 = r1
            goto L4d
        L4c:
            r3 = r5
        L4d:
            if (r3 == 0) goto L50
            goto L6a
        L50:
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L64
        L52:
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            java.lang.Object r8 = r8.getSystemService(r3)     // Catch: java.lang.Throwable -> L64
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8     // Catch: java.lang.Throwable -> L64
            int r8 = r8.noteProxyOpNoThrow(r9, r2)     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L62
            r6 = -2
            goto L6a
        L62:
            r6 = r1
            goto L6a
        L64:
            r8 = move-exception
            java.lang.String r9 = "validatePermission "
            e0.i.q(r8, r9, r0)
        L6a:
            if (r6 != 0) goto L6d
            r1 = r5
        L6d:
            return r1
        L6e:
            java.lang.String r8 = "hasPermission Invalid Input Param"
            com.huawei.hms.ads.ex.V(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.l.a(android.content.Context, java.lang.String):boolean");
    }
}
