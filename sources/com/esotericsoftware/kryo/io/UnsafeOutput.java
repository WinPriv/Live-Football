package com.esotericsoftware.kryo.io;

import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class UnsafeOutput extends Output {
    private static final boolean isLittleEndian = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    private boolean supportVarInts;

    public UnsafeOutput() {
        this.supportVarInts = false;
    }

    private final void writeLittleEndianInt(int i10) {
        if (isLittleEndian) {
            writeInt(i10);
        } else {
            writeInt(com.esotericsoftware.kryo.util.Util.swapInt(i10));
        }
    }

    private final void writeLittleEndianLong(long j10) {
        if (isLittleEndian) {
            writeLong(j10);
        } else {
            writeLong(com.esotericsoftware.kryo.util.Util.swapLong(j10));
        }
    }

    public boolean supportVarInts() {
        return this.supportVarInts;
    }

    public final void writeBytes(Object obj, long j10, long j11) throws KryoException {
        writeBytes(obj, 0L, j10, j11);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeChar(char c10) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, c10);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeChars(char[] cArr) throws KryoException {
        writeBytes(cArr, UnsafeUtil.charArrayBaseOffset, 0L, cArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeDouble(double d10) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, d10);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeDoubles(double[] dArr) throws KryoException {
        writeBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, 0L, dArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeFloat(float f) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, f);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeFloats(float[] fArr) throws KryoException {
        writeBytes(fArr, UnsafeUtil.floatArrayBaseOffset, 0L, fArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInt(int i10) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, i10);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInts(int[] iArr, boolean z10) throws KryoException {
        if (!this.supportVarInts) {
            writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, iArr.length << 2);
        } else {
            super.writeInts(iArr, z10);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLong(long j10) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, j10);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLongs(long[] jArr, boolean z10) throws KryoException {
        if (!this.supportVarInts) {
            writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, jArr.length << 3);
        } else {
            super.writeLongs(jArr, z10);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeShort(int i10) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, (short) i10);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeShorts(short[] sArr) throws KryoException {
        writeBytes(sArr, UnsafeUtil.shortArrayBaseOffset, 0L, sArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeVarInt(int i10, boolean z10) throws KryoException {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = i10 & a.R;
        int i12 = i10 >>> 7;
        if (i12 == 0) {
            write(i11);
            return 1;
        }
        int i13 = i11 | 128 | ((i12 & a.R) << 8);
        int i14 = i12 >>> 7;
        if (i14 == 0) {
            writeLittleEndianInt(i13);
            this.position -= 2;
            return 2;
        }
        int i15 = i13 | 32768 | ((i14 & a.R) << 16);
        int i16 = i14 >>> 7;
        if (i16 == 0) {
            writeLittleEndianInt(i15);
            this.position--;
            return 3;
        }
        int i17 = i15 | 8388608 | ((i16 & a.R) << 24);
        if ((i16 >>> 7) == 0) {
            writeLittleEndianInt(i17);
            this.position += 0;
            return 4;
        }
        writeLittleEndianLong((((r7 & a.R) << 32) | i17 | 2147483648L) & 68719476735L);
        this.position -= 3;
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeVarLong(long j10, boolean z10) throws KryoException {
        long j11;
        if (!z10) {
            j11 = (j10 << 1) ^ (j10 >> 63);
        } else {
            j11 = j10;
        }
        int i10 = (int) (j11 & 127);
        long j12 = j11 >>> 7;
        if (j12 == 0) {
            writeByte(i10);
            return 1;
        }
        int i11 = (int) (i10 | 128 | ((j12 & 127) << 8));
        long j13 = j12 >>> 7;
        if (j13 == 0) {
            writeLittleEndianInt(i11);
            this.position -= 2;
            return 2;
        }
        int i12 = (int) (i11 | 32768 | ((j13 & 127) << 16));
        long j14 = j13 >>> 7;
        if (j14 == 0) {
            writeLittleEndianInt(i12);
            this.position--;
            return 3;
        }
        int i13 = (int) (i12 | 8388608 | ((j14 & 127) << 24));
        long j15 = j14 >>> 7;
        if (j15 == 0) {
            writeLittleEndianInt(i13);
            this.position += 0;
            return 4;
        }
        long j16 = (i13 & 4294967295L) | 2147483648L | ((j15 & 127) << 32);
        long j17 = j15 >>> 7;
        if (j17 == 0) {
            writeLittleEndianLong(j16);
            this.position -= 3;
            return 5;
        }
        long j18 = j16 | 549755813888L | ((j17 & 127) << 40);
        long j19 = j17 >>> 7;
        if (j19 == 0) {
            writeLittleEndianLong(j18);
            this.position -= 2;
            return 6;
        }
        long j20 = j18 | 140737488355328L | ((j19 & 127) << 48);
        long j21 = j19 >>> 7;
        if (j21 == 0) {
            writeLittleEndianLong(j20);
            this.position--;
            return 7;
        }
        long j22 = ((127 & j21) << 56) | j20 | 36028797018963968L;
        long j23 = j21 >>> 7;
        if (j23 == 0) {
            writeLittleEndianLong(j22);
            return 8;
        }
        writeLittleEndianLong(j22 | Long.MIN_VALUE);
        write((int) (j23 & 255));
        return 9;
    }

    private final void writeBytes(Object obj, long j10, long j11, long j12) throws KryoException {
        int min = Math.min(this.capacity - this.position, (int) j12);
        long j13 = j12;
        long j14 = j11;
        while (true) {
            long j15 = min;
            UnsafeUtil.unsafe().copyMemory(obj, j10 + j14, this.buffer, UnsafeUtil.byteArrayBaseOffset + this.position, j15);
            this.position += min;
            j13 -= j15;
            if (j13 == 0) {
                return;
            }
            j14 += j15;
            min = Math.min(this.capacity, (int) j13);
            require(min);
        }
    }

    public void supportVarInts(boolean z10) {
        this.supportVarInts = z10;
    }

    public UnsafeOutput(int i10) {
        this(i10, i10);
    }

    public UnsafeOutput(int i10, int i11) {
        super(i10, i11);
        this.supportVarInts = false;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeInt(int i10, boolean z10) throws KryoException {
        if (!this.supportVarInts) {
            writeInt(i10);
            return 4;
        }
        return writeVarInt(i10, z10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final int writeLong(long j10, boolean z10) throws KryoException {
        if (!this.supportVarInts) {
            writeLong(j10);
            return 8;
        }
        return writeVarLong(j10, z10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeInts(int[] iArr) throws KryoException {
        writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, 0L, iArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public final void writeLongs(long[] jArr) throws KryoException {
        writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, 0L, jArr.length << 3);
    }

    public UnsafeOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public UnsafeOutput(byte[] bArr, int i10) {
        super(bArr, i10);
        this.supportVarInts = false;
    }

    public UnsafeOutput(OutputStream outputStream) {
        super(outputStream);
        this.supportVarInts = false;
    }

    public UnsafeOutput(OutputStream outputStream, int i10) {
        super(outputStream, i10);
        this.supportVarInts = false;
    }
}
