package h3;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class a0 extends MediaDataSource {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f28682s;

    public a0(ByteBuffer byteBuffer) {
        this.f28682s = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f28682s.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f28682s;
        if (j10 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j10);
        int min = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
