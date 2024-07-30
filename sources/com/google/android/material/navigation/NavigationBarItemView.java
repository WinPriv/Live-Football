package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.q0;
import com.huawei.hms.ads.gl;
import d0.a;
import g0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.w;
import o0.g;

/* loaded from: classes2.dex */
public abstract class NavigationBarItemView extends FrameLayout implements n.a {
    public static final int[] W = {R.attr.state_checked};

    /* renamed from: c0, reason: collision with root package name */
    public static final c f20900c0 = new c();

    /* renamed from: d0, reason: collision with root package name */
    public static final d f20901d0 = new d();
    public int A;
    public boolean B;
    public final FrameLayout C;
    public final View D;
    public final ImageView E;
    public final ViewGroup F;
    public final TextView G;
    public final TextView H;
    public int I;
    public j J;
    public ColorStateList K;
    public Drawable L;
    public Drawable M;
    public ValueAnimator N;
    public c O;
    public float P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public com.google.android.material.badge.a V;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20902s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f20903t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f20904u;

    /* renamed from: v, reason: collision with root package name */
    public int f20905v;

    /* renamed from: w, reason: collision with root package name */
    public int f20906w;

    /* renamed from: x, reason: collision with root package name */
    public float f20907x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f20908z;

    /* loaded from: classes2.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z10;
            NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
            if (navigationBarItemView.E.getVisibility() == 0) {
                com.google.android.material.badge.a aVar = navigationBarItemView.V;
                if (aVar != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Rect rect = new Rect();
                    ImageView imageView = navigationBarItemView.E;
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.g(imageView, null);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f20910s;

        public b(int i10) {
            this.f20910s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = NavigationBarItemView.W;
            NavigationBarItemView.this.g(this.f20910s);
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public float a(float f, float f10) {
            return 1.0f;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        @Override // com.google.android.material.navigation.NavigationBarItemView.c
        public final float a(float f, float f10) {
            LinearInterpolator linearInterpolator = h6.a.f28768a;
            return (f * 0.6f) + 0.4f;
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f20902s = false;
        this.I = -1;
        this.O = f20900c0;
        this.P = gl.Code;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.C = (FrameLayout) findViewById(com.hamkho.livefoot.R.id.navigation_bar_item_icon_container);
        this.D = findViewById(com.hamkho.livefoot.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.hamkho.livefoot.R.id.navigation_bar_item_icon_view);
        this.E = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.hamkho.livefoot.R.id.navigation_bar_item_labels_group);
        this.F = viewGroup;
        TextView textView = (TextView) findViewById(com.hamkho.livefoot.R.id.navigation_bar_item_small_label_view);
        this.G = textView;
        TextView textView2 = (TextView) findViewById(com.hamkho.livefoot.R.id.navigation_bar_item_large_label_view);
        this.H = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f20905v = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f20906w = viewGroup.getPaddingBottom();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(textView, 2);
        c0.d.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f20907x = textSize - textSize2;
        this.y = (textSize2 * 1.0f) / textSize;
        this.f20908z = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = androidx.activity.n.f514v0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.d(android.widget.TextView, int):void");
    }

    public static void e(float f, float f10, int i10, TextView textView) {
        textView.setScaleX(f);
        textView.setScaleY(f10);
        textView.setVisibility(i10);
    }

    public static void f(int i10, int i11, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.C;
        if (frameLayout == null) {
            return this.E;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        int i10;
        com.google.android.material.badge.a aVar = this.V;
        if (aVar != null) {
            i10 = aVar.getMinimumHeight() / 2;
        } else {
            i10 = 0;
        }
        return this.E.getMeasuredWidth() + Math.max(i10, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + i10;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        com.google.android.material.badge.a aVar = this.V;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.V.f20486w.f20471b.E.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.E.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(int i10, ViewGroup viewGroup) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a() {
        Drawable drawable = this.f20904u;
        ColorStateList colorStateList = this.f20903t;
        FrameLayout frameLayout = this.C;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.Q && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(a7.a.c(this.f20903t), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(a7.a.a(this.f20903t), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.q(frameLayout, rippleDrawable);
        }
        WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
        c0.d.q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public final void b(float f, float f10) {
        float f11;
        float f12;
        View view = this.D;
        if (view != null) {
            c cVar = this.O;
            cVar.getClass();
            LinearInterpolator linearInterpolator = h6.a.f28768a;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(cVar.a(f, f10));
            if (f10 == gl.Code) {
                f11 = 0.8f;
            } else {
                f11 = 0.0f;
            }
            if (f10 == gl.Code) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            view.setAlpha(h6.a.a(gl.Code, 1.0f, f11, f12, f));
        }
        this.P = f;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void c(j jVar) {
        CharSequence charSequence;
        int i10;
        this.J = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.f845e);
        setId(jVar.f841a);
        if (!TextUtils.isEmpty(jVar.f855q)) {
            setContentDescription(jVar.f855q);
        }
        if (!TextUtils.isEmpty(jVar.f856r)) {
            charSequence = jVar.f856r;
        } else {
            charSequence = jVar.f845e;
        }
        q0.a(this, charSequence);
        if (jVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        this.f20902s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.C;
        if (frameLayout != null && this.Q) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(int i10) {
        boolean z10;
        int i11;
        View view = this.D;
        if (view == null) {
            return;
        }
        int min = Math.min(this.R, i10 - (this.U * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (this.T && this.A == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = min;
        } else {
            i11 = this.S;
        }
        layoutParams.height = i11;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.D;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.V;
    }

    public int getItemBackgroundResId() {
        return com.hamkho.livefoot.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public j getItemData() {
        return this.J;
    }

    public int getItemDefaultMarginResId() {
        return com.hamkho.livefoot.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        j jVar = this.J;
        if (jVar != null && jVar.isCheckable() && this.J.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, W);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.V;
        if (aVar != null && aVar.isVisible()) {
            j jVar = this.J;
            CharSequence charSequence = jVar.f845e;
            if (!TextUtils.isEmpty(jVar.f855q)) {
                charSequence = this.J.f855q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.V.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.c.a(0, 1, getItemVisiblePosition(), 1, isSelected()).f33536a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) g.a.f33524e.f33531a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.hamkho.livefoot.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.D;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        a();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        int i10;
        this.Q = z10;
        a();
        View view = this.D;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.S = i10;
        g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.U = i10;
        g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.T = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.R = i10;
        g(getWidth());
    }

    public void setBadge(com.google.android.material.badge.a aVar) {
        boolean z10;
        boolean z11;
        com.google.android.material.badge.a aVar2 = this.V;
        if (aVar2 == aVar) {
            return;
        }
        boolean z12 = true;
        if (aVar2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.E;
        if (z10 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.V != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.a aVar3 = this.V;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.V = null;
            }
        }
        this.V = aVar;
        if (imageView != null) {
            if (aVar == null) {
                z12 = false;
            }
            if (z12) {
                setClipChildren(false);
                setClipToPadding(false);
                com.google.android.material.badge.a aVar4 = this.V;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                aVar4.setBounds(rect);
                aVar4.g(imageView, null);
                if (aVar4.d() != null) {
                    aVar4.d().setForeground(aVar4);
                } else {
                    imageView.getOverlay().add(aVar4);
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.G.setEnabled(z10);
        this.H.setEnabled(z10);
        this.E.setEnabled(z10);
        if (z10) {
            PointerIcon b10 = w.b(getContext(), 1002);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.k.d(this, b10);
        } else {
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            c0.k.d(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.L) {
            return;
        }
        this.L = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.M = drawable;
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }
        this.E.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.E;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.K = colorStateList;
        if (this.J != null && (drawable = this.M) != null) {
            a.b.h(drawable, colorStateList);
            this.M.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        Drawable b10;
        if (i10 == 0) {
            b10 = null;
        } else {
            Context context = getContext();
            Object obj = d0.a.f27248a;
            b10 = a.c.b(context, i10);
        }
        setItemBackground(b10);
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f20906w != i10) {
            this.f20906w = i10;
            j jVar = this.J;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f20905v != i10) {
            this.f20905v = i10;
            j jVar = this.J;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i10) {
        this.I = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f20903t = colorStateList;
        a();
    }

    public void setLabelVisibilityMode(int i10) {
        boolean z10;
        if (this.A != i10) {
            this.A = i10;
            if (this.T && i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.O = f20901d0;
            } else {
                this.O = f20900c0;
            }
            g(getWidth());
            j jVar = this.J;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            j jVar = this.J;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i10) {
        TextView textView = this.H;
        d(textView, i10);
        float textSize = this.G.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f20907x = textSize - textSize2;
        this.y = (textSize2 * 1.0f) / textSize;
        this.f20908z = (textSize * 1.0f) / textSize2;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i10) {
        TextView textView = this.G;
        d(textView, i10);
        float textSize = textView.getTextSize();
        float textSize2 = this.H.getTextSize();
        this.f20907x = textSize - textSize2;
        this.y = (textSize2 * 1.0f) / textSize;
        this.f20908z = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.G.setTextColor(colorStateList);
            this.H.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.G.setText(charSequence);
        this.H.setText(charSequence);
        j jVar = this.J;
        if (jVar == null || TextUtils.isEmpty(jVar.f855q)) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.J;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.f856r)) {
            charSequence = this.J.f856r;
        }
        q0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f20904u = drawable;
        a();
    }
}
