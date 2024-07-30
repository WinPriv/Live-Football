package h3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.huawei.hms.ads.gl;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f28695b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(y2.e.f36561a);

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f28695b);
    }

    @Override // h3.f
    public final Bitmap c(b3.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = x.f28754a;
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            Matrix matrix = new Matrix();
            int width2 = bitmap.getWidth() * i11;
            int height2 = bitmap.getHeight() * i10;
            float f = gl.Code;
            if (width2 > height2) {
                width = i11 / bitmap.getHeight();
                f = (i10 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i10 / bitmap.getWidth();
                height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap e10 = dVar.e(i10, i11, config);
            e10.setHasAlpha(bitmap.hasAlpha());
            x.a(bitmap, e10, matrix);
            return e10;
        }
        return bitmap;
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // y2.e
    public final int hashCode() {
        return -599754482;
    }
}
