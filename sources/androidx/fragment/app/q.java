package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class q<E> extends n {

    /* renamed from: s, reason: collision with root package name */
    public final Activity f1864s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f1865t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f1866u;

    /* renamed from: v, reason: collision with root package name */
    public final t f1867v;

    public q(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f1867v = new t();
        this.f1864s = fragmentActivity;
        if (fragmentActivity != null) {
            this.f1865t = fragmentActivity;
            this.f1866u = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract FragmentActivity e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
