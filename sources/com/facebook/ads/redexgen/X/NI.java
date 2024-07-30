package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public class NI extends ImageView {
    public static final int A04 = (int) (Kd.A02 * 8.0f);
    public static final float[] A05;
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    static {
        int i10 = A04;
        A05 = new float[]{i10, i10, i10, i10, i10, i10, i10, i10};
    }

    public NI(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int min = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{min, min, min, min, min, min, min, min};
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.A03.set(gl.Code, gl.Code, getWidth(), getHeight());
        this.A02.reset();
        this.A02.addRoundRect(this.A03, this.A00 ? getRadiiForCircularImage() : this.A01, Path.Direction.CW);
        canvas.clipPath(this.A02);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z10) {
        this.A00 = z10;
    }

    public void setRadius(int i10) {
        int i11 = (int) (i10 * Kd.A02);
        this.A01 = new float[]{i11, i11, i11, i11, i11, i11, i11, i11};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}
