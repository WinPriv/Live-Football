package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuPopupWindow;
import com.hamkho.livefoot.R;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final MenuPopupWindow A;
    public PopupWindow.OnDismissListener D;
    public View E;
    public View F;
    public m.a G;
    public ViewTreeObserver H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean M;

    /* renamed from: t, reason: collision with root package name */
    public final Context f879t;

    /* renamed from: u, reason: collision with root package name */
    public final h f880u;

    /* renamed from: v, reason: collision with root package name */
    public final g f881v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f882w;

    /* renamed from: x, reason: collision with root package name */
    public final int f883x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f884z;
    public final a B = new a();
    public final b C = new b();
    public int L = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            q qVar = q.this;
            if (qVar.a() && !qVar.A.Q) {
                View view = qVar.F;
                if (view != null && view.isShown()) {
                    qVar.A.show();
                } else {
                    qVar.dismiss();
                }
            }
        }
    }

    public q(int i10, int i11, Context context, View view, h hVar, boolean z10) {
        this.f879t = context;
        this.f880u = hVar;
        this.f882w = z10;
        this.f881v = new g(hVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.y = i10;
        this.f884z = i11;
        Resources resources = context.getResources();
        this.f883x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.E = view;
        this.A = new MenuPopupWindow(context, i10, i11);
        hVar.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        if (!this.I && this.A.a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(h hVar, boolean z10) {
        if (hVar != this.f880u) {
            return;
        }
        dismiss();
        m.a aVar = this.G;
        if (aVar != null) {
            aVar.b(hVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z10) {
        this.J = false;
        g gVar = this.f881v;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void dismiss() {
        if (a()) {
            this.A.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(m.a aVar) {
        this.G = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public final ListView i() {
        return this.A.f1126u;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(androidx.appcompat.view.menu.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r9.f879t
            android.view.View r6 = r9.F
            boolean r8 = r9.f882w
            int r3 = r9.y
            int r4 = r9.f884z
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.m$a r2 = r9.G
            r0.f873i = r2
            androidx.appcompat.view.menu.k r3 = r0.f874j
            if (r3 == 0) goto L23
            r3.e(r2)
        L23:
            boolean r2 = androidx.appcompat.view.menu.k.v(r10)
            r0.f872h = r2
            androidx.appcompat.view.menu.k r3 = r0.f874j
            if (r3 == 0) goto L30
            r3.p(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.D
            r0.f875k = r2
            r2 = 0
            r9.D = r2
            androidx.appcompat.view.menu.h r2 = r9.f880u
            r2.c(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.A
            int r3 = r2.f1129x
            int r2 = r2.l()
            int r4 = r9.L
            android.view.View r5 = r9.E
            java.util.WeakHashMap<android.view.View, n0.l0> r6 = n0.c0.f33054a
            int r5 = n0.c0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.E
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.m$a r0 = r9.G
            if (r0 == 0) goto L79
            r0.c(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.q.j(androidx.appcompat.view.menu.r):boolean");
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void o(View view) {
        this.E = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I = true;
        this.f880u.c(true);
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.H = this.F.getViewTreeObserver();
            }
            this.H.removeGlobalOnLayoutListener(this.B);
            this.H = null;
        }
        this.F.removeOnAttachStateChangeListener(this.C);
        PopupWindow.OnDismissListener onDismissListener = this.D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f881v.f812u = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void q(int i10) {
        this.L = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void r(int i10) {
        this.A.f1129x = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void show() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!a()) {
            if (!this.I && (view = this.E) != null) {
                this.F = view;
                MenuPopupWindow menuPopupWindow = this.A;
                menuPopupWindow.R.setOnDismissListener(this);
                menuPopupWindow.H = this;
                menuPopupWindow.Q = true;
                androidx.appcompat.widget.j jVar = menuPopupWindow.R;
                jVar.setFocusable(true);
                View view2 = this.F;
                if (this.H == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.H = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.B);
                }
                view2.addOnAttachStateChangeListener(this.C);
                menuPopupWindow.G = view2;
                menuPopupWindow.D = this.L;
                boolean z12 = this.J;
                Context context = this.f879t;
                g gVar = this.f881v;
                if (!z12) {
                    this.K = k.n(gVar, context, this.f883x);
                    this.J = true;
                }
                menuPopupWindow.o(this.K);
                jVar.setInputMethodMode(2);
                Rect rect2 = this.f865s;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                menuPopupWindow.P = rect;
                menuPopupWindow.show();
                DropDownListView dropDownListView = menuPopupWindow.f1126u;
                dropDownListView.setOnKeyListener(this);
                if (this.M) {
                    h hVar = this.f880u;
                    if (hVar.f827m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(hVar.f827m);
                        }
                        frameLayout.setEnabled(false);
                        dropDownListView.addHeaderView(frameLayout, null, false);
                    }
                }
                menuPopupWindow.m(gVar);
                menuPopupWindow.show();
            } else {
                z11 = false;
            }
        }
        if (z11) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void t(boolean z10) {
        this.M = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void u(int i10) {
        this.A.h(i10);
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            q qVar = q.this;
            ViewTreeObserver viewTreeObserver = qVar.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    qVar.H = view.getViewTreeObserver();
                }
                qVar.H.removeGlobalOnLayoutListener(qVar.B);
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

    @Override // androidx.appcompat.view.menu.k
    public final void m(h hVar) {
    }
}
