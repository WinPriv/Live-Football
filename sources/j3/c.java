package j3;

import a3.u;
import a3.x;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.activity.n;

/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class c<T extends Drawable> implements x<T>, u {

    /* renamed from: s, reason: collision with root package name */
    public final T f29636s;

    public c(T t10) {
        n.n0(t10);
        this.f29636s = t10;
    }

    @Override // a3.x
    public final Object get() {
        T t10 = this.f29636s;
        Drawable.ConstantState constantState = t10.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return t10;
    }

    @Override // a3.u
    public void initialize() {
        T t10 = this.f29636s;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof l3.c) {
            ((l3.c) t10).f32358s.f32365a.f32379l.prepareToDraw();
        }
    }
}
