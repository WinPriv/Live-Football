package ka;

import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;

/* loaded from: classes2.dex */
public final class xc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdContentRsp f32186s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ad f32187t;

    public xc(ad adVar, AdContentRsp adContentRsp) {
        this.f32187t = adVar;
        this.f32186s = adContentRsp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r5.intValue() == 1) goto L36;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            ka.ad r0 = r8.f32187t
            android.content.Context r0 = r0.f30934a
            com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r1 = r8.f32186s
            if (r1 != 0) goto La
            goto Lc0
        La:
            java.util.List r1 = r1.q()
            boolean r2 = androidx.transition.n.M(r1)
            if (r2 != 0) goto Lc0
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            com.huawei.openalliance.ad.ppskit.beans.metadata.Ad30 r2 = (com.huawei.openalliance.ad.ppskit.beans.metadata.Ad30) r2
            if (r2 != 0) goto L27
            goto L18
        L27:
            java.lang.String r3 = r2.a()
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r3)
            if (r4 == 0) goto L34
            java.lang.String r2 = "empty slot id"
            goto L40
        L34:
            java.lang.String r2 = r2.r()
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r2)
            if (r4 == 0) goto L46
            java.lang.String r2 = "empty config map"
        L40:
            java.lang.String r3 = "RecommendEngineUtil"
            ka.n7.b(r3, r2)
            goto L18
        L46:
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]
            r6 = 0
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Object r2 = com.huawei.openalliance.ad.ppskit.utils.y0.o(r6, r2, r7, r5)
            java.util.Map r2 = (java.util.Map) r2
            boolean r5 = a0.a.e0(r2)
            if (r5 == 0) goto L59
            goto L18
        L59:
            byte[] r5 = com.huawei.openalliance.ad.ppskit.handlers.g.f22537b
            monitor-enter(r5)
            com.huawei.openalliance.ad.ppskit.handlers.g r6 = com.huawei.openalliance.ad.ppskit.handlers.g.f22538c     // Catch: java.lang.Throwable -> Lbd
            if (r6 != 0) goto L67
            com.huawei.openalliance.ad.ppskit.handlers.g r6 = new com.huawei.openalliance.ad.ppskit.handlers.g     // Catch: java.lang.Throwable -> Lbd
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            com.huawei.openalliance.ad.ppskit.handlers.g.f22538c = r6     // Catch: java.lang.Throwable -> Lbd
        L67:
            com.huawei.openalliance.ad.ppskit.handlers.g r6 = com.huawei.openalliance.ad.ppskit.handlers.g.f22538c     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lbd
            r6.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "hiad_slot_cfg_"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.content.Context r5 = r6.f22539a
            android.content.SharedPreferences r3 = r5.getSharedPreferences(r3, r4)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "deAdRecmdEbl"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Integer r5 = com.huawei.openalliance.ad.ppskit.utils.y1.q(r5)
            java.lang.String r6 = "fsdkDeRcmdWay"
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = com.huawei.openalliance.ad.ppskit.utils.y1.q(r2)
            if (r5 == 0) goto La7
            int r5 = r5.intValue()
            r6 = 1
            if (r5 != r6) goto La7
            goto La8
        La7:
            r6 = r4
        La8:
            java.lang.String r5 = "recommendEnabled"
            r3.putBoolean(r5, r6)
            if (r2 == 0) goto Lb3
            int r4 = r2.intValue()
        Lb3:
            java.lang.String r2 = "recommendPath"
            r3.putInt(r2, r4)
            r3.apply()
            goto L18
        Lbd:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lbd
            throw r0
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.xc.run():void");
    }
}
