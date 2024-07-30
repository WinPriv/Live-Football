package b0;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<CharSequence> f2755e = new ArrayList<>();

    @Override // b0.s
    public final void b(u uVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(uVar.f2761b).setBigContentTitle(this.f2757b);
        if (this.f2759d) {
            bigContentTitle.setSummaryText(this.f2758c);
        }
        Iterator<CharSequence> it = this.f2755e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    @Override // b0.s
    public final String c() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }
}
