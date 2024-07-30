package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public final class LN {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), gl.Code);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(LM lm) {
        byte[] decode = Base64.decode(lm.A00(Kd.A02), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Bitmap A02(LM lm) {
        byte[] decode = Base64.decode(lm.A00(Kd.A02), 0);
        return A00(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static Drawable A03(C1316Wj c1316Wj, LM lm) {
        return new BitmapDrawable(c1316Wj.getResources(), A01(lm));
    }
}
