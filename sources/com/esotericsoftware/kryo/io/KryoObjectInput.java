package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.Kryo;
import java.io.IOException;
import java.io.ObjectInput;

/* loaded from: classes.dex */
public class KryoObjectInput extends KryoDataInput implements ObjectInput {
    private final Kryo kryo;

    public KryoObjectInput(Kryo kryo, Input input) {
        super(input);
        this.kryo = kryo;
    }

    @Override // java.io.ObjectInput
    public int available() throws IOException {
        return 0;
    }

    @Override // java.io.ObjectInput, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // java.io.ObjectInput
    public int read() throws IOException {
        return this.input.read();
    }

    @Override // java.io.ObjectInput
    public Object readObject() throws ClassNotFoundException, IOException {
        return this.kryo.readClassAndObject(this.input);
    }

    @Override // java.io.ObjectInput
    public long skip(long j10) throws IOException {
        return this.input.skip(j10);
    }

    @Override // java.io.ObjectInput
    public int read(byte[] bArr) throws IOException {
        return this.input.read(bArr);
    }

    @Override // java.io.ObjectInput
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.input.read(bArr, i10, i11);
    }
}
