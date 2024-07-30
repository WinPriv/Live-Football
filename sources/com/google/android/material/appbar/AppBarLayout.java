package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import g0.a;
import i6.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.n;
import o0.g;
import q.i;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public WeakReference<View> E;
    public ValueAnimator F;
    public int[] G;
    public Drawable H;
    public Behavior I;

    /* renamed from: s, reason: collision with root package name */
    public int f20422s;

    /* renamed from: t, reason: collision with root package name */
    public int f20423t;

    /* renamed from: u, reason: collision with root package name */
    public int f20424u;

    /* renamed from: v, reason: collision with root package name */
    public int f20425v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20426w;

    /* renamed from: x, reason: collision with root package name */
    public int f20427x;
    public ArrayList y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20428z;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends i6.d<T> {

        /* renamed from: j, reason: collision with root package name */
        public int f20429j;

        /* renamed from: k, reason: collision with root package name */
        public int f20430k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f20431l;

        /* renamed from: m, reason: collision with root package name */
        public SavedState f20432m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference<View> f20433n;
        public boolean o;

        /* loaded from: classes2.dex */
        public class a extends n0.a {
            public a() {
            }

            @Override // n0.a
            public final void d(View view, g gVar) {
                View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                gVar.i(BaseBehavior.this.o);
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                        return;
                    }
                    return;
                }
                if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof n) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void I(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$d r1 = (com.google.android.material.appbar.AppBarLayout.d) r1
                int r1 = r1.f20441a
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap<android.view.View, n0.l0> r3 = n0.c0.f33054a
                int r3 = n0.c0.d.d(r5)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = r0
                goto L5f
            L5e:
                r9 = r2
            L5f:
                boolean r10 = r8.C
                if (r10 == 0) goto L6b
                android.view.View r9 = D(r7)
                boolean r9 = r8.e(r9)
            L6b:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto Laf
                if (r9 == 0) goto Lb2
                m2.g r9 = r7.f1521t
                java.lang.Object r9 = r9.f32646t
                q.i r9 = (q.i) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f1523v
                r7.clear()
                if (r9 == 0) goto L89
                r7.addAll(r9)
            L89:
                int r9 = r7.size()
                r10 = r2
            L8e:
                if (r10 >= r9) goto Lad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1530a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto Laa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f
                if (r7 == 0) goto Lad
                r2 = r0
                goto Lad
            Laa:
                int r10 = r10 + 1
                goto L8e
            Lad:
                if (r2 == 0) goto Lb2
            Laf:
                r8.jumpDrawablesToCurrentState()
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.I(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int height;
            int abs = Math.abs(x() - i10);
            float abs2 = Math.abs(gl.Code);
            if (abs2 > gl.Code) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int x10 = x();
            if (x10 == i10) {
                ValueAnimator valueAnimator = this.f20431l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f20431l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f20431l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f20431l = valueAnimator3;
                valueAnimator3.setInterpolator(h6.a.f28772e);
                this.f20431l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f20431l.setDuration(Math.min(height, 600));
            this.f20431l.setIntValues(x10, i10);
            this.f20431l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    i12 = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                int i13 = i11;
                int i14 = i12;
                if (i13 != i14) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i10, i13, i14);
                }
            }
            if (appBarLayout.C) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public final SavedState F(Parcelable parcelable, T t10) {
            boolean z10;
            boolean z11;
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f1594t;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (s10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    savedState.f20435v = z10;
                    if (!z10 && (-s10) >= t10.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    savedState.f20434u = z11;
                    savedState.f20436w = i10;
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    if (bottom == t10.getTopInset() + c0.d.d(childAt)) {
                        z12 = true;
                    }
                    savedState.y = z12;
                    savedState.f20437x = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int x10 = x() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 < childCount) {
                    View childAt = t10.getChildAt(i10);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    d dVar = (d) childAt.getLayoutParams();
                    if ((dVar.f20441a & 32) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    int i11 = -x10;
                    if (top <= i11 && bottom >= i11) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i12 = dVar2.f20441a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                        if (c0.d.b(t10) && c0.d.b(childAt2)) {
                            i13 -= t10.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                        i14 += c0.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, l0> weakHashMap3 = c0.f33054a;
                            int d10 = c0.d.d(childAt2) + i14;
                            if (x10 < d10) {
                                i13 = d10;
                            } else {
                                i14 = d10;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i13 += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (x10 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    B(coordinatorLayout, t10, a0.a.B0(i13 + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t10) {
            View view;
            boolean z10;
            boolean z11;
            boolean z12;
            c0.i(g.a.f.a(), coordinatorLayout);
            boolean z13 = false;
            c0.g(0, coordinatorLayout);
            c0.i(g.a.f33525g.a(), coordinatorLayout);
            c0.g(0, coordinatorLayout);
            if (t10.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    view = coordinatorLayout.getChildAt(i10);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).f1530a instanceof ScrollingViewBehavior) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t10.getChildCount();
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 < childCount2) {
                    if (((d) t10.getChildAt(i11).getLayoutParams()).f20441a != 0) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return;
            }
            if (c0.c(coordinatorLayout) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                c0.l(coordinatorLayout, new a());
            }
            if (x() != (-t10.getTotalScrollRange())) {
                c0.j(coordinatorLayout, g.a.f, new com.google.android.material.appbar.c(t10, false));
                z13 = true;
            }
            if (x() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i12 = -t10.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        c0.j(coordinatorLayout, g.a.f33525g, new com.google.android.material.appbar.b(this, coordinatorLayout, t10, view2, i12));
                    }
                } else {
                    c0.j(coordinatorLayout, g.a.f33525g, new com.google.android.material.appbar.c(t10, true));
                }
                this.o = z10;
            }
            z10 = z13;
            this.o = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v12, types: [i6.a] */
        @Override // i6.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f20432m;
            if (savedState != null && (pendingAction & 8) == 0) {
                if (savedState.f20434u) {
                    A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (savedState.f20435v) {
                    A(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(savedState.f20436w);
                    int i11 = -childAt.getBottom();
                    if (this.f20432m.y) {
                        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                        round = appBarLayout.getTopInset() + c0.d.d(childAt) + i11;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f20432m.f20437x) + i11;
                    }
                    A(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i12 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, i12);
                    } else {
                        A(coordinatorLayout, appBarLayout, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f20427x = 0;
            this.f20432m = null;
            int B0 = a0.a.B0(s(), -appBarLayout.getTotalScrollRange(), 0);
            i6.g gVar = this.f29189a;
            if (gVar != null) {
                gVar.b(B0);
            } else {
                this.f29190b = B0;
            }
            I(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.c(s());
            H(coordinatorLayout, appBarLayout);
            final View D = D(coordinatorLayout);
            if (D != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    D.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: i6.a
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = D;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    D.setOnKeyListener(new View.OnKeyListener() { // from class: i6.b
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, D, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.t(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = z(coordinatorLayout, appBarLayout, x() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = this.f20432m;
                this.f20432m = (SavedState) parcelable;
            } else {
                this.f20432m = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState F = F(absSavedState, (AppBarLayout) view);
            if (F != null) {
                return F;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if (r2 != false) goto L16;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.C
                r0 = 1
                if (r5 != 0) goto L2b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = r0
                goto L15
            L14:
                r5 = r6
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = r0
                goto L29
            L28:
                r2 = r6
            L29:
                if (r2 == 0) goto L2c
            L2b:
                r6 = r0
            L2c:
                if (r6 == 0) goto L35
                android.animation.ValueAnimator r2 = r1.f20431l
                if (r2 == 0) goto L35
                r2.cancel()
            L35:
                r2 = 0
                r1.f20433n = r2
                r1.f20430k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f20430k == 0 || i10 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.C) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f20433n = new WeakReference<>(view2);
        }

        @Override // i6.d
        public final boolean u(View view) {
            View view2;
            WeakReference<View> weakReference = this.f20433n;
            if (weakReference != null && ((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                return false;
            }
            return true;
        }

        @Override // i6.d
        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // i6.d
        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // i6.d
        public final int x() {
            return s() + this.f20429j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i6.d
        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.C) {
                appBarLayout.d(appBarLayout.e(D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i6.d
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            boolean z10;
            int i14;
            List list;
            int i15;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int x10 = x();
            int i16 = 0;
            if (i11 != 0 && x10 >= i11 && x10 <= i12) {
                int B0 = a0.a.B0(i10, i11, i12);
                if (x10 != B0) {
                    if (appBarLayout.f20426w) {
                        int abs = Math.abs(B0);
                        int childCount = appBarLayout.getChildCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i17);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.f20443c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i18 = dVar.f20441a;
                                    if ((i18 & 1) != 0) {
                                        i15 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + 0;
                                        if ((i18 & 2) != 0) {
                                            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                                            i15 -= c0.d.d(childAt);
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                                    if (c0.d.b(childAt)) {
                                        i15 -= appBarLayout.getTopInset();
                                    }
                                    if (i15 > 0) {
                                        float f = i15;
                                        i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(B0);
                                    }
                                }
                            } else {
                                i17++;
                            }
                        }
                    }
                    i13 = B0;
                    i6.g gVar = this.f29189a;
                    if (gVar != null) {
                        z10 = gVar.b(i13);
                    } else {
                        this.f29190b = i13;
                        z10 = false;
                    }
                    int i19 = x10 - B0;
                    this.f20429j = B0 - i13;
                    int i20 = 1;
                    if (z10) {
                        int i21 = 0;
                        while (i21 < appBarLayout.getChildCount()) {
                            d dVar2 = (d) appBarLayout.getChildAt(i21).getLayoutParams();
                            c cVar = dVar2.f20442b;
                            if (cVar != null && (dVar2.f20441a & i20) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i21);
                                float s10 = s();
                                Rect rect = cVar.f20439a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect.top - Math.abs(s10);
                                float f10 = gl.Code;
                                if (abs2 <= gl.Code) {
                                    float abs3 = Math.abs(abs2 / rect.height());
                                    if (abs3 >= gl.Code) {
                                        if (abs3 > 1.0f) {
                                            f10 = 1.0f;
                                        } else {
                                            f10 = abs3;
                                        }
                                    }
                                    float f11 = 1.0f - f10;
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (f11 * f11)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = cVar.f20440b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    WeakHashMap<View, l0> weakHashMap3 = c0.f33054a;
                                    c0.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, l0> weakHashMap4 = c0.f33054a;
                                    c0.f.c(childAt2, null);
                                    childAt2.setTranslationY(gl.Code);
                                }
                            }
                            i21++;
                            i20 = 1;
                        }
                    }
                    if (!z10 && appBarLayout.f20426w && (list = (List) ((i) coordinatorLayout.f1521t.f32646t).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            View view2 = (View) list.get(i22);
                            CoordinatorLayout.c cVar2 = ((CoordinatorLayout.f) view2.getLayoutParams()).f1530a;
                            if (cVar2 != null) {
                                cVar2.d(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.c(s());
                    if (B0 < x10) {
                        i14 = -1;
                    } else {
                        i14 = 1;
                    }
                    I(coordinatorLayout, appBarLayout, B0, i14, false);
                    i16 = i19;
                }
            } else {
                this.f20429j = 0;
            }
            H(coordinatorLayout, appBarLayout);
            return i16;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: u, reason: collision with root package name */
            public boolean f20434u;

            /* renamed from: v, reason: collision with root package name */
            public boolean f20435v;

            /* renamed from: w, reason: collision with root package name */
            public int f20436w;

            /* renamed from: x, reason: collision with root package name */
            public float f20437x;
            public boolean y;

            /* loaded from: classes2.dex */
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
                this.f20434u = parcel.readByte() != 0;
                this.f20435v = parcel.readByte() != 0;
                this.f20436w = parcel.readInt();
                this.f20437x = parcel.readFloat();
                this.y = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f1595s, i10);
                parcel.writeByte(this.f20434u ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f20435v ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f20436w);
                parcel.writeFloat(this.f20437x);
                parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int B0;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1530a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f20429j + this.f29188e;
                if (this.f == 0) {
                    B0 = 0;
                } else {
                    float v3 = v(view2);
                    int i10 = this.f;
                    B0 = a0.a.B0((int) (v3 * i10), 0, i10);
                }
                int i11 = bottom - B0;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                view.offsetTopAndBottom(i11);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.C) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                c0.i(g.a.f.a(), coordinatorLayout);
                c0.g(0, coordinatorLayout);
                c0.i(g.a.f33525g.a(), coordinatorLayout);
                c0.g(0, coordinatorLayout);
                c0.l(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList f = coordinatorLayout.f(view);
            int size = f.size();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    View view2 = (View) f.get(i11);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i11++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f29186c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    if (!z10) {
                        i10 = 4;
                    }
                    appBarLayout.f20427x = 2 | i10 | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // i6.e
        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // i6.e
        public final float v(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1530a;
                if (cVar instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) cVar).x();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i10 / i11) + 1.0f;
                }
            }
            return gl.Code;
        }

        @Override // i6.e
        public final int w(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.activity.n.f504p0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public interface a<T extends AppBarLayout> {
        void a(int i10);
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
    }

    /* loaded from: classes2.dex */
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f20439a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f20440b = new Rect();
    }

    public static d a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public final void b() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.I;
        if (behavior != null && this.f20423t != -1 && this.f20427x == 0) {
            savedState = behavior.F(AbsSavedState.f1594t, this);
        } else {
            savedState = null;
        }
        this.f20423t = -1;
        this.f20424u = -1;
        this.f20425v = -1;
        if (savedState != null) {
            Behavior behavior2 = this.I;
            if (behavior2.f20432m == null) {
                behavior2.f20432m = savedState;
            }
        }
    }

    public final void c(int i10) {
        this.f20422s = i10;
        if (!willNotDraw()) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this);
        }
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.y.get(i11);
                if (aVar != null) {
                    aVar.a(i10);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final boolean d(boolean z10) {
        if ((!this.f20428z) && this.B != z10) {
            this.B = z10;
            refreshDrawableState();
            if (!this.C || !(getBackground() instanceof d7.g)) {
                return true;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, gl.Code);
            this.F = ofFloat;
            ofFloat.setDuration(0L);
            this.F.setInterpolator(null);
            this.F.start();
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.H != null && getTopInset() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(gl.Code, -this.f20422s);
            this.H.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.E == null && (i10 = this.D) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.D);
            }
            if (view2 != null) {
                this.E = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.E;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.d.b(childAt)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.I = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f20424u
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$d r4 = (com.google.android.material.appbar.AppBarLayout.d) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f20441a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, n0.l0> r4 = n0.c0.f33054a
            int r4 = n0.c0.d.d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, n0.l0> r4 = n0.c0.f33054a
            int r4 = n0.c0.d.d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap<android.view.View, n0.l0> r6 = n0.c0.f33054a
            boolean r3 = n0.c0.d.b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f20424u = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f20425v;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
                int i13 = dVar.f20441a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    i12 -= c0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f20425v = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.D;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int d10 = c0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = c0.d.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f20427x;
    }

    public Drawable getStatusBarForeground() {
        return this.H;
    }

    @Deprecated
    public float getTargetElevation() {
        return gl.Code;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f20423t;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = dVar.f20441a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + i12;
                if (i11 == 0) {
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    if (c0.d.b(childAt)) {
                        i14 -= getTopInset();
                    }
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                    i12 -= c0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f20423t = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.activity.n.K0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.G == null) {
            this.G = new int[4];
        }
        int[] iArr = this.G;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.A;
        if (z10) {
            i11 = R.attr.state_liftable;
        } else {
            i11 = -2130969752;
        }
        iArr[0] = i11;
        if (z10 && this.B) {
            i12 = R.attr.state_lifted;
        } else {
            i12 = -2130969753;
        }
        iArr[1] = i12;
        if (z10) {
            i13 = R.attr.state_collapsible;
        } else {
            i13 = -2130969748;
        }
        iArr[2] = i13;
        if (z10 && this.B) {
            i14 = R.attr.state_collapsed;
        } else {
            i14 = -2130969747;
        }
        iArr[3] = i14;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.E = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        boolean z13 = true;
        if (c0.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f20426w = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i14).getLayoutParams()).f20443c != null) {
                this.f20426w = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f20428z) {
            if (!this.C) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount3) {
                        int i16 = ((d) getChildAt(i15).getLayoutParams()).f20441a;
                        if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    z13 = false;
                }
            }
            if (this.A != z13) {
                this.A = z13;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = a0.a.B0(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        androidx.activity.n.J0(this, f);
    }

    public void setExpanded(boolean z10) {
        int i10;
        int i11;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        boolean c10 = c0.g.c(this);
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        if (c10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f20427x = i10 | i11 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z10) {
        this.C = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.D = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.E;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.E = null;
            return;
        }
        this.E = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.D = i10;
        WeakReference<View> weakReference = this.E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.E = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f20428z = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.H;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.H = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.H.setState(getDrawableState());
                }
                Drawable drawable4 = this.H;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                a.c.b(drawable4, c0.e.d(this));
                Drawable drawable5 = this.H;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.H.setCallback(this);
            }
            if (this.H != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            c0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(g.a.a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130969753}, ObjectAnimator.ofFloat(this, "elevation", gl.Code).setDuration(j10));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", gl.Code).setDuration(0L));
        setStateListAnimator(stateListAnimator);
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
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.H) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f20441a;

        /* renamed from: b, reason: collision with root package name */
        public c f20442b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f20443c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20441a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.activity.n.K);
            this.f20441a = obtainStyledAttributes.getInt(1, 0);
            this.f20442b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new c();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f20443c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public d() {
            super(-1, -2);
            this.f20441a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20441a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f20441a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20441a = 1;
        }
    }
}
