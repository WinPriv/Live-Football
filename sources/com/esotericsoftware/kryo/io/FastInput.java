package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class FastInput extends Input {
    public FastInput() {
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt(boolean z10) throws KryoException {
        return readInt();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong(boolean z10) throws KryoException {
        return readLong();
    }

    public FastInput(int i10) {
        super(i10);
    }

    public FastInput(byte[] bArr) {
        super(bArr);
    }

    public FastInput(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public FastInput(InputStream inputStream) {
        super(inputStream);
    }

    public FastInput(InputStream inputStream, int i10) {
        super(inputStream, i10);
    }
}
