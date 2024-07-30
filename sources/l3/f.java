package l3;

import a3.x;
import android.graphics.Bitmap;
import androidx.activity.n;
import java.security.MessageDigest;
import y2.k;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public final class f implements k<c> {

    /* renamed from: b, reason: collision with root package name */
    public final k<Bitmap> f32368b;

    public f(k<Bitmap> kVar) {
        n.n0(kVar);
        this.f32368b = kVar;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        this.f32368b.a(messageDigest);
    }

    @Override // y2.k
    public final x b(com.bumptech.glide.h hVar, x xVar, int i10, int i11) {
        c cVar = (c) xVar.get();
        h3.e eVar = new h3.e(cVar.f32358s.f32365a.f32379l, com.bumptech.glide.b.b(hVar).f19717s);
        k<Bitmap> kVar = this.f32368b;
        x b10 = kVar.b(hVar, eVar, i10, i11);
        if (!eVar.equals(b10)) {
            eVar.a();
        }
        cVar.f32358s.f32365a.c(kVar, (Bitmap) b10.get());
        return xVar;
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f32368b.equals(((f) obj).f32368b);
        }
        return false;
    }

    @Override // y2.e
    public final int hashCode() {
        return this.f32368b.hashCode();
    }
}
