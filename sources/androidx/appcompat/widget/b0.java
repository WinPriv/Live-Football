package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.hamkho.livefoot.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class b0 implements androidx.appcompat.view.menu.p {
    public static final Method S;
    public static final Method T;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public final int E;
    public d F;
    public View G;
    public AdapterView.OnItemClickListener H;
    public AdapterView.OnItemSelectedListener I;
    public final g J;
    public final f K;
    public final e L;
    public final c M;
    public final Handler N;
    public final Rect O;
    public Rect P;
    public boolean Q;
    public final j R;

    /* renamed from: s, reason: collision with root package name */
    public final Context f1124s;

    /* renamed from: t, reason: collision with root package name */
    public ListAdapter f1125t;

    /* renamed from: u, reason: collision with root package name */
    public DropDownListView f1126u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1127v;

    /* renamed from: w, reason: collision with root package name */
    public int f1128w;

    /* renamed from: x, reason: collision with root package name */
    public int f1129x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1130z;

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = b0.this.f1126u;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            b0 b0Var = b0.this;
            if (b0Var.a()) {
                b0Var.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            b0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            j jVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            b0 b0Var = b0.this;
            if (action == 0 && (jVar = b0Var.R) != null && jVar.isShowing() && x10 >= 0) {
                j jVar2 = b0Var.R;
                if (x10 < jVar2.getWidth() && y >= 0 && y < jVar2.getHeight()) {
                    b0Var.N.postDelayed(b0Var.J, 250L);
                    return false;
                }
            }
            if (action == 1) {
                b0Var.N.removeCallbacks(b0Var.J);
                return false;
            }
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b0 b0Var = b0.this;
            DropDownListView dropDownListView = b0Var.f1126u;
            if (dropDownListView != null) {
                WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                if (c0.g.b(dropDownListView) && b0Var.f1126u.getCount() > b0Var.f1126u.getChildCount() && b0Var.f1126u.getChildCount() <= b0Var.E) {
                    b0Var.R.setInputMethodMode(2);
                    b0Var.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                S = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                T = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public b0(Context context) {
        this(context, null, R.attr.listPopupWindowStyle, 0);
    }

    @Override // androidx.appcompat.view.menu.p
    public final boolean a() {
        return this.R.isShowing();
    }

    public final int b() {
        return this.f1129x;
    }

    public final void d(int i10) {
        this.f1129x = i10;
    }

    @Override // androidx.appcompat.view.menu.p
    public final void dismiss() {
        j jVar = this.R;
        jVar.dismiss();
        jVar.setContentView(null);
        this.f1126u = null;
        this.N.removeCallbacks(this.J);
    }

    public final Drawable getBackground() {
        return this.R.getBackground();
    }

    public final void h(int i10) {
        this.y = i10;
        this.A = true;
    }

    @Override // androidx.appcompat.view.menu.p
    public final ListView i() {
        return this.f1126u;
    }

    public final int l() {
        if (!this.A) {
            return 0;
        }
        return this.y;
    }

    public void m(ListAdapter listAdapter) {
        d dVar = this.F;
        if (dVar == null) {
            this.F = new d();
        } else {
            ListAdapter listAdapter2 = this.f1125t;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1125t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.F);
        }
        DropDownListView dropDownListView = this.f1126u;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f1125t);
        }
    }

    public DropDownListView n(Context context, boolean z10) {
        return new DropDownListView(context, z10);
    }

    public final void o(int i10) {
        Drawable background = this.R.getBackground();
        if (background != null) {
            Rect rect = this.O;
            background.getPadding(rect);
            this.f1128w = rect.left + rect.right + i10;
            return;
        }
        this.f1128w = i10;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.R.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.p
    public final void show() {
        int i10;
        boolean z10;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        DropDownListView dropDownListView;
        int i13;
        int i14;
        DropDownListView dropDownListView2 = this.f1126u;
        j jVar = this.R;
        Context context = this.f1124s;
        if (dropDownListView2 == null) {
            DropDownListView n10 = n(context, !this.Q);
            this.f1126u = n10;
            n10.setAdapter(this.f1125t);
            this.f1126u.setOnItemClickListener(this.H);
            this.f1126u.setFocusable(true);
            this.f1126u.setFocusableInTouchMode(true);
            this.f1126u.setOnItemSelectedListener(new a0(this));
            this.f1126u.setOnScrollListener(this.L);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.I;
            if (onItemSelectedListener != null) {
                this.f1126u.setOnItemSelectedListener(onItemSelectedListener);
            }
            jVar.setContentView(this.f1126u);
        }
        Drawable background = jVar.getBackground();
        int i15 = 0;
        Rect rect = this.O;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.A) {
                this.y = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (jVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int a10 = a.a(jVar, this.G, this.y, z10);
        int i17 = this.f1127v;
        if (i17 == -1) {
            i12 = a10 + i10;
        } else {
            int i18 = this.f1128w;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.f1126u.a(makeMeasureSpec, a10 + 0);
            if (a11 > 0) {
                i11 = this.f1126u.getPaddingBottom() + this.f1126u.getPaddingTop() + i10 + 0;
            } else {
                i11 = 0;
            }
            i12 = a11 + i11;
        }
        if (jVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        r0.i.d(jVar, this.f1130z);
        if (jVar.isShowing()) {
            View view = this.G;
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            if (!c0.g.b(view)) {
                return;
            }
            int i19 = this.f1128w;
            if (i19 == -1) {
                i19 = -1;
            } else if (i19 == -2) {
                i19 = this.G.getWidth();
            }
            if (i17 == -1) {
                if (z11) {
                    i17 = i12;
                } else {
                    i17 = -1;
                }
                if (z11) {
                    if (this.f1128w == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    jVar.setWidth(i14);
                    jVar.setHeight(0);
                } else {
                    if (this.f1128w == -1) {
                        i15 = -1;
                    }
                    jVar.setWidth(i15);
                    jVar.setHeight(-1);
                }
            } else if (i17 == -2) {
                i17 = i12;
            }
            jVar.setOutsideTouchable(true);
            View view2 = this.G;
            int i20 = this.f1129x;
            int i21 = this.y;
            if (i19 < 0) {
                i19 = -1;
            }
            if (i17 < 0) {
                i13 = -1;
            } else {
                i13 = i17;
            }
            jVar.update(view2, i20, i21, i19, i13);
            return;
        }
        int i22 = this.f1128w;
        if (i22 == -1) {
            i22 = -1;
        } else if (i22 == -2) {
            i22 = this.G.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i12;
        }
        jVar.setWidth(i22);
        jVar.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S;
            if (method != null) {
                try {
                    method.invoke(jVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(jVar, true);
        }
        jVar.setOutsideTouchable(true);
        jVar.setTouchInterceptor(this.K);
        if (this.C) {
            r0.i.c(jVar, this.B);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = T;
            if (method2 != null) {
                try {
                    method2.invoke(jVar, this.P);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(jVar, this.P);
        }
        r0.h.a(jVar, this.G, this.f1129x, this.y, this.D);
        this.f1126u.setSelection(-1);
        if ((!this.Q || this.f1126u.isInTouchMode()) && (dropDownListView = this.f1126u) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (!this.Q) {
            this.N.post(this.M);
        }
    }

    public b0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1127v = -2;
        this.f1128w = -2;
        this.f1130z = 1002;
        this.D = 0;
        this.E = Integer.MAX_VALUE;
        this.J = new g();
        this.K = new f();
        this.L = new e();
        this.M = new c();
        this.O = new Rect();
        this.f1124s = context;
        this.N = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.Q, i10, i11);
        this.f1129x = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A = true;
        }
        obtainStyledAttributes.recycle();
        j jVar = new j(context, attributeSet, i10, i11);
        this.R = jVar;
        jVar.setInputMethodMode(1);
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                b0 b0Var = b0.this;
                if (b0Var.R.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && b0Var.R.getContentView() != null) {
                    Handler handler = b0Var.N;
                    g gVar = b0Var.J;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
