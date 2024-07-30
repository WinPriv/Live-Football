package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class WaveAnimImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    int f4478a;

    /* renamed from: b, reason: collision with root package name */
    int f4479b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f4480c;

    /* renamed from: d, reason: collision with root package name */
    private a f4481d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        float f4482a;

        /* renamed from: b, reason: collision with root package name */
        float f4483b;

        /* renamed from: c, reason: collision with root package name */
        float f4484c;

        public a(float f, float f10, float f11) {
            this.f4482a = f;
            this.f4483b = f10;
            this.f4484c = f11;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f4480c = paint;
        paint.setAntiAlias(true);
        this.f4480c.setStyle(Paint.Style.STROKE);
        this.f4480c.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.f4481d;
        if (aVar != null) {
            this.f4480c.setAlpha((int) (aVar.f4484c * 255.0f));
            this.f4480c.setStrokeWidth(this.f4481d.f4483b);
            canvas.drawCircle(this.f4478a, this.f4479b, this.f4481d.f4482a, this.f4480c);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f4478a = getWidth() / 2;
        this.f4479b = getHeight() / 2;
    }

    public void setWaveAnimParams(a aVar) {
        this.f4481d = aVar;
        invalidate();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
