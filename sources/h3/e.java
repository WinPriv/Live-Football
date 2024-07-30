package h3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public final class e implements a3.x, a3.u {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f28689s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final Object f28690t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28691u;

    public e(Bitmap bitmap, b3.d dVar) {
        if (bitmap != null) {
            this.f28690t = bitmap;
            if (dVar != null) {
                this.f28691u = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static e b(Bitmap bitmap, b3.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // a3.x
    public final void a() {
        int i10 = this.f28689s;
        Object obj = this.f28691u;
        switch (i10) {
            case 0:
                ((b3.d) obj).d((Bitmap) this.f28690t);
                return;
            default:
                ((a3.x) obj).a();
                return;
        }
    }

    @Override // a3.x
    public final Class c() {
        switch (this.f28689s) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // a3.x
    public final Object get() {
        int i10 = this.f28689s;
        Object obj = this.f28690t;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((a3.x) this.f28691u).get());
        }
    }

    @Override // a3.x
    public final int getSize() {
        switch (this.f28689s) {
            case 0:
                return t3.l.c((Bitmap) this.f28690t);
            default:
                return ((a3.x) this.f28691u).getSize();
        }
    }

    @Override // a3.u
    public final void initialize() {
        switch (this.f28689s) {
            case 0:
                ((Bitmap) this.f28690t).prepareToDraw();
                return;
            default:
                a3.x xVar = (a3.x) this.f28691u;
                if (xVar instanceof a3.u) {
                    ((a3.u) xVar).initialize();
                    return;
                }
                return;
        }
    }

    public e(Resources resources, a3.x xVar) {
        androidx.activity.n.n0(resources);
        this.f28690t = resources;
        androidx.activity.n.n0(xVar);
        this.f28691u = xVar;
    }
}
