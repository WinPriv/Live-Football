package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d0.a;
import g0.a;

/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public final class a implements h0.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f762a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f763b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f764c;

    /* renamed from: d, reason: collision with root package name */
    public char f765d;
    public char f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f768h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f769i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f770j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f771k;

    /* renamed from: e, reason: collision with root package name */
    public int f766e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f767g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f772l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f773m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f774n = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f775p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f769i = context;
        this.f762a = charSequence;
    }

    @Override // h0.b
    public final h0.b a(n0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b
    public final n0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f768h;
        if (drawable != null) {
            if (this.f774n || this.o) {
                this.f768h = drawable;
                Drawable mutate = drawable.mutate();
                this.f768h = mutate;
                if (this.f774n) {
                    a.b.h(mutate, this.f772l);
                }
                if (this.o) {
                    a.b.i(this.f768h, this.f773m);
                }
            }
        }
    }

    @Override // h0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // h0.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f767g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // h0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f770j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f768h;
    }

    @Override // h0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f772l;
    }

    @Override // h0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f773m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f764c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f766e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f765d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f762a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f763b;
        if (charSequence == null) {
            return this.f762a;
        }
        return charSequence;
    }

    @Override // h0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f771k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // h0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f775p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f775p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f775p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f775p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f775p = (z10 ? 1 : 0) | (this.f775p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f775p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f775p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f770j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f775p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f775p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f768h = drawable;
        c();
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f772l = colorStateList;
        this.f774n = true;
        c();
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f773m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f764c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f765d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f765d = c10;
        this.f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f762a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f763b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f771k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f775p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f775p = i11 | i10;
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f = Character.toLowerCase(c10);
        this.f767g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final h0.b setContentDescription(CharSequence charSequence) {
        this.f770j = charSequence;
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f765d = c10;
        this.f766e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f762a = this.f769i.getResources().getString(i10);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final h0.b setTooltipText(CharSequence charSequence) {
        this.f771k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Object obj = d0.a.f27248a;
        this.f768h = a.c.b(this.f769i, i10);
        c();
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f765d = c10;
        this.f766e = KeyEvent.normalizeMetaState(i10);
        this.f = Character.toLowerCase(c11);
        this.f767g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
