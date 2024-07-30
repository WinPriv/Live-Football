package l3;

import a3.x;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public final class j implements y2.i<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f32391a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.i<ByteBuffer, c> f32392b;

    /* renamed from: c, reason: collision with root package name */
    public final b3.b f32393c;

    public j(List list, a aVar, b3.b bVar) {
        this.f32391a = list;
        this.f32392b = aVar;
        this.f32393c = bVar;
    }

    @Override // y2.i
    public final boolean a(InputStream inputStream, y2.g gVar) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) gVar.c(i.f32390b)).booleanValue()) {
            if (com.bumptech.glide.load.a.b(this.f32393c, inputStream2, this.f32391a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // y2.i
    public final x<c> b(InputStream inputStream, int i10, int i11, y2.g gVar) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f32392b.b(ByteBuffer.wrap(bArr), i10, i11, gVar);
    }
}
