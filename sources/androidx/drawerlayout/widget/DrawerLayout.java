package androidx.drawerlayout.widget;

import a3.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import com.huawei.hms.ads.gl;
import d0.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.q0;
import o0.g;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] F = {R.attr.layout_gravity};
    public static final boolean G;
    public static final boolean H;
    public static final boolean I;
    public a A;
    public ArrayList B;
    public Drawable C;
    public Rect D;
    public Matrix E;

    /* renamed from: s, reason: collision with root package name */
    public float f1596s;

    /* renamed from: t, reason: collision with root package name */
    public float f1597t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1598u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1599v;

    /* renamed from: w, reason: collision with root package name */
    public int f1600w;

    /* renamed from: x, reason: collision with root package name */
    public int f1601x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f1602z;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    static {
        boolean z10 = true;
        int i10 = Build.VERSION.SDK_INT;
        G = true;
        H = true;
        if (i10 < 29) {
            z10 = false;
        }
        I = z10;
    }

    public static boolean g(View view) {
        if (((b) view.getLayoutParams()).f1607a == 0) {
            return true;
        }
        return false;
    }

    public static boolean h(View view) {
        if (i(view)) {
            if ((((b) view.getLayoutParams()).f1609c & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean i(View view) {
        int i10 = ((b) view.getLayoutParams()).f1607a;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.e.d(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(View view) {
        if ((f(view) & 3) == 3) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (i(childAt)) {
                if (h(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            } else {
                throw null;
            }
        }
        if (!z10) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        View view2;
        super.addView(view, i10, layoutParams);
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 < childCount) {
                view2 = getChildAt(i11);
                if ((((b) view2.getLayoutParams()).f1609c & 1) == 1) {
                    break;
                } else {
                    i11++;
                }
            } else {
                view2 = null;
                break;
            }
        }
        if (view2 == null && !i(view)) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.s(view, 1);
        } else {
            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
            c0.d.s(view, 4);
        }
        if (!G) {
            c0.l(view, null);
        }
    }

    public final void b(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = (b) childAt.getLayoutParams();
            if (i(childAt)) {
                if (z10) {
                    bVar.getClass();
                } else {
                    childAt.getWidth();
                    if (a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
            }
        }
        throw null;
    }

    public final View c(int i10) {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((f(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof b) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f = gl.Code;
        for (int i10 = 0; i10 < childCount; i10++) {
            f = Math.max(f, ((b) getChildAt(i10).getLayoutParams()).f1608b);
        }
        this.f1597t = f;
        throw null;
    }

    public final View d() {
        boolean z10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (i(childAt)) {
                if (i(childAt)) {
                    if (((b) childAt.getLayoutParams()).f1608b > gl.Code) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f1597t > gl.Code) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x10 = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i10 = childCount - 1; i10 >= 0; i10--) {
                    View childAt = getChildAt(i10);
                    if (this.D == null) {
                        this.D = new Rect();
                    }
                    childAt.getHitRect(this.D);
                    if (this.D.contains((int) x10, (int) y) && !g(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(scrollX, scrollY);
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.E == null) {
                                    this.E = new Matrix();
                                }
                                matrix.invert(this.E);
                                obtain.transform(this.E);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX2 = getScrollX() - childAt.getLeft();
                            float scrollY2 = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX2, scrollY2);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX2, -scrollY2);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        int height = getHeight();
        boolean g6 = g(view);
        int width = getWidth();
        int save = canvas.save();
        if (g6) {
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background != null && background.getOpacity() == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && i(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt)) {
                            int right = childAt.getRight();
                            if (right > i10) {
                                i10 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i10, 0, width, getHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (this.f1597t > gl.Code && g6) {
            throw null;
        }
        return drawChild;
    }

    public final int e(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (i(view)) {
            int i14 = ((b) view.getLayoutParams()).f1607a;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            int d10 = c0.e.d(this);
            if (i14 != 3) {
                if (i14 != 5) {
                    if (i14 != 8388611) {
                        if (i14 == 8388613) {
                            int i15 = this.f1602z;
                            if (i15 == 3) {
                                if (d10 == 0) {
                                    i13 = this.f1601x;
                                } else {
                                    i13 = this.f1600w;
                                }
                                if (i13 != 3) {
                                    return i13;
                                }
                            } else {
                                return i15;
                            }
                        }
                    } else {
                        int i16 = this.y;
                        if (i16 == 3) {
                            if (d10 == 0) {
                                i12 = this.f1600w;
                            } else {
                                i12 = this.f1601x;
                            }
                            if (i12 != 3) {
                                return i12;
                            }
                        } else {
                            return i16;
                        }
                    }
                } else {
                    int i17 = this.f1601x;
                    if (i17 == 3) {
                        if (d10 == 0) {
                            i11 = this.f1602z;
                        } else {
                            i11 = this.y;
                        }
                        if (i11 != 3) {
                            return i11;
                        }
                    } else {
                        return i17;
                    }
                }
            } else {
                int i18 = this.f1600w;
                if (i18 == 3) {
                    if (d10 == 0) {
                        i10 = this.y;
                    } else {
                        i10 = this.f1602z;
                    }
                    if (i10 != 3) {
                        return i10;
                    }
                } else {
                    return i18;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int f(View view) {
        int i10 = ((b) view.getLayoutParams()).f1607a;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        return Gravity.getAbsoluteGravity(i10, c0.e.d(this));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public float getDrawerElevation() {
        if (H) {
            return this.f1596s;
        }
        return gl.Code;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.C;
    }

    public final void j(View view) {
        if (i(view)) {
            b bVar = (b) view.getLayoutParams();
            if (this.f1599v) {
                bVar.f1608b = 1.0f;
                bVar.f1609c = 1;
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt == view) {
                        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                        c0.d.s(childAt, 1);
                    } else {
                        WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                        c0.d.s(childAt, 4);
                    }
                }
                g.a aVar = g.a.f33528j;
                c0.i(aVar.a(), view);
                c0.g(0, view);
                if (h(view) && e(view) != 2) {
                    c0.j(view, aVar, null);
                }
                invalidate();
                return;
            }
            bVar.f1609c |= 2;
            if (a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void k(int i10, int i11) {
        View c10;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, c0.e.d(this));
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 == 8388613) {
                        this.f1602z = i10;
                    }
                } else {
                    this.y = i10;
                }
            } else {
                this.f1601x = i10;
            }
        } else {
            this.f1600w = i10;
        }
        if (i10 == 0) {
            if (i10 != 1) {
                if (i10 == 2 && (c10 = c(absoluteGravity)) != null) {
                    j(c10);
                    return;
                }
                return;
            }
            View c11 = c(absoluteGravity);
            if (c11 != null) {
                if (i(c11)) {
                    b bVar = (b) c11.getLayoutParams();
                    if (this.f1599v) {
                        bVar.f1608b = gl.Code;
                        bVar.f1609c = 0;
                        invalidate();
                        return;
                    }
                    bVar.f1609c |= 4;
                    if (a(c11)) {
                        c11.getWidth();
                        c11.getTop();
                        throw null;
                    }
                    getWidth();
                    c11.getTop();
                    throw null;
                }
                throw new IllegalArgumentException("View " + c11 + " is not a sliding drawer");
            }
            return;
        }
        throw null;
    }

    public final void l(View view, float f) {
        b bVar = (b) view.getLayoutParams();
        if (f == bVar.f1608b) {
            return;
        }
        bVar.f1608b = f;
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((a) this.B.get(size)).a();
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1599v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1599v = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 == 4) {
            if (d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            View d10 = d();
            if (d10 != null && e(d10) == 0) {
                b(false);
                throw null;
            }
            if (d10 == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f;
        int i14;
        boolean z11;
        int i15;
        boolean z12 = true;
        this.f1598u = true;
        int i16 = i12 - i10;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (g(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) bVar).topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt)) {
                        float f10 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (bVar.f1608b * f10));
                        f = (measuredWidth + i14) / f10;
                    } else {
                        float f11 = measuredWidth;
                        f = (i16 - r11) / f11;
                        i14 = i16 - ((int) (bVar.f1608b * f11));
                    }
                    if (f != bVar.f1608b) {
                        z11 = z12;
                    } else {
                        z11 = false;
                    }
                    int i19 = bVar.f1607a & 112;
                    if (i19 != 16) {
                        if (i19 != 80) {
                            int i20 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                            childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                        } else {
                            int i21 = i13 - i11;
                            childAt.layout(i14, (i21 - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i21 - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                        }
                    } else {
                        int i22 = i13 - i11;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = i22 - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                            if (i25 > i26) {
                                i23 = i26 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i23, measuredWidth + i14, measuredHeight + i23);
                    }
                    if (z11) {
                        l(childAt, f);
                    }
                    if (bVar.f1608b > gl.Code) {
                        i15 = 0;
                    } else {
                        i15 = 4;
                    }
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (I && (rootWindowInsets = getRootWindowInsets()) != null) {
            q0.g(rootWindowInsets, null).f33099a.i();
            throw null;
        }
        this.f1598u = false;
        this.f1599v = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        String str;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.e.d(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) bVar).leftMargin) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) bVar).topMargin) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, 1073741824));
                } else if (i(childAt)) {
                    if (H) {
                        float i13 = c0.i.i(childAt);
                        float f = this.f1596s;
                        if (i13 != f) {
                            c0.i.s(childAt, f);
                        }
                    }
                    int f10 = f(childAt) & 7;
                    if (f10 == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((z10 && z11) || (!z10 && z12)) {
                        StringBuilder sb2 = new StringBuilder("Child drawer has absolute gravity ");
                        if ((f10 & 3) != 3) {
                            if ((f10 & 5) == 5) {
                                str = "RIGHT";
                            } else {
                                str = Integer.toHexString(f10);
                            }
                        } else {
                            str = "LEFT";
                        }
                        throw new IllegalStateException(l.p(sb2, str, " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z10) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, ((ViewGroup.MarginLayoutParams) bVar).leftMargin + 0 + ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, ((ViewGroup.MarginLayoutParams) bVar).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View c10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        int i10 = savedState.f1603u;
        if (i10 != 0 && (c10 = c(i10)) != null) {
            j(c10);
        }
        int i11 = savedState.f1604v;
        if (i11 != 3) {
            k(i11, 3);
        }
        int i12 = savedState.f1605w;
        if (i12 != 3) {
            k(i12, 5);
        }
        int i13 = savedState.f1606x;
        if (i13 != 3) {
            k(i13, 8388611);
        }
        int i14 = savedState.y;
        if (i14 != 3) {
            k(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (!H) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.e.d(this);
            c0.e.d(this);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            b bVar = (b) getChildAt(i10).getLayoutParams();
            int i11 = bVar.f1609c;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                savedState.f1603u = bVar.f1607a;
                break;
            }
        }
        savedState.f1604v = this.f1600w;
        savedState.f1605w = this.f1601x;
        savedState.f1606x = this.y;
        savedState.y = this.f1602z;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10) {
            return;
        }
        b(true);
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.f1598u) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1596s = f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i(childAt)) {
                float f10 = this.f1596s;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.i.s(childAt, f10);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(a aVar) {
        ArrayList arrayList;
        a aVar2 = this.A;
        if (aVar2 != null && (arrayList = this.B) != null) {
            arrayList.remove(aVar2);
        }
        if (aVar != null) {
            if (this.B == null) {
                this.B = new ArrayList();
            }
            this.B.add(aVar);
        }
        this.A = aVar;
    }

    public void setDrawerLockMode(int i10) {
        k(i10, 3);
        k(i10, 5);
    }

    public void setScrimColor(int i10) {
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.C = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.C = new ColorDrawable(i10);
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = d0.a.f27248a;
            drawable = a.c.b(context, i10);
        } else {
            drawable = null;
        }
        this.C = drawable;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f1607a;

        /* renamed from: b, reason: collision with root package name */
        public float f1608b;

        /* renamed from: c, reason: collision with root package name */
        public int f1609c;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1607a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.F);
            this.f1607a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public b() {
            super(-1, -1);
            this.f1607a = 0;
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f1607a = 0;
            this.f1607a = bVar.f1607a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1607a = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1607a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public int f1603u;

        /* renamed from: v, reason: collision with root package name */
        public int f1604v;

        /* renamed from: w, reason: collision with root package name */
        public int f1605w;

        /* renamed from: x, reason: collision with root package name */
        public int f1606x;
        public int y;

        /* loaded from: classes.dex */
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
            this.f1603u = 0;
            this.f1603u = parcel.readInt();
            this.f1604v = parcel.readInt();
            this.f1605w = parcel.readInt();
            this.f1606x = parcel.readInt();
            this.y = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f1603u);
            parcel.writeInt(this.f1604v);
            parcel.writeInt(this.f1605w);
            parcel.writeInt(this.f1606x);
            parcel.writeInt(this.y);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f1603u = 0;
        }
    }
}
