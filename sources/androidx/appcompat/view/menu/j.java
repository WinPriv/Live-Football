package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import g0.a;
import java.util.ArrayList;
import n0.b;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class j implements h0.b {
    public n0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f844d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f845e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f846g;

    /* renamed from: h, reason: collision with root package name */
    public char f847h;

    /* renamed from: j, reason: collision with root package name */
    public char f849j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f851l;

    /* renamed from: n, reason: collision with root package name */
    public final h f853n;
    public r o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f854p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f855q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f856r;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public View f863z;

    /* renamed from: i, reason: collision with root package name */
    public int f848i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f850k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f852m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f857s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f858t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f859u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f860v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f861w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f862x = 16;
    public boolean C = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public j(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f853n = hVar;
        this.f841a = i11;
        this.f842b = i10;
        this.f843c = i12;
        this.f844d = i13;
        this.f845e = charSequence;
        this.y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // h0.b
    public final h0.b a(n0.b bVar) {
        n0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f33040a = null;
        }
        this.f863z = null;
        this.A = bVar;
        this.f853n.p(true);
        n0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // h0.b
    public final n0.b b() {
        return this.A;
    }

    @Override // h0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f863z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f853n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f861w && (this.f859u || this.f860v)) {
            drawable = drawable.mutate();
            if (this.f859u) {
                a.b.h(drawable, this.f857s);
            }
            if (this.f860v) {
                a.b.i(drawable, this.f858t);
            }
            this.f861w = false;
        }
        return drawable;
    }

    public final boolean e() {
        n0.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f863z == null && (bVar = this.A) != null) {
            this.f863z = bVar.d(this);
        }
        if (this.f863z == null) {
            return false;
        }
        return true;
    }

    @Override // h0.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f853n.f(this);
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f862x |= 32;
        } else {
            this.f862x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // h0.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f863z;
        if (view != null) {
            return view;
        }
        n0.b bVar = this.A;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.f863z = d10;
            return d10;
        }
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f850k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f849j;
    }

    @Override // h0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f855q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f842b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f851l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f852m;
        if (i10 != 0) {
            Drawable a10 = g.a.a(this.f853n.f816a, i10);
            this.f852m = 0;
            this.f851l = a10;
            return d(a10);
        }
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f857s;
    }

    @Override // h0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f858t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f846g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f841a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f848i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f847h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f843c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f845e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            return this.f845e;
        }
        return charSequence;
    }

    @Override // h0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f856r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    @Override // h0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f862x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f862x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f862x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        n0.b bVar = this.A;
        if (bVar != null && bVar.g()) {
            if ((this.f862x & 8) == 0 && this.A.b()) {
                return true;
            }
            return false;
        }
        if ((this.f862x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f863z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f841a) > 0) {
            view.setId(i10);
        }
        h hVar = this.f853n;
        hVar.f825k = true;
        hVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f849j == c10) {
            return this;
        }
        this.f849j = Character.toLowerCase(c10);
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f862x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f862x = i11;
        if (i10 != i11) {
            this.f853n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f862x;
        int i12 = i11 & 4;
        h hVar = this.f853n;
        int i13 = 2;
        if (i12 != 0) {
            hVar.getClass();
            ArrayList<j> arrayList = hVar.f;
            int size = arrayList.size();
            hVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                j jVar = arrayList.get(i14);
                if (jVar.f842b == this.f842b) {
                    boolean z12 = true;
                    if ((jVar.f862x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && jVar.isCheckable()) {
                        if (jVar != this) {
                            z12 = false;
                        }
                        int i15 = jVar.f862x;
                        int i16 = i15 & (-3);
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        jVar.f862x = i17;
                        if (i15 != i17) {
                            jVar.f853n.p(false);
                        }
                    }
                }
            }
            hVar.v();
        } else {
            int i18 = i11 & (-3);
            if (!z10) {
                i13 = 0;
            }
            int i19 = i13 | i18;
            this.f862x = i19;
            if (i11 != i19) {
                hVar.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f862x |= 16;
        } else {
            this.f862x &= -17;
        }
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f852m = 0;
        this.f851l = drawable;
        this.f861w = true;
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f857s = colorStateList;
        this.f859u = true;
        this.f861w = true;
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f858t = mode;
        this.f860v = true;
        this.f861w = true;
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f846g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f847h == c10) {
            return this;
        }
        this.f847h = c10;
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f854p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f847h = c10;
        this.f849j = Character.toLowerCase(c11);
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i10;
        h hVar = this.f853n;
        hVar.f825k = true;
        hVar.p(true);
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f845e = charSequence;
        this.f853n.p(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f862x;
        int i12 = i11 & (-9);
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f862x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            h hVar = this.f853n;
            hVar.f822h = true;
            hVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f845e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public final h0.b setContentDescription(CharSequence charSequence) {
        this.f855q = charSequence;
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final h0.b setTooltipText(CharSequence charSequence) {
        this.f856r = charSequence;
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f849j == c10 && this.f850k == i10) {
            return this;
        }
        this.f849j = Character.toLowerCase(c10);
        this.f850k = KeyEvent.normalizeMetaState(i10);
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f847h == c10 && this.f848i == i10) {
            return this;
        }
        this.f847h = c10;
        this.f848i = KeyEvent.normalizeMetaState(i10);
        this.f853n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f847h = c10;
        this.f848i = KeyEvent.normalizeMetaState(i10);
        this.f849j = Character.toLowerCase(c11);
        this.f850k = KeyEvent.normalizeMetaState(i11);
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f851l = null;
        this.f852m = i10;
        this.f861w = true;
        this.f853n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f853n.f816a.getString(i10));
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        h hVar = this.f853n;
        Context context = hVar.f816a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f863z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f841a) > 0) {
            inflate.setId(i11);
        }
        hVar.f825k = true;
        hVar.p(true);
        return this;
    }
}
