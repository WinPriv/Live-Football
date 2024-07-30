package h3;

import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class f implements y2.k<Bitmap> {
    @Override // y2.k
    public final a3.x b(com.bumptech.glide.h hVar, a3.x xVar, int i10, int i11) {
        if (t3.l.h(i10, i11)) {
            b3.d dVar = com.bumptech.glide.b.b(hVar).f19717s;
            Bitmap bitmap = (Bitmap) xVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(dVar, bitmap, i10, i11);
            if (!bitmap.equals(c10)) {
                return e.b(c10, dVar);
            }
            return xVar;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(b3.d dVar, Bitmap bitmap, int i10, int i11);
}
