package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import e0.i;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ka.n7;

/* loaded from: classes2.dex */
public final class a implements ta.a<AppLocalDownloadTask>, xa.a {

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap f35288v = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final Context f35289s;

    /* renamed from: t, reason: collision with root package name */
    public final ConcurrentHashMap f35290t = new ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public final C0480a f35291u;

    /* renamed from: sa.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0480a extends BroadcastReceiver {
        public C0480a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                n7.c("AppLocalDownloadDelegate", "appRe action: %s", action);
                a.d(a.this, intent, action);
            } catch (Throwable th) {
                i.p(th, "appRe ", "AppLocalDownloadDelegate");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {

        /* renamed from: sa.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0481a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f35294s;

            public RunnableC0481a(String str) {
                this.f35294s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.onAppInstalled(sa.b.q().p(this.f35294s));
            }
        }

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if (m.Z(context)) {
                    n7.c("AppLocalDownloadDelegate", "itRe action: %s", action);
                } else {
                    n7.f("AppLocalDownloadDelegate", "itRe action: %s", action);
                }
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    n7.g("AppLocalDownloadDelegate", "itRe dataString is empty, " + action);
                } else {
                    String substring = dataString.substring(8);
                    a.e(a.this, action, substring);
                    if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        p2.d(new RunnableC0481a(substring));
                    }
                }
            } catch (Throwable th) {
                i.p(th, "itRe:", "AppLocalDownloadDelegate");
            }
        }
    }

    public a(Context context) {
        C0480a c0480a = new C0480a();
        this.f35291u = c0480a;
        b bVar = new b();
        Context applicationContext = context.getApplicationContext();
        this.f35289s = applicationContext;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("huawei.intent.action.DOWNLOAD");
            applicationContext.registerReceiver(c0480a, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
            PersistentMessageCenter.getInstance().a(context.getPackageName(), "appInnerNotification", this);
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addDataScheme(WiseOpenHianalyticsData.UNION_PACKAGE);
            applicationContext.registerReceiver(bVar, intentFilter2);
            c();
        } catch (Throwable unused) {
            n7.g("AppLocalDownloadDelegate", "registerReceiver Exception");
        }
    }

    public static void c() {
        try {
            for (Method method : a.class.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(AppLocalDownloadTask.class)) {
                    f35288v.put(method.getName(), method);
                }
            }
        } catch (Throwable th) {
            n7.c("AppLocalDownloadDelegate", "transport=%s", th.getClass().getSimpleName());
        }
    }

    public static void d(a aVar, Intent intent, String str) {
        String str2;
        aVar.getClass();
        String str3 = "";
        if ("huawei.intent.action.DOWNLOAD".equals(str)) {
            try {
                str2 = intent.getStringExtra("appPackageName");
            } catch (Throwable unused) {
                n7.g("AppLocalDownloadDelegate", " get packageName occur errors.");
                str2 = "";
            }
            AppLocalDownloadTask p10 = sa.b.q().p(str2);
            if (p10 == null) {
                n7.e("AppLocalDownloadDelegate", " task is null, pkg=" + str2);
                if (TextUtils.isEmpty(str2)) {
                    n7.e("AppLocalDownloadDelegate", " packageName is empty.");
                    return;
                }
                Set<ta.b> b10 = aVar.b(str2);
                n7.c("AppLocalDownloadDelegate", " findAndRefreshTask list:%s", b10);
                if (b10 != null && b10.size() > 0) {
                    Iterator<ta.b> it = b10.iterator();
                    while (it.hasNext()) {
                        it.next().a(str2);
                    }
                    return;
                }
                return;
            }
            SafeIntent safeIntent = new SafeIntent(intent);
            p10.c(safeIntent.getIntExtra("downloadStatus", 0));
            p10.e(safeIntent.getIntExtra("downloadProgress", 0));
            p10.f(safeIntent.getIntExtra("pauseReason", 0));
            p10.o(safeIntent.getIntExtra("install_result", 0));
            p10.b((p10.j() * p10.getProgress()) / 100);
            try {
                str3 = intent.getStringExtra("appDownloadMethod");
            } catch (Throwable unused2) {
                n7.g("AppLocalDownloadDelegate", " get methodName occur errors.");
            }
            if (!TextUtils.isEmpty(str3)) {
                if (str3.equals("onDownloadDeleted")) {
                    sa.b.q().j(p10);
                    return;
                }
                Method method = (Method) f35288v.get(str3);
                if (method != null) {
                    try {
                        n7.c("AppLocalDownloadDelegate", "methodName:%s", str3);
                        method.invoke(aVar, p10);
                        return;
                    } catch (Throwable unused3) {
                        n7.c("AppLocalDownloadDelegate", "itex=%s", str3);
                        return;
                    }
                }
                n7.e("AppLocalDownloadDelegate", "method is not find".concat(str3));
            }
        }
    }

    public static void e(a aVar, String str, String str2) {
        Set<ta.b> b10 = aVar.b(str2);
        if (b10 != null && b10.size() > 0) {
            if ("android.intent.action.PACKAGE_ADDED".equals(str)) {
                for (ta.b bVar : b10) {
                    if (bVar != null) {
                        bVar.b(str2);
                    }
                }
                return;
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(str)) {
                for (ta.b bVar2 : b10) {
                    if (bVar2 != null) {
                        bVar2.c(str2);
                    }
                }
            }
        }
    }

    public final synchronized Set<ta.b> a(AppInfo appInfo) {
        if (appInfo != null) {
            if (!TextUtils.isEmpty(appInfo.getPackageName())) {
                return b(appInfo.getPackageName());
            }
        }
        return null;
    }

    public final synchronized Set<ta.b> b(String str) {
        return (Set) this.f35290t.get(str);
    }

    public final void f(AppLocalDownloadTask appLocalDownloadTask) {
        Set<ta.b> a10 = a(appLocalDownloadTask.n());
        n7.e("AppLocalDownloadDelegate", " list:" + a10);
        if (a10 != null && a10.size() > 0) {
            Iterator<ta.b> it = a10.iterator();
            while (it.hasNext()) {
                it.next().b(appLocalDownloadTask);
            }
        }
    }

    @Override // xa.a
    public final void n(String str, Intent intent) {
        if (!TextUtils.isEmpty(str) && intent != null) {
            n7.c("AppLocalDownloadDelegate", "onMessageNotify msgName:%s", str);
            this.f35291u.onReceive(this.f35289s, intent);
        } else {
            n7.e("AppLocalDownloadDelegate", "msgName or msgData is empty!");
        }
    }

    @OuterVisible
    public void onAppInstalled(AppLocalDownloadTask appLocalDownloadTask) {
        if (appLocalDownloadTask != null) {
            appLocalDownloadTask.c(6);
            f(appLocalDownloadTask);
            sa.b.q().i(appLocalDownloadTask);
        }
    }

    @OuterVisible
    public void onAppUnInstalled(AppLocalDownloadTask appLocalDownloadTask) {
        String packageName;
        Set<ta.b> b10;
        if (appLocalDownloadTask == null || (b10 = b((packageName = appLocalDownloadTask.n().getPackageName()))) == null || b10.size() <= 0) {
            return;
        }
        Iterator<ta.b> it = b10.iterator();
        while (it.hasNext()) {
            it.next().c(packageName);
        }
    }

    @OuterVisible
    public void onDownloadDeleted(AppLocalDownloadTask appLocalDownloadTask) {
        appLocalDownloadTask.e(0);
        appLocalDownloadTask.b(0L);
        appLocalDownloadTask.c(4);
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onDownloadFail(AppLocalDownloadTask appLocalDownloadTask) {
        if (sa.b.q().w(appLocalDownloadTask)) {
            return;
        }
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onDownloadPaused(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onDownloadProgress(AppLocalDownloadTask appLocalDownloadTask) {
        Set<ta.b> a10 = a(appLocalDownloadTask.n());
        if (a10 == null || a10.size() <= 0) {
            return;
        }
        Iterator<ta.b> it = a10.iterator();
        while (it.hasNext()) {
            it.next().a(appLocalDownloadTask);
        }
    }

    @OuterVisible
    public void onDownloadResumed(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onDownloadStart(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onDownloadSuccess(AppLocalDownloadTask appLocalDownloadTask) {
    }

    @OuterVisible
    public void onDownloadWaiting(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onSilentInstallFailed(AppLocalDownloadTask appLocalDownloadTask) {
        n7.h("AppLocalDownloadDelegate", "install apk failed, reason: %s", Integer.valueOf(appLocalDownloadTask.J()));
        if ((appLocalDownloadTask.J() == 1) || !sa.b.q().w(appLocalDownloadTask)) {
            f(appLocalDownloadTask);
        }
    }

    @OuterVisible
    public void onSilentInstallStart(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onSilentInstallSuccess(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }

    @OuterVisible
    public void onSystemInstallStart(AppLocalDownloadTask appLocalDownloadTask) {
        f(appLocalDownloadTask);
    }
}
