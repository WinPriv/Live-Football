package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.c0;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View G;
    public View H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean O;
    public m.a P;
    public ViewTreeObserver Q;
    public PopupWindow.OnDismissListener R;
    public boolean S;

    /* renamed from: t, reason: collision with root package name */
    public final Context f786t;

    /* renamed from: u, reason: collision with root package name */
    public final int f787u;

    /* renamed from: v, reason: collision with root package name */
    public final int f788v;

    /* renamed from: w, reason: collision with root package name */
    public final int f789w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f790x;
    public final Handler y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f791z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final a B = new a();
    public final b C = new b();
    public final c D = new c();
    public int E = 0;
    public int F = 0;
    public boolean N = false;

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d dVar = d.this;
            if (dVar.a()) {
                ArrayList arrayList = dVar.A;
                if (arrayList.size() > 0 && !((C0011d) arrayList.get(0)).f795a.Q) {
                    View view = dVar.H;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0011d) it.next()).f795a.show();
                        }
                        return;
                    }
                    dVar.dismiss();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements c0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.c0
        public final void c(h hVar, j jVar) {
            d dVar = d.this;
            C0011d c0011d = null;
            dVar.y.removeCallbacksAndMessages(null);
            ArrayList arrayList = dVar.A;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (hVar == ((C0011d) arrayList.get(i10)).f796b) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < arrayList.size()) {
                c0011d = (C0011d) arrayList.get(i11);
            }
            dVar.y.postAtTime(new e(this, c0011d, jVar, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.c0
        public final void f(h hVar, MenuItem menuItem) {
            d.this.y.removeCallbacksAndMessages(hVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0011d {

        /* renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f795a;

        /* renamed from: b, reason: collision with root package name */
        public final h f796b;

        /* renamed from: c, reason: collision with root package name */
        public final int f797c;

        public C0011d(MenuPopupWindow menuPopupWindow, h hVar, int i10) {
            this.f795a = menuPopupWindow;
            this.f796b = hVar;
            this.f797c = i10;
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f786t = context;
        this.G = view;
        this.f788v = i10;
        this.f789w = i11;
        this.f790x = z10;
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        this.I = c0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f787u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.y = new Handler();
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        ArrayList arrayList = this.A;
        if (arrayList.size() <= 0 || !((C0011d) arrayList.get(0)).f795a.a()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(h hVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (hVar == ((C0011d) arrayList.get(i11)).f796b) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((C0011d) arrayList.get(i12)).f796b.c(false);
        }
        C0011d c0011d = (C0011d) arrayList.remove(i11);
        c0011d.f796b.r(this);
        boolean z11 = this.S;
        MenuPopupWindow menuPopupWindow = c0011d.f795a;
        if (z11) {
            MenuPopupWindow.a.b(menuPopupWindow.R, null);
            menuPopupWindow.R.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.I = ((C0011d) arrayList.get(size2 - 1)).f797c;
        } else {
            View view = this.G;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            if (c0.e.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.I = i10;
        }
        if (size2 == 0) {
            dismiss();
            m.a aVar = this.P;
            if (aVar != null) {
                aVar.b(hVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.Q;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.Q.removeGlobalOnLayoutListener(this.B);
                }
                this.Q = null;
            }
            this.H.removeOnAttachStateChangeListener(this.C);
            this.R.onDismiss();
            return;
        }
        if (z10) {
            ((C0011d) arrayList.get(0)).f796b.c(false);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z10) {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0011d) it.next()).f795a.f1126u.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void dismiss() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size > 0) {
            C0011d[] c0011dArr = (C0011d[]) arrayList.toArray(new C0011d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    C0011d c0011d = c0011dArr[size];
                    if (c0011d.f795a.a()) {
                        c0011d.f795a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(m.a aVar) {
        this.P = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public final ListView i() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0011d) arrayList.get(arrayList.size() - 1)).f795a.f1126u;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(r rVar) {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            C0011d c0011d = (C0011d) it.next();
            if (rVar == c0011d.f796b) {
                c0011d.f795a.f1126u.requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            m(rVar);
            m.a aVar = this.P;
            if (aVar != null) {
                aVar.c(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void m(h hVar) {
        hVar.b(this, this.f786t);
        if (a()) {
            w(hVar);
        } else {
            this.f791z.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void o(View view) {
        if (this.G != view) {
            this.G = view;
            int i10 = this.E;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            this.F = Gravity.getAbsoluteGravity(i10, c0.e.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0011d c0011d;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                c0011d = (C0011d) arrayList.get(i10);
                if (!c0011d.f795a.a()) {
                    break;
                } else {
                    i10++;
                }
            } else {
                c0011d = null;
                break;
            }
        }
        if (c0011d != null) {
            c0011d.f796b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void p(boolean z10) {
        this.N = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void q(int i10) {
        if (this.E != i10) {
            this.E = i10;
            View view = this.G;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            this.F = Gravity.getAbsoluteGravity(i10, c0.e.d(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void r(int i10) {
        this.J = true;
        this.L = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.R = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void show() {
        boolean z10;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f791z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((h) it.next());
        }
        arrayList.clear();
        View view = this.G;
        this.H = view;
        if (view != null) {
            if (this.Q == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Q = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.B);
            }
            this.H.addOnAttachStateChangeListener(this.C);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void t(boolean z10) {
        this.O = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void u(int i10) {
        this.K = true;
        this.M = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(androidx.appcompat.view.menu.h r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.w(androidx.appcompat.view.menu.h):void");
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            d dVar = d.this;
            ViewTreeObserver viewTreeObserver = dVar.Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    dVar.Q = view.getViewTreeObserver();
                }
                dVar.Q.removeGlobalOnLayoutListener(dVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void h(Parcelable parcelable) {
    }
}
