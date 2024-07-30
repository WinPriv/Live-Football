package com.huawei.openalliance.ad.inter;

import a3.k;
import a3.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.util.Log;
import androidx.transition.n;
import ca.a;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jd;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.s;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.ExtensionActionListener;
import com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import gb.c0;
import gb.m0;
import gb.p;
import gb.r0;
import gb.u;
import gb.w;
import j7.r;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

@AllApi
/* loaded from: classes2.dex */
public final class HiAd implements IHiAd {

    /* renamed from: l, reason: collision with root package name */
    public static HiAd f22215l;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f22216m = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f22217a;

    /* renamed from: b, reason: collision with root package name */
    public final ec f22218b;

    /* renamed from: d, reason: collision with root package name */
    public IMultiMediaPlayingManager f22220d;

    /* renamed from: e, reason: collision with root package name */
    public AppDownloadListener f22221e;
    public IAppDownloadManager f;

    /* renamed from: g, reason: collision with root package name */
    public ExtensionActionListener f22222g;

    /* renamed from: h, reason: collision with root package name */
    public RequestOptions f22223h;

    /* renamed from: j, reason: collision with root package name */
    public Integer f22225j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22226k;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22219c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f22224i = -1;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: com.huawei.openalliance.ad.inter.HiAd$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0287a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Intent f22228s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Context f22229t;

            public RunnableC0287a(Intent intent, Context context) {
                this.f22228s = intent;
                this.f22229t = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = this.f22228s;
                String action = intent.getAction();
                for (Map.Entry entry : HiAd.this.f22219c.entrySet()) {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) entry.getKey();
                    IntentFilter intentFilter = (IntentFilter) entry.getValue();
                    if (intentFilter != null && intentFilter.matchAction(action)) {
                        broadcastReceiver.onReceive(this.f22229t, intent);
                    }
                }
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            w.b(new RunnableC0287a(intent, context));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f22231s;

