package q3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class e<Z> extends h<ImageView, Z> {

    /* renamed from: u, reason: collision with root package name */
    public Animatable f34627u;

    public e(ImageView imageView) {
        super(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q3.g
    public final void a(Object obj) {
        i(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f34627u = animatable;
            animatable.start();
            return;
        }
        this.f34627u = null;
    }

    @Override // q3.g
    public final void c(Drawable drawable) {
        i(null);
        this.f34627u = null;
        ((ImageView) this.f34628s).setImageDrawable(drawable);
    }

    @Override // q3.g
    public final void e(Drawable drawable) {
        i(null);
        this.f34627u = null;
        ((ImageView) this.f34628s).setImageDrawable(drawable);
    }

    @Override // q3.h, q3.g
    public final void g(Drawable drawable) {
        super.g(drawable);
        Animatable animatable = this.f34627u;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f34627u = null;
        ((ImageView) this.f34628s).setImageDrawable(drawable);
    }

    public abstract void i(Z z10);

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        Animatable animatable = this.f34627u;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
        Animatable animatable = this.f34627u;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
