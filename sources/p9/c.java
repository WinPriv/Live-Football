package p9;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f34485a;

    /* renamed from: b, reason: collision with root package name */
    public static d f34486b;

    static {
        HashMap hashMap = new HashMap();
        f34485a = hashMap;
        hashMap.put(3, a.class);
        hashMap.put(1, f.class);
        hashMap.put(2, g.class);
        hashMap.put(0, e.class);
        hashMap.put(4, e.class);
        hashMap.put(7, b.class);
    }

    public static synchronized d a(Context context) {
        synchronized (c.class) {
            d dVar = f34486b;
            if (dVar != null) {
                return dVar;
            }
            Log.i("DeviceImplFactory", "deviceType: " + com.huawei.openalliance.ad.ppskit.utils.g.b(context));
            Class cls = (Class) f34485a.get(Integer.valueOf(com.huawei.openalliance.ad.ppskit.utils.g.b(context)));
            if (cls == null) {
                e eVar = new e();
                f34486b = eVar;
                return eVar;
            }
            try {
                f34486b = (d) cls.newInstance();
            } catch (Throwable unused) {
                f34486b = new e();
                Log.e("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
            }
            return f34486b;
        }
    }
}
