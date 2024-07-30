package b0;

import android.app.Application;
import b0.f;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Application f2703s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f.a f2704t;

    public d(Application application, f.a aVar) {
        this.f2703s = application;
        this.f2704t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2703s.unregisterActivityLifecycleCallbacks(this.f2704t);
    }
}
