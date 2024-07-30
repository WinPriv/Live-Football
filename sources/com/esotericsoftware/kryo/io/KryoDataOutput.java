package com.esotericsoftware.kryo.io;

import com.anythink.expressad.exoplayer.k.p;
import java.io.DataOutput;
import java.io.IOException;

/* loaded from: classes.dex */
public class KryoDataOutput implements DataOutput {
    protected Output output;

    public KryoDataOutput(Output output) {
        setOutput(output);
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    @Override // java.io.DataOutput
    public void write(int i10) throws IOException {
        this.output.write(i10);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z10) throws IOException {
        this.output.writeBoolean(z10);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i10) throws IOException {
        this.output.writeByte(i10);
    }

    @Override // java.io.DataOutput
    public void writeBytes(String str) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.output.write((byte) str.charAt(i10));
        }
    }

    @Override // java.io.DataOutput
    public void writeChar(int i10) throws IOException {
        this.output.writeChar((char) i10);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            this.output.write((charAt >>> '\b') & p.f9095b);
            this.output.write((charAt >>> 0) & p.f9095b);
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d10) throws IOException {
        this.output.writeDouble(d10);
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f) throws IOException {
        this.output.writeFloat(f);
    }

    @Override // java.io.DataOutput
    public void writeInt(int i10) throws IOException {
        this.output.writeInt(i10);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j10) throws IOException {
        this.output.writeLong(j10);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i10) throws IOException {
        this.output.writeShort(i10);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        this.output.writeString(str);
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        this.output.write(bArr);
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.output.write(bArr, i10, i11);
    }
}
