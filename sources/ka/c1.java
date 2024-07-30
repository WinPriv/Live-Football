package ka;

/* loaded from: classes2.dex */
public final class c1 extends y {
    public c1() {
        super("queryPkgInfo");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|4|5|(2:6|7)|(10:26|10|11|12|(1:14)(1:23)|15|(1:17)|18|19|20)|9|10|11|12|(0)(0)|15|(0)|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        ka.n7.g("ApkUtil", "getVersionName fail");
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[Catch: AndroidRuntimeException | Exception -> 0x003e, TRY_LEAVE, TryCatch #2 {AndroidRuntimeException | Exception -> 0x003e, blocks: (B:12:0x0034, B:23:0x003b), top: B:11:0x0034, outer: #0 }] */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            java.lang.String r7 = "ApkUtil"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r9)
            java.lang.String r9 = "pkgName"
            java.lang.String r8 = r8.getString(r9)
            boolean r9 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r8)
            r0 = 0
            if (r9 != 0) goto L5d
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r1 = "versionCode"
            java.lang.String r2 = "getAppVersionCode fail"
            r3 = 0
            android.content.pm.PackageInfo r4 = com.huawei.openalliance.ad.ppskit.utils.o2.f(r6, r8)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L26
        L24:
            r2 = r3
            goto L2d
        L26:
            int r2 = r4.versionCode     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            ka.n7.g(r7, r2)     // Catch: org.json.JSONException -> L51
            goto L24
        L2d:
            r9.put(r1, r2)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = "versionName"
            java.lang.String r2 = "getVersionName fail"
            android.content.pm.PackageInfo r4 = com.huawei.openalliance.ad.ppskit.utils.o2.f(r6, r8)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L3b
            goto L41
        L3b:
            java.lang.String r0 = r4.versionName     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            ka.n7.g(r7, r2)     // Catch: org.json.JSONException -> L51
        L41:
            r9.put(r1, r0)     // Catch: org.json.JSONException -> L51
            java.lang.String r7 = "pkgType"
            boolean r6 = a0.a.t0(r6, r8)     // Catch: org.json.JSONException -> L51
            if (r6 == 0) goto L4d
            r3 = 1
        L4d:
            r9.put(r7, r3)     // Catch: org.json.JSONException -> L51
            goto L58
        L51:
            java.lang.String r6 = "CmdQueryPkgInfo"
            java.lang.String r7 = "json exception"
            ka.n7.i(r6, r7)
        L58:
            java.lang.String r6 = r9.toString()
            return r6
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.c1.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
