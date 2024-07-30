package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public final class OK extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public OK(C1316Wj c1316Wj, String str) {
        super(c1316Wj);
        float f = c1316Wj.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1316Wj);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f;
        int i10 = (int) density;
        textView.setPadding(i10, i10, i10, i10);
        addView(textView);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new RectF();
        LE.A0M(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(gl.Code, gl.Code, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f * 10.0f, 10.0f * f, this.A00);
        super.onDraw(canvas);
    }
}
