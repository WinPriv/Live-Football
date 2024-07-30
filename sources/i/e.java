package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.o;
import i.a;
import java.util.ArrayList;
import q.i;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28984a;

    /* renamed from: b, reason: collision with root package name */
    public final i.a f28985b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0394a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f28986a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f28987b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f28988c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final i<Menu, Menu> f28989d = new i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f28987b = context;
            this.f28986a = callback;
        }

        @Override // i.a.InterfaceC0394a
        public final boolean a(i.a aVar, MenuItem menuItem) {
            return this.f28986a.onActionItemClicked(e(aVar), new MenuItemWrapperICS(this.f28987b, (h0.b) menuItem));
        }

        @Override // i.a.InterfaceC0394a
        public final void b(i.a aVar) {
            this.f28986a.onDestroyActionMode(e(aVar));
        }

        @Override // i.a.InterfaceC0394a
        public final boolean c(i.a aVar, androidx.appcompat.view.menu.h hVar) {
            e e10 = e(aVar);
            i<Menu, Menu> iVar = this.f28989d;
            Menu orDefault = iVar.getOrDefault(hVar, null);
            if (orDefault == null) {
                orDefault = new o(this.f28987b, hVar);
                iVar.put(hVar, orDefault);
            }
            return this.f28986a.onPrepareActionMode(e10, orDefault);
        }

        @Override // i.a.InterfaceC0394a
        public final boolean d(i.a aVar, androidx.appcompat.view.menu.h hVar) {
            e e10 = e(aVar);
            i<Menu, Menu> iVar = this.f28989d;
            Menu orDefault = iVar.getOrDefault(hVar, null);
            if (orDefault == null) {
                orDefault = new o(this.f28987b, hVar);
                iVar.put(hVar, orDefault);
            }
            return this.f28986a.onCreateActionMode(e10, orDefault);
        }

        public final e e(i.a aVar) {
            ArrayList<e> arrayList = this.f28988c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar != null && eVar.f28985b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f28987b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, i.a aVar) {
        this.f28984a = context;
        this.f28985b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f28985b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f28985b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new o(this.f28984a, this.f28985b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f28985b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f28985b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f28985b.f28972s;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f28985b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f28985b.f28973t;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f28985b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f28985b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f28985b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f28985b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f28985b.f28972s = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f28985b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f28985b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f28985b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f28985b.n(i10);
    }
}
