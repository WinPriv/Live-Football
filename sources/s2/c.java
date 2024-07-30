package s2;

import android.util.Log;
import java.util.HashSet;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f35104a = new b();

    public static void a() {
        f35104a.getClass();
    }

    public static void b(String str) {
        f35104a.getClass();
        HashSet hashSet = b.f35103a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, null);
            hashSet.add(str);
        }
    }

    public static void c(String str, Throwable th) {
        f35104a.getClass();
        HashSet hashSet = b.f35103a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, th);
            hashSet.add(str);
        }
    }
}
