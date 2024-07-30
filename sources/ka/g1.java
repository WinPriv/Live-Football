package ka;

/* loaded from: classes2.dex */
public final class g1 extends y {
    public g1() {
        super("queryAppPermissions");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.huawei.android.hms.ppskit.a r13) {
        /*
            r8 = this;
            java.lang.String r10 = "CmdReqAppPermissions"
            ka.n7.b(r10, r10)
            r11 = 0
            java.lang.Class[] r11 = new java.lang.Class[r11]
            java.lang.Class<com.huawei.openalliance.ad.ppskit.inter.data.AppInfo> r0 = com.huawei.openalliance.ad.ppskit.inter.data.AppInfo.class
            r1 = 0
            java.lang.Object r11 = com.huawei.openalliance.ad.ppskit.utils.y0.o(r1, r12, r0, r11)
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r11 = (com.huawei.openalliance.ad.ppskit.inter.data.AppInfo) r11
            if (r11 == 0) goto L1d
            java.lang.String r12 = r11.getPackageName()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L22
        L1d:
            java.lang.String r12 = "empty request parameters"
            ka.n7.g(r10, r12)
        L22:
            java.lang.String r5 = r11.getPackageName()
            java.lang.String r6 = r11.g0()
            java.lang.String r7 = r11.h0()
            java.lang.String r10 = r11.e0()
            java.lang.String r12 = r11.f0()
            int r3 = r11.u()
            int r4 = com.huawei.openalliance.ad.ppskit.utils.m.a(r9)
            com.huawei.openalliance.ad.ppskit.handlers.i0 r9 = com.huawei.openalliance.ad.ppskit.handlers.i0.d(r9)
            r9.getClass()
            com.huawei.openalliance.ad.ppskit.beans.server.PermissionReq r11 = new com.huawei.openalliance.ad.ppskit.beans.server.PermissionReq     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            ka.t9 r0 = r9.i(r10)     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            r9.g(r11, r10, r12)     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            j7.r.r(r10)     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            com.huawei.openalliance.ad.ppskit.net.http.Response r9 = r0.b()     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            if (r9 == 0) goto L6c
            java.lang.Object r9 = r9.k()     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            com.huawei.openalliance.ad.ppskit.beans.server.PermissionRsp r9 = (com.huawei.openalliance.ad.ppskit.beans.server.PermissionRsp) r9     // Catch: java.lang.Exception -> L62 java.lang.IllegalArgumentException -> L65
            goto L6d
        L62:
            java.lang.String r9 = "requestPermission Exception"
            goto L67
        L65:
            java.lang.String r9 = "requestPermission IllegalArgumentException"
        L67:
            java.lang.String r10 = "i0"
            ka.n7.g(r10, r9)
        L6c:
            r9 = r1
        L6d:
            java.lang.String r10 = r8.f32203a
            if (r9 == 0) goto L85
            int r11 = r9.k()
            r12 = 200(0xc8, float:2.8E-43)
            if (r12 != r11) goto L85
            java.util.List r9 = r9.p()
            java.lang.String r9 = com.huawei.openalliance.ad.ppskit.utils.y0.c(r1, r9)
            ka.y.d(r13, r10, r12, r9)
            goto L8b
        L85:
            r9 = -1
            java.lang.String r11 = ""
            ka.y.d(r13, r10, r9, r11)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.g1.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }
}
