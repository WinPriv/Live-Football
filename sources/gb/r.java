package gb;

import android.content.Context;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class r {
    public static int a(Context context, float f) {
        if (context == null || f <= gl.Code) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        ha.i.e(context).d("removeExSplashBlock", null, null, null);
    }
}
