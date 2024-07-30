package b0;

import android.os.Bundle;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public q f2756a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2757b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2758c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2759d = false;

    public void a(Bundle bundle) {
        if (this.f2759d) {
            bundle.putCharSequence("android.summaryText", this.f2758c);
        }
        CharSequence charSequence = this.f2757b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(u uVar);

    public abstract String c();
}
