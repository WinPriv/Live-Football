package q3;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes.dex */
public final class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // q3.e
    public final void i(Drawable drawable) {
        ((ImageView) this.f34628s).setImageDrawable(drawable);
    }
}
