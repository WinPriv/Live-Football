package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import i.a;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public final class d extends a implements h.a {

    /* renamed from: u, reason: collision with root package name */
    public final Context f28979u;

    /* renamed from: v, reason: collision with root package name */
    public final ActionBarContextView f28980v;

    /* renamed from: w, reason: collision with root package name */
    public final a.InterfaceC0394a f28981w;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference<View> f28982x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.appcompat.view.menu.h f28983z;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0394a interfaceC0394a) {
        this.f28979u = context;
        this.f28980v = actionBarContextView;
        this.f28981w = interfaceC0394a;
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(actionBarContextView.getContext());
        hVar.f826l = 1;
        this.f28983z = hVar;
        hVar.f820e = this;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        return this.f28981w.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void b(androidx.appcompat.view.menu.h hVar) {
        i();
        this.f28980v.i();
    }

    @Override // i.a
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.f28981w.b(this);
    }

    @Override // i.a
    public final View d() {
        WeakReference<View> weakReference = this.f28982x;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final androidx.appcompat.view.menu.h e() {
        return this.f28983z;
    }

    @Override // i.a
    public final MenuInflater f() {
        return new f(this.f28980v.getContext());
    }

    @Override // i.a
    public final CharSequence g() {
        return this.f28980v.getSubtitle();
    }

    @Override // i.a
    public final CharSequence h() {
        return this.f28980v.getTitle();
    }

    @Override // i.a
    public final void i() {
        this.f28981w.c(this, this.f28983z);
    }

    @Override // i.a
    public final boolean j() {
        return this.f28980v.K;
    }

    @Override // i.a
    public final void k(View view) {
        WeakReference<View> weakReference;
        this.f28980v.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f28982x = weakReference;
    }

    @Override // i.a
    public final void l(int i10) {
        m(this.f28979u.getString(i10));
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f28980v.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i10) {
        o(this.f28979u.getString(i10));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f28980v.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z10) {
        this.f28973t = z10;
        this.f28980v.setTitleOptional(z10);
    }
}
