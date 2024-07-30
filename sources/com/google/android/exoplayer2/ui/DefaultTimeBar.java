package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.n;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.i;
import d6.g0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class DefaultTimeBar extends View implements i {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f20245k0 = 0;
    public final Paint A;
    public final Paint B;
    public final Drawable C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final StringBuilder M;
    public final Formatter N;
    public final androidx.activity.g O;
    public final CopyOnWriteArraySet<i.a> P;
    public final Point Q;
    public final float R;
    public int S;
    public long T;
    public int U;
    public Rect V;
    public float W;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f20246c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f20247d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f20248e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f20249f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f20250g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f20251h0;

    /* renamed from: i0, reason: collision with root package name */
    public long[] f20252i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean[] f20253j0;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f20254s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f20255t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f20256u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f20257v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f20258w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f20259x;
    public final Paint y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f20260z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet);
    }

    public static int c(float f, int i10) {
        return (int) ((i10 * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.T;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.f20248e0;
            if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                return 0L;
            }
            return j11 / this.S;
        }
        return j10;
    }

    private String getProgressText() {
        return g0.z(this.M, this.N, this.f20249f0);
    }

    private long getScrubberPosition() {
        if (this.f20255t.width() > 0 && this.f20248e0 != com.anythink.expressad.exoplayer.b.f7291b) {
            return (this.f20257v.width() * this.f20248e0) / r0.width();
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.ui.i
    public final void a(long[] jArr, boolean[] zArr, int i10) {
        boolean z10;
        if (i10 != 0 && (jArr == null || zArr == null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        d6.a.a(z10);
        this.f20251h0 = i10;
        this.f20252i0 = jArr;
        this.f20253j0 = zArr;
        g();
    }

    @Override // com.google.android.exoplayer2.ui.i
    public final void b(PlayerControlView.b bVar) {
        this.P.add(bVar);
    }

    public final boolean d(long j10) {
        long j11;
        long j12 = this.f20248e0;
        if (j12 <= 0) {
            return false;
        }
        if (this.f20246c0) {
            j11 = this.f20247d0;
        } else {
            j11 = this.f20249f0;
        }
        long j13 = j11;
        long i10 = g0.i(j13 + j10, 0L, j12);
        if (i10 == j13) {
            return false;
        }
        if (!this.f20246c0) {
            e(i10);
        } else {
            h(i10);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j10) {
        this.f20247d0 = j10;
        this.f20246c0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<i.a> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().A(j10);
        }
    }

    public final void f(boolean z10) {
        removeCallbacks(this.O);
        this.f20246c0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<i.a> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().B(this.f20247d0, z10);
        }
    }

    public final void g() {
        long j10;
        Rect rect = this.f20256u;
        Rect rect2 = this.f20255t;
        rect.set(rect2);
        Rect rect3 = this.f20257v;
        rect3.set(rect2);
        if (this.f20246c0) {
            j10 = this.f20247d0;
        } else {
            j10 = this.f20249f0;
        }
        if (this.f20248e0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f20250g0) / this.f20248e0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j10) / this.f20248e0)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f20254s);
    }

    @Override // com.google.android.exoplayer2.ui.i
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f20255t.width() / this.R);
        if (width != 0) {
            long j10 = this.f20248e0;
            if (j10 != 0 && j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                return j10 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h(long j10) {
        if (this.f20247d0 == j10) {
            return;
        }
        this.f20247d0 = j10;
        Iterator<i.a> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().z(j10);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10;
        canvas.save();
        Rect rect = this.f20255t;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i11 = height + centerY;
        long j10 = this.f20248e0;
        Paint paint2 = this.y;
        Rect rect2 = this.f20257v;
        if (j10 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i11, paint2);
        } else {
            Rect rect3 = this.f20256u;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int max = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (max < i14) {
                canvas.drawRect(max, centerY, i14, i11, paint2);
            }
            int max2 = Math.max(i12, rect2.right);
            if (i13 > max2) {
                canvas.drawRect(max2, centerY, i13, i11, this.f20259x);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i11, this.f20258w);
            }
            if (this.f20251h0 != 0) {
                long[] jArr = this.f20252i0;
                jArr.getClass();
                boolean[] zArr = this.f20253j0;
                zArr.getClass();
                int i15 = this.G;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f20251h0) {
                    int min = Math.min(rect.width() - i15, Math.max(i17, ((int) ((rect.width() * g0.i(jArr[i18], 0L, this.f20248e0)) / this.f20248e0)) - i16)) + rect.left;
                    if (zArr[i18]) {
                        paint = this.A;
                    } else {
                        paint = this.f20260z;
                    }
                    canvas.drawRect(min, centerY, min + i15, i11, paint);
                    i18++;
                    i17 = i17;
                    i15 = i15;
                }
            }
        }
        if (this.f20248e0 > 0) {
            int h10 = g0.h(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.C;
            if (drawable == null) {
                if (!this.f20246c0 && !isFocused()) {
                    if (isEnabled()) {
                        i10 = this.H;
                    } else {
                        i10 = this.I;
                    }
                } else {
                    i10 = this.J;
                }
                canvas.drawCircle(h10, centerY2, (int) ((i10 * this.W) / 2.0f), this.B);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.W)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.W)) / 2;
                drawable.setBounds(h10 - intrinsicWidth, centerY2 - intrinsicHeight, h10 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f20246c0 && !z10) {
            f(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f20248e0 <= 0) {
            return;
        }
        if (g0.f27302a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.d(r0)
            if (r0 == 0) goto L2e
            androidx.activity.g r5 = r4.O
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f20246c0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.f(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        Rect rect;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.F;
        int i19 = this.D;
        int i20 = this.E;
        int i21 = this.K;
        if (i18 == 1) {
            i14 = (i17 - getPaddingBottom()) - i20;
            i15 = ((i17 - getPaddingBottom()) - i19) - Math.max(i21 - (i19 / 2), 0);
        } else {
            i14 = (i17 - i20) / 2;
            i15 = (i17 - i19) / 2;
        }
        Rect rect2 = this.f20254s;
        rect2.set(paddingLeft, i14, paddingRight, i20 + i14);
        this.f20255t.set(rect2.left + i21, i15, rect2.right - i21, i19 + i15);
        if (g0.f27302a >= 29 && ((rect = this.V) == null || rect.width() != i16 || this.V.height() != i17)) {
            Rect rect3 = new Rect(0, 0, i16, i17);
            this.V = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.E;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        boolean z10;
        Drawable drawable = this.C;
        if (drawable != null) {
            if (g0.f27302a >= 23 && drawable.setLayoutDirection(i10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f20248e0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.Q
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f20257v
            android.graphics.Rect r5 = r9.f20255t
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f20246c0
            if (r10 == 0) goto La1
            int r10 = r9.L
            if (r0 >= r10) goto L52
            int r10 = r9.U
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = d6.g0.h(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.U = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = d6.g0.h(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.h(r0)
            r9.g()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f20246c0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.f(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f20254s
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = d6.g0.h(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.e(r0)
            r9.g()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f20248e0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f20260z.setColor(i10);
        invalidate(this.f20254s);
    }

    public void setBufferedColor(int i10) {
        this.f20259x.setColor(i10);
        invalidate(this.f20254s);
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void setBufferedPosition(long j10) {
        if (this.f20250g0 == j10) {
            return;
        }
        this.f20250g0 = j10;
        g();
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void setDuration(long j10) {
        if (this.f20248e0 == j10) {
            return;
        }
        this.f20248e0 = j10;
        if (this.f20246c0 && j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.i
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f20246c0 && !z10) {
            f(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        this.S = i10;
        this.T = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public void setKeyTimeIncrement(long j10) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        this.S = -1;
        this.T = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.A.setColor(i10);
        invalidate(this.f20254s);
    }

    public void setPlayedColor(int i10) {
        this.f20258w.setColor(i10);
        invalidate(this.f20254s);
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void setPosition(long j10) {
        if (this.f20249f0 == j10) {
            return;
        }
        this.f20249f0 = j10;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i10) {
        this.B.setColor(i10);
        invalidate(this.f20254s);
    }

    public void setUnplayedColor(int i10) {
        this.y.setColor(i10);
        invalidate(this.f20254s);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2) {
        super(context, attributeSet, 0);
        Paint paint;
        this.f20254s = new Rect();
        this.f20255t = new Rect();
        this.f20256u = new Rect();
        this.f20257v = new Rect();
        Paint paint2 = new Paint();
        this.f20258w = paint2;
        Paint paint3 = new Paint();
        this.f20259x = paint3;
        Paint paint4 = new Paint();
        this.y = paint4;
        Paint paint5 = new Paint();
        this.f20260z = paint5;
        Paint paint6 = new Paint();
        this.A = paint6;
        Paint paint7 = new Paint();
        this.B = paint7;
        paint7.setAntiAlias(true);
        this.P = new CopyOnWriteArraySet<>();
        this.Q = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.R = f;
        this.L = c(f, -50);
        int c10 = c(f, 4);
        int c11 = c(f, 26);
        int c12 = c(f, 4);
        int c13 = c(f, 12);
        int c14 = c(f, 0);
        int c15 = c(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, n.f511u, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.C = drawable;
                if (drawable != null) {
                    int i10 = g0.f27302a;
                    if (i10 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        paint = paint5;
                        if (i10 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    } else {
                        paint = paint5;
                    }
                    c11 = Math.max(drawable.getMinimumHeight(), c11);
                } else {
                    paint = paint5;
                }
                this.D = obtainStyledAttributes.getDimensionPixelSize(3, c10);
                this.E = obtainStyledAttributes.getDimensionPixelSize(12, c11);
                this.F = obtainStyledAttributes.getInt(2, 0);
                this.G = obtainStyledAttributes.getDimensionPixelSize(1, c12);
                this.H = obtainStyledAttributes.getDimensionPixelSize(11, c13);
                this.I = obtainStyledAttributes.getDimensionPixelSize(8, c14);
                this.J = obtainStyledAttributes.getDimensionPixelSize(9, c15);
                int i11 = obtainStyledAttributes.getInt(6, -1);
                int i12 = obtainStyledAttributes.getInt(7, -1);
                int i13 = obtainStyledAttributes.getInt(4, -855638017);
                int i14 = obtainStyledAttributes.getInt(13, 872415231);
                int i15 = obtainStyledAttributes.getInt(0, -1291845888);
                int i16 = obtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i11);
                paint7.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint.setColor(i15);
                paint6.setColor(i16);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.D = c10;
            this.E = c11;
            this.F = 0;
            this.G = c12;
            this.H = c13;
            this.I = c14;
            this.J = c15;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.C = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.M = sb2;
        this.N = new Formatter(sb2, Locale.getDefault());
        this.O = new androidx.activity.g(this, 6);
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            this.K = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.K = (Math.max(this.I, Math.max(this.H, this.J)) + 1) / 2;
        }
        this.W = 1.0f;
        new ValueAnimator().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i17 = DefaultTimeBar.f20245k0;
                DefaultTimeBar defaultTimeBar = DefaultTimeBar.this;
                defaultTimeBar.getClass();
                defaultTimeBar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f20254s);
            }
        });
        this.f20248e0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.T = com.anythink.expressad.exoplayer.b.f7291b;
        this.S = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
