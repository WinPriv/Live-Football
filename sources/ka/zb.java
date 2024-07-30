package ka;

/* loaded from: classes2.dex */
public final class zb implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ac f32246s;

    public zb(ac acVar) {
        this.f32246s = acVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r15 = this;
            com.huawei.openalliance.ad.ppskit.handlers.p r0 = new com.huawei.openalliance.ad.ppskit.handlers.p
            ka.ac r7 = r15.f32246s
            android.content.Context r8 = r7.f30932a
            r0.<init>(r8)
            java.lang.Class<com.huawei.openalliance.ad.ppskit.db.bean.MgtCertRecord> r1 = com.huawei.openalliance.ad.ppskit.db.bean.MgtCertRecord.class
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r3 = 0
            java.util.ArrayList r0 = r0.h(r1, r2, r3, r4, r5, r6)
            boolean r1 = androidx.transition.n.M(r0)
            r2 = 1
            if (r1 == 0) goto L1c
            goto L83
        L1c:
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            com.huawei.openalliance.ad.ppskit.db.bean.MgtCertRecord r1 = (com.huawei.openalliance.ad.ppskit.db.bean.MgtCertRecord) r1
            if (r1 == 0) goto L20
            java.lang.String r4 = r1.a()
            if (r4 == 0) goto L20
            java.lang.String r4 = r1.a()
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.o2.j(r8, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L20
            java.util.List r5 = r1.A()
            if (r5 == 0) goto L20
            java.util.List r5 = r1.A()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = r4.toUpperCase(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L6c
            java.util.List r5 = r1.A()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toLowerCase(r6)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L20
        L6c:
            boolean r0 = ka.n7.d()
            if (r0 == 0) goto L81
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = r1.a()
            r0[r3] = r1
            java.lang.String r1 = "TvInstallChecker"
            java.lang.String r4 = "package: %s installed"
            ka.n7.f(r1, r4, r0)
        L81:
            r0 = r2
            goto L84
        L83:
            r0 = r3
        L84:
            if (r0 == 0) goto Lfa
            com.huawei.openalliance.ad.ppskit.handlers.e0 r0 = new com.huawei.openalliance.ad.ppskit.handlers.e0
            android.content.Context r1 = r7.f30932a
            r0.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1[r3] = r5
            java.lang.String r5 = "already installed mgtApk"
            r1[r2] = r5
            java.lang.String r6 = "e0"
            java.lang.String r7 = "deleteContentByAdType adType: %s reason: %s"
            ka.n7.f(r6, r7, r1)
            java.lang.Class<com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord> r9 = com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord.class
            java.lang.String r1 = "slotId"
            java.lang.String r6 = "splashMediaPath"
            java.lang.String r7 = "appPkgName"
            java.lang.String r8 = "contentId"
            java.lang.String[] r10 = new java.lang.String[]{r7, r8, r1, r6}
            r11 = 11
            java.lang.String[] r12 = new java.lang.String[r2]
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r12[r3] = r1
            r13 = 0
            r14 = 0
            r8 = r0
            java.util.ArrayList r1 = r8.h(r9, r10, r11, r12, r13, r14)
            boolean r2 = androidx.transition.n.M(r1)
            if (r2 == 0) goto Lc9
            goto Lfa
        Lc9:
            java.util.Iterator r1 = r1.iterator()
        Lcd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lfa
            java.lang.Object r2 = r1.next()
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r2 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r2
            if (r2 == 0) goto Lcd
            java.lang.String r3 = r2.m3()
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r3)
            if (r4 != 0) goto Lea
            android.content.Context r4 = r0.f22513b
            com.huawei.openalliance.ad.ppskit.utils.x.e(r4, r3)
        Lea:
            java.lang.String r3 = r2.h1()
            java.lang.String r4 = r2.h()
            java.lang.String r2 = r2.p2()
            r0.y(r3, r4, r2, r5)
            goto Lcd
        Lfa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.zb.run():void");
    }
}
