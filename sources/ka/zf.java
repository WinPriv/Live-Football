package ka;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResultV2;
import com.huawei.openalliance.ad.ppskit.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public abstract class zf implements cg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32255a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.s f32256b;

    /* renamed from: c, reason: collision with root package name */
    public final gi f32257c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f32258d;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ EventRecord f32259s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ContentRecord f32260t;

        public a(EventRecord eventRecord, ContentRecord contentRecord) {
            this.f32259s = eventRecord;
            this.f32260t = contentRecord;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            zf zfVar = zf.this;
            EventRecord eventRecord = this.f32259s;
            ContentRecord contentRecord = this.f32260t;
            zfVar.j(eventRecord, contentRecord);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - zfVar.n() > 900000) {
                zfVar.b(currentTimeMillis);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zfVar.i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new xf(zfVar, true, contentRecord.h1())));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ EventRecord f32262s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ContentRecord f32263t;

        public b(EventRecord eventRecord, ContentRecord contentRecord) {
            this.f32262s = eventRecord;
            this.f32263t = contentRecord;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zf zfVar = zf.this;
            EventRecord eventRecord = this.f32262s;
            ContentRecord contentRecord = this.f32263t;
            zfVar.j(eventRecord, contentRecord);
            zfVar.b(System.currentTimeMillis());
            zfVar.i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new xf(zfVar, true, contentRecord.h1())));
        }
    }

    public zf(Context context, gi giVar) {
        this.f32255a = context.getApplicationContext();
        this.f32256b = new com.huawei.openalliance.ad.ppskit.handlers.s(context);
        this.f32257c = giVar;
        this.f32258d = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(zf zfVar, String str) {
        v4 v4Var;
        Cursor cursor;
        Cursor query;
        boolean z10;
        String str2;
        Class<? extends EventRecord> a10 = zfVar.a();
        com.huawei.openalliance.ad.ppskit.handlers.s sVar = zfVar.f32256b;
        sVar.getClass();
        String valueOf = String.valueOf(50);
        HashMap hashMap = new HashMap();
        Cursor cursor2 = null;
        try {
            v4Var = v4.Q(sVar.f22513b);
            try {
                String simpleName = a10.getSimpleName();
                synchronized (v4Var) {
                    try {
                        query = v4Var.getReadableDatabase().query(simpleName, null, null, null, null, null, "_id desc", valueOf);
                    } finally {
                        Cursor cursor3 = null;
                        try {
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor3;
                            sVar.f(cursor);
                            com.huawei.openalliance.ad.ppskit.handlers.c0.g(v4Var);
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            try {
                                EventRecord newInstance = a10.newInstance();
                                newInstance.m(query);
                                hashMap.put(newInstance.h(), newInstance);
                            } catch (Throwable th2) {
                                n7.i("EventDao", "query:" + th2.getClass().getSimpleName());
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                            sVar.f(cursor);
                            com.huawei.openalliance.ad.ppskit.handlers.c0.g(v4Var);
                            throw th;
                        }
                    }
                }
                sVar.f(query);
                com.huawei.openalliance.ad.ppskit.handlers.c0.g(v4Var);
                String valueOf2 = String.valueOf(System.currentTimeMillis());
                EventReportRsp b10 = zfVar.f32258d.b(str, bf.d(hashMap.values(), zfVar.f32255a));
                if (b10 != null) {
                    int i10 = b10.responseCode;
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String str3 = b10.errorReason;
                        if (str3 == null) {
                            str3 = String.valueOf(i10);
                        }
                        zfVar.e(valueOf2, str3, hashMap.values());
                        return;
                    }
                    try {
                        List<AdEventResult> k10 = b10.k();
                        List<AdEventResultV2> r10 = b10.r();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (b10.p() != null && b10.p().intValue() == 0) {
                            arrayList.addAll(hashMap.keySet());
                            str2 = 0;
                        } else {
                            if (androidx.transition.n.M(k10) && androidx.transition.n.M(r10)) {
                                zfVar.e(valueOf2, "no result", hashMap.values());
                                return;
                            }
                            if (!androidx.transition.n.M(r10)) {
                                for (AdEventResultV2 adEventResultV2 : r10) {
                                    if (adEventResultV2 != null) {
                                        zfVar.f(hashMap, valueOf2, arrayList, arrayList2, adEventResultV2.a(), adEventResultV2.b());
                                        cursor2 = cursor2;
                                        hashMap = hashMap;
                                    }
                                }
                                str2 = cursor2;
                                ArrayList arrayList3 = new ArrayList(hashMap.keySet());
                                if (!androidx.transition.n.M(arrayList3)) {
                                    if (androidx.transition.n.M(r10)) {
                                        arrayList.addAll(arrayList3);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(arrayList3);
                                        for (AdEventResultV2 adEventResultV22 : r10) {
                                            if (adEventResultV22 != null) {
                                                arrayList4.remove(adEventResultV22.a());
                                            }
                                        }
                                        arrayList.addAll(arrayList4);
                                    }
                                }
                            } else {
                                str2 = 0;
                                for (AdEventResult adEventResult : k10) {
                                    if (adEventResult != null) {
                                        zfVar.f(hashMap, valueOf2, arrayList, arrayList2, adEventResult.a(), adEventResult.b());
                                    }
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            sVar.i(zfVar.a(), 2, arrayList);
                        }
                        zfVar.e(valueOf2, str2, arrayList2);
                    } catch (Throwable th4) {
                        n7.h("BaseEventReporter", "dealEventRsp err, %s", th4.getClass().getSimpleName());
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            v4Var = null;
            cursor = null;
        }
    }

    public abstract Class<? extends EventRecord> a();

    public abstract void b(long j10);

    public final void c(EventRecord eventRecord, boolean z10) {
        boolean z11;
        o c10;
        int i10;
        if (eventRecord != null) {
            String i11 = eventRecord.i();
            if (!"imp".equals(i11) && !"click".equals(i11)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                p pVar = new p(this.f32255a);
                String K = eventRecord.K();
                String i12 = eventRecord.i();
                int l12 = eventRecord.l1();
                String h02 = eventRecord.h0();
                String i13 = eventRecord.i1();
                String g02 = eventRecord.g0();
                Context context = pVar.f31722a;
                try {
                    if (ConfigSpHandler.b(context).m() && (c10 = pVar.c(K, true)) != null) {
                        c10.f31525a = "101";
                        c10.b(l12);
                        c10.f31561q = g02;
                        c10.D = i12;
                        c10.f31567t = h02;
                        c10.U = i13;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        c10.K = i10;
                        if (n7.d()) {
                            n7.c("AnalysisReport", "rptEvent, eventType: %s, result: %s", i12, Integer.valueOf(c10.K));
                        }
                        new ke(context, zh.a(l12, context), null).t(K, c10, false, true);
                    }
                } catch (Throwable th) {
                    e0.i.p(th, "onUploadAdEvent:", "AnalysisReport");
                }
            }
        }
    }

    public final void d(String str, EventRecord eventRecord, boolean z10, ContentRecord contentRecord) {
        if (eventRecord != null) {
            if ((z10 && h(contentRecord, str)) || m(str)) {
                return;
            }
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(eventRecord, contentRecord), 0);
        }
    }

    public final void e(String str, String str2, Collection<EventRecord> collection) {
        String str3;
        if (androidx.transition.n.M(collection)) {
            return;
        }
        for (EventRecord eventRecord : collection) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(eventRecord.h());
            Class<? extends EventRecord> a10 = a();
            if (str2 == null) {
                str3 = eventRecord.G1();
            } else {
                str3 = str2;
            }
            long I1 = eventRecord.I1() + 1;
            com.huawei.openalliance.ad.ppskit.handlers.s sVar = this.f32256b;
            sVar.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("lastReportTime", str);
            contentValues.put(EventRecord.LAST_FAIL_REASON, str3);
            contentValues.put(EventRecord.REPEATED_COUNT, Long.valueOf(I1));
            sVar.k(a10, contentValues, 1, arrayList);
            c(eventRecord, false);
        }
    }

    public final void f(HashMap hashMap, String str, ArrayList arrayList, ArrayList arrayList2, String str2, int i10) {
        boolean z10;
        EventRecord eventRecord = (EventRecord) hashMap.get(str2);
        if (200 != i10 && 601 != i10 && 611 != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (eventRecord != null) {
                eventRecord.U0(eventRecord.I1() + 1);
                eventRecord.d1(String.valueOf(i10));
                eventRecord.b1(str);
                arrayList2.add(eventRecord);
                return;
            }
            return;
        }
        arrayList.add(str2);
        c(eventRecord, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4f
            java.util.List r1 = r5.u0()     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
            if (r1 == 0) goto L4f
            int r2 = r1.size()     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
            if (r2 <= 0) goto L4f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
            if (r6 == 0) goto L13
            boolean r2 = r6.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L29 java.lang.RuntimeException -> L39
            if (r2 == 0) goto L13
            r0 = 1
            goto L4f
        L29:
            r1 = move-exception
            java.lang.String r2 = r4.l()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = "isDiscard, Exception:"
            goto L48
        L39:
            r1 = move-exception
            java.lang.String r2 = r4.l()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = "isDiscard, RuntimeException:"
        L48:
            java.lang.String r1 = r3.concat(r1)
            ka.n7.i(r2, r1)
        L4f:
            java.lang.String r1 = r4.l()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "isDiscard:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = ", eventType:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ", contentId:"
            r2.append(r6)
            if (r5 != 0) goto L6e
            r5 = 0
            goto L72
        L6e:
            java.lang.String r5 = r5.h()
        L72:
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            ka.n7.e(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.zf.h(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord, java.lang.String):boolean");
    }

    public abstract ThreadPoolExecutor i();

    public final void j(EventRecord eventRecord, ContentRecord contentRecord) {
        String h10;
        boolean z10;
        boolean z11;
        int i10;
        if (eventRecord == null) {
            n7.i(l(), "fail to add event to cache");
            return;
        }
        String l10 = l();
        StringBuilder sb2 = new StringBuilder("addEventToCache, event:");
        sb2.append(eventRecord.i());
        sb2.append(" showId:");
        sb2.append(eventRecord.i1());
        sb2.append(" reqId:");
        sb2.append(eventRecord.h0());
        sb2.append(", contentId:");
        if (contentRecord == null) {
            h10 = null;
        } else {
            h10 = contentRecord.h();
        }
        sb2.append(h10);
        n7.e(l10, sb2.toString());
        String K = eventRecord.K();
        Context context = this.f32255a;
        if (context == null) {
            ArrayList arrayList = zh.f32271a;
        } else {
            Iterator it = zh.f32271a.iterator();
            while (it.hasNext()) {
                zh.a(((Integer) it.next()).intValue(), context).d(K);
            }
        }
        Class<? extends EventRecord> a10 = a();
        com.huawei.openalliance.ad.ppskit.handlers.s sVar = this.f32256b;
        if (sVar.d(a10, eventRecord.l(sVar.f22513b)) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String i11 = eventRecord.i();
        if (!"imp".equals(i11) && !"click".equals(i11)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            p pVar = new p(context);
            String i12 = eventRecord.i();
            Context context2 = pVar.f31722a;
            try {
                if (ConfigSpHandler.b(context2).m()) {
                    if (contentRecord == null) {
                        n7.g("AnalysisReport", "onAdEventAddToCache, contentRecord is null.");
                        return;
                    }
                    o c10 = pVar.c(contentRecord.h1(), true);
                    if (c10 != null) {
                        c10.f31525a = "100";
                        int z02 = contentRecord.z0();
                        c10.b(z02);
                        c10.f31561q = contentRecord.h();
                        c10.f31567t = contentRecord.o1();
                        c10.D = i12;
                        c10.U = contentRecord.j2();
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        c10.K = i10;
                        if (n7.d()) {
                            n7.c("AnalysisReport", "cacheEvent, eventType: %s, result: %s", i12, Integer.valueOf(c10.K));
                        }
                        new ke(context2, zh.a(z02, context2), null).t(contentRecord.h1(), c10, false, true);
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "onAdEventAddToCache:", "AnalysisReport");
            }
        }
    }

    public final void k(String str, EventRecord eventRecord, boolean z10, ContentRecord contentRecord) {
        if (eventRecord != null) {
            if ((z10 && h(contentRecord, str)) || m(str)) {
                return;
            }
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new b(eventRecord, contentRecord), 0);
            i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new ag(this, eventRecord, contentRecord)));
        }
    }

    public abstract String l();

    public final boolean m(String str) {
        boolean z10;
        HashSet hashSet;
        String str2 = "";
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str)) {
            HashMap hashMap = oa.d.f33789a;
            if (!a0.a.e0(hashMap)) {
                str2 = (String) hashMap.get(str);
            }
            if (com.huawei.openalliance.ad.ppskit.utils.y1.h(str2)) {
                str2 = str.substring(str.indexOf("_") + 1);
            }
        }
        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(str2)) {
            return false;
        }
        try {
            ConfigSpHandler b10 = ConfigSpHandler.b(this.f32255a);
            synchronized (b10.f22478a) {
                hashSet = (HashSet) b10.s().getStringSet("eventTypeBlackList", new HashSet());
            }
            if (!androidx.transition.n.M(hashSet)) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (str2.equals((String) it.next())) {
                        z10 = true;
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            n7.i(l(), "isInBlackList, Exception:".concat(th.getClass().getSimpleName()));
        }
        z10 = false;
        n7.c(l(), "isInBlackList, result: %s, eventType: %s", Boolean.valueOf(z10), str);
        return z10;
    }

    public abstract long n();
}
