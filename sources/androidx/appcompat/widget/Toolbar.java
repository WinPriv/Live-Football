package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public View A;
    public Context B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public final int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public f0 L;
    public int M;
    public int N;
    public final int O;
    public CharSequence P;
    public CharSequence Q;
    public ColorStateList R;
    public ColorStateList S;
    public boolean T;
    public boolean U;
    public final ArrayList<View> V;
    public final ArrayList<View> W;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f1086c0;

    /* renamed from: d0, reason: collision with root package name */
    public final n0.j f1087d0;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList<MenuItem> f1088e0;

    /* renamed from: f0, reason: collision with root package name */
    public h f1089f0;

    /* renamed from: g0, reason: collision with root package name */
    public final a f1090g0;

    /* renamed from: h0, reason: collision with root package name */
    public p0 f1091h0;

    /* renamed from: i0, reason: collision with root package name */
    public ActionMenuPresenter f1092i0;

    /* renamed from: j0, reason: collision with root package name */
    public f f1093j0;

    /* renamed from: k0, reason: collision with root package name */
    public m.a f1094k0;

    /* renamed from: l0, reason: collision with root package name */
    public h.a f1095l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1096m0;

    /* renamed from: n0, reason: collision with root package name */
    public OnBackInvokedCallback f1097n0;

    /* renamed from: o0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1098o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1099p0;

    /* renamed from: q0, reason: collision with root package name */
    public final b f1100q0;

    /* renamed from: s, reason: collision with root package name */
    public ActionMenuView f1101s;

    /* renamed from: t, reason: collision with root package name */
    public AppCompatTextView f1102t;

    /* renamed from: u, reason: collision with root package name */
    public AppCompatTextView f1103u;

    /* renamed from: v, reason: collision with root package name */
    public AppCompatImageButton f1104v;

    /* renamed from: w, reason: collision with root package name */
    public AppCompatImageView f1105w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f1106x;
    public final CharSequence y;

    /* renamed from: z, reason: collision with root package name */
    public AppCompatImageButton f1107z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuPresenter actionMenuPresenter;
            ActionMenuView actionMenuView = Toolbar.this.f1101s;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.L) != null) {
                actionMenuPresenter.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements h.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            h.a aVar = Toolbar.this.f1095l0;
            if (aVar != null && aVar.a(hVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            boolean z10;
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.f1101s.L;
            if (actionMenuPresenter != null && actionMenuPresenter.m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Iterator<n0.m> it = toolbar.f1087d0.f33085b.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            h.a aVar = toolbar.f1095l0;
            if (aVar != null) {
                aVar.b(hVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.j jVar;
            f fVar = Toolbar.this.f1093j0;
            if (fVar == null) {
                jVar = null;
            } else {
                jVar = fVar.f1115t;
            }
            if (jVar != null) {
                jVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.l(runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0010a) {
            return new g((a.C0010a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return n0.g.b(marginLayoutParams) + n0.g.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (c0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1117b == 0 && r(childAt)) {
                    int i12 = gVar.f643a;
                    WeakHashMap<View, n0.l0> weakHashMap2 = n0.c0.f33054a;
                    int d10 = c0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1117b == 0 && r(childAt2)) {
                int i14 = gVar2.f643a;
                WeakHashMap<View, n0.l0> weakHashMap3 = n0.c0.f33054a;
                int d11 = c0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = new g();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = g(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f1117b = 1;
        if (z10 && this.A != null) {
            view.setLayoutParams(gVar);
            this.W.add(view);
        } else {
            addView(view, gVar);
        }
    }

    public final void c() {
        if (this.f1107z == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1107z = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1106x);
            this.f1107z.setContentDescription(this.y);
            g gVar = new g();
            gVar.f643a = (this.F & 112) | 8388611;
            gVar.f1117b = 2;
            this.f1107z.setLayoutParams(gVar);
            this.f1107z.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f1101s;
        if (actionMenuView.H == null) {
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) actionMenuView.getMenu();
            if (this.f1093j0 == null) {
                this.f1093j0 = new f();
            }
            this.f1101s.setExpandedActionViewsExclusive(true);
            hVar.b(this.f1093j0, this.B);
            s();
        }
    }

    public final void e() {
        if (this.f1101s == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1101s = actionMenuView;
            actionMenuView.setPopupTheme(this.C);
            this.f1101s.setOnMenuItemClickListener(this.f1090g0);
            ActionMenuView actionMenuView2 = this.f1101s;
            m.a aVar = this.f1094k0;
            c cVar = new c();
            actionMenuView2.M = aVar;
            actionMenuView2.N = cVar;
            g gVar = new g();
            gVar.f643a = (this.F & 112) | 8388613;
            this.f1101s.setLayoutParams(gVar);
            b(this.f1101s, false);
        }
    }

    public final void f() {
        if (this.f1104v == null) {
            this.f1104v = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f643a = (this.F & 112) | 8388611;
            this.f1104v.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1107z;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f1107z;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        f0 f0Var = this.L;
        if (f0Var != null) {
            if (f0Var.f1171g) {
                return f0Var.f1166a;
            }
            return f0Var.f1167b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.N;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        f0 f0Var = this.L;
        if (f0Var != null) {
            return f0Var.f1166a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        f0 f0Var = this.L;
        if (f0Var != null) {
            return f0Var.f1167b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        f0 f0Var = this.L;
        if (f0Var != null) {
            if (f0Var.f1171g) {
                return f0Var.f1167b;
            }
            return f0Var.f1166a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.M;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.h hVar;
        ActionMenuView actionMenuView = this.f1101s;
        if (actionMenuView != null && (hVar = actionMenuView.H) != null && hVar.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.N, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (c0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (c0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.M, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1105w;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1105w;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f1101s.getMenu();
    }

    public View getNavButtonView() {
        return this.f1104v;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1104v;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1104v;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1092i0;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f1101s.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.B;
    }

    public int getPopupTheme() {
        return this.C;
    }

    public CharSequence getSubtitle() {
        return this.Q;
    }

    public final TextView getSubtitleTextView() {
        return this.f1103u;
    }

    public CharSequence getTitle() {
        return this.P;
    }

    public int getTitleMarginBottom() {
        return this.K;
    }

    public int getTitleMarginEnd() {
        return this.I;
    }

    public int getTitleMarginStart() {
        return this.H;
    }

    public int getTitleMarginTop() {
        return this.J;
    }

    final TextView getTitleTextView() {
        return this.f1102t;
    }

    public w getWrapper() {
        if (this.f1091h0 == null) {
            this.f1091h0 = new p0(this, true);
        }
        return this.f1091h0;
    }

    public final int h(int i10, View view) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = gVar.f643a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.O & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.f1088e0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator<n0.m> it2 = this.f1087d0.f33085b.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1088e0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.W.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1100q0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.U = false;
        }
        if (!this.U) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.U = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.U = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0292 A[LOOP:0: B:40:0x0290->B:41:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ae A[LOOP:1: B:44:0x02ac->B:45:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031b A[LOOP:3: B:57:0x0319->B:58:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        ActionMenuView actionMenuView = this.f1101s;
        if (actionMenuView != null) {
            hVar = actionMenuView.H;
        } else {
            hVar = null;
        }
        int i10 = savedState.f1108u;
        if (i10 != 0 && this.f1093j0 != null && hVar != null && (findItem = hVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1109v) {
            b bVar = this.f1100q0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.L == null) {
            this.L = new f0();
        }
        f0 f0Var = this.L;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != f0Var.f1171g) {
            f0Var.f1171g = z10;
            if (f0Var.f1172h) {
                if (z10) {
                    int i11 = f0Var.f1169d;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = f0Var.f1170e;
                    }
                    f0Var.f1166a = i11;
                    int i12 = f0Var.f1168c;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = f0Var.f;
                    }
                    f0Var.f1167b = i12;
                    return;
                }
                int i13 = f0Var.f1168c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = f0Var.f1170e;
                }
                f0Var.f1166a = i13;
                int i14 = f0Var.f1169d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = f0Var.f;
                }
                f0Var.f1167b = i14;
                return;
            }
            f0Var.f1166a = f0Var.f1170e;
            f0Var.f1167b = f0Var.f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        androidx.appcompat.view.menu.j jVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f1093j0;
        if (fVar != null && (jVar = fVar.f1115t) != null) {
            savedState.f1108u = jVar.f841a;
        }
        ActionMenuView actionMenuView = this.f1101s;
        boolean z11 = false;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.L;
            if (actionMenuPresenter != null && actionMenuPresenter.m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        savedState.f1109v = z11;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = false;
        }
        if (!this.T) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.T = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r4.f1099p0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L54
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.e.a(r4)
            androidx.appcompat.widget.Toolbar$f r1 = r4.f1093j0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            androidx.appcompat.view.menu.j r1 = r1.f1115t
            if (r1 == 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 == 0) goto L28
            if (r0 == 0) goto L28
            java.util.WeakHashMap<android.view.View, n0.l0> r1 = n0.c0.f33054a
            boolean r1 = n0.c0.g.b(r4)
            if (r1 == 0) goto L28
            boolean r1 = r4.f1099p0
            if (r1 == 0) goto L28
            goto L29
        L28:
            r2 = r3
        L29:
            if (r2 == 0) goto L46
            android.window.OnBackInvokedDispatcher r1 = r4.f1098o0
            if (r1 != 0) goto L46
            android.window.OnBackInvokedCallback r1 = r4.f1097n0
            if (r1 != 0) goto L3e
            androidx.appcompat.widget.n0 r1 = new androidx.appcompat.widget.n0
            r1.<init>(r4, r3)
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.widget.Toolbar.e.b(r1)
            r4.f1097n0 = r1
        L3e:
            android.window.OnBackInvokedCallback r1 = r4.f1097n0
            androidx.appcompat.widget.Toolbar.e.c(r0, r1)
            r4.f1098o0 = r0
            goto L54
        L46:
            if (r2 != 0) goto L54
            android.window.OnBackInvokedDispatcher r0 = r4.f1098o0
            if (r0 == 0) goto L54
            android.window.OnBackInvokedCallback r1 = r4.f1097n0
            androidx.appcompat.widget.Toolbar.e.d(r0, r1)
            r0 = 0
            r4.f1098o0 = r0
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.s():void");
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1099p0 != z10) {
            this.f1099p0 = z10;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.a(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f1096m0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.N) {
            this.N = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.M) {
            this.M = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.a(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.a(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1104v.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f1089f0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f1101s.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.C != i10) {
            this.C = i10;
            if (i10 == 0) {
                this.B = getContext();
            } else {
                this.B = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.K = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.H = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.J = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0010a {

        /* renamed from: b, reason: collision with root package name */
        public int f1117b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1117b = 0;
        }

        public g() {
            this.f1117b = 0;
            this.f643a = 8388627;
        }

        public g(g gVar) {
            super((a.C0010a) gVar);
            this.f1117b = 0;
            this.f1117b = gVar.f1117b;
        }

        public g(a.C0010a c0010a) {
            super(c0010a);
            this.f1117b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1117b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1117b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.O = 8388627;
        this.V = new ArrayList<>();
        this.W = new ArrayList<>();
        this.f1086c0 = new int[2];
        this.f1087d0 = new n0.j(new androidx.activity.b(this, 1));
        this.f1088e0 = new ArrayList<>();
        this.f1090g0 = new a();
        this.f1100q0 = new b();
        Context context2 = getContext();
        int[] iArr = a0.a.Z;
        m0 m10 = m0.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        n0.c0.k(this, context, iArr, attributeSet, m10.f1206b, R.attr.toolbarStyle);
        this.D = m10.i(28, 0);
        this.E = m10.i(19, 0);
        TypedArray typedArray = m10.f1206b;
        this.O = typedArray.getInteger(0, 8388627);
        this.F = typedArray.getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.K = c10;
        this.J = c10;
        this.I = c10;
        this.H = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.H = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.I = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.J = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.K = c14;
        }
        this.G = m10.d(13, -1);
        int c15 = m10.c(9, Integer.MIN_VALUE);
        int c16 = m10.c(5, Integer.MIN_VALUE);
        int d10 = m10.d(7, 0);
        int d11 = m10.d(8, 0);
        if (this.L == null) {
            this.L = new f0();
        }
        f0 f0Var = this.L;
        f0Var.f1172h = false;
        if (d10 != Integer.MIN_VALUE) {
            f0Var.f1170e = d10;
            f0Var.f1166a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            f0Var.f = d11;
            f0Var.f1167b = d11;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            f0Var.a(c15, c16);
        }
        this.M = m10.c(10, Integer.MIN_VALUE);
        this.N = m10.c(6, Integer.MIN_VALUE);
        this.f1106x = m10.e(4);
        this.y = m10.k(3);
        CharSequence k10 = m10.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.B = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e10 = m10.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            k(m10.i(14, 0));
        }
        m10.n();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f1107z;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1107z.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f1107z;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f1106x);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1105w == null) {
                this.f1105w = new AppCompatImageView(getContext(), null);
            }
            if (!m(this.f1105w)) {
                b(this.f1105w, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1105w;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f1105w);
                this.W.remove(this.f1105w);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1105w;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1105w == null) {
            this.f1105w = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1105w;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.f1104v;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            q0.a(this.f1104v, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1104v)) {
                b(this.f1104v, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1104v;
            if (appCompatImageButton != null && m(appCompatImageButton)) {
                removeView(this.f1104v);
                this.W.remove(this.f1104v);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1104v;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1103u == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1103u = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1103u.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.E;
                if (i10 != 0) {
                    this.f1103u.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    this.f1103u.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1103u)) {
                b(this.f1103u, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1103u;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f1103u);
                this.W.remove(this.f1103u);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1103u;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.Q = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        AppCompatTextView appCompatTextView = this.f1103u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1102t == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1102t = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1102t.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.D;
                if (i10 != 0) {
                    this.f1102t.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    this.f1102t.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1102t)) {
                b(this.f1102t, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1102t;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f1102t);
                this.W.remove(this.f1102t);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1102t;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        AppCompatTextView appCompatTextView = this.f1102t;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public int f1108u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f1109v;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1108u = parcel.readInt();
            this.f1109v = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f1108u);
            parcel.writeInt(this.f1109v ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.m {

        /* renamed from: s, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f1114s;

        /* renamed from: t, reason: collision with root package name */
        public androidx.appcompat.view.menu.j f1115t;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public final void c(boolean z10) {
            if (this.f1115t != null) {
                androidx.appcompat.view.menu.h hVar = this.f1114s;
                boolean z11 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1114s.getItem(i10) == this.f1115t) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (!z11) {
                    f(this.f1115t);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean f(androidx.appcompat.view.menu.j jVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.A;
            if (callback instanceof i.b) {
                ((i.b) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.A);
            toolbar.removeView(toolbar.f1107z);
            toolbar.A = null;
            ArrayList<View> arrayList = toolbar.W;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f1115t = null;
                    toolbar.requestLayout();
                    jVar.C = false;
                    jVar.f853n.p(false);
                    toolbar.s();
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final void g(Context context, androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.h hVar2 = this.f1114s;
            if (hVar2 != null && (jVar = this.f1115t) != null) {
                hVar2.d(jVar);
            }
            this.f1114s = hVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean j(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public final Parcelable k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean l(androidx.appcompat.view.menu.j jVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f1107z.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1107z);
                }
                toolbar.addView(toolbar.f1107z);
            }
            View actionView = jVar.getActionView();
            toolbar.A = actionView;
            this.f1115t = jVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.A);
                }
                g gVar = new g();
                gVar.f643a = (toolbar.F & 112) | 8388611;
                gVar.f1117b = 2;
                toolbar.A.setLayoutParams(gVar);
                toolbar.addView(toolbar.A);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f1117b != 2 && childAt != toolbar.f1101s) {
                    toolbar.removeViewAt(childCount);
                    toolbar.W.add(childAt);
                }
            }
            toolbar.requestLayout();
            jVar.C = true;
            jVar.f853n.p(false);
            KeyEvent.Callback callback = toolbar.A;
            if (callback instanceof i.b) {
                ((i.b) callback).onActionViewExpanded();
            }
            toolbar.s();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public final void h(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.m
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
        }
    }
}
