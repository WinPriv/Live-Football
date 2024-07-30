package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public class KryoDataInput implements DataInput {
    protected Input input;

    public KryoDataInput(Input input) {
        setInput(input);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return this.input.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return this.input.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return this.input.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return this.input.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return this.input.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        return this.input.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        return this.input.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return this.input.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        return this.input.readString();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return this.input.readByteUnsigned();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return this.input.readShortUnsigned();
    }

    public void setInput(Input input) {
        this.input = input;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) throws IOException {
        return (int) this.input.skip(i10);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.input.readBytes(bArr, i10, i11);
        } catch (KryoException e10) {
            throw new EOFException(e10.getMessage());
        }
    }
}
