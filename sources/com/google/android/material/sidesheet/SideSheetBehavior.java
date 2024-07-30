package com.google.android.material.sidesheet;

import a3.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.anythink.expressad.exoplayer.h.o;
import com.applovin.exoplayer2.a.f0;
import com.hamkho.livefoot.R;
import d7.g;
import d7.j;
import e7.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.g;
import t0.c;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public e7.a f20960a;

    /* renamed from: b, reason: collision with root package name */
    public g f20961b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f20962c;

    /* renamed from: d, reason: collision with root package name */
    public final j f20963d;

    /* renamed from: e, reason: collision with root package name */
    public final SideSheetBehavior<V>.b f20964e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20965g;

    /* renamed from: h, reason: collision with root package name */
    public int f20966h;

    /* renamed from: i, reason: collision with root package name */
    public c f20967i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20968j;

    /* renamed from: k, reason: collision with root package name */
    public final float f20969k;

    /* renamed from: l, reason: collision with root package name */
    public int f20970l;

    /* renamed from: m, reason: collision with root package name */
    public int f20971m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference<V> f20972n;
    public WeakReference<View> o;

    /* renamed from: p, reason: collision with root package name */
    public int f20973p;

    /* renamed from: q, reason: collision with root package name */
    public VelocityTracker f20974q;

    /* renamed from: r, reason: collision with root package name */
    public int f20975r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f20976s;

    /* renamed from: t, reason: collision with root package name */
    public final a f20977t;

    /* loaded from: classes2.dex */
    public class a extends c.AbstractC0485c {
        public a() {
        }

        @Override // t0.c.AbstractC0485c
        public final int a(int i10, View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return a0.a.B0(i10, sideSheetBehavior.f20960a.a(), sideSheetBehavior.f20971m);
        }

        @Override // t0.c.AbstractC0485c
        public final int b(int i10, View view) {
            return view.getTop();
        }

        @Override // t0.c.AbstractC0485c
        public final int c(View view) {
            return SideSheetBehavior.this.f20971m;
        }

        @Override // t0.c.AbstractC0485c
        public final void f(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f20965g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // t0.c.AbstractC0485c
        public final void g(View view, int i10, int i11) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.o;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                e7.a aVar = sideSheetBehavior.f20960a;
                int left = view.getLeft();
                view.getRight();
                int i12 = aVar.f27849a.f20971m;
                if (left <= i12) {
                    marginLayoutParams.rightMargin = i12 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f20976s;
            if (!linkedHashSet.isEmpty()) {
                e7.a aVar2 = sideSheetBehavior.f20960a;
                int i13 = aVar2.f27849a.f20971m;
                aVar2.a();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((e7.b) it.next()).b();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (r6 != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        
            if (r6 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            if (java.lang.Math.abs(r9 - r1.a()) < java.lang.Math.abs(r9 - r5.f20971m)) goto L33;
         */
        @Override // t0.c.AbstractC0485c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                e7.a r1 = r0.f20960a
                r1.getClass()
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                r4 = 1
                if (r3 >= 0) goto Lf
                goto L84
            Lf:
                int r3 = r8.getRight()
                float r3 = (float) r3
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r5 = r1.f27849a
                float r6 = r5.f20969k
                float r6 = r6 * r9
                float r6 = r6 + r3
                float r3 = java.lang.Math.abs(r6)
                r6 = 1056964608(0x3f000000, float:0.5)
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r6 = 0
                if (r3 <= 0) goto L27
                r3 = r4
                goto L28
            L27:
                r3 = r6
            L28:
                if (r3 == 0) goto L5a
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L38
                r9 = r4
                goto L39
            L38:
                r9 = r6
            L39:
                if (r9 == 0) goto L44
                r9 = 500(0x1f4, float:7.0E-43)
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L44
                r9 = r4
                goto L45
            L44:
                r9 = r6
            L45:
                if (r9 != 0) goto L86
                int r9 = r8.getLeft()
                int r10 = r5.f20971m
                int r1 = r1.a()
                int r10 = r10 - r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L57
                r6 = r4
            L57:
                if (r6 == 0) goto L84
                goto L86
            L5a:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 == 0) goto L6d
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L6b
                r6 = r4
            L6b:
                if (r6 != 0) goto L86
            L6d:
                int r9 = r8.getLeft()
                int r10 = r1.a()
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                int r1 = r5.f20971m
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L86
            L84:
                r9 = 3
                goto L87
            L86:
                r9 = 5
            L87:
                r0.t(r8, r9, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // t0.c.AbstractC0485c
        public final boolean i(int i10, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f20966h == 1 || (weakReference = sideSheetBehavior.f20972n) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f20980a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20981b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.activity.b f20982c = new androidx.activity.b(this, 12);

        public b() {
        }

        public final void a(int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f20972n;
            if (weakReference != null && weakReference.get() != null) {
                this.f20980a = i10;
                if (!this.f20981b) {
                    V v3 = sideSheetBehavior.f20972n.get();
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.d.m(v3, this.f20982c);
                    this.f20981b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f20964e = new b();
        this.f20965g = true;
        this.f20966h = 5;
        this.f20969k = 0.1f;
        this.f20973p = -1;
        this.f20976s = new LinkedHashSet();
        this.f20977t = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.f20972n = null;
        this.f20967i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.f20972n = null;
        this.f20967i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        c cVar;
        VelocityTracker velocityTracker;
        if ((v3.isShown() || c0.d(v3) != null) && this.f20965g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f20968j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f20974q) != null) {
            velocityTracker.recycle();
            this.f20974q = null;
        }
        if (this.f20974q == null) {
            this.f20974q = VelocityTracker.obtain();
        }
        this.f20974q.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f20968j) {
                this.f20968j = false;
                return false;
            }
        } else {
            this.f20975r = (int) motionEvent.getX();
        }
        if (!this.f20968j && (cVar = this.f20967i) != null && cVar.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        int i11;
        View findViewById;
        int i12;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.d.b(coordinatorLayout) && !c0.d.b(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i13 = 0;
        if (this.f20972n == null) {
            this.f20972n = new WeakReference<>(v3);
            g gVar = this.f20961b;
            if (gVar != null) {
                c0.d.q(v3, gVar);
                g gVar2 = this.f20961b;
                float f = this.f;
                if (f == -1.0f) {
                    f = c0.i.i(v3);
                }
                gVar2.j(f);
            } else {
                ColorStateList colorStateList = this.f20962c;
                if (colorStateList != null) {
                    c0.i.q(v3, colorStateList);
                }
            }
            if (this.f20966h == 5) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            if (v3.getVisibility() != i12) {
                v3.setVisibility(i12);
            }
            u();
            if (c0.d.c(v3) == 0) {
                c0.d.s(v3, 1);
            }
            if (c0.d(v3) == null) {
                c0.m(v3, v3.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f20967i == null) {
            this.f20967i = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f20977t);
        }
        this.f20960a.getClass();
        int left = v3.getLeft();
        coordinatorLayout.s(i10, v3);
        this.f20971m = coordinatorLayout.getWidth();
        this.f20970l = v3.getWidth();
        int i14 = this.f20966h;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                if (i14 == 5) {
                    i13 = this.f20960a.f27849a.f20971m;
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f20966h);
                }
            }
        } else {
            this.f20960a.getClass();
            i13 = left - v3.getLeft();
        }
        v3.offsetLeftAndRight(i13);
        if (this.o == null && (i11 = this.f20973p) != -1 && (findViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.o = new WeakReference<>(findViewById);
        }
        for (e7.b bVar : this.f20976s) {
            if (bVar instanceof d) {
                ((d) bVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        int i10 = ((SavedState) parcelable).f20978u;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f20966h = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        boolean z13 = false;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f20966h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        c cVar = this.f20967i;
        if (cVar != null && (this.f20965g || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f20974q) != null) {
            velocityTracker.recycle();
            this.f20974q = null;
        }
        if (this.f20974q == null) {
            this.f20974q = VelocityTracker.obtain();
        }
        this.f20974q.addMovement(motionEvent);
        c cVar2 = this.f20967i;
        if (cVar2 != null && (this.f20965g || this.f20966h == 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && actionMasked == 2 && !this.f20968j) {
            if (cVar2 != null && (this.f20965g || this.f20966h == 1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && Math.abs(this.f20975r - motionEvent.getX()) > this.f20967i.f35346b) {
                z13 = true;
            }
            if (z13) {
                this.f20967i.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v3);
            }
        }
        return !this.f20968j;
    }

    public final void s(int i10) {
        V v3;
        int i11;
        if (this.f20966h == i10) {
            return;
        }
        this.f20966h = i10;
        WeakReference<V> weakReference = this.f20972n;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        if (this.f20966h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (v3.getVisibility() != i11) {
            v3.setVisibility(i11);
        }
        Iterator it = this.f20976s.iterator();
        while (it.hasNext()) {
            ((e7.b) it.next()).a();
        }
        u();
    }

    public final void t(View view, int i10, boolean z10) {
        int a10;
        boolean z11;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f20960a.f27849a;
        if (i10 != 3) {
            if (i10 == 5) {
                a10 = sideSheetBehavior.f20960a.f27849a.f20971m;
            } else {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(l.i("Invalid state to get outward edge offset: ", i10));
            }
        } else {
            a10 = sideSheetBehavior.f20960a.a();
        }
        c cVar = sideSheetBehavior.f20967i;
        if (cVar != null && (!z10 ? cVar.s(a10, view.getTop(), view) : cVar.q(a10, view.getTop()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            s(2);
            this.f20964e.a(i10);
        } else {
            s(i10);
        }
    }

    public final void u() {
        V v3;
        WeakReference<V> weakReference = this.f20972n;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        c0.i(262144, v3);
        c0.g(0, v3);
        c0.i(o.f8460d, v3);
        c0.g(0, v3);
        int i10 = 2;
        int i11 = 5;
        if (this.f20966h != 5) {
            c0.j(v3, g.a.f33528j, new f0(i11, i10, this));
        }
        int i12 = 3;
        if (this.f20966h != 3) {
            c0.j(v3, g.a.f33526h, new f0(i12, i10, this));
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public final int f20978u;

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
            this.f20978u = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f20978u);
        }

        public SavedState(android.view.AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f20978u = sideSheetBehavior.f20966h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20964e = new b();
        this.f20965g = true;
        this.f20966h = 5;
        this.f20969k = 0.1f;
        this.f20973p = -1;
        this.f20976s = new LinkedHashSet();
        this.f20977t = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f506r0);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f20962c = z6.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f20963d = new j(j.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f20973p = resourceId;
            WeakReference<View> weakReference = this.o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.o = null;
            WeakReference<V> weakReference2 = this.f20972n;
            if (weakReference2 != null) {
                V v3 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    if (c0.g.c(v3)) {
                        v3.requestLayout();
                    }
                }
            }
        }
        j jVar = this.f20963d;
        if (jVar != null) {
            d7.g gVar = new d7.g(jVar);
            this.f20961b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f20962c;
            if (colorStateList != null) {
                this.f20961b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f20961b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f20965g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f20960a == null) {
            this.f20960a = new e7.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
