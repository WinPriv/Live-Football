package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbsActionBarView;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbsActionBarView {
    public CharSequence A;
    public CharSequence B;
    public View C;
    public View D;
    public View E;
    public LinearLayout F;
    public TextView G;
    public TextView H;
    public final int I;
    public final int J;
    public boolean K;
    public final int L;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ i.a f906s;

        public a(i.a aVar) {
            this.f906s = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f906s.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.F, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = g.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        c0.d.q(this, drawable);
        this.I = obtainStyledAttributes.getResourceId(5, 0);
        this.J = obtainStyledAttributes.getResourceId(4, 0);
        this.f893w = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.L = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void e(i.a aVar) {
        View view = this.C;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.L, (ViewGroup) this, false);
            this.C = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.C);
        }
        View findViewById = this.C.findViewById(R.id.action_mode_close_button);
        this.D = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        androidx.appcompat.view.menu.h e10 = aVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f892v;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i();
            ActionMenuPresenter.a aVar2 = actionMenuPresenter.M;
            if (aVar2 != null && aVar2.b()) {
                aVar2.f874j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f892v = actionMenuPresenter2;
        actionMenuPresenter2.E = true;
        actionMenuPresenter2.F = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.f892v, this.f890t);
        ActionMenuPresenter actionMenuPresenter3 = this.f892v;
        androidx.appcompat.view.menu.n nVar = actionMenuPresenter3.f782z;
        if (nVar == null) {
            androidx.appcompat.view.menu.n nVar2 = (androidx.appcompat.view.menu.n) actionMenuPresenter3.f779v.inflate(actionMenuPresenter3.f781x, (ViewGroup) this, false);
            actionMenuPresenter3.f782z = nVar2;
            nVar2.b(actionMenuPresenter3.f778u);
            actionMenuPresenter3.c(true);
        }
        androidx.appcompat.view.menu.n nVar3 = actionMenuPresenter3.f782z;
        if (nVar != nVar3) {
            ((ActionMenuView) nVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) nVar3;
        this.f891u = actionMenuView;
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        c0.d.q(actionMenuView, null);
        addView(this.f891u, layoutParams);
    }

    public final void f() {
        int i10;
        if (this.F == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.F = linearLayout;
            this.G = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.H = (TextView) this.F.findViewById(R.id.action_bar_subtitle);
            int i11 = this.I;
            if (i11 != 0) {
                this.G.setTextAppearance(getContext(), i11);
            }
            int i12 = this.J;
            if (i12 != 0) {
                this.H.setTextAppearance(getContext(), i12);
            }
        }
        this.G.setText(this.A);
        this.H.setText(this.B);
        boolean z10 = !TextUtils.isEmpty(this.A);
        boolean z11 = !TextUtils.isEmpty(this.B);
        TextView textView = this.H;
        int i13 = 0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.F;
        if (!z10 && !z11) {
            i13 = 8;
        }
        linearLayout2.setVisibility(i13);
        if (this.F.getParent() == null) {
            addView(this.F);
        }
    }

    public final void g() {
        removeAllViews();
        this.E = null;
        this.f891u = null;
        this.f892v = null;
        View view = this.D;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public final n0.l0 h(int i10, long j10) {
        n0.l0 l0Var = this.f894x;
        if (l0Var != null) {
            l0Var.b();
        }
        AbsActionBarView.a aVar = this.f889s;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(gl.Code);
            }
            n0.l0 a10 = n0.c0.a(this);
            a10.a(1.0f);
            a10.c(j10);
            AbsActionBarView.this.f894x = a10;
            aVar.f897t = i10;
            a10.d(aVar);
            return a10;
        }
        n0.l0 a11 = n0.c0.a(this);
        a11.a(gl.Code);
        a11.c(j10);
        AbsActionBarView.this.f894x = a11;
        aVar.f897t = i10;
        a11.d(aVar);
        return a11;
    }

    public final void i() {
        ActionMenuPresenter actionMenuPresenter = this.f892v;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f892v;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i();
            ActionMenuPresenter.a aVar = this.f892v.M;
            if (aVar != null && aVar.b()) {
                aVar.f874j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        int i16;
        boolean a10 = u0.a(this);
        if (a10) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.C;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
            if (a10) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (a10) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            if (a10) {
                i16 = paddingLeft - i14;
            } else {
                i16 = paddingLeft + i14;
            }
            int d10 = i16 + AbsActionBarView.d(i16, paddingTop, paddingTop2, this.C, a10);
            if (a10) {
                paddingLeft = d10 - i15;
            } else {
                paddingLeft = d10 + i15;
            }
        }
        LinearLayout linearLayout = this.F;
        if (linearLayout != null && this.E == null && linearLayout.getVisibility() != 8) {
            paddingLeft += AbsActionBarView.d(paddingLeft, paddingTop, paddingTop2, this.F, a10);
        }
        View view2 = this.E;
        if (view2 != null) {
            AbsActionBarView.d(paddingLeft, paddingTop, paddingTop2, view2, a10);
        }
        if (a10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f891u;
        if (actionMenuView != null) {
            AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f893w;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                View view = this.C;
                if (view != null) {
                    int c10 = AbsActionBarView.c(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
                    paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f891u;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = AbsActionBarView.c(this.f891u, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.F;
                if (linearLayout != null && this.E == null) {
                    if (this.K) {
                        this.F.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.F.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.F;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = AbsActionBarView.c(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.E;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.E.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f893w <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i10) {
        this.f893w = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.E;
        if (view2 != null) {
            removeView(view2);
        }
        this.E = view;
        if (view != null && (linearLayout = this.F) != null) {
            removeView(linearLayout);
            this.F = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.B = charSequence;
        f();
    }

    public void setTitle(CharSequence charSequence) {
        this.A = charSequence;
        f();
        n0.c0.m(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.K) {
            requestLayout();
        }
        this.K = z10;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
