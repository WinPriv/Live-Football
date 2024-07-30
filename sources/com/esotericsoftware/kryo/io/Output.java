package com.esotericsoftware.kryo.io;

import a3.k;
import a3.l;
import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.KryoException;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class Output extends OutputStream {
    protected byte[] buffer;
    protected int capacity;
    protected int maxCapacity;
    protected OutputStream outputStream;
    protected int position;
    protected long total;

    public Output() {
    }

    public static int intLength(int i10, boolean z10) {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        if ((i10 >>> 7) == 0) {
            return 1;
        }
        if ((i10 >>> 14) == 0) {
            return 2;
        }
        if ((i10 >>> 21) == 0) {
            return 3;
        }
        if ((i10 >>> 28) == 0) {
            return 4;
        }
        return 5;
    }

    public static int longLength(long j10, boolean z10) {
        if (!z10) {
            j10 = (j10 >> 63) ^ (j10 << 1);
        }
        if ((j10 >>> 7) == 0) {
            return 1;
        }
        if ((j10 >>> 14) == 0) {
            return 2;
        }
        if ((j10 >>> 21) == 0) {
            return 3;
        }
        if ((j10 >>> 28) == 0) {
            return 4;
        }
        if ((j10 >>> 35) == 0) {
            return 5;
        }
        if ((j10 >>> 42) == 0) {
            return 6;
        }
        if ((j10 >>> 49) == 0) {
            return 7;
        }
        if ((j10 >>> 56) == 0) {
            return 8;
        }
        return 9;
    }

    private void writeAscii_slow(String str, int i10) throws KryoException {
        if (i10 == 0) {
            return;
        }
        if (this.capacity == 0) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int min = Math.min(i10, this.capacity - this.position);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + min;
            str.getBytes(i11, i12, bArr, this.position);
            this.position += min;
            min = Math.min(i10 - i12, this.capacity);
            if (require(min)) {
                bArr = this.buffer;
            }
            i11 = i12;
        }
    }

    private void writeString_slow(CharSequence charSequence, int i10, int i11) {
        while (i11 < i10) {
            int i12 = this.position;
            int i13 = this.capacity;
            if (i12 == i13) {
                require(Math.min(i13, i10 - i11));
            }
            char charAt = charSequence.charAt(i11);
            if (charAt <= 127) {
                byte[] bArr = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                bArr[i14] = (byte) charAt;
            } else if (charAt > 2047) {
                byte[] bArr2 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                bArr2[i15] = (byte) (((charAt >> '\f') & 15) | 224);
                require(2);
                byte[] bArr3 = this.buffer;
                int i16 = this.position;
                int i17 = i16 + 1;
                bArr3[i16] = (byte) (((charAt >> 6) & 63) | 128);
                this.position = i17 + 1;
                bArr3[i17] = (byte) ((charAt & '?') | 128);
            } else {
                byte[] bArr4 = this.buffer;
                int i18 = this.position;
                this.position = i18 + 1;
                bArr4[i18] = (byte) (((charAt >> 6) & 31) | 192);
                require(1);
                byte[] bArr5 = this.buffer;
                int i19 = this.position;
                this.position = i19 + 1;
                bArr5[i19] = (byte) ((charAt & '?') | 128);
            }
            i11++;
        }
    }

    private void writeUtf8Length(int i10) {
        int i11 = i10 >>> 6;
        if (i11 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr[i12] = (byte) (i10 | 128);
            return;
        }
        int i13 = i10 >>> 13;
        if (i13 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i14 = this.position;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) (i10 | 64 | 128);
            this.position = i15 + 1;
            bArr2[i15] = (byte) i11;
            return;
        }
        int i16 = i10 >>> 20;
        if (i16 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i17 = this.position;
            int i18 = i17 + 1;
            bArr3[i17] = (byte) (i10 | 64 | 128);
            int i19 = i18 + 1;
            bArr3[i18] = (byte) (i11 | 128);
            this.position = i19 + 1;
            bArr3[i19] = (byte) i13;
            return;
        }
        int i20 = i10 >>> 27;
        if (i20 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i21 = this.position;
            int i22 = i21 + 1;
            bArr4[i21] = (byte) (i10 | 64 | 128);
            int i23 = i22 + 1;
            bArr4[i22] = (byte) (i11 | 128);
            int i24 = i23 + 1;
            bArr4[i23] = (byte) (i13 | 128);
            this.position = i24 + 1;
            bArr4[i24] = (byte) i16;
            return;
        }
        require(5);
        byte[] bArr5 = this.buffer;
        int i25 = this.position;
        int i26 = i25 + 1;
        bArr5[i25] = (byte) (i10 | 64 | 128);
        int i27 = i26 + 1;
        bArr5[i26] = (byte) (i11 | 128);
        int i28 = i27 + 1;
        bArr5[i27] = (byte) (i13 | 128);
        int i29 = i28 + 1;
        bArr5[i28] = (byte) (i16 | 128);
        this.position = i29 + 1;
        bArr5[i29] = (byte) i20;
    }

    public void clear() {
        this.position = 0;
        this.total = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        flush();
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.write(this.buffer, 0, this.position);
            this.outputStream.flush();
            this.total += this.position;
            this.position = 0;
        } catch (IOException e10) {
            throw new KryoException(e10);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public int position() {
        return this.position;
    }

    public boolean require(int i10) throws KryoException {
        if (this.capacity - this.position >= i10) {
            return false;
        }
        if (i10 <= this.maxCapacity) {
            flush();
            while (true) {
                int i11 = this.capacity;
                if (i11 - this.position >= i10) {
                    return true;
                }
                int i12 = this.maxCapacity;
                if (i11 != i12) {
                    if (i11 == 0) {
                        this.capacity = 1;
                    }
                    int min = Math.min(this.capacity * 2, i12);
                    this.capacity = min;
                    if (min < 0) {
                        this.capacity = this.maxCapacity;
                    }
                    byte[] bArr = new byte[this.capacity];
                    System.arraycopy(this.buffer, 0, bArr, 0, this.position);
                    this.buffer = bArr;
                } else {
                    throw new KryoException("Buffer overflow. Available: " + (this.capacity - this.position) + ", required: " + i10);
                }
            }
        } else {
            throw new KryoException("Buffer overflow. Max capacity: " + this.maxCapacity + ", required: " + i10);
        }
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, bArr.length);
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.position = 0;
        this.total = 0L;
    }

    public void setPosition(int i10) {
        this.position = i10;
    }

    public byte[] toBytes() {
        int i10 = this.position;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.buffer, 0, bArr, 0, i10);
        return bArr;
    }

    public long total() {
        return this.total + this.position;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void writeAscii(String str) throws KryoException {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int i10 = this.capacity;
                int i11 = this.position;
                if (i10 - i11 < length) {
                    writeAscii_slow(str, length);
                } else {
                    str.getBytes(0, length, this.buffer, i11);
                    this.position += length;
                }
                byte[] bArr = this.buffer;
                int i12 = this.position - 1;
                bArr[i12] = (byte) (128 | bArr[i12]);
                return;
            }
            writeByte(130);
            writeByte(str.charAt(0));
            return;
        }
        writeByte(a.T);
    }

    public void writeBoolean(boolean z10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public void writeByte(byte b10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = b10;
    }

    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public void writeChar(char c10) throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (c10 >>> '\b');
        this.position = i11 + 1;
        bArr[i11] = (byte) c10;
    }

    public void writeChars(char[] cArr) throws KryoException {
        for (char c10 : cArr) {
            writeChar(c10);
        }
    }

    public void writeDouble(double d10) throws KryoException {
        writeLong(Double.doubleToLongBits(d10));
    }

    public void writeDoubles(double[] dArr) throws KryoException {
        for (double d10 : dArr) {
            writeDouble(d10);
        }
    }

    public void writeFloat(float f) throws KryoException {
        writeInt(Float.floatToIntBits(f));
    }

    public void writeFloats(float[] fArr) throws KryoException {
        for (float f : fArr) {
            writeFloat(f);
        }
    }

    public void writeInt(int i10) throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i11 = this.position;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i10 >> 8);
        this.position = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public void writeInts(int[] iArr, boolean z10) throws KryoException {
        for (int i10 : iArr) {
            writeInt(i10, z10);
        }
    }

    public void writeLong(long j10) throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j10 >>> 56);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j10 >>> 48);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j10 >>> 40);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j10 >>> 32);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j10 >>> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j10 >>> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (j10 >>> 8);
        this.position = i17 + 1;
        bArr[i17] = (byte) j10;
    }

    public void writeLongs(long[] jArr, boolean z10) throws KryoException {
        for (long j10 : jArr) {
            writeLong(j10, z10);
        }
    }

    public void writeShort(int i10) throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i11 = this.position;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >>> 8);
        this.position = i12 + 1;
        bArr[i12] = (byte) i10;
    }

    public void writeShorts(short[] sArr) throws KryoException {
        for (short s10 : sArr) {
            writeShort(s10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeString(java.lang.String r8) throws com.esotericsoftware.kryo.KryoException {
        /*
            r7 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r8 != 0) goto L8
            r7.writeByte(r0)
            return
        L8:
            int r1 = r8.length()
            if (r1 != 0) goto L14
            r8 = 129(0x81, float:1.81E-43)
            r7.writeByte(r8)
            return
        L14:
            r2 = 127(0x7f, float:1.78E-43)
            r3 = 0
            r4 = 1
            if (r1 <= r4) goto L2d
            r5 = 64
            if (r1 >= r5) goto L2d
            r5 = r3
        L1f:
            if (r5 >= r1) goto L2b
            char r6 = r8.charAt(r5)
            if (r6 <= r2) goto L28
            goto L2d
        L28:
            int r5 = r5 + 1
            goto L1f
        L2b:
            r5 = r4
            goto L2e
        L2d:
            r5 = r3
        L2e:
            if (r5 == 0) goto L51
            int r2 = r7.capacity
            int r5 = r7.position
            int r2 = r2 - r5
            if (r2 >= r1) goto L3b
            r7.writeAscii_slow(r8, r1)
            goto L45
        L3b:
            byte[] r2 = r7.buffer
            r8.getBytes(r3, r1, r2, r5)
            int r8 = r7.position
            int r8 = r8 + r1
            r7.position = r8
        L45:
            byte[] r8 = r7.buffer
            int r1 = r7.position
            int r1 = r1 - r4
            r2 = r8[r1]
            r0 = r0 | r2
            byte r0 = (byte) r0
            r8[r1] = r0
            goto L78
        L51:
            int r0 = r1 + 1
            r7.writeUtf8Length(r0)
            int r0 = r7.capacity
            int r4 = r7.position
            int r0 = r0 - r4
            if (r0 < r1) goto L73
            byte[] r0 = r7.buffer
        L5f:
            if (r3 >= r1) goto L71
            char r5 = r8.charAt(r3)
            if (r5 <= r2) goto L68
            goto L71
        L68:
            int r6 = r4 + 1
            byte r5 = (byte) r5
            r0[r4] = r5
            int r3 = r3 + 1
            r4 = r6
            goto L5f
        L71:
            r7.position = r4
        L73:
            if (r3 >= r1) goto L78
            r7.writeString_slow(r8, r1, r3)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.Output.writeString(java.lang.String):void");
    }

    public int writeVarInt(int i10, boolean z10) throws KryoException {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = i10 >>> 7;
        if (i11 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr[i12] = (byte) i10;
            return 1;
        }
        int i13 = i10 >>> 14;
        if (i13 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i14 = this.position;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) ((i10 & a.R) | 128);
            this.position = i15 + 1;
            bArr2[i15] = (byte) i11;
            return 2;
        }
        int i16 = i10 >>> 21;
        if (i16 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i17 = this.position;
            int i18 = i17 + 1;
            bArr3[i17] = (byte) ((i10 & a.R) | 128);
            int i19 = i18 + 1;
            bArr3[i18] = (byte) (i11 | 128);
            this.position = i19 + 1;
            bArr3[i19] = (byte) i13;
            return 3;
        }
        int i20 = i10 >>> 28;
        if (i20 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i21 = this.position;
            int i22 = i21 + 1;
            bArr4[i21] = (byte) ((i10 & a.R) | 128);
            int i23 = i22 + 1;
            bArr4[i22] = (byte) (i11 | 128);
            int i24 = i23 + 1;
            bArr4[i23] = (byte) (i13 | 128);
            this.position = i24 + 1;
            bArr4[i24] = (byte) i16;
            return 4;
        }
        require(5);
        byte[] bArr5 = this.buffer;
        int i25 = this.position;
        int i26 = i25 + 1;
        bArr5[i25] = (byte) ((i10 & a.R) | 128);
        int i27 = i26 + 1;
        bArr5[i26] = (byte) (i11 | 128);
        int i28 = i27 + 1;
        bArr5[i27] = (byte) (i13 | 128);
        int i29 = i28 + 1;
        bArr5[i28] = (byte) (i16 | 128);
        this.position = i29 + 1;
        bArr5[i29] = (byte) i20;
        return 5;
    }

    public int writeVarLong(long j10, boolean z10) throws KryoException {
        long j11;
        if (!z10) {
            j11 = (j10 << 1) ^ (j10 >> 63);
        } else {
            j11 = j10;
        }
        long j12 = j11 >>> 7;
        if (j12 == 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr[i10] = (byte) j11;
            return 1;
        }
        long j13 = j11 >>> 14;
        if (j13 == 0) {
            require(2);
            byte[] bArr2 = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            bArr2[i11] = (byte) ((j11 & 127) | 128);
            this.position = i12 + 1;
            bArr2[i12] = (byte) j12;
            return 2;
        }
        long j14 = j11 >>> 21;
        if (j14 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i13 = this.position;
            int i14 = i13 + 1;
            bArr3[i13] = (byte) ((j11 & 127) | 128);
            int i15 = i14 + 1;
            bArr3[i14] = (byte) (j12 | 128);
            this.position = i15 + 1;
            bArr3[i15] = (byte) j13;
            return 3;
        }
        long j15 = j11 >>> 28;
        if (j15 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i16 = this.position;
            int i17 = i16 + 1;
            bArr4[i16] = (byte) ((j11 & 127) | 128);
            int i18 = i17 + 1;
            bArr4[i17] = (byte) (j12 | 128);
            int i19 = i18 + 1;
            bArr4[i18] = (byte) (j13 | 128);
            this.position = i19 + 1;
            bArr4[i19] = (byte) j14;
            return 4;
        }
        long j16 = j11 >>> 35;
        if (j16 == 0) {
            require(5);
            byte[] bArr5 = this.buffer;
            int i20 = this.position;
            int i21 = i20 + 1;
            bArr5[i20] = (byte) ((j11 & 127) | 128);
            int i22 = i21 + 1;
            bArr5[i21] = (byte) (j12 | 128);
            int i23 = i22 + 1;
            bArr5[i22] = (byte) (j13 | 128);
            int i24 = i23 + 1;
            bArr5[i23] = (byte) (j14 | 128);
            this.position = i24 + 1;
            bArr5[i24] = (byte) j15;
            return 5;
        }
        long j17 = j11 >>> 42;
        if (j17 == 0) {
            require(6);
            byte[] bArr6 = this.buffer;
            int i25 = this.position;
            int i26 = i25 + 1;
            bArr6[i25] = (byte) ((j11 & 127) | 128);
            int i27 = i26 + 1;
            bArr6[i26] = (byte) (j12 | 128);
            int i28 = i27 + 1;
            bArr6[i27] = (byte) (j13 | 128);
            int i29 = i28 + 1;
            bArr6[i28] = (byte) (j14 | 128);
            int i30 = i29 + 1;
            bArr6[i29] = (byte) (j15 | 128);
            this.position = i30 + 1;
            bArr6[i30] = (byte) j16;
            return 6;
        }
        long j18 = j11 >>> 49;
        if (j18 == 0) {
            require(7);
            byte[] bArr7 = this.buffer;
            int i31 = this.position;
            int i32 = i31 + 1;
            bArr7[i31] = (byte) ((j11 & 127) | 128);
            int i33 = i32 + 1;
            bArr7[i32] = (byte) (j12 | 128);
            int i34 = i33 + 1;
            bArr7[i33] = (byte) (j13 | 128);
            int i35 = i34 + 1;
            bArr7[i34] = (byte) (j14 | 128);
            int i36 = i35 + 1;
            bArr7[i35] = (byte) (j15 | 128);
            int i37 = i36 + 1;
            bArr7[i36] = (byte) (j16 | 128);
            this.position = i37 + 1;
            bArr7[i37] = (byte) j17;
            return 7;
        }
        long j19 = j11 >>> 56;
        if (j19 == 0) {
            require(8);
            byte[] bArr8 = this.buffer;
            int i38 = this.position;
            int i39 = i38 + 1;
            bArr8[i38] = (byte) ((j11 & 127) | 128);
            int i40 = i39 + 1;
            bArr8[i39] = (byte) (j12 | 128);
            int i41 = i40 + 1;
            bArr8[i40] = (byte) (j13 | 128);
            int i42 = i41 + 1;
            bArr8[i41] = (byte) (j14 | 128);
            int i43 = i42 + 1;
            bArr8[i42] = (byte) (j15 | 128);
            int i44 = i43 + 1;
            bArr8[i43] = (byte) (j16 | 128);
            int i45 = i44 + 1;
            bArr8[i44] = (byte) (j17 | 128);
            this.position = i45 + 1;
            bArr8[i45] = (byte) j18;
            return 8;
        }
        require(9);
        byte[] bArr9 = this.buffer;
        int i46 = this.position;
        int i47 = i46 + 1;
        bArr9[i46] = (byte) ((j11 & 127) | 128);
        int i48 = i47 + 1;
        bArr9[i47] = (byte) (j12 | 128);
        int i49 = i48 + 1;
        bArr9[i48] = (byte) (j13 | 128);
        int i50 = i49 + 1;
        bArr9[i49] = (byte) (j14 | 128);
        int i51 = i50 + 1;
        bArr9[i50] = (byte) (j15 | 128);
        int i52 = i51 + 1;
        bArr9[i51] = (byte) (j16 | 128);
        int i53 = i52 + 1;
        bArr9[i52] = (byte) (j17 | 128);
        int i54 = i53 + 1;
        bArr9[i53] = (byte) (j18 | 128);
        this.position = i54 + 1;
        bArr9[i54] = (byte) j19;
        return 9;
    }

    public Output(int i10) {
        this(i10, i10);
    }

    public void setBuffer(byte[] bArr, int i10) {
        if (bArr != null) {
            if (bArr.length > i10 && i10 != -1) {
                throw new IllegalArgumentException("buffer has length: " + bArr.length + " cannot be greater than maxBufferSize: " + i10);
            }
            if (i10 >= -1) {
                this.buffer = bArr;
                if (i10 == -1) {
                    i10 = 2147483639;
                }
                this.maxCapacity = i10;
                this.capacity = bArr.length;
                this.position = 0;
                this.total = 0L;
                this.outputStream = null;
                return;
            }
            throw new IllegalArgumentException(l.i("maxBufferSize cannot be < -1: ", i10));
        }
        throw new IllegalArgumentException("buffer cannot be null.");
    }

    public int writeDouble(double d10, double d11, boolean z10) throws KryoException {
        return writeLong((long) (d10 * d11), z10);
    }

    public int writeFloat(float f, float f10, boolean z10) throws KryoException {
        return writeInt((int) (f * f10), z10);
    }

    public Output(int i10, int i11) {
        if (i10 > i11 && i11 != -1) {
            throw new IllegalArgumentException(k.j("bufferSize: ", i10, " cannot be greater than maxBufferSize: ", i11));
        }
        if (i11 >= -1) {
            this.capacity = i10;
            this.maxCapacity = i11 == -1 ? 2147483639 : i11;
            this.buffer = new byte[i10];
            return;
        }
        throw new IllegalArgumentException(l.i("maxBufferSize cannot be < -1: ", i11));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public void writeByte(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void writeBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int min = Math.min(this.capacity - this.position, i11);
            while (true) {
                System.arraycopy(bArr, i10, this.buffer, this.position, min);
                this.position += min;
                i11 -= min;
                if (i11 == 0) {
                    return;
                }
                i10 += min;
                min = Math.min(this.capacity, i11);
                require(min);
            }
        } else {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
    }

    public void writeInts(int[] iArr) throws KryoException {
        for (int i10 : iArr) {
            writeInt(i10);
        }
    }

    public void writeLongs(long[] jArr) throws KryoException {
        for (long j10 : jArr) {
            writeLong(j10);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws KryoException {
        writeBytes(bArr, i10, i11);
    }

    public int writeInt(int i10, boolean z10) throws KryoException {
        return writeVarInt(i10, z10);
    }

    public int writeLong(long j10, boolean z10) throws KryoException {
        return writeVarLong(j10, z10);
    }

    public void writeString(CharSequence charSequence) throws KryoException {
        if (charSequence == null) {
            writeByte(128);
            return;
        }
        int length = charSequence.length();
        if (length == 0) {
            writeByte(a.T);
            return;
        }
        writeUtf8Length(length + 1);
        int i10 = this.capacity;
        int i11 = this.position;
        int i12 = 0;
        if (i10 - i11 >= length) {
            byte[] bArr = this.buffer;
            while (i12 < length) {
                char charAt = charSequence.charAt(i12);
                if (charAt > 127) {
                    break;
                }
                bArr[i11] = (byte) charAt;
                i12++;
                i11++;
            }
            this.position = i11;
        }
        if (i12 < length) {
            writeString_slow(charSequence, length, i12);
        }
    }

    public Output(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public Output(byte[] bArr, int i10) {
        if (bArr != null) {
            setBuffer(bArr, i10);
            return;
        }
        throw new IllegalArgumentException("buffer cannot be null.");
    }

    public Output(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }

    public Output(OutputStream outputStream, int i10) {
        this(i10, i10);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }
}
