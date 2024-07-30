package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.StreamFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class DefaultStreamFactory implements StreamFactory {
    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput() {
        return new Input();
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput() {
        return new Output();
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(int i10) {
        return new Input(i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(int i10) {
        return new Output(i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(byte[] bArr) {
        return new Input(bArr);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(int i10, int i11) {
        return new Output(i10, i11);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(byte[] bArr, int i10, int i11) {
        return new Input(bArr, i10, i11);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(byte[] bArr) {
        return new Output(bArr);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(InputStream inputStream) {
        return new Input(inputStream);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(byte[] bArr, int i10) {
        return new Output(bArr, i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Input getInput(InputStream inputStream, int i10) {
        return new Input(inputStream, i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(OutputStream outputStream) {
        return new Output(outputStream);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public Output getOutput(OutputStream outputStream, int i10) {
        return new Output(outputStream, i10);
    }

    @Override // com.esotericsoftware.kryo.StreamFactory
    public void setKryo(Kryo kryo) {
    }
}
