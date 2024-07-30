package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class y extends i {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f17226c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f17227d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f17228e = new Paint(1);

    public y(Context context) {
        super(context);
        f17226c.setColor(-1);
        f17227d.setColor(-16777216);
        Paint paint = f17228e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f17148a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f17148a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f17148a * 3.0f;
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f17226c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f17227d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f17228e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
