package com.esotericsoftware.kryo.io;

import a3.l;
import com.anythink.expressad.video.module.a.a;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class ByteBufferOutput extends Output {
    protected static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    ByteOrder byteOrder;
    protected ByteBuffer niobuffer;
    protected boolean varIntsEnabled;

    public ByteBufferOutput() {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
    }

    private boolean isNativeOrder() {
        if (this.byteOrder == nativeOrder) {
            return true;
        }
        return false;
    }

    private void writeAscii_slow(String str, int i10) throws KryoException {
        ByteBuffer byteBuffer = this.niobuffer;
        int min = Math.min(i10, this.capacity - this.position);
        int i11 = 0;
        while (i11 < i10) {
            byte[] bArr = new byte[i10];
            int i12 = i11 + min;
            str.getBytes(i11, i12, bArr, 0);
            byteBuffer.put(bArr, 0, min);
            this.position += min;
            min = Math.min(i10 - i12, this.capacity);
            if (require(min)) {
                byteBuffer = this.niobuffer;
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
                ByteBuffer byteBuffer = this.niobuffer;
                int i14 = this.position;
                this.position = i14 + 1;
                byteBuffer.put(i14, (byte) charAt);
            } else if (charAt > 2047) {
                ByteBuffer byteBuffer2 = this.niobuffer;
                int i15 = this.position;
                this.position = i15 + 1;
                byteBuffer2.put(i15, (byte) (((charAt >> '\f') & 15) | 224));
                require(2);
                ByteBuffer byteBuffer3 = this.niobuffer;
                int i16 = this.position;
                this.position = i16 + 1;
                byteBuffer3.put(i16, (byte) (((charAt >> 6) & 63) | 128));
                ByteBuffer byteBuffer4 = this.niobuffer;
                int i17 = this.position;
                this.position = i17 + 1;
                byteBuffer4.put(i17, (byte) ((charAt & '?') | 128));
            } else {
                ByteBuffer byteBuffer5 = this.niobuffer;
                int i18 = this.position;
                this.position = i18 + 1;
                byteBuffer5.put(i18, (byte) (((charAt >> 6) & 31) | 192));
                require(1);
                ByteBuffer byteBuffer6 = this.niobuffer;
                int i19 = this.position;
                this.position = i19 + 1;
                byteBuffer6.put(i19, (byte) ((charAt & '?') | 128));
            }
            i11++;
        }
    }

    private void writeUtf8Length(int i10) {
        int i11 = i10 >>> 6;
        if (i11 == 0) {
            require(1);
            this.niobuffer.put((byte) (i10 | 128));
            this.position++;
            return;
        }
        int i12 = i10 >>> 13;
        if (i12 == 0) {
            require(2);
            this.niobuffer.put((byte) (i10 | 64 | 128));
            this.niobuffer.put((byte) i11);
            this.position += 2;
            return;
        }
        int i13 = i10 >>> 20;
        if (i13 == 0) {
            require(3);
            this.niobuffer.put((byte) (i10 | 64 | 128));
            this.niobuffer.put((byte) (i11 | 128));
            this.niobuffer.put((byte) i12);
            this.position += 3;
            return;
        }
        int i14 = i10 >>> 27;
        if (i14 == 0) {
            require(4);
            this.niobuffer.put((byte) (i10 | 64 | 128));
            this.niobuffer.put((byte) (i11 | 128));
            this.niobuffer.put((byte) (i12 | 128));
            this.niobuffer.put((byte) i13);
            this.position += 4;
            return;
        }
        require(5);
        this.niobuffer.put((byte) (i10 | 64 | 128));
        this.niobuffer.put((byte) (i11 | 128));
        this.niobuffer.put((byte) (i12 | 128));
        this.niobuffer.put((byte) (i13 | 128));
        this.niobuffer.put((byte) i14);
        this.position += 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void clear() {
        this.niobuffer.clear();
        this.position = 0;
        this.total = 0L;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        if (this.outputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[this.position];
            this.niobuffer.position(0);
            this.niobuffer.get(bArr);
            this.niobuffer.position(0);
            this.outputStream.write(bArr, 0, this.position);
            this.total += this.position;
            this.position = 0;
        } catch (IOException e10) {
            throw new KryoException(e10);
        }
    }

    public ByteBuffer getByteBuffer() {
        this.niobuffer.position(this.position);
        return this.niobuffer;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public boolean getVarIntsEnabled() {
        return this.varIntsEnabled;
    }

    public ByteOrder order() {
        return this.byteOrder;
    }

    public void release() {
        clear();
        UnsafeUtil.releaseBuffer(this.niobuffer);
        this.niobuffer = null;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public boolean require(int i10) throws KryoException {
        ByteBuffer allocateDirect;
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
                    ByteBuffer byteBuffer = this.niobuffer;
                    if (byteBuffer != null && !byteBuffer.isDirect()) {
                        allocateDirect = ByteBuffer.allocate(this.capacity);
                    } else {
                        allocateDirect = ByteBuffer.allocateDirect(this.capacity);
                    }
                    this.niobuffer.position(0);
                    this.niobuffer.limit(this.position);
                    allocateDirect.put(this.niobuffer);
                    allocateDirect.order(this.niobuffer.order());
                    ByteOrder byteOrder = this.byteOrder;
                    setBuffer(allocateDirect, this.maxCapacity);
                    this.byteOrder = byteOrder;
                } else {
                    this.niobuffer.order(this.byteOrder);
                    throw new KryoException("Buffer overflow. Available: " + (this.capacity - this.position) + ", required: " + i10);
                }
            }
        } else {
            this.niobuffer.order(this.byteOrder);
            throw new KryoException("Buffer overflow. Max capacity: " + this.maxCapacity + ", required: " + i10);
        }
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer, byteBuffer.capacity());
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.position = 0;
        this.total = 0L;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setPosition(int i10) {
        this.position = i10;
        this.niobuffer.position(i10);
    }

    public void setVarIntsEnabled(boolean z10) {
        this.varIntsEnabled = z10;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public byte[] toBytes() {
        byte[] bArr = new byte[this.position];
        this.niobuffer.position(0);
        this.niobuffer.get(bArr, 0, this.position);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.niobuffer.put((byte) i10);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeAscii(String str) throws KryoException {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(a.T);
            return;
        }
        if (this.capacity - this.position < length) {
            writeAscii_slow(str, length);
        } else {
            byte[] bytes = str.getBytes();
            this.niobuffer.put(bytes, 0, bytes.length);
            this.position += length;
        }
        ByteBuffer byteBuffer = this.niobuffer;
        int i10 = this.position;
        byteBuffer.put(i10 - 1, (byte) (128 | byteBuffer.get(i10 - 1)));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBoolean(boolean z10) throws KryoException {
        require(1);
        this.niobuffer.put(z10 ? (byte) 1 : (byte) 0);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.niobuffer.put(b10);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChar(char c10) throws KryoException {
        require(2);
        this.niobuffer.putChar(c10);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChars(char[] cArr) throws KryoException {
        if (this.capacity - this.position >= cArr.length * 2 && isNativeOrder()) {
            this.niobuffer.asCharBuffer().put(cArr);
            this.position = (cArr.length * 2) + this.position;
            return;
        }
        super.writeChars(cArr);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDouble(double d10) throws KryoException {
        require(8);
        this.niobuffer.putDouble(d10);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDoubles(double[] dArr) throws KryoException {
        if (this.capacity - this.position >= dArr.length * 8 && isNativeOrder()) {
            this.niobuffer.asDoubleBuffer().put(dArr);
            this.position = (dArr.length * 8) + this.position;
            return;
        }
        super.writeDoubles(dArr);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloat(float f) throws KryoException {
        require(4);
        this.niobuffer.putFloat(f);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloats(float[] fArr) throws KryoException {
        if (this.capacity - this.position >= fArr.length * 4 && isNativeOrder()) {
            this.niobuffer.asFloatBuffer().put(fArr);
            this.position = (fArr.length * 4) + this.position;
            return;
        }
        super.writeFloats(fArr);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInt(int i10) throws KryoException {
        require(4);
        this.niobuffer.putInt(i10);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInts(int[] iArr) throws KryoException {
        if (this.capacity - this.position >= iArr.length * 4 && isNativeOrder()) {
            this.niobuffer.asIntBuffer().put(iArr);
            this.position = (iArr.length * 4) + this.position;
            return;
        }
        super.writeInts(iArr);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLong(long j10) throws KryoException {
        require(8);
        this.niobuffer.putLong(j10);
        this.position += 8;
    }

    public int writeLongS(long j10, boolean z10) throws KryoException {
        long j11;
        if (!z10) {
            j11 = (j10 << 1) ^ (j10 >> 63);
        } else {
            j11 = j10;
        }
        long j12 = j11 >>> 7;
        if (j12 == 0) {
            require(1);
            this.niobuffer.put((byte) j11);
            this.position++;
            return 1;
        }
        long j13 = j11 >>> 14;
        if (j13 == 0) {
            require(2);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) j12);
            this.position += 2;
            return 2;
        }
        long j14 = j11 >>> 21;
        if (j14 == 0) {
            require(3);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) (j12 | 128));
            this.niobuffer.put((byte) j13);
            this.position += 3;
            return 3;
        }
        long j15 = j11 >>> 28;
        if (j15 == 0) {
            require(4);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) (j12 | 128));
            this.niobuffer.put((byte) (j13 | 128));
            this.niobuffer.put((byte) j14);
            this.position += 4;
            return 4;
        }
        long j16 = j11 >>> 35;
        if (j16 == 0) {
            require(5);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) (j12 | 128));
            this.niobuffer.put((byte) (j13 | 128));
            this.niobuffer.put((byte) (j14 | 128));
            this.niobuffer.put((byte) j15);
            this.position += 5;
            return 5;
        }
        long j17 = j11 >>> 42;
        if (j17 == 0) {
            require(6);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) (j12 | 128));
            this.niobuffer.put((byte) (j13 | 128));
            this.niobuffer.put((byte) (j14 | 128));
            this.niobuffer.put((byte) (j15 | 128));
            this.niobuffer.put((byte) j16);
            this.position += 6;
            return 6;
        }
        long j18 = j11 >>> 49;
        if (j18 == 0) {
            require(7);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) (j12 | 128));
            this.niobuffer.put((byte) (j13 | 128));
            this.niobuffer.put((byte) (j14 | 128));
            this.niobuffer.put((byte) (j15 | 128));
            this.niobuffer.put((byte) (j16 | 128));
            this.niobuffer.put((byte) j17);
            this.position += 7;
            return 7;
        }
        long j19 = j11 >>> 56;
        if (j19 == 0) {
            require(8);
            this.niobuffer.put((byte) ((j11 & 127) | 128));
            this.niobuffer.put((byte) (j12 | 128));
            this.niobuffer.put((byte) (j13 | 128));
            this.niobuffer.put((byte) (j14 | 128));
            this.niobuffer.put((byte) (j15 | 128));
            this.niobuffer.put((byte) (j16 | 128));
            this.niobuffer.put((byte) (j17 | 128));
            this.niobuffer.put((byte) j18);
            this.position += 8;
            return 8;
        }
        require(9);
        this.niobuffer.put((byte) ((j11 & 127) | 128));
        this.niobuffer.put((byte) (j12 | 128));
        this.niobuffer.put((byte) (j13 | 128));
        this.niobuffer.put((byte) (j14 | 128));
        this.niobuffer.put((byte) (j15 | 128));
        this.niobuffer.put((byte) (j16 | 128));
        this.niobuffer.put((byte) (j17 | 128));
        this.niobuffer.put((byte) (j18 | 128));
        this.niobuffer.put((byte) j19);
        this.position += 9;
        return 9;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLongs(long[] jArr) throws KryoException {
        if (this.capacity - this.position >= jArr.length * 8 && isNativeOrder()) {
            this.niobuffer.asLongBuffer().put(jArr);
            this.position = (jArr.length * 8) + this.position;
            return;
        }
        super.writeLongs(jArr);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShort(int i10) throws KryoException {
        require(2);
        this.niobuffer.putShort((short) i10);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShorts(short[] sArr) throws KryoException {
        if (this.capacity - this.position >= sArr.length * 2 && isNativeOrder()) {
            this.niobuffer.asShortBuffer().put(sArr);
            this.position = (sArr.length * 2) + this.position;
            return;
        }
        super.writeShorts(sArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // com.esotericsoftware.kryo.io.Output
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeString(java.lang.String r8) throws com.esotericsoftware.kryo.KryoException {
        /*
            r7 = this;
            java.nio.ByteBuffer r0 = r7.niobuffer
            int r1 = r7.position
            r0.position(r1)
            r0 = 128(0x80, float:1.8E-43)
            if (r8 != 0) goto Lf
            r7.writeByte(r0)
            return
        Lf:
            int r1 = r8.length()
            if (r1 != 0) goto L1b
            r8 = 129(0x81, float:1.81E-43)
            r7.writeByte(r8)
            return
        L1b:
            r2 = 127(0x7f, float:1.78E-43)
            r3 = 0
            r4 = 1
            if (r1 <= r4) goto L34
            r5 = 64
            if (r1 >= r5) goto L34
            r5 = r3
        L26:
            if (r5 >= r1) goto L32
            char r6 = r8.charAt(r5)
            if (r6 <= r2) goto L2f
            goto L34
        L2f:
            int r5 = r5 + 1
            goto L26
        L32:
            r5 = r4
            goto L35
        L34:
            r5 = r3
        L35:
            if (r5 == 0) goto L62
            int r2 = r7.capacity
            int r5 = r7.position
            int r2 = r2 - r5
            if (r2 >= r1) goto L42
            r7.writeAscii_slow(r8, r1)
            goto L51
        L42:
            byte[] r8 = r8.getBytes()
            java.nio.ByteBuffer r2 = r7.niobuffer
            int r5 = r8.length
            r2.put(r8, r3, r5)
            int r8 = r7.position
            int r8 = r8 + r1
            r7.position = r8
        L51:
            java.nio.ByteBuffer r8 = r7.niobuffer
            int r1 = r7.position
            int r2 = r1 + (-1)
            int r1 = r1 - r4
            byte r1 = r8.get(r1)
            r0 = r0 | r1
            byte r0 = (byte) r0
            r8.put(r2, r0)
            goto L96
        L62:
            int r0 = r1 + 1
            r7.writeUtf8Length(r0)
            int r0 = r7.capacity
            int r4 = r7.position
            int r0 = r0 - r4
            if (r0 < r1) goto L8a
        L6e:
            if (r3 >= r1) goto L83
            char r0 = r8.charAt(r3)
            if (r0 <= r2) goto L77
            goto L83
        L77:
            java.nio.ByteBuffer r5 = r7.niobuffer
            int r6 = r4 + 1
            byte r0 = (byte) r0
            r5.put(r4, r0)
            int r3 = r3 + 1
            r4 = r6
            goto L6e
        L83:
            r7.position = r4
            java.nio.ByteBuffer r0 = r7.niobuffer
            r0.position(r4)
        L8a:
            if (r3 >= r1) goto L8f
            r7.writeString_slow(r8, r1, r3)
        L8f:
            java.nio.ByteBuffer r8 = r7.niobuffer
            int r0 = r7.position
            r8.position(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.ByteBufferOutput.writeString(java.lang.String):void");
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarInt(int i10, boolean z10) throws KryoException {
        this.niobuffer.position(this.position);
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = i10 & a.R;
        int i12 = i10 >>> 7;
        if (i12 == 0) {
            writeByte(i11);
            return 1;
        }
        int i13 = i11 | 128 | ((i12 & a.R) << 8);
        int i14 = i12 >>> 7;
        if (i14 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i13);
            this.niobuffer.order(this.byteOrder);
            int i15 = this.position - 2;
            this.position = i15;
            this.niobuffer.position(i15);
            return 2;
        }
        int i16 = i13 | 32768 | ((i14 & a.R) << 16);
        int i17 = i14 >>> 7;
        if (i17 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i16);
            this.niobuffer.order(this.byteOrder);
            int i18 = this.position - 1;
            this.position = i18;
            this.niobuffer.position(i18);
            return 3;
        }
        int i19 = i16 | 8388608 | ((i17 & a.R) << 24);
        int i20 = i17 >>> 7;
        if (i20 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i19);
            this.niobuffer.order(this.byteOrder);
            this.position += 0;
            return 4;
        }
        this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
        writeLong((i20 << 32) | ((i19 | Integer.MIN_VALUE) & 4294967295L));
        this.niobuffer.order(this.byteOrder);
        int i21 = this.position - 3;
        this.position = i21;
        this.niobuffer.position(i21);
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarLong(long j10, boolean z10) throws KryoException {
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
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i11);
            this.niobuffer.order(this.byteOrder);
            int i12 = this.position - 2;
            this.position = i12;
            this.niobuffer.position(i12);
            return 2;
        }
        int i13 = (int) (i11 | 32768 | ((j13 & 127) << 16));
        long j14 = j13 >>> 7;
        if (j14 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i13);
            this.niobuffer.order(this.byteOrder);
            int i14 = this.position - 1;
            this.position = i14;
            this.niobuffer.position(i14);
            return 3;
        }
        int i15 = (int) (i13 | 8388608 | ((j14 & 127) << 24));
        long j15 = j14 >>> 7;
        if (j15 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeInt(i15);
            this.niobuffer.order(this.byteOrder);
            this.position += 0;
            return 4;
        }
        long j16 = ((i15 | Integer.MIN_VALUE) & 4294967295L) | ((j15 & 127) << 32);
        long j17 = j15 >>> 7;
        if (j17 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j16);
            this.niobuffer.order(this.byteOrder);
            int i16 = this.position - 3;
            this.position = i16;
            this.niobuffer.position(i16);
            return 5;
        }
        long j18 = j16 | 549755813888L | ((j17 & 127) << 40);
        long j19 = j17 >>> 7;
        if (j19 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j18);
            this.niobuffer.order(this.byteOrder);
            int i17 = this.position - 2;
            this.position = i17;
            this.niobuffer.position(i17);
            return 6;
        }
        long j20 = j18 | 140737488355328L | ((j19 & 127) << 48);
        long j21 = j19 >>> 7;
        if (j21 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j20);
            this.niobuffer.order(this.byteOrder);
            int i18 = this.position - 1;
            this.position = i18;
            this.niobuffer.position(i18);
            return 7;
        }
        long j22 = ((127 & j21) << 56) | j20 | 36028797018963968L;
        long j23 = j21 >>> 7;
        if (j23 == 0) {
            this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
            writeLong(j22);
            this.niobuffer.order(this.byteOrder);
            return 8;
        }
        this.niobuffer.order(ByteOrder.LITTLE_ENDIAN);
        writeLong(j22 | Long.MIN_VALUE);
        this.niobuffer.order(this.byteOrder);
        write((byte) j23);
        return 9;
    }

    public void order(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.niobuffer.order(byteOrder);
    }

    public void setBuffer(ByteBuffer byteBuffer, int i10) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        }
        if (i10 >= -1) {
            this.niobuffer = byteBuffer;
            if (i10 == -1) {
                i10 = 2147483639;
            }
            this.maxCapacity = i10;
            this.byteOrder = byteBuffer.order();
            this.capacity = byteBuffer.capacity();
            this.position = byteBuffer.position();
            this.total = 0L;
            this.outputStream = null;
            return;
        }
        throw new IllegalArgumentException(l.i("maxBufferSize cannot be < -1: ", i10));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int min = Math.min(this.capacity - this.position, i11);
            while (true) {
                this.niobuffer.put(bArr, i10, min);
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

    public ByteBufferOutput(int i10) {
        this(i10, i10);
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.niobuffer.put((byte) i10);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeDouble(double d10, double d11, boolean z10) throws KryoException {
        return writeLong((long) (d10 * d11), z10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeFloat(float f, float f10, boolean z10) throws KryoException {
        return writeInt((int) (f * f10), z10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeInt(int i10, boolean z10) throws KryoException {
        if (!this.varIntsEnabled) {
            writeInt(i10);
            return 4;
        }
        return writeVarInt(i10, z10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeLong(long j10, boolean z10) throws KryoException {
        if (!this.varIntsEnabled) {
            writeLong(j10);
            return 8;
        }
        return writeVarLong(j10, z10);
    }

    public ByteBufferOutput(int i10, int i11) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        if (i11 >= -1) {
            this.capacity = i10;
            this.maxCapacity = i11 == -1 ? 2147483639 : i11;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
            this.niobuffer = allocateDirect;
            allocateDirect.order(this.byteOrder);
            return;
        }
        throw new IllegalArgumentException(l.i("maxBufferSize cannot be < -1: ", i11));
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws KryoException {
        writeBytes(bArr, i10, i11);
    }

    public ByteBufferOutput(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }

    @Override // com.esotericsoftware.kryo.io.Output
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
            while (i12 < length) {
                char charAt = charSequence.charAt(i12);
                if (charAt > 127) {
                    break;
                }
                this.niobuffer.put(i11, (byte) charAt);
                i12++;
                i11++;
            }
            this.position = i11;
            this.niobuffer.position(i11);
        }
        if (i12 < length) {
            writeString_slow(charSequence, length, i12);
        }
        this.niobuffer.position(this.position);
    }

    public ByteBufferOutput(OutputStream outputStream, int i10) {
        this(i10, i10);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }

    public ByteBufferOutput(ByteBuffer byteBuffer) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer);
    }

    public ByteBufferOutput(ByteBuffer byteBuffer, int i10) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer, i10);
    }

    public ByteBufferOutput(long j10, int i10) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer directBufferAt = UnsafeUtil.getDirectBufferAt(j10, i10);
        this.niobuffer = directBufferAt;
        setBuffer(directBufferAt, i10);
    }
}
