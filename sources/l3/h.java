package l3;

import a3.x;
import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements y2.i<x2.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final b3.d f32388a;

    public h(b3.d dVar) {
        this.f32388a = dVar;
    }

    @Override // y2.i
    public final /* bridge */ /* synthetic */ boolean a(x2.a aVar, y2.g gVar) throws IOException {
        return true;
    }

    @Override // y2.i
    public final x<Bitmap> b(x2.a aVar, int i10, int i11, y2.g gVar) throws IOException {
        return h3.e.b(aVar.a(), this.f32388a);
    }
}
