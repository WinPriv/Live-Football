package ka;

/* loaded from: classes2.dex */
public final class h3 extends y {
    public h3() {
        super("installDialogException");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if ("35".equals(r10) != false) goto L15;
     */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.huawei.android.hms.ppskit.a r11) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r10)
            java.lang.String r10 = "exception_id"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r1 = "content"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "package_name"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = "sdk_version"
            java.lang.String r0 = r0.optString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L24
            r8 = r2
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2b
            r9 = r0
        L2b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L8b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L38
            goto L8b
        L38:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r8
            java.lang.String r4 = "InstallDialogExceptionCmd"
            java.lang.String r5 = " callerPkgName=%s"
            ka.n7.c(r4, r5, r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r9
            java.lang.String r5 = " callerSdkVersion=%s"
            ka.n7.c(r4, r5, r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r10
            java.lang.String r2 = " eventId=%s"
            ka.n7.c(r4, r2, r0)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            r2 = 0
            java.lang.Class<com.huawei.openalliance.ad.ppskit.beans.metadata.LocalChannelInfo> r3 = com.huawei.openalliance.ad.ppskit.beans.metadata.LocalChannelInfo.class
            java.lang.Object r0 = com.huawei.openalliance.ad.ppskit.utils.y0.b(r2, r1, r3, r0)
            com.huawei.openalliance.ad.ppskit.beans.metadata.LocalChannelInfo r0 = (com.huawei.openalliance.ad.ppskit.beans.metadata.LocalChannelInfo) r0
            ka.p r1 = new ka.p
            r1.<init>(r7)
            r1.f31723b = r9
            java.lang.String r7 = "20"
            boolean r9 = r7.equals(r10)
            if (r9 == 0) goto L75
        L71:
            r1.o(r8, r7, r0)
            goto L87
        L75:
            java.lang.String r7 = "21"
            boolean r9 = r7.equals(r10)
            if (r9 == 0) goto L7e
            goto L71
        L7e:
            java.lang.String r7 = "35"
            boolean r9 = r7.equals(r10)
            if (r9 == 0) goto L87
            goto L71
        L87:
            r6.e(r11)
            return
        L8b:
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.String r8 = " param is invalid"
            java.lang.String r9 = "trafficReminderExceptionEvent"
            ka.y.d(r11, r9, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.h3.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }
}
