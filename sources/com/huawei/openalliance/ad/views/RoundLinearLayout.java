package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class RoundLinearLayout extends LinearLayout {

    /* renamed from: s, reason: collision with root package name */
    public final RectF f24068s;

    /* renamed from: t, reason: collision with root package name */
    public float f24069t;

    /* renamed from: u, reason: collision with root package name */
    public Path f24070u;

    public RoundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        this.f24068s = new RectF();
        this.f24069t = gl.Code;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PPSRoundCornerLayout)) != null) {
            try {
                this.f24069t = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PPSRoundCornerLayout_hiad_roundCorner, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setWillNotDraw(false);
        this.f24070u = new Path();
    }

    public final void a() {
        this.f24070u.reset();
        Path path = this.f24070u;
        RectF rectF = this.f24068s;
        float f = this.f24069t;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.f24069t > 0.01f) {
            canvas.clipPath(this.f24070u);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f24068s.set(gl.Code, gl.Code, getMeasuredWidth(), getMeasuredHeight());
        a();
    }

    public void setRectCornerRadius(float f) {
        this.f24069t = f;
        a();
        postInvalidate();
    }
}
