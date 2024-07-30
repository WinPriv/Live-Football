package z1;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36889s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Notification f36890t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f36891u;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f36891u = systemForegroundService;
        this.f36889s = i10;
        this.f36890t = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36891u.f2680w.notify(this.f36889s, this.f36890t);
    }
}
