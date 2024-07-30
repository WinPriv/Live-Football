package b0;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2705s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2706t;

    public e(Object obj, Object obj2) {
        this.f2705s = obj;
        this.f2706t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f.f2710d;
            Object obj = this.f2706t;
            Object obj2 = this.f2705s;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                f.f2711e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
