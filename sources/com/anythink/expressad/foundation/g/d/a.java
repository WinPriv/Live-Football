package com.anythink.expressad.foundation.g.d;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.expressad.foundation.h.m;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class a {
    @SuppressLint({"NewApi"})
    private static Drawable a(Resources resources, Bitmap bitmap) {
        return new BitmapDrawable(resources, bitmap);
    }

    private static Bitmap b(Bitmap bitmap) {
        float f;
        float f10;
        float f11;
        float f12;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f12 = width / 2;
            f11 = width;
            f = gl.Code;
            f10 = f11;
        } else {
            f = (width - height) / 2;
            f10 = height;
            f11 = width - f;
            width = height;
            f12 = height / 2;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            int i10 = (int) f10;
            Rect rect = new Rect((int) f, 0, (int) f11, i10);
            Rect rect2 = new Rect(0, 0, i10, i10);
            RectF rectF = new RectF(rect2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f12, f12, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        if (!m.a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inDither = true;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
            System.gc();
            b.a();
            try {
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                bitmap = BitmapFactory.decodeFile(str, options);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return bitmap;
            } catch (OutOfMemoryError e12) {
                e12.printStackTrace();
                return bitmap;
            }
        }
    }

    private static int a(BitmapFactory.Options options, int i10, int i11) {
        int min;
        double d10 = options.outWidth;
        double d11 = options.outHeight;
        int ceil = i11 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d10 * d11) / i11));
        if (i10 == -1) {
            min = 128;
        } else {
            double d12 = i10;
            min = (int) Math.min(Math.floor(d10 / d12), Math.floor(d11 / d12));
        }
        if (min < ceil) {
            return ceil;
        }
        if (i11 == -1 && i10 == -1) {
            return 1;
        }
        return i10 == -1 ? ceil : min;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap a(android.content.Context r0, int r1) {
        /*
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.OutOfMemoryError -> L9 java.lang.Exception -> Lc
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)     // Catch: java.lang.OutOfMemoryError -> L9 java.lang.Exception -> Lc
            goto Ld
        L9:
            java.lang.System.gc()
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L16
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            r1 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
        L16:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.d.a.a(android.content.Context, int):android.graphics.Bitmap");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0041: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:35:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream a(android.graphics.Bitmap r4) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L40
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L40
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L40
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L40
            r4.<init>(r2)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L40
            r1.close()     // Catch: java.lang.Exception -> L1a
            goto L22
        L1a:
            r0 = move-exception
            boolean r1 = com.anythink.expressad.a.f6552a
            if (r1 == 0) goto L22
            r0.printStackTrace()
        L22:
            r0 = r4
            goto L3f
        L24:
            r4 = move-exception
            goto L2a
        L26:
            r4 = move-exception
            goto L42
        L28:
            r4 = move-exception
            r1 = r0
        L2a:
            boolean r2 = com.anythink.expressad.a.f6552a     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L31
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L40
        L31:
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.lang.Exception -> L37
            goto L3f
        L37:
            r4 = move-exception
            boolean r1 = com.anythink.expressad.a.f6552a
            if (r1 == 0) goto L3f
            r4.printStackTrace()
        L3f:
            return r0
        L40:
            r4 = move-exception
            r0 = r1
        L42:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.lang.Exception -> L48
            goto L50
        L48:
            r0 = move-exception
            boolean r1 = com.anythink.expressad.a.f6552a
            if (r1 == 0) goto L50
            r0.printStackTrace()
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.d.a.a(android.graphics.Bitmap):java.io.InputStream");
    }
}
