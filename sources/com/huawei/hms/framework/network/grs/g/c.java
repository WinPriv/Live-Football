package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f21864l = "c";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f21865a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21866b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f21867c;

    /* renamed from: d, reason: collision with root package name */
    private d f21868d;

    /* renamed from: i, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.g.j.c f21872i;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Future<d>> f21869e = new ConcurrentHashMap(16);
    private final List<d> f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final JSONArray f21870g = new JSONArray();

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f21871h = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private String f21873j = "";

    /* renamed from: k, reason: collision with root package name */
    private long f21874k = 1;

    public c(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f21872i = cVar;
        this.f21865a = cVar.b();
        this.f21866b = cVar.a();
        this.f21867c = aVar;
        b();
        c();
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.f21869e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                e = e10;
                str = f21864l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(f21864l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e11) {
                e = e11;
                str = f21864l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(f21864l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    private void c() {
        String grsParasKey = this.f21865a.getGrsParasKey(true, true, this.f21866b);
        this.f21873j = this.f21867c.a().a(grsParasKey + "ETag", "");
    }

    private String d() {
        com.huawei.hms.framework.network.grs.local.model.a aVar;
        com.huawei.hms.framework.network.grs.f.b a10 = com.huawei.hms.framework.network.grs.f.b.a(this.f21866b.getPackageName());
        if (a10 != null) {
            aVar = a10.a();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            String a11 = aVar.a();
            Logger.v(f21864l, "get appName from local assets is{%s}", a11);
            return a11;
        }
        return "";
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        if (this.f21871h.isEmpty()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a10 = a(executorService, this.f21871h, str, cVar);
        Logger.v(f21864l, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(a10 == null ? 0 : a10.b()));
        e.a(new ArrayList(this.f), SystemClock.elapsedRealtime() - elapsedRealtime, this.f21870g, this.f21866b);
        this.f.clear();
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[LOOP:0: B:2:0x0005->B:13:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r16, java.util.List<java.lang.String> r17, java.lang.String r18, com.huawei.hms.framework.network.grs.e.c r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = 0
            r10 = 0
            r11 = r0
            r12 = r10
        L5:
            int r0 = r17.size()
            if (r12 >= r0) goto L9b
            r13 = r17
            java.lang.Object r0 = r13.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8a
            com.huawei.hms.framework.network.grs.g.a r14 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r5 = r9.f21866b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.f21865a
            r1 = r14
            r2 = r0
            r3 = r12
            r4 = r15
            r6 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r1 = r14.g()
            r2 = r16
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r3 = r9.f21869e
            r3.put(r0, r1)
            r3 = 1
            long r4 = r9.f21874k     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            java.lang.Object r0 = r1.get(r4, r0)     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            r1 = r0
            com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.g.d) r1     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            if (r1 == 0) goto L66
            boolean r0 = r1.o()     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            if (r0 != 0) goto L53
            boolean r0 = r1.m()     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            if (r0 == 0) goto L66
        L53:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f21864l     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            java.lang.String r4 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r4)     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            r11 = r1
            goto L8d
        L5c:
            r11 = r1
            goto L68
        L5e:
            r0 = move-exception
            r11 = r1
            goto L71
        L61:
            r0 = move-exception
            r11 = r1
            goto L7a
        L64:
            r11 = r1
            goto L82
        L66:
            r11 = r1
            goto L8c
        L68:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f21864l
            java.lang.String r1 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L8c
        L70:
            r0 = move-exception
        L71:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.f21864l
            java.lang.String r4 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r1, r4, r0)
            goto L8d
        L79:
            r0 = move-exception
        L7a:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.f21864l
            java.lang.String r3 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r0)
            goto L8c
        L82:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f21864l
            java.lang.String r1 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            goto L8d
        L8a:
            r2 = r16
        L8c:
            r3 = r10
        L8d:
            if (r3 == 0) goto L97
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f21864l
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            goto L9b
        L97:
            int r12 = r12 + 1
            goto L5
        L9b:
            com.huawei.hms.framework.network.grs.g.d r0 = r15.b(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.c.a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    private void b() {
        com.huawei.hms.framework.network.grs.g.j.d a10 = com.huawei.hms.framework.network.grs.g.i.a.a(this.f21866b);
        if (a10 == null) {
            Logger.w(f21864l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a10);
        List<String> a11 = a10.a();
        if (a11 == null || a11.size() <= 0) {
            Logger.v(f21864l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (a11.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String b10 = a10.b();
        if (a11.size() > 0) {
            for (String str : a11) {
                if (str.startsWith("https://")) {
                    a(b10, str);
                } else {
                    Logger.w(f21864l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(f21864l, "request to GRS server url is {%s}", this.f21871h);
    }

    public String a() {
        return this.f21873j;
    }

    public synchronized void a(d dVar) {
        this.f.add(dVar);
        d dVar2 = this.f21868d;
        if (dVar2 != null && (dVar2.o() || this.f21868d.m())) {
            Logger.v(f21864l, "grsResponseResult is ok");
            return;
        }
        if (dVar.n()) {
            Logger.i(f21864l, "GRS server open 503 limiting strategy.");
            com.huawei.hms.framework.network.grs.h.d.a(this.f21865a.getGrsParasKey(true, true, this.f21866b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
            return;
        }
        if (dVar.m()) {
            Logger.i(f21864l, "GRS server open 304 Not Modified.");
        }
        if (!dVar.o() && !dVar.m()) {
            Logger.v(f21864l, "grsResponseResult has exception so need return");
            return;
        }
        this.f21868d = dVar;
        this.f21867c.a(this.f21865a, dVar, this.f21866b, this.f21872i);
        for (Map.Entry<String, Future<d>> entry : this.f21869e.entrySet()) {
            if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                Logger.i(f21864l, "future cancel");
                entry.getValue().cancel(true);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.d dVar) {
    }

    private void a(String str, String str2) {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str2, str);
        String grsReqParamJoint = this.f21865a.getGrsReqParamJoint(false, false, d(), this.f21866b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            l10.append("?");
            l10.append(grsReqParamJoint);
        }
        this.f21871h.add(l10.toString());
    }
}
