package b0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f2721a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f2722b;

    /* renamed from: c, reason: collision with root package name */
    public final y[] f2723c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2724d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2725e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2726g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final int f2727h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f2728i;

    /* renamed from: j, reason: collision with root package name */
    public final PendingIntent f2729j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2730k;

    public l(int i10, String str, PendingIntent pendingIntent) {
        IconCompat b10;
        if (i10 == 0) {
            b10 = null;
        } else {
            b10 = IconCompat.b("", i10);
        }
        Bundle bundle = new Bundle();
        this.f2725e = true;
        this.f2722b = b10;
        if (b10 != null) {
            int i11 = b10.f1577a;
            if ((i11 == -1 ? IconCompat.a.c(b10.f1578b) : i11) == 2) {
                this.f2727h = b10.c();
            }
        }
        this.f2728i = q.b(str);
        this.f2729j = pendingIntent;
        this.f2721a = bundle;
        this.f2723c = null;
        this.f2724d = true;
        this.f = 0;
        this.f2725e = true;
        this.f2726g = false;
        this.f2730k = false;
    }
}
