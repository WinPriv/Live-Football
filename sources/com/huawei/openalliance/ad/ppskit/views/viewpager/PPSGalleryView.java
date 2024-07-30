package com.huawei.openalliance.ad.ppskit.views.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import cb.d;
import cb.e;
import cb.f;
import cb.g;
import com.anythink.expressad.exoplayer.k.p;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import qa.l;

/* loaded from: classes2.dex */
public class PPSGalleryView extends ViewGroup {

    /* renamed from: l0, reason: collision with root package name */
    public static final a f23558l0 = new a();

    /* renamed from: m0, reason: collision with root package name */
    public static final b f23559m0 = new b();
    public final Rect A;
    public Parcelable B;
    public e C;
    public float D;
    public float E;
    public f F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public float L;
    public final int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f23560c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f23561d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f23562e0;

    /* renamed from: f0, reason: collision with root package name */
    public ArrayList f23563f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f23564g0;

    /* renamed from: h0, reason: collision with root package name */
    public EdgeEffect f23565h0;

    /* renamed from: i0, reason: collision with root package name */
    public EdgeEffect f23566i0;

    /* renamed from: j0, reason: collision with root package name */
    public final c f23567j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f23568k0;

    /* renamed from: s, reason: collision with root package name */
    public int f23569s;

    /* renamed from: t, reason: collision with root package name */
    public int f23570t;

    /* renamed from: u, reason: collision with root package name */
    public int f23571u;

    /* renamed from: v, reason: collision with root package name */
    public int f23572v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23573w;

    /* renamed from: x, reason: collision with root package name */
    public Scroller f23574x;
    public final ArrayList<cb.a> y;

    /* renamed from: z, reason: collision with root package name */
    public final cb.a f23575z;

    /* loaded from: classes2.dex */
    public static class a implements Comparator<cb.a> {
        @Override // java.util.Comparator
        public final int compare(cb.a aVar, cb.a aVar2) {
            return aVar.f3473b - aVar2.f3473b;
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f10 = f - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSGalleryView pPSGalleryView = PPSGalleryView.this;
            pPSGalleryView.setScrollState(0);
            pPSGalleryView.n();
        }
    }

    public PPSGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23572v = -1;
        this.y = new ArrayList<>();
        this.f23575z = new cb.a();
        this.A = new Rect();
        this.B = null;
        this.D = -3.4028235E38f;
        this.E = Float.MAX_VALUE;
        this.M = 1;
        this.R = -1;
        this.W = true;
        this.f23567j0 = new c();
        this.f23568k0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f23574x = new Scroller(context2, f23559m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.T = (int) (400.0f * f);
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23565h0 = new EdgeEffect(context2);
        this.f23566i0 = new EdgeEffect(context2);
        this.V = (int) (25.0f * f);
        this.f23564g0 = (int) (2.0f * f);
        this.f23562e0 = (int) (f * 16.0f);
        setAccessibilityDelegate(new cb.b(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setOnApplyWindowInsetsListener(new cb.c(this));
    }

    private int getClientViewWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public static boolean h(int i10, int i11, int i12, View view, boolean z10) {
        boolean z11;
        boolean z12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i11 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = i12 + scrollY;
                if (i14 >= childAt.getTop() && i14 < childAt.getBottom()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 && z12 && h(i10, i13 - childAt.getLeft(), i14 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        if (!z10 || !view.canScrollHorizontally(-i10)) {
            return false;
        }
        return true;
    }

    private void setScrollingCacheEnabledStatus(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
        }
    }

    public final Rect a(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        rect.left = view.getLeft();
        rect.right = view.getRight();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
        }
        return rect;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        cb.a c10;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (c10 = c(childAt)) != null && c10.f3473b == this.f23571u) {
                    childAt.addFocusables(arrayList, i10, i11);
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
        cb.a c10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c10 = c(childAt)) != null && c10.f3473b == this.f23571u) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        if (this.G) {
            gVar.f3483b = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public final cb.a b(int i10, int i11) {
        View view;
        cb.a aVar = new cb.a();
        aVar.f3473b = i10;
        List<View> list = ((l) this.C).f34751a;
        if (list != null) {
            addView(list.get(i10));
            view = list.get(i10);
        } else {
            view = null;
        }
        aVar.f3472a = view;
        this.C.getClass();
        aVar.f3475d = 1.0f;
        ArrayList<cb.a> arrayList = this.y;
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.add(i11, aVar);
        } else {
            arrayList.add(aVar);
        }
        return aVar;
    }

    public final cb.a c(View view) {
        boolean z10;
        int i10 = 0;
        while (true) {
            ArrayList<cb.a> arrayList = this.y;
            if (i10 < arrayList.size()) {
                cb.a aVar = arrayList.get(i10);
                e eVar = this.C;
                Object obj = aVar.f3472a;
                ((l) eVar).getClass();
                if (view == obj) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return aVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.C == null) {
            return false;
        }
        int clientViewWidth = getClientViewWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientViewWidth * this.D))) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || scrollX >= ((int) (clientViewWidth * this.E))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f23573w = true;
        if (!this.f23574x.isFinished() && this.f23574x.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f23574x.getCurrX();
            int currY = this.f23574x.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f23574x.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        g(true);
    }

