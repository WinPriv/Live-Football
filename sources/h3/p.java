package h3;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import t3.a;
import x0.a;

/* compiled from: ExifInterfaceImageHeaderParser.java */
/* loaded from: classes.dex */
public final class p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, b3.b bVar) throws IOException {
        x0.a aVar = new x0.a(inputStream);
        a.c c10 = aVar.c("Orientation");
        int i10 = 1;
        if (c10 != null) {
            try {
                i10 = c10.f(aVar.f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, b3.b bVar) throws IOException {
        AtomicReference<byte[]> atomicReference = t3.a.f35403a;
        return c(new a.C0486a(byteBuffer), bVar);
    }
}
