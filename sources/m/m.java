package m;

import android.app.PendingIntent;
import android.os.IBinder;

/* compiled from: CustomTabsSessionToken.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a.a f32633a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f32634b;

    public m(a.a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f32633a = aVar;
        this.f32634b = pendingIntent;
    }

    public final IBinder a() {
        a.a aVar = this.f32633a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        PendingIntent pendingIntent = mVar.f32634b;
        boolean z11 = true;
        PendingIntent pendingIntent2 = this.f32634b;
        if (pendingIntent2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (pendingIntent != null) {
            z11 = false;
        }
        if (z10 != z11) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return a().equals(mVar.a());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f32634b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return a().hashCode();
    }
}
