package ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.ads.ge;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import ka.ke;
import ka.lg;
import ka.n7;
import ka.s5;

/* loaded from: classes2.dex */
public final class f implements qa.a<AppDownloadTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34947a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f34948b = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: ra.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0472a implements Runnable {
            public RunnableC0472a(String str) {
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.j(f.this.f34947a).getClass();
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String simpleName;
            String str;
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    n7.g("AppDownloadDelegate", "installReceiver.onReceive, dataString is empty, action:" + action);
                    return;
                }
                String substring = dataString.substring(8);
                boolean z10 = false;
                if (com.huawei.openalliance.ad.ppskit.utils.m.Z(context)) {
                    n7.c("AppDownloadDelegate", "installReceiver.onReceive, action:%s, pkg: %s", action, substring);
                } else {
                    n7.f("AppDownloadDelegate", "installReceiver.onReceive, action:%s, pkg: %s", action, substring);
                }
                f.l(f.this, action, substring);
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    p2.e(new RunnableC0472a(substring));
                    return;
                }
                if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action)) {
                    String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                    if (TextUtils.isEmpty(schemeSpecificPart)) {
                        n7.e("AppDownloadDelegate", "a bad intent");
                        return;
                    } else if (!schemeSpecificPart.equals(w.W)) {
                        return;
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    if (TextUtils.isEmpty(substring)) {
                        n7.e("AppDownloadDelegate", "a bad removed intent");
                        return;
                    } else if (substring.equals(w.W)) {
                        try {
                            z10 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                        } catch (Throwable unused) {
                            n7.i("AppDownloadDelegate", "get param from intent error");
                        }
                        if (z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                g.j(context).getClass();
            } catch (IllegalStateException e10) {
                simpleName = e10.getClass().getSimpleName();
                str = "installReceiver.onReceive IllegalStateException:";
                n7.g("AppDownloadDelegate", str.concat(simpleName));
            } catch (Throwable th) {
                simpleName = th.getClass().getSimpleName();
                str = "installReceiver.onReceive Exception:";
                n7.g("AppDownloadDelegate", str.concat(simpleName));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            n7.e("AppDownloadDelegate", "get back is need auto open app");
            if (!intent.getBooleanExtra("autoOpen", true)) {
                return;
            }
            f.this.getClass();
            throw null;
        }
    }

    public f(Context context) {
        String str;
        a aVar = new a();
        new b();
        Context applicationContext = context.getApplicationContext();
        this.f34947a = applicationContext;
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
            intentFilter.addDataScheme(WiseOpenHianalyticsData.UNION_PACKAGE);
            applicationContext.registerReceiver(aVar, intentFilter);
        } catch (IllegalStateException unused) {
            str = "registerReceiver IllegalStateException";
            n7.g("AppDownloadDelegate", str);
        } catch (Exception unused2) {
            str = "registerReceiver Exception";
            n7.g("AppDownloadDelegate", str);
        }
    }

    public static void l(f fVar, String str, String str2) {
        WeakHashMap weakHashMap;
        synchronized (fVar) {
            weakHashMap = (WeakHashMap) fVar.f34948b.get(str2);
        }
        if (weakHashMap != null && weakHashMap.size() > 0) {
            for (qa.j jVar : weakHashMap.keySet()) {
                if (jVar != null) {
                    if ("android.intent.action.PACKAGE_ADDED".equals(str)) {
                        jVar.c();
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(str)) {
                        jVar.d();
                    }
                }
            }
        }
    }

    @Override // qa.a
    public final void a(AppDownloadTask appDownloadTask) {
        Runnable dVar;
        AppDownloadTask appDownloadTask2 = appDownloadTask;
        lg g02 = appDownloadTask2.g0();
        if (g02 != null) {
            int S = appDownloadTask2.S();
            ((ke) g02).n("downloadFail", appDownloadTask2.k0(), appDownloadTask2.i0(), false, true, Integer.valueOf(S), appDownloadTask2.d(), appDownloadTask2.j(), appDownloadTask2.F0(), appDownloadTask2.n0());
            appDownloadTask2.m(null);
        }
        m(appDownloadTask2);
        if (appDownloadTask2.S() == 2) {
            dVar = new c(this);
        } else {
            if (appDownloadTask2.S() != 3 && appDownloadTask2.S() != 4) {
                if (appDownloadTask2.S() == 118) {
                    dVar = new e(this);
                }
                k(appDownloadTask2, "onDownloadFail");
                g.j(this.f34947a).getClass();
            }
            dVar = new d(this, appDownloadTask2);
        }
        d2.a(dVar);
        k(appDownloadTask2, "onDownloadFail");
        g.j(this.f34947a).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.a
    public final void b(s5 s5Var, boolean z10) {
        AppDownloadTask appDownloadTask = (AppDownloadTask) s5Var;
        lg g02 = appDownloadTask.g0();
        if (!appDownloadTask.h() && g02 != null) {
            int Y = appDownloadTask.Y();
            DownloadBlockInfo d10 = appDownloadTask.d();
            if (d10 != null) {
                HashMap hashMap = d0.f22830a;
                d10.c(System.currentTimeMillis());
                appDownloadTask.e();
            }
            ((ke) g02).n("downloadPause", appDownloadTask.k0(), appDownloadTask.i0(), false, true, Integer.valueOf(Y), d10, appDownloadTask.j(), appDownloadTask.F0(), appDownloadTask.n0());
            appDownloadTask.m(null);
        }
        appDownloadTask.y(0);
        m(appDownloadTask);
        k(appDownloadTask, "onDownloadPaused");
    }

    @Override // qa.a
    public final void c(AppDownloadTask appDownloadTask) {
        AppDownloadTask appDownloadTask2 = appDownloadTask;
        lg g02 = appDownloadTask2.g0();
        if (g02 != null && appDownloadTask2.O() <= 0) {
            ((ke) g02).n("downloadstart", appDownloadTask2.k0(), appDownloadTask2.i0(), true, true, null, null, appDownloadTask2.j(), appDownloadTask2.F0(), appDownloadTask2.n0());
        }
        m(appDownloadTask2);
        k(appDownloadTask2, "onDownloadStart");
    }

    @Override // qa.a
    public final void d(AppDownloadTask appDownloadTask) {
        AppDownloadTask appDownloadTask2 = appDownloadTask;
        WeakHashMap<qa.j, Object> j10 = j(appDownloadTask2.f0());
        if (j10 != null && j10.size() > 0) {
            for (qa.j jVar : j10.keySet()) {
                if (jVar != null) {
                    jVar.a();
                }
            }
        }
        k(appDownloadTask2, "onDownloadProgress");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.a
    public final void e(s5 s5Var) {
        AppDownloadTask appDownloadTask = (AppDownloadTask) s5Var;
        m(appDownloadTask);
        k(appDownloadTask, "onDownloadResumed");
    }

    @Override // qa.a
    public final void f(AppDownloadTask appDownloadTask) {
        AppDownloadTask appDownloadTask2 = appDownloadTask;
        lg g02 = appDownloadTask2.g0();
        if (g02 != null) {
            ((ke) g02).n("download", appDownloadTask2.k0(), appDownloadTask2.i0(), true, false, null, appDownloadTask2.d(), appDownloadTask2.j(), appDownloadTask2.F0(), appDownloadTask2.n0());
            appDownloadTask2.m(null);
        }
        k(appDownloadTask2, "onDownloadSuccess");
        if (appDownloadTask2.f() == 1) {
            n7.b("AppDownloadDelegate", "onAppStartInstall start");
            n7.b("AppDownloadDelegate", "installApp start");
        }
    }

    @Override // qa.a
    public final void g(AppDownloadTask appDownloadTask) {
        d2.a(new ra.b(this, appDownloadTask));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.a
    public final void h(s5 s5Var) {
        AppDownloadTask appDownloadTask = (AppDownloadTask) s5Var;
        appDownloadTask.J(0);
        appDownloadTask.t(0L);
        appDownloadTask.z(0L);
        if (appDownloadTask.R() != 6) {
            appDownloadTask.y(4);
            k(appDownloadTask, "onDownloadDeleted");
        }
        appDownloadTask.y(4);
        m(appDownloadTask);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.a
    public final void i(s5 s5Var) {
        AppDownloadTask appDownloadTask = (AppDownloadTask) s5Var;
        m(appDownloadTask);
        k(appDownloadTask, "onDownloadWaiting");
    }

    public final synchronized WeakHashMap<qa.j, Object> j(AppInfo appInfo) {
        WeakHashMap<qa.j, Object> weakHashMap;
        if (appInfo != null) {
            if (!TextUtils.isEmpty(appInfo.getPackageName())) {
                String packageName = appInfo.getPackageName();
                synchronized (this) {
                    weakHashMap = (WeakHashMap) this.f34948b.get(packageName);
                }
                return weakHashMap;
            }
        }
        return null;
    }

    public final void k(AppDownloadTask appDownloadTask, String str) {
        Intent intent = new Intent();
        intent.setAction("huawei.intent.action.DOWNLOAD");
        intent.putExtra("appDownloadMethod", str);
        intent.putExtra("appPackageName", appDownloadTask.f0().getPackageName());
        intent.putExtra("downloadProgress", appDownloadTask.U());
        intent.putExtra("downloadStatus", appDownloadTask.R());
        intent.putExtra(ge.Code, y0.q(null, appDownloadTask.f0()));
        intent.putExtra("pauseReason", appDownloadTask.Y());
        if (str.equals("onDownloadStart")) {
            intent.putExtra("agd_event_reason", appDownloadTask.j());
            intent.putExtra("agd_install_type", appDownloadTask.F0());
        }
        if ("onSilentInstallFailed".equals(str)) {
            intent.putExtra("install_result", appDownloadTask.o0());
        }
        Context context = this.f34947a;
        if (!d0.m(context) && !appDownloadTask.x0()) {
            PersistentMessageCenter.getInstance().notifyMessage(context.getPackageName(), "appInnerNotification", intent);
        } else {
            context.sendBroadcast(intent);
        }
    }

    public final void m(AppDownloadTask appDownloadTask) {
        WeakHashMap<qa.j, Object> j10 = j(appDownloadTask.f0());
        if (j10 != null && j10.size() > 0) {
            for (qa.j jVar : j10.keySet()) {
                if (jVar != null) {
                    jVar.b();
                }
            }
        }
    }
}
