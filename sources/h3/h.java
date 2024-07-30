package h3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements y2.i<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final d f28694a = new d();

    @Override // y2.i
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, y2.g gVar) throws IOException {
        return true;
    }

    @Override // y2.i
    public final a3.x<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, y2.g gVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f28694a.b(createSource, i10, i11, gVar);
    }
}
