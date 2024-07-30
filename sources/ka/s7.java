package ka;

import android.util.Log;

/* loaded from: classes2.dex */
public final class s7 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31808t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t7 f31809u;

    public s7(t7 t7Var, String str, String str2) {
        this.f31809u = t7Var;
        this.f31807s = str;
        this.f31808t = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31809u.f31873b.a(this.f31807s, this.f31808t);
        } catch (Throwable th) {
            Log.w("LogExecutor", "init err: ".concat(th.getClass().getSimpleName()));
        }
    }
}
