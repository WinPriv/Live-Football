package r1;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f34813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34814b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f34815c;

    public d(int i10, int i11, Notification notification) {
        this.f34813a = i10;
        this.f34815c = notification;
        this.f34814b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f34813a != dVar.f34813a || this.f34814b != dVar.f34814b) {
            return false;
        }
        return this.f34815c.equals(dVar.f34815c);
    }

    public final int hashCode() {
        return this.f34815c.hashCode() + (((this.f34813a * 31) + this.f34814b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f34813a + ", mForegroundServiceType=" + this.f34814b + ", mNotification=" + this.f34815c + '}';
    }
}
