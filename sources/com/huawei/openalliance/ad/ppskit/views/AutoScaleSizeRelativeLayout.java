package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public class AutoScaleSizeRelativeLayout extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public Float f23106s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f23107t;

    /* renamed from: u, reason: collision with root package name */
    public float f23108u;

    /* renamed from: v, reason: collision with root package name */
    public Path f23109v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23110w;

    public AutoScaleSizeRelativeLayout(Context context) {
        super(context);
        this.f23107t = new RectF();
        this.f23108u = gl.Code;
        this.f23110w = true;
        q(context, null);
    }

    private void q(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f17n0)) != null) {
            try {
                this.f23108u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setWillNotDraw(false);
        this.f23109v = new Path();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.f23108u > 0.01f) {
            canvas.clipPath(this.f23109v);
        }
        super.draw(canvas);
    }

    public float getRatio() {
        Float f = this.f23106s;
        if (f != null) {
            return f.floatValue();
        }
        return gl.Code;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = this.f23107t;
        rectF.set(gl.Code, gl.Code, getMeasuredWidth(), getMeasuredHeight());
        this.f23109v.reset();
        Path path = this.f23109v;
        float f = this.f23108u;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.f23110w && layoutParams != null && layoutParams.width == -1 && layoutParams.height == -1) {
            super.onMeasure(i10, i11);
            return;
        }
        Float f = this.f23106s;
        if (f != null && f.floatValue() > 0.01f) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            if (View.MeasureSpec.getMode(i11) != 1073741824 && (size <= 0 || size2 <= 0)) {
                i12 = (int) ((size * 1.0f) / this.f23106s.floatValue());
            } else {
                float f10 = size * 1.0f;
                float f11 = size2;
                if (f10 / f11 > this.f23106s.floatValue()) {
                    size = (int) (this.f23106s.floatValue() * f11);
                } else {
                    size2 = (int) (f10 / this.f23106s.floatValue());
                }
                i12 = size2;
            }
            i10 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setRatio(Float f) {
        this.f23106s = f;
    }

    public void setRectCornerRadius(float f) {
        this.f23108u = f;
        this.f23109v.reset();
        Path path = this.f23109v;
        float f10 = this.f23108u;
        path.addRoundRect(this.f23107t, f10, f10, Path.Direction.CW);
        postInvalidate();
    }

    public void setUseRatioInMatchParentMode(boolean z10) {
        this.f23110w = z10;
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23107t = new RectF();
        this.f23108u = gl.Code;
        this.f23110w = true;
        q(context, attributeSet);
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f23107t = new RectF();
        this.f23108u = gl.Code;
        this.f23110w = true;
        q(context, attributeSet);
    }
}
