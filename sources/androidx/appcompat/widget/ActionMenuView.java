package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.huawei.hms.ads.gl;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements h.b, androidx.appcompat.view.menu.n {
    public androidx.appcompat.view.menu.h H;
    public Context I;
    public int J;
    public boolean K;
    public ActionMenuPresenter L;
    public m.a M;
    public h.a N;
    public boolean O;
    public int P;
    public final int Q;
    public final int R;
    public e S;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f925a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f926b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f927c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f928d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f929e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f925a = cVar.f925a;
        }

        public c() {
            super(-2, -2);
            this.f925a = false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements h.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            boolean z10;
            boolean z11;
            e eVar = ActionMenuView.this.S;
            if (eVar == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<n0.m> it = toolbar.f1087d0.f33085b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().b()) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                Toolbar.h hVar2 = toolbar.f1089f0;
                if (hVar2 != null) {
                    z11 = androidx.appcompat.app.t.this.f692b.onMenuItemSelected(0, menuItem);
                } else {
                    z11 = false;
                }
            }
            if (!z11) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            h.a aVar = ActionMenuView.this.N;
            if (aVar != null) {
                aVar.b(hVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.Q = (int) (56.0f * f);
        this.R = (int) (f * 4.0f);
        this.I = context;
        this.J = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.h.b
    public final boolean a(androidx.appcompat.view.menu.j jVar) {
        return this.H.q(jVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(androidx.appcompat.view.menu.h hVar) {
        this.H = hVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final LinearLayoutCompat.a generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.H == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            this.H = hVar;
            hVar.f820e = new d();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.L = actionMenuPresenter;
            actionMenuPresenter.E = true;
            actionMenuPresenter.F = true;
            m.a aVar = this.M;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter.f780w = aVar;
            this.H.b(actionMenuPresenter, this.I);
            ActionMenuPresenter actionMenuPresenter2 = this.L;
            actionMenuPresenter2.f782z = this;
            this.H = actionMenuPresenter2.f778u;
        }
        return this.H;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.L;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.B;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (actionMenuPresenter.D) {
            return actionMenuPresenter.C;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.J;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        if (i10 > 0 && (childAt2 instanceof a)) {
            return z10 | ((a) childAt2).b();
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.L;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.c(false);
            if (this.L.m()) {
                this.L.i();
                this.L.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.L;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i();
            ActionMenuPresenter.a aVar = actionMenuPresenter.M;
            if (aVar != null && aVar.b()) {
                aVar.f874j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.O) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = u0.a(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f925a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    k(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f925a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f925a) {
                int i29 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i29;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r42;
        boolean z15;
        int i18;
        int i19;
        int i20;
        ActionMenuItemView actionMenuItemView;
        boolean z16;
        int i21;
        boolean z17;
        androidx.appcompat.view.menu.h hVar;
        boolean z18 = this.O;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = z10;
        if (z18 != z10) {
            this.P = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.O && (hVar = this.H) != null && size != this.P) {
            this.P = size;
            hVar.p(true);
        }
        int childCount = getChildCount();
        if (this.O && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i22 = size2 - paddingRight;
            int i23 = this.Q;
            int i24 = i22 / i23;
            int i25 = i22 % i23;
            if (i24 == 0) {
                setMeasuredDimension(i22, 0);
                return;
            }
            int i26 = (i25 / i24) + i23;
            int childCount2 = getChildCount();
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            boolean z19 = false;
            int i31 = 0;
            long j10 = 0;
            while (true) {
                i12 = this.R;
                if (i30 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i30);
                int i32 = size3;
                int i33 = i22;
                if (childAt.getVisibility() == 8) {
                    i19 = mode;
                    i20 = paddingBottom;
                } else {
                    boolean z20 = childAt instanceof ActionMenuItemView;
                    int i34 = i28 + 1;
                    if (z20) {
                        childAt.setPadding(i12, 0, i12, 0);
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f = false;
                    cVar.f927c = 0;
                    cVar.f926b = 0;
                    cVar.f928d = false;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                    if (z20 && ((ActionMenuItemView) childAt).l()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    cVar.f929e = z15;
                    if (cVar.f925a) {
                        i18 = 1;
                    } else {
                        i18 = i24;
                    }
                    c cVar2 = (c) childAt.getLayoutParams();
                    i19 = mode;
                    i20 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z20) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.l()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i18 > 0 && (!z16 || i18 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i21 = measuredWidth / i26;
                        if (measuredWidth % i26 != 0) {
                            i21++;
                        }
                        if (z16 && i21 < 2) {
                            i21 = 2;
                        }
                    } else {
                        i21 = 0;
                    }
                    if (!cVar2.f925a && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    cVar2.f928d = z17;
                    cVar2.f926b = i21;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i21, 1073741824), makeMeasureSpec);
                    i29 = Math.max(i29, i21);
                    if (cVar.f928d) {
                        i31++;
                    }
                    if (cVar.f925a) {
                        z19 = true;
                    }
                    i24 -= i21;
                    i27 = Math.max(i27, childAt.getMeasuredHeight());
                    if (i21 == 1) {
                        j10 |= 1 << i30;
                    }
                    i28 = i34;
                }
                i30++;
                size3 = i32;
                i22 = i33;
                paddingBottom = i20;
                mode = i19;
            }
            int i35 = mode;
            int i36 = i22;
            int i37 = size3;
            if (z19 && i28 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = false;
            while (i31 > 0 && i24 > 0) {
                int i38 = Integer.MAX_VALUE;
                int i39 = 0;
                int i40 = 0;
                long j11 = 0;
                while (i40 < childCount2) {
                    c cVar3 = (c) getChildAt(i40).getLayoutParams();
                    boolean z22 = z21;
                    if (cVar3.f928d) {
                        int i41 = cVar3.f926b;
                        if (i41 < i38) {
                            j11 = 1 << i40;
                            i38 = i41;
                            i39 = 1;
                        } else if (i41 == i38) {
                            j11 |= 1 << i40;
                            i39++;
                        }
                    }
                    i40++;
                    z21 = z22;
                }
                z12 = z21;
                j10 |= j11;
                if (i39 > i24) {
                    break;
                }
                int i42 = i38 + 1;
                int i43 = 0;
                while (i43 < childCount2) {
                    View childAt2 = getChildAt(i43);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i44 = i27;
                    int i45 = childMeasureSpec;
                    int i46 = childCount2;
                    long j12 = 1 << i43;
                    if ((j11 & j12) == 0) {
                        if (cVar4.f926b == i42) {
                            j10 |= j12;
                        }
                    } else {
                        if (z11 && cVar4.f929e) {
                            r42 = 1;
                            r42 = 1;
                            if (i24 == 1) {
                                childAt2.setPadding(i12 + i26, 0, i12, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        cVar4.f926b += r42;
                        cVar4.f = r42;
                        i24--;
                    }
                    i43++;
                    childMeasureSpec = i45;
                    i27 = i44;
                    childCount2 = i46;
                }
                z21 = true;
            }
            z12 = z21;
            int i47 = i27;
            int i48 = childMeasureSpec;
            int i49 = childCount2;
            if (!z19 && i28 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i24 > 0 && j10 != 0 && (i24 < i28 - 1 || z13 || i29 > 1)) {
                float bitCount = Long.bitCount(j10);
                if (!z13) {
                    if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f929e) {
                        bitCount -= 0.5f;
                    }
                    int i50 = i49 - 1;
                    if ((j10 & (1 << i50)) != 0 && !((c) getChildAt(i50).getLayoutParams()).f929e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > gl.Code) {
                    i17 = (int) ((i24 * i26) / bitCount);
                } else {
                    i17 = 0;
                }
                boolean z23 = z12;
                i13 = i49;
                for (int i51 = 0; i51 < i13; i51++) {
                    if ((j10 & (1 << i51)) != 0) {
                        View childAt3 = getChildAt(i51);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.f927c = i17;
                            cVar5.f = true;
                            if (i51 == 0 && !cVar5.f929e) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i17) / 2;
                            }
                            z23 = true;
                        } else {
                            if (cVar5.f925a) {
                                cVar5.f927c = i17;
                                cVar5.f = true;
                                ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i17) / 2;
                                z23 = true;
                            } else {
                                if (i51 != 0) {
                                    ((LinearLayout.LayoutParams) cVar5).leftMargin = i17 / 2;
                                }
                                if (i51 != i13 - 1) {
                                    ((LinearLayout.LayoutParams) cVar5).rightMargin = i17 / 2;
                                }
                            }
                        }
                    }
                }
                z14 = z23;
            } else {
                i13 = i49;
                z14 = z12;
            }
            if (z14) {
                int i52 = 0;
                while (i52 < i13) {
                    View childAt4 = getChildAt(i52);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (!cVar6.f) {
                        i16 = i48;
                    } else {
                        i16 = i48;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f926b * i26) + cVar6.f927c, 1073741824), i16);
                    }
                    i52++;
                    i48 = i16;
                }
            }
            if (i35 != 1073741824) {
                i15 = i36;
                i14 = i47;
            } else {
                i14 = i37;
                i15 = i36;
            }
            setMeasuredDimension(i15, i14);
            return;
        }
        for (int i53 = 0; i53 < childCount; i53++) {
            c cVar7 = (c) getChildAt(i53).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.L.J = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.S = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.L;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.B;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.D = true;
            actionMenuPresenter.C = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.K = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.J != i10) {
            this.J = i10;
            if (i10 == 0) {
                this.I = getContext();
            } else {
                this.I = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.L = actionMenuPresenter;
        actionMenuPresenter.f782z = this;
        this.H = actionMenuPresenter.f778u;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class b implements m.a {
        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
        }
    }
}
