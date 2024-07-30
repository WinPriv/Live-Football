package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.n;
import n0.o;
import n0.q;
import n0.r;
import o0.g;
import o0.i;
import r0.d;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements q, n {
    public static final float S = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a T = new a();
    public static final int[] U = {R.attr.fillViewport};
    public boolean A;
    public View B;
    public boolean C;
    public VelocityTracker D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int[] K;
    public final int[] L;
    public int M;
    public int N;
    public SavedState O;
    public final r P;
    public final o Q;
    public float R;

    /* renamed from: s, reason: collision with root package name */
    public final float f1586s;

    /* renamed from: t, reason: collision with root package name */
    public long f1587t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1588u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1589v;

    /* renamed from: w, reason: collision with root package name */
    public final EdgeEffect f1590w;

    /* renamed from: x, reason: collision with root package name */
    public final EdgeEffect f1591x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1592z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f1593s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return com.ironsource.adapters.facebook.a.i(sb2, this.f1593s, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1593s);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1593s = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static class a extends n0.a {
        @Override // n0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            i.c(accessibilityEvent, nestedScrollView.getScrollX());
            i.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // n0.a
        public final void d(View view, g gVar) {
            int scrollRange;
            View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfo.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                gVar.i(true);
                if (nestedScrollView.getScrollY() > 0) {
                    gVar.b(g.a.f33525g);
                    gVar.b(g.a.f33529k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    gVar.b(g.a.f);
                    gVar.b(g.a.f33530l);
                }
            }
        }

        @Override // n0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 != 8192 && i10 != 16908344) {
                    if (i10 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.hamkho.livefoot.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f1588u = new Rect();
        this.f1592z = true;
        this.A = false;
        this.B = null;
        this.C = false;
        this.F = true;
        this.J = -1;
        this.K = new int[2];
        this.L = new int[2];
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = d.b.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1590w = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = d.b.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1591x = edgeEffect2;
        this.f1586s = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1589v = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.G = viewConfiguration.getScaledTouchSlop();
        this.H = viewConfiguration.getScaledMinimumFlingVelocity();
        this.I = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U, com.hamkho.livefoot.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.P = new r();
        this.Q = new o(this);
        setNestedScrollingEnabled(true);
        c0.l(this, T);
    }

    public static boolean g(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && g((View) parent, view2)) {
            return true;
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.R == gl.Code) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.R = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.R;
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && h(maxScrollAmount, getHeight(), findNextFocus)) {
            Rect rect = this.f1588u;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            c(b(rect));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!h(0, getHeight(), findFocus))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int b(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        }
        if (rect.height() > height) {
            i11 = 0 - (i10 - rect.bottom);
        } else {
            i11 = 0 - (scrollY - rect.top);
        }
        return Math.max(i11, -getScrollY());
    }

    public final void c(int i10) {
        if (i10 != 0) {
            if (this.F) {
                t(0, i10, false);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.d(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !d(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f10, boolean z10) {
        return this.Q.a(f, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f10) {
        return this.Q.b(f, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.Q.c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.Q.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1590w;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1591x;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, gl.Code);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                c0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(int i10) {
        if (getChildCount() > 0) {
            this.f1589v.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.N = getScrollY();
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this);
        }
    }

    public final boolean f(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f1588u;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return gl.Code;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.P;
        return rVar.f33126b | rVar.f33125a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return gl.Code;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final boolean h(int i10, int i11, View view) {
        Rect rect = this.f1588u;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.Q.f(0) == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.Q.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.Q.f33096d;
    }

    @Override // n0.p
    public final void j(int i10, View view) {
        r rVar = this.P;
        if (i10 == 1) {
            rVar.f33126b = 0;
        } else {
            rVar.f33125a = 0;
        }
        w(i10);
    }

    @Override // n0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        i(i13, i14, iArr);
    }

    @Override // n0.p
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        i(i13, i14, null);
    }

    @Override // n0.p
    public final boolean m(View view, View view2, int i10, int i11) {
        if ((i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // n0.p
    public final void n(View view, View view2, int i10, int i11) {
        r rVar = this.P;
        if (i11 == 1) {
            rVar.f33126b = i10;
        } else {
            rVar.f33125a = i10;
        }
        u(2, i11);
    }

    @Override // n0.p
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        this.Q.c(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = 0;
        if (motionEvent.getAction() == 8 && !this.C) {
            if (androidx.activity.n.C0(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
            } else if (androidx.activity.n.C0(motionEvent, 4194304)) {
                f = motionEvent.getAxisValue(26);
            } else {
                f = 0.0f;
            }
            if (f != gl.Code) {
                int verticalScrollFactorCompat = (int) (f * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i11 = scrollY - verticalScrollFactorCompat;
                if (i11 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode != 0 && (overScrollMode != 1 || getScrollRange() <= 0)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13 && !androidx.activity.n.C0(motionEvent, 8194)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        float height = (-i11) / getHeight();
                        EdgeEffect edgeEffect = this.f1590w;
                        d.b(edgeEffect, height, 0.5f);
                        edgeEffect.onRelease();
                        invalidate();
                        z10 = 1;
                    } else {
                        z10 = 0;
                    }
                } else if (i11 > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if (overScrollMode2 != 0 && (overScrollMode2 != 1 || getScrollRange() <= 0)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11 && !androidx.activity.n.C0(motionEvent, 8194)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        float height2 = (i11 - scrollRange) / getHeight();
                        EdgeEffect edgeEffect2 = this.f1591x;
                        d.b(edgeEffect2, height2, 0.5f);
                        edgeEffect2.onRelease();
                        invalidate();
                        i10 = 1;
                    }
                    z10 = i10;
                    i10 = scrollRange;
                } else {
                    z10 = 0;
                    i10 = i11;
                }
                if (i10 != scrollY) {
                    super.scrollTo(getScrollX(), i10);
                    return true;
                }
                return z10;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f1592z = false;
        View view = this.B;
        if (view != null && g(view, this)) {
            View view2 = this.B;
            Rect rect = this.f1588u;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.B = null;
        if (!this.A) {
            if (this.O != null) {
                scrollTo(getScrollX(), this.O.f1593s);
                this.O = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.E && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f10, boolean z10) {
        if (!z10) {
            dispatchNestedFling(gl.Code, f10, true);
            e((int) f10);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f10) {
        return dispatchNestedPreFling(f, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        i(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        n(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || (true ^ h(0, getHeight(), findNextFocusFromRect))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.O = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1593s = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && h(0, i13, findFocus)) {
            Rect rect = this.f1588u;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            c(b(rect));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return m(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.y = (int) motionEvent.getY(i10);
            this.J = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L1a
        L17:
            r11 = r0
            r10 = r1
            goto L1e
        L1a:
            if (r11 >= 0) goto L1d
            goto L17
        L1d:
            r10 = r0
        L1e:
            if (r12 <= r13) goto L23
            r12 = r13
        L21:
            r13 = r1
            goto L28
        L23:
            if (r12 >= 0) goto L27
            r12 = r0
            goto L21
        L27:
            r13 = r0
        L28:
            if (r13 == 0) goto L45
            n0.o r2 = r9.Q
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L34
            r2 = r1
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f1589v
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.q(int, int, int, int):boolean");
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z11 = false;
        } else {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            c(i13);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1592z) {
            Rect rect = this.f1588u;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        } else {
            this.B = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        if (b10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, b10);
            } else {
                t(0, b10, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.D) != null) {
            velocityTracker.recycle();
            this.D = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1592z = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a10 = d.a(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f = this.f1586s * 0.015f;
        double log = Math.log(abs / f);
        double d10 = S;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f)) < a10) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i10 >= 0) {
                if (width + i10 > width2) {
                    i10 = width2 - width;
                }
            } else {
                i10 = 0;
            }
            if (height < height2 && i11 >= 0) {
                if (height + i11 > height2) {
                    i11 = height2 - height;
                }
            } else {
                i11 = 0;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        o oVar = this.Q;
        if (oVar.f33096d) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.i.z(oVar.f33095c);
        }
        oVar.f33096d = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.F = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return u(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1587t > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1589v.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
            if (z10) {
                u(2, 1);
            } else {
                w(1);
            }
            this.N = getScrollY();
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.k(this);
        } else {
            if (!this.f1589v.isFinished()) {
                this.f1589v.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f1587t = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i10, int i11) {
        return this.Q.g(i10, i11);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1590w;
        if (d.a(edgeEffect) != gl.Code) {
            d.b(edgeEffect, gl.Code, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1591x;
        if (d.a(edgeEffect2) != gl.Code) {
            d.b(edgeEffect2, gl.Code, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void w(int i10) {
        this.Q.h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(c cVar) {
    }
}
