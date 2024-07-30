package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface StreamFactory {
    Input getInput();

    Input getInput(int i10);

    Input getInput(InputStream inputStream);

    Input getInput(InputStream inputStream, int i10);

    Input getInput(byte[] bArr);

    Input getInput(byte[] bArr, int i10, int i11);

    Output getOutput();

    Output getOutput(int i10);

    Output getOutput(int i10, int i11);

    Output getOutput(OutputStream outputStream);

    Output getOutput(OutputStream outputStream, int i10);

    Output getOutput(byte[] bArr);

    Output getOutput(byte[] bArr, int i10);

    void setKryo(Kryo kryo);
}
