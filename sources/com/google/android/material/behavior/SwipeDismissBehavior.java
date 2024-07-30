package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.expressad.exoplayer.h.o;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.g;
import t0.c;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public c f20498a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20500c;

    /* renamed from: d, reason: collision with root package name */
    public int f20501d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f20502e = 0.5f;
    public float f = gl.Code;

    /* renamed from: g, reason: collision with root package name */
    public float f20503g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final a f20504h = new a();

    /* loaded from: classes2.dex */
    public class a extends c.AbstractC0485c {

        /* renamed from: a, reason: collision with root package name */
        public int f20505a;

        /* renamed from: b, reason: collision with root package name */
        public int f20506b = -1;

        public a() {
        }

        @Override // t0.c.AbstractC0485c
        public final int a(int i10, View view) {
            boolean z10;
            int width;
            int width2;
            int width3;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = SwipeDismissBehavior.this.f20501d;
            if (i11 == 0) {
                if (z10) {
                    width = this.f20505a - view.getWidth();
                    width2 = this.f20505a;
                } else {
                    width = this.f20505a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 == 1) {
                if (z10) {
                    width = this.f20505a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f20505a - view.getWidth();
                    width2 = this.f20505a;
                }
            } else {
                width = this.f20505a - view.getWidth();
                width2 = view.getWidth() + this.f20505a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // t0.c.AbstractC0485c
        public final int b(int i10, View view) {
            return view.getTop();
        }

        @Override // t0.c.AbstractC0485c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // t0.c.AbstractC0485c
        public final void e(int i10, View view) {
            this.f20506b = i10;
            this.f20505a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f20500c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f20500c = false;
            }
        }

        @Override // t0.c.AbstractC0485c
        public final void f(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // t0.c.AbstractC0485c
        public final void g(View view, int i10, int i11) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.f;
            float width2 = view.getWidth() * swipeDismissBehavior.f20503g;
            float abs = Math.abs(i10 - this.f20505a);
            if (abs <= f) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(gl.Code);
            } else {
                view.setAlpha(Math.min(Math.max(gl.Code, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
        
            if (java.lang.Math.abs(r9.getLeft() - r8.f20505a) >= java.lang.Math.round(r9.getWidth() * r3.f20502e)) goto L27;
         */
        @Override // t0.c.AbstractC0485c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f20506b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, n0.l0> r5 = n0.c0.f33054a
                int r5 = n0.c0.e.d(r9)
                if (r5 != r2) goto L1a
                r5 = r2
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r3.f20501d
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L2a:
                if (r1 <= 0) goto L54
                goto L52
            L2d:
                if (r6 != r2) goto L54
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L54
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f20505a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r3.f20502e
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L54
            L52:
                r1 = r2
                goto L55
            L54:
                r1 = r4
            L55:
                if (r1 == 0) goto L6b
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L66
                int r10 = r9.getLeft()
                int r0 = r8.f20505a
                if (r10 >= r0) goto L64
                goto L66
            L64:
                int r0 = r0 + r11
                goto L6e
            L66:
                int r10 = r8.f20505a
                int r0 = r10 - r11
                goto L6e
            L6b:
                int r0 = r8.f20505a
                r2 = r4
            L6e:
                t0.c r10 = r3.f20498a
                int r11 = r9.getTop()
                boolean r10 = r10.q(r0, r11)
                if (r10 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, n0.l0> r11 = n0.c0.f33054a
                n0.c0.d.m(r9, r10)
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // t0.c.AbstractC0485c
        public final boolean i(int i10, View view) {
            int i11 = this.f20506b;
            if ((i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final View f20508s;

        public b(View view, boolean z10) {
            this.f20508s = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = SwipeDismissBehavior.this.f20498a;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.d.m(this.f20508s, this);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10 = this.f20499b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f20499b = false;
            }
        } else {
            z10 = coordinatorLayout.q((int) motionEvent.getX(), (int) motionEvent.getY(), v3);
            this.f20499b = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f20498a == null) {
            this.f20498a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f20504h);
        }
        if (!this.f20500c && this.f20498a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.d.c(v3) == 0) {
            c0.d.s(v3, 1);
            c0.i(o.f8460d, v3);
            c0.g(0, v3);
            if (s(v3)) {
                c0.j(v3, g.a.f33528j, new j6.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        if (this.f20498a != null) {
            if (!this.f20500c || motionEvent.getActionMasked() != 3) {
                this.f20498a.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