    public final void d(float f, int i10, int i11) {
        ArrayList arrayList = this.f23563f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) this.f23563f0.get(i12);
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
        this.f23560c0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
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
            if (r0 != 0) goto L62
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5d
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5d
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m(r4)
            goto L5e
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5d
            boolean r6 = r5.m(r1)
            goto L5e
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.p()
            goto L5e
        L41:
            r6 = 66
            goto L58
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L56
            int r6 = r5.f23571u
            if (r6 <= 0) goto L5d
            int r6 = r6 - r1
            r5.H = r2
            r5.f(r6, r1, r2, r2)
            r6 = r1
            goto L5e
        L56:
            r6 = 17
        L58:
            boolean r6 = r5.m(r6)
            goto L5e
        L5d:
            r6 = r2
        L5e:
            if (r6 == 0) goto L61
            goto L62
        L61:
            r1 = r2
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        cb.a c10;
        if (4096 == accessibilityEvent.getEventType()) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (c10 = c(childAt)) != null && c10.f3473b == this.f23571u && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        e eVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (eVar = this.C) == null || eVar.a() <= 1)) {
            this.f23565h0.finish();
            this.f23566i0.finish();
        } else {
            if (!this.f23565h0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.D * width);
                this.f23565h0.setSize(height, width);
                z10 = false | this.f23565h0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f23566i0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.E + 1.0f)) * width2);
                this.f23566i0.setSize(height2, width2);
                z10 |= this.f23566i0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        boolean z12;
        int scrollX;
        int abs;
        cb.a j10 = j(i10);
        if (j10 != null) {
            i12 = (int) (Math.max(this.D, Math.min(j10.f3476e, this.E)) * getClientViewWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabledStatus(false);
            } else {
                Scroller scroller = this.f23574x;
                if (scroller != null && !scroller.isFinished()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.f23573w) {
                        scrollX = this.f23574x.getCurrX();
                    } else {
                        scrollX = this.f23574x.getStartX();
                    }
                    this.f23574x.abortAnimation();
                    setScrollingCacheEnabledStatus(false);
                } else {
                    scrollX = getScrollX();
                }
                int i13 = scrollX;
                int scrollY = getScrollY();
                int i14 = i12 - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    g(false);
                    n();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabledStatus(true);
                    setScrollState(2);
                    int clientViewWidth = getClientViewWidth();
                    int i16 = clientViewWidth / 2;
                    float f = clientViewWidth;
                    float f10 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f10) + f10;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.C.getClass();
                        abs = (int) (((Math.abs(i14) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f23573w = false;
                    this.f23574x.startScroll(i13, scrollY, i14, i15, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z11) {
                r(i10);
                return;
            }
            return;
        }
        if (z11) {
            r(i10);
        }
        g(false);
        scrollTo(i12, 0);
        q(i12);
    }

    public final void f(int i10, boolean z10, boolean z11, int i11) {
        e eVar = this.C;
        boolean z12 = false;
        if (eVar != null && eVar.a() > 0) {
            ArrayList<cb.a> arrayList = this.y;
            if (!z11 && this.f23571u == i10 && arrayList.size() != 0) {
                setScrollingCacheEnabledStatus(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.C.a()) {
                i10 = this.C.a() - 1;
            }
            int i12 = this.f23571u;
            int i13 = this.M;
            if (i10 > i12 + i13 || i10 < i12 - i13) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    arrayList.get(i14).f3474c = true;
                }
            }
            if (this.f23571u != i10) {
                z12 = true;
            }
            if (this.W) {
                this.f23571u = i10;
                if (z12) {
                    r(i10);
                }
                requestLayout();
                return;
            }
            i(i10);
            e(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabledStatus(false);
    }

    public final void g(boolean z10) {
        boolean z11;
        if (this.f23568k0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabledStatus(false);
            if (!this.f23574x.isFinished()) {
                this.f23574x.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f23574x.getCurrX();
                int currY = this.f23574x.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.H = false;
        int i10 = 0;
        while (true) {
            ArrayList<cb.a> arrayList = this.y;
            if (i10 >= arrayList.size()) {
                break;
            }
            cb.a aVar = arrayList.get(i10);
            if (aVar.f3474c) {
                aVar.f3474c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            c cVar = this.f23567j0;
            if (z10) {
                postOnAnimation(cVar);
            } else {
                cVar.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public e getAdapter() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f23571u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x00c7, code lost:
    
        if (r2 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00d5, code lost:
    
        if (r2 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7 == r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r2 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        r7 = r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        if (r10 < r5.size()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0160, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0159, code lost:
    
        r7 = r5.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0147, code lost:
    
        if (r10 < r5.size()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0157, code lost:
    
        if (r10 < r5.size()) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r15) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView.i(int):void");
    }

    public final cb.a j(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList<cb.a> arrayList = this.y;
            if (i11 < arrayList.size()) {
                cb.a aVar = arrayList.get(i11);
                if (aVar.f3473b == i10) {
                    return aVar;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final boolean k(float f) {
        boolean z10;
        boolean z11;
        float f10 = this.I - f;
        this.I = f;
        float scrollX = getScrollX() + f10;
        float clientViewWidth = getClientViewWidth();
        float f11 = this.D * clientViewWidth;
        float f12 = this.E * clientViewWidth;
        ArrayList<cb.a> arrayList = this.y;
        boolean z12 = false;
        cb.a aVar = arrayList.get(0);
        cb.a aVar2 = arrayList.get(arrayList.size() - 1);
        if (aVar.f3473b != 0) {
            f11 = aVar.f3476e * clientViewWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (aVar2.f3473b != this.C.a() - 1) {
            f12 = aVar2.f3476e * clientViewWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f23565h0.onPull(Math.abs(f11 - scrollX) / clientViewWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f23566i0.onPull(Math.abs(scrollX - f12) / clientViewWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.I = (scrollX - i10) + this.I;
        scrollTo(i10, getScrollY());
        q(i10);
        return z12;
    }

    public final void l() {
        boolean z10;
        int a10 = this.C.a();
        this.f23570t = a10;
        ArrayList<cb.a> arrayList = this.y;
        if (arrayList.size() < (this.M * 2) + 1 && arrayList.size() < a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f23571u;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            cb.a aVar = arrayList.get(i11);
            e eVar = this.C;
            Object obj = aVar.f3472a;
            eVar.getClass();
        }
        Collections.sort(arrayList, f23558l0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                g gVar = (g) getChildAt(i12).getLayoutParams();
                gVar.getClass();
                gVar.f3482a = gl.Code;
            }
            f(i10, false, true, 0);
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 > 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r7.H = false;
        f(r0 - 1, true, false, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0087, code lost:
    
        if (r0 <= 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L9
            goto L2f
        L9:
            if (r0 == 0) goto L30
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r7) goto L17
            r3 = r1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L30
            android.view.ViewParent r0 = r0.getParent()
        L23:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L2f
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L23
        L2f:
            r0 = 0
        L30:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r7, r0, r8)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L76
            if (r3 == r0) goto L76
            android.graphics.Rect r6 = r7.A
            if (r8 != r5) goto L59
            android.graphics.Rect r4 = r7.a(r3, r6)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.a(r0, r6)
            int r5 = r5.left
            if (r0 == 0) goto L70
            if (r4 < r5) goto L70
            int r0 = r7.f23571u
            if (r0 <= 0) goto L90
            goto L89
        L59:
            if (r8 != r4) goto L92
            android.graphics.Rect r1 = r7.a(r3, r6)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.a(r0, r6)
            int r2 = r2.left
            if (r0 == 0) goto L70
            if (r1 > r2) goto L70
            boolean r0 = r7.p()
            goto L74
        L70:
            boolean r0 = r3.requestFocus()
        L74:
            r2 = r0
            goto L92
        L76:
            if (r8 == r5) goto L85
            if (r8 != r1) goto L7b
            goto L85
        L7b:
            if (r8 == r4) goto L80
            r0 = 2
            if (r8 != r0) goto L92
        L80:
            boolean r2 = r7.p()
            goto L92
        L85:
            int r0 = r7.f23571u
            if (r0 <= 0) goto L90
        L89:
            int r0 = r0 - r1
            r7.H = r2
            r7.f(r0, r1, r2, r2)
            goto L91
        L90:
            r1 = r2
        L91:
            r2 = r1
        L92:
            if (r2 == 0) goto L9b
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView.m(int):boolean");
    }

    public final void n() {
        i(this.f23571u);
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.I = motionEvent.getX(i10);
            this.R = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f23567j0);
        Scroller scroller = this.f23574x;
        if (scroller != null && !scroller.isFinished()) {
            this.f23574x.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z10;
        int action = motionEvent.getAction() & p.f9095b;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.N) {
                    return true;
                }
                if (this.f23561d0) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i10 = this.R;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f10 = x10 - this.I;
                        float abs = Math.abs(f10);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.L);
                        if (f10 != gl.Code) {
                            float f11 = this.I;
                            if ((f11 < this.P && f10 > gl.Code) || (f11 > getWidth() - this.P && f10 < gl.Code)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && h((int) f10, (int) x10, (int) y, this, false)) {
                                this.I = x10;
                                this.J = y;
                                this.f23561d0 = true;
                                return false;
                            }
                        }
                        float f12 = this.Q;
                        if (abs > f12 && abs * 0.5f > abs2) {
                            this.N = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f13 = this.K;
                            float f14 = this.Q;
                            if (f10 > gl.Code) {
                                f = f13 + f14;
                            } else {
                                f = f13 - f14;
                            }
                            this.I = f;
                            this.J = y;
                            setScrollingCacheEnabledStatus(true);
                        } else if (abs2 > f12) {
                            this.f23561d0 = true;
                        }
                        if (this.N && k(x10)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.K = x11;
                this.I = x11;
                float y10 = motionEvent.getY();
                this.L = y10;
                this.J = y10;
                this.R = motionEvent.getPointerId(0);
                this.f23561d0 = false;
                this.f23573w = true;
                this.f23574x.computeScrollOffset();
                if (this.f23568k0 == 2 && Math.abs(this.f23574x.getFinalX() - this.f23574x.getCurrX()) > this.f23564g0) {
                    this.f23574x.abortAnimation();
                    this.H = false;
                    n();
                    this.N = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    g(false);
                    this.N = false;
                }
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            return this.N;
        }
        s();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        getScrollX();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ((g) childAt.getLayoutParams()).getClass();
            }
        }
        int i17 = (i14 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                g gVar = (g) childAt2.getLayoutParams();
                gVar.getClass();
                cb.a c10 = c(childAt2);
                if (c10 != null) {
                    float f = i17;
                    int i19 = ((int) (c10.f3476e * f)) + paddingLeft;
                    if (gVar.f3483b) {
                        gVar.f3483b = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * gVar.f3482a), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        if (this.W) {
            e(this.f23571u, false, 0, false);
        }
        this.W = false;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int makeMeasureSpec;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.P = Math.min(measuredWidth / 10, this.f23562e0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
            }
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f23569s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.G = true;
        n();
        this.G = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                g gVar = (g) childAt2.getLayoutParams();
                if (gVar == null) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f3482a), 1073741824);
                }
                childAt2.measure(makeMeasureSpec, this.f23569s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        cb.a c10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (c10 = c(childAt)) != null && c10.f3473b == this.f23571u && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedStatePPS)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedStatePPS savedStatePPS = (SavedStatePPS) parcelable;
        super.onRestoreInstanceState(savedStatePPS.f23557s);
        if (this.C != null) {
            f(savedStatePPS.f23577u, false, true, 0);
        } else {
            this.f23572v = savedStatePPS.f23577u;
            this.B = savedStatePPS.f23578v;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedStatePPS savedStatePPS = new SavedStatePPS(super.onSaveInstanceState());
        savedStatePPS.f23577u = this.f23571u;
        e eVar = this.C;
        if (eVar != null) {
            eVar.getClass();
            savedStatePPS.f23578v = null;
        }
        return savedStatePPS;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f;
        int paddingLeft;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            if (i12 > 0 && !this.y.isEmpty()) {
                if (!this.f23574x.isFinished()) {
                    this.f23574x.setFinalX(getCurrentItem() * getClientViewWidth());
                    return;
                } else {
                    paddingLeft = (int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + 0)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + 0));
                }
            } else {
                cb.a j10 = j(this.f23571u);
                if (j10 != null) {
                    f = Math.min(j10.f3476e, this.E);
                } else {
                    f = gl.Code;
                }
                paddingLeft = (int) (f * ((i10 - getPaddingLeft()) - getPaddingRight()));
                if (paddingLeft != getScrollX()) {
                    g(false);
                } else {
                    return;
                }
            }
            scrollTo(paddingLeft, getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar;
        float f;
        boolean s10;
        float f10;
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (eVar = this.C) == null || eVar.a() == 0) {
            return false;
        }
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        int action = motionEvent.getAction() & p.f9095b;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                o(motionEvent);
                                this.I = motionEvent.getX(motionEvent.findPointerIndex(this.R));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.I = motionEvent.getX(actionIndex);
                            this.R = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.N) {
                        e(this.f23571u, true, 0, false);
                        s10 = s();
                        z10 = s10;
                    }
                } else {
                    if (!this.N) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.R);
                        if (findPointerIndex == -1) {
                            s10 = s();
                            z10 = s10;
                        } else {
                            float x10 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x10 - this.I);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.J);
                            if (abs > this.Q && abs > abs2) {
                                this.N = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f11 = this.K;
                                if (x10 - f11 > gl.Code) {
                                    f10 = f11 + this.Q;
                                } else {
                                    f10 = f11 - this.Q;
                                }
                                this.I = f10;
                                this.J = y;
                                setScrollState(1);
                                setScrollingCacheEnabledStatus(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.N) {
                        z10 = false | k(motionEvent.getX(motionEvent.findPointerIndex(this.R)));
                    }
                }
            } else if (this.N) {
                VelocityTracker velocityTracker = this.S;
                velocityTracker.computeCurrentVelocity(1000, this.U);
                int xVelocity = (int) velocityTracker.getXVelocity(this.R);
                this.H = true;
                int clientViewWidth = getClientViewWidth();
                int scrollX = getScrollX();
                cb.a t10 = t();
                if (t10 == null) {
                    s10 = s();
                    z10 = s10;
                } else {
                    float f12 = clientViewWidth;
                    int i10 = t10.f3473b;
                    float f13 = ((scrollX / f12) - t10.f3476e) / (t10.f3475d + (0 / f12));
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.R)) - this.K)) > this.V && Math.abs(xVelocity) > this.T) {
                        if (xVelocity <= 0) {
                            i10++;
                        }
                    } else {
                        if (i10 >= this.f23571u) {
                            f = 0.4f;
                        } else {
                            f = 0.6f;
                        }
                        i10 += (int) (f13 + f);
                    }
                    ArrayList<cb.a> arrayList = this.y;
                    if (arrayList.size() > 0) {
                        i10 = Math.max(arrayList.get(0).f3473b, Math.min(i10, arrayList.get(arrayList.size() - 1).f3473b));
                    }
                    f(i10, true, true, xVelocity);
                    z10 = s();
                }
            }
        } else {
            this.f23574x.abortAnimation();
            this.H = false;
            n();
            float x11 = motionEvent.getX();
            this.K = x11;
            this.I = x11;
            float y10 = motionEvent.getY();
            this.L = y10;
            this.J = y10;
            this.R = motionEvent.getPointerId(0);
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p() {
        e eVar = this.C;
        if (eVar == null || this.f23571u >= eVar.a() - 1) {
            return false;
        }
        int i10 = this.f23571u + 1;
        this.H = false;
        f(i10, true, false, 0);
        return true;
    }

    public final boolean q(int i10) {
        if (this.y.size() == 0) {
            if (this.W) {
                return false;
            }
            this.f23560c0 = false;
            d(gl.Code, 0, 0);
            if (this.f23560c0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        cb.a t10 = t();
        if (t10 == null) {
            return false;
        }
        int clientViewWidth = getClientViewWidth();
        int i11 = clientViewWidth + 0;
        float f = clientViewWidth;
        int i12 = t10.f3473b;
        float f10 = ((i10 / f) - t10.f3476e) / (t10.f3475d + (0 / f));
        this.f23560c0 = false;
        d(f10, i12, (int) (i11 * f10));
        if (this.f23560c0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final void r(int i10) {
        ArrayList arrayList = this.f23563f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = (d) this.f23563f0.get(i11);
                if (dVar != null) {
                    dVar.c();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.G) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.R = -1;
        this.N = false;
        this.f23561d0 = false;
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S = null;
        }
        this.f23565h0.onRelease();
        this.f23566i0.onRelease();
        if (!this.f23565h0.isFinished() && !this.f23566i0.isFinished()) {
            return false;
        }
        return true;
    }

    public void setAdapter(e eVar) {
        ArrayList<cb.a> arrayList;
        e eVar2 = this.C;
        if (eVar2 != null) {
            synchronized (eVar2) {
            }
            this.C.getClass();
            int i10 = 0;
            while (true) {
                arrayList = this.y;
                if (i10 >= arrayList.size()) {
                    break;
                }
                cb.a aVar = arrayList.get(i10);
                e eVar3 = this.C;
                int i11 = aVar.f3473b;
                List<View> list = ((l) eVar3).f34751a;
                if (list != null) {
                    removeView(list.get(i11));
                }
                i10++;
            }
            this.C.getClass();
            arrayList.clear();
            while (getChildCount() > 0) {
                ((g) getChildAt(0).getLayoutParams()).getClass();
                removeViewAt(0);
            }
            this.f23571u = 0;
            scrollTo(0, 0);
        }
        this.C = eVar;
        this.f23570t = 0;
        if (eVar != null) {
            if (this.F == null) {
                this.F = new f(this);
            }
            synchronized (this.C) {
            }
            this.H = false;
            boolean z10 = this.W;
            this.W = true;
            this.f23570t = this.C.a();
            if (this.f23572v >= 0) {
                this.C.getClass();
                f(this.f23572v, false, true, 0);
                this.f23572v = -1;
                this.B = null;
                return;
            }
            if (!z10) {
                n();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.H = false;
        f(i10, !this.W, false, 0);
    }

    public void setScrollState(int i10) {
        if (this.f23568k0 == i10) {
            return;
        }
        this.f23568k0 = i10;
        ArrayList arrayList = this.f23563f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = (d) this.f23563f0.get(i11);
                if (dVar != null) {
                    dVar.b(i10);
                }
            }
        }
    }

    public final cb.a t() {
        float f;
        float f10;
        cb.a aVar;
        int i10;
        int clientViewWidth = getClientViewWidth();
        float f11 = gl.Code;
        if (clientViewWidth > 0) {
            f = getScrollX() / clientViewWidth;
        } else {
            f = 0.0f;
        }
        if (clientViewWidth > 0) {
            f10 = 0 / clientViewWidth;
        } else {
            f10 = 0.0f;
        }
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        cb.a aVar2 = null;
        float f12 = 0.0f;
        while (true) {
            ArrayList<cb.a> arrayList = this.y;
            if (i12 < arrayList.size()) {
                cb.a aVar3 = arrayList.get(i12);
                if (!z10 && aVar3.f3473b != (i10 = i11 + 1)) {
                    float f13 = f11 + f12 + f10;
                    aVar = this.f23575z;
                    aVar.f3476e = f13;
                    aVar.f3473b = i10;
                    this.C.getClass();
                    aVar.f3475d = 1.0f;
                    i12--;
                } else {
                    aVar = aVar3;
                }
                f11 = aVar.f3476e;
                float f14 = aVar.f3475d + f11 + f10;
                if (!z10 && f < f11) {
                    return aVar2;
                }
                if (f < f14 || i12 == arrayList.size() - 1) {
                    break;
                }
                i11 = aVar.f3473b;
                i12++;
                z10 = false;
                aVar2 = aVar;
                f12 = aVar.f3475d;
            } else {
                return aVar2;
            }
        }
        return aVar;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }
}
