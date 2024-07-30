package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.Nullable;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public final class LL {
    @TargetApi(18)
    public static Bitmap A00(C1316Wj c1316Wj, Bitmap bitmap, int i10) throws RSRuntimeException {
        RenderScript renderScript = null;
        Allocation allocation = null;
        Allocation output = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            renderScript = RenderScript.create(c1316Wj);
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            allocation = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            output = Allocation.createTyped(renderScript, allocation.getType());
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            scriptIntrinsicBlur.setInput(allocation);
            scriptIntrinsicBlur.setRadius(i10);
            scriptIntrinsicBlur.forEach(output);
            output.copyTo(bitmap);
            renderScript.destroy();
            allocation.destroy();
            output.destroy();
            scriptIntrinsicBlur.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (output != null) {
                output.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
            throw th;
        }
    }

    @Nullable
    public static Bitmap A01(C1316Wj c1316Wj, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth() / i11;
        int height = bitmap.getHeight() / i11;
        if (width == 0 || height == 0) {
            return null;
        }
        int height2 = Build.VERSION.SDK_INT;
        if (height2 < 18) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f / i11, 1.0f / i11);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, gl.Code, gl.Code, paint);
        try {
            Bitmap A00 = A00(c1316Wj, createBitmap, i10);
            if (i11 != 1) {
                int height3 = bitmap.getWidth();
                int width2 = bitmap.getHeight();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A00, height3, width2, true);
                A00.recycle();
                return createScaledBitmap;
            }
            return A00;
        } catch (RSRuntimeException unused) {
            return new SU().A02(createBitmap, i10);
        }
    }
}
