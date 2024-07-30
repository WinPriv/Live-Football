package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class FastOutput extends Output {
    public FastOutput() {
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeInt(int i10, boolean z10) throws KryoException {
        writeInt(i10);
        return 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeLong(long j10, boolean z10) throws KryoException {
        writeLong(j10);
        return 8;
    }

    public FastOutput(int i10) {
        this(i10, i10);
    }

    public FastOutput(int i10, int i11) {
        super(i10, i11);
    }

    public FastOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public FastOutput(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public FastOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public FastOutput(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
