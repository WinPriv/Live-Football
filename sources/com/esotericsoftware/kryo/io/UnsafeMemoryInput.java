package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class UnsafeMemoryInput extends ByteBufferInput {
    private long bufaddress;

    public UnsafeMemoryInput() {
        this.varIntsEnabled = false;
    }

    private void updateBufferAddress() {
        this.bufaddress = this.niobuffer.address();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() throws KryoException {
        this.niobuffer.position(this.position);
        return super.readBoolean();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public byte readByte() throws KryoException {
        this.niobuffer.position(this.position);
        return super.readByte();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public byte[] readBytes(int i10) throws KryoException {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0L, i10);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public char readChar() throws KryoException {
        require(2);
        char c10 = UnsafeUtil.unsafe().getChar(this.bufaddress + this.position);
        this.position += 2;
        return c10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public final char[] readChars(int i10) throws KryoException {
        int i11 = i10 << 1;
        char[] cArr = new char[i10];
        readBytes(cArr, UnsafeUtil.charArrayBaseOffset, 0L, i11);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public double readDouble() throws KryoException {
        require(8);
        double d10 = UnsafeUtil.unsafe().getDouble(this.bufaddress + this.position);
        this.position += 8;
        return d10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public final double[] readDoubles(int i10) throws KryoException {
        int i11 = i10 << 3;
        double[] dArr = new double[i10];
        readBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, 0L, i11);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public float readFloat() throws KryoException {
        require(4);
        float f = UnsafeUtil.unsafe().getFloat(this.bufaddress + this.position);
        this.position += 4;
        return f;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public final float[] readFloats(int i10) throws KryoException {
        int i11 = i10 << 2;
        float[] fArr = new float[i10];
        readBytes(fArr, UnsafeUtil.floatArrayBaseOffset, 0L, i11);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int readInt() throws KryoException {
        require(4);
        int i10 = UnsafeUtil.unsafe().getInt(this.bufaddress + this.position);
        this.position += 4;
        return i10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public final int[] readInts(int i10, boolean z10) throws KryoException {
        if (!this.varIntsEnabled) {
            int i11 = i10 << 2;
            int[] iArr = new int[i10];
            readBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, i11);
            return iArr;
        }
        return super.readInts(i10, z10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public long readLong() throws KryoException {
        require(8);
        long j10 = UnsafeUtil.unsafe().getLong(this.bufaddress + this.position);
        this.position += 8;
        return j10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public final long[] readLongs(int i10, boolean z10) throws KryoException {
        if (!this.varIntsEnabled) {
            int i11 = i10 << 3;
            long[] jArr = new long[i10];
            readBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, i11);
            return jArr;
        }
        return super.readLongs(i10, z10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public short readShort() throws KryoException {
        require(2);
        short s10 = UnsafeUtil.unsafe().getShort(this.bufaddress + this.position);
        this.position += 2;
        return s10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public final short[] readShorts(int i10) throws KryoException {
        int i11 = i10 << 1;
        short[] sArr = new short[i10];
        readBytes(sArr, UnsafeUtil.shortArrayBaseOffset, 0L, i11);
        return sArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput
    public void setBuffer(ByteBuffer byteBuffer) {
        super.setBuffer(byteBuffer);
        updateBufferAddress();
    }

    public UnsafeMemoryInput(int i10) {
        super(i10);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public final void readBytes(Object obj, long j10, long j11) throws KryoException {
        if (obj.getClass().isArray()) {
            readBytes(obj, UnsafeUtil.byteArrayBaseOffset, j10, (int) j11);
            return;
        }
        throw new KryoException("Only bulk reads of arrays is supported");
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int readInt(boolean z10) throws KryoException {
        if (!this.varIntsEnabled) {
            return readInt();
        }
        return super.readInt(z10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public long readLong(boolean z10) throws KryoException {
        if (!this.varIntsEnabled) {
            return readLong();
        }
        return super.readLong(z10);
    }

    public UnsafeMemoryInput(byte[] bArr) {
        super(bArr);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    private final void readBytes(Object obj, long j10, long j11, int i10) throws KryoException {
        int min = Math.min(this.limit - this.position, i10);
        int i11 = i10;
        long j12 = j11;
        while (true) {
            long j13 = min;
            UnsafeUtil.unsafe().copyMemory((Object) null, this.bufaddress + this.position, obj, j10 + j12, j13);
            this.position += min;
            i11 -= min;
            if (i11 == 0) {
                return;
            }
            j12 += j13;
            min = Math.min(i11, this.capacity);
            require(min);
        }
    }

    public UnsafeMemoryInput(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(long j10, int i10) {
        super(j10, i10);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(InputStream inputStream) {
        super(inputStream);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }
}
