package q3;

import android.graphics.drawable.Drawable;
import t3.l;

/* compiled from: CustomTarget.java */
/* loaded from: classes.dex */
public abstract class c<T> implements g<T> {

    /* renamed from: s, reason: collision with root package name */
    public final int f34624s;

    /* renamed from: t, reason: collision with root package name */
    public final int f34625t;

    /* renamed from: u, reason: collision with root package name */
    public p3.d f34626u;

    public c() {
        if (l.h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f34624s = Integer.MIN_VALUE;
            this.f34625t = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // q3.g
    public final void d(p3.d dVar) {
        this.f34626u = dVar;
    }

    @Override // q3.g
    public final p3.d f() {
        return this.f34626u;
    }

    @Override // q3.g
    public final void h(f fVar) {
        fVar.b(this.f34624s, this.f34625t);
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
    }

    @Override // q3.g
    public final void b(f fVar) {
    }

    @Override // q3.g
    public final void c(Drawable drawable) {
    }

    @Override // q3.g
    public final void e(Drawable drawable) {
    }
}
