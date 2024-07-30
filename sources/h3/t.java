package h3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class t implements y2.i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final d f28741a = new d();

    @Override // y2.i
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, y2.g gVar) throws IOException {
        return true;
    }

    @Override // y2.i
    public final a3.x<Bitmap> b(InputStream inputStream, int i10, int i11, y2.g gVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(t3.a.b(inputStream));
        return this.f28741a.b(createSource, i10, i11, gVar);
    }
}
