package com.esotericsoftware.kryo.io;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class ByteBufferInput extends Input {
    protected static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    ByteOrder byteOrder;
    protected ByteBuffer niobuffer;
    protected boolean varIntsEnabled;

    public ByteBufferInput() {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
    }

    private boolean isNativeOrder() {
        if (this.byteOrder == nativeOrder) {
            return true;
        }
        return false;
    }

    private int optional(int i10) throws KryoException {
        int i11 = this.limit - this.position;
        if (i11 >= i10) {
            return i10;
        }
        int min = Math.min(i10, this.capacity);
        ByteBuffer byteBuffer = this.niobuffer;
        int i12 = this.limit;
        int fill = fill(byteBuffer, i12, this.capacity - i12);
        if (fill == -1) {
            if (i11 == 0) {
                return -1;
            }
            return Math.min(i11, min);
        }
        int i13 = i11 + fill;
        if (i13 >= min) {
            this.limit += fill;
            return min;
        }
        this.niobuffer.compact();
        this.total += this.position;
        this.position = 0;
        do {
            int fill2 = fill(this.niobuffer, i13, this.capacity - i13);
            if (fill2 == -1) {
                break;
            }
            i13 += fill2;
        } while (i13 < min);
        this.limit = i13;
        this.niobuffer.position(this.position);
        if (i13 == 0) {
            return -1;
        }
        return Math.min(i13, min);
    }

    private String readAscii() {
        int i10 = this.position;
        int i11 = i10 - 1;
        int i12 = this.limit;
        while (i10 != i12) {
            i10++;
            if ((this.niobuffer.get() & 128) != 0) {
                ByteBuffer byteBuffer = this.niobuffer;
                int i13 = i10 - 1;
                byteBuffer.put(i13, (byte) (byteBuffer.get(i13) & Ascii.DEL));
                int i14 = i10 - i11;
                byte[] bArr = new byte[i14];
                this.niobuffer.position(i11);
                this.niobuffer.get(bArr);
                String str = new String(bArr, 0, 0, i14);
                ByteBuffer byteBuffer2 = this.niobuffer;
                byteBuffer2.put(i13, (byte) (byteBuffer2.get(i13) | 128));
                this.position = i10;
                this.niobuffer.position(i10);
                return str;
            }
        }
        return readAscii_slow();
    }

    private String readAscii_slow() {
        int i10 = this.position - 1;
        this.position = i10;
        int i11 = this.limit;
        int i12 = i11 - i10;
        if (i12 > this.chars.length) {
            this.chars = new char[i12 * 2];
        }
        char[] cArr = this.chars;
        int i13 = 0;
        while (i10 < i11) {
            cArr[i13] = (char) this.niobuffer.get(i10);
            i10++;
            i13++;
        }
        this.position = this.limit;
        while (true) {
            require(1);
            this.position++;
            byte b10 = this.niobuffer.get();
            if (i12 == cArr.length) {
                char[] cArr2 = new char[i12 * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i12);
                this.chars = cArr2;
                cArr = cArr2;
            }
            if ((b10 & 128) == 128) {
                cArr[i12] = (char) (b10 & Ascii.DEL);
                return new String(cArr, 0, i12 + 1);
            }
            cArr[i12] = (char) b10;
            i12++;
        }
    }

    private int readInt_slow(boolean z10) {
        this.position++;
        byte b10 = this.niobuffer.get();
        int i10 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            require(1);
            this.position++;
            byte b11 = this.niobuffer.get();
            i10 |= (b11 & Ascii.DEL) << 7;
            if ((b11 & 128) != 0) {
                require(1);
                this.position++;
                byte b12 = this.niobuffer.get();
                i10 |= (b12 & Ascii.DEL) << 14;
                if ((b12 & 128) != 0) {
                    require(1);
                    this.position++;
                    byte b13 = this.niobuffer.get();
                    i10 |= (b13 & Ascii.DEL) << 21;
                    if ((b13 & 128) != 0) {
                        require(1);
                        this.position++;
                        i10 |= (this.niobuffer.get() & Ascii.DEL) << 28;
                    }
                }
            }
        }
        if (!z10) {
            return (i10 >>> 1) ^ (-(i10 & 1));
        }
        return i10;
    }

    private long readLong_slow(boolean z10) {
        this.position++;
        byte b10 = this.niobuffer.get();
        long j10 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            require(1);
            this.position++;
            j10 |= (r0 & Ascii.DEL) << 7;
            if ((this.niobuffer.get() & 128) != 0) {
                require(1);
                this.position++;
                j10 |= (r0 & Ascii.DEL) << 14;
                if ((this.niobuffer.get() & 128) != 0) {
                    require(1);
                    this.position++;
                    j10 |= (r0 & Ascii.DEL) << 21;
                    if ((this.niobuffer.get() & 128) != 0) {
                        require(1);
                        this.position++;
                        j10 |= (r0 & Ascii.DEL) << 28;
                        if ((this.niobuffer.get() & 128) != 0) {
                            require(1);
                            this.position++;
                            j10 |= (r0 & Ascii.DEL) << 35;
                            if ((this.niobuffer.get() & 128) != 0) {
                                require(1);
                                this.position++;
                                j10 |= (r0 & Ascii.DEL) << 42;
                                if ((this.niobuffer.get() & 128) != 0) {
                                    require(1);
                                    this.position++;
                                    j10 |= (r0 & Ascii.DEL) << 49;
                                    if ((this.niobuffer.get() & 128) != 0) {
                                        require(1);
                                        this.position++;
                                        j10 |= this.niobuffer.get() << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z10) {
            return (-(j10 & 1)) ^ (j10 >>> 1);
        }
        return j10;
    }

    private void readUtf8(int i10) {
        char[] cArr = this.chars;
        int min = Math.min(require(1), i10);
        int i11 = this.position;
        int i12 = 0;
        while (true) {
            if (i12 >= min) {
                break;
            }
            i11++;
            byte b10 = this.niobuffer.get();
            if (b10 < 0) {
                i11--;
                break;
            } else {
                cArr[i12] = (char) b10;
                i12++;
            }
        }
        this.position = i11;
        if (i12 < i10) {
            this.niobuffer.position(i11);
            readUtf8_slow(i10, i12);
        }
    }

    private int readUtf8Length(int i10) {
        int i11 = i10 & 63;
        if ((i10 & 64) != 0) {
            this.position++;
            byte b10 = this.niobuffer.get();
            int i12 = i11 | ((b10 & Ascii.DEL) << 6);
            if ((b10 & 128) != 0) {
                this.position++;
                byte b11 = this.niobuffer.get();
                int i13 = i12 | ((b11 & Ascii.DEL) << 13);
                if ((b11 & 128) != 0) {
                    this.position++;
                    byte b12 = this.niobuffer.get();
                    int i14 = i13 | ((b12 & Ascii.DEL) << 20);
                    if ((b12 & 128) != 0) {
                        this.position++;
                        return i14 | ((this.niobuffer.get() & Ascii.DEL) << 27);
                    }
                    return i14;
                }
                return i13;
            }
            return i12;
        }
        return i11;
    }

    private int readUtf8Length_slow(int i10) {
        int i11 = i10 & 63;
        if ((i10 & 64) != 0) {
            require(1);
            this.position++;
            byte b10 = this.niobuffer.get();
            int i12 = i11 | ((b10 & Ascii.DEL) << 6);
            if ((b10 & 128) != 0) {
                require(1);
                this.position++;
                byte b11 = this.niobuffer.get();
                int i13 = i12 | ((b11 & Ascii.DEL) << 13);
                if ((b11 & 128) != 0) {
                    require(1);
                    this.position++;
                    byte b12 = this.niobuffer.get();
                    int i14 = i13 | ((b12 & Ascii.DEL) << 20);
                    if ((b12 & 128) != 0) {
                        require(1);
                        this.position++;
                        return i14 | ((this.niobuffer.get() & Ascii.DEL) << 27);
                    }
                    return i14;
                }
                return i13;
            }
            return i12;
        }
        return i11;
    }

    private void readUtf8_slow(int i10, int i11) {
        char[] cArr = this.chars;
        while (i11 < i10) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            int i12 = this.niobuffer.get() & DefaultClassResolver.NAME;
            switch (i12 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i11] = (char) i12;
                    break;
                case 12:
                case 13:
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    cArr[i11] = (char) (((i12 & 31) << 6) | (this.niobuffer.get() & 63));
                    break;
                case 14:
                    require(2);
                    this.position += 2;
                    cArr[i11] = (char) (((i12 & 15) << 12) | ((this.niobuffer.get() & 63) << 6) | (this.niobuffer.get() & 63));
                    break;
            }
            i11++;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean canReadInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        int i11 = i10 + 1;
        if ((this.niobuffer.get(i10) & 128) == 0) {
            return true;
        }
        if (i11 == this.limit) {
            return false;
        }
        int i12 = i11 + 1;
        if ((this.niobuffer.get(i11) & 128) == 0) {
            return true;
        }
        if (i12 == this.limit) {
            return false;
        }
        int i13 = i12 + 1;
        if ((this.niobuffer.get(i12) & 128) == 0) {
            return true;
        }
        if (i13 == this.limit) {
            return false;
        }
        int i14 = i13 + 1;
        if ((this.niobuffer.get(i13) & 128) == 0 || i14 != this.limit) {
            return true;
        }
        return false;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean canReadLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        int i11 = i10 + 1;
        if ((this.niobuffer.get(i10) & 128) == 0) {
            return true;
        }
        if (i11 == this.limit) {
            return false;
        }
        int i12 = i11 + 1;
        if ((this.niobuffer.get(i11) & 128) == 0) {
            return true;
        }
        if (i12 == this.limit) {
            return false;
        }
        int i13 = i12 + 1;
        if ((this.niobuffer.get(i12) & 128) == 0) {
            return true;
        }
        if (i13 == this.limit) {
            return false;
        }
        int i14 = i13 + 1;
        if ((this.niobuffer.get(i13) & 128) == 0) {
            return true;
        }
        if (i14 == this.limit) {
            return false;
        }
        int i15 = i14 + 1;
        if ((this.niobuffer.get(i14) & 128) == 0) {
            return true;
        }
        if (i15 == this.limit) {
            return false;
        }
        int i16 = i15 + 1;
        if ((this.niobuffer.get(i15) & 128) == 0) {
            return true;
        }
        if (i16 == this.limit) {
            return false;
        }
        int i17 = i16 + 1;
        if ((this.niobuffer.get(i16) & 128) == 0) {
            return true;
        }
        if (i17 == this.limit) {
            return false;
        }
        int i18 = i17 + 1;
        if ((this.niobuffer.get(i17) & 128) == 0 || i18 != this.limit) {
            return true;
        }
        return false;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public int fill(ByteBuffer byteBuffer, int i10, int i11) throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            byte[] bArr = new byte[i11];
            int read = inputStream.read(bArr, 0, i11);
            byteBuffer.position(i10);
            if (read >= 0) {
                byteBuffer.put(bArr, 0, read);
                byteBuffer.position(i10);
            }
            return read;
        } catch (IOException e10) {
            throw new KryoException(e10);
        }
    }

    public ByteBuffer getByteBuffer() {
        return this.niobuffer;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public InputStream getInputStream() {
        return this.inputStream;
    }

    public boolean getVarIntsEnabled() {
        return this.varIntsEnabled;
    }

    public ByteOrder order() {
        return this.byteOrder;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        this.niobuffer.position(this.position);
        this.position++;
        return this.niobuffer.get() & DefaultClassResolver.NAME;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() throws KryoException {
        require(1);
        this.position++;
        if (this.niobuffer.get() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte readByte() throws KryoException {
        this.niobuffer.position(this.position);
        require(1);
        this.position++;
        return this.niobuffer.get();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() throws KryoException {
        require(1);
        this.position++;
        return this.niobuffer.get() & DefaultClassResolver.NAME;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte[] readBytes(int i10) throws KryoException {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0, i10);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char readChar() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getChar();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i10) throws KryoException {
        int i11 = i10 * 2;
        if (this.capacity - this.position >= i11 && isNativeOrder()) {
            char[] cArr = new char[i10];
            this.niobuffer.asCharBuffer().get(cArr);
            int i12 = this.position + i11;
            this.position = i12;
            this.niobuffer.position(i12);
            return cArr;
        }
        return super.readChars(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble() throws KryoException {
        require(8);
        this.position += 8;
        return this.niobuffer.getDouble();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i10) throws KryoException {
        int i11 = i10 * 8;
        if (this.capacity - this.position >= i11 && isNativeOrder()) {
            double[] dArr = new double[i10];
            this.niobuffer.asDoubleBuffer().get(dArr);
            int i12 = this.position + i11;
            this.position = i12;
            this.niobuffer.position(i12);
            return dArr;
        }
        return super.readDoubles(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat() throws KryoException {
        require(4);
        this.position += 4;
        return this.niobuffer.getFloat();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i10) throws KryoException {
        int i11 = i10 * 4;
        if (this.capacity - this.position >= i11 && isNativeOrder()) {
            float[] fArr = new float[i10];
            this.niobuffer.asFloatBuffer().get(fArr);
            int i12 = this.position + i11;
            this.position = i12;
            this.niobuffer.position(i12);
            return fArr;
        }
        return super.readFloats(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt() throws KryoException {
        require(4);
        this.position += 4;
        return this.niobuffer.getInt();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i10) throws KryoException {
        int i11 = i10 * 4;
        if (this.capacity - this.position >= i11 && isNativeOrder()) {
            int[] iArr = new int[i10];
            this.niobuffer.asIntBuffer().get(iArr);
            int i12 = this.position + i11;
            this.position = i12;
            this.niobuffer.position(i12);
            return iArr;
        }
        return super.readInts(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong() throws KryoException {
        require(8);
        this.position += 8;
        return this.niobuffer.getLong();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i10) throws KryoException {
        int i11 = i10 * 8;
        if (this.capacity - this.position >= i11 && isNativeOrder()) {
            long[] jArr = new long[i10];
            this.niobuffer.asLongBuffer().get(jArr);
            int i12 = this.position + i11;
            this.position = i12;
            this.niobuffer.position(i12);
            return jArr;
        }
        return super.readLongs(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short readShort() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getShort();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readShortUnsigned() throws KryoException {
        require(2);
        this.position += 2;
        return this.niobuffer.getShort();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i10) throws KryoException {
        int i11 = i10 * 2;
        if (this.capacity - this.position >= i11 && isNativeOrder()) {
            short[] sArr = new short[i10];
            this.niobuffer.asShortBuffer().get(sArr);
            int i12 = this.position + i11;
            this.position = i12;
            this.niobuffer.position(i12);
            return sArr;
        }
        return super.readShorts(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public String readString() {
        int readUtf8Length_slow;
        this.niobuffer.position(this.position);
        int require = require(1);
        this.position++;
        byte b10 = this.niobuffer.get();
        if ((b10 & 128) == 0) {
            return readAscii();
        }
        if (require >= 5) {
            readUtf8Length_slow = readUtf8Length(b10);
        } else {
            readUtf8Length_slow = readUtf8Length_slow(b10);
        }
        if (readUtf8Length_slow != 0) {
            if (readUtf8Length_slow != 1) {
                int i10 = readUtf8Length_slow - 1;
                if (this.chars.length < i10) {
                    this.chars = new char[i10];
                }
                readUtf8(i10);
                return new String(this.chars, 0, i10);
            }
            return "";
        }
        return null;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public StringBuilder readStringBuilder() {
        int readUtf8Length_slow;
        this.niobuffer.position(this.position);
        int require = require(1);
        this.position++;
        byte b10 = this.niobuffer.get();
        if ((b10 & 128) == 0) {
            return new StringBuilder(readAscii());
        }
        if (require >= 5) {
            readUtf8Length_slow = readUtf8Length(b10);
        } else {
            readUtf8Length_slow = readUtf8Length_slow(b10);
        }
        if (readUtf8Length_slow != 0) {
            if (readUtf8Length_slow != 1) {
                int i10 = readUtf8Length_slow - 1;
                if (this.chars.length < i10) {
                    this.chars = new char[i10];
                }
                readUtf8(i10);
                StringBuilder sb2 = new StringBuilder(i10);
                sb2.append(this.chars, 0, i10);
                return sb2;
            }
            return new StringBuilder("");
        }
        return null;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readVarInt(boolean z10) throws KryoException {
        this.niobuffer.position(this.position);
        if (require(1) < 5) {
            return readInt_slow(z10);
        }
        this.position++;
        byte b10 = this.niobuffer.get();
        int i10 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            this.position++;
            byte b11 = this.niobuffer.get();
            i10 |= (b11 & Ascii.DEL) << 7;
            if ((b11 & 128) != 0) {
                this.position++;
                byte b12 = this.niobuffer.get();
                i10 |= (b12 & Ascii.DEL) << 14;
                if ((b12 & 128) != 0) {
                    this.position++;
                    byte b13 = this.niobuffer.get();
                    i10 |= (b13 & Ascii.DEL) << 21;
                    if ((b13 & 128) != 0) {
                        this.position++;
                        i10 |= (this.niobuffer.get() & Ascii.DEL) << 28;
                    }
                }
            }
        }
        if (!z10) {
            return (i10 >>> 1) ^ (-(i10 & 1));
        }
        return i10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readVarLong(boolean z10) throws KryoException {
        this.niobuffer.position(this.position);
        if (require(1) < 9) {
            return readLong_slow(z10);
        }
        this.position++;
        byte b10 = this.niobuffer.get();
        long j10 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            this.position++;
            j10 |= (r1 & Ascii.DEL) << 7;
            if ((this.niobuffer.get() & 128) != 0) {
                this.position++;
                j10 |= (r1 & Ascii.DEL) << 14;
                if ((this.niobuffer.get() & 128) != 0) {
                    this.position++;
                    j10 |= (r1 & Ascii.DEL) << 21;
                    if ((this.niobuffer.get() & 128) != 0) {
                        this.position++;
                        j10 |= (r1 & Ascii.DEL) << 28;
                        if ((this.niobuffer.get() & 128) != 0) {
                            this.position++;
                            j10 |= (r1 & Ascii.DEL) << 35;
                            if ((this.niobuffer.get() & 128) != 0) {
                                this.position++;
                                j10 |= (r1 & Ascii.DEL) << 42;
                                if ((this.niobuffer.get() & 128) != 0) {
                                    this.position++;
                                    j10 |= (r1 & Ascii.DEL) << 49;
                                    if ((this.niobuffer.get() & 128) != 0) {
                                        this.position++;
                                        j10 |= this.niobuffer.get() << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z10) {
            return (-(j10 & 1)) ^ (j10 >>> 1);
        }
        return j10;
    }

    public void release() {
        close();
        UnsafeUtil.releaseBuffer(this.niobuffer);
        this.niobuffer = null;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public final int require(int i10) throws KryoException {
        int i11 = this.limit;
        int i12 = i11 - this.position;
        if (i12 >= i10) {
            return i12;
        }
        int i13 = this.capacity;
        if (i10 <= i13) {
            if (i12 > 0) {
                int fill = fill(this.niobuffer, i11, i13 - i11);
                if (fill != -1) {
                    i12 += fill;
                    if (i12 >= i10) {
                        this.limit += fill;
                        return i12;
                    }
                } else {
                    throw new KryoException("Buffer underflow.");
                }
            }
            this.niobuffer.position(this.position);
            this.niobuffer.compact();
            this.total += this.position;
            this.position = 0;
            while (true) {
                int fill2 = fill(this.niobuffer, i12, this.capacity - i12);
                if (fill2 == -1) {
                    if (i12 < i10) {
                        throw new KryoException("Buffer underflow.");
                    }
                } else {
                    i12 += fill2;
                    if (i12 >= i10) {
                        break;
                    }
                }
            }
            this.limit = i12;
            this.niobuffer.position(0);
            return i12;
        }
        throw new KryoException("Buffer too small: capacity: " + this.capacity + ", required: " + i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void rewind() {
        super.rewind();
        this.niobuffer.position(0);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        allocateDirect.limit(bArr.length);
        allocateDirect.order(this.byteOrder);
        setBuffer(allocateDirect);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        rewind();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setLimit(int i10) {
        this.limit = i10;
        this.niobuffer.limit(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setPosition(int i10) {
        this.position = i10;
        this.niobuffer.position(i10);
    }

    public void setVarIntsEnabled(boolean z10) {
        this.varIntsEnabled = z10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void skip(int i10) throws KryoException {
        super.skip(i10);
        this.niobuffer.position(position());
    }

    public void order(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr) throws KryoException {
        readBytes(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public long skip(long j10) throws KryoException {
        long j11 = j10;
        while (j11 > 0) {
            int min = (int) Math.min(2147483639L, j11);
            skip(min);
            j11 -= min;
        }
        return j10;
    }

    public ByteBufferInput(int i10) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        this.capacity = i10;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
        this.niobuffer = allocateDirect;
        allocateDirect.order(this.byteOrder);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int min = Math.min(this.limit - this.position, i11);
            while (true) {
                this.niobuffer.get(bArr, i10, min);
                this.position += min;
                i11 -= min;
                if (i11 == 0) {
                    return;
                }
                i10 += min;
                min = Math.min(i11, this.capacity);
                require(min);
            }
        } else {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble(double d10, boolean z10) throws KryoException {
        return readLong(z10) / d10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat(float f, boolean z10) throws KryoException {
        return readInt(z10) / f;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt(boolean z10) throws KryoException {
        if (this.varIntsEnabled) {
            return readVarInt(z10);
        }
        return readInt();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong(boolean z10) throws KryoException {
        if (this.varIntsEnabled) {
            return readVarLong(z10);
        }
        return readLong();
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read(byte[] bArr) throws KryoException {
        this.niobuffer.position(this.position);
        return read(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws KryoException {
        this.niobuffer.position(this.position);
        if (bArr != null) {
            int min = Math.min(this.limit - this.position, i11);
            int i12 = i11;
            while (true) {
                this.niobuffer.get(bArr, i10, min);
                this.position += min;
                i12 -= min;
                if (i12 == 0) {
                    break;
                }
                i10 += min;
                min = optional(i12);
                if (min == -1) {
                    if (i11 == i12) {
                        return -1;
                    }
                } else if (this.position == this.limit) {
                    break;
                }
            }
            return i11 - i12;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.niobuffer = byteBuffer;
            this.position = byteBuffer.position();
            this.limit = byteBuffer.limit();
            this.capacity = byteBuffer.capacity();
            this.byteOrder = byteBuffer.order();
            this.total = 0L;
            this.inputStream = null;
            return;
        }
        throw new IllegalArgumentException("buffer cannot be null.");
    }

    public ByteBufferInput(byte[] bArr) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(bArr);
    }

    public ByteBufferInput(ByteBuffer byteBuffer) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(byteBuffer);
    }

    public ByteBufferInput(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }

    public ByteBufferInput(InputStream inputStream, int i10) {
        this(i10);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }

    public ByteBufferInput(long j10, int i10) {
        this.varIntsEnabled = true;
        this.byteOrder = ByteOrder.BIG_ENDIAN;
        setBuffer(UnsafeUtil.getDirectBufferAt(j10, i10));
    }
}
