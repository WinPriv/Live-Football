package ka;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f32206a = new HashMap();

    public static synchronized d5 a(Context context, String str) {
        d5 d5Var;
        synchronized (y4.class) {
            if (com.huawei.openalliance.ad.ppskit.utils.y1.h(str)) {
                str = "normal";
            }
            HashMap hashMap = f32206a;
            d5Var = (d5) hashMap.get(str);
            if (d5Var == null) {
                d5Var = new d5(context, str);
            }
            hashMap.put(str, d5Var);
        }
        return d5Var;
    }
}
