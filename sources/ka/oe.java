package ka;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class oe implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f31613s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31614t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pg f31615u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ke f31616v;

    public oe(ke keVar, ArrayList arrayList, String str, pg pgVar) {
        this.f31616v = keVar;
        this.f31613s = arrayList;
        this.f31614t = str;
        this.f31615u = pgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r0 = r5.f31384d.b(r4, ka.bf.d(r1, r5.f31386g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r0.responseCode != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (ka.ke.s(r5, r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r6.f31615u.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        r1 = false;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "exception"
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.util.List r2 = r6.f31613s     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L52
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r6.f31614t
            ka.ke r5 = r6.f31616v
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L52
            ka.o r3 = (ka.o) r3     // Catch: java.lang.Throwable -> L52
            com.huawei.openalliance.ad.ppskit.db.bean.EventRecord r3 = ka.ke.a(r5, r3)     // Catch: java.lang.Throwable -> L52
            boolean r5 = ka.ke.v(r3, r0)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L28
            return
        L28:
            r3.z1(r4)     // Catch: java.lang.Throwable -> L52
            r1.add(r3)     // Catch: java.lang.Throwable -> L52
            goto Ld
        L2f:
            android.content.Context r0 = r5.f31386g     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r0 = ka.bf.d(r1, r0)     // Catch: java.lang.Throwable -> L52
            com.huawei.openalliance.ad.ppskit.handlers.i0 r1 = r5.f31384d     // Catch: java.lang.Throwable -> L52
            com.huawei.openalliance.ad.ppskit.beans.server.EventReportRsp r0 = r1.b(r4, r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L43
            int r1 = r0.responseCode     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L43
            r1 = 1
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L5c
            boolean r0 = ka.ke.s(r5, r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L5c
            ka.pg r0 = r6.f31615u     // Catch: java.lang.Throwable -> L52
            r0.a()     // Catch: java.lang.Throwable -> L52
            return
        L52:
            java.lang.String r0 = "EventProcessor"
            java.lang.String r1 = "onRealTimeAnalysis exception"
            ka.n7.i(r0, r1)
            ka.n7.a()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.oe.run():void");
    }
}
