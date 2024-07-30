package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.anythink.expressad.exoplayer.k.p;
import com.huawei.hms.ads.gl;
import d0.a;
import e0.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] U = {R.attr.layout_gravity};
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public int M;
    public VelocityTracker N;
    public boolean O;
    public ArrayList P;
    public f Q;
    public f R;
    public ArrayList S;
    public int T;

    /* renamed from: s, reason: collision with root package name */
    public int f2507s;

    /* renamed from: t, reason: collision with root package name */
    public p1.a f2508t;

    /* renamed from: u, reason: collision with root package name */
    public int f2509u;

    /* renamed from: v, reason: collision with root package name */
    public int f2510v;

    /* renamed from: w, reason: collision with root package name */
    public Parcelable f2511w;

    /* renamed from: x, reason: collision with root package name */
    public g f2512x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f2513z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public int f2514u;

        /* renamed from: v, reason: collision with root package name */
        public Parcelable f2515v;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return com.ironsource.adapters.facebook.a.i(sb2, this.f2514u, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f2514u);
            parcel.writeParcelable(this.f2515v, i10);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f2514u = parcel.readInt();
            this.f2515v = parcel.readParcelable(classLoader);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            cVar.getClass();
            cVar2.getClass();
            return 0;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static class d extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2516a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2517b;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.U);
            this.f2517b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(ViewPager viewPager, p1.a aVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(int i10);

        void b(int i10);
    }

    /* loaded from: classes.dex */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager viewPager = ViewPager.this;
            viewPager.f2507s = viewPager.f2508t.a();
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager viewPager = ViewPager.this;
            viewPager.f2507s = viewPager.f2508t.a();
            throw null;
        }
    }

    static {
        new a();
    }

    public static boolean b(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && b(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L9
            goto L63
        L9:
            if (r0 == 0) goto L64
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r6) goto L17
            r3 = r1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L33:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L63:
            r0 = 0
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb3
            if (r3 == r0) goto Lb3
            if (r7 != r5) goto L97
            android.graphics.Rect r4 = r6.c(r3)
            int r4 = r4.left
            android.graphics.Rect r5 = r6.c(r0)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r6.f2509u
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r1
            r6.D = r2
            r6.g(r0, r2)
            goto Lce
        L91:
            boolean r0 = r3.requestFocus()
        L95:
            r2 = r0
            goto Lcf
        L97:
            if (r7 != r4) goto Lcf
            android.graphics.Rect r1 = r6.c(r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.c(r0)
            int r2 = r2.left
            if (r0 == 0) goto Lae
            if (r1 > r2) goto Lae
            boolean r0 = r6.e()
            goto L95
        Lae:
            boolean r0 = r3.requestFocus()
            goto L95
        Lb3:
            if (r7 == r5) goto Lc2
            if (r7 != r1) goto Lb8
            goto Lc2
        Lb8:
            if (r7 == r4) goto Lbd
            r0 = 2
            if (r7 != r0) goto Lcf
        Lbd:
            boolean r2 = r6.e()
            goto Lcf
        Lc2:
            int r0 = r6.f2509u
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r1
            r6.D = r2
            r6.g(r0, r2)
            goto Lce
        Lcd:
            r1 = r2
        Lce:
            r2 = r1
        Lcf:
            if (r2 == 0) goto Ld8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        d dVar = (d) layoutParams;
        boolean z11 = dVar.f2516a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f2516a = z12;
        if (this.B) {
            if (!z12) {
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f2508t == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * gl.Code))) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || scrollX >= ((int) (clientWidth * gl.Code))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    public final void d(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.I = motionEvent.getX(i10);
            this.M = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.a(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r6 = r5.a(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.e()
            goto L62
        L41:
            r6 = 66
            boolean r6 = r5.a(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.f2509u
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.D = r2
            r5.g(r6, r2)
            r6 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r6 = r5.a(r6)
            goto L62
        L61:
            r6 = r2
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                p1.a aVar = this.f2508t;
                if (aVar != null) {
                    if (aVar.a() <= 1) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2513z;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final boolean e() {
        p1.a aVar = this.f2508t;
        if (aVar == null || this.f2509u >= aVar.a() - 1) {
            return false;
        }
        int i10 = this.f2509u + 1;
        this.D = false;
        g(i10, false);
        return true;
    }

    public final void f(int i10) {
        String hexString;
        if (this.f2509u == i10) {
            if (this.f2508t == null || this.D || getWindowToken() == null) {
                return;
            }
            this.f2508t.getClass();
            int i11 = this.E;
            Math.max(0, this.f2509u - i11);
            int a10 = this.f2508t.a();
            Math.min(a10 - 1, this.f2509u + i11);
            if (a10 != this.f2507s) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException unused) {
                    hexString = Integer.toHexString(getId());
                }
                StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
                i.n(sb2, this.f2507s, ", found: ", a10, " Pager id: ");
                sb2.append(hexString);
                sb2.append(" Pager class: ");
                sb2.append(getClass());
                sb2.append(" Problematic adapter: ");
                sb2.append(this.f2508t.getClass());
                throw new IllegalStateException(sb2.toString());
            }
            throw null;
        }
        throw null;
    }

    public final void g(int i10, boolean z10) {
        p1.a aVar = this.f2508t;
        if (aVar != null && aVar.a() > 0) {
            if (!z10 && this.f2509u == i10) {
                throw null;
            }
            boolean z11 = true;
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f2508t.a()) {
                i10 = this.f2508t.a() - 1;
            }
            int i11 = this.E;
            int i12 = this.f2509u;
            if (i10 <= i12 + i11) {
                if (i10 >= i12 - i11) {
                    if (i12 == i10) {
                        z11 = false;
                    }
                    if (this.O) {
                        this.f2509u = i10;
                        if (z11) {
                            f fVar = this.Q;
                            if (fVar != null) {
                                fVar.b(i10);
                            }
                            ArrayList arrayList = this.P;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    f fVar2 = (f) this.P.get(i13);
                                    if (fVar2 != null) {
                                        fVar2.b(i10);
                                    }
                                }
                            }
                            f fVar3 = this.R;
                            if (fVar3 != null) {
                                fVar3.b(i10);
                            }
                        }
                        requestLayout();
                        return;
                    }
                    f(i10);
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public p1.a getAdapter() {
        return this.f2508t;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f2509u;
    }

    public int getOffscreenPageLimit() {
        return this.E;
    }

    public int getPageMargin() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y > 0 && this.f2513z != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        int action = motionEvent.getAction() & p.f9095b;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.F) {
                    return true;
                }
                if (this.G) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        d(motionEvent);
                    }
                } else {
                    int i10 = this.M;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.I;
                        float abs = Math.abs(f11);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.L);
                        if (f11 != gl.Code) {
                            float f12 = this.I;
                            if ((f12 < this.H && f11 > gl.Code) || (f12 > getWidth() - this.H && f11 < gl.Code)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && b((int) f11, (int) x10, (int) y, this, false)) {
                                this.I = x10;
                                this.J = y;
                                this.G = true;
                                return false;
                            }
                        }
                        float f13 = 0;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.F = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.K;
                            if (f11 > gl.Code) {
                                f10 = f14 + f13;
                            } else {
                                f10 = f14 - f13;
                            }
                            this.I = f10;
                            this.J = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.G = true;
                        }
                        if (this.F) {
                            this.I = x10;
                            getScrollX();
                            getClientWidth();
                            throw null;
                        }
                    }
                }
                if (this.N == null) {
                    this.N = VelocityTracker.obtain();
                }
                this.N.addMovement(motionEvent);
                return this.F;
            }
            float x11 = motionEvent.getX();
            this.K = x11;
            this.I = x11;
            float y10 = motionEvent.getY();
            this.L = y10;
            this.J = y10;
            this.M = motionEvent.getPointerId(0);
            this.G = false;
            throw null;
        }
        this.M = -1;
        this.F = false;
        this.G = false;
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.N = null;
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r17.getChildCount()
            int r2 = r21 - r19
            int r3 = r22 - r20
            int r4 = r17.getPaddingLeft()
            int r5 = r17.getPaddingTop()
            int r6 = r17.getPaddingRight()
            int r7 = r17.getPaddingBottom()
            int r8 = r17.getScrollX()
            r9 = 0
            r10 = r9
        L20:
            r11 = 8
            if (r10 >= r1) goto Lb3
            android.view.View r12 = r0.getChildAt(r10)
            int r13 = r12.getVisibility()
            if (r13 == r11) goto Laf
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            androidx.viewpager.widget.ViewPager$d r11 = (androidx.viewpager.widget.ViewPager.d) r11
            boolean r13 = r11.f2516a
            if (r13 == 0) goto Laf
            int r11 = r11.f2517b
            r13 = r11 & 7
            r11 = r11 & 112(0x70, float:1.57E-43)
            r14 = 1
            if (r13 == r14) goto L5c
            r14 = 3
            if (r13 == r14) goto L56
            r14 = 5
            if (r13 == r14) goto L49
            r13 = r4
            goto L6d
        L49:
            int r13 = r2 - r6
            int r14 = r12.getMeasuredWidth()
            int r13 = r13 - r14
            int r14 = r12.getMeasuredWidth()
            int r6 = r6 + r14
            goto L68
        L56:
            int r13 = r12.getMeasuredWidth()
            int r13 = r13 + r4
            goto L6d
        L5c:
            int r13 = r12.getMeasuredWidth()
            int r13 = r2 - r13
            int r13 = r13 / 2
            int r13 = java.lang.Math.max(r13, r4)
        L68:
            r16 = r13
            r13 = r4
            r4 = r16
        L6d:
            r14 = 16
            if (r11 == r14) goto L8e
            r14 = 48
            if (r11 == r14) goto L88
            r14 = 80
            if (r11 == r14) goto L7b
            r11 = r5
            goto L9f
        L7b:
            int r11 = r3 - r7
            int r14 = r12.getMeasuredHeight()
            int r11 = r11 - r14
            int r14 = r12.getMeasuredHeight()
            int r7 = r7 + r14
            goto L9a
        L88:
            int r11 = r12.getMeasuredHeight()
            int r11 = r11 + r5
            goto L9f
        L8e:
            int r11 = r12.getMeasuredHeight()
            int r11 = r3 - r11
            int r11 = r11 / 2
            int r11 = java.lang.Math.max(r11, r5)
        L9a:
            r16 = r11
            r11 = r5
            r5 = r16
        L9f:
            int r4 = r4 + r8
            int r14 = r12.getMeasuredWidth()
            int r14 = r14 + r4
            int r15 = r12.getMeasuredHeight()
            int r15 = r15 + r5
            r12.layout(r4, r5, r14, r15)
            r5 = r11
            r4 = r13
        Laf:
            int r10 = r10 + 1
            goto L20
        Lb3:
            r2 = r9
        Lb4:
            r3 = 0
            if (r2 >= r1) goto Ld0
            android.view.View r4 = r0.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 == r11) goto Lcd
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.viewpager.widget.ViewPager$d r4 = (androidx.viewpager.widget.ViewPager.d) r4
            boolean r4 = r4.f2516a
            if (r4 == 0) goto Lcc
            goto Lcd
        Lcc:
            throw r3
        Lcd:
            int r2 = r2 + 1
            goto Lb4
        Ld0:
            boolean r1 = r0.O
            if (r1 != 0) goto Ld7
            r0.O = r9
            return
        Ld7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d dVar;
        d dVar2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.H = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.f2516a) {
                int i15 = dVar2.f2517b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 != 48 && i17 != 80) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i16 != 3 && i16 != 5) {
                    z11 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                    if (z11) {
                        i18 = 1073741824;
                    }
                }
                int i19 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i12 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i20 != -2) {
                    if (i20 == -1) {
                        i20 = measuredHeight;
                    }
                } else {
                    i20 = measuredHeight;
                    i14 = i18;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i12), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.B = true;
        f(this.f2509u);
        this.B = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f2516a)) {
                dVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gl.Code), 1073741824), this.A);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = 1;
            i13 = childCount;
            i11 = 0;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i13) {
            if (getChildAt(i11).getVisibility() != 0) {
                i11 += i12;
            } else {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        if (this.f2508t != null) {
            g(savedState.f2514u, true);
        } else {
            this.f2510v = savedState.f2514u;
            this.f2511w = savedState.f2515v;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2514u = this.f2509u;
        p1.a aVar = this.f2508t;
        if (aVar != null) {
            aVar.getClass();
            savedState.f2515v = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            if (i12 > 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p1.a aVar;
        float f10;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f2508t) == null || aVar.a() == 0) {
            return false;
        }
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        int action = motionEvent.getAction() & p.f9095b;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                d(motionEvent);
                                this.I = motionEvent.getX(motionEvent.findPointerIndex(this.M));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.I = motionEvent.getX(actionIndex);
                            this.M = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.F) {
                        throw null;
                    }
                } else {
                    if (!this.F) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.M);
                        if (findPointerIndex != -1) {
                            float x10 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x10 - this.I);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.J);
                            float f11 = 0;
                            if (abs > f11 && abs > abs2) {
                                this.F = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f12 = this.K;
                                if (x10 - f12 > gl.Code) {
                                    f10 = f12 + f11;
                                } else {
                                    f10 = f12 - f11;
                                }
                                this.I = f10;
                                this.J = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        } else {
                            this.M = -1;
                            this.F = false;
                            this.G = false;
                            VelocityTracker velocityTracker = this.N;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.N = null;
                                throw null;
                            }
                            throw null;
                        }
                    }
                    if (this.F) {
                        this.I = motionEvent.getX(motionEvent.findPointerIndex(this.M));
                        getScrollX();
                        getClientWidth();
                        throw null;
                    }
                }
            } else if (this.F) {
                VelocityTracker velocityTracker2 = this.N;
                velocityTracker2.computeCurrentVelocity(1000, 0);
                velocityTracker2.getXVelocity(this.M);
                this.D = true;
                getClientWidth();
                getScrollX();
                if (getClientWidth() > 0) {
                    getScrollX();
                    throw null;
                }
                throw null;
            }
            return true;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.B) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(p1.a aVar) {
        p1.a aVar2 = this.f2508t;
        if (aVar2 == null) {
            this.f2508t = aVar;
            this.f2507s = 0;
            if (aVar != null) {
                if (this.f2512x == null) {
                    this.f2512x = new g();
                }
                synchronized (this.f2508t) {
                }
                this.D = false;
                boolean z10 = this.O;
                this.O = true;
                this.f2507s = this.f2508t.a();
                if (this.f2510v >= 0) {
                    this.f2508t.getClass();
                    g(this.f2510v, true);
                    this.f2510v = -1;
                    this.f2511w = null;
                } else if (!z10) {
                    f(this.f2509u);
                } else {
                    requestLayout();
                }
            }
            ArrayList arrayList = this.S;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.S.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((e) this.S.get(i10)).a(this, aVar);
                }
                return;
            }
            return;
        }
        synchronized (aVar2) {
        }
        this.f2508t.getClass();
        throw null;
    }

    public void setCurrentItem(int i10) {
        this.D = false;
        g(i10, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.E) {
            this.E = i10;
            f(this.f2509u);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.Q = fVar;
    }

    public void setPageMargin(int i10) {
        this.y = i10;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2513z = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.T == i10) {
            return;
        }
        this.T = i10;
        f fVar = this.Q;
        if (fVar != null) {
            fVar.a(i10);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.P.get(i11);
                if (fVar2 != null) {
                    fVar2.a(i10);
                }
            }
        }
        f fVar3 = this.R;
        if (fVar3 != null) {
            fVar3.a(i10);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f2513z) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setPageMarginDrawable(a.c.b(context, i10));
    }
}
