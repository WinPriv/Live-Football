package i6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
public abstract class d<V extends View> extends f<V> {

    /* renamed from: c, reason: collision with root package name */
    public a f29177c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f29178d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29179e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f29180g;

    /* renamed from: h, reason: collision with root package name */
    public int f29181h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f29182i;

    /* compiled from: HeaderBehavior.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final CoordinatorLayout f29183s;

        /* renamed from: t, reason: collision with root package name */
        public final V f29184t;

        public a(CoordinatorLayout coordinatorLayout, V v3) {
            this.f29183s = coordinatorLayout;
            this.f29184t = v3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            OverScroller overScroller;
            V v3 = this.f29184t;
            if (v3 != null && (overScroller = (dVar = d.this).f29178d) != null) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = this.f29183s;
                if (computeScrollOffset) {
                    dVar.A(coordinatorLayout, v3, dVar.f29178d.getCurrY());
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.d.m(v3, this);
                    return;
                }
                dVar.y(v3, coordinatorLayout);
            }
        }
    }

    public d() {
        this.f = -1;
        this.f29181h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f29181h < 0) {
            this.f29181h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f29179e) {
            int i10 = this.f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f29180g) > this.f29181h) {
                this.f29180g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (u(v3) && coordinatorLayout.q(x10, y10, v3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29179e = z10;
            if (z10) {
                this.f29180g = y10;
                this.f = motionEvent.getPointerId(0);
                if (this.f29182i == null) {
                    this.f29182i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f29178d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f29178d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f29182i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.d.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean u(V v3) {
        return false;
    }

    public int v(V v3) {
        return -v3.getHeight();
    }

    public int w(V v3) {
        return v3.getHeight();
    }

    public int x() {
        return s();
    }

    public int z(CoordinatorLayout coordinatorLayout, V v3, int i10, int i11, int i12) {
        int B0;
        int s10 = s();
        if (i11 != 0 && s10 >= i11 && s10 <= i12 && s10 != (B0 = a0.a.B0(i10, i11, i12))) {
            g gVar = this.f29189a;
            if (gVar != null) {
                gVar.b(B0);
            } else {
                this.f29190b = B0;
            }
            return s10 - B0;
        }
        return 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.f29181h = -1;
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }
}
