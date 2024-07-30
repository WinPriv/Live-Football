package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
public class o extends c implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final h0.a f878d;

    public o(Context context, h0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f878d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f878d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f878d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f878d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        q.i<h0.b, MenuItem> iVar = this.f784b;
        if (iVar != null) {
            iVar.clear();
        }
        q.i<h0.c, SubMenu> iVar2 = this.f785c;
        if (iVar2 != null) {
            iVar2.clear();
        }
        this.f878d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f878d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return c(this.f878d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return c(this.f878d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f878d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f878d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f878d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f878d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (this.f784b != null) {
            int i11 = 0;
            while (true) {
                q.i<h0.b, MenuItem> iVar = this.f784b;
                if (i11 >= iVar.f34547u) {
                    break;
                }
                if (iVar.h(i11).getGroupId() == i10) {
                    this.f784b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f878d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (this.f784b != null) {
            int i11 = 0;
            while (true) {
                q.i<h0.b, MenuItem> iVar = this.f784b;
                if (i11 >= iVar.f34547u) {
                    break;
                }
                if (iVar.h(i11).getItemId() == i10) {
                    this.f784b.j(i11);
                    break;
                }
                i11++;
            }
        }
        this.f878d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f878d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f878d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f878d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f878d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f878d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return c(this.f878d.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return d(this.f878d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f878d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f878d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f878d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f878d.addSubMenu(i10, i11, i12, i13));
    }
}
