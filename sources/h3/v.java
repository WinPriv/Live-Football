package h3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public final class v implements y2.i<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final j3.e f28748a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.d f28749b;

    public v(j3.e eVar, b3.d dVar) {
        this.f28748a = eVar;
        this.f28749b = dVar;
    }

    @Override // y2.i
    public final boolean a(Uri uri, y2.g gVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // y2.i
    public final a3.x<Bitmap> b(Uri uri, int i10, int i11, y2.g gVar) throws IOException {
        a3.x c10 = this.f28748a.c(uri, gVar);
        if (c10 == null) {
            return null;
        }
        return n.a(this.f28749b, (Drawable) ((j3.c) c10).get(), i10, i11);
    }
}
