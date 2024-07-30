package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.f;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.v0;
import o0.g;
import o0.k;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public Parcelable A;
    public RecyclerView B;
    public h C;
    public androidx.viewpager2.widget.f D;
    public androidx.viewpager2.widget.c E;
    public androidx.viewpager2.widget.d F;
    public androidx.viewpager2.widget.e G;
    public RecyclerView.l H;
    public boolean I;
    public boolean J;
    public int K;
    public f L;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f2546s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2547t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.viewpager2.widget.c f2548u;

    /* renamed from: v, reason: collision with root package name */
    public int f2549v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2550w;

    /* renamed from: x, reason: collision with root package name */
    public final a f2551x;
    public d y;

    /* renamed from: z, reason: collision with root package name */
    public int f2552z;

    /* loaded from: classes.dex */
    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.L.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f2549v);
            accessibilityEvent.setToIndex(viewPager2.f2549v);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.J && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super(0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.i
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f2550w = true;
            viewPager2.D.f2582l = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.i {
        public c(int i10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void C0(RecyclerView.z zVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.C0(zVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void U(RecyclerView.v vVar, RecyclerView.z zVar, o0.g gVar) {
            super.U(vVar, zVar, gVar);
            ViewPager2.this.L.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean h0(RecyclerView.v vVar, RecyclerView.z zVar, int i10, Bundle bundle) {
            ViewPager2.this.L.getClass();
            return super.h0(vVar, zVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f2558a = new a();

        /* renamed from: b, reason: collision with root package name */
        public final b f2559b = new b();

        /* renamed from: c, reason: collision with root package name */
        public j f2560c;

        /* loaded from: classes.dex */
        public class a implements k {
            public a() {
            }

            @Override // o0.k
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.J) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements k {
            public b() {
            }

            @Override // o0.k
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.J) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.s(recyclerView, 2);
            this.f2560c = new j(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (c0.d.c(viewPager2) == 0) {
                c0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int itemCount;
            int i10;
            int i11 = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            c0.i(R.id.accessibilityActionPageLeft, viewPager2);
            boolean z10 = false;
            c0.g(0, viewPager2);
            c0.i(R.id.accessibilityActionPageRight, viewPager2);
            c0.g(0, viewPager2);
            c0.i(R.id.accessibilityActionPageUp, viewPager2);
            c0.g(0, viewPager2);
            c0.i(R.id.accessibilityActionPageDown, viewPager2);
            c0.g(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.J) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f2559b;
            a aVar = this.f2558a;
            if (orientation == 0) {
                if (viewPager2.y.z() == 1) {
                    z10 = true;
                }
                if (z10) {
                    i10 = 16908360;
                } else {
                    i10 = 16908361;
                }
                if (z10) {
                    i11 = 16908361;
                }
                if (viewPager2.f2549v < itemCount - 1) {
                    c0.j(viewPager2, new g.a(i10), aVar);
                }
                if (viewPager2.f2549v > 0) {
                    c0.j(viewPager2, new g.a(i11), bVar);
                    return;
                }
                return;
            }
            if (viewPager2.f2549v < itemCount - 1) {
                c0.j(viewPager2, new g.a(R.id.accessibilityActionPageDown), aVar);
            }
            if (viewPager2.f2549v > 0) {
                c0.j(viewPager2, new g.a(R.id.accessibilityActionPageUp), bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends u {
        public h() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.y
        public final View c(RecyclerView.o oVar) {
            if (((androidx.viewpager2.widget.f) ViewPager2.this.F.f2570t).f2583m) {
                return null;
            }
            return super.c(oVar);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final int f2565s;

        /* renamed from: t, reason: collision with root package name */
        public final RecyclerView f2566t;

        public i(RecyclerView recyclerView, int i10) {
            this.f2565s = i10;
            this.f2566t = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2566t.smoothScrollToPosition(this.f2565s);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2546s = new Rect();
        this.f2547t = new Rect();
        androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c();
        this.f2548u = cVar;
        this.f2550w = false;
        this.f2551x = new a();
        this.f2552z = -1;
        this.H = null;
        this.I = false;
        this.J = true;
        this.K = -1;
        this.L = new f();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.B = recyclerViewImpl;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        recyclerViewImpl.setId(c0.e.a());
        this.B.setDescendantFocusability(131072);
        d dVar = new d();
        this.y = dVar;
        this.B.setLayoutManager(dVar);
        this.B.setScrollingTouchSlop(1);
        int[] iArr = v0.f33135c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.B.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.B.addOnChildAttachStateChangeListener(new androidx.viewpager2.widget.i());
            androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(this);
            this.D = fVar;
            this.F = new androidx.viewpager2.widget.d(this, fVar, this.B);
            h hVar = new h();
            this.C = hVar;
            hVar.a(this.B);
            this.B.addOnScrollListener(this.D);
            androidx.viewpager2.widget.c cVar2 = new androidx.viewpager2.widget.c();
            this.E = cVar2;
            this.D.f2572a = cVar2;
            androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
            androidx.viewpager2.widget.h hVar2 = new androidx.viewpager2.widget.h(this);
            this.E.f2568a.add(gVar);
            this.E.f2568a.add(hVar2);
            this.L.a(this.B);
            this.E.f2568a.add(cVar);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this.y);
            this.G = eVar;
            this.E.f2568a.add(eVar);
            RecyclerView recyclerView = this.B;
            attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        RecyclerView.g adapter;
        if (this.f2552z == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.A;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
            }
            this.A = null;
        }
        int max = Math.max(0, Math.min(this.f2552z, adapter.getItemCount() - 1));
        this.f2549v = max;
        this.f2552z = -1;
        this.B.scrollToPosition(max);
        this.L.b();
    }

    public final void b(int i10, boolean z10) {
        if (!((androidx.viewpager2.widget.f) this.F.f2570t).f2583m) {
            c(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void c(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        e eVar;
        boolean z12;
        RecyclerView.g adapter = getAdapter();
        boolean z13 = false;
        if (adapter == null) {
            if (this.f2552z != -1) {
                this.f2552z = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        int i13 = this.f2549v;
        if (min == i13) {
            if (this.D.f == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return;
            }
        }
        if (min == i13 && z10) {
            return;
        }
        double d10 = i13;
        this.f2549v = min;
        this.L.b();
        androidx.viewpager2.widget.f fVar = this.D;
        if (fVar.f == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.e();
            f.a aVar = fVar.f2577g;
            d10 = aVar.f2584a + aVar.f2585b;
        }
        androidx.viewpager2.widget.f fVar2 = this.D;
        fVar2.getClass();
        if (z10) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        fVar2.f2576e = i11;
        fVar2.f2583m = false;
        if (fVar2.f2579i != min) {
            z13 = true;
        }
        fVar2.f2579i = min;
        fVar2.c(2);
        if (z13 && (eVar = fVar2.f2572a) != null) {
            eVar.c(min);
        }
        if (!z10) {
            this.B.scrollToPosition(min);
            return;
        }
        double d11 = min;
        if (Math.abs(d11 - d10) > 3.0d) {
            RecyclerView recyclerView = this.B;
            if (d11 > d10) {
                i12 = min - 3;
            } else {
                i12 = min + 3;
            }
            recyclerView.scrollToPosition(i12);
            RecyclerView recyclerView2 = this.B;
            recyclerView2.post(new i(recyclerView2, min));
            return;
        }
        this.B.smoothScrollToPosition(min);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.B.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.B.canScrollVertically(i10);
    }

    public final void d() {
        h hVar = this.C;
        if (hVar != null) {
            View c10 = hVar.c(this.y);
            if (c10 == null) {
                return;
            }
            this.y.getClass();
            int F = RecyclerView.o.F(c10);
            if (F != this.f2549v && getScrollState() == 0) {
                this.E.c(F);
            }
            this.f2550w = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f2554s;
            sparseArray.put(this.B.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.L.getClass();
        this.L.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.g getAdapter() {
        return this.B.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2549v;
    }

    public int getItemDecorationCount() {
        return this.B.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.K;
    }

    public int getOrientation() {
        return this.y.f2096p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.B;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.D.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i10 = viewPager2.getAdapter().getItemCount();
                i11 = 0;
            } else {
                i11 = viewPager2.getAdapter().getItemCount();
                i10 = 0;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(i10, i11, 0).f33535a);
        RecyclerView.g adapter = viewPager2.getAdapter();
        if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && viewPager2.J) {
            if (viewPager2.f2549v > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f2549v < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.B.getMeasuredWidth();
        int measuredHeight = this.B.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2546s;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f2547t;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.B.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2550w) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.B, i10, i11);
        int measuredWidth = this.B.getMeasuredWidth();
        int measuredHeight = this.B.getMeasuredHeight();
        int measuredState = this.B.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2552z = savedState.f2555t;
        this.A = savedState.f2556u;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2554s = this.B.getId();
        int i10 = this.f2552z;
        if (i10 == -1) {
            i10 = this.f2549v;
        }
        savedState.f2555t = i10;
        Parcelable parcelable = this.A;
        if (parcelable != null) {
            savedState.f2556u = parcelable;
        } else {
            Object adapter = this.B.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                savedState.f2556u = ((androidx.viewpager2.adapter.g) adapter).a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        int currentItem;
        this.L.getClass();
        boolean z11 = false;
        if (i10 != 8192 && i10 != 4096) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f fVar = this.L;
            fVar.getClass();
            if (i10 == 8192 || i10 == 4096) {
                z11 = true;
            }
            if (z11) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (i10 == 8192) {
                    currentItem = viewPager2.getCurrentItem() - 1;
                } else {
                    currentItem = viewPager2.getCurrentItem() + 1;
                }
                if (viewPager2.J) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.g gVar) {
        RecyclerView.g adapter = this.B.getAdapter();
        f fVar = this.L;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(fVar.f2560c);
        } else {
            fVar.getClass();
        }
        a aVar = this.f2551x;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(aVar);
        }
        this.B.setAdapter(gVar);
        this.f2549v = 0;
        a();
        f fVar2 = this.L;
        fVar2.b();
        if (gVar != null) {
            gVar.registerAdapterDataObserver(fVar2.f2560c);
        }
        if (gVar != null) {
            gVar.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i10) {
        b(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.L.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.K = i10;
        this.B.requestLayout();
    }

    public void setOrientation(int i10) {
        this.y.c1(i10);
        this.L.b();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.I) {
                this.H = this.B.getItemAnimator();
                this.I = true;
            }
            this.B.setItemAnimator(null);
        } else if (this.I) {
            this.B.setItemAnimator(this.H);
            this.H = null;
            this.I = false;
        }
        this.G.getClass();
        if (gVar == null) {
            return;
        }
        this.G.getClass();
        this.G.getClass();
    }

    public void setUserInputEnabled(boolean z10) {
        this.J = z10;
        this.L.b();
    }

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f2554s;

        /* renamed from: t, reason: collision with root package name */
        public int f2555t;

        /* renamed from: u, reason: collision with root package name */
        public Parcelable f2556u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState() {
            throw null;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2554s = parcel.readInt();
            this.f2555t = parcel.readInt();
            this.f2556u = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2554s);
            parcel.writeInt(this.f2555t);
            parcel.writeParcelable(this.f2556u, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(int i10) {
        }

        public void c(int i10) {
        }

        public void b(float f, int i10, int i11) {
        }
    }
}
