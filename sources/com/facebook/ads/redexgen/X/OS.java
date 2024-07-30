package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

@SuppressLint({"ViewConstructor"})
/* loaded from: assets/audience_network.dex */
public final class OS extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final OQ A01;
    public final OR A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{Ascii.VT, 47, 33, 40, Ascii.GS, -40, 36, Ascii.GS, Ascii.RS, 44, Ascii.SO, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (Kd.A02 * 4.0f);
    }

    public OS(C1316Wj c1316Wj, OQ oq, OR or) {
        super(c1316Wj);
        this.A01 = oq;
        this.A02 = or;
        this.A00 = new Paint();
        this.A00.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A04;
        setPadding(i10, i10, i10, i10);
        boolean z10 = this.A01 == OQ.A03;
        setContentDescription(z10 ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap arrowIcon = LN.A01(LM.TO_RIGHT_ARROW);
        if (z10) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            arrowIcon = Bitmap.createBitmap(arrowIcon, 0, 0, arrowIcon.getWidth(), arrowIcon.getHeight(), matrix, true);
        }
        setImageBitmap(arrowIcon);
        setOnClickListener(new OP(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y, x10, Math.min(y, x10), this.A00);
        super.onDraw(canvas);
    }
}
