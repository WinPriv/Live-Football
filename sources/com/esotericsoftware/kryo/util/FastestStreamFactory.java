package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.StreamFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.UnsafeInput;
import com.esotericsoftware.kryo.io.UnsafeOutput;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class FastestStreamFactory implements StreamFactory {
    private static boolean isUnsafe;

    static {
        boolean z10;
        if (UnsafeUtil.unsafe() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        isUnsafe = z10;
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput() {
        return isUnsafe ? new UnsafeInput() : new Input();
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput() {
        return isUnsafe ? new UnsafeOutput() : new Output();
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(int i10) {
        return isUnsafe ? new UnsafeInput(i10) : new Input(i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(int i10) {
        return isUnsafe ? new UnsafeOutput(i10) : new Output(i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(byte[] bArr) {
        return isUnsafe ? new UnsafeInput(bArr) : new Input(bArr);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(int i10, int i11) {
        return isUnsafe ? new UnsafeOutput(i10, i11) : new Output(i10, i11);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(byte[] bArr, int i10, int i11) {
        return isUnsafe ? new UnsafeInput(bArr, i10, i11) : new Input(bArr, i10, i11);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(byte[] bArr) {
        return isUnsafe ? new UnsafeOutput(bArr) : new Output(bArr);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(InputStream inputStream) {
        return isUnsafe ? new UnsafeInput(inputStream) : new Input(inputStream);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(byte[] bArr, int i10) {
        return isUnsafe ? new UnsafeOutput(bArr, i10) : new Output(bArr, i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(InputStream inputStream, int i10) {
        return isUnsafe ? new UnsafeInput(inputStream, i10) : new Input(inputStream, i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(OutputStream outputStream) {
        return isUnsafe ? new UnsafeOutput(outputStream) : new Output(outputStream);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(OutputStream outputStream, int i10) {
        return isUnsafe ? new UnsafeOutput(outputStream, i10) : new Output(outputStream, i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public void setKryo(Kryo kryo) {
    }
}
