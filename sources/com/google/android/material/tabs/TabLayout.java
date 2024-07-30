package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.huawei.hms.ads.gl;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.w;
import o0.g;
import r0.j;

@ViewPager.b
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: t0, reason: collision with root package name */
    public static final m0.e f21018t0 = new m0.e(16);
    public final int A;
    public final int B;
    public final int C;
    public ColorStateList D;
    public ColorStateList E;
    public ColorStateList F;
    public Drawable G;
    public int H;
    public final PorterDuff.Mode I;
    public final float J;
    public final float K;
    public final int L;
    public int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public int R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    /* renamed from: c0, reason: collision with root package name */
    public int f21019c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f21020d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f21021e0;

    /* renamed from: f0, reason: collision with root package name */
    public com.google.android.material.tabs.c f21022f0;

    /* renamed from: g0, reason: collision with root package name */
    public final TimeInterpolator f21023g0;

    /* renamed from: h0, reason: collision with root package name */
    public c f21024h0;

    /* renamed from: i0, reason: collision with root package name */
    public final ArrayList<c> f21025i0;

    /* renamed from: j0, reason: collision with root package name */
    public h f21026j0;

    /* renamed from: k0, reason: collision with root package name */
    public ValueAnimator f21027k0;

    /* renamed from: l0, reason: collision with root package name */
    public ViewPager f21028l0;

    /* renamed from: m0, reason: collision with root package name */
    public p1.a f21029m0;

    /* renamed from: n0, reason: collision with root package name */
    public e f21030n0;

    /* renamed from: o0, reason: collision with root package name */
    public g f21031o0;

    /* renamed from: p0, reason: collision with root package name */
    public b f21032p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f21033q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f21034r0;

    /* renamed from: s, reason: collision with root package name */
    public int f21035s;

    /* renamed from: s0, reason: collision with root package name */
    public final s.d f21036s0;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<f> f21037t;

    /* renamed from: u, reason: collision with root package name */
    public f f21038u;

    /* renamed from: v, reason: collision with root package name */
    public final SlidingTabIndicator f21039v;

    /* renamed from: w, reason: collision with root package name */
    public final int f21040w;

    /* renamed from: x, reason: collision with root package name */
    public final int f21041x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f21042z;

    /* loaded from: classes2.dex */
    public class SlidingTabIndicator extends LinearLayout {

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ int f21043u = 0;

        /* renamed from: s, reason: collision with root package name */
        public ValueAnimator f21044s;

        public SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f21034r0 != 0) {
                return;
            }
            View childAt = getChildAt(i10);
            com.google.android.material.tabs.c cVar = tabLayout.f21022f0;
            Drawable drawable = tabLayout.G;
            cVar.getClass();
            RectF a10 = com.google.android.material.tabs.c.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
            tabLayout.f21035s = i10;
        }

        public final void b(int i10) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.G.getBounds();
            tabLayout.G.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, float f, View view2) {
            boolean z10;
            if (view != null && view.getWidth() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f21022f0.b(tabLayout, view, view2, f, tabLayout.G);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.G;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.G.getBounds().bottom);
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this);
        }

        public final void d(int i10, int i11, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f21035s == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f21035s = i10;
            com.google.android.material.tabs.d dVar = new com.google.android.material.tabs.d(this, childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f21044s = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.f21023g0);
                valueAnimator.setDuration(i11);
                valueAnimator.setFloatValues(gl.Code, 1.0f);
                valueAnimator.addUpdateListener(dVar);
                valueAnimator.start();
                return;
            }
            this.f21044s.removeAllUpdateListeners();
            this.f21044s.addUpdateListener(dVar);
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.G.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.G.getIntrinsicHeight();
            }
            int i10 = tabLayout.T;
            if (i10 != 0) {
                if (i10 != 1) {
                    height = 0;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (tabLayout.G.getBounds().width() > 0) {
                Rect bounds = tabLayout.G.getBounds();
                tabLayout.G.setBounds(bounds.left, height, bounds.right, height2);
                tabLayout.G.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f21044s;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f21035s == -1) {
                tabLayout.f21035s = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f21035s);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.R == 1 || tabLayout.U == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) n.b(16, getContext())) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != gl.Code) {
                            layoutParams.width = i12;
                            layoutParams.weight = gl.Code;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    tabLayout.R = 0;
                    tabLayout.o(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    /* loaded from: classes2.dex */
    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int D = 0;
        public Drawable A;
        public int B;

        /* renamed from: s, reason: collision with root package name */
        public f f21046s;

        /* renamed from: t, reason: collision with root package name */
        public TextView f21047t;

        /* renamed from: u, reason: collision with root package name */
        public ImageView f21048u;

        /* renamed from: v, reason: collision with root package name */
        public View f21049v;

        /* renamed from: w, reason: collision with root package name */
        public com.google.android.material.badge.a f21050w;

        /* renamed from: x, reason: collision with root package name */
        public View f21051x;
        public TextView y;

        /* renamed from: z, reason: collision with root package name */
        public ImageView f21052z;

        public TabView(Context context) {
            super(context);
            this.B = 2;
            e(context);
            int i10 = TabLayout.this.f21040w;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.e.k(this, i10, TabLayout.this.f21041x, TabLayout.this.y, TabLayout.this.f21042z);
            setGravity(17);
            setOrientation(!TabLayout.this.V ? 1 : 0);
            setClickable(true);
            c0.k.d(this, w.b(getContext(), 1002));
        }

        private com.google.android.material.badge.a getBadge() {
            return this.f21050w;
        }

        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f21050w == null) {
                this.f21050w = new com.google.android.material.badge.a(getContext(), null);
            }
            b();
            com.google.android.material.badge.a aVar = this.f21050w;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            boolean z10;
            if (this.f21050w != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f21049v;
            if (view != null) {
                com.google.android.material.badge.a aVar = this.f21050w;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f21049v = null;
            }
        }

        public final void b() {
            boolean z10;
            f fVar;
            f fVar2;
            boolean z11 = true;
            if (this.f21050w != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            if (this.f21051x != null) {
                a();
                return;
            }
            ImageView imageView = this.f21048u;
            if (imageView != null && (fVar2 = this.f21046s) != null && fVar2.f21057a != null) {
                if (this.f21049v != imageView) {
                    a();
                    ImageView imageView2 = this.f21048u;
                    if (this.f21050w == null) {
                        z11 = false;
                    }
                    if (z11 && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        com.google.android.material.badge.a aVar = this.f21050w;
                        Rect rect = new Rect();
                        imageView2.getDrawingRect(rect);
                        aVar.setBounds(rect);
                        aVar.g(imageView2, null);
                        if (aVar.d() != null) {
                            aVar.d().setForeground(aVar);
                        } else {
                            imageView2.getOverlay().add(aVar);
                        }
                        this.f21049v = imageView2;
                        return;
                    }
                    return;
                }
                c(imageView);
                return;
            }
            TextView textView = this.f21047t;
            if (textView != null && (fVar = this.f21046s) != null && fVar.f == 1) {
                if (this.f21049v != textView) {
                    a();
                    TextView textView2 = this.f21047t;
                    if (this.f21050w == null) {
                        z11 = false;
                    }
                    if (z11 && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        com.google.android.material.badge.a aVar2 = this.f21050w;
                        Rect rect2 = new Rect();
                        textView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.g(textView2, null);
                        if (aVar2.d() != null) {
                            aVar2.d().setForeground(aVar2);
                        } else {
                            textView2.getOverlay().add(aVar2);
                        }
                        this.f21049v = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }

        public final void c(View view) {
            boolean z10;
            com.google.android.material.badge.a aVar = this.f21050w;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view == this.f21049v) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.g(view, null);
            }
        }

        public final void d() {
            boolean z10;
            f();
            f fVar = this.f21046s;
            boolean z11 = false;
            if (fVar != null) {
                TabLayout tabLayout = fVar.f21062g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == fVar.f21060d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z11);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.A;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.A.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.L;
            GradientDrawable gradientDrawable = null;
            if (i10 != 0) {
                Drawable a10 = g.a.a(context, i10);
                this.A = a10;
                if (a10 != null && a10.isStateful()) {
                    this.A.setState(getDrawableState());
                }
            } else {
                this.A = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (tabLayout.F != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a11 = a7.a.a(tabLayout.F);
                boolean z10 = tabLayout.f21021e0;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a11, gradientDrawable2, gradientDrawable);
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.q(this, gradientDrawable2);
            tabLayout.invalidate();
        }

        public final void f() {
            View view;
            int i10;
            ViewParent parent;
            f fVar = this.f21046s;
            if (fVar != null) {
                view = fVar.f21061e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f21051x;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f21051x);
                    }
                    addView(view);
                }
                this.f21051x = view;
                TextView textView = this.f21047t;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f21048u;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f21048u.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.y = textView2;
                if (textView2 != null) {
                    this.B = j.a.b(textView2);
                }
                this.f21052z = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f21051x;
                if (view3 != null) {
                    removeView(view3);
                    this.f21051x = null;
                }
                this.y = null;
                this.f21052z = null;
            }
            if (this.f21051x == null) {
                if (this.f21048u == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.hamkho.livefoot.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f21048u = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f21047t == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.hamkho.livefoot.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f21047t = textView3;
                    addView(textView3);
                    this.B = j.a.b(this.f21047t);
                }
                TextView textView4 = this.f21047t;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.A);
                if (isSelected() && (i10 = tabLayout.C) != -1) {
                    this.f21047t.setTextAppearance(i10);
                } else {
                    this.f21047t.setTextAppearance(tabLayout.B);
                }
                ColorStateList colorStateList = tabLayout.D;
                if (colorStateList != null) {
                    this.f21047t.setTextColor(colorStateList);
                }
                g(this.f21047t, this.f21048u, true);
                b();
                ImageView imageView3 = this.f21048u;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.e(this, imageView3));
                }
                TextView textView5 = this.f21047t;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.e(this, textView5));
                }
            } else {
                TextView textView6 = this.y;
                if (textView6 != null || this.f21052z != null) {
                    g(textView6, this.f21052z, false);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f21059c)) {
                setContentDescription(fVar.f21059c);
            }
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            Drawable drawable;
            CharSequence charSequence;
            int i10;
            CharSequence charSequence2;
            int i11;
            Drawable drawable2;
            f fVar = this.f21046s;
            CharSequence charSequence3 = null;
            if (fVar != null && (drawable2 = fVar.f21057a) != null) {
                drawable = drawable2.mutate();
            } else {
                drawable = null;
            }
            TabLayout tabLayout = TabLayout.this;
            if (drawable != null) {
                a.b.h(drawable, tabLayout.E);
                PorterDuff.Mode mode = tabLayout.I;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            f fVar2 = this.f21046s;
            if (fVar2 != null) {
                charSequence = fVar2.f21058b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z12 || this.f21046s.f != 1) {
                    z11 = false;
                }
                if (z12) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z11 && imageView.getVisibility() == 0) {
                    i10 = (int) n.b(8, getContext());
                } else {
                    i10 = 0;
                }
                if (tabLayout.V) {
                    if (i10 != n0.g.b(marginLayoutParams)) {
                        n0.g.g(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    n0.g.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f21046s;
            if (fVar3 != null) {
                charSequence3 = fVar3.f21059c;
            }
            if (!z12) {
                charSequence = charSequence3;
            }
            q0.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f21047t, this.f21048u, this.f21051x};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getTop());
                    } else {
                        i11 = view.getTop();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getBottom());
                    } else {
                        i10 = view.getBottom();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f21047t, this.f21048u, this.f21051x};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getLeft());
                    } else {
                        i11 = view.getLeft();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getRight());
                    } else {
                        i10 = view.getRight();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public f getTab() {
            return this.f21046s;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f21050w;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f21050w.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.c.a(0, 1, this.f21046s.f21060d, 1, isSelected()).f33536a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) g.a.f33524e.f33531a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.hamkho.livefoot.R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L31;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r3 = r2.getTabMaxWidth()
                if (r3 <= 0) goto L1c
                if (r1 == 0) goto L14
                if (r0 <= r3) goto L1c
            L14:
                int r8 = r2.M
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1c:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f21047t
                if (r0 == 0) goto L9d
                float r0 = r2.J
                int r1 = r7.B
                android.widget.ImageView r3 = r7.f21048u
                r4 = 1
                if (r3 == 0) goto L34
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L34
                r1 = r4
                goto L40
            L34:
                android.widget.TextView r3 = r7.f21047t
                if (r3 == 0) goto L40
                int r3 = r3.getLineCount()
                if (r3 <= r4) goto L40
                float r0 = r2.K
            L40:
                android.widget.TextView r3 = r7.f21047t
                float r3 = r3.getTextSize()
                android.widget.TextView r5 = r7.f21047t
                int r5 = r5.getLineCount()
                android.widget.TextView r6 = r7.f21047t
                int r6 = r0.j.a.b(r6)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 != 0) goto L5a
                if (r6 < 0) goto L9d
                if (r1 == r6) goto L9d
            L5a:
                int r2 = r2.U
                r6 = 0
                if (r2 != r4) goto L8e
                if (r3 <= 0) goto L8e
                if (r5 != r4) goto L8e
                android.widget.TextView r2 = r7.f21047t
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L8d
                float r3 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r3
                int r3 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r3 = r3 - r5
                int r5 = r7.getPaddingRight()
                int r3 = r3 - r5
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L8e
            L8d:
                r4 = r6
            L8e:
                if (r4 == 0) goto L9d
                android.widget.TextView r2 = r7.f21047t
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f21047t
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f21046s != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                f fVar = this.f21046s;
                TabLayout tabLayout = fVar.f21062g;
                if (tabLayout != null) {
                    tabLayout.k(fVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f21047t;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f21048u;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f21051x;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.f21046s) {
                this.f21046s = fVar;
                d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ViewPager.e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21054a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void a(ViewPager viewPager, p1.a aVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f21028l0 == viewPager) {
                tabLayout.l(aVar, this.f21054a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c<T extends f> {
        void a();

        void b(T t10);

        void c();
    }

    /* loaded from: classes2.dex */
    public interface d extends c<f> {
    }

    /* loaded from: classes2.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.i();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.i();
        }
    }

    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f21057a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f21058b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f21059c;

        /* renamed from: e, reason: collision with root package name */
        public View f21061e;

        /* renamed from: g, reason: collision with root package name */
        public TabLayout f21062g;

        /* renamed from: h, reason: collision with root package name */
        public TabView f21063h;

        /* renamed from: d, reason: collision with root package name */
        public int f21060d = -1;
        public final int f = 1;

        /* renamed from: i, reason: collision with root package name */
        public int f21064i = -1;

        public final void a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f21059c) && !TextUtils.isEmpty(charSequence)) {
                this.f21063h.setContentDescription(charSequence);
            }
            this.f21058b = charSequence;
            TabView tabView = this.f21063h;
            if (tabView != null) {
                tabView.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements ViewPager.f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TabLayout> f21065a;

        /* renamed from: b, reason: collision with root package name */
        public int f21066b;

        /* renamed from: c, reason: collision with root package name */
        public int f21067c;

        public g(TabLayout tabLayout) {
            this.f21065a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public final void a(int i10) {
            this.f21066b = this.f21067c;
            this.f21067c = i10;
            TabLayout tabLayout = this.f21065a.get();
            if (tabLayout != null) {
                tabLayout.f21034r0 = this.f21067c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public final void b(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f21065a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f21067c;
                if (i11 != 0 && (i11 != 2 || this.f21066b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.k(tabLayout.g(i10), z10);
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, com.hamkho.livefoot.R.attr.tabStyle, com.hamkho.livefoot.R.style.Widget_Design_TabLayout), attributeSet, com.hamkho.livefoot.R.attr.tabStyle);
        this.f21035s = -1;
        this.f21037t = new ArrayList<>();
        this.C = -1;
        this.H = 0;
        this.M = Integer.MAX_VALUE;
        this.f21019c0 = -1;
        this.f21025i0 = new ArrayList<>();
        this.f21036s0 = new s.d(12, 1);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f21039v = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = k.d(context2, attributeSet, androidx.activity.n.f512u0, com.hamkho.livefoot.R.attr.tabStyle, com.hamkho.livefoot.R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            d7.g gVar = new d7.g();
            gVar.k(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.i(context2);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            gVar.j(c0.i.i(this));
            c0.d.q(this, gVar);
        }
        setSelectedTabIndicator(z6.c.d(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        slidingTabIndicator.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.f21042z = dimensionPixelSize;
        this.y = dimensionPixelSize;
        this.f21041x = dimensionPixelSize;
        this.f21040w = dimensionPixelSize;
        this.f21040w = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f21041x = d10.getDimensionPixelSize(20, dimensionPixelSize);
        this.y = d10.getDimensionPixelSize(18, dimensionPixelSize);
        this.f21042z = d10.getDimensionPixelSize(17, dimensionPixelSize);
        if (z6.b.b(com.hamkho.livefoot.R.attr.isMaterial3Theme, context2, false)) {
            this.A = com.hamkho.livefoot.R.attr.textAppearanceTitleSmall;
        } else {
            this.A = com.hamkho.livefoot.R.attr.textAppearanceButton;
        }
        int resourceId = d10.getResourceId(24, com.hamkho.livefoot.R.style.TextAppearance_Design_Tab);
        this.B = resourceId;
        int[] iArr = a0.a.Y;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.J = dimensionPixelSize2;
            this.D = z6.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(22)) {
                this.C = d10.getResourceId(22, resourceId);
            }
            int i10 = this.C;
            if (i10 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i10, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a10 = z6.c.a(context2, obtainStyledAttributes, 3);
                    if (a10 != null) {
                        this.D = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{a10.getColorForState(new int[]{R.attr.state_selected}, a10.getDefaultColor()), this.D.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (d10.hasValue(25)) {
                this.D = z6.c.a(context2, d10, 25);
            }
            if (d10.hasValue(23)) {
                this.D = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d10.getColor(23, 0), this.D.getDefaultColor()});
            }
            this.E = z6.c.a(context2, d10, 3);
            this.I = n.f(d10.getInt(4, -1), null);
            this.F = z6.c.a(context2, d10, 21);
            this.S = d10.getInt(6, 300);
            this.f21023g0 = w6.a.d(context2, com.hamkho.livefoot.R.attr.motionEasingEmphasizedInterpolator, h6.a.f28769b);
            this.N = d10.getDimensionPixelSize(14, -1);
            this.O = d10.getDimensionPixelSize(13, -1);
            this.L = d10.getResourceId(0, 0);
            this.Q = d10.getDimensionPixelSize(1, 0);
            this.U = d10.getInt(15, 1);
            this.R = d10.getInt(2, 0);
            this.V = d10.getBoolean(12, false);
            this.f21021e0 = d10.getBoolean(26, false);
            d10.recycle();
            Resources resources = getResources();
            this.K = resources.getDimensionPixelSize(com.hamkho.livefoot.R.dimen.design_tab_text_size_2line);
            this.P = resources.getDimensionPixelSize(com.hamkho.livefoot.R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList<f> arrayList = this.f21037t;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                f fVar = arrayList.get(i10);
                if (fVar != null && fVar.f21057a != null && !TextUtils.isEmpty(fVar.f21058b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (z10 && !this.V) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.N;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.U;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.P;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f21039v.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        boolean z10;
        boolean z11;
        SlidingTabIndicator slidingTabIndicator = this.f21039v;
        int childCount = slidingTabIndicator.getChildCount();
        if (i10 < childCount) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = slidingTabIndicator.getChildAt(i11);
                boolean z12 = true;
                if ((i11 == i10 && !childAt.isSelected()) || (i11 != i10 && childAt.isSelected())) {
                    if (i11 == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                } else {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                }
            }
        }
    }

    public final void a(f fVar, boolean z10) {
        ArrayList<f> arrayList = this.f21037t;
        int size = arrayList.size();
        if (fVar.f21062g == this) {
            fVar.f21060d = size;
            arrayList.add(size, fVar);
            int size2 = arrayList.size();
            int i10 = -1;
            for (int i11 = size + 1; i11 < size2; i11++) {
                if (arrayList.get(i11).f21060d == this.f21035s) {
                    i10 = i11;
                }
                arrayList.get(i11).f21060d = i11;
            }
            this.f21035s = i10;
            TabView tabView = fVar.f21063h;
            tabView.setSelected(false);
            tabView.setActivated(false);
            int i12 = fVar.f21060d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.U == 1 && this.R == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = gl.Code;
            }
            this.f21039v.addView(tabView, i12, layoutParams);
            if (z10) {
                TabLayout tabLayout = fVar.f21062g;
                if (tabLayout != null) {
                    tabLayout.k(fVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            f h10 = h();
            CharSequence charSequence = tabItem.f21015s;
            if (charSequence != null) {
                h10.a(charSequence);
            }
            Drawable drawable = tabItem.f21016t;
            if (drawable != null) {
                h10.f21057a = drawable;
                TabLayout tabLayout = h10.f21062g;
                if (tabLayout.R == 1 || tabLayout.U == 2) {
                    tabLayout.o(true);
                }
                TabView tabView = h10.f21063h;
                if (tabView != null) {
                    tabView.d();
                }
            }
            int i10 = tabItem.f21017u;
            if (i10 != 0) {
                h10.f21061e = LayoutInflater.from(h10.f21063h.getContext()).inflate(i10, (ViewGroup) h10.f21063h, false);
                TabView tabView2 = h10.f21063h;
                if (tabView2 != null) {
                    tabView2.d();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                h10.f21059c = tabItem.getContentDescription();
                TabView tabView3 = h10.f21063h;
                if (tabView3 != null) {
                    tabView3.d();
                }
            }
            a(h10, this.f21037t.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void c(int i10) {
        boolean z10;
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.g.c(this)) {
                SlidingTabIndicator slidingTabIndicator = this.f21039v;
                int childCount = slidingTabIndicator.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        if (slidingTabIndicator.getChildAt(i11).getWidth() <= 0) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int e10 = e(gl.Code, i10);
                    if (scrollX != e10) {
                        f();
                        this.f21027k0.setIntValues(scrollX, e10);
                        this.f21027k0.start();
                    }
                    ValueAnimator valueAnimator = slidingTabIndicator.f21044s;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f21035s != i10) {
                        slidingTabIndicator.f21044s.cancel();
                    }
                    slidingTabIndicator.d(i10, this.S, true);
                    return;
                }
            }
        }
        m(i10, gl.Code, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.U
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.Q
            int r3 = r5.f21040w
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap<android.view.View, n0.l0> r3 = n0.c0.f33054a
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r5.f21039v
            n0.c0.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.U
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.R
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.R
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(float f10, int i10) {
        SlidingTabIndicator slidingTabIndicator;
        View childAt;
        View view;
        int i11 = this.U;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = (slidingTabIndicator = this.f21039v).getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < slidingTabIndicator.getChildCount()) {
            view = slidingTabIndicator.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + i12) * 0.5f * f10);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(this) == 0) {
            return left + i14;
        }
        return left - i14;
    }

    public final void f() {
        if (this.f21027k0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f21027k0 = valueAnimator;
            valueAnimator.setInterpolator(this.f21023g0);
            this.f21027k0.setDuration(this.S);
            this.f21027k0.addUpdateListener(new a());
        }
    }

    public final f g(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return this.f21037t.get(i10);
        }
        return null;
    }

    public int getSelectedTabPosition() {
        f fVar = this.f21038u;
        if (fVar != null) {
            return fVar.f21060d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f21037t.size();
    }

    public int getTabGravity() {
        return this.R;
    }

    public ColorStateList getTabIconTint() {
        return this.E;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f21020d0;
    }

    public int getTabIndicatorGravity() {
        return this.T;
    }

    public int getTabMaxWidth() {
        return this.M;
    }

    public int getTabMode() {
        return this.U;
    }

    public ColorStateList getTabRippleColor() {
        return this.F;
    }

    public Drawable getTabSelectedIndicator() {
        return this.G;
    }

    public ColorStateList getTabTextColors() {
        return this.D;
    }

    public final f h() {
        TabView tabView;
        f fVar = (f) f21018t0.b();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.f21062g = this;
        s.d dVar = this.f21036s0;
        if (dVar != null) {
            tabView = (TabView) dVar.b();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(fVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f21059c)) {
            tabView.setContentDescription(fVar.f21058b);
        } else {
            tabView.setContentDescription(fVar.f21059c);
        }
        fVar.f21063h = tabView;
        int i10 = fVar.f21064i;
        if (i10 != -1) {
            tabView.setId(i10);
        }
        return fVar;
    }

    public final void i() {
        int currentItem;
        j();
        p1.a aVar = this.f21029m0;
        if (aVar != null) {
            int a10 = aVar.a();
            for (int i10 = 0; i10 < a10; i10++) {
                f h10 = h();
                this.f21029m0.getClass();
                h10.a(null);
                a(h10, false);
            }
            ViewPager viewPager = this.f21028l0;
            if (viewPager != null && a10 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                k(g(currentItem), true);
            }
        }
    }

    public final void j() {
        SlidingTabIndicator slidingTabIndicator = this.f21039v;
        for (int childCount = slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            TabView tabView = (TabView) slidingTabIndicator.getChildAt(childCount);
            slidingTabIndicator.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f21036s0.a(tabView);
            }
            requestLayout();
        }
        Iterator<f> it = this.f21037t.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f21062g = null;
            next.f21063h = null;
            next.f21057a = null;
            next.f21064i = -1;
            next.f21058b = null;
            next.f21059c = null;
            next.f21060d = -1;
            next.f21061e = null;
            f21018t0.a(next);
        }
        this.f21038u = null;
    }

    public final void k(f fVar, boolean z10) {
        int i10;
        f fVar2 = this.f21038u;
        ArrayList<c> arrayList = this.f21025i0;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
                c(fVar.f21060d);
                return;
            }
            return;
        }
        if (fVar != null) {
            i10 = fVar.f21060d;
        } else {
            i10 = -1;
        }
        if (z10) {
            if ((fVar2 == null || fVar2.f21060d == -1) && i10 != -1) {
                m(i10, gl.Code, true, true);
            } else {
                c(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f21038u = fVar;
        if (fVar2 != null && fVar2.f21062g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c();
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).b(fVar);
            }
        }
    }

    public final void l(p1.a aVar, boolean z10) {
        e eVar;
        p1.a aVar2 = this.f21029m0;
        if (aVar2 != null && (eVar = this.f21030n0) != null) {
            aVar2.f34229a.unregisterObserver(eVar);
        }
        this.f21029m0 = aVar;
        if (z10 && aVar != null) {
            if (this.f21030n0 == null) {
                this.f21030n0 = new e();
            }
            aVar.f34229a.registerObserver(this.f21030n0);
        }
        i();
    }

    public final void m(int i10, float f10, boolean z10, boolean z11) {
        int e10;
        float f11 = i10 + f10;
        int round = Math.round(f11);
        if (round >= 0) {
            SlidingTabIndicator slidingTabIndicator = this.f21039v;
            if (round < slidingTabIndicator.getChildCount()) {
                if (z11) {
                    slidingTabIndicator.getClass();
                    TabLayout.this.f21035s = Math.round(f11);
                    ValueAnimator valueAnimator = slidingTabIndicator.f21044s;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        slidingTabIndicator.f21044s.cancel();
                    }
                    slidingTabIndicator.c(slidingTabIndicator.getChildAt(i10), f10, slidingTabIndicator.getChildAt(i10 + 1));
                }
                ValueAnimator valueAnimator2 = this.f21027k0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f21027k0.cancel();
                }
                if (i10 < 0) {
                    e10 = 0;
                } else {
                    e10 = e(f10, i10);
                }
                scrollTo(e10, 0);
                if (z10) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void n(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f21028l0;
        if (viewPager2 != null) {
            g gVar = this.f21031o0;
            if (gVar != null && (arrayList2 = viewPager2.P) != null) {
                arrayList2.remove(gVar);
            }
            b bVar = this.f21032p0;
            if (bVar != null && (arrayList = this.f21028l0.S) != null) {
                arrayList.remove(bVar);
            }
        }
        h hVar = this.f21026j0;
        ArrayList<c> arrayList3 = this.f21025i0;
        if (hVar != null) {
            arrayList3.remove(hVar);
            this.f21026j0 = null;
        }
        if (viewPager != null) {
            this.f21028l0 = viewPager;
            if (this.f21031o0 == null) {
                this.f21031o0 = new g(this);
            }
            g gVar2 = this.f21031o0;
            gVar2.f21067c = 0;
            gVar2.f21066b = 0;
            if (viewPager.P == null) {
                viewPager.P = new ArrayList();
            }
            viewPager.P.add(gVar2);
            h hVar2 = new h(viewPager);
            this.f21026j0 = hVar2;
            if (!arrayList3.contains(hVar2)) {
                arrayList3.add(hVar2);
            }
            p1.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                l(adapter, true);
            }
            if (this.f21032p0 == null) {
                this.f21032p0 = new b();
            }
            b bVar2 = this.f21032p0;
            bVar2.f21054a = true;
            if (viewPager.S == null) {
                viewPager.S = new ArrayList();
            }
            viewPager.S.add(bVar2);
            m(viewPager.getCurrentItem(), gl.Code, true, true);
        } else {
            this.f21028l0 = null;
            l(null, false);
        }
        this.f21033q0 = z10;
    }

    public final void o(boolean z10) {
        int i10 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f21039v;
            if (i10 < slidingTabIndicator.getChildCount()) {
                View childAt = slidingTabIndicator.getChildAt(i10);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.U == 1 && this.R == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = gl.Code;
                }
                if (z10) {
                    childAt.requestLayout();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.activity.n.K0(this);
        if (this.f21028l0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f21033q0) {
            setupWithViewPager(null);
            this.f21033q0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.f21039v;
            if (i10 < slidingTabIndicator.getChildCount()) {
                View childAt = slidingTabIndicator.getChildAt(i10);
                if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).A) != null) {
                    drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                    tabView.A.draw(canvas);
                }
                i10++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, getTabCount(), 1).f33535a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (getTabMode() != 0 && getTabMode() != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.n.b(r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.O
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.n.b(r2, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.M = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.U
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() != 0 && getTabMode() != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        androidx.activity.n.J0(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            int i10 = 0;
            while (true) {
                SlidingTabIndicator slidingTabIndicator = this.f21039v;
                if (i10 < slidingTabIndicator.getChildCount()) {
                    View childAt = slidingTabIndicator.getChildAt(i10);
                    if (childAt instanceof TabView) {
                        TabView tabView = (TabView) childAt;
                        tabView.setOrientation(!TabLayout.this.V ? 1 : 0);
                        TextView textView = tabView.y;
                        if (textView == null && tabView.f21052z == null) {
                            tabView.g(tabView.f21047t, tabView.f21048u, true);
                        } else {
                            tabView.g(textView, tabView.f21052z, false);
                        }
                    }
                    i10++;
                } else {
                    d();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f21027k0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.G = mutate;
        int i10 = this.H;
        if (i10 != 0) {
            a.b.g(mutate, i10);
        } else {
            a.b.h(mutate, null);
        }
        int i11 = this.f21019c0;
        if (i11 == -1) {
            i11 = this.G.getIntrinsicHeight();
        }
        this.f21039v.b(i11);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        boolean z10;
        this.H = i10;
        Drawable drawable = this.G;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a.b.g(drawable, i10);
        } else {
            a.b.h(drawable, null);
        }
        o(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.T != i10) {
            this.T = i10;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this.f21039v);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f21019c0 = i10;
        this.f21039v.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.R != i10) {
            this.R = i10;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            ArrayList<f> arrayList = this.f21037t;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = arrayList.get(i10).f21063h;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(d0.a.b(i10, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f21020d0 = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f21022f0 = new com.google.android.material.tabs.b();
                    return;
                }
                throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
            }
            this.f21022f0 = new com.google.android.material.tabs.a();
            return;
        }
        this.f21022f0 = new com.google.android.material.tabs.c();
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.W = z10;
        int i10 = SlidingTabIndicator.f21043u;
        SlidingTabIndicator slidingTabIndicator = this.f21039v;
        slidingTabIndicator.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.k(slidingTabIndicator);
    }

    public void setTabMode(int i10) {
        if (i10 != this.U) {
            this.U = i10;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            int i10 = 0;
            while (true) {
                SlidingTabIndicator slidingTabIndicator = this.f21039v;
                if (i10 < slidingTabIndicator.getChildCount()) {
                    View childAt = slidingTabIndicator.getChildAt(i10);
                    if (childAt instanceof TabView) {
                        Context context = getContext();
                        int i11 = TabView.D;
                        ((TabView) childAt).e(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(d0.a.b(i10, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            ArrayList<f> arrayList = this.f21037t;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = arrayList.get(i10).f21063h;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(p1.a aVar) {
        l(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f21021e0 != z10) {
            this.f21021e0 = z10;
            int i10 = 0;
            while (true) {
                SlidingTabIndicator slidingTabIndicator = this.f21039v;
                if (i10 < slidingTabIndicator.getChildCount()) {
                    View childAt = slidingTabIndicator.getChildAt(i10);
                    if (childAt instanceof TabView) {
                        Context context = getContext();
                        int i11 = TabView.D;
                        ((TabView) childAt).e(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        n(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f21024h0;
        ArrayList<c> arrayList = this.f21025i0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.f21024h0 = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(g.a.a(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f21068a;

        public h(ViewPager viewPager) {
            this.f21068a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(f fVar) {
            this.f21068a.setCurrentItem(fVar.f21060d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c() {
        }
    }
}
