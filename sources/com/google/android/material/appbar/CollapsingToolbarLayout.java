package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.n;
import com.anythink.expressad.exoplayer.k.p;
import com.google.android.material.appbar.AppBarLayout;
import com.hamkho.livefoot.R;
import d0.a;
import g0.a;
import i6.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public Drawable A;
    public int B;
    public boolean C;
    public ValueAnimator D;
    public long E;
    public int F;
    public b G;
    public int H;
    public int I;
    public boolean J;

    /* renamed from: s, reason: collision with root package name */
    public View f20444s;

    /* renamed from: t, reason: collision with root package name */
    public int f20445t;

    /* renamed from: u, reason: collision with root package name */
    public int f20446u;

    /* renamed from: v, reason: collision with root package name */
    public int f20447v;

    /* renamed from: w, reason: collision with root package name */
    public int f20448w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20449x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f20450z;

    /* loaded from: classes2.dex */
    public class b implements AppBarLayout.a {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.H = i10;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = collapsingToolbarLayout.getChildAt(i11);
                a aVar = (a) childAt.getLayoutParams();
                g b10 = CollapsingToolbarLayout.b(childAt);
                int i12 = aVar.f20451a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        b10.b(Math.round((-i10) * aVar.f20452b));
                    }
                } else {
                    b10.b(a0.a.B0(-i10, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f29192b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin));
                }
            }
            collapsingToolbarLayout.d();
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            Math.min(1.0f, (height - collapsingToolbarLayout.getScrimVisibleHeightTrigger()) / ((height - c0.d.d(collapsingToolbarLayout)) - 0));
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    public static g b(View view) {
        g gVar = (g) view.getTag(R.id.view_offset_helper);
        if (gVar == null) {
            g gVar2 = new g(view);
            view.setTag(R.id.view_offset_helper, gVar2);
            return gVar2;
        }
        return gVar;
    }

    public final void c() {
        View view;
        if (!this.f20449x && (view = this.f20444s) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f20444s);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        boolean z10;
        if (this.f20450z != null || this.A != null) {
            if (getHeight() + this.H < getScrimVisibleHeightTrigger()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrimsShown(z10);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f20450z;
        if (drawable != null && this.B > 0) {
            drawable.mutate().setAlpha(this.B);
            this.f20450z.draw(canvas);
        }
        if (this.f20449x && this.y) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Drawable drawable = this.f20450z;
        if (drawable != null && this.B > 0) {
            if (view == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int width = getWidth();
                int height = getHeight();
                if (this.I == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && view != null && this.f20449x) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.f20450z.mutate().setAlpha(this.B);
                this.f20450z.draw(canvas);
                z10 = true;
                if (super.drawChild(canvas, view, j10) && !z10) {
                    return false;
                }
            }
        }
        z10 = false;
        return super.drawChild(canvas, view, j10) ? true : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f20450z;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public int getCollapsedTitleGravity() {
        throw null;
    }

    public float getCollapsedTitleTextSize() {
        throw null;
    }

    public Typeface getCollapsedTitleTypeface() {
        throw null;
    }

    public Drawable getContentScrim() {
        return this.f20450z;
    }

    public int getExpandedTitleGravity() {
        throw null;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f20448w;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f20447v;
    }

    public int getExpandedTitleMarginStart() {
        return this.f20445t;
    }

    public int getExpandedTitleMarginTop() {
        return this.f20446u;
    }

    public float getExpandedTitleTextSize() {
        throw null;
    }

    public Typeface getExpandedTitleTypeface() {
        throw null;
    }

    public int getHyphenationFrequency() {
        throw null;
    }

    public int getLineCount() {
        throw null;
    }

    public float getLineSpacingAdd() {
        throw null;
    }

    public float getLineSpacingMultiplier() {
        throw null;
    }

    public int getMaxLines() {
        throw null;
    }

    public int getScrimAlpha() {
        return this.B;
    }

    public long getScrimAnimationDuration() {
        return this.E;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.F;
        if (i10 >= 0) {
            return i10 + 0 + 0;
        }
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int d10 = c0.d.d(this);
        if (d10 > 0) {
            return Math.min((d10 * 2) + 0, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A;
    }

    public CharSequence getTitle() {
        if (!this.f20449x) {
            return null;
        }
        throw null;
    }

    public int getTitleCollapseMode() {
        return this.I;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        throw null;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z10 = true;
            if (this.I != 1) {
                z10 = false;
            }
            if (z10) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            setFitsSystemWindows(c0.d.b(appBarLayout));
            if (this.G == null) {
                this.G = new b();
            }
            b bVar = this.G;
            if (appBarLayout.y == null) {
                appBarLayout.y = new ArrayList();
            }
            if (bVar != null && !appBarLayout.y.contains(bVar)) {
                appBarLayout.y.add(bVar);
            }
            c0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        b bVar = this.G;
        if (bVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).y) != null) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            g b10 = b(getChildAt(i14));
            View view2 = b10.f29191a;
            b10.f29192b = view2.getTop();
            b10.f29193c = view2.getLeft();
        }
        if (this.f20449x && (view = this.f20444s) != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.g.b(view) && this.f20444s.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.y = z11;
            if (z11) {
                c0.e.d(this);
                b(null);
                throw null;
            }
        }
        d();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            b(getChildAt(i15)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        View.MeasureSpec.getMode(i11);
        if (!this.J) {
        } else {
            throw null;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f20450z;
        if (drawable != null) {
            if (this.I != 1) {
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        throw null;
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        throw null;
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f) {
        throw null;
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        throw null;
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f20450z;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f20450z = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                if (this.I != 1) {
                }
                drawable3.setBounds(0, 0, width, height);
                this.f20450z.setCallback(this);
                this.f20450z.setAlpha(this.B);
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setContentScrim(a.c.b(context, i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        throw null;
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f20448w = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f20447v = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f20445t = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f20446u = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        throw null;
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setExpandedTitleTextSize(float f) {
        throw null;
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        throw null;
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.J = z10;
    }

    public void setHyphenationFrequency(int i10) {
        throw null;
    }

    public void setLineSpacingAdd(float f) {
        throw null;
    }

    public void setLineSpacingMultiplier(float f) {
        throw null;
    }

    public void setMaxLines(int i10) {
        throw null;
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        throw null;
    }

    public void setScrimAlpha(int i10) {
        if (i10 != this.B) {
            Drawable drawable = this.f20450z;
            this.B = i10;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.E = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.F != i10) {
            this.F = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int i10 = 0;
        if (c0.g.c(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.C != z10) {
            int i11 = p.f9095b;
            if (z11) {
                if (!z10) {
                    i11 = 0;
                }
                a();
                ValueAnimator valueAnimator = this.D;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.D = valueAnimator2;
                    valueAnimator2.setInterpolator(null);
                    this.D.addUpdateListener(new i6.c(this));
                } else if (valueAnimator.isRunning()) {
                    this.D.cancel();
                }
                this.D.setDuration(this.E);
                this.D.setIntValues(this.B, i11);
                this.D.start();
            } else {
                if (z10) {
                    i10 = 255;
                }
                setScrimAlpha(i10);
            }
            this.C = z10;
        }
    }

    public void setStaticLayoutBuilderConfigurer(c cVar) {
        throw null;
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A.setState(getDrawableState());
                }
                Drawable drawable4 = this.A;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                a.c.b(drawable4, c0.e.d(this));
                Drawable drawable5 = this.A;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.A.setCallback(this);
                this.A.setAlpha(this.B);
            }
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            c0.d.k(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setStatusBarScrim(a.c.b(context, i10));
    }

    public void setTitle(CharSequence charSequence) {
        throw null;
    }

    public void setTitleCollapseMode(int i10) {
        this.I = i10;
        throw null;
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        throw null;
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f20449x) {
            this.f20449x = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        throw null;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.A;
        if (drawable != null && drawable.isVisible() != z10) {
            this.A.setVisible(z10, false);
        }
        Drawable drawable2 = this.f20450z;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f20450z.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f20450z && drawable != this.A) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f20451a;

        /* renamed from: b, reason: collision with root package name */
        public float f20452b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20451a = 0;
            this.f20452b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.T);
            this.f20451a = obtainStyledAttributes.getInt(0, 0);
            this.f20452b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public a() {
            super(-1, -1);
            this.f20451a = 0;
            this.f20452b = 0.5f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20451a = 0;
            this.f20452b = 0.5f;
        }
    }

    public final void a() {
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
    }
}
