package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.n;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {
    public float A;
    public boolean B;
    public double C;
    public int D;
    public int E;

    /* renamed from: s, reason: collision with root package name */
    public final ValueAnimator f21222s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21223t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f21224u;

    /* renamed from: v, reason: collision with root package name */
    public final int f21225v;

    /* renamed from: w, reason: collision with root package name */
    public final float f21226w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f21227x;
    public final RectF y;

    /* renamed from: z, reason: collision with root package name */
    public final int f21228z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(float f);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f21222s = new ValueAnimator();
        this.f21224u = new ArrayList();
        Paint paint = new Paint();
        this.f21227x = paint;
        this.y = new RectF();
        this.E = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.S, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        w6.a.c(context, R.attr.motionDurationLong2, 200);
        w6.a.d(context, R.attr.motionEasingEmphasizedInterpolator, h6.a.f28769b);
        this.D = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f21225v = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f21228z = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f21226w = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(gl.Code);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        if (i10 == 2) {
            return Math.round(this.D * 0.66f);
        }
        return this.D;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.f21222s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f, false);
    }

    public final void c(float f, boolean z10) {
        float f10 = f % 360.0f;
        this.A = f10;
        this.C = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a10 = a(this.E);
        float cos = (((float) Math.cos(this.C)) * a10) + width;
        float sin = (a10 * ((float) Math.sin(this.C))) + height;
        float f11 = this.f21225v;
        this.y.set(cos - f11, sin - f11, cos + f11, sin + f11);
        Iterator it = this.f21224u.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f10);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float a10 = a(this.E);
        float cos = (((float) Math.cos(this.C)) * a10) + f;
        float f10 = height;
        float sin = (a10 * ((float) Math.sin(this.C))) + f10;
        Paint paint = this.f21227x;
        paint.setStrokeWidth(gl.Code);
        canvas.drawCircle(cos, sin, this.f21225v, paint);
        double sin2 = Math.sin(this.C);
        paint.setStrokeWidth(this.f21228z);
        canvas.drawLine(f, f10, width + ((int) (Math.cos(this.C) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f, f10, this.f21226w, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f21222s.isRunning()) {
            b(this.A);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
            } else {
                z11 = this.B;
                if (this.f21223t) {
                    if (((float) Math.hypot(x10 - (getWidth() / 2), y - (getHeight() / 2))) <= a(2) + com.google.android.material.internal.n.b(12, getContext())) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.E = i10;
                }
                z10 = false;
            }
        } else {
            this.B = false;
            z10 = true;
            z11 = false;
        }
        boolean z14 = this.B;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x10 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        if (this.A != f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                b(f);
            }
            this.B = z14 | z13;
            return true;
        }
        z13 = true;
        this.B = z14 | z13;
        return true;
    }
}
