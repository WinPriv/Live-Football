package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.q0;
import e0.f;
import g0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import r0.j;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements n.a {

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f20820c0 = {R.attr.state_checked};
    public int N;
    public boolean O;
    public boolean P;
    public final CheckedTextView Q;
    public FrameLayout R;
    public androidx.appcompat.view.menu.j S;
    public ColorStateList T;
    public boolean U;
    public Drawable V;
    public final a W;

    /* loaded from: classes2.dex */
    public class a extends n0.a {
        public a() {
        }

        @Override // n0.a
        public final void d(View view, o0.g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.P);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.R == null) {
                this.R = (FrameLayout) ((ViewStub) findViewById(com.hamkho.livefoot.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.R.removeAllViews();
            this.R.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void c(androidx.appcompat.view.menu.j jVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.S = jVar;
        int i11 = jVar.f841a;
        if (i11 > 0) {
            setId(i11);
        }
        if (jVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.hamkho.livefoot.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f20820c0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.q(this, stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.f845e);
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.f855q);
        q0.a(this, jVar.f856r);
        androidx.appcompat.view.menu.j jVar2 = this.S;
        if (jVar2.f845e != null || jVar2.getIcon() != null || this.S.getActionView() == null) {
            z10 = false;
        }
        CheckedTextView checkedTextView = this.Q;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.R;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.R.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.R;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.R.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.j jVar = this.S;
        if (jVar != null && jVar.isCheckable() && this.S.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f20820c0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.P != z10) {
            this.P = z10;
            this.W.h(this.Q, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.Q;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.U) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.T);
            }
            int i10 = this.N;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.O) {
            if (this.V == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = e0.f.f27633a;
                Drawable a10 = f.a.a(resources, com.hamkho.livefoot.R.drawable.navigation_empty_icon, theme);
                this.V = a10;
                if (a10 != null) {
                    int i11 = this.N;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.V;
        }
        j.b.e(this.Q, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.Q.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.N = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.T = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        androidx.appcompat.view.menu.j jVar = this.S;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.Q.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.O = z10;
    }

    public void setTextAppearance(int i10) {
        this.Q.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.Q.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.Q.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.W = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.hamkho.livefoot.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.hamkho.livefoot.R.id.design_menu_item_text);
        this.Q = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        c0.l(checkedTextView, aVar);
    }
}
