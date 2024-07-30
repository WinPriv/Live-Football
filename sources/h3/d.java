package h3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class d implements y2.i<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f28688a = new b3.e();

    @Override // y2.i
    public final /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, y2.g gVar) throws IOException {
        return true;
    }

    @Override // y2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e b(ImageDecoder.Source source, int i10, int i11, y2.g gVar) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new g3.a(i10, i11, gVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new e(decodeBitmap, this.f28688a);
    }
}
