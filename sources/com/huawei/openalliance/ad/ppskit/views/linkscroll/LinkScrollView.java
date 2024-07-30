package com.huawei.openalliance.ad.ppskit.views.linkscroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.Scroller;
import bb.b;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;
import ka.n7;

/* loaded from: classes2.dex */
public class LinkScrollView extends LinearLayout implements b {
    public static final /* synthetic */ int B = 0;
    public final a A;

    /* renamed from: s, reason: collision with root package name */
    public View f23486s;

    /* renamed from: t, reason: collision with root package name */
    public View f23487t;

    /* renamed from: u, reason: collision with root package name */
    public int f23488u;

    /* renamed from: v, reason: collision with root package name */
    public final OverScroller f23489v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23490w;

    /* renamed from: x, reason: collision with root package name */
    public final Scroller f23491x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public int f23492z;

    /* loaded from: classes2.dex */
    public class a implements LinkScrollWebView.a {
        public a() {
        }
    }

    public LinkScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23492z = 0;
        this.A = new a();
        setOrientation(1);
        this.f23489v = new OverScroller(context);
        this.f23491x = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23490w = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // bb.b
    public final void a() {
    }

    public final void b(float f) {
        if (Math.abs(f) > this.f23490w) {
            this.f23492z = f > gl.Code ? 1 : -1;
            this.f23489v.fling(0, getScrollY(), 1, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f23489v;
        if (overScroller.computeScrollOffset()) {
            int currY = overScroller.getCurrY();
            if (currY < 0) {
                currY = 0;
            }
            int i10 = this.f23488u;
            if (currY > i10) {
                currY = i10;
            }
            scrollTo(0, currY);
            int scrollY = getScrollY();
            if (f() && scrollY == this.f23488u) {
                int currVelocity = (int) overScroller.getCurrVelocity();
                n7.e("LinkScrollView", "webView fling");
                overScroller.abortAnimation();
                View view = this.y;
                if (view instanceof LinkScrollWebView) {
                    ((LinkScrollWebView) view).c(currVelocity);
                }
                this.f23491x.fling(0, 0, 0, currVelocity, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                invalidate();
            }
            invalidate();
        }
    }

    @Override // bb.b
    public final void e(View view, int i10, int[] iArr) {
        boolean z10;
        boolean z11;
        if (f()) {
            int measuredHeight = this.f23486s.getMeasuredHeight();
            this.f23488u = measuredHeight;
            if (measuredHeight > 0 && i10 > 0 && getScrollY() < this.f23488u) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i10 < 0 && getScrollY() >= 0) {
                    z11 = !view.canScrollVertically(-1);
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return;
                }
            }
            if (i10 < 0) {
                int scrollY = getScrollY();
                if (i10 + scrollY < 0) {
                    i10 = -scrollY;
                }
            }
            scrollBy(0, i10);
            iArr[1] = i10;
        }
    }

    public final boolean f() {
        int measuredHeight = this.f23486s.getMeasuredHeight();
        this.f23488u = measuredHeight;
        if (measuredHeight > 0) {
            return true;
        }
        return false;
    }

    public int getLinkScrollAxes() {
        return 0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f23486s = findViewById(R.id.linked_native_view);
        this.f23487t = findViewById(R.id.linked_pps_web_view);
        this.f23486s.setOverScrollMode(2);
        this.f23487t.setOverScrollMode(2);
        setOverScrollMode(2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f23486s.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f23487t.getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f23488u = this.f23486s.getMeasuredHeight();
    }

    public void setWebView(View view) {
        this.y = view;
        if (view instanceof LinkScrollWebView) {
            ((LinkScrollWebView) view).setScrollListener(this.A);
        }
    }

    @Override // bb.b
    public final boolean a(float f) {
        int scrollY = getScrollY();
        this.f23492z = f > gl.Code ? 1 : -1;
        if (scrollY == this.f23488u) {
            this.f23491x.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
            return false;
        }
        b(f);
        return true;
    }

    @Override // bb.b
    public final void b() {
        this.f23492z = 0;
        this.f23491x.abortAnimation();
        this.f23489v.abortAnimation();
    }

    @Override // bb.b
    public final void c() {
    }

    @Override // bb.b
    public final void d() {
    }
}
