package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.d;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.C0011d f798s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MenuItem f799t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f800u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d.c f801v;

    public e(d.c cVar, d.C0011d c0011d, j jVar, h hVar) {
        this.f801v = cVar;
        this.f798s = c0011d;
        this.f799t = jVar;
        this.f800u = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.C0011d c0011d = this.f798s;
        if (c0011d != null) {
            d.c cVar = this.f801v;
            d.this.S = true;
            c0011d.f796b.c(false);
            d.this.S = false;
        }
        MenuItem menuItem = this.f799t;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f800u.q(menuItem, null, 4);
        }
    }
}