        public b(String str) {
            this.f22231s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ha.e.g(HiAd.this.f22217a).d(s.f22119n, this.f22231s, null, null);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.getExtras() != null) {
                        boolean z10 = intent.getExtras().getBoolean(com.huawei.openalliance.ad.constant.w.bg);
                        HiAd hiAd = HiAd.this;
                        if (z10) {
                            hiAd.f22226k = true;
                            jd.Code();
                        } else {
                            hiAd.f22226k = false;
                        }
                    }
                } catch (Throwable th) {
                    e0.i.q(th, "onReceive error:", "HiAd");
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f22234a;

        public d(boolean z10) {
            this.f22234a = z10;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200) {
                ec.Code(HiAd.this.f22217a).I(this.f22234a);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f22236a;

        public e(int i10) {
            this.f22236a = i10;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200) {
                ec.Code(HiAd.this.f22217a).F(this.f22236a);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f22238a;

        public f(boolean z10) {
            this.f22238a = z10;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200) {
                StringBuilder sb2 = new StringBuilder("set app AutoOpenForbidden: ");
                boolean z10 = this.f22238a;
                sb2.append(z10);
                ex.V("HiAd", sb2.toString());
                ec.Code(HiAd.this.f22217a).Z(z10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.V("HiAd", "init abilitySDK retCode is %s", Integer.valueOf(KitSdkManager.getInstance().initSync(HiAd.this.f22217a)));
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            File cacheDir;
            StringBuilder sb2 = new StringBuilder();
            Context context = HiAd.this.f22217a;
            String str2 = "";
            if (context == null || (cacheDir = context.getCacheDir()) == null) {
                str = "";
            } else {
                str = m0.c(cacheDir);
            }
            sb2.append(str);
            String str3 = File.separator;
            String m10 = k.m(sb2, str3, com.huawei.openalliance.ad.constant.w.f22161i, str3);
            if (!p.f(m10) && !p.f(m10)) {
                m0.d(new File(m10));
            }
            StringBuilder sb3 = new StringBuilder();
            if (context != null) {
                try {
                    File externalCacheDir = context.getExternalCacheDir();
                    if (externalCacheDir != null) {
                        str2 = m0.c(externalCacheDir);
                    }
                } catch (Exception unused) {
                    ex.I("StoUtils", "getExternalFilesDir exception, use memory card folder.");
                }
                str2 = null;
            }
            String q10 = l.q(sb3, str2, str3, com.huawei.openalliance.ad.constant.w.f22161i, str3);
            if (!p.f(q10) && !p.f(q10)) {
                m0.d(new File(q10));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class i implements RemoteCallResultCallback<String> {
        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200) {
                ex.Code("HiAd", "success: set install permission in hms, %s", str);
            } else {
                ex.I("HiAd", "error: set install permission in hms, %s", str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final AppDownloadListener f22242s;

        public j(AppDownloadListener appDownloadListener) {
            this.f22242s = appDownloadListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentHashMap concurrentHashMap = a.C0042a.f3471a.f3470a;
            AppDownloadListener appDownloadListener = this.f22242s;
            if (appDownloadListener == null) {
                concurrentHashMap.remove("outer_listener_key");
            } else {
                concurrentHashMap.put("outer_listener_key", appDownloadListener);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|60|8|(1:10)|11|(1:13)|14|15|16|(16:18|19|20|21|(11:23|24|(10:28|29|30|31|(1:45)|(1:35)|36|(1:38)|39|(2:41|42)(1:44))|51|(0)|45|(0)|36|(0)|39|(0)(0))|53|24|(12:26|28|29|30|31|(0)|45|(0)|36|(0)|39|(0)(0))|51|(0)|45|(0)|36|(0)|39|(0)(0))|56|19|20|21|(0)|53|24|(0)|51|(0)|45|(0)|36|(0)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        com.huawei.hms.ads.ex.I("StoUtils", "getExternalFilesDir exception, use memory card folder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #3 {Exception -> 0x00b4, blocks: (B:21:0x00a9, B:23:0x00af), top: B:20:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HiAd(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.inter.HiAd.<init>(android.content.Context):void");
    }

    public static HiAd c(Context context) {
        HiAd hiAd;
        synchronized (f22216m) {
            if (f22215l == null) {
                f22215l = new HiAd(context);
            }
            hiAd = f22215l;
        }
        return hiAd;
    }

    @AllApi
    public static void disableUserInfo(Context context) {
        String str;
        if (context == null) {
            str = "is null";
        } else {
            str = "not null";
        }
        Log.i("HiAd", "disableUserInfo, context ".concat(str));
        if (context == null) {
            return;
        }
        ec.Code(context).Code(false);
        getInstance(context).enableUserInfo(false);
    }

    @AllApi
    public static IHiAd getInstance(Context context) {
        return c(context);
    }

    public final void b() {
        if (n.k("com.huawei.hag.abilitykit.api.KitSdkManager")) {
            String d10 = u.d("hw_sc.build.os.enable");
            if (ex.Code()) {
                ex.Code("HiAd", "hmftype: %s", d10);
            }
            if (Boolean.parseBoolean(d10)) {
                c0.a(new g());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void enableSharePd(boolean z10) {
        if (!r0.c(this.f22217a)) {
            return;
        }
        this.f22218b.V(z10);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void enableUserInfo(boolean z10) {
        if (!r0.c(this.f22217a)) {
            return;
        }
        this.f22218b.Code(z10);
        if (!z10) {
            c0.a(new h());
        } else {
            b();
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final int getAppActivateStyle() {
        return ec.Code(this.f22217a).Y();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final IAppDownloadManager getAppDownloadManager() {
        if (this.f == null) {
            this.f = (IAppDownloadManager) n.l();
        }
        return this.f;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final ExtensionActionListener getExtensionActionListener() {
        return this.f22222g;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final RequestOptions getRequestConfiguration() {
        return this.f22223h;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void informReady() {
        fa.h hVar;
        Context context = this.f22217a;
        synchronized (fa.h.f28235c) {
            if (fa.h.f28236d == null) {
                fa.h.f28236d = new fa.h(context);
            }
            hVar = fa.h.f28236d;
        }
        Iterator it = hVar.f28237a.iterator();
        while (it.hasNext()) {
            IPPSUiEngineCallback iPPSUiEngineCallback = (IPPSUiEngineCallback) it.next();
            if (iPPSUiEngineCallback != null) {
                try {
                    iPPSUiEngineCallback.onCallResult("onActivityStartFinish", null);
                } catch (Throwable th) {
                    ex.V("GlobalUtil", "onCallResult err: %s", th.getClass().getSimpleName());
                }
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void initGrs(String str) {
        try {
            ex.V("HiAd", "initGrs, appName: %s", str);
            n.d(null, ServerConfig.class, "setGrsAppName", new Class[]{String.class}, new Object[]{str});
            n.d(null, ServerConfig.class, "init", new Class[]{Context.class}, new Object[]{this.f22217a});
        } catch (Throwable unused) {
            ex.I("HiAd", "fail to find ServerConfig in adscore");
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void initLog(boolean z10, int i10) {
        initLog(z10, i10, null);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final boolean isAppAutoOpenForbidden() {
        return ec.Code(this.f22217a).ac();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final boolean isAppInstalledNotify() {
        return ec.Code(this.f22217a).X();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final boolean isEnableUserInfo() {
        if (!r0.c(this.f22217a)) {
            return false;
        }
        return this.f22218b.f();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final boolean isNewProcess() {
        boolean z10;
        if (this.f22224i != Process.myPid()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22224i = Process.myPid();
        }
        ex.V("HiAd", "isNewProcess:" + z10);
        return z10;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void onBackground() {
        w.b(new fa.a(this, "stopTimer"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[Catch: JSONException -> 0x0079, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0079, blocks: (B:10:0x0057, B:12:0x006d), top: B:9:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.openalliance.ad.inter.IHiAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onForeground() {
        /*
            r8 = this;
            fa.a r0 = new fa.a
            java.lang.String r1 = "startTimer"
            r0.<init>(r8, r1)
            gb.w.b(r0)
            android.content.Context r0 = r8.f22217a
            if (r0 == 0) goto L80
            int r1 = gb.u.f28631a
            r1 = 0
            r2 = 1
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L21
            r4 = 26
            if (r3 < r4) goto L35
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L21
            boolean r3 = com.esotericsoftware.kryo.serializers.b.D(r3)     // Catch: java.lang.Throwable -> L21
            goto L36
        L21:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r4[r1] = r3
            java.lang.String r3 = "u"
            java.lang.String r5 = "canInstallPackage exception %s"
            com.huawei.hms.ads.ex.I(r3, r5, r4)
        L35:
            r3 = r2
        L36:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r4[r1] = r5
            java.lang.String r1 = "HiAd"
            java.lang.String r5 = "has install permission is: %s"
            com.huawei.hms.ads.ex.Code(r1, r5, r4)
            android.content.Context r0 = r0.getApplicationContext()
            com.huawei.openalliance.ad.inter.HiAd$i r1 = new com.huawei.openalliance.ad.inter.HiAd$i
            r1.<init>()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.String r5 = "reportInstallPermission"
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "has_install_permission"
            r6.put(r7, r3)     // Catch: org.json.JSONException -> L79
            ha.i r2 = a0.a.h(r0, r2)     // Catch: org.json.JSONException -> L79
            java.lang.String r3 = r6.toString()     // Catch: org.json.JSONException -> L79
            r2.d(r5, r3, r1, r4)     // Catch: org.json.JSONException -> L79
            boolean r2 = gb.r0.f()     // Catch: org.json.JSONException -> L79
            if (r2 == 0) goto L80
            ha.i r0 = ha.i.e(r0)     // Catch: org.json.JSONException -> L79
            java.lang.String r2 = r6.toString()     // Catch: org.json.JSONException -> L79
            r0.d(r5, r2, r1, r4)     // Catch: org.json.JSONException -> L79
            goto L80
        L79:
            java.lang.String r0 = "ApDnApi"
            java.lang.String r1 = "reportInstallPermission JSONException"
            com.huawei.hms.ads.ex.I(r0, r1)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.inter.HiAd.onForeground():void");
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setAppActivateStyle(int i10) {
        r.g(this.f22217a, isAppInstalledNotify(), i10, ba.U, new e(i10));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setAppAutoOpenForbidden(boolean z10) {
        ex.V("HiAd", "set app AutoOpenForbidden: " + z10);
        Context context = this.f22217a;
        f fVar = new f(z10);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.f22050aa, "AutoOpenForbidden");
            jSONObject.put(ba.f22051ab, z10);
            ha.i.e(context).d("remoteSharedPrefSet", jSONObject.toString(), fVar, String.class);
            if (r0.f()) {
                a0.a.h(context, true).d("remoteSharedPrefSet", jSONObject.toString(), fVar, String.class);
            }
        } catch (JSONException unused) {
            ex.I("ApDnApi", "setAutoOpenForbidden JSONException");
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setAppDownloadListener(AppDownloadListener appDownloadListener) {
        this.f22221e = appDownloadListener;
        w.b(new j(appDownloadListener));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setAppInstalledNotify(boolean z10) {
        ex.Code("HiAd", "set app installed notify: " + z10);
        r.g(this.f22217a, z10, getAppActivateStyle(), ba.T, new d(z10));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setBrand(int i10) {
        this.f22225j = Integer.valueOf(i10);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setConsent(String str) {
        ex.V("HiAd", "set TCF consent string");
        c0.c(new b(str));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setCountryCode(String str) {
        this.f22218b.Code(str);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setExtensionActionListener(ExtensionActionListener extensionActionListener) {
        this.f22222g = extensionActionListener;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setMultiMediaPlayingManager(IMultiMediaPlayingManager iMultiMediaPlayingManager) {
        this.f22220d = iMultiMediaPlayingManager;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setRequestConfiguration(RequestOptions requestOptions) {
        this.f22223h = requestOptions;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void initGrs(String str, String str2) {
        initGrs(str);
        try {
            ex.V("HiAd", "initGrs, appName: %s, countryCode: %s", str, str2);
            n.d(null, ServerConfig.class, "setRouterCountryCode", new Class[]{String.class}, new Object[]{str2});
            this.f22218b.Z(str2);
        } catch (Throwable unused) {
            ex.I("HiAd", "fail to find ServerConfig in adscore");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // com.huawei.openalliance.ad.inter.IHiAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initLog(boolean r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            android.content.Context r0 = r3.f22217a
            boolean r1 = gb.r0.c(r0)
            if (r1 != 0) goto L9
            return
        L9:
            if (r4 == 0) goto L75
            r4 = 4
            if (r5 >= r4) goto Lf
            r5 = r4
        Lf:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L70
            java.lang.String r4 = "mounted"
            java.lang.String r6 = android.os.Environment.getExternalStorageState()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            java.lang.String r6 = "StoUtils"
            r1 = 1
            if (r4 != 0) goto L36
            int r4 = gb.u.f28631a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = android.os.Environment.isExternalStorageRemovable()     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r4 = move-exception
            java.lang.String r2 = "isExternalStorageRemovable, "
            e0.i.q(r4, r2, r6)
            r4 = r1
        L32:
            if (r4 != 0) goto L35
            goto L36
        L35:
            r1 = 0
        L36:
            java.lang.String r4 = ""
            if (r1 == 0) goto L53
            if (r0 != 0) goto L3e
            r1 = r4
            goto L4f
        L3e:
            r1 = 0
            java.io.File r2 = r0.getExternalFilesDir(r1)     // Catch: java.lang.Exception -> L4a
            if (r2 == 0) goto L4f
            java.lang.String r1 = gb.m0.c(r2)     // Catch: java.lang.Exception -> L4a
            goto L4f
        L4a:
            java.lang.String r2 = "getExternalFilesDir exception, use memory card folder."
            com.huawei.hms.ads.ex.I(r6, r2)
        L4f:
            if (r1 == 0) goto L53
            r6 = r1
            goto L62
        L53:
            if (r0 != 0) goto L56
            goto L61
        L56:
            java.io.File r6 = r0.getFilesDir()
            if (r6 != 0) goto L5d
            goto L61
        L5d:
            java.lang.String r4 = gb.m0.c(r6)
        L61:
            r6 = r4
        L62:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L70
            java.lang.String r4 = "LogTool"
            java.lang.String r5 = "enable log failed, due to root path is null"
            com.huawei.hms.ads.ex.I(r4, r5)
            goto L75
        L70:
            java.lang.String r4 = "HiAd"
            com.huawei.hms.ads.ex.Code(r5, r6, r4)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.inter.HiAd.initLog(boolean, int, java.lang.String):void");
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setAppMuted(boolean z10) {
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setAppVolume(float f10) {
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public final void setApplicationCode(String str) {
    }
}
