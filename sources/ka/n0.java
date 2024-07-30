package ka;

/* loaded from: classes2.dex */
public final class n0 extends y {
    public n0() {
        super("consentlookup");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|(14:12|(1:14)|15|(1:45)(1:19)|20|21|22|(1:24)|25|(3:27|(3:29|(1:31)(1:34)|32)|(2:40|41)(2:38|39))|42|(1:36)|40|41)|46|15|(1:17)|45|20|21|22|(0)|25|(0)|42|(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        e0.i.p(r10, "requestConsentConfig:", "KitNetHandler");
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:22:0x00a8, B:24:0x00b2, B:25:0x00ba, B:27:0x00ca, B:29:0x00d2, B:32:0x00da), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:22:0x00a8, B:24:0x00b2, B:25:0x00ba, B:27:0x00ca, B:29:0x00d2, B:32:0x00da), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.huawei.android.hms.ppskit.a r14) {
        /*
            r9 = this;
            java.lang.String r12 = "CmdLookupConsentConfig"
            java.lang.String r0 = "begin to lookup consent config"
            ka.n7.b(r12, r0)
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r13)
            java.lang.String r1 = ""
            r2 = -1
            java.lang.String r3 = r9.f32203a
            if (r0 == 0) goto L15
            java.lang.String r10 = "consent req is empty, please check it!"
            goto L29
        L15:
            r0 = 0
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class<com.huawei.openalliance.ad.ppskit.beans.server.ConsentConfigReq> r5 = com.huawei.openalliance.ad.ppskit.beans.server.ConsentConfigReq.class
            r6 = 0
            java.lang.Object r4 = com.huawei.openalliance.ad.ppskit.utils.y0.o(r6, r13, r5, r4)
            com.huawei.openalliance.ad.ppskit.beans.server.ConsentConfigReq r4 = (com.huawei.openalliance.ad.ppskit.beans.server.ConsentConfigReq) r4
            if (r4 != 0) goto L30
            java.lang.String r10 = "req is null: "
            java.lang.String r10 = s.f.b(r10, r13)
        L29:
            ka.n7.i(r12, r10)
            ka.y.d(r14, r3, r2, r1)
            return
        L30:
            com.huawei.openalliance.ad.ppskit.handlers.l r13 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r10)
            java.lang.String r13 = r13.l(r11)
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            r7 = 1
            if (r5 == 0) goto L62
            java.lang.String r13 = r4.k()
            boolean r13 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r13)
            if (r13 == 0) goto L65
            com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean r13 = new com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean
            r13.<init>(r10)
            java.lang.String r13 = r13.a()
            com.huawei.openalliance.ad.ppskit.utils.q1 r5 = com.huawei.openalliance.ad.ppskit.utils.q1.m(r10)
            r5.R(r13)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r0] = r13
            java.lang.String r8 = "look up consent, countryCode is: %s"
            ka.n7.c(r12, r8, r5)
        L62:
            r4.g(r13)
        L65:
            java.lang.String r13 = com.huawei.openalliance.ad.ppskit.utils.i2.c()
            r4.i(r13)
            java.lang.String r13 = com.huawei.openalliance.ad.ppskit.utils.o2.j(r10, r11)
            java.lang.String r5 = r4.j()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L8f
            boolean r13 = oa.j.b(r11, r13)
            if (r13 != 0) goto L81
            goto L8f
        L81:
            java.lang.String r11 = r4.j()
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r0] = r11
            java.lang.String r5 = "fast app set app package name: %s"
            ka.n7.c(r12, r5, r13)
            goto L9b
        L8f:
            r4.f(r11)
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r0] = r11
            java.lang.String r5 = "app set app package name: %s"
            ka.n7.c(r12, r5, r13)
        L9b:
            com.huawei.openalliance.ad.ppskit.handlers.h0 r10 = com.huawei.openalliance.ad.ppskit.handlers.h0.a(r10)
            r10.getClass()
            java.lang.String r12 = "KitNetHandler"
            java.lang.String r13 = "3.4.65.300"
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.String r8 = r4.h()     // Catch: java.lang.Throwable -> Ldd
            boolean r8 = r13.equals(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r8 != 0) goto Lba
            java.lang.String r8 = "consent sdk version not match, reset version."
            ka.n7.e(r12, r8)     // Catch: java.lang.Throwable -> Ldd
            r4.e(r13)     // Catch: java.lang.Throwable -> Ldd
        Lba:
            ka.u9 r13 = r10.c(r11)     // Catch: java.lang.Throwable -> Ldd
            r10.b(r4)     // Catch: java.lang.Throwable -> Ldd
            j7.r.r(r11)     // Catch: java.lang.Throwable -> Ldd
            com.huawei.openalliance.ad.ppskit.net.http.Response r10 = r13.c()     // Catch: java.lang.Throwable -> Ldd
            if (r10 == 0) goto Le3
            java.lang.Object r11 = r10.k()     // Catch: java.lang.Throwable -> Ldd
            com.huawei.openalliance.ad.ppskit.beans.server.ConsentConfigRsp r11 = (com.huawei.openalliance.ad.ppskit.beans.server.ConsentConfigRsp) r11     // Catch: java.lang.Throwable -> Ldd
            if (r11 == 0) goto Le4
            int r10 = r10.a()     // Catch: java.lang.Throwable -> Ldd
            if (r10 != r5) goto Ld9
            goto Lda
        Ld9:
            r0 = r7
        Lda:
            r11.responseCode = r0     // Catch: java.lang.Throwable -> Ldd
            goto Le4
        Ldd:
            r10 = move-exception
            java.lang.String r11 = "requestConsentConfig:"
            e0.i.p(r10, r11, r12)
        Le3:
            r11 = r6
        Le4:
            if (r11 == 0) goto Lf2
            int r10 = r11.responseCode
            if (r10 != 0) goto Lf2
            java.lang.String r10 = com.huawei.openalliance.ad.ppskit.utils.y0.c(r6, r11)
            ka.y.d(r14, r3, r5, r10)
            goto Lf5
        Lf2:
            ka.y.d(r14, r3, r2, r1)
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.n0.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }
}
