package j3;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
public final class d extends c<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    @Override // a3.x
    public final Class<Drawable> c() {
        return this.f29636s.getClass();
    }

    @Override // a3.x
    public final int getSize() {
        T t10 = this.f29636s;
        return Math.max(1, t10.getIntrinsicHeight() * t10.getIntrinsicWidth() * 4);
    }

    @Override // a3.x
    public final void a() {
    }
}
