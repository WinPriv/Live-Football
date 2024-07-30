package b0;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class p extends s {

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2733e;

    @Override // b0.s
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // b0.s
    public final void b(u uVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(uVar.f2761b).setBigContentTitle(this.f2757b).bigText(this.f2733e);
        if (this.f2759d) {
            bigText.setSummaryText(this.f2758c);
        }
    }

    @Override // b0.s
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
