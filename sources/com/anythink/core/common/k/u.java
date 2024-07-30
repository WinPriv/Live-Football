package com.anythink.core.common.k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.anythink.core.common.k.a.f;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6230a = false;

    private static void a(final View view, final int i10) {
        final View view2 = (View) view.getParent();
        view2.post(new Runnable() { // from class: com.anythink.core.common.k.u.1
            @Override // java.lang.Runnable
            public final void run() {
                Rect rect = new Rect();
                view.getHitRect(rect);
                int i11 = rect.top;
                int i12 = i10;
                rect.top = i11 - i12;
                rect.bottom += i12;
                rect.left -= i12;
                rect.right += i12;
                view2.setTouchDelegate(new TouchDelegate(rect, view));
            }
        });
    }

    public static boolean b(View view) {
        Rect rect = new Rect();
        if (!view.getLocalVisibleRect(rect) || rect.top < 0 || rect.bottom > view.getHeight() || rect.height() <= view.getHeight() * 0.3f) {
            return false;
        }
        return true;
    }

    public static void a(final View view, final float f) {
        final View view2 = (View) view.getParent();
        view2.post(new Runnable() { // from class: com.anythink.core.common.k.u.2
            @Override // java.lang.Runnable
            public final void run() {
                Rect rect = new Rect();
                view.getHitRect(rect);
                int width = ((int) ((f - 1.0f) * rect.width())) / 2;
                int height = ((int) ((f - 1.0f) * rect.height())) / 2;
                int i10 = rect.top;
                if (i10 - height < 0) {
                    rect.top = 0;
                } else {
                    rect.top = i10 - height;
                }
                if (rect.bottom + height > view2.getHeight()) {
                    rect.bottom = view2.getHeight();
                } else {
                    rect.bottom += height;
                }
                int i11 = rect.left;
                if (i11 - width < 0) {
                    rect.left = 0;
                } else {
                    rect.left = i11 - width;
                }
                if (rect.right + width > view2.getWidth()) {
                    rect.right = view2.getWidth();
                } else {
                    rect.right += width;
                }
                view2.setTouchDelegate(new TouchDelegate(rect, view));
            }
        });
    }

    private static Path a(int i10, int i11, int i12) {
        Path path = new Path();
        float f = i10;
        path.moveTo(f, gl.Code);
        float f10 = i11 - i10;
        path.lineTo(f10, gl.Code);
        float f11 = i11;
        path.quadTo(f11, gl.Code, f11, f);
        float f12 = i12 - i10;
        path.lineTo(f11, f12);
        float f13 = i12;
        path.quadTo(f11, f13, f10, f13);
        path.lineTo(f, f13);
        path.quadTo(gl.Code, f13, gl.Code, f12);
        path.lineTo(gl.Code, f);
        path.quadTo(gl.Code, gl.Code, f, gl.Code);
        path.close();
        return path;
    }

    public static void a(Canvas canvas, int i10, int i11, int i12) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Path path = new Path();
            float f = i12;
            path.moveTo(f, gl.Code);
            float f10 = i10 - i12;
            path.lineTo(f10, gl.Code);
            float f11 = i10;
            path.quadTo(f11, gl.Code, f11, f);
            float f12 = i11 - i12;
            path.lineTo(f11, f12);
            float f13 = i11;
            path.quadTo(f11, f13, f10, f13);
            path.lineTo(f, f13);
            path.quadTo(gl.Code, f13, gl.Code, f12);
            path.lineTo(gl.Code, f);
            path.quadTo(gl.Code, gl.Code, f, gl.Code);
            path.close();
            canvas2.drawPath(path, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, gl.Code, gl.Code, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Canvas canvas, int i10, int i11, RectF rectF) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL);
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawArc(rectF, gl.Code, 180.0f, true, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, gl.Code, gl.Code, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int[] a(int i10, int i11, float f) {
        if (f > i10 / i11) {
            i11 = (int) Math.ceil(r0 / f);
        } else {
            i10 = (int) Math.ceil(r1 * f);
        }
        return new int[]{i10, i11};
    }

    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static void a(boolean z10) {
        f6230a = z10;
    }

    public static boolean a(View view, f.b bVar) {
        if (view != null && view.getParent() != null && bVar != null) {
            Object parent = view.getParent();
            if ((parent instanceof View) && bVar.a((View) parent, view, 100, 0) && !f6230a) {
                return true;
            }
        }
        return false;
    }
}
