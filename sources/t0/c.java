package t0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final a f35344v = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f35345a;

    /* renamed from: b, reason: collision with root package name */
    public int f35346b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f35348d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f35349e;
    public float[] f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f35350g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f35351h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f35352i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f35353j;

    /* renamed from: k, reason: collision with root package name */
    public int f35354k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f35355l;

    /* renamed from: m, reason: collision with root package name */
    public final float f35356m;

    /* renamed from: n, reason: collision with root package name */
    public final float f35357n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f35358p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0485c f35359q;

    /* renamed from: r, reason: collision with root package name */
    public View f35360r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35361s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f35362t;

    /* renamed from: c, reason: collision with root package name */
    public int f35347c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final b f35363u = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f10 = f - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0485c abstractC0485c) {
        if (viewGroup != null) {
            if (abstractC0485c != null) {
                this.f35362t = viewGroup;
                this.f35359q = abstractC0485c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f35346b = viewConfiguration.getScaledTouchSlop();
                this.f35356m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f35357n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f35358p = new OverScroller(context, f35344v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f35347c = -1;
        float[] fArr = this.f35348d;
        if (fArr != null) {
            Arrays.fill(fArr, gl.Code);
            Arrays.fill(this.f35349e, gl.Code);
            Arrays.fill(this.f, gl.Code);
            Arrays.fill(this.f35350g, gl.Code);
            Arrays.fill(this.f35351h, 0);
            Arrays.fill(this.f35352i, 0);
            Arrays.fill(this.f35353j, 0);
            this.f35354k = 0;
        }
        VelocityTracker velocityTracker = this.f35355l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f35355l = null;
        }
    }

    public final void b(int i10, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f35362t;
        if (parent == viewGroup) {
            this.f35360r = view;
            this.f35347c = i10;
            this.f35359q.e(i10, view);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f, float f10, int i10, int i11) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f10);
        if ((this.f35351h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f35353j[i10] & i11) == i11 || (this.f35352i[i10] & i11) == i11) {
            return false;
        }
        float f11 = this.f35346b;
        if (abs <= f11 && abs2 <= f11) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f35359q.getClass();
        }
        if ((this.f35352i[i10] & i11) != 0 || abs <= this.f35346b) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f, float f10) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        AbstractC0485c abstractC0485c = this.f35359q;
        if (abstractC0485c.c(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (abstractC0485c.d() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f11 = (f10 * f10) + (f * f);
            int i10 = this.f35346b;
            if (f11 <= i10 * i10) {
                return false;
            }
            return true;
        }
        if (z10) {
            if (Math.abs(f) <= this.f35346b) {
                return false;
            }
            return true;
        }
        if (!z11 || Math.abs(f10) <= this.f35346b) {
            return false;
        }
        return true;
    }

    public final void e(int i10) {
        float[] fArr = this.f35348d;
        if (fArr != null) {
            int i11 = this.f35354k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i10] = 0.0f;
                this.f35349e[i10] = 0.0f;
                this.f[i10] = 0.0f;
                this.f35350g[i10] = 0.0f;
                this.f35351h[i10] = 0;
                this.f35352i[i10] = 0;
                this.f35353j[i10] = 0;
                this.f35354k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width = this.f35362t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.f35345a == 2) {
            OverScroller overScroller = this.f35358p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f35360r.getLeft();
            int top = currY - this.f35360r.getTop();
            if (left != 0) {
                View view = this.f35360r;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f35360r;
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f35359q.g(this.f35360r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f35362t.post(this.f35363u);
            }
        }
        if (this.f35345a != 2) {
            return false;
        }
        return true;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f35362t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f35359q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f35360r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f35360r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f35358p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f35360r
            float r0 = r10.f35357n
            int r0 = (int) r0
            float r6 = r10.f35356m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            t0.c$c r6 = r10.f35359q
            int r12 = r6.c(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.i(int, int, int, int):boolean");
    }

    public final boolean j(int i10) {
        boolean z10;
        if ((this.f35354k & (1 << i10)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f35355l == null) {
            this.f35355l = VelocityTracker.obtain();
        }
        this.f35355l.addMovement(motionEvent);
        AbstractC0485c abstractC0485c = this.f35359q;
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f35345a == 1 && pointerId == this.f35347c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f35347c) {
                                                View h10 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f35360r;
                                                if (h10 == view && t(pointerId2, view)) {
                                                    i10 = this.f35347c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        n(pointerId3, x10, y);
                        if (this.f35345a == 0) {
                            t(pointerId3, h((int) x10, (int) y));
                            if ((this.f35351h[pointerId3] & 0) != 0) {
                                abstractC0485c.getClass();
                                return;
                            }
                            return;
                        }
                        int i12 = (int) x10;
                        int i13 = (int) y;
                        View view2 = this.f35360r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            t(pointerId3, this.f35360r);
                            return;
                        }
                        return;
                    }
                    if (this.f35345a == 1) {
                        this.f35361s = true;
                        abstractC0485c.h(this.f35360r, gl.Code, gl.Code);
                        this.f35361s = false;
                        if (this.f35345a == 1) {
                            p(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f35345a == 1) {
                    if (j(this.f35347c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f35347c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i14 = this.f35347c;
                        int i15 = (int) (x11 - fArr[i14]);
                        int i16 = (int) (y10 - this.f35350g[i14]);
                        int left = this.f35360r.getLeft() + i15;
                        int top = this.f35360r.getTop() + i16;
                        int left2 = this.f35360r.getLeft();
                        int top2 = this.f35360r.getTop();
                        if (i15 != 0) {
                            left = abstractC0485c.a(left, this.f35360r);
                            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                            this.f35360r.offsetLeftAndRight(left - left2);
                        }
                        if (i16 != 0) {
                            top = abstractC0485c.b(top, this.f35360r);
                            WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                            this.f35360r.offsetTopAndBottom(top - top2);
                        }
                        if (i15 != 0 || i16 != 0) {
                            abstractC0485c.g(this.f35360r, left, top);
                        }
                        o(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i11 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (j(pointerId4)) {
                        float x12 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f = x12 - this.f35348d[pointerId4];
                        float f10 = y11 - this.f35349e[pointerId4];
                        m(pointerId4, f, f10);
                        if (this.f35345a != 1) {
                            View h11 = h((int) x12, (int) y11);
                            if (d(h11, f, f10) && t(pointerId4, h11)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                o(motionEvent);
                return;
            }
            if (this.f35345a == 1) {
                l();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x13, (int) y12);
        n(pointerId5, x13, y12);
        t(pointerId5, h12);
        if ((this.f35351h[pointerId5] & 0) != 0) {
            abstractC0485c.getClass();
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f35355l;
        float f = this.f35356m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f35355l.getXVelocity(this.f35347c);
        float abs = Math.abs(xVelocity);
        float f10 = this.f35357n;
        float f11 = gl.Code;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > gl.Code) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.f35355l.getYVelocity(this.f35347c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f10) {
            if (abs2 > f) {
                if (yVelocity <= gl.Code) {
                    f = -f;
                }
                f11 = f;
            } else {
                f11 = yVelocity;
            }
        }
        this.f35361s = true;
        this.f35359q.h(this.f35360r, xVelocity, f11);
        this.f35361s = false;
        if (this.f35345a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void m(int i10, float f, float f10) {
        boolean c10 = c(f, f10, i10, 1);
        boolean z10 = c10;
        if (c(f10, f, i10, 4)) {
            z10 = (c10 ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f, f10, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f10, f, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f35352i;
            iArr[i10] = iArr[i10] | r02;
            this.f35359q.getClass();
        }
    }

    public final void n(int i10, float f, float f10) {
        float[] fArr = this.f35348d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f35349e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f35350g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f35351h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f35352i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f35353j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f35348d = fArr2;
            this.f35349e = fArr3;
            this.f = fArr4;
            this.f35350g = fArr5;
            this.f35351h = iArr;
            this.f35352i = iArr2;
            this.f35353j = iArr3;
        }
        float[] fArr9 = this.f35348d;
        this.f[i10] = f;
        fArr9[i10] = f;
        float[] fArr10 = this.f35349e;
        this.f35350g[i10] = f10;
        fArr10[i10] = f10;
        int[] iArr7 = this.f35351h;
        int i13 = (int) f;
        int i14 = (int) f10;
        ViewGroup viewGroup = this.f35362t;
        if (i13 < viewGroup.getLeft() + this.o) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + this.o) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - this.o) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - this.o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f35354k = (1 << i10) | this.f35354k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y = motionEvent.getY(i10);
                this.f[pointerId] = x10;
                this.f35350g[pointerId] = y;
            }
        }
    }

    public final void p(int i10) {
        this.f35362t.removeCallbacks(this.f35363u);
        if (this.f35345a != i10) {
            this.f35345a = i10;
            this.f35359q.f(i10);
            if (this.f35345a == 0) {
                this.f35360r = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f35361s) {
            return i(i10, i11, (int) this.f35355l.getXVelocity(this.f35347c), (int) this.f35355l.getYVelocity(this.f35347c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(int i10, int i11, View view) {
        this.f35360r = view;
        this.f35347c = -1;
        boolean i12 = i(i10, i11, 0, 0);
        if (!i12 && this.f35345a == 0 && this.f35360r != null) {
            this.f35360r = null;
        }
        return i12;
    }

    public final boolean t(int i10, View view) {
        if (view == this.f35360r && this.f35347c == i10) {
            return true;
        }
        if (view != null && this.f35359q.i(i10, view)) {
            this.f35347c = i10;
            b(i10, view);
            return true;
        }
        return false;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: t0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0485c {
        public abstract int a(int i10, View view);

        public abstract int b(int i10, View view);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract void h(View view, float f, float f10);

        public abstract boolean i(int i10, View view);

        public void f(int i10) {
        }

        public void e(int i10, View view) {
        }

        public void g(View view, int i10, int i11) {
        }
    }
}
