package m3;

import a3.x;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import y2.g;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public final class a implements c<Bitmap, byte[]> {

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.CompressFormat f32657s = Bitmap.CompressFormat.JPEG;

    /* renamed from: t, reason: collision with root package name */
    public final int f32658t = 100;

    @Override // m3.c
    public final x<byte[]> f(x<Bitmap> xVar, g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xVar.get().compress(this.f32657s, this.f32658t, byteArrayOutputStream);
        xVar.a();
        return new i3.b(byteArrayOutputStream.toByteArray());
    }
}
