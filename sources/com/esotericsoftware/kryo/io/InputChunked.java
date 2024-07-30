package com.esotericsoftware.kryo.io;

import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class InputChunked extends Input {
    private int chunkSize;

    public InputChunked() {
        super(2048);
        this.chunkSize = -1;
    }

    private void readChunkSize() {
        try {
            InputStream inputStream = getInputStream();
            int i10 = 0;
            for (int i11 = 0; i11 < 32; i11 += 7) {
                int read = inputStream.read();
                if (read != -1) {
                    i10 |= (read & a.R) << i11;
                    if ((read & 128) == 0) {
                        this.chunkSize = i10;
                        if (Log.TRACE) {
                            Log.trace("kryo", "Read chunk: " + this.chunkSize);
                            return;
                        }
                        return;
                    }
                } else {
                    throw new KryoException("Buffer underflow.");
                }
            }
            throw new KryoException("Malformed integer.");
        } catch (IOException e10) {
            throw new KryoException(e10);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int fill(byte[] bArr, int i10, int i11) throws KryoException {
        int i12 = this.chunkSize;
        if (i12 == -1) {
            readChunkSize();
        } else if (i12 == 0) {
            return -1;
        }
        int fill = super.fill(bArr, i10, Math.min(this.chunkSize, i11));
        int i13 = this.chunkSize - fill;
        this.chunkSize = i13;
        if (i13 == 0) {
            readChunkSize();
        }
        return fill;
    }

    public void nextChunks() {
        if (this.chunkSize == -1) {
            readChunkSize();
        }
        while (true) {
            int i10 = this.chunkSize;
            if (i10 <= 0) {
                break;
            } else {
                skip(i10);
            }
        }
        this.chunkSize = -1;
        if (Log.TRACE) {
            Log.trace("kryo", "Next chunks.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void rewind() {
        super.rewind();
        this.chunkSize = -1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr, int i10, int i11) {
        super.setBuffer(bArr, i10, i11);
        this.chunkSize = -1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setInputStream(InputStream inputStream) {
        super.setInputStream(inputStream);
        this.chunkSize = -1;
    }

    public InputChunked(int i10) {
        super(i10);
        this.chunkSize = -1;
    }

    public InputChunked(InputStream inputStream) {
        super(inputStream, 2048);
        this.chunkSize = -1;
    }

    public InputChunked(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.chunkSize = -1;
    }
}
