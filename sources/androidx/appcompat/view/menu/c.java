package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f783a;

    /* renamed from: b, reason: collision with root package name */
    public q.i<h0.b, MenuItem> f784b;

    /* renamed from: c, reason: collision with root package name */
    public q.i<h0.c, SubMenu> f785c;

    public c(Context context) {
        this.f783a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof h0.b) {
            h0.b bVar = (h0.b) menuItem;
            if (this.f784b == null) {
                this.f784b = new q.i<>();
            }
            MenuItem orDefault = this.f784b.getOrDefault(bVar, null);
            if (orDefault == null) {
                MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f783a, bVar);
                this.f784b.put(bVar, menuItemWrapperICS);
                return menuItemWrapperICS;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof h0.c) {
            h0.c cVar = (h0.c) subMenu;
            if (this.f785c == null) {
                this.f785c = new q.i<>();
            }
            SubMenu orDefault = this.f785c.getOrDefault(cVar, null);
            if (orDefault == null) {
                s sVar = new s(this.f783a, cVar);
                this.f785c.put(cVar, sVar);
                return sVar;
            }
            return orDefault;
        }
        return subMenu;
    }
}
