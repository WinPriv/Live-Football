package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import com.google.android.material.internal.i;
import com.huawei.hms.ads.gl;
import d7.g;
import d7.j;
import java.util.HashSet;
import java.util.WeakHashMap;
import m0.e;
import n0.c0;
import n0.l0;
import o0.g;

/* loaded from: classes2.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements n {
    public static final int[] V = {R.attr.state_checked};
    public static final int[] W = {-16842910};
    public ColorStateList A;
    public int B;
    public ColorStateList C;
    public final ColorStateList D;
    public int E;
    public int F;
    public Drawable G;
    public ColorStateList H;
    public int I;
    public final SparseArray<com.google.android.material.badge.a> J;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public j Q;
    public boolean R;
    public ColorStateList S;
    public NavigationBarPresenter T;
    public h U;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.transition.a f20912s;

    /* renamed from: t, reason: collision with root package name */
    public final a f20913t;

    /* renamed from: u, reason: collision with root package name */
    public final e f20914u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f20915v;

    /* renamed from: w, reason: collision with root package name */
    public int f20916w;

    /* renamed from: x, reason: collision with root package name */
    public NavigationBarItemView[] f20917x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f20918z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.j itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            if (!navigationBarMenuView.U.q(itemData, navigationBarMenuView.T, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.f20914u = new e(5);
        this.f20915v = new SparseArray<>(5);
        this.y = 0;
        this.f20918z = 0;
        this.J = new SparseArray<>(5);
        this.K = -1;
        this.L = -1;
        this.R = false;
        this.D = c();
        if (isInEditMode()) {
            this.f20912s = null;
        } else {
            androidx.transition.a aVar = new androidx.transition.a();
            this.f20912s = aVar;
            aVar.K(0);
            aVar.z(w6.a.c(getContext(), com.hamkho.livefoot.R.attr.motionDurationMedium4, getResources().getInteger(com.hamkho.livefoot.R.integer.material_motion_duration_long_1)));
            aVar.B(w6.a.d(getContext(), com.hamkho.livefoot.R.attr.motionEasingStandard, h6.a.f28769b));
            aVar.H(new i());
        }
        this.f20913t = new a();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(this, 1);
    }

    public static boolean f(int i10, int i11) {
        if (i10 != -1 ? i10 == 0 : i11 > 3) {
            return true;
        }
        return false;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f20914u.b();
        if (navigationBarItemView == null) {
            return e(getContext());
        }
        return navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        boolean z10;
        com.google.android.material.badge.a aVar;
        int id2 = navigationBarItemView.getId();
        if (id2 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar = this.J.get(id2)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        boolean z10;
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f20914u.a(navigationBarItemView);
                    if (navigationBarItemView.V != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ImageView imageView = navigationBarItemView.E;
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            com.google.android.material.badge.a aVar = navigationBarItemView.V;
                            if (aVar != null) {
                                if (aVar.d() != null) {
                                    aVar.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        navigationBarItemView.V = null;
                    }
                    navigationBarItemView.J = null;
                    navigationBarItemView.P = gl.Code;
                    navigationBarItemView.f20902s = false;
                }
            }
        }
        if (this.U.size() == 0) {
            this.y = 0;
            this.f20918z = 0;
            this.f20917x = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            hashSet.add(Integer.valueOf(this.U.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray<com.google.android.material.badge.a> sparseArray = this.J;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i11++;
        }
        this.f20917x = new NavigationBarItemView[this.U.size()];
        boolean f = f(this.f20916w, this.U.l().size());
        for (int i12 = 0; i12 < this.U.size(); i12++) {
            this.T.f20921t = true;
            this.U.getItem(i12).setCheckable(true);
            this.T.f20921t = false;
            NavigationBarItemView newItem = getNewItem();
            this.f20917x[i12] = newItem;
            newItem.setIconTintList(this.A);
            newItem.setIconSize(this.B);
            newItem.setTextColor(this.D);
            newItem.setTextAppearanceInactive(this.E);
            newItem.setTextAppearanceActive(this.F);
            newItem.setTextColor(this.C);
            int i13 = this.K;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.L;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            newItem.setActiveIndicatorWidth(this.N);
            newItem.setActiveIndicatorHeight(this.O);
            newItem.setActiveIndicatorMarginHorizontal(this.P);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.R);
            newItem.setActiveIndicatorEnabled(this.M);
            Drawable drawable = this.G;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.I);
            }
            newItem.setItemRippleColor(this.H);
            newItem.setShifting(f);
            newItem.setLabelVisibilityMode(this.f20916w);
            androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) this.U.getItem(i12);
            newItem.c(jVar);
            newItem.setItemPosition(i12);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f20915v;
            int i15 = jVar.f841a;
            newItem.setOnTouchListener(sparseArray2.get(i15));
            newItem.setOnClickListener(this.f20913t);
            int i16 = this.y;
            if (i16 != 0 && i15 == i16) {
                this.f20918z = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.U.size() - 1, this.f20918z);
        this.f20918z = min;
        this.U.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(h hVar) {
        this.U = hVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList b10 = d0.a.b(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.hamkho.livefoot.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = b10.getDefaultColor();
        int[] iArr = W;
        return new ColorStateList(new int[][]{iArr, V, ViewGroup.EMPTY_STATE_SET}, new int[]{b10.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final g d() {
        if (this.Q != null && this.S != null) {
            g gVar = new g(this.Q);
            gVar.k(this.S);
            return gVar;
        }
        return null;
    }

    public abstract NavigationBarItemView e(Context context);

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.J;
    }

    public ColorStateList getIconTintList() {
        return this.A;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.S;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.M;
    }

    public int getItemActiveIndicatorHeight() {
        return this.O;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.P;
    }

    public j getItemActiveIndicatorShapeAppearance() {
        return this.Q;
    }

    public int getItemActiveIndicatorWidth() {
        return this.N;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null && navigationBarItemViewArr.length > 0) {
            return navigationBarItemViewArr[0].getBackground();
        }
        return this.G;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.I;
    }

    public int getItemIconSize() {
        return this.B;
    }

    public int getItemPaddingBottom() {
        return this.L;
    }

    public int getItemPaddingTop() {
        return this.K;
    }

    public ColorStateList getItemRippleColor() {
        return this.H;
    }

    public int getItemTextAppearanceActive() {
        return this.F;
    }

    public int getItemTextAppearanceInactive() {
        return this.E;
    }

    public ColorStateList getItemTextColor() {
        return this.C;
    }

    public int getLabelVisibilityMode() {
        return this.f20916w;
    }

    public h getMenu() {
        return this.U;
    }

    public int getSelectedItemId() {
        return this.y;
    }

    public int getSelectedItemPosition() {
        return this.f20918z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, this.U.l().size(), 1).f33535a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.M = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.O = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.P = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.R = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(j jVar) {
        this.Q = jVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.N = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.G = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.I = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.B = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.L = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.K = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.F = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.E = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f20917x;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f20916w = i10;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.T = navigationBarPresenter;
    }
}
