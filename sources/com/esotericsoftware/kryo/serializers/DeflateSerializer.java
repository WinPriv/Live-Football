package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
public class DeflateSerializer extends Serializer {
    private final Serializer serializer;
    private boolean noHeaders = true;
    private int compressionLevel = 4;

    public DeflateSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        return this.serializer.copy(kryo, obj);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        Inflater inflater = new Inflater(this.noHeaders);
        try {
            return this.serializer.read(kryo, new Input(new InflaterInputStream(new InputChunked(input, 256), inflater), 256), cls);
        } finally {
            inflater.end();
        }
    }

    public void setCompressionLevel(int i10) {
        this.compressionLevel = i10;
    }

    public void setNoHeaders(boolean z10) {
        this.noHeaders = z10;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        OutputChunked outputChunked = new OutputChunked(output, 256);
        Deflater deflater = new Deflater(this.compressionLevel, this.noHeaders);
        try {
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputChunked, deflater);
                Output output2 = new Output(deflaterOutputStream, 256);
                this.serializer.write(kryo, output2, obj);
                output2.flush();
                deflaterOutputStream.finish();
                deflater.end();
                outputChunked.endChunks();
            } catch (IOException e10) {
                throw new KryoException(e10);
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }
}
