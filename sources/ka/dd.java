package ka;

/* loaded from: classes2.dex */
public final class dd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31094s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ mg f31095t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31096u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f31097v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f31098w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ad f31099x;

    public dd(ad adVar, String str, jf jfVar, int i10, long j10, String str2) {
        this.f31099x = adVar;
        this.f31094s = str;
        this.f31095t = jfVar;
        this.f31096u = i10;
        this.f31097v = j10;
        this.f31098w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = r1.f31094s
            byte[] r2 = ka.r4.f31738c
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord> r3 = ka.r4.f31740e     // Catch: java.lang.Throwable -> La7
            boolean r4 = r3.containsKey(r0)     // Catch: java.lang.Throwable -> La7
            r5 = 0
            if (r4 == 0) goto L19
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> La7
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r3 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r3     // Catch: java.lang.Throwable -> La7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            r7 = r3
            goto L1b
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            r7 = r5
        L1b:
            if (r7 == 0) goto La6
            r7.t3(r0)
            int r8 = r1.f31096u
            long r9 = r1.f31097v
            ka.ad r2 = r1.f31099x
            android.content.Context r2 = r2.f30934a
            byte[] r11 = com.huawei.openalliance.ad.ppskit.utils.u1.h(r2)
            r12 = 0
            ka.mg r2 = r1.f31095t
            r13 = r2
            ka.jf r13 = (ka.jf) r13
            r13.getClass()
            int r2 = r7.a1()
            r3 = -1
            if (r2 == r3) goto L50
            r2 = 2
            int r3 = r7.a1()
            if (r2 != r3) goto L44
            goto L50
        L44:
            r2 = 3
            int r3 = r7.a1()
            if (r2 != r3) goto L4e
            ka.lf r2 = r13.f31340h
            goto L52
        L4e:
            r6 = r5
            goto L53
        L50:
            ka.ce r2 = r13.f31339g
        L52:
            r6 = r2
        L53:
            r2 = 0
            r3 = 1
            if (r6 != 0) goto L59
            r15 = r5
            goto L71
        L59:
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r4 = r6.a(r7, r8, r9, r11, r12)
            if (r4 != 0) goto L61
            r6 = r5
            goto L65
        L61:
            java.lang.String r6 = r4.h()
        L65:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r6
            java.lang.String r6 = "ResponseProcessor"
            java.lang.String r8 = "downloadOneContent, showContentId:%s"
            ka.n7.f(r6, r8, r7)
            r15 = r4
        L71:
            if (r15 == 0) goto La3
            java.lang.String r14 = r1.f31094s
            int r4 = r1.f31096u
            java.util.HashMap r5 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a
            long r17 = java.lang.System.currentTimeMillis()
            r16 = r4
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r4 = r13.b(r14, r15, r16, r17)
            int r5 = ka.ad.f30933i
            java.lang.Object[] r5 = new java.lang.Object[r3]
            if (r4 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r2
        L8b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5[r2] = r3
            java.lang.String r2 = "ad"
            java.lang.String r3 = "normal ad downloaded: %s"
            ka.n7.c(r2, r3, r5)
            if (r4 == 0) goto L9f
            java.lang.String r2 = r1.f31098w
            r4.D(r2)
        L9f:
            ka.r4.a(r0, r4)
            goto La6
        La3:
            ka.r4.a(r0, r5)
        La6:
            return
        La7:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.dd.run():void");
    }
}
