package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class WebProgressBarView extends View {

    /* renamed from: a, reason: collision with root package name */
    int f4723a;

    /* renamed from: b, reason: collision with root package name */
    int f4724b;

    /* renamed from: c, reason: collision with root package name */
    Paint f4725c;

    public WebProgressBarView(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f4724b = -14575885;
        Paint paint = new Paint();
        this.f4725c = paint;
        paint.setColor(this.f4724b);
        this.f4725c.setAntiAlias(true);
        this.f4725c.setDither(true);
        this.f4723a = 0;
        setBackgroundColor(16777215);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(gl.Code, gl.Code, (getWidth() * this.f4723a) / 100, getHeight(), this.f4725c);
        canvas.restore();
    }

    public void setProgress(int i10) {
        this.f4723a = i10;
        postInvalidate();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
