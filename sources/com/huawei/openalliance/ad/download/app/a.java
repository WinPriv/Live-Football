package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ch;
import com.huawei.hms.ads.dq;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import da.e;
import da.f;
import da.g;
import ha.i;
import j7.r;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends m3.b {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f22195x = new byte[0];
    public static a y;

    /* renamed from: v, reason: collision with root package name */
    public final Context f22196v;

    /* renamed from: w, reason: collision with root package name */
    public final f f22197w;

    /* renamed from: com.huawei.openalliance.ad.download.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0285a implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppDownloadTask f22198a;

        public C0285a(AppDownloadTask appDownloadTask) {
            this.f22198a = appDownloadTask;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() != -1) {
                ex.V("ApDnMgr", " pause task is success:" + this.f22198a.h());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppDownloadTask f22199a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f22200b;

        public b(AppDownloadTask appDownloadTask, c cVar) {
            this.f22199a = appDownloadTask;
            this.f22200b = cVar;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200 && String.valueOf(Boolean.TRUE).equals(callResult.getData())) {
                a aVar = a.this;
                AppDownloadTask appDownloadTask = this.f22199a;
                aVar.c(appDownloadTask);
                c cVar = this.f22200b;
                if (cVar != null) {
                    cVar.Code();
                }
                ex.V("ApDnMgr", " removeTask task is success:" + appDownloadTask.h());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void Code();
    }

    public a(Context context) {
        super(context);
        if (((d0.b) this.f32661u) == null) {
            this.f32661u = new d0.b(4);
        }
        this.f22196v = context.getApplicationContext();
        f fVar = new f(context);
        this.f22197w = fVar;
        this.f32660t = fVar;
    }

    public static a t() {
        a aVar;
        synchronized (f22195x) {
            aVar = y;
            if (aVar == null) {
                throw new dq("AppDownloadManager instance is not init!");
            }
        }
        return aVar;
    }

    public static boolean x(AppInfo appInfo) {
        if (appInfo != null && !TextUtils.isEmpty(appInfo.q())) {
            return false;
        }
        return true;
    }

    public final AppDownloadTask p(AppInfo appInfo) {
        RemoteAppDownloadTask remoteAppDownloadTask;
        if (x(appInfo)) {
            return null;
        }
        AppDownloadTask appDownloadTask = (AppDownloadTask) a(appInfo.q());
        if (appDownloadTask == null && (remoteAppDownloadTask = (RemoteAppDownloadTask) r.c(this.f22196v, appInfo)) != null) {
            ex.Code("ApDnMgr", " remote task is exist, create proxy task by appInfo");
            ex.V("ApDnMgr", " remote task is exist, create proxy task");
            AppDownloadTask a10 = remoteAppDownloadTask.a(appInfo);
            b(a10);
            return a10;
        }
        return appDownloadTask;
    }

    public final void q(AppInfo appInfo, ca.c cVar) {
        if (!x(appInfo)) {
            f fVar = this.f22197w;
            String q10 = appInfo.q();
            synchronized (fVar) {
                Set set = (Set) fVar.f27541t.get(q10);
                if (set == null) {
                    set = new HashSet();
                    fVar.f27541t.put(q10, set);
                }
                set.add(cVar);
            }
        }
        if (ch.Code(appInfo)) {
            e a10 = e.a((Context) this.f32659s);
            String A = appInfo.A();
            synchronized (a10) {
                WeakHashMap weakHashMap = (WeakHashMap) a10.f27536e.get(A);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    a10.f27536e.put(A, weakHashMap);
                }
                weakHashMap.put(cVar, null);
            }
        }
    }

    public final void r(AppInfo appInfo, c cVar) {
        if (x(appInfo)) {
            return;
        }
        AppDownloadTask p10 = p(appInfo);
        if (p10 == null) {
            ex.V("ApDnMgr", " removeTask failed:" + appInfo.q());
            return;
        }
        Context context = this.f22196v;
        b bVar = new b(p10, cVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", gb.b.p(p10));
            AppInfo j10 = r.j(p10);
            if (j10 != null) {
                jSONObject.put(ba.D, gb.b.p(j10));
            }
            a0.a.h(context, p10.N()).d("cancelDownloadApp", jSONObject.toString(), bVar, String.class);
        } catch (JSONException unused) {
            r.i(bVar, "cancelDownload JSONException", "cancelDownloadApp");
        }
    }

    public final void s(AppDownloadTask appDownloadTask) {
        boolean z10;
        if ("7".equals(appDownloadTask.L())) {
            AppInfo D = appDownloadTask.D();
            if (D != null && !TextUtils.isEmpty(D.j())) {
                AdContentData K = appDownloadTask.K();
                if (K != null) {
                    z10 = new fb.b((Context) this.f32659s, K).a();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            ex.V("ApDnMgr", "can not open Ag detail");
            y(appDownloadTask);
            return;
        }
        g gVar = new g(this, appDownloadTask);
        Context context = this.f22196v;
        JSONObject jSONObject = new JSONObject();
        try {
            r.h(appDownloadTask, jSONObject);
            i.e(context).d("startDownloadApp", jSONObject.toString(), gVar, String.class);
        } catch (JSONException unused) {
            r.i(gVar, "startDownload JSONException", "startDownloadApp");
        }
    }

    public final AppDownloadTask u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AppDownloadTask appDownloadTask = (AppDownloadTask) a(str);
        if (appDownloadTask == null) {
            AppInfo appInfo = new AppInfo();
            appInfo.x(str);
            appInfo.w("5");
            RemoteAppDownloadTask remoteAppDownloadTask = (RemoteAppDownloadTask) r.c(this.f22196v, appInfo);
            if (remoteAppDownloadTask != null) {
                ex.V("ApDnMgr", " remote task is exist, create proxy task");
                AppDownloadTask a10 = remoteAppDownloadTask.a(appInfo);
                b(a10);
                return a10;
            }
        }
        return appDownloadTask;
    }

    public final void v(AppDownloadTask appDownloadTask) {
        Context context = this.f22196v;
        C0285a c0285a = new C0285a(appDownloadTask);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", gb.b.p(appDownloadTask));
            AppInfo j10 = r.j(appDownloadTask);
            if (j10 != null) {
                jSONObject.put(ba.D, gb.b.p(j10));
            }
            a0.a.h(context, appDownloadTask.N()).d("pauseDownloadApp", jSONObject.toString(), c0285a, String.class);
        } catch (JSONException unused) {
            r.i(c0285a, "pauseDownload JSONException", "pauseDownloadApp");
        }
    }

    public final void w(AppInfo appInfo, ca.c cVar) {
        if (!x(appInfo)) {
            f fVar = this.f22197w;
            String q10 = appInfo.q();
            synchronized (fVar) {
                Set set = (Set) fVar.f27541t.get(q10);
                if (set != null && set.size() > 0) {
                    set.remove(cVar);
                    if (set.size() <= 0) {
                        fVar.f27541t.remove(q10);
                    }
                }
            }
        }
        if (ch.Code(appInfo)) {
            e a10 = e.a((Context) this.f32659s);
            String A = appInfo.A();
            synchronized (a10) {
                WeakHashMap weakHashMap = (WeakHashMap) a10.f27536e.get(A);
                if (weakHashMap != null && weakHashMap.size() > 0) {
                    weakHashMap.remove(cVar);
                    if (weakHashMap.size() <= 0) {
                        a10.f27536e.remove(A);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r2.intValue() >= 30445100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        e(r6);
        s(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        com.huawei.hms.ads.ex.V("HiAdTools", "hms version is too low to support switch next install way.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        com.huawei.hms.ads.ex.V("ApDnMgr", "switch next install way fail, curInstallWay:%s", r6.L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r6.M() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        com.huawei.hms.ads.ex.V("ApDnMgr", "switch next install way succ, curInstallWay:%s", r6.L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r6.N() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        r2 = (android.content.Context) r5.f32659s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r2 = gb.r0.o(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(com.huawei.openalliance.ad.download.app.AppDownloadTask r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L5
            goto L53
        L5:
            boolean r2 = r6.M()
            java.lang.String r3 = "ApDnMgr"
            if (r2 == 0) goto L46
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = r6.L()
            r2[r1] = r4
            java.lang.String r4 = "switch next install way succ, curInstallWay:%s"
            com.huawei.hms.ads.ex.V(r3, r4, r2)
            boolean r2 = r6.N()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.f32659s
            android.content.Context r2 = (android.content.Context) r2
            if (r2 != 0) goto L27
            goto L40
        L27:
            java.lang.Integer r2 = gb.r0.o(r2)
            if (r2 == 0) goto L39
            int r2 = r2.intValue()
            r3 = 30445100(0x1d08e2c, float:7.661114E-38)
            if (r2 >= r3) goto L37
            goto L39
        L37:
            r2 = r0
            goto L41
        L39:
            java.lang.String r2 = "HiAdTools"
            java.lang.String r3 = "hms version is too low to support switch next install way."
            com.huawei.hms.ads.ex.V(r2, r3)
        L40:
            r2 = r1
        L41:
            if (r2 != 0) goto L44
            goto L5
        L44:
            r2 = r0
            goto L54
        L46:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = r6.L()
            r2[r1] = r4
            java.lang.String r4 = "switch next install way fail, curInstallWay:%s"
            com.huawei.hms.ads.ex.V(r3, r4, r2)
        L53:
            r2 = r1
        L54:
            if (r2 == 0) goto L5d
            r5.e(r6)
            r5.s(r6)
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.download.app.a.y(com.huawei.openalliance.ad.download.app.AppDownloadTask):boolean");
    }
}
