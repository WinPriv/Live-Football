package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import ka.r6;

/* loaded from: classes2.dex */
public final class j2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f22881s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f22882t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r6 f22883u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f22884v;

    public j2(Context context, q1 q1Var, com.huawei.openalliance.ad.ppskit.handlers.r rVar, long j10) {
        this.f22881s = context;
        this.f22882t = q1Var;
        this.f22883u = rVar;
        this.f22884v = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f22881s
            java.lang.String r1 = "AdInfoUtil"
            com.huawei.openalliance.ad.ppskit.utils.z1.Q(r0)     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            boolean r2 = com.huawei.openalliance.ad.ppskit.utils.d0.m(r0)     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            if (r2 == 0) goto L12
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.i2.b(r0)     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            goto L16
        L12:
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r0)     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
        L16:
            boolean r2 = ka.n7.d()     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            if (r2 == 0) goto L27
            java.lang.String r2 = "get ua:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            ka.n7.c(r1, r2, r3)     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
        L27:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            if (r2 == 0) goto L4b
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.i2.q()     // Catch: java.lang.Throwable -> L32 android.util.AndroidRuntimeException -> L42
            goto L4b
        L32:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "getUserAgent fail: "
            java.lang.String r0 = r2.concat(r0)
            goto L44
        L42:
            java.lang.String r0 = "getUserAgent fail"
        L44:
            ka.n7.g(r1, r0)
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.i2.q()
        L4b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L53
            java.lang.String r0 = "NOT_FOUND"
        L53:
            com.huawei.openalliance.ad.ppskit.utils.q1 r1 = r6.f22882t
            r1.getClass()
            byte[] r2 = com.huawei.openalliance.ad.ppskit.utils.q1.f22960g
            monitor-enter(r2)
            r1.B()     // Catch: java.lang.Throwable -> L8a
            com.huawei.openalliance.ad.ppskit.utils.q1$b r3 = r1.f22965a     // Catch: java.lang.Throwable -> L8a
            r3.useragent = r0     // Catch: java.lang.Throwable -> L8a
            r1.n(r3)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            ka.r6 r0 = r6.f22883u
            long r1 = r6.f22884v
            com.huawei.openalliance.ad.ppskit.handlers.r r0 = (com.huawei.openalliance.ad.ppskit.handlers.r) r0
            byte[] r3 = r0.f22619a
            monitor-enter(r3)
            java.lang.String r4 = "HiAdSharedPreferences_ua"
            android.content.Context r0 = r0.f22620b     // Catch: java.lang.Throwable -> L87
            r5 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "last_query_time"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r1)     // Catch: java.lang.Throwable -> L87
            r0.commit()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            return
        L87:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            throw r0
        L8a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.j2.run():void");
    }
}
