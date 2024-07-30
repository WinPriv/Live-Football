package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public final class t extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f691a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f692b;

    /* renamed from: c, reason: collision with root package name */
    public final e f693c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f694d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f695e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<a.b> f696g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public final a f697h = new a();

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.h hVar;
            t tVar = t.this;
            Window.Callback callback = tVar.f692b;
            Menu p10 = tVar.p();
            if (p10 instanceof androidx.appcompat.view.menu.h) {
                hVar = (androidx.appcompat.view.menu.h) p10;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar.w();
            }
            try {
                p10.clear();
                if (!callback.onCreatePanelMenu(0, p10) || !callback.onPreparePanel(0, null, p10)) {
                    p10.clear();
                }
            } finally {
                if (hVar != null) {
                    hVar.v();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: s, reason: collision with root package name */
        public boolean f700s;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (this.f700s) {
                return;
            }
            this.f700s = true;
            t tVar = t.this;
            tVar.f691a.h();
            tVar.f692b.onPanelClosed(108, hVar);
            this.f700s = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            t.this.f692b.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements h.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            t tVar = t.this;
            boolean a10 = tVar.f691a.a();
            Window.Callback callback = tVar.f692b;
            if (a10) {
                callback.onPanelClosed(108, hVar);
            } else if (callback.onPreparePanel(0, null, hVar)) {
                callback.onMenuOpened(108, hVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class e implements AppCompatDelegateImpl.c {
        public e() {
        }
    }

    public t(Toolbar toolbar, CharSequence charSequence, AppCompatDelegateImpl.h hVar) {
        b bVar = new b();
        toolbar.getClass();
        p0 p0Var = new p0(toolbar, false);
        this.f691a = p0Var;
        hVar.getClass();
        this.f692b = hVar;
        p0Var.f1240l = hVar;
        toolbar.setOnMenuItemClickListener(bVar);
        p0Var.setWindowTitle(charSequence);
        this.f693c = new e();
    }

    @Override // androidx.appcompat.app.a
    public final boolean a() {
        return this.f691a.f();
    }

    @Override // androidx.appcompat.app.a
    public final boolean b() {
        p0 p0Var = this.f691a;
        if (p0Var.j()) {
            p0Var.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z10) {
        if (z10 == this.f) {
            return;
        }
        this.f = z10;
        ArrayList<a.b> arrayList = this.f696g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    @Override // androidx.appcompat.app.a
    public final int d() {
        return this.f691a.f1231b;
    }

    @Override // androidx.appcompat.app.a
    public final Context e() {
        return this.f691a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public final boolean f() {
        p0 p0Var = this.f691a;
        Toolbar toolbar = p0Var.f1230a;
        a aVar = this.f697h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = p0Var.f1230a;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.m(toolbar2, aVar);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void h() {
        this.f691a.f1230a.removeCallbacks(this.f697h);
    }

    @Override // androidx.appcompat.app.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        int i11;
        Menu p10 = p();
        if (p10 == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        p10.setQwertyMode(z10);
        return p10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final boolean k() {
        return this.f691a.g();
    }

    @Override // androidx.appcompat.app.a
    public final void n(CharSequence charSequence) {
        this.f691a.setWindowTitle(charSequence);
    }

    public final Menu p() {
        boolean z10 = this.f695e;
        p0 p0Var = this.f691a;
        if (!z10) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = p0Var.f1230a;
            toolbar.f1094k0 = cVar;
            toolbar.f1095l0 = dVar;
            ActionMenuView actionMenuView = toolbar.f1101s;
            if (actionMenuView != null) {
                actionMenuView.M = cVar;
                actionMenuView.N = dVar;
            }
            this.f695e = true;
        }
        return p0Var.f1230a.getMenu();
    }

    @Override // androidx.appcompat.app.a
    public final void g() {
    }

    @Override // androidx.appcompat.app.a
    public final void l(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public final void m(boolean z10) {
    }
}
