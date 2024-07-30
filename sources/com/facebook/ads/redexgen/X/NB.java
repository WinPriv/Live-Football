package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Keep;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class NB extends View {
    public static byte[] A05;
    public float A00;
    public final float A01;
    public final Paint A02;
    public final Paint A03;
    public final RectF A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{0, 2, Ascii.US, Ascii.ETB, 2, Ascii.NAK, 3, 3};
    }

    public NB(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A01 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A00 = gl.Code;
        this.A04 = new RectF();
        this.A02 = new Paint(1);
        this.A02.setStyle(Paint.Style.STROKE);
        this.A02.setStrokeWidth(this.A01);
        this.A03 = new Paint(1);
        this.A03.setStyle(Paint.Style.STROKE);
        this.A03.setStrokeWidth(this.A01);
    }

    public final void A02(int i10, int i11) {
        this.A02.setColor(i10);
        this.A03.setColor(i11);
    }

    @Keep
    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A04, gl.Code, 360.0f, false, this.A02);
        canvas.drawArc(this.A04, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A03);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i11), getDefaultSize(getSuggestedMinimumWidth(), i10));
        setMeasuredDimension(min, min);
        RectF rectF = this.A04;
        float f = (this.A01 / 2.0f) + gl.Code;
        int min2 = getPaddingLeft();
        float f10 = f + min2;
        float f11 = (this.A01 / 2.0f) + gl.Code;
        int min3 = getPaddingTop();
        float f12 = f11 + min3;
        float f13 = min - (this.A01 / 2.0f);
        int min4 = getPaddingRight();
        float f14 = f13 - min4;
        float f15 = min - (this.A01 / 2.0f);
        int min5 = getPaddingBottom();
        rectF.set(f10, f12, f14, f15 - min5);
    }

    @Keep
    public void setProgress(float f) {
        this.A00 = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A00(0, 8, 32), f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
