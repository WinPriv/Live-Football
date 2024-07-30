package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.activity.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d7.g;
import d7.j;
import g0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import z6.c;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21002a = 0;

    /* loaded from: classes2.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i, reason: collision with root package name */
        public final b f21003i = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f21003i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (f7.a.a().f28147a) {
                    }
                }
            } else if (coordinatorLayout.q((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
                synchronized (f7.a.a().f28147a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.f21003i.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    /* loaded from: classes2.dex */
    public static class SnackbarBaseLayout extends FrameLayout {
        public static final a B = new a();
        public PorterDuff.Mode A;

        /* renamed from: s, reason: collision with root package name */
        public BaseTransientBottomBar<?> f21004s;

        /* renamed from: t, reason: collision with root package name */
        public final j f21005t;

        /* renamed from: u, reason: collision with root package name */
        public int f21006u;

        /* renamed from: v, reason: collision with root package name */
        public final float f21007v;

        /* renamed from: w, reason: collision with root package name */
        public final float f21008w;

        /* renamed from: x, reason: collision with root package name */
        public final int f21009x;
        public final int y;

        /* renamed from: z, reason: collision with root package name */
        public ColorStateList f21010z;

        /* loaded from: classes2.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(g7.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, n.f508s0);
            if (obtainStyledAttributes.hasValue(6)) {
                float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.i.s(this, dimensionPixelSize);
            }
            this.f21006u = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f21005t = new j(j.b(context2, attributeSet, 0, 0));
            }
            this.f21007v = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(com.google.android.material.internal.n.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f21008w = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f21009x = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.y = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(B);
            setFocusable(true);
            if (getBackground() == null) {
                int S0 = a0.a.S0(getBackgroundOverlayColorAlpha(), a0.a.K0(R.attr.colorSurface, this), a0.a.K0(R.attr.colorOnSurface, this));
                j jVar = this.f21005t;
                if (jVar != null) {
                    int i10 = BaseTransientBottomBar.f21002a;
                    g gVar = new g(jVar);
                    gVar.k(ColorStateList.valueOf(S0));
                    gradientDrawable = gVar;
                } else {
                    Resources resources = getResources();
                    int i11 = BaseTransientBottomBar.f21002a;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(S0);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f21010z;
                if (colorStateList != null) {
                    a.b.h(gradientDrawable, colorStateList);
                }
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                c0.d.q(this, gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f21004s = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f21008w;
        }

        public int getAnimationMode() {
            return this.f21006u;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f21007v;
        }

        public int getMaxInlineActionWidth() {
            return this.y;
        }

        public int getMaxWidth() {
            return this.f21009x;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f21004s;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f21004s != null) {
                synchronized (f7.a.a().f28147a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int i12 = this.f21009x;
            if (i12 > 0 && getMeasuredWidth() > i12) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setAnimationMode(int i10) {
            this.f21006u = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f21010z != null) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.f21010z);
                a.b.i(drawable, this.A);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f21010z = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.A);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.A = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.f21004s != null) {
                    int i10 = BaseTransientBottomBar.f21002a;
                    throw null;
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            a aVar;
            if (onClickListener != null) {
                aVar = null;
            } else {
                aVar = B;
            }
            setOnTouchListener(aVar);
            super.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f = Math.min(Math.max(gl.Code, 0.1f), 1.0f);
            swipeDismissBehavior.f20503g = Math.min(Math.max(gl.Code, 0.6f), 1.0f);
            swipeDismissBehavior.f20501d = 0;
        }
    }

    static {
        LinearInterpolator linearInterpolator = h6.a.f28768a;
        new Handler(Looper.getMainLooper(), new a());
    }
}
