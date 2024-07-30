package ic;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static volatile f f29547e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29548a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f29549b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f29550c;

    /* renamed from: d, reason: collision with root package name */
    public PackageManager f29551d;

    public f(Context context) {
        this.f29548a = context;
    }

    public static f a(Context context) {
        if (f29547e == null) {
            synchronized (f.class) {
                if (f29547e == null) {
                    f29547e = new f(context);
                }
            }
        }
        return f29547e;
    }
}
