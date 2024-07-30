package ka;

import android.content.Context;
import com.huawei.hms.ads.analysis.DynamicLoaderAnalysis;
import com.huawei.hms.ads.analysis.IDynamicLoaderAnalysis;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static a f31783a;

    /* loaded from: classes2.dex */
    public static class a implements IDynamicLoaderAnalysis {
        public a(Context context) {
            context.getApplicationContext();
        }
    }

    public static void a(Context context) {
        try {
            if (f31783a == null) {
                f31783a = new a(context);
            }
            DynamicLoaderAnalysis.getInstance().registerDynamicLoaderAnalysis("ppskit", f31783a);
        } catch (Throwable th) {
            n7.h("DyLoaderAnalysisUtil", "init analysis err: %s", th.getClass().getSimpleName());
        }
    }
}
