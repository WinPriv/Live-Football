package da;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jh;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f27567c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f27568d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static o f27569e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27570a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27571b = new ConcurrentHashMap();

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
                ex.I("GPDownloadManager", "itRer dataString is empty");
                return;
            }
            String substring = dataString.substring(8);
            try {
                if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                    o.b(o.this, substring);
                }
            } catch (Throwable th) {
                ex.I("GPDownloadManager", "itRer: %s", th.getClass().getSimpleName());
            }
        }
    }

    public o(Context context) {
        a aVar = new a();
        Context applicationContext = context.getApplicationContext();
        this.f27570a = applicationContext;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(WiseOpenHianalyticsData.UNION_PACKAGE);
        applicationContext.registerReceiver(aVar, intentFilter);
    }

    public static o a(Context context) {
        o oVar;
        synchronized (f27567c) {
            if (f27569e == null) {
                f27569e = new o(context);
            }
            oVar = f27569e;
        }
        return oVar;
    }

    public static void b(o oVar, String str) {
        oVar.getClass();
        ex.V("GPDownloadManager", "dealWithAdd");
        synchronized (f27568d) {
            if (oVar.f27571b.containsKey(str)) {
                AppDownloadTask appDownloadTask = (AppDownloadTask) oVar.f27571b.get(str);
                oVar.f27571b.remove(str);
                ex.V("GPDownloadManager", "task size after remove: %s", Integer.valueOf(oVar.f27571b.size()));
                AdContentData K = appDownloadTask.K();
                if (K != null && K.c1() != null) {
                    jh.Code(oVar.f27570a, K, appDownloadTask.I(), K.c1().a0());
                }
            }
        }
    }

    public final void c(String str, AppDownloadTask appDownloadTask) {
        Long l10;
        synchronized (f27568d) {
            ex.Code("GPDownloadManager", "task size before: %s", Integer.valueOf(this.f27571b.size()));
            for (Map.Entry entry : new ConcurrentHashMap(this.f27571b).entrySet()) {
                ex.Code("GPDownloadManager", "entry key: %s time: %s", entry.getKey(), Long.valueOf(((AppDownloadTask) entry.getValue()).P()));
                if (System.currentTimeMillis() - ((AppDownloadTask) entry.getValue()).P() > 900000) {
                    this.f27571b.remove(entry.getKey());
                }
            }
            this.f27571b.put(str, appDownloadTask);
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(this.f27571b.size());
            objArr[1] = str;
            if (this.f27571b.get(str) != null) {
                l10 = Long.valueOf(((AppDownloadTask) this.f27571b.get(str)).P());
            } else {
                l10 = null;
            }
            objArr[2] = l10;
            ex.V("GPDownloadManager", "task size after: %s, packageName: %s time: %s", objArr);
        }
    }
}
