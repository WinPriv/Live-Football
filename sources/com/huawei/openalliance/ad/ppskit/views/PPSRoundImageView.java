package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public class PPSRoundImageView extends ImageView {

    /* renamed from: s, reason: collision with root package name */
    public Paint f23289s;

    /* renamed from: t, reason: collision with root package name */
    public Path f23290t;

    /* renamed from: u, reason: collision with root package name */
    public RectF f23291u;

    /* renamed from: v, reason: collision with root package name */
    public final float f23292v;

    /* renamed from: w, reason: collision with root package name */
    public final float f23293w;

    /* renamed from: x, reason: collision with root package name */
    public Paint f23294x;

    public PPSRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f13j0, 0, 0);
        int color = obtainStyledAttributes.getColor(0, -1);
        float dimension = obtainStyledAttributes.getDimension(1, gl.Code);
        this.f23292v = dimension;
        this.f23293w = obtainStyledAttributes.getDimension(2, (int) TypedValue.applyDimension(1, 8, getResources().getDisplayMetrics()));
        obtainStyledAttributes.recycle();
        this.f23290t = new Path();
        Paint paint = new Paint();
        this.f23289s = paint;
        paint.setAntiAlias(true);
        this.f23289s.setStyle(Paint.Style.STROKE);
        this.f23289s.setColor(color);
        this.f23289s.setStrokeWidth(dimension);
        Paint paint2 = new Paint();
        this.f23294x = paint2;
        paint2.setAntiAlias(true);
        this.f23294x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int saveLayerAlpha = canvas.saveLayerAlpha(gl.Code, gl.Code, canvas.getWidth(), canvas.getHeight(), com.anythink.expressad.exoplayer.k.p.f9095b, 31);
        super.onDraw(canvas);
        canvas.drawPath(this.f23290t, this.f23294x);
        canvas.drawPath(this.f23290t, this.f23289s);
        canvas.restoreToCount(saveLayerAlpha);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f = this.f23292v;
        this.f23291u = new RectF(f, f, i10 - f, i11 - f);
        this.f23290t.reset();
        Path path = this.f23290t;
        RectF rectF = this.f23291u;
        float f10 = this.f23293w;
        path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, Path.Direction.CW);
        this.f23290t.setFillType(Path.FillType.INVERSE_WINDING);
    }
}
