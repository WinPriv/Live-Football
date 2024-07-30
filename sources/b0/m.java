package b0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f2731e;
    public IconCompat f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2732g;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // b0.s
    public final void b(u uVar) {
        Bitmap a10;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(uVar.f2761b).setBigContentTitle(this.f2757b);
        IconCompat iconCompat = this.f2731e;
        Context context = uVar.f2760a;
        if (iconCompat != null) {
            if (i10 >= 31) {
                c.a(bigContentTitle, IconCompat.a.f(iconCompat, context));
            } else {
                int i11 = iconCompat.f1577a;
                if (i11 == -1) {
                    i11 = IconCompat.a.c(iconCompat.f1578b);
                }
                if (i11 == 1) {
                    IconCompat iconCompat2 = this.f2731e;
                    int i12 = iconCompat2.f1577a;
                    if (i12 == -1) {
                        Object obj = iconCompat2.f1578b;
                        if (obj instanceof Bitmap) {
                            a10 = (Bitmap) obj;
                        } else {
                            a10 = null;
                        }
                    } else if (i12 == 1) {
                        a10 = (Bitmap) iconCompat2.f1578b;
                    } else if (i12 == 5) {
                        a10 = IconCompat.a((Bitmap) iconCompat2.f1578b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(a10);
                }
            }
        }
        if (this.f2732g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                a.a(bigContentTitle, null);
            } else {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat3, context));
            }
        }
        if (this.f2759d) {
            a.b(bigContentTitle, this.f2758c);
        }
        if (i10 >= 31) {
            c.c(bigContentTitle, false);
            c.b(bigContentTitle, null);
        }
    }

    @Override // b0.s
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
