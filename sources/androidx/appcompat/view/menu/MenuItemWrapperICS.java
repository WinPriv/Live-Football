package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import java.lang.reflect.Method;
import n0.b;

/* loaded from: classes.dex */
public final class MenuItemWrapperICS extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final h0.b f752d;

    /* renamed from: e, reason: collision with root package name */
    public Method f753e;

    /* loaded from: classes.dex */
    public static class CollapsibleActionViewWrapper extends FrameLayout implements i.b {

        /* renamed from: s, reason: collision with root package name */
        public final CollapsibleActionView f754s;

        /* JADX WARN: Multi-variable type inference failed */
        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f754s = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // i.b
        public final void onActionViewCollapsed() {
            this.f754s.onActionViewCollapsed();
        }

        @Override // i.b
        public final void onActionViewExpanded() {
            this.f754s.onActionViewExpanded();
        }
    }

    /* loaded from: classes.dex */
    public class a extends n0.b {

        /* renamed from: b, reason: collision with root package name */
        public final ActionProvider f755b;

        public a(ActionProvider actionProvider) {
            this.f755b = actionProvider;
        }

        @Override // n0.b
        public final boolean a() {
            return this.f755b.hasSubMenu();
        }

        @Override // n0.b
        public final View c() {
            return this.f755b.onCreateActionView();
        }

        @Override // n0.b
        public final boolean e() {
            return this.f755b.onPerformDefaultAction();
        }

        @Override // n0.b
        public final void f(r rVar) {
            this.f755b.onPrepareSubMenu(MenuItemWrapperICS.this.d(rVar));
        }
    }

    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        public b.a f757d;

        public b(MenuItemWrapperICS menuItemWrapperICS, ActionProvider actionProvider) {
            super(actionProvider);
        }

        @Override // n0.b
        public final boolean b() {
            return this.f755b.isVisible();
        }

        @Override // n0.b
        public final View d(MenuItem menuItem) {
            return this.f755b.onCreateActionView(menuItem);
        }

        @Override // n0.b
        public final boolean g() {
            return this.f755b.overridesItemVisibility();
        }

        @Override // n0.b
        public final void h(j.a aVar) {
            this.f757d = aVar;
            this.f755b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z10) {
            b.a aVar = this.f757d;
            if (aVar != null) {
                h hVar = j.this.f853n;
                hVar.f822h = true;
                hVar.p(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f758a;

        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f758a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f758a.onMenuItemActionCollapse(MenuItemWrapperICS.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f758a.onMenuItemActionExpand(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    /* loaded from: classes.dex */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f760a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f760a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f760a.onMenuItemClick(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, h0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f752d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f752d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f752d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        n0.b b10 = this.f752d.b();
        if (b10 instanceof a) {
            return ((a) b10).f755b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f752d.getActionView();
        if (actionView instanceof CollapsibleActionViewWrapper) {
            return (View) ((CollapsibleActionViewWrapper) actionView).f754s;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f752d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f752d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f752d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f752d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f752d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f752d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f752d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f752d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f752d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f752d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f752d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f752d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f752d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return d(this.f752d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f752d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f752d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f752d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f752d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f752d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f752d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f752d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f752d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f752d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        if (actionProvider == null) {
            bVar = null;
        }
        this.f752d.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f752d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f752d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f752d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f752d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f752d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f752d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f752d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f752d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f752d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f752d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f752d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        c cVar;
        if (onActionExpandListener != null) {
            cVar = new c(onActionExpandListener);
        } else {
            cVar = null;
        }
        this.f752d.setOnActionExpandListener(cVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        d dVar;
        if (onMenuItemClickListener != null) {
            dVar = new d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        this.f752d.setOnMenuItemClickListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f752d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        this.f752d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f752d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f752d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f752d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f752d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        return this.f752d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f752d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f752d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f752d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f752d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f752d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        h0.b bVar = this.f752d;
        bVar.setActionView(i10);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
