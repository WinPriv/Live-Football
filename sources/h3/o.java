package h3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public final class o implements y2.k<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public final y2.k<Bitmap> f28719b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28720c;

    public o(y2.k<Bitmap> kVar, boolean z10) {
        this.f28719b = kVar;
        this.f28720c = z10;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        this.f28719b.a(messageDigest);
    }

    @Override // y2.k
    public final a3.x b(com.bumptech.glide.h hVar, a3.x xVar, int i10, int i11) {
        b3.d dVar = com.bumptech.glide.b.b(hVar).f19717s;
        Drawable drawable = (Drawable) xVar.get();
        e a10 = n.a(dVar, drawable, i10, i11);
        if (a10 == null) {
            if (!this.f28720c) {
                return xVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        a3.x b10 = this.f28719b.b(hVar, a10, i10, i11);
        if (b10.equals(a10)) {
            b10.a();
            return xVar;
        }
        return new e(hVar.getResources(), b10);
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f28719b.equals(((o) obj).f28719b);
        }
        return false;
    }

    @Override // y2.e
    public final int hashCode() {
        return this.f28719b.hashCode();
    }
}
