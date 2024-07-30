package q3;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes.dex */
public final class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // q3.e
    public final void i(Bitmap bitmap) {
        ((ImageView) this.f34628s).setImageBitmap(bitmap);
    }
}
