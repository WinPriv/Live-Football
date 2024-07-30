package z1;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36885s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Notification f36886t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f36887u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f36888v;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f36888v = systemForegroundService;
        this.f36885s = i10;
        this.f36886t = notification;
        this.f36887u = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        Notification notification = this.f36886t;
        int i11 = this.f36885s;
        SystemForegroundService systemForegroundService = this.f36888v;
        if (i10 >= 29) {
            systemForegroundService.startForeground(i11, notification, this.f36887u);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}
