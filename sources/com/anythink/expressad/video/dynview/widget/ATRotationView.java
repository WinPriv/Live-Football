package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class ATRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f11589a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f11590b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f11591c;

    /* renamed from: d, reason: collision with root package name */
    private int f11592d;

    /* renamed from: e, reason: collision with root package name */
    private int f11593e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f11594g;

    /* renamed from: h, reason: collision with root package name */
    private int f11595h;

    /* renamed from: i, reason: collision with root package name */
    private int f11596i;

    /* renamed from: j, reason: collision with root package name */
    private int f11597j;

    /* renamed from: k, reason: collision with root package name */
    private int f11598k;

    /* renamed from: l, reason: collision with root package name */
    private float f11599l;

    /* renamed from: m, reason: collision with root package name */
    private float f11600m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f11601n;
    private boolean o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11602p;

    public ATRotationView(Context context) {
        super(context);
        this.f = 40;
        this.f11594g = 20;
        this.f11595h = 0;
        this.f11596i = 0;
        this.f11598k = 0;
        this.f11599l = 0.5f;
        this.f11600m = 0.9f;
        this.f11601n = true;
        this.o = false;
        this.f11602p = false;
        this.f11589a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f11590b = new Camera();
        this.f11591c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f11595h * this.f11592d) / 2) / this.f;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f11595h) > this.f / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private void c(int i10) {
        int a10;
        this.f11596i = i10;
        if (Math.abs(this.f11595h) > this.f / 2) {
            a10 = a(2);
        } else {
            a10 = a(3);
        }
        if (this.f11598k != a10) {
            this.f11598k = a10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.o) {
            int height = getHeight() / 2;
            int i10 = ((this.f11595h * this.f11592d) / 2) / this.f;
            a(canvas, i10, height, 0);
            a(canvas, i10, height, 1);
            if (Math.abs(this.f11595h) > this.f / 2) {
                a(canvas, i10, height, 3);
                a(canvas, i10, height, 2);
                return;
            } else {
                a(canvas, i10, height, 2);
                a(canvas, i10, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i11 = ((this.f11595h * this.f11593e) / 2) / this.f;
        b(canvas, i11, width, 0);
        b(canvas, i11, width, 1);
        if (Math.abs(this.f11595h) > this.f / 2) {
            b(canvas, i11, width, 3);
            b(canvas, i11, width, 2);
        } else {
            b(canvas, i11, width, 2);
            b(canvas, i11, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f = i14;
        float f10 = this.f11599l;
        int i15 = (int) (((1.0f - f10) * f) / 2.0f);
        int i16 = i13 - i11;
        float f11 = i16;
        float f12 = this.f11600m;
        int i17 = (int) (((1.0f - f12) * f11) / 2.0f);
        this.f11592d = (int) (f11 * f12);
        this.f11593e = (int) (f * f10);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f11593e;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f11592d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f11589a, 1000 / this.f11594g);
        }
        this.f11601n = z10;
    }

    public void setHeightRatio(float f) {
        this.f11600m = f;
    }

    public void setRotateV(boolean z10) {
        this.o = z10;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.f11599l = f;
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f11595h * this.f11593e) / 2) / this.f;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f11595h) > this.f / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b() {
        int a10;
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f11595h - 1;
        this.f11595h = i10;
        int i11 = this.f11596i;
        this.f11597j = i11;
        int i12 = this.f;
        int i13 = i11 - (i10 / i12);
        int i14 = i10 % i12;
        this.f11595h = i14;
        this.f11596i = i13;
        if (Math.abs(i14) > this.f / 2) {
            a10 = a(2);
        } else {
            a10 = a(3);
        }
        if (this.f11598k != a10) {
            this.f11598k = a10;
        }
        invalidate();
        if (this.f11601n) {
            postDelayed(this.f11589a, 1000 / this.f11594g);
        }
    }

    private void a(int i10, int i11, int i12) {
        float f = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f11590b.translate(gl.Code, f, gl.Code);
            float f10 = -i11;
            this.f11590b.rotateX(f10);
            this.f11590b.translate(gl.Code, f, gl.Code);
            this.f11590b.translate(gl.Code, f, gl.Code);
            this.f11590b.rotateX(f10);
            this.f11590b.translate(gl.Code, f, gl.Code);
            return;
        }
        if (i12 == 1) {
            this.f11590b.translate(gl.Code, f, gl.Code);
            this.f11590b.rotateX(i11);
            this.f11590b.translate(gl.Code, f, gl.Code);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f11590b.rotateX(gl.Code);
        } else {
            this.f11590b.translate(gl.Code, f, gl.Code);
            this.f11590b.rotateX(-i11);
            this.f11590b.translate(gl.Code, f, gl.Code);
        }
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 40;
        this.f11594g = 20;
        this.f11595h = 0;
        this.f11596i = 0;
        this.f11598k = 0;
        this.f11599l = 0.5f;
        this.f11600m = 0.9f;
        this.f11601n = true;
        this.o = false;
        this.f11602p = false;
        this.f11589a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i10) {
        int a10;
        int i11 = this.f;
        int i12 = this.f11597j - (i10 / i11);
        int i13 = i10 % i11;
        this.f11595h = i13;
        this.f11596i = i12;
        if (Math.abs(i13) > this.f / 2) {
            a10 = a(2);
        } else {
            a10 = a(3);
        }
        if (this.f11598k != a10) {
            this.f11598k = a10;
        }
        invalidate();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f11590b.save();
        this.f11591c.reset();
        float f = i10;
        this.f11590b.translate(gl.Code, f, gl.Code);
        this.f11590b.rotateX(this.f11595h);
        this.f11590b.translate(gl.Code, f, gl.Code);
        if (i10 == 0) {
            if (this.f11602p) {
                a(this.f11592d, this.f, i12);
            } else {
                a(-this.f11592d, -this.f, i12);
            }
        } else if (i10 > 0) {
            a(this.f11592d, this.f, i12);
        } else if (i10 < 0) {
            a(-this.f11592d, -this.f, i12);
        }
        this.f11590b.getMatrix(this.f11591c);
        this.f11590b.restore();
        this.f11591c.preTranslate((-getWidth()) / 2, -i11);
        this.f11591c.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f11591c);
        View childAt = getChildAt(a(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f = 40;
        this.f11594g = 20;
        this.f11595h = 0;
        this.f11596i = 0;
        this.f11598k = 0;
        this.f11599l = 0.5f;
        this.f11600m = 0.9f;
        this.f11601n = true;
        this.o = false;
        this.f11602p = false;
        this.f11589a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f = (-i10) / 2;
            this.f11590b.translate(f, gl.Code, gl.Code);
            float f10 = -i11;
            this.f11590b.rotateY(f10);
            this.f11590b.translate(f, gl.Code, gl.Code);
            this.f11590b.translate(f, gl.Code, gl.Code);
            this.f11590b.rotateY(f10);
            this.f11590b.translate(f, gl.Code, gl.Code);
            return;
        }
        if (i12 == 1) {
            float f11 = i10 / 2;
            this.f11590b.translate(f11, gl.Code, gl.Code);
            this.f11590b.rotateY(i11);
            this.f11590b.translate(f11, gl.Code, gl.Code);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f11590b.rotateY(gl.Code);
        } else {
            float f12 = (-i10) / 2;
            this.f11590b.translate(f12, gl.Code, gl.Code);
            this.f11590b.rotateY(-i11);
            this.f11590b.translate(f12, gl.Code, gl.Code);
        }
    }

    private int a(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = i10 != 3 ? 0 : this.f11596i;
                } else if (this.f11602p) {
                    i12 = this.f11596i;
                    i11 = i12 - 1;
                } else {
                    i13 = this.f11596i;
                    i11 = i13 + 1;
                }
            } else if (this.f11602p) {
                i13 = this.f11596i;
                i11 = i13 + 1;
            } else {
                i12 = this.f11596i;
                i11 = i12 - 1;
            }
        } else if (this.f11602p) {
            i11 = this.f11596i - 2;
        } else {
            i11 = this.f11596i + 2;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f11590b.save();
        this.f11591c.reset();
        float f = i10;
        this.f11590b.translate(f, gl.Code, gl.Code);
        this.f11590b.rotateY(this.f11595h);
        this.f11590b.translate(f, gl.Code, gl.Code);
        if (i10 == 0) {
            if (this.f11602p) {
                b(this.f11593e, this.f, i12);
            } else {
                b(-this.f11593e, -this.f, i12);
            }
        } else if (i10 > 0) {
            b(this.f11593e, this.f, i12);
        } else if (i10 < 0) {
            b(-this.f11593e, -this.f, i12);
        }
        this.f11590b.getMatrix(this.f11591c);
        this.f11590b.restore();
        this.f11591c.preTranslate(-i11, (-getHeight()) / 2);
        this.f11591c.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f11591c);
        View childAt = getChildAt(a(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public static /* synthetic */ void a(ATRotationView aTRotationView) {
        int a10;
        if (aTRotationView.getChildCount() != 0) {
            int i10 = aTRotationView.f11595h - 1;
            aTRotationView.f11595h = i10;
            int i11 = aTRotationView.f11596i;
            aTRotationView.f11597j = i11;
            int i12 = aTRotationView.f;
            int i13 = i11 - (i10 / i12);
            int i14 = i10 % i12;
            aTRotationView.f11595h = i14;
            aTRotationView.f11596i = i13;
            if (Math.abs(i14) > aTRotationView.f / 2) {
                a10 = aTRotationView.a(2);
            } else {
                a10 = aTRotationView.a(3);
            }
            if (aTRotationView.f11598k != a10) {
                aTRotationView.f11598k = a10;
            }
            aTRotationView.invalidate();
            if (aTRotationView.f11601n) {
                aTRotationView.postDelayed(aTRotationView.f11589a, 1000 / aTRotationView.f11594g);
            }
        }
    }
}
