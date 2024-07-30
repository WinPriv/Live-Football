package ka;

/* loaded from: classes2.dex */
public final class h0 extends y {
    public h0() {
        super(com.huawei.openalliance.ad.constant.s.f22122r);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.huawei.android.hms.ppskit.a r13) {
        /*
            r8 = this;
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r13 = 0
            r11[r13] = r10
            r13 = 1
            r11[r13] = r12
            java.lang.String r13 = "CmdDelContentById"
            java.lang.String r0 = "CmdDelContentById, callerPkgName: %s, contentId: %s"
            ka.n7.f(r13, r0, r11)
            boolean r11 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r12)
            if (r11 != 0) goto L83
            r11 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "content_id"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "templateId"
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "slotid"
            java.lang.String r11 = r0.optString(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "apiVer"
            int r12 = r0.optInt(r3)     // Catch: java.lang.Throwable -> L38
            r6 = r11
            r4 = r1
            r5 = r2
            goto L46
        L38:
            r0 = r11
            r11 = r2
            goto L3c
        L3b:
            r0 = r11
        L3c:
            java.lang.String r1 = "not json"
            ka.n7.e(r13, r1)
            r1 = -1
            r5 = r11
            r4 = r12
            r6 = r0
            r12 = r1
        L46:
            r11 = 3
            if (r11 != r12) goto L54
            com.huawei.openalliance.ad.ppskit.handlers.f0 r2 = com.huawei.openalliance.ad.ppskit.handlers.f0.E(r9)
            java.lang.String r7 = "delete content from sdk"
            r3 = r10
            r2.F(r3, r4, r5, r6, r7)
            goto L83
        L54:
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r10 = j7.r.l(r9, r10, r4, r6)
            if (r10 != 0) goto L60
            java.lang.String r9 = "fail to delete content, content is null"
            ka.n7.i(r13, r9)
            goto L83
        L60:
            java.lang.String r11 = r10.m3()
            boolean r12 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r11)
            if (r12 != 0) goto L6d
            com.huawei.openalliance.ad.ppskit.utils.x.e(r9, r11)
        L6d:
            com.huawei.openalliance.ad.ppskit.handlers.e0 r11 = new com.huawei.openalliance.ad.ppskit.handlers.e0
            r11.<init>(r9)
            java.lang.String r9 = r10.h1()
            java.lang.String r12 = r10.h()
            java.lang.String r10 = r10.p2()
            java.lang.String r13 = "delete content from sdk"
            r11.y(r9, r12, r10, r13)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.h0.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }
}
