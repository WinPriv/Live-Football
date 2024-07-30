package com.google.android.material.bottomsheet;

import a3.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.anythink.expressad.exoplayer.h.o;
import com.google.android.material.internal.n;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d7.g;
import d7.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import n0.a;
import n0.c0;
import n0.l0;
import o0.g;
import t0.c;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.d A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public t0.c M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;
    public WeakReference<View> W;
    public final ArrayList<c> X;
    public VelocityTracker Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f20535a;

    /* renamed from: a0, reason: collision with root package name */
    public int f20536a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20537b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f20538b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f20539c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f20540c0;

    /* renamed from: d, reason: collision with root package name */
    public int f20541d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f20542d0;

    /* renamed from: e, reason: collision with root package name */
    public int f20543e;

    /* renamed from: e0, reason: collision with root package name */
    public final b f20544e0;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f20545g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20546h;

    /* renamed from: i, reason: collision with root package name */
    public g f20547i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f20548j;

    /* renamed from: k, reason: collision with root package name */
    public int f20549k;

    /* renamed from: l, reason: collision with root package name */
    public int f20550l;

    /* renamed from: m, reason: collision with root package name */
    public int f20551m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20552n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f20553p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f20554q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20555r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20556s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f20557t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20558u;

    /* renamed from: v, reason: collision with root package name */
    public int f20559v;

    /* renamed from: w, reason: collision with root package name */
    public int f20560w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20561x;
    public final j y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20562z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f20567s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f20568t;

        public a(View view, int i10) {
            this.f20567s = view;
            this.f20568t = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.F(this.f20567s, this.f20568t, false);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends c.AbstractC0485c {
        public b() {
        }

        @Override // t0.c.AbstractC0485c
        public final int a(int i10, View view) {
            return view.getLeft();
        }

        @Override // t0.c.AbstractC0485c
        public final int b(int i10, View view) {
            return a0.a.B0(i10, BottomSheetBehavior.this.y(), d());
        }

        @Override // t0.c.AbstractC0485c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.I) {
                return bottomSheetBehavior.T;
            }
            return bottomSheetBehavior.G;
        }

        @Override // t0.c.AbstractC0485c
        public final void f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        @Override // t0.c.AbstractC0485c
        public final void g(View view, int i10, int i11) {
            BottomSheetBehavior.this.v(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        
            if (java.lang.Math.abs(r5.getTop() - r3.y()) < java.lang.Math.abs(r5.getTop() - r3.E)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        
            if (java.lang.Math.abs(r6 - r3.E) < java.lang.Math.abs(r6 - r3.G)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        
            if (java.lang.Math.abs(r6 - r3.D) < java.lang.Math.abs(r6 - r3.G)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
        
            if (r6 < java.lang.Math.abs(r6 - r3.G)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.G)) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r6 > r3.E) goto L53;
         */
        @Override // t0.c.AbstractC0485c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L1b
                boolean r6 = r3.f20537b
                if (r6 == 0) goto Le
                goto Lc4
            Le:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                int r7 = r3.E
                if (r6 <= r7) goto Lc4
                goto Ld5
            L1b:
                boolean r1 = r3.I
                if (r1 == 0) goto L70
                boolean r1 = r3.E(r5, r7)
                if (r1 == 0) goto L70
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L38
                int r6 = r3.f20541d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L4c
            L38:
                int r6 = r5.getTop()
                int r7 = r3.T
                int r0 = r3.y()
                int r0 = r0 + r7
                int r0 = r0 / 2
                if (r6 <= r0) goto L49
                r6 = r2
                goto L4a
            L49:
                r6 = 0
            L4a:
                if (r6 == 0) goto L4f
            L4c:
                r6 = 5
                goto Ld8
            L4f:
                boolean r6 = r3.f20537b
                if (r6 == 0) goto L55
                goto Lc4
            L55:
                int r6 = r5.getTop()
                int r7 = r3.y()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r0 = r3.E
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
                goto Lc4
            L70:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L9c
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L81
                goto L9c
            L81:
                boolean r6 = r3.f20537b
                if (r6 == 0) goto L86
                goto Ld7
            L86:
                int r6 = r5.getTop()
                int r7 = r3.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Ld5
            L9c:
                int r6 = r5.getTop()
                boolean r7 = r3.f20537b
                if (r7 == 0) goto Lb6
                int r7 = r3.D
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Lc4
            Lb6:
                int r7 = r3.E
                if (r6 >= r7) goto Lc6
                int r7 = r3.G
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
            Lc4:
                r6 = 3
                goto Ld8
            Lc6:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
            Ld5:
                r6 = 6
                goto Ld8
            Ld7:
                r6 = 4
            Ld8:
                r3.getClass()
                r3.F(r5, r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        @Override // t0.c.AbstractC0485c
        public final boolean i(int i10, View view) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.L;
            if (i11 == 1 || bottomSheetBehavior.f20538b0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.Z == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.W;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    /* loaded from: classes2.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public int f20571a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20572b;

        /* renamed from: c, reason: collision with root package name */
        public final a f20573c = new a();

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                dVar.f20572b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                t0.c cVar = bottomSheetBehavior.M;
                if (cVar != null && cVar.g()) {
                    dVar.a(dVar.f20571a);
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.D(dVar.f20571a);
                }
            }
        }

        public d() {
        }

        public final void a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference != null && weakReference.get() != null) {
                this.f20571a = i10;
                if (!this.f20572b) {
                    V v3 = bottomSheetBehavior.U.get();
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.d.m(v3, this.f20573c);
                    this.f20572b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.f20535a = 0;
        this.f20537b = true;
        this.f20549k = -1;
        this.f20550l = -1;
        this.A = new d();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.X = new ArrayList<>();
        this.f20542d0 = new SparseIntArray();
        this.f20544e0 = new b();
    }

    public static View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View w10 = w(viewGroup.getChildAt(i10));
                if (w10 != null) {
                    return w10;
                }
            }
        }
        return null;
    }

    public final void A(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.V) != null) {
            u(1, weakReference.get());
            this.V = null;
        } else {
            this.V = new WeakReference<>(view);
            G(1, view);
        }
    }

    public final void B(int i10) {
        boolean z10 = false;
        if (i10 == -1) {
            if (!this.f) {
                this.f = true;
                z10 = true;
            }
        } else if (this.f || this.f20543e != i10) {
            this.f = false;
            this.f20543e = Math.max(0, i10);
            z10 = true;
        }
        if (z10) {
            K();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (n0.c0.g.b(r5) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L71
            r1 = 2
            if (r5 != r1) goto L8
            goto L71
        L8:
            boolean r1 = r4.I
            if (r1 != 0) goto L23
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L23:
            r1 = 6
            if (r5 != r1) goto L34
            boolean r1 = r4.f20537b
            if (r1 == 0) goto L34
            int r1 = r4.z(r5)
            int r2 = r4.D
            if (r1 > r2) goto L34
            r1 = 3
            goto L35
        L34:
            r1 = r5
        L35:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r4.U
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L40
            goto L6d
        L40:
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r5, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L62
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L62
            java.util.WeakHashMap<android.view.View, n0.l0> r1 = n0.c0.f33054a
            boolean r1 = n0.c0.g.b(r5)
            if (r1 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L69
            r5.post(r2)
            goto L70
        L69:
            r2.run()
            goto L70
        L6d:
            r4.D(r5)
        L70:
            return
        L71:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7f
            java.lang.String r5 = "DRAGGING"
            goto L81
        L7f:
            java.lang.String r5 = "SETTLING"
        L81:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = a3.l.p(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    public final void D(int i10) {
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            J(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            J(false);
        }
        I(i10, true);
        while (true) {
            ArrayList<c> arrayList = this.X;
            if (i11 < arrayList.size()) {
                arrayList.get(i11).b();
                i11++;
            } else {
                H();
                return;
            }
        }
    }

    public final boolean E(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f * this.Q) + view.getTop()) - this.G) / t() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void F(View view, int i10, boolean z10) {
        boolean z11;
        int z12 = z(i10);
        t0.c cVar = this.M;
        if (cVar != null && (!z10 ? cVar.s(view.getLeft(), z12, view) : cVar.q(view.getLeft(), z12))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            D(2);
            I(i10, true);
            this.A.a(i10);
            return;
        }
        D(i10);
    }

    public final void G(int i10, View view) {
        int i11;
        boolean z10;
        n0.a aVar;
        if (view == null) {
            return;
        }
        u(i10, view);
        int i12 = 6;
        if (!this.f20537b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            m6.c cVar = new m6.c(this, 6);
            ArrayList e10 = c0.e(view);
            int i13 = 0;
            while (true) {
                if (i13 < e10.size()) {
                    if (TextUtils.equals(string, ((g.a) e10.get(i13)).b())) {
                        i11 = ((g.a) e10.get(i13)).a();
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 0;
                    int i15 = -1;
                    while (true) {
                        int[] iArr = c0.f33057d;
                        if (i14 >= iArr.length || i15 != -1) {
                            break;
                        }
                        int i16 = iArr[i14];
                        boolean z11 = true;
                        for (int i17 = 0; i17 < e10.size(); i17++) {
                            if (((g.a) e10.get(i17)).a() != i16) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 &= z10;
                        }
                        if (z11) {
                            i15 = i16;
                        }
                        i14++;
                    }
                    i11 = i15;
                }
            }
            if (i11 != -1) {
                g.a aVar2 = new g.a(null, i11, string, cVar, null);
                View.AccessibilityDelegate c10 = c0.c(view);
                if (c10 == null) {
                    aVar = null;
                } else if (c10 instanceof a.C0442a) {
                    aVar = ((a.C0442a) c10).f33039a;
                } else {
                    aVar = new n0.a(c10);
                }
                if (aVar == null) {
                    aVar = new n0.a();
                }
                c0.l(view, aVar);
                c0.i(aVar2.a(), view);
                c0.e(view).add(aVar2);
                c0.g(0, view);
            }
            this.f20542d0.put(i10, i11);
        }
        if (this.I && this.L != 5) {
            c0.j(view, g.a.f33528j, new m6.c(this, 5));
        }
        int i18 = this.L;
        if (i18 != 3) {
            if (i18 != 4) {
                if (i18 == 6) {
                    c0.j(view, g.a.f33527i, new m6.c(this, 4));
                    c0.j(view, g.a.f33526h, new m6.c(this, 3));
                    return;
                }
                return;
            }
            if (this.f20537b) {
                i12 = 3;
            }
            c0.j(view, g.a.f33526h, new m6.c(this, i12));
            return;
        }
        if (this.f20537b) {
            i12 = 4;
        }
        c0.j(view, g.a.f33527i, new m6.c(this, i12));
    }

    public final void H() {
        WeakReference<V> weakReference = this.U;
        if (weakReference != null) {
            G(0, weakReference.get());
        }
        WeakReference<View> weakReference2 = this.V;
        if (weakReference2 != null) {
            G(1, weakReference2.get());
        }
    }

    public final void I(int i10, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        if (this.L == 3 && (this.f20561x || y() == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f20562z != z11 && this.f20547i != null) {
            this.f20562z = z11;
            float f = gl.Code;
            if (z10 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                if (!z11) {
                    f = 1.0f;
                }
                this.B.setFloatValues(1.0f - f, f);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            d7.g gVar = this.f20547i;
            if (!this.f20562z) {
                f = 1.0f;
            }
            g.b bVar = gVar.f27403s;
            if (bVar.f27419j != f) {
                bVar.f27419j = f;
                gVar.f27407w = true;
                gVar.invalidateSelf();
            }
        }
    }

    public final void J(boolean z10) {
        WeakReference<V> weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f20540c0 == null) {
                this.f20540c0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.U.get() && z10) {
                this.f20540c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z10) {
            this.f20540c0 = null;
        }
    }

    public final void K() {
        V v3;
        if (this.U != null) {
            s();
            if (this.L == 4 && (v3 = this.U.get()) != null) {
                v3.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        View view;
        t0.c cVar;
        if (v3.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.Z = -1;
                VelocityTracker velocityTracker = this.Y;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Y = null;
                }
            }
            if (this.Y == null) {
                this.Y = VelocityTracker.obtain();
            }
            this.Y.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f20538b0 = false;
                    this.Z = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.f20536a0 = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference<View> weakReference = this.W;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.q(x10, this.f20536a0, view)) {
                        this.Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f20538b0 = true;
                    }
                }
                if (this.Z == -1 && !coordinatorLayout.q(x10, this.f20536a0, v3)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N = z10;
            }
            if (!this.N && (cVar = this.M) != null && cVar.r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.W;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.q((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.M == null || Math.abs(this.f20536a0 - motionEvent.getY()) <= this.M.f35346b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        boolean z10;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.d.b(coordinatorLayout) && !c0.d.b(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.U == null) {
            this.f20545g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f20552n && !this.f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.o || this.f20553p || this.f20554q || this.f20556s || this.f20557t || this.f20558u || z10) {
                n.a(v3, new m6.b(this, z10));
            }
            this.U = new WeakReference<>(v3);
            d7.g gVar = this.f20547i;
            if (gVar != null) {
                c0.d.q(v3, gVar);
                d7.g gVar2 = this.f20547i;
                float f = this.H;
                if (f == -1.0f) {
                    f = c0.i.i(v3);
                }
                gVar2.j(f);
            } else {
                ColorStateList colorStateList = this.f20548j;
                if (colorStateList != null) {
                    c0.i.q(v3, colorStateList);
                }
            }
            H();
            if (c0.d.c(v3) == 0) {
                c0.d.s(v3, 1);
            }
        }
        if (this.M == null) {
            this.M = new t0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f20544e0);
        }
        int top = v3.getTop();
        coordinatorLayout.s(i10, v3);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = v3.getHeight();
        this.R = height;
        int i12 = this.T;
        int i13 = i12 - height;
        int i14 = this.f20560w;
        if (i13 < i14) {
            if (this.f20555r) {
                this.R = i12;
            } else {
                this.R = i12 - i14;
            }
        }
        this.D = Math.max(0, i12 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i15 = this.L;
        if (i15 == 3) {
            v3.offsetTopAndBottom(y());
        } else if (i15 == 6) {
            v3.offsetTopAndBottom(this.E);
        } else if (this.I && i15 == 5) {
            v3.offsetTopAndBottom(this.T);
        } else if (i15 == 4) {
            v3.offsetTopAndBottom(this.G);
        } else if (i15 == 1 || i15 == 2) {
            v3.offsetTopAndBottom(top - v3.getTop());
        }
        I(this.L, false);
        this.W = new WeakReference<>(w(v3));
        while (true) {
            ArrayList<c> arrayList = this.X;
            if (i11 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i11).getClass();
            i11++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f20549k, marginLayoutParams.width), x(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f20550l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.W;
        if (weakReference != null && view == weakReference.get() && this.L != 3) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v3, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.W;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        int top = v3.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < y()) {
                int y = top - y();
                iArr[1] = y;
                int i14 = -y;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                v3.offsetTopAndBottom(i14);
                D(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                v3.offsetTopAndBottom(-i11);
                D(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i15 = this.G;
            if (i13 > i15 && !this.I) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                WeakHashMap<View, l0> weakHashMap3 = c0.f33054a;
                v3.offsetTopAndBottom(i17);
                D(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap<View, l0> weakHashMap4 = c0.f33054a;
                v3.offsetTopAndBottom(-i11);
                D(1);
            }
        }
        v(v3.getTop());
        this.O = i11;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i10 = this.f20535a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f20543e = savedState.f20564v;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f20537b = savedState.f20565w;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = savedState.f20566x;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = savedState.y;
            }
        }
        int i11 = savedState.f20563u;
        if (i11 != 1 && i11 != 2) {
            this.L = i11;
        } else {
            this.L = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r3.getTop() <= r1.E) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (java.lang.Math.abs(r2 - r1.D) < java.lang.Math.abs(r2 - r1.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r1.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (java.lang.Math.abs(r2 - r1.E) < java.lang.Math.abs(r2 - r1.G)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.y()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.D(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.W
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.P
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.O
            if (r2 <= 0) goto L33
            boolean r2 = r1.f20537b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.E
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.I
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.Y
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f20539c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.Y
            int r4 = r1.Z
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.E(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.O
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f20537b
            if (r4 == 0) goto L72
            int r4 = r1.D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.E
            if (r2 >= r4) goto L81
            int r4 = r1.G
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f20537b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.F(r3, r0, r2)
            r1.P = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        t0.c cVar = this.M;
        if (cVar != null && (this.K || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            VelocityTracker velocityTracker = this.Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Y = null;
            }
        }
        if (this.Y == null) {
            this.Y = VelocityTracker.obtain();
        }
        this.Y.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(this.f20536a0 - motionEvent.getY());
            t0.c cVar2 = this.M;
            if (abs > cVar2.f35346b) {
                cVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v3);
            }
        }
        return !this.N;
    }

    public final void s() {
        int t10 = t();
        if (this.f20537b) {
            this.G = Math.max(this.T - t10, this.D);
        } else {
            this.G = this.T - t10;
        }
    }

    public final int t() {
        int i10;
        if (this.f) {
            return Math.min(Math.max(this.f20545g, this.T - ((this.S * 9) / 16)), this.R) + this.f20559v;
        }
        if (!this.f20552n && !this.o && (i10 = this.f20551m) > 0) {
            return Math.max(this.f20543e, i10 + this.f20546h);
        }
        return this.f20543e + this.f20559v;
    }

    public final void u(int i10, View view) {
        if (view == null) {
            return;
        }
        c0.i(524288, view);
        c0.g(0, view);
        c0.i(262144, view);
        c0.g(0, view);
        c0.i(o.f8460d, view);
        c0.g(0, view);
        SparseIntArray sparseIntArray = this.f20542d0;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 != -1) {
            c0.i(i11, view);
            c0.g(0, view);
            sparseIntArray.delete(i10);
        }
    }

    public final void v(int i10) {
        if (this.U.get() != null) {
            ArrayList<c> arrayList = this.X;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != y()) {
                    y();
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList.get(i12).a();
                }
            }
        }
    }

    public final int x(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final int y() {
        int i10;
        if (this.f20537b) {
            return this.D;
        }
        int i11 = this.C;
        if (this.f20555r) {
            i10 = 0;
        } else {
            i10 = this.f20560w;
        }
        return Math.max(i11, i10);
    }

    public final int z(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(l.i("Invalid state to get top offset: ", i10));
                }
                return this.T;
            }
            return this.G;
        }
        return y();
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public final int f20563u;

        /* renamed from: v, reason: collision with root package name */
        public final int f20564v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f20565w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f20566x;
        public final boolean y;

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
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20563u = parcel.readInt();
            this.f20564v = parcel.readInt();
            this.f20565w = parcel.readInt() == 1;
            this.f20566x = parcel.readInt() == 1;
            this.y = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f20563u);
            parcel.writeInt(this.f20564v);
            parcel.writeInt(this.f20565w ? 1 : 0);
            parcel.writeInt(this.f20566x ? 1 : 0);
            parcel.writeInt(this.y ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f20563u = bottomSheetBehavior.L;
            this.f20564v = bottomSheetBehavior.f20543e;
            this.f20565w = bottomSheetBehavior.f20537b;
            this.f20566x = bottomSheetBehavior.I;
            this.y = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f20535a = 0;
        this.f20537b = true;
        this.f20549k = -1;
        this.f20550l = -1;
        this.A = new d();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.X = new ArrayList<>();
        this.f20542d0 = new SparseIntArray();
        this.f20544e0 = new b();
        this.f20546h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.activity.n.O);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f20548j = z6.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.y = new j(j.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        j jVar = this.y;
        if (jVar != null) {
            d7.g gVar = new d7.g(jVar);
            this.f20547i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f20548j;
            if (colorStateList != null) {
                this.f20547i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f20547i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new m6.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f20549k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f20550l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            B(i10);
        } else {
            B(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z10 = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.L == 5) {
                C(4);
            }
            H();
        }
        this.f20552n = obtainStyledAttributes.getBoolean(13, false);
        boolean z11 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f20537b != z11) {
            this.f20537b = z11;
            if (this.U != null) {
                s();
            }
            D((this.f20537b && this.L == 6) ? 3 : this.L);
            I(this.L, true);
            H();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f20535a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > gl.Code && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i11 = peekValue2.data;
                if (i11 >= 0) {
                    this.C = i11;
                    I(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    I(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f20541d = obtainStyledAttributes.getInt(11, 500);
            this.o = obtainStyledAttributes.getBoolean(17, false);
            this.f20553p = obtainStyledAttributes.getBoolean(18, false);
            this.f20554q = obtainStyledAttributes.getBoolean(19, false);
            this.f20555r = obtainStyledAttributes.getBoolean(20, true);
            this.f20556s = obtainStyledAttributes.getBoolean(14, false);
            this.f20557t = obtainStyledAttributes.getBoolean(15, false);
            this.f20558u = obtainStyledAttributes.getBoolean(16, false);
            this.f20561x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f20539c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
