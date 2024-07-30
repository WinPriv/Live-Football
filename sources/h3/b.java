package h3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes.dex */
public final class b implements y2.j<BitmapDrawable> {

    /* renamed from: s, reason: collision with root package name */
    public final b3.d f28683s;

    /* renamed from: t, reason: collision with root package name */
    public final y2.j<Bitmap> f28684t;

    public b(b3.d dVar, c cVar) {
        this.f28683s = dVar;
        this.f28684t = cVar;
    }

    @Override // y2.d
    public final boolean g(Object obj, File file, y2.g gVar) {
        return this.f28684t.g(new e(((BitmapDrawable) ((a3.x) obj).get()).getBitmap(), this.f28683s), file, gVar);
    }

    @Override // y2.j
    public final y2.c h(y2.g gVar) {
        return this.f28684t.h(gVar);
    }
}
