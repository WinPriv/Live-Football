package h3;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f28696b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(y2.e.f36561a);

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f28696b);
    }

    @Override // h3.f
    public final Bitmap c(b3.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = x.f28754a;
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return x.b(dVar, bitmap, i10, i11);
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // y2.e
    public final int hashCode() {
        return -670243078;
    }
}
