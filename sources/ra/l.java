package ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ka.ke;
import ka.lg;
import ka.n7;
import ka.p;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f34981c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f34982d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static l f34983e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f34984a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f34985b = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String dataString = intent.getDataString();
            if (TextUtils.isEmpty(dataString)) {
                n7.g("GPDownloadManager", "itRer dataString is empty");
                return;
            }
            String substring = dataString.substring(8);
            try {
                if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                    l.b(l.this, substring);
                }
            } catch (Throwable th) {
                n7.h("GPDownloadManager", "itRer: %s", th.getClass().getSimpleName());
            }
        }
    }

    public l(Context context) {
        a aVar = new a();
        Context applicationContext = context.getApplicationContext();
        this.f34984a = applicationContext;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(WiseOpenHianalyticsData.UNION_PACKAGE);
        applicationContext.registerReceiver(aVar, intentFilter);
    }

    public static l a(Context context) {
        l lVar;
        synchronized (f34981c) {
            if (f34983e == null) {
                f34983e = new l(context);
            }
            lVar = f34983e;
        }
        return lVar;
    }

    public static void b(l lVar, String str) {
        ContentRecord contentRecord;
        lVar.getClass();
        n7.e("GPDownloadManager", "dealWithAdd");
        synchronized (f34982d) {
            if (lVar.f34985b.containsKey(str)) {
                AppDownloadTask appDownloadTask = (AppDownloadTask) lVar.f34985b.get(str);
                lVar.f34985b.remove(str);
                n7.f("GPDownloadManager", "task size after remove: %s", Integer.valueOf(lVar.f34985b.size()));
                lg g02 = appDownloadTask.g0();
                if (g02 != null && (contentRecord = ((ke) g02).f31382b) != null && contentRecord.j0() != null) {
                    ((ke) g02).j(Integer.valueOf(appDownloadTask.h0()), appDownloadTask.k0(), appDownloadTask.j(), contentRecord.j0().O(), appDownloadTask.n0());
                    new p(lVar.f34984a).l(contentRecord, contentRecord.j0().O());
                }
            }
        }
    }

    public final void c(AppDownloadTask appDownloadTask, String str) {
        Long l10;
        synchronized (f34982d) {
            n7.c("GPDownloadManager", "task size before: %s", Integer.valueOf(this.f34985b.size()));
            for (Map.Entry entry : new ConcurrentHashMap(this.f34985b).entrySet()) {
                n7.c("GPDownloadManager", "entry key: %s time: %s", entry.getKey(), Long.valueOf(((AppDownloadTask) entry.getValue()).C0()));
                if (System.currentTimeMillis() - ((AppDownloadTask) entry.getValue()).C0() > 900000) {
                    this.f34985b.remove(entry.getKey());
                }
            }
            this.f34985b.put(str, appDownloadTask);
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(this.f34985b.size());
            objArr[1] = str;
            if (this.f34985b.get(str) != null) {
                l10 = Long.valueOf(((AppDownloadTask) this.f34985b.get(str)).C0());
            } else {
                l10 = null;
            }
            objArr[2] = l10;
            n7.f("GPDownloadManager", "task size after: %s, packageName: %s time: %s", objArr);
        }
    }
}
