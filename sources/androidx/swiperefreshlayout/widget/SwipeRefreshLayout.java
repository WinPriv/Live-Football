package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.huawei.hms.ads.gl;
import d0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.n;
import r0.g;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements n {

    /* renamed from: s, reason: collision with root package name */
    public View f2418s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2419t;

    /* renamed from: u, reason: collision with root package name */
    public float f2420u;

    /* renamed from: v, reason: collision with root package name */
    public float f2421v;

    /* renamed from: w, reason: collision with root package name */
    public float f2422w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2423x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f2424z;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    private void setColorViewAlpha(int i10) {
        throw null;
    }

    public final void a() {
        if (this.f2418s == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(null)) {
                    this.f2418s = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f10, boolean z10) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f10) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (i11 == i10 - 1) {
            return 0;
        }
        if (i11 >= 0) {
            return i11 + 1;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public int getProgressCircleDiameter() {
        return this.f2424z;
    }

    public int getProgressViewEndOffset() {
        return 0;
    }

    public int getProgressViewStartOffset() {
        return 0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean canScrollVertically;
        a();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (isEnabled()) {
            View view = this.f2418s;
            if (view instanceof ListView) {
                canScrollVertically = g.a((ListView) view, -1);
            } else {
                canScrollVertically = view.canScrollVertically(-1);
            }
            if (!canScrollVertically && !this.f2419t) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.y) {
                                        if (actionIndex == 0) {
                                            i10 = 1;
                                        }
                                        this.y = motionEvent.getPointerId(i10);
                                    }
                                }
                            }
                        } else {
                            int i11 = this.y;
                            if (i11 == -1) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                                return false;
                            }
                            int findPointerIndex = motionEvent.findPointerIndex(i11);
                            if (findPointerIndex < 0) {
                                return false;
                            }
                            float f = 0;
                            if (motionEvent.getY(findPointerIndex) - gl.Code > f && !this.f2423x) {
                                this.f2422w = f + gl.Code;
                                this.f2423x = true;
                                throw null;
                            }
                        }
                        return this.f2423x;
                    }
                    this.f2423x = false;
                    this.y = -1;
                    return this.f2423x;
                }
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f2418s == null) {
            a();
        }
        View view = this.f2418s;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2418s == null) {
            a();
        }
        View view = this.f2418s;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        View.MeasureSpec.makeMeasureSpec(this.f2424z, 1073741824);
        View.MeasureSpec.makeMeasureSpec(this.f2424z, 1073741824);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f10, boolean z10) {
        return dispatchNestedFling(f, f10, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f10) {
        return dispatchNestedPreFling(f, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f = this.f2421v;
            if (f > gl.Code) {
                float f10 = i11;
                if (f10 > f) {
                    iArr[1] = i11 - ((int) f);
                    this.f2421v = gl.Code;
                    throw null;
                }
                this.f2421v = f - f10;
                iArr[1] = i11;
                throw null;
            }
        }
        if (!dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], null, null)) {
            return;
        }
        int i12 = iArr[0];
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, null);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (isEnabled() && !this.f2419t && (i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean canScrollVertically;
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (isEnabled()) {
            View view = this.f2418s;
            if (view instanceof ListView) {
                canScrollVertically = g.a((ListView) view, -1);
            } else {
                canScrollVertically = view.canScrollVertically(-1);
            }
            if (!canScrollVertically && !this.f2419t) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                return false;
                            }
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.y) {
                                        if (actionIndex == 0) {
                                            i10 = 1;
                                        }
                                        this.y = motionEvent.getPointerId(i10);
                                    }
                                }
                            } else {
                                int actionIndex2 = motionEvent.getActionIndex();
                                if (actionIndex2 < 0) {
                                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.y = motionEvent.getPointerId(actionIndex2);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.y);
                            if (findPointerIndex < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                                return false;
                            }
                            float y = motionEvent.getY(findPointerIndex);
                            float f = 0;
                            if (y - gl.Code > f && !this.f2423x) {
                                this.f2422w = f + gl.Code;
                                this.f2423x = true;
                                throw null;
                            }
                            if (this.f2423x) {
                                if ((y - this.f2422w) * 0.5f <= gl.Code) {
                                    return false;
                                }
                                throw null;
                            }
                        }
                    } else {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.y);
                        if (findPointerIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                            return false;
                        }
                        if (this.f2423x) {
                            float y10 = (motionEvent.getY(findPointerIndex2) - this.f2422w) * 0.5f;
                            this.f2423x = false;
                            if (y10 > this.f2420u) {
                                if (!this.f2419t) {
                                    a();
                                    this.f2419t = true;
                                    throw null;
                                }
                            } else {
                                this.f2419t = false;
                                throw null;
                            }
                        }
                        this.y = -1;
                        return false;
                    }
                } else {
                    this.y = motionEvent.getPointerId(0);
                    this.f2423x = false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f2418s;
        if (view != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (!c0.i.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f) {
        throw null;
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        a();
        throw null;
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            Object obj = d0.a.f27248a;
            iArr2[i10] = a.d.a(context, i11);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f2420u = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
        } else {
            throw null;
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        throw null;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        throw null;
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setProgressBackgroundColorSchemeColor(a.d.a(context, i10));
    }

    public void setRefreshing(boolean z10) {
        if (z10 && this.f2419t != z10) {
            this.f2419t = z10;
            setTargetOffsetTopAndBottom(0);
            throw null;
        }
        if (this.f2419t != z10) {
            a();
            this.f2419t = z10;
            if (z10) {
                throw null;
            }
            new androidx.swiperefreshlayout.widget.a(this).setDuration(150L);
            throw null;
        }
    }

    public void setSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i10 == 0) {
            this.f2424z = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f2424z = (int) (displayMetrics.density * 40.0f);
        }
        throw null;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        throw null;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        throw null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        throw null;
    }

    public void setOnChildScrollUpCallback(a aVar) {
    }

    public void setOnRefreshListener(b bVar) {
    }

    public void setSlingshotDistance(int i10) {
    }
}
