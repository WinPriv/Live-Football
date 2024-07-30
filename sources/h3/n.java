package h3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28718a = new a();

    public static e a(b3.d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i11 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = x.f28755b;
                lock.lock();
                Bitmap e10 = dVar.e(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(e10);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = e10;
                    z10 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            dVar = f28718a;
        }
        return e.b(bitmap, dVar);
    }

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes.dex */
    public class a extends b3.e {
        @Override // b3.e, b3.d
        public final void d(Bitmap bitmap) {
        }
    }
}
