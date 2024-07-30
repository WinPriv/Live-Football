package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public final class r extends h implements SubMenu {
    public final j A;

    /* renamed from: z, reason: collision with root package name */
    public final h f887z;

    public r(Context context, h hVar, j jVar) {
        super(context);
        this.f887z = hVar;
        this.A = jVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean d(j jVar) {
        return this.f887z.d(jVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean e(h hVar, MenuItem menuItem) {
        if (!super.e(hVar, menuItem) && !this.f887z.e(hVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean f(j jVar) {
        return this.f887z.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.h
    public final String j() {
        int i10;
        j jVar = this.A;
        if (jVar != null) {
            i10 = jVar.f841a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return a3.l.i("android:menu:actionviewstates:", i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public final h k() {
        return this.f887z.k();
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean m() {
        return this.f887z.m();
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean n() {
        return this.f887z.n();
    }

    @Override // androidx.appcompat.view.menu.h
    public final boolean o() {
        return this.f887z.o();
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f887z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f887z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
