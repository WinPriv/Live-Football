package da;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import ca.a;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gc;
import com.huawei.hms.ads.ge;
import com.huawei.hms.ads.gj;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.activity.AgProtocolActivity;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.download.DownloadListener;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import com.huawei.openalliance.ad.utils.SafeIntent;
import gb.b0;
import gb.c0;
import gb.r0;
import gb.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f implements DownloadListener<AppDownloadTask>, NotifyCallback {

    /* renamed from: w, reason: collision with root package name */
    public static final HashMap f27539w = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final Context f27540s;

    /* renamed from: t, reason: collision with root package name */
    public final ConcurrentHashMap f27541t = new ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public AppDownloadListener f27542u;

    /* renamed from: v, reason: collision with root package name */
    public final a f27543v;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: da.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0360a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Intent f27545s;

            public RunnableC0360a(Intent intent) {
                this.f27545s = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = this.f27545s;
                try {
                    String action = intent.getAction();
                    ex.Code("ApDnDe", "appRe action: %s", action);
                    f.c(f.this, intent, action);
                } catch (IllegalStateException | Exception e10) {
                    ex.I("ApDnDe", "appRe ".concat(e10.getClass().getSimpleName()));
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
            c0.c(new RunnableC0360a(intent));
        }
    }

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f27548s;

            public a(String str) {
                this.f27548s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.this.onAppInstalled(com.huawei.openalliance.ad.download.app.a.t().u(this.f27548s));
            }
        }

        /* renamed from: da.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0361b implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                com.huawei.openalliance.ad.download.app.a.t().d();
            }
        }

        /* loaded from: classes2.dex */
        public class c implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                com.huawei.openalliance.ad.download.app.a.t().d();
            }
        }

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Runnable cVar;
            f fVar = f.this;
            if (intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                ex.V("ApDnDe", "itRe action: %s", action);
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    ex.I("ApDnDe", "itRe dataString is empty, " + action);
                    return;
                }
                String substring = dataString.substring(8);
                f.d(fVar, action, substring);
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    c0.c(new a(substring));
                    return;
                }
                if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    fVar.f(substring);
                    if (TextUtils.isEmpty(substring)) {
                        ex.V("ApDnDe", "a bad removed intent");
                        return;
                    } else if (substring.equals(b0.g(context))) {
                        cVar = new RunnableC0361b();
                    } else {
                        return;
                    }
                } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action)) {
                    String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                    if (TextUtils.isEmpty(schemeSpecificPart)) {
                        ex.V("ApDnDe", "a bad intent");
                        return;
                    } else if (schemeSpecificPart.equals(b0.g(context))) {
                        cVar = new c();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                w.b(cVar);
            } catch (IllegalStateException | Exception e10) {
                ex.I("ApDnDe", "itRe:".concat(e10.getClass().getSimpleName()));
            }
        }
    }

    public f(Context context) {
        a aVar = new a();
        this.f27543v = aVar;
        b bVar = new b();
        Context applicationContext = context.getApplicationContext();
        this.f27540s = applicationContext;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("huawei.intent.action.DOWNLOAD");
            intentFilter.addAction("huawei.intent.action.OPEN");
            intentFilter.addAction("com.huawei.hms.pps.action.PPS_APP_OPEN");
            intentFilter.addAction("huawei.intent.action.PENDINGINTENT");
            intentFilter.addAction("huawei.intent.action.NOTIFICATON");
            intentFilter.addAction("huawei.intent.action.PPS_APP_USER_CANCEL");
            applicationContext.registerReceiver(aVar, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
            if (r0.a(applicationContext)) {
                a0.a.p(context, "appInnerNotification", this);
            } else {
                a0.a.u(context, "appInnerNotification", this);
            }
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
            intentFilter2.addDataScheme(WiseOpenHianalyticsData.UNION_PACKAGE);
            applicationContext.registerReceiver(bVar, intentFilter2);
            gj.Code(context).Code();
            b();
        } catch (Throwable th) {
            e0.i.q(th, "registerReceiver ", "ApDnDe");
        }
    }

    public static void b() {
        try {
            for (Method method : f.class.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(AppDownloadTask.class)) {
                    f27539w.put(method.getName(), method);
                }
            }
        } catch (Throwable th) {
            ex.Code("ApDnDe", "transport=%s", th.getMessage());
            ex.Z("ApDnDe", "transport=".concat(th.getClass().getSimpleName()));
        }
    }

    public static void c(f fVar, Intent intent, String str) {
        ca.a aVar;
        String str2;
        String str3;
        int i10;
        String str4;
        fVar.getClass();
        SafeIntent safeIntent = new SafeIntent(intent);
        if ("huawei.intent.action.DOWNLOAD".equals(str)) {
            String stringExtra = safeIntent.getStringExtra("appPackageName");
            AppDownloadTask u2 = com.huawei.openalliance.ad.download.app.a.t().u(stringExtra);
            if (u2 == null) {
                ex.V("ApDnDe", " task is null, pkg=" + stringExtra);
                if (TextUtils.isEmpty(stringExtra)) {
                    ex.V("ApDnDe", " packageName is empty.");
                    return;
                }
                Set<ca.c> h10 = fVar.h(stringExtra);
                ex.Code("ApDnDe", " findAndRefreshTask list:%s", h10);
                if (h10 != null && h10.size() > 0) {
                    Iterator<ca.c> it = h10.iterator();
                    while (it.hasNext()) {
                        it.next().Code(stringExtra);
                    }
                    return;
                }
                return;
            }
            String stringExtra2 = safeIntent.getStringExtra(ge.Code);
            if (!TextUtils.isEmpty(stringExtra2)) {
                AppInfo appInfo = (AppInfo) gb.b.o(AppInfo.class, stringExtra2, new Class[0]);
                AppInfo D = u2.D();
                if (appInfo != null) {
                    ex.V("ApDnDe", "update appInfo from remote task.");
                    D.V(appInfo.U());
                }
            }
            SafeIntent safeIntent2 = new SafeIntent(safeIntent);
            u2.c(safeIntent2.getIntExtra("downloadStatus", 0));
            u2.j(safeIntent2.getIntExtra("downloadProgress", 0));
            u2.p(safeIntent2.getIntExtra("pauseReason", 0));
            u2.q(safeIntent2.getIntExtra("install_result", 0));
            u2.m((u2.i() * u2.k()) / 100);
            String stringExtra3 = safeIntent.getStringExtra("appDownloadMethod");
            if (!TextUtils.isEmpty(stringExtra3)) {
                if (stringExtra3.equals("onDownloadDeleted")) {
                    com.huawei.openalliance.ad.download.app.a.t().c(u2);
                    return;
                }
                Method method = (Method) f27539w.get(stringExtra3);
                if (method != null) {
                    try {
                        ex.Code("ApDnDe", "methodName:%s", stringExtra3);
                        method.invoke(fVar, u2);
                        return;
                    } catch (IllegalAccessException unused) {
                        ex.Code("ApDnDe", "ilex=%s", stringExtra3);
                        return;
                    } catch (InvocationTargetException unused2) {
                        ex.Code("ApDnDe", "itex=%s", stringExtra3);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ("huawei.intent.action.OPEN".equals(str)) {
            String stringExtra4 = safeIntent.getStringExtra("appPackageName");
            AppDownloadListener appDownloadListener = fVar.f27542u;
            if (appDownloadListener != null) {
                appDownloadListener.Code(stringExtra4);
                return;
            }
            return;
        }
        if ("com.huawei.hms.pps.action.PPS_APP_OPEN".equals(str)) {
            try {
                if ("com.huawei.hms.pps.action.PPS_APP_OPEN".equals(safeIntent.getAction())) {
                    AppInfo appInfo2 = (AppInfo) gb.b.o(AppInfo.class, safeIntent.getStringExtra(ge.Code), new Class[0]);
                    if (appInfo2 == null) {
                        ex.V("ApDnDe", "appInfo is null");
                    } else {
                        ca.a aVar2 = a.C0042a.f3471a;
                        if (aVar2 != null) {
                            aVar2.Code(appInfo2);
                        }
                    }
                }
                return;
            } catch (Throwable th) {
                ex.I("ApDnDe", "exception: %s", th.getClass().getSimpleName());
                return;
            }
        }
        boolean equals = "huawei.intent.action.PENDINGINTENT".equals(str);
        Context context = fVar.f27540s;
        if (equals) {
            ex.V("ApDnDe", "request intent");
            try {
                PendingIntent pendingIntent = (PendingIntent) safeIntent.getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT);
                if (pendingIntent != null) {
                    Intent intent2 = new Intent();
                    intent2.setClass(context, AgProtocolActivity.class);
                    intent2.putExtra(BaseGmsClient.KEY_PENDING_INTENT, pendingIntent);
                    i10 = safeIntent.getIntExtra("pendingIntent.type", 6);
                    intent2.putExtra("pendingIntent.type", i10);
                    str3 = safeIntent.getStringExtra("task.pkg");
                    intent2.putExtra("task.pkg", str3);
                    str4 = safeIntent.getStringExtra(ba.M);
                    intent2.putExtra(ba.M, str4);
                    intent2.addFlags(268959744);
                    intent2.setClipData(com.huawei.openalliance.ad.constant.w.cH);
                    context.startActivity(intent2);
                } else {
                    str3 = null;
                    i10 = -1;
                    str4 = null;
                }
                cz.Code(context, i10, str3, str4, "reqAgPendingIntent");
                return;
            } catch (Throwable unused3) {
                ex.V("ApDnDe", " requestAgProtocol error");
                return;
            }
        }
        if ("huawei.intent.action.NOTIFICATON".equals(str)) {
            SafeIntent safeIntent3 = new SafeIntent(safeIntent);
            String stringExtra5 = safeIntent3.getStringExtra(ba.av);
            if (stringExtra5 != null && !stringExtra5.equals(context.getPackageName())) {
                str2 = "sourcePackageName not equals packageName.";
            } else {
                String stringExtra6 = safeIntent3.getStringExtra("contentRecord");
                if (ex.Code()) {
                    ex.Code("ApDnDe", "sendNotify content: %s", androidx.transition.n.e(stringExtra6));
                }
                AdContentData adContentData = (AdContentData) gb.b.o(AdContentData.class, stringExtra6, new Class[0]);
                if (adContentData == null) {
                    str2 = " contentData is empty.";
                } else {
                    String stringExtra7 = safeIntent3.getStringExtra("unique_id");
                    AppInfo c12 = adContentData.c1();
                    if (c12 != null && c12.d0() == 1 && !TextUtils.isEmpty(c12.e0())) {
                        int intExtra = safeIntent3.getIntExtra(ba.L, 1);
                        gc gcVar = new gc(context, adContentData, stringExtra7);
                        gcVar.Code(intExtra);
                        gcVar.I();
                        return;
                    }
                    return;
                }
            }
            ex.V("ApDnDe", str2);
            return;
        }
        if ("huawei.intent.action.PPS_APP_USER_CANCEL".equals(str)) {
            try {
                AppInfo appInfo3 = (AppInfo) gb.b.o(AppInfo.class, safeIntent.getStringExtra(ge.Code), new Class[0]);
                if (appInfo3 != null && (aVar = a.C0042a.f3471a) != null) {
                    aVar.V(appInfo3);
                }
            } catch (Throwable th2) {
                ex.I("ApDnDe", "onUserCancel ex: %s", th2.getClass().getSimpleName());
            }
        }
    }

    public static void d(f fVar, String str, String str2) {
        Set<ca.c> h10 = fVar.h(str2);
        if (h10 != null && h10.size() > 0) {
            if ("android.intent.action.PACKAGE_ADDED".equals(str)) {
                for (ca.c cVar : h10) {
                    if (cVar != null) {
                        cVar.V(str2);
                    }
                }
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(str)) {
                for (ca.c cVar2 : h10) {
                    if (cVar2 != null) {
                        cVar2.I(str2);
                    }
                }
            }
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(str) && fVar.f27542u != null) {
            AppInfo appInfo = new AppInfo();
            appInfo.x(str2);
            fVar.f27542u.Code(n.DOWNLOAD, appInfo);
        }
    }

    public final synchronized Set<ca.c> a(AppInfo appInfo) {
        if (appInfo != null) {
            if (!TextUtils.isEmpty(appInfo.q())) {
                return h(appInfo.q());
            }
        }
        return null;
    }

    public final void e(n nVar, AppDownloadTask appDownloadTask) {
        AppDownloadListener appDownloadListener = this.f27542u;
        if (appDownloadListener != null) {
            appDownloadListener.Code(nVar, appDownloadTask.D());
        }
    }

    public final void f(String str) {
        NotificationManager notificationManager;
        if (!TextUtils.isEmpty(str) && (notificationManager = (NotificationManager) this.f27540s.getSystemService("notification")) != null) {
            notificationManager.cancel(str.hashCode());
        }
    }

    public final void g(AppDownloadTask appDownloadTask) {
        Set<ca.c> a10 = a(appDownloadTask.D());
        if (a10 != null && a10.size() > 0) {
            Iterator<ca.c> it = a10.iterator();
            while (it.hasNext()) {
                it.next().V(appDownloadTask);
            }
        }
    }

    public final synchronized Set<ca.c> h(String str) {
        return (Set) this.f27541t.get(str);
    }

    @Override // com.huawei.openalliance.ad.msgnotify.NotifyCallback
    public final void onMessageNotify(String str, Intent intent) {
        if (!TextUtils.isEmpty(str) && intent != null) {
            ex.Code("ApDnDe", "onMessageNotify msgName:%s", str);
            this.f27543v.onReceive(this.f27540s, intent);
        } else {
            ex.V("ApDnDe", "msgName or msgData is empty!");
        }
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onAppInstalled(AppDownloadTask appDownloadTask) {
        if (appDownloadTask != null) {
            appDownloadTask.c(6);
            e(n.INSTALLED, appDownloadTask);
            g(appDownloadTask);
            Timer timer = new Timer();
            ex.Code("TaskDelTimer", "start timer");
            timer.schedule(new p(appDownloadTask), 2000L);
        }
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onAppUnInstalled(AppDownloadTask appDownloadTask) {
        if (appDownloadTask != null) {
            String q10 = appDownloadTask.D().q();
            Set<ca.c> h10 = h(q10);
            if (h10 != null && h10.size() > 0) {
                Iterator<ca.c> it = h10.iterator();
                while (it.hasNext()) {
                    it.next().I(q10);
                }
            }
            e(n.DOWNLOAD, appDownloadTask);
        }
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadDeleted(AppDownloadTask appDownloadTask) {
        appDownloadTask.j(0);
        appDownloadTask.m(0L);
        appDownloadTask.c(4);
        g(appDownloadTask);
        e(n.DOWNLOADFAILED, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadFail(AppDownloadTask appDownloadTask) {
        if (com.huawei.openalliance.ad.download.app.a.t().y(appDownloadTask)) {
            return;
        }
        g(appDownloadTask);
        e(n.DOWNLOADFAILED, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadPaused(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.PAUSE, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadProgress(AppDownloadTask appDownloadTask) {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f27542u == null);
        ex.Code("ApDnDe", "onDownloadProgress: %s", objArr);
        Set<ca.c> a10 = a(appDownloadTask.D());
        if (a10 != null && a10.size() > 0) {
            Iterator<ca.c> it = a10.iterator();
            while (it.hasNext()) {
                it.next().Code(appDownloadTask);
            }
        }
        AppDownloadListener appDownloadListener = this.f27542u;
        if (appDownloadListener != null) {
            appDownloadListener.Code(appDownloadTask.D(), appDownloadTask.k());
        }
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadResumed(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.RESUME, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadStart(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.DOWNLOADING, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadSuccess(AppDownloadTask appDownloadTask) {
        e(n.DOWNLOADED, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onDownloadWaiting(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.WAITING, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onSilentInstallFailed(AppDownloadTask appDownloadTask) {
        ex.I("ApDnDe", "install apk failed, reason: %s", Integer.valueOf(appDownloadTask.O()));
        if ((appDownloadTask.O() == 1) || !com.huawei.openalliance.ad.download.app.a.t().y(appDownloadTask)) {
            g(appDownloadTask);
            e(appDownloadTask.a() == 4 ? n.DOWNLOAD : n.INSTALL, appDownloadTask);
        }
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onSilentInstallStart(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.INSTALLING, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onSilentInstallSuccess(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.INSTALLED, appDownloadTask);
    }

    @Override // com.huawei.openalliance.ad.download.DownloadListener
    @AllApi
    public void onSystemInstallStart(AppDownloadTask appDownloadTask) {
        g(appDownloadTask);
        e(n.INSTALL, appDownloadTask);
    }
}
