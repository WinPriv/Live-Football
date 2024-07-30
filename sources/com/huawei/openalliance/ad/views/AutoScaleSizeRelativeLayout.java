package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public class AutoScaleSizeRelativeLayout extends RelativeLayout {
    private Path B;
    private boolean C;
    private Float Code;
    private float I;
    private final RectF V;

    public AutoScaleSizeRelativeLayout(Context context) {
        super(context);
        this.V = new RectF();
        this.I = gl.Code;
        this.C = true;
        Code(context, (AttributeSet) null);
    }

    private int Code(int i10, float f) {
        if (f <= gl.Code) {
            return 0;
        }
        float f10 = (i10 * 1.0f) / f;
        return Z() ? (int) Math.ceil(f10) : (int) f10;
    }

    private int V(int i10, float f) {
        float f10 = f * i10;
        if (Z()) {
            return (int) Math.ceil(f10);
        }
        return (int) f10;
    }

    public boolean Z() {
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.I > 0.01f) {
            canvas.clipPath(this.B);
        }
        super.draw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V.set(gl.Code, gl.Code, getMeasuredWidth(), getMeasuredHeight());
        Code();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.C && layoutParams != null && layoutParams.width == -1 && layoutParams.height == -1) {
            super.onMeasure(i10, i11);
            return;
        }
        Float f = this.Code;
        if (f != null && f.floatValue() > 0.01f) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            if (View.MeasureSpec.getMode(i11) != 1073741824 && (size <= 0 || size2 <= 0)) {
                i12 = Code(size, this.Code.floatValue());
            } else {
                if ((size * 1.0f) / size2 > this.Code.floatValue()) {
                    size = V(size2, this.Code.floatValue());
                } else {
                    size2 = Code(size, this.Code.floatValue());
                }
                i12 = size2;
            }
            i10 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setRatio(Float f) {
        this.Code = f;
    }

    public void setRectCornerRadius(float f) {
        this.I = f;
        Code();
        postInvalidate();
    }

    public void setUseRatioInMatchParentMode(boolean z10) {
        this.C = z10;
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = new RectF();
        this.I = gl.Code;
        this.C = true;
        Code(context, attributeSet);
    }

    private void Code() {
        this.B.reset();
        Path path = this.B;
        RectF rectF = this.V;
        float f = this.I;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.V = new RectF();
        this.I = gl.Code;
        this.C = true;
        Code(context, attributeSet);
    }

    private void Code(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PPSRoundCornerLayout)) != null) {
            try {
                this.I = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PPSRoundCornerLayout_hiad_roundCorner, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setWillNotDraw(false);
        this.B = new Path();
    }
}
