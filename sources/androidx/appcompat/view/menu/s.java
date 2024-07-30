package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuWrapperICS.java */
/* loaded from: classes.dex */
public final class s extends o implements SubMenu {

    /* renamed from: e, reason: collision with root package name */
    public final h0.c f888e;

    public s(Context context, h0.c cVar) {
        super(context, cVar);
        this.f888e = cVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f888e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return c(this.f888e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        this.f888e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        this.f888e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f888e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f888e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f888e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f888e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f888e.setIcon(drawable);
        return this;
    }
}
