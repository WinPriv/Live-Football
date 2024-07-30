package ka;

import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.analytics.Tracker;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class lj {

    /* renamed from: b, reason: collision with root package name */
    public static final lj f31435b = new lj();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f31436a = Executors.newFixedThreadPool(1);

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final Context f31437s;

        /* renamed from: t, reason: collision with root package name */
        public final String f31438t;

        /* renamed from: u, reason: collision with root package name */
        public final LinkedHashMap<String, String> f31439u;

        public a(Context context, String str, LinkedHashMap<String, String> linkedHashMap) {
            this.f31437s = context.getApplicationContext();
            this.f31438t = str;
            this.f31439u = linkedHashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (lj.b(this.f31437s)) {
                n7.e("PpsBITracker", "OpenDevice onReport BI");
                HiAnalyticsInstance analyticsInstance = Tracker.getInstance().getAnalyticsInstance();
                if (analyticsInstance == null) {
                    n7.e("PpsBITracker", "instance is null return.");
                } else {
                    analyticsInstance.onEvent(this.f31438t, this.f31439u);
                    analyticsInstance.onReport(0);
                }
            }
        }
    }

    public static boolean b(Context context) {
        int i10;
        try {
            i10 = Settings.Secure.getInt(context.getContentResolver(), "user_experience_involved", 0);
        } catch (Exception e10) {
            n7.g("PpsBITracker", "isUserExperienceOpen()  " + e10.toString());
            i10 = 0;
        }
        if (i10 != 1) {
            return false;
        }
        return true;
    }

    public final void a(Context context, String str, LinkedHashMap<String, String> linkedHashMap) {
        boolean z10;
        if (androidx.transition.n.U("com.huawei.hianalytics.process.HiAnalyticsInstance") && androidx.transition.n.U("com.huawei.hms.analytics.Tracker")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        try {
            this.f31436a.execute(new a(context, str, linkedHashMap));
        } catch (RuntimeException e10) {
            e0.i.p(e10, "reportBI error:", "PpsBITracker");
        }
    }
}
