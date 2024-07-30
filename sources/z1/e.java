package z1;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36892s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f36893t;

    public e(SystemForegroundService systemForegroundService, int i10) {
        this.f36893t = systemForegroundService;
        this.f36892s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36893t.f2680w.cancel(this.f36892s);
    }
}
