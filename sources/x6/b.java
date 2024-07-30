package x6;

import a3.l;
import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

/* compiled from: NavigationBarMenu.java */
/* loaded from: classes2.dex */
public final class b extends h {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final Class<?> f36484z;

    public b(Context context, Class<?> cls, int i10) {
        super(context);
        this.f36484z = cls;
        this.A = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public final j a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = size() + 1;
        int i13 = this.A;
        if (size <= i13) {
            w();
            j a10 = super.a(i10, i11, i12, charSequence);
            a10.f862x = (a10.f862x & (-5)) | 4;
            v();
            return a10;
        }
        String simpleName = this.f36484z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i13);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(l.p(sb2, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f36484z.getSimpleName().concat(" does not support submenus"));
    }
}
