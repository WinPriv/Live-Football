package com.applovin.exoplayer2.ui;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.k;
import com.applovin.sdk.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class d extends View implements k {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* renamed from: a */
    private final Rect f16709a;

    /* renamed from: b */
    private final Rect f16710b;

    /* renamed from: c */
    private final Rect f16711c;

    /* renamed from: d */
    private final Rect f16712d;

    /* renamed from: e */
    private final Paint f16713e;
    private final Paint f;

    /* renamed from: g */
    private final Paint f16714g;

    /* renamed from: h */
    private final Paint f16715h;

    /* renamed from: i */
    private final Paint f16716i;

    /* renamed from: j */
    private final Paint f16717j;

    /* renamed from: k */
    private final Drawable f16718k;

    /* renamed from: l */
    private final int f16719l;

    /* renamed from: m */
    private final int f16720m;

    /* renamed from: n */
    private final int f16721n;
    private final int o;

    /* renamed from: p */
    private final int f16722p;

    /* renamed from: q */
    private final int f16723q;

    /* renamed from: r */
    private final int f16724r;

    /* renamed from: s */
    private final int f16725s;

    /* renamed from: t */
    private final int f16726t;

    /* renamed from: u */
    private final StringBuilder f16727u;

    /* renamed from: v */
    private final Formatter f16728v;

    /* renamed from: w */
    private final Runnable f16729w;

    /* renamed from: x */
    private final CopyOnWriteArraySet<k.a> f16730x;
    private final Point y;

    /* renamed from: z */
    private final float f16731z;

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public static /* synthetic */ void a(d dVar) {
        dVar.c();
    }

    public /* synthetic */ void c() {
        a(false);
    }

    private long getPositionIncrement() {
        long j10 = this.B;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.J;
            if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                return 0L;
            }
            return j11 / this.A;
        }
        return j10;
    }

    private String getProgressText() {
        return ai.a(this.f16727u, this.f16728v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f16710b.width() > 0 && this.J != com.anythink.expressad.exoplayer.b.f7291b) {
            return (this.f16712d.width() * this.J) / this.f16710b.width();
        }
        return 0L;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public long getPreferredUpdateDelay() {
        int b10 = b(this.f16731z, this.f16710b.width());
        if (b10 != 0) {
            long j10 = this.J;
            if (j10 != 0 && j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                return j10 / b10;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16718k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        a(canvas);
        b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.H && !z10) {
            a(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (ai.f16274a >= 21) {
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
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f16729w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f16729w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.H
            if (r0 == 0) goto L30
            r5 = 0
            r4.a(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17 = i12 - i10;
        int i18 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        if (this.G) {
            i14 = 0;
        } else {
            i14 = this.f16725s;
        }
        if (this.f16721n == 1) {
            i15 = (i18 - getPaddingBottom()) - this.f16720m;
            int paddingBottom = i18 - getPaddingBottom();
            int i19 = this.f16719l;
            i16 = (paddingBottom - i19) - Math.max(i14 - (i19 / 2), 0);
        } else {
            i15 = (i18 - this.f16720m) / 2;
            i16 = (i18 - this.f16719l) / 2;
        }
        this.f16709a.set(paddingLeft, i15, paddingRight, this.f16720m + i15);
        Rect rect = this.f16710b;
        Rect rect2 = this.f16709a;
        rect.set(rect2.left + i14, i16, rect2.right - i14, this.f16719l + i16);
        if (ai.f16274a >= 29) {
            a(i17, i18);
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f16720m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f16720m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        b();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f16718k;
        if (drawable != null && a(drawable, i10)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 != 3) goto L69;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.H
            if (r8 == 0) goto L76
            int r8 = r7.f16726t
            if (r0 >= r8) goto L3a
            int r8 = r7.C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.a(r8)
            goto L40
        L3a:
            r7.C = r2
            float r8 = (float) r2
            r7.a(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.b(r0)
            r7.a()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.H
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.a(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.a(r8, r0)
            if (r0 == 0) goto L76
            r7.a(r8)
            long r0 = r7.getScrubberPosition()
            r7.a(r0)
            r7.a()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (c(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (c(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f16715h.setColor(i10);
        invalidate(this.f16709a);
    }

    public void setBufferedColor(int i10) {
        this.f.setColor(i10);
        invalidate(this.f16709a);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setBufferedPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        a();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setDuration(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        if (this.H && j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            a(true);
        }
        a();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.k
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.H && !z10) {
            a(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.A = i10;
        this.B = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public void setKeyTimeIncrement(long j10) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.A = -1;
        this.B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f16716i.setColor(i10);
        invalidate(this.f16709a);
    }

    public void setPlayedColor(int i10) {
        this.f16713e.setColor(i10);
        invalidate(this.f16709a);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setPosition(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        setContentDescription(getProgressText());
        a();
    }

    public void setScrubberColor(int i10) {
        this.f16717j.setColor(i10);
        invalidate(this.f16709a);
    }

    public void setUnplayedColor(int i10) {
        this.f16714g.setColor(i10);
        invalidate(this.f16709a);
    }

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f16709a = new Rect();
        this.f16710b = new Rect();
        this.f16711c = new Rect();
        this.f16712d = new Rect();
        Paint paint = new Paint();
        this.f16713e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.f16714g = paint3;
        Paint paint4 = new Paint();
        this.f16715h = paint4;
        Paint paint5 = new Paint();
        this.f16716i = paint5;
        Paint paint6 = new Paint();
        this.f16717j = paint6;
        paint6.setAntiAlias(true);
        this.f16730x = new CopyOnWriteArraySet<>();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f16731z = f;
        this.f16726t = a(f, -50);
        int a10 = a(f, 4);
        int a11 = a(f, 26);
        int a12 = a(f, 4);
        int a13 = a(f, 12);
        int a14 = a(f, 0);
        int a15 = a(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f16718k = drawable;
                if (drawable != null) {
                    a(drawable);
                    a11 = Math.max(drawable.getMinimumHeight(), a11);
                }
                this.f16719l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a10);
                this.f16720m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a11);
                this.f16721n = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a12);
                this.f16722p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a13);
                this.f16723q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a14);
                this.f16724r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a15);
                int i12 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i13 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i14 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i15 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i16 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i17 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f16719l = a10;
            this.f16720m = a11;
            this.f16721n = 0;
            this.o = a12;
            this.f16722p = a13;
            this.f16723q = a14;
            this.f16724r = a15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f16718k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f16727u = sb2;
        this.f16728v = new Formatter(sb2, Locale.getDefault());
        this.f16729w = new androidx.activity.b(this, 5);
        Drawable drawable2 = this.f16718k;
        if (drawable2 != null) {
            this.f16725s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f16725s = (Math.max(this.f16723q, Math.max(this.f16722p, this.f16724r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.applovin.exoplayer2.ui.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                d.this.a(valueAnimator2);
            }
        });
        this.J = com.anythink.expressad.exoplayer.b.f7291b;
        this.B = com.anythink.expressad.exoplayer.b.f7291b;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f, int i10) {
        return (int) ((i10 * f) + 0.5f);
    }

    private static int b(float f, int i10) {
        return (int) (i10 / f);
    }

    private boolean c(long j10) {
        long j11 = this.J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.H ? this.I : this.K;
        long a10 = ai.a(j12 + j10, 0L, j11);
        if (a10 == j12) {
            return false;
        }
        if (!this.H) {
            a(a10);
        } else {
            b(a10);
        }
        a();
        return true;
    }

    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f16709a);
    }

    private void b(long j10) {
        if (this.I == j10) {
            return;
        }
        this.I = j10;
        Iterator<k.a> it = this.f16730x.iterator();
        while (it.hasNext()) {
            it.next().b(this, j10);
        }
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void a(k.a aVar) {
        com.applovin.exoplayer2.l.a.b(aVar);
        this.f16730x.add(aVar);
    }

    private void b(Canvas canvas) {
        int i10;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f16712d;
        int a10 = ai.a(rect.right, rect.left, this.f16710b.right);
        int centerY = this.f16712d.centerY();
        if (this.f16718k == null) {
            if (!this.H && !isFocused()) {
                i10 = isEnabled() ? this.f16722p : this.f16723q;
            } else {
                i10 = this.f16724r;
            }
            canvas.drawCircle(a10, centerY, (int) ((i10 * this.F) / 2.0f), this.f16717j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f16718k.getIntrinsicHeight() * this.F)) / 2;
        this.f16718k.setBounds(a10 - intrinsicWidth, centerY - intrinsicHeight, a10 + intrinsicWidth, centerY + intrinsicHeight);
        this.f16718k.draw(canvas);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void a(long[] jArr, boolean[] zArr, int i10) {
        com.applovin.exoplayer2.l.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.M = i10;
        this.N = jArr;
        this.O = zArr;
        a();
    }

    private void a(long j10) {
        this.I = j10;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<k.a> it = this.f16730x.iterator();
        while (it.hasNext()) {
            it.next().a(this, j10);
        }
    }

    private void a(boolean z10) {
        removeCallbacks(this.f16729w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<k.a> it = this.f16730x.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.I, z10);
        }
    }

    private void b() {
        Drawable drawable = this.f16718k;
        if (drawable != null && drawable.isStateful() && this.f16718k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void a() {
        this.f16711c.set(this.f16710b);
        this.f16712d.set(this.f16710b);
        long j10 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int width = (int) ((this.f16710b.width() * this.L) / this.J);
            Rect rect = this.f16711c;
            Rect rect2 = this.f16710b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f16710b.width() * j10) / this.J);
            Rect rect3 = this.f16712d;
            Rect rect4 = this.f16710b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f16711c;
            int i10 = this.f16710b.left;
            rect5.right = i10;
            this.f16712d.right = i10;
        }
        invalidate(this.f16709a);
    }

    private void a(float f) {
        Rect rect = this.f16712d;
        Rect rect2 = this.f16710b;
        rect.right = ai.a((int) f, rect2.left, rect2.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.y;
    }

    private boolean a(float f, float f10) {
        return this.f16709a.contains((int) f, (int) f10);
    }

    private void a(Canvas canvas) {
        int height = this.f16710b.height();
        int centerY = this.f16710b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.J <= 0) {
            Rect rect = this.f16710b;
            canvas.drawRect(rect.left, centerY, rect.right, i10, this.f16714g);
            return;
        }
        Rect rect2 = this.f16711c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f16710b.left, i12), this.f16712d.right);
        int i13 = this.f16710b.right;
        if (max < i13) {
            canvas.drawRect(max, centerY, i13, i10, this.f16714g);
        }
        int max2 = Math.max(i11, this.f16712d.right);
        if (i12 > max2) {
            canvas.drawRect(max2, centerY, i12, i10, this.f);
        }
        if (this.f16712d.width() > 0) {
            Rect rect3 = this.f16712d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i10, this.f16713e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) com.applovin.exoplayer2.l.a.b(this.N);
        boolean[] zArr = (boolean[]) com.applovin.exoplayer2.l.a.b(this.O);
        int i14 = this.o / 2;
        for (int i15 = 0; i15 < this.M; i15++) {
            int width = ((int) ((this.f16710b.width() * ai.a(jArr[i15], 0L, this.J)) / this.J)) - i14;
            Rect rect4 = this.f16710b;
            canvas.drawRect(Math.min(rect4.width() - this.o, Math.max(0, width)) + rect4.left, centerY, r8 + this.o, i10, zArr[i15] ? this.f16716i : this.f16715h);
        }
    }

    private void a(int i10, int i11) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i10 && this.D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private boolean a(Drawable drawable) {
        return ai.f16274a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i10) {
        return ai.f16274a >= 23 && drawable.setLayoutDirection(i10);
    }
}
