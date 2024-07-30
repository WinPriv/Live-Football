package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d0.a;
import g0.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.p;
import n0.q;
import n0.q0;
import n0.r;
import n0.s;
import n0.v0;
import q.i;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements p, q {
    public static final String L;
    public static final Class<?>[] M;
    public static final ThreadLocal<Map<String, Constructor<c>>> N;
    public static final h O;
    public static final m0.e P;
    public final int[] A;
    public View B;
    public View C;
    public g D;
    public boolean E;
    public q0 F;
    public boolean G;
    public Drawable H;
    public ViewGroup.OnHierarchyChangeListener I;
    public a J;
    public final r K;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1520s;

    /* renamed from: t, reason: collision with root package name */
    public final m2.g f1521t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f1522u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f1523v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f1524w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1525x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1526z;

    /* loaded from: classes.dex */
    public class a implements s {
        public a() {
        }

        @Override // n0.s
        public final q0 a(View view, q0 q0Var) {
            boolean z10;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!m0.b.a(coordinatorLayout.F, q0Var)) {
                coordinatorLayout.F = q0Var;
                boolean z11 = true;
                if (q0Var.d() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coordinatorLayout.G = z10;
                if (z10 || coordinatorLayout.getBackground() != null) {
                    z11 = false;
                }
                coordinatorLayout.setWillNotDraw(z11);
                q0.k kVar = q0Var.f33099a;
                if (!kVar.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                        if (c0.d.b(childAt) && ((f) childAt.getLayoutParams()).f1530a != null && kVar.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return q0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v3, View view) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v3, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i10, int i11) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void f() {
        }

        public void c(f fVar) {
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void n(View view, Parcelable parcelable) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v3, View view, int i10) {
        }

        public void k(CoordinatorLayout coordinatorLayout, V v3, View view, int i10, int i11, int[] iArr, int i12) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.r(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            float m10 = c0.i.m(view);
            float m11 = c0.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        L = str;
        O = new h();
        M = new Class[]{Context.class, AttributeSet.class};
        N = new ThreadLocal<>();
        P = new m0.e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1520s = new ArrayList();
        this.f1521t = new m2.g(1);
        this.f1522u = new ArrayList();
        this.f1523v = new ArrayList();
        this.f1524w = new int[2];
        this.f1525x = new int[2];
        this.K = new r();
        int[] iArr = v0.f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.A = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.A[i10] = (int) (r3[i10] * f10);
            }
        }
        this.H = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        z();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.d.c(this) == 0) {
            c0.d.s(this, 1);
        }
    }

    public static Rect c() {
        Rect rect = (Rect) P.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void h(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int i13 = fVar.f1532c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = fVar.f1533d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f p(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1531b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.f1530a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.f();
                    }
                    fVar.f1530a = behavior;
                    fVar.f1531b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
                fVar.f1531b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c newInstance = dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar2 = fVar.f1530a;
                        if (cVar2 != newInstance) {
                            if (cVar2 != null) {
                                cVar2.f();
                            }
                            fVar.f1530a = newInstance;
                            fVar.f1531b = true;
                            if (newInstance != null) {
                                newInstance.c(fVar);
                            }
                        }
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f1531b = true;
            }
        }
        return fVar;
    }

    public static void x(int i10, View view) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1537i;
        if (i11 != i10) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.f1537i = i10;
        }
    }

    public static void y(int i10, View view) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1538j;
        if (i11 != i10) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f1538j = i10;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public final void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f1530a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                g(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList f(View view) {
        i iVar = (i) this.f1521t.f32646t;
        int i10 = iVar.f34547u;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) iVar.l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar.h(i11));
            }
        }
        ArrayList arrayList3 = this.f1523v;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = z.a.f36875a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = z.a.f36875a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        z.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = z.a.f36876b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.f1520s);
    }

    public final q0 getLastWindowInsets() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.K;
        return rVar.f33126b | rVar.f33125a;
    }

    public Drawable getStatusBarBackground() {
        return this.H;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int i(int i10) {
        int[] iArr = this.A;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // n0.p
    public final void j(int i10, View view) {
        r rVar = this.K;
        if (i10 == 1) {
            rVar.f33126b = 0;
        } else {
            rVar.f33125a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f1530a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        fVar.o = false;
                    }
                } else {
                    fVar.f1542n = false;
                }
                fVar.f1543p = false;
            }
        }
        this.C = null;
    }

    @Override // n0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f1530a) != null) {
                    int[] iArr2 = this.f1524w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            r(1);
        }
    }

    @Override // n0.p
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        k(view, i10, i11, i12, i13, 0, this.f1525x);
    }

    @Override // n0.p
    public final boolean m(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1530a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            fVar.o = p10;
                        }
                    } else {
                        fVar.f1542n = p10;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        fVar.o = false;
                    }
                } else {
                    fVar.f1542n = false;
                }
            }
        }
        return z10;
    }

    @Override // n0.p
    public final void n(View view, View view2, int i10, int i11) {
        r rVar = this.K;
        if (i11 == 1) {
            rVar.f33126b = i10;
        } else {
            rVar.f33125a = i10;
        }
        this.C = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // n0.p
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f1530a) != null) {
                    int[] iArr2 = this.f1524w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1524w;
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[0]);
                    } else {
                        min = Math.min(i13, iArr3[0]);
                    }
                    i13 = min;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr3[1]);
                    } else {
                        min2 = Math.min(i14, iArr3[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            r(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(false);
        if (this.E) {
            if (this.D == null) {
                this.D = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.D);
        }
        if (this.F == null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.d.b(this)) {
                c0.h.c(this);
            }
        }
        this.f1526z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w(false);
        if (this.E && this.D != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.D);
        }
        View view = this.C;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1526z = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.G && this.H != null) {
            q0 q0Var = this.F;
            if (q0Var != null) {
                i10 = q0Var.d();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.H.setBounds(0, 0, getWidth(), i10);
                this.H.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w(true);
        }
        boolean u2 = u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            w(true);
        }
        return u2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int d10 = c0.e.d(this);
        ArrayList arrayList = this.f1520s;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1530a) == null || !cVar.h(this, view, d10))) {
                s(d10, view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0193, code lost:
    
        if (r0.i(r32, r19, r25, r20, r26) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1530a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1530a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        l(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        n(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        SparseArray<Parcelable> sparseArray = savedState.f1527u;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = p(childAt).f1530a;
            if (id2 != -1 && cVar != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1530a;
            if (id2 != -1 && cVar != null && (o = cVar.o(childAt)) != null) {
                sparseArray.append(id2, o);
            }
        }
        savedState.f1527u = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return m(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.B
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.u(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.B
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1530a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.B
            boolean r6 = r6.r(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.B
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.w(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean q(int i10, int i11, View view) {
        m0.e eVar = P;
        Rect c10 = c();
        g(view, c10);
        try {
            return c10.contains(i10, i11);
        } finally {
            c10.setEmpty();
            eVar.a(c10);
        }
    }

    public final void r(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        f fVar;
        ArrayList arrayList2;
        int i20;
        Rect rect2;
        int i21;
        View view;
        m0.e eVar;
        f fVar2;
        int i22;
        boolean z14;
        c cVar;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int d10 = c0.e.d(this);
        ArrayList arrayList3 = this.f1520s;
        int size = arrayList3.size();
        Rect c10 = c();
        Rect c11 = c();
        Rect c12 = c();
        int i23 = i10;
        int i24 = 0;
        while (true) {
            m0.e eVar2 = P;
            if (i24 < size) {
                View view2 = (View) arrayList3.get(i24);
                f fVar3 = (f) view2.getLayoutParams();
                if (i23 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i12 = size;
                    rect = c12;
                    i11 = i24;
                } else {
                    int i25 = 0;
                    while (i25 < i24) {
                        if (fVar3.f1540l == ((View) arrayList3.get(i25))) {
                            f fVar4 = (f) view2.getLayoutParams();
                            if (fVar4.f1539k != null) {
                                Rect c13 = c();
                                Rect c14 = c();
                                arrayList2 = arrayList3;
                                Rect c15 = c();
                                i19 = i25;
                                g(fVar4.f1539k, c13);
                                e(view2, c14, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i20 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i21 = i24;
                                fVar = fVar3;
                                view = view2;
                                rect2 = c12;
                                eVar = eVar2;
                                h(d10, c13, c15, fVar4, measuredWidth, measuredHeight);
                                if (c15.left == c14.left && c15.top == c14.top) {
                                    fVar2 = fVar4;
                                    i22 = measuredWidth;
                                    z14 = false;
                                } else {
                                    fVar2 = fVar4;
                                    i22 = measuredWidth;
                                    z14 = true;
                                }
                                d(fVar2, c15, i22, measuredHeight);
                                int i26 = c15.left - c14.left;
                                int i27 = c15.top - c14.top;
                                if (i26 != 0) {
                                    WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                                    view.offsetLeftAndRight(i26);
                                }
                                if (i27 != 0) {
                                    WeakHashMap<View, l0> weakHashMap3 = c0.f33054a;
                                    view.offsetTopAndBottom(i27);
                                }
                                if (z14 && (cVar = fVar2.f1530a) != null) {
                                    cVar.d(this, view, fVar2.f1539k);
                                }
                                c13.setEmpty();
                                eVar.a(c13);
                                c14.setEmpty();
                                eVar.a(c14);
                                c15.setEmpty();
                                eVar.a(c15);
                                i25 = i19 + 1;
                                eVar2 = eVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i20;
                                i24 = i21;
                                fVar3 = fVar;
                                c12 = rect2;
                            }
                        }
                        i19 = i25;
                        fVar = fVar3;
                        arrayList2 = arrayList3;
                        i20 = size;
                        rect2 = c12;
                        i21 = i24;
                        view = view2;
                        eVar = eVar2;
                        i25 = i19 + 1;
                        eVar2 = eVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i20;
                        i24 = i21;
                        fVar3 = fVar;
                        c12 = rect2;
                    }
                    f fVar5 = fVar3;
                    ArrayList arrayList4 = arrayList3;
                    int i28 = size;
                    Rect rect3 = c12;
                    i11 = i24;
                    View view3 = view2;
                    m0.e eVar3 = eVar2;
                    e(view3, c11, true);
                    if (fVar5.f1535g != 0 && !c11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f1535g, d10);
                        int i29 = absoluteGravity & 112;
                        if (i29 != 48) {
                            if (i29 == 80) {
                                c10.bottom = Math.max(c10.bottom, getHeight() - c11.top);
                            }
                        } else {
                            c10.top = Math.max(c10.top, c11.bottom);
                        }
                        int i30 = absoluteGravity & 7;
                        if (i30 != 3) {
                            if (i30 == 5) {
                                c10.right = Math.max(c10.right, getWidth() - c11.left);
                            }
                        } else {
                            c10.left = Math.max(c10.left, c11.right);
                        }
                    }
                    if (fVar5.f1536h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap<View, l0> weakHashMap4 = c0.f33054a;
                        if (c0.g.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            f fVar6 = (f) view3.getLayoutParams();
                            c cVar2 = fVar6.f1530a;
                            Rect c16 = c();
                            Rect c17 = c();
                            c17.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (cVar2 != null && cVar2.a(view3)) {
                                if (!c17.contains(c16)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + c16.toShortString() + " | Bounds:" + c17.toShortString());
                                }
                            } else {
                                c16.set(c17);
                            }
                            c17.setEmpty();
                            eVar3.a(c17);
                            if (c16.isEmpty()) {
                                c16.setEmpty();
                                eVar3.a(c16);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.f1536h, d10);
                                if ((absoluteGravity2 & 48) == 48 && (i17 = (c16.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.f1538j) < (i18 = c10.top)) {
                                    y(i18 - i17, view3);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - c16.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.f1538j) < (i16 = c10.bottom)) {
                                    y(height - i16, view3);
                                    z11 = true;
                                }
                                if (!z11) {
                                    y(0, view3);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i14 = (c16.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.f1537i) < (i15 = c10.left)) {
                                    x(i15 - i14, view3);
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - c16.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.f1537i) < (i13 = c10.right)) {
                                    x(width - i13, view3);
                                    z13 = true;
                                } else {
                                    z13 = z12;
                                }
                                if (!z13) {
                                    x(0, view3);
                                }
                                c16.setEmpty();
                                eVar3.a(c16);
                            }
                        }
                    }
                    if (i10 != 2) {
                        rect = rect3;
                        rect.set(((f) view3.getLayoutParams()).f1544q);
                        if (rect.equals(c11)) {
                            arrayList = arrayList4;
                            i12 = i28;
                            i23 = i10;
                        } else {
                            ((f) view3.getLayoutParams()).f1544q.set(c11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i31 = i11 + 1;
                    i12 = i28;
                    while (true) {
                        arrayList = arrayList4;
                        if (i31 >= i12) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i31);
                        f fVar7 = (f) view4.getLayoutParams();
                        c cVar3 = fVar7.f1530a;
                        if (cVar3 != null && cVar3.b(view4, view3)) {
                            if (i10 == 0 && fVar7.f1543p) {
                                fVar7.f1543p = false;
                            } else {
                                if (i10 != 2) {
                                    z10 = cVar3.d(this, view4, view3);
                                } else {
                                    cVar3.e(this, view3);
                                    z10 = true;
                                }
                                if (i10 == 1) {
                                    fVar7.f1543p = z10;
                                }
                            }
                        }
                        i31++;
                        arrayList4 = arrayList;
                    }
                    i23 = i10;
                }
                i24 = i11 + 1;
                c12 = rect;
                size = i12;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = c12;
                c10.setEmpty();
                eVar2.a(c10);
                c11.setEmpty();
                eVar2.a(c11);
                rect4.setEmpty();
                eVar2.a(rect4);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f1530a;
        if (cVar != null && cVar.m(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.y) {
            w(false);
            this.y = true;
        }
    }

    public final void s(int i10, View view) {
        boolean z10;
        Rect c10;
        Rect c11;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1539k;
        int i11 = 0;
        if (view2 == null && fVar.f != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            m0.e eVar = P;
            if (view2 != null) {
                c10 = c();
                c11 = c();
                try {
                    g(view2, c10);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    h(i10, c10, c11, fVar2, measuredWidth, measuredHeight);
                    d(fVar2, c11, measuredWidth, measuredHeight);
                    view.layout(c11.left, c11.top, c11.right, c11.bottom);
                    return;
                } finally {
                    c10.setEmpty();
                    eVar.a(c10);
                    c11.setEmpty();
                    eVar.a(c11);
                }
            }
            int i12 = fVar.f1534e;
            if (i12 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i13 = fVar3.f1532c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int i16 = i(i12) - measuredWidth2;
                if (i14 != 1) {
                    if (i14 == 5) {
                        i16 += measuredWidth2;
                    }
                } else {
                    i16 += measuredWidth2 / 2;
                }
                if (i15 != 16) {
                    if (i15 == 80) {
                        i11 = measuredHeight2 + 0;
                    }
                } else {
                    i11 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(i16, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            c10 = c();
            c10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.F != null) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (c0.d.b(this) && !c0.d.b(view)) {
                    c10.left = this.F.b() + c10.left;
                    c10.top = this.F.d() + c10.top;
                    c10.right -= this.F.c();
                    c10.bottom -= this.F.a();
                }
            }
            c11 = c();
            int i17 = fVar4.f1532c;
            if ((i17 & 7) == 0) {
                i17 |= 8388611;
            }
            if ((i17 & 112) == 0) {
                i17 |= 48;
            }
            n0.e.b(i17, view.getMeasuredWidth(), view.getMeasuredHeight(), c10, c11, i10);
            view.layout(c11.left, c11.top, c11.right, c11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.I = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
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
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            c0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = d0.a.f27248a;
            drawable = a.c.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        if (drawable != null && drawable.isVisible() != z10) {
            this.H.setVisible(z10, false);
        }
    }

    public final void t(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public final boolean u(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1522u;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        h hVar = O;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1530a;
            if ((z11 || z12) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, gl.Code, gl.Code, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            cVar.r(this, view, motionEvent2);
                        }
                    } else {
                        cVar.g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && cVar != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z11 = cVar.r(this, view, motionEvent);
                        }
                    } else {
                        z11 = cVar.g(this, view, motionEvent);
                    }
                    if (z11) {
                        this.B = view;
                    }
                }
                if (fVar.f1530a == null) {
                    fVar.f1541m = false;
                }
                boolean z13 = fVar.f1541m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f1541m = z10;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0075, code lost:
    
        if (r12 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.v():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.H) {
            return false;
        }
        return true;
    }

    public final void w(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f1530a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, gl.Code, gl.Code, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f1541m = false;
        }
        this.B = null;
        this.y = false;
    }

    public final void z() {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.d.b(this)) {
            if (this.J == null) {
                this.J = new a();
            }
            c0.i.u(this, this.J);
            setSystemUiVisibility(1280);
            return;
        }
        c0.i.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public SparseArray<Parcelable> f1527u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1527u = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1527u.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f1595s, i10);
            SparseArray<Parcelable> sparseArray = this.f1527u;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f1527u.keyAt(i12);
                parcelableArr[i12] = this.f1527u.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f1530a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1531b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1532c;

        /* renamed from: d, reason: collision with root package name */
        public int f1533d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1534e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public int f1535g;

        /* renamed from: h, reason: collision with root package name */
        public int f1536h;

        /* renamed from: i, reason: collision with root package name */
        public int f1537i;

        /* renamed from: j, reason: collision with root package name */
        public int f1538j;

        /* renamed from: k, reason: collision with root package name */
        public View f1539k;

        /* renamed from: l, reason: collision with root package name */
        public View f1540l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f1541m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f1542n;
        public boolean o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f1543p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f1544q;

        public f() {
            super(-2, -2);
            this.f1531b = false;
            this.f1532c = 0;
            this.f1533d = 0;
            this.f1534e = -1;
            this.f = -1;
            this.f1535g = 0;
            this.f1536h = 0;
            this.f1544q = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.o;
            }
            return this.f1542n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f1531b = false;
            this.f1532c = 0;
            this.f1533d = 0;
            this.f1534e = -1;
            this.f = -1;
            this.f1535g = 0;
            this.f1536h = 0;
            this.f1544q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.f33138g);
            this.f1532c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1533d = obtainStyledAttributes.getInteger(2, 0);
            this.f1534e = obtainStyledAttributes.getInteger(6, -1);
            this.f1535g = obtainStyledAttributes.getInt(5, 0);
            this.f1536h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1531b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.L;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.L;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.N;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.M);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(s.f.b("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1530a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f1530a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1531b = false;
            this.f1532c = 0;
            this.f1533d = 0;
            this.f1534e = -1;
            this.f = -1;
            this.f1535g = 0;
            this.f1536h = 0;
            this.f1544q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1531b = false;
            this.f1532c = 0;
            this.f1533d = 0;
            this.f1534e = -1;
            this.f = -1;
            this.f1535g = 0;
            this.f1536h = 0;
            this.f1544q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1531b = false;
            this.f1532c = 0;
            this.f1533d = 0;
            this.f1534e = -1;
            this.f = -1;
            this.f1535g = 0;
            this.f1536h = 0;
            this.f1544q = new Rect();
        }
    }
}
