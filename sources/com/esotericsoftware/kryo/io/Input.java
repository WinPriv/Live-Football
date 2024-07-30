package com.esotericsoftware.kryo.io;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class Input extends InputStream {
    protected byte[] buffer;
    protected int capacity;
    protected char[] chars;
    protected InputStream inputStream;
    protected int limit;
    protected int position;
    protected long total;

    public Input() {
        this.chars = new char[32];
    }

    private int optional(int i10) throws KryoException {
        int i11 = this.limit - this.position;
        if (i11 >= i10) {
            return i10;
        }
        int min = Math.min(i10, this.capacity);
        byte[] bArr = this.buffer;
        int i12 = this.limit;
        int fill = fill(bArr, i12, this.capacity - i12);
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
        byte[] bArr2 = this.buffer;
        System.arraycopy(bArr2, this.position, bArr2, 0, i13);
        this.total += this.position;
        this.position = 0;
        do {
            int fill2 = fill(this.buffer, i13, this.capacity - i13);
            if (fill2 == -1) {
                break;
            }
            i13 += fill2;
        } while (i13 < min);
        this.limit = i13;
        if (i13 == 0) {
            return -1;
        }
        return Math.min(i13, min);
    }

    private String readAscii() {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 - 1;
        int i12 = this.limit;
        while (i10 != i12) {
            int i13 = i10 + 1;
            if ((bArr[i10] & 128) != 0) {
                int i14 = i13 - 1;
                bArr[i14] = (byte) (bArr[i14] & Ascii.DEL);
                String str = new String(bArr, 0, i11, i13 - i11);
                bArr[i14] = (byte) (bArr[i14] | 128);
                this.position = i13;
                return str;
            }
            i10 = i13;
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
        byte[] bArr = this.buffer;
        int i13 = 0;
        while (i10 < i11) {
            cArr[i13] = (char) bArr[i10];
            i10++;
            i13++;
        }
        this.position = this.limit;
        while (true) {
            require(1);
            int i14 = this.position;
            this.position = i14 + 1;
            byte b10 = bArr[i14];
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
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        byte b10 = bArr[i10];
        int i11 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            require(1);
            byte[] bArr2 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            byte b11 = bArr2[i12];
            i11 |= (b11 & Ascii.DEL) << 7;
            if ((b11 & 128) != 0) {
                require(1);
                int i13 = this.position;
                this.position = i13 + 1;
                byte b12 = bArr2[i13];
                i11 |= (b12 & Ascii.DEL) << 14;
                if ((b12 & 128) != 0) {
                    require(1);
                    int i14 = this.position;
                    this.position = i14 + 1;
                    byte b13 = bArr2[i14];
                    i11 |= (b13 & Ascii.DEL) << 21;
                    if ((b13 & 128) != 0) {
                        require(1);
                        int i15 = this.position;
                        this.position = i15 + 1;
                        i11 |= (bArr2[i15] & Ascii.DEL) << 28;
                    }
                }
            }
        }
        if (!z10) {
            return (i11 >>> 1) ^ (-(i11 & 1));
        }
        return i11;
    }

    private long readLong_slow(boolean z10) {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        byte b10 = bArr[i10];
        long j10 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            require(1);
            byte[] bArr2 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            j10 |= (r4 & Ascii.DEL) << 7;
            if ((bArr2[i11] & 128) != 0) {
                require(1);
                int i12 = this.position;
                this.position = i12 + 1;
                j10 |= (r4 & Ascii.DEL) << 14;
                if ((bArr2[i12] & 128) != 0) {
                    require(1);
                    int i13 = this.position;
                    this.position = i13 + 1;
                    j10 |= (r4 & Ascii.DEL) << 21;
                    if ((bArr2[i13] & 128) != 0) {
                        require(1);
                        int i14 = this.position;
                        this.position = i14 + 1;
                        j10 |= (r4 & Ascii.DEL) << 28;
                        if ((bArr2[i14] & 128) != 0) {
                            require(1);
                            int i15 = this.position;
                            this.position = i15 + 1;
                            j10 |= (r4 & Ascii.DEL) << 35;
                            if ((bArr2[i15] & 128) != 0) {
                                require(1);
                                int i16 = this.position;
                                this.position = i16 + 1;
                                j10 |= (r4 & Ascii.DEL) << 42;
                                if ((bArr2[i16] & 128) != 0) {
                                    require(1);
                                    int i17 = this.position;
                                    this.position = i17 + 1;
                                    j10 |= (r4 & Ascii.DEL) << 49;
                                    if ((bArr2[i17] & 128) != 0) {
                                        require(1);
                                        this.position = this.position + 1;
                                        j10 |= bArr2[r4] << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z10) {
            return (j10 >>> 1) ^ (-(j10 & 1));
        }
        return j10;
    }

    private void readUtf8(int i10) {
        byte[] bArr = this.buffer;
        char[] cArr = this.chars;
        int min = Math.min(require(1), i10);
        int i11 = this.position;
        int i12 = 0;
        while (true) {
            if (i12 >= min) {
                break;
            }
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                i11 = i13 - 1;
                break;
            } else {
                cArr[i12] = (char) b10;
                i11 = i13;
                i12++;
            }
        }
        this.position = i11;
        if (i12 < i10) {
            readUtf8_slow(i10, i12);
        }
    }

    private int readUtf8Length(int i10) {
        int i11 = i10 & 63;
        if ((i10 & 64) != 0) {
            byte[] bArr = this.buffer;
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            byte b10 = bArr[i12];
            int i14 = i11 | ((b10 & Ascii.DEL) << 6);
            if ((b10 & 128) != 0) {
                int i15 = i13 + 1;
                this.position = i15;
                byte b11 = bArr[i13];
                int i16 = i14 | ((b11 & Ascii.DEL) << 13);
                if ((b11 & 128) != 0) {
                    int i17 = i15 + 1;
                    this.position = i17;
                    byte b12 = bArr[i15];
                    int i18 = i16 | ((b12 & Ascii.DEL) << 20);
                    if ((b12 & 128) != 0) {
                        this.position = i17 + 1;
                        return i18 | ((bArr[i17] & Ascii.DEL) << 27);
                    }
                    return i18;
                }
                return i16;
            }
            return i14;
        }
        return i11;
    }

    private int readUtf8Length_slow(int i10) {
        int i11 = i10 & 63;
        if ((i10 & 64) != 0) {
            require(1);
            byte[] bArr = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            byte b10 = bArr[i12];
            int i13 = i11 | ((b10 & Ascii.DEL) << 6);
            if ((b10 & 128) != 0) {
                require(1);
                int i14 = this.position;
                this.position = i14 + 1;
                byte b11 = bArr[i14];
                int i15 = i13 | ((b11 & Ascii.DEL) << 13);
                if ((b11 & 128) != 0) {
                    require(1);
                    int i16 = this.position;
                    this.position = i16 + 1;
                    byte b12 = bArr[i16];
                    int i17 = i15 | ((b12 & Ascii.DEL) << 20);
                    if ((b12 & 128) != 0) {
                        require(1);
                        int i18 = this.position;
                        this.position = i18 + 1;
                        return i17 | ((bArr[i18] & Ascii.DEL) << 27);
                    }
                    return i17;
                }
                return i15;
            }
            return i13;
        }
        return i11;
    }

    private void readUtf8_slow(int i10, int i11) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (i11 < i10) {
            if (this.position == this.limit) {
                require(1);
            }
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            int i14 = bArr[i12] & DefaultClassResolver.NAME;
            switch (i14 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i11] = (char) i14;
                    break;
                case 12:
                case 13:
                    if (i13 == this.limit) {
                        require(1);
                    }
                    int i15 = this.position;
                    this.position = i15 + 1;
                    cArr[i11] = (char) (((i14 & 31) << 6) | (bArr[i15] & 63));
                    break;
                case 14:
                    require(2);
                    int i16 = this.position;
                    int i17 = i16 + 1;
                    int i18 = ((i14 & 15) << 12) | ((bArr[i16] & 63) << 6);
                    this.position = i17 + 1;
                    cArr[i11] = (char) (i18 | (bArr[i17] & 63));
                    break;
            }
            i11++;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i10;
        int i11 = this.limit - this.position;
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            i10 = inputStream.available();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public boolean canReadInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        byte[] bArr = this.buffer;
        int i11 = i10 + 1;
        if ((bArr[i10] & 128) == 0) {
            return true;
        }
        int i12 = this.limit;
        if (i11 == i12) {
            return false;
        }
        int i13 = i11 + 1;
        if ((bArr[i11] & 128) == 0) {
            return true;
        }
        if (i13 == i12) {
            return false;
        }
        int i14 = i13 + 1;
        if ((bArr[i13] & 128) == 0) {
            return true;
        }
        if (i14 == i12) {
            return false;
        }
        int i15 = i14 + 1;
        if ((bArr[i14] & 128) == 0 || i15 != i12) {
            return true;
        }
        return false;
    }

    public boolean canReadLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        byte[] bArr = this.buffer;
        int i11 = i10 + 1;
        if ((bArr[i10] & 128) == 0) {
            return true;
        }
        int i12 = this.limit;
        if (i11 == i12) {
            return false;
        }
        int i13 = i11 + 1;
        if ((bArr[i11] & 128) == 0) {
            return true;
        }
        if (i13 == i12) {
            return false;
        }
        int i14 = i13 + 1;
        if ((bArr[i13] & 128) == 0) {
            return true;
        }
        if (i14 == i12) {
            return false;
        }
        int i15 = i14 + 1;
        if ((bArr[i14] & 128) == 0) {
            return true;
        }
        if (i15 == i12) {
            return false;
        }
        int i16 = i15 + 1;
        if ((bArr[i15] & 128) == 0) {
            return true;
        }
        if (i16 == i12) {
            return false;
        }
        int i17 = i16 + 1;
        if ((bArr[i16] & 128) == 0) {
            return true;
        }
        if (i17 == i12) {
            return false;
        }
        int i18 = i17 + 1;
        if ((bArr[i17] & 128) == 0) {
            return true;
        }
        if (i18 == i12) {
            return false;
        }
        int i19 = i18 + 1;
        if ((bArr[i18] & 128) == 0 || i19 != i12) {
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public boolean eof() {
        if (optional(1) <= 0) {
            return true;
        }
        return false;
    }

    public int fill(byte[] bArr, int i10, int i11) throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (IOException e10) {
            throw new KryoException(e10);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public int limit() {
        return this.limit;
    }

    public int position() {
        return this.position;
    }

    @Override // java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & DefaultClassResolver.NAME;
    }

    public boolean readBoolean() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        if (bArr[i10] == 1) {
            return true;
        }
        return false;
    }

    public byte readByte() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10];
    }

    public int readByteUnsigned() throws KryoException {
        require(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & DefaultClassResolver.NAME;
    }

    public byte[] readBytes(int i10) throws KryoException {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0, i10);
        return bArr;
    }

    public char readChar() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.position = i11 + 1;
        return (char) ((bArr[i11] & DefaultClassResolver.NAME) | i12);
    }

    public char[] readChars(int i10) throws KryoException {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = readChar();
        }
        return cArr;
    }

    public double readDouble() throws KryoException {
        return Double.longBitsToDouble(readLong());
    }

    public double[] readDoubles(int i10) throws KryoException {
        double[] dArr = new double[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            dArr[i11] = readDouble();
        }
        return dArr;
    }

    public float readFloat() throws KryoException {
        return Float.intBitsToFloat(readInt());
    }

    public float[] readFloats(int i10) throws KryoException {
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[i11] = readFloat();
        }
        return fArr;
    }

    public int readInt() throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 4;
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }

    public int[] readInts(int i10, boolean z10) throws KryoException {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = readInt(z10);
        }
        return iArr;
    }

    public long readLong() throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        long j10 = bArr[r2] << 56;
        int i10 = this.position + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r3] & DefaultClassResolver.NAME) << 48) | ((bArr[r2] & DefaultClassResolver.NAME) << 40);
        long j12 = j11 | ((bArr[i10] & DefaultClassResolver.NAME) << 32);
        long j13 = j12 | ((bArr[r4] & DefaultClassResolver.NAME) << 24);
        long j14 = j13 | ((bArr[r5] & DefaultClassResolver.NAME) << 16);
        long j15 = j14 | ((bArr[r4] & DefaultClassResolver.NAME) << 8);
        this.position = i10 + 1 + 1 + 1 + 1 + 1;
        return (bArr[r5] & DefaultClassResolver.NAME) | j15;
    }

    public long[] readLongs(int i10, boolean z10) throws KryoException {
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = readLong(z10);
        }
        return jArr;
    }

    public short readShort() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.position = i11 + 1;
        return (short) ((bArr[i11] & DefaultClassResolver.NAME) | i12);
    }

    public int readShortUnsigned() throws KryoException {
        require(2);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        this.position = i11 + 1;
        return (bArr[i11] & DefaultClassResolver.NAME) | i12;
    }

    public short[] readShorts(int i10) throws KryoException {
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = readShort();
        }
        return sArr;
    }

    public String readString() {
        int readUtf8Length_slow;
        int require = require(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        byte b10 = bArr[i10];
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
                int i11 = readUtf8Length_slow - 1;
                if (this.chars.length < i11) {
                    this.chars = new char[i11];
                }
                readUtf8(i11);
                return new String(this.chars, 0, i11);
            }
            return "";
        }
        return null;
    }

    public StringBuilder readStringBuilder() {
        int readUtf8Length_slow;
        int require = require(1);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        byte b10 = bArr[i10];
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
                int i11 = readUtf8Length_slow - 1;
                if (this.chars.length < i11) {
                    this.chars = new char[i11];
                }
                readUtf8(i11);
                StringBuilder sb2 = new StringBuilder(i11);
                sb2.append(this.chars, 0, i11);
                return sb2;
            }
            return new StringBuilder("");
        }
        return null;
    }

    public int readVarInt(boolean z10) throws KryoException {
        if (require(1) < 5) {
            return readInt_slow(z10);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        int i12 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            int i13 = i11 + 1;
            this.position = i13;
            byte b11 = bArr[i11];
            i12 |= (b11 & Ascii.DEL) << 7;
            if ((b11 & 128) != 0) {
                int i14 = i13 + 1;
                this.position = i14;
                byte b12 = bArr[i13];
                i12 |= (b12 & Ascii.DEL) << 14;
                if ((b12 & 128) != 0) {
                    int i15 = i14 + 1;
                    this.position = i15;
                    byte b13 = bArr[i14];
                    i12 |= (b13 & Ascii.DEL) << 21;
                    if ((b13 & 128) != 0) {
                        this.position = i15 + 1;
                        i12 |= (bArr[i15] & Ascii.DEL) << 28;
                    }
                }
            }
        }
        if (!z10) {
            return (i12 >>> 1) ^ (-(i12 & 1));
        }
        return i12;
    }

    public long readVarLong(boolean z10) throws KryoException {
        if (require(1) < 9) {
            return readLong_slow(z10);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        long j10 = b10 & Ascii.DEL;
        if ((b10 & 128) != 0) {
            int i12 = i11 + 1;
            this.position = i12;
            j10 |= (r3 & Ascii.DEL) << 7;
            if ((bArr[i11] & 128) != 0) {
                int i13 = i12 + 1;
                this.position = i13;
                j10 |= (r2 & Ascii.DEL) << 14;
                if ((bArr[i12] & 128) != 0) {
                    int i14 = i13 + 1;
                    this.position = i14;
                    j10 |= (r3 & Ascii.DEL) << 21;
                    if ((bArr[i13] & 128) != 0) {
                        int i15 = i14 + 1;
                        this.position = i15;
                        j10 |= (r2 & Ascii.DEL) << 28;
                        if ((bArr[i14] & 128) != 0) {
                            int i16 = i15 + 1;
                            this.position = i16;
                            j10 |= (r3 & Ascii.DEL) << 35;
                            if ((bArr[i15] & 128) != 0) {
                                int i17 = i16 + 1;
                                this.position = i17;
                                j10 |= (r2 & Ascii.DEL) << 42;
                                if ((bArr[i16] & 128) != 0) {
                                    int i18 = i17 + 1;
                                    this.position = i18;
                                    j10 |= (r3 & Ascii.DEL) << 49;
                                    if ((bArr[i17] & 128) != 0) {
                                        this.position = i18 + 1;
                                        j10 |= bArr[i18] << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z10) {
            return (j10 >>> 1) ^ (-(1 & j10));
        }
        return j10;
    }

    public int require(int i10) throws KryoException {
        int i11 = this.limit;
        int i12 = i11 - this.position;
        if (i12 >= i10) {
            return i12;
        }
        int i13 = this.capacity;
        if (i10 <= i13) {
            if (i12 > 0) {
                int fill = fill(this.buffer, i11, i13 - i11);
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
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, this.position, bArr, 0, i12);
            this.total += this.position;
            this.position = 0;
            while (true) {
                int fill2 = fill(this.buffer, i12, this.capacity - i12);
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
            return i12;
        }
        throw new KryoException("Buffer too small: capacity: " + this.capacity + ", required: " + i10);
    }

    public void rewind() {
        this.position = 0;
        this.total = 0L;
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, 0, bArr.length);
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        rewind();
    }

    public void setLimit(int i10) {
        this.limit = i10;
    }

    public void setPosition(int i10) {
        this.position = i10;
    }

    public void setTotal(long j10) {
        this.total = j10;
    }

    public void skip(int i10) throws KryoException {
        int min = Math.min(this.limit - this.position, i10);
        while (true) {
            this.position += min;
            i10 -= min;
            if (i10 == 0) {
                return;
            }
            min = Math.min(i10, this.capacity);
            require(min);
        }
    }

    public long total() {
        return this.total + this.position;
    }

    public double readDouble(double d10, boolean z10) throws KryoException {
        return readLong(z10) / d10;
    }

    public float readFloat(float f, boolean z10) throws KryoException {
        return readInt(z10) / f;
    }

    public void setBuffer(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            this.buffer = bArr;
            this.position = i10;
            this.limit = i10 + i11;
            this.capacity = bArr.length;
            this.total = 0L;
            this.inputStream = null;
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public Input(int i10) {
        this.chars = new char[32];
        this.capacity = i10;
        this.buffer = new byte[i10];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws KryoException {
        return read(bArr, 0, bArr.length);
    }

    public void readBytes(byte[] bArr) throws KryoException {
        readBytes(bArr, 0, bArr.length);
    }

    public int[] readInts(int i10) throws KryoException {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = readInt();
        }
        return iArr;
    }

    public long[] readLongs(int i10) throws KryoException {
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = readLong();
        }
        return jArr;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int min = Math.min(this.limit - this.position, i11);
            int i12 = i11;
            while (true) {
                System.arraycopy(this.buffer, this.position, bArr, i10, min);
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

    public void readBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int min = Math.min(this.limit - this.position, i11);
            while (true) {
                System.arraycopy(this.buffer, this.position, bArr, i10, min);
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

    public long readLong(boolean z10) throws KryoException {
        return readVarLong(z10);
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws KryoException {
        long j11 = j10;
        while (j11 > 0) {
            int min = (int) Math.min(2147483639L, j11);
            skip(min);
            j11 -= min;
        }
        return j10;
    }

    public int readInt(boolean z10) throws KryoException {
        return readVarInt(z10);
    }

    public Input(byte[] bArr) {
        this.chars = new char[32];
        setBuffer(bArr, 0, bArr.length);
    }

    public Input(byte[] bArr, int i10, int i11) {
        this.chars = new char[32];
        setBuffer(bArr, i10, i11);
    }

    public Input(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }

    public Input(InputStream inputStream, int i10) {
        this(i10);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }
}
