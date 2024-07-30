package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferInputStream extends InputStream {
    private ByteBuffer byteBuffer;

    public ByteBufferInputStream() {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.byteBuffer.remaining();
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.byteBuffer.hasRemaining()) {
            return this.byteBuffer.get() & DefaultClassResolver.NAME;
        }
        return -1;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public ByteBufferInputStream(int i10) {
        this(ByteBuffer.allocate(i10));
        this.byteBuffer.flip();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int min = Math.min(this.byteBuffer.remaining(), i11);
        if (min == 0) {
            return -1;
        }
        this.byteBuffer.get(bArr, i10, min);
        return min;
    }

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
}
