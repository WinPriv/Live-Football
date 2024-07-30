package com.esotericsoftware.kryo.io;

import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class OutputChunked extends Output {
    public OutputChunked() {
        super(2048);
    }

    private void writeChunkSize() throws IOException {
        int position = position();
        if (Log.TRACE) {
            Log.trace("kryo", "Write chunk: " + position);
        }
        OutputStream outputStream = getOutputStream();
        if ((position & (-128)) == 0) {
            outputStream.write(position);
            return;
        }
        outputStream.write((position & a.R) | 128);
        int i10 = position >>> 7;
        if ((i10 & (-128)) == 0) {
            outputStream.write(i10);
            return;
        }
        outputStream.write((i10 & a.R) | 128);
        int i11 = i10 >>> 7;
        if ((i11 & (-128)) == 0) {
            outputStream.write(i11);
            return;
        }
        outputStream.write((i11 & a.R) | 128);
        int i12 = i11 >>> 7;
        if ((i12 & (-128)) == 0) {
            outputStream.write(i12);
        } else {
            outputStream.write((i12 & a.R) | 128);
            outputStream.write(i12 >>> 7);
        }
    }

    public void endChunks() {
        flush();
        if (Log.TRACE) {
            Log.trace("kryo", "End chunks.");
        }
        try {
            getOutputStream().write(0);
        } catch (IOException e10) {
            throw new KryoException(e10);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        if (position() > 0) {
            try {
                writeChunkSize();
                super.flush();
            } catch (IOException e10) {
                throw new KryoException(e10);
            }
        }
        super.flush();
    }

    public OutputChunked(int i10) {
        super(i10);
    }

    public OutputChunked(OutputStream outputStream) {
        super(outputStream, 2048);
    }

    public OutputChunked(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
