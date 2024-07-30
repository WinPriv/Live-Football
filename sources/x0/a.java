package x0;

import a3.k;
import a3.l;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import x0.b;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public final class a {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap<Integer, d>[] J;
    public static final HashMap<String, d>[] K;
    public static final HashSet<String> L;
    public static final HashMap<Integer, Integer> M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f36237a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f36238b;

    /* renamed from: c, reason: collision with root package name */
    public int f36239c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, c>[] f36240d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f36241e;
    public ByteOrder f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36242g;

    /* renamed from: h, reason: collision with root package name */
    public int f36243h;

    /* renamed from: i, reason: collision with root package name */
    public int f36244i;

    /* renamed from: j, reason: collision with root package name */
    public int f36245j;

    /* renamed from: k, reason: collision with root package name */
    public int f36246k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f36224l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List<Integer> f36225m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List<Integer> f36226n = Arrays.asList(2, 7, 4, 5);
    public static final int[] o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f36227p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f36228q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f36229r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f36230s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f36231t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f36232u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f36233v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f36234w = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f36235x = {101, 88, 73, 102};
    public static final byte[] y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f36236z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: w, reason: collision with root package name */
        public static final ByteOrder f36249w = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: x, reason: collision with root package name */
        public static final ByteOrder f36250x = ByteOrder.BIG_ENDIAN;

        /* renamed from: s, reason: collision with root package name */
        public final DataInputStream f36251s;

        /* renamed from: t, reason: collision with root package name */
        public ByteOrder f36252t;

        /* renamed from: u, reason: collision with root package name */
        public int f36253u;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f36254v;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f36251s.available();
        }

        public final void b(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                DataInputStream dataInputStream = this.f36251s;
                int i12 = i10 - i11;
                int skip = (int) dataInputStream.skip(i12);
                if (skip <= 0) {
                    if (this.f36254v == null) {
                        this.f36254v = new byte[8192];
                    }
                    skip = dataInputStream.read(this.f36254v, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException(l.j("Reached EOF while skipping ", i10, " bytes."));
                    }
                }
                i11 += skip;
            }
            this.f36253u += i11;
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f36253u++;
            return this.f36251s.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f36253u++;
            return this.f36251s.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f36253u++;
            int read = this.f36251s.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f36253u += 2;
            return this.f36251s.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f36253u += i11;
            this.f36251s.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f36253u += 4;
            DataInputStream dataInputStream = this.f36251s;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f36252t;
                if (byteOrder == f36249w) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f36250x) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f36252t);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f36253u += 8;
            DataInputStream dataInputStream = this.f36251s;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f36252t;
                if (byteOrder == f36249w) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f36250x) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f36252t);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f36253u += 2;
            DataInputStream dataInputStream = this.f36251s;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f36252t;
                if (byteOrder == f36249w) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f36250x) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f36252t);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f36253u += 2;
            return this.f36251s.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f36253u++;
            return this.f36251s.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f36253u += 2;
            DataInputStream dataInputStream = this.f36251s;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f36252t;
                if (byteOrder == f36249w) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f36250x) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f36252t);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f36252t = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f36251s = dataInputStream;
            dataInputStream.mark(0);
            this.f36253u = 0;
            this.f36252t = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.f36251s.read(bArr, i10, i11);
            this.f36253u += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f36253u += bArr.length;
            this.f36251s.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f36255a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36256b;

        /* renamed from: c, reason: collision with root package name */
        public final long f36257c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f36258d;

        public c(byte[] bArr, int i10, int i11) {
            this(-1L, bArr, i10, i11);
        }

        public static c a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.N);
            return new c(bytes, 2, bytes.length);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.E[4] * 1]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new c(wrap.array(), 4, 1);
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.E[5] * 1]);
            wrap.order(byteOrder);
            e eVar2 = eVarArr[0];
            wrap.putInt((int) eVar2.f36263a);
            wrap.putInt((int) eVar2.f36264b);
            return new c(wrap.array(), 5, 1);
        }

        public static c d(int i10, ByteOrder byteOrder) {
            int[] iArr = {i10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.E[3] * 1]);
            wrap.order(byteOrder);
            wrap.putShort((short) iArr[0]);
            return new c(wrap.array(), 3, 1);
        }

        public final double e(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Double.parseDouble((String) h10);
                }
                if (h10 instanceof long[]) {
                    if (((long[]) h10).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (h10 instanceof int[]) {
                    if (((int[]) h10).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (h10 instanceof e[]) {
                    e[] eVarArr = (e[]) h10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return eVar.f36263a / eVar.f36264b;
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int f(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Integer.parseInt((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String g(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(h10 instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) h10;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f36263a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f36264b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:89|(3:91|(2:92|(1:101)(2:94|(2:97|98)(1:96)))|(1:100))|102|(2:104|(6:113|114|115|116|117|118)(3:106|(2:108|109)(2:111|112)|110))|122|115|116|117|118) */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x012a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x012b, code lost:
        
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:360), block:B:159:0x0167 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [x0.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [x0.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.Serializable h(java.nio.ByteOrder r15) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.a.c.h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.D[this.f36255a]);
            sb2.append(", data length:");
            return com.ironsource.adapters.facebook.a.i(sb2, this.f36258d.length, ")");
        }

        public c(long j10, byte[] bArr, int i10, int i11) {
            this.f36255a = i10;
            this.f36256b = i11;
            this.f36257c = j10;
            this.f36258d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f36263a;

        /* renamed from: b, reason: collision with root package name */
        public final long f36264b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f36263a = 0L;
                this.f36264b = 1L;
            } else {
                this.f36263a = j10;
                this.f36264b = j11;
            }
        }

        public final String toString() {
            return this.f36263a + "/" + this.f36264b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", p.f9095b, 4), new d(256, "ImageWidth", 3, 4), new d(257, "ImageLength", 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, "StripOffsets", 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(com.anythink.expressad.foundation.g.a.aS, "RowsPerStrip", 3, 4), new d(com.anythink.expressad.foundation.g.a.aT, "StripByteCounts", 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aP, 3), new d("TransferFunction", 301, 3), new d("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, "PixelXDimension", 3, 4), new d(40963, "PixelYDimension", 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, "DefaultCropSize", 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, "GPSLatitude", 5, 10), new d("GPSLongitudeRef", 3, 2), new d(4, "GPSLongitude", 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", p.f9095b, 4), new d(256, "ThumbnailImageWidth", 3, 4), new d(257, "ThumbnailImageLength", 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, "StripOffsets", 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(com.anythink.expressad.foundation.g.a.aS, "RowsPerStrip", 3, 4), new d(com.anythink.expressad.foundation.g.a.aT, "StripByteCounts", 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aP, 3), new d("TransferFunction", 301, 3), new d("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, "DefaultCropSize", 3, 4)};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap<>();
        Charset forName = Charset.forName(com.anythink.expressad.exoplayer.b.f7301i);
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i10 < dVarArr6.length) {
                J[i10] = new HashMap<>();
                K[i10] = new HashMap<>();
                for (d dVar : dVarArr6[i10]) {
                    J[i10].put(Integer.valueOf(dVar.f36259a), dVar);
                    K[i10].put(dVar.f36260b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = M;
                d[] dVarArr7 = I;
                hashMap.put(Integer.valueOf(dVarArr7[0].f36259a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f36259a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f36259a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f36259a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f36259a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f36259a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(InputStream inputStream) throws IOException {
        boolean z10;
        d[][] dVarArr = H;
        this.f36240d = new HashMap[dVarArr.length];
        this.f36241e = new HashSet(dVarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            boolean z11 = inputStream instanceof AssetManager.AssetInputStream;
            boolean z12 = f36224l;
            if (z11) {
                this.f36238b = (AssetManager.AssetInputStream) inputStream;
                this.f36237a = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        if (z12) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f36238b = null;
                        this.f36237a = fileInputStream.getFD();
                    }
                }
                this.f36238b = null;
                this.f36237a = null;
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                try {
                    try {
                        this.f36240d[i10] = new HashMap<>();
                    } finally {
                        a();
                        if (z12) {
                            p();
                        }
                    }
                } catch (IOException | UnsupportedOperationException e10) {
                    if (z12) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    if (!z12) {
                        return;
                    }
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            int f10 = f(bufferedInputStream);
            this.f36239c = f10;
            if ((f10 == 4 || f10 == 9 || f10 == 13 || f10 == 14) ? false : true) {
                f fVar = new f(bufferedInputStream);
                int i11 = this.f36239c;
                if (i11 == 12) {
                    d(fVar);
                } else if (i11 == 7) {
                    g(fVar);
                } else if (i11 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.c(this.f36243h);
                u(fVar);
            } else {
                b bVar = new b(bufferedInputStream);
                int i12 = this.f36239c;
                if (i12 == 4) {
                    e(bVar, 0, 0);
                } else if (i12 == 13) {
                    h(bVar);
                } else if (i12 == 9) {
                    i(bVar);
                } else if (i12 == 14) {
                    l(bVar);
                }
            }
            a();
            if (!z12) {
                return;
            }
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static ByteOrder q(b bVar) throws IOException {
        short readShort = bVar.readShort();
        boolean z10 = f36224l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap<String, c>[] hashMapArr = this.f36240d;
        if (b10 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(b10));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0L, this.f));
        }
    }

    public final String b(String str) {
        c c10 = c(str);
        if (c10 != null) {
            if (!L.contains(str)) {
                return c10.g(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = c10.f36255a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) c10.h(this.f);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVar.f36263a) / ((float) eVar.f36264b))), Integer.valueOf((int) (((float) eVar2.f36263a) / ((float) eVar2.f36264b))), Integer.valueOf((int) (((float) eVar3.f36263a) / ((float) eVar3.f36264b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(c10.e(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f36224l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            c cVar = this.f36240d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String str;
        String str2;
        String str3;
        int i10;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    b.C0504b.a(mediaMetadataRetriever, new C0503a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap<String, c>[] hashMapArr = this.f36240d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str), this.f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i10 = 1;
                                } else {
                                    i10 = 8;
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.d(i10, this.f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.c(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i11 = parseInt2 + 6;
                                int i12 = parseInt3 - 6;
                                if (Arrays.equals(bArr, O)) {
                                    byte[] bArr2 = new byte[i12];
                                    if (fVar.read(bArr2) == i12) {
                                        this.f36243h = i11;
                                        r(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f36224l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        r24.f36252t = r23.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018d A[LOOP:0: B:9:0x0034->B:32:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(x0.a.b r24, int r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.e(x0.a$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x00cf, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) throws IOException {
        int i10;
        int i11;
        j(fVar);
        HashMap<String, c>[] hashMapArr = this.f36240d;
        c cVar = hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f36258d);
            fVar2.f36252t = this.f;
            byte[] bArr = f36232u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.c(0L);
            byte[] bArr3 = f36233v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.c(12L);
            }
            s(fVar2, 6);
            c cVar2 = hashMapArr[7].get("PreviewImageStart");
            c cVar3 = hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f);
                if (iArr != null && iArr.length == 4) {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        c d10 = c.d(i14, this.f);
                        c d11 = c.d(i15, this.f);
                        hashMapArr[0].put("ImageWidth", d10);
                        hashMapArr[0].put("ImageLength", d11);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (f36224l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f36252t = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f36234w;
        bVar.b(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, y)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f36236z)) {
                        if (Arrays.equals(bArr2, f36235x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f36243h = i11;
                                    r(0, bArr3);
                                    x();
                                    u(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + x0.b.a(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.b(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z10 = f36224l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.b(i10 - bVar.f36253u);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.b(i12 - bVar.f36253u);
        bVar.f36252t = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == G.f36259a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f);
                c d11 = c.d(readShort2, this.f);
                HashMap<String, c>[] hashMapArr = this.f36240d;
                hashMapArr[0].put("ImageLength", d10);
                hashMapArr[0].put("ImageWidth", d11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.b(readUnsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f36239c == 8) {
            HashMap<String, c>[] hashMapArr = this.f36240d;
            c cVar = hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f36258d);
                fVar2.f36252t = this.f;
                fVar2.b(6);
                s(fVar2, 9);
                c cVar2 = hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (f36224l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap<String, c>[] hashMapArr = this.f36240d;
        c cVar = hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f36258d), (int) cVar.f36257c, 5);
        }
        c cVar2 = hashMapArr[0].get("ISO");
        c cVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void l(b bVar) throws IOException {
        if (f36224l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f36252t = ByteOrder.LITTLE_ENDIAN;
        bVar.b(A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f36243h = i10;
                            r(0, bArr3);
                            u(new b(bArr3));
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + x0.b.a(bArr2));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.b(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f);
            int f11 = cVar2.f(this.f);
            if (this.f36239c == 7) {
                f10 += this.f36244i;
            }
            if (f10 > 0 && f11 > 0 && this.f36238b == null && this.f36237a == null) {
                bVar.skip(f10);
                bVar.read(new byte[f11]);
            }
            if (f36224l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + f11);
            }
        }
    }

    public final boolean n(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f);
            int f11 = cVar2.f(this.f);
            if (f10 <= 512 && f11 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(b bVar) throws IOException {
        ByteOrder q10 = q(bVar);
        this.f = q10;
        bVar.f36252t = q10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f36239c;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i11 = readInt - 8;
            if (i11 > 0) {
                bVar.b(i11);
                return;
            }
            return;
        }
        throw new IOException(l.i("Invalid first Ifd offset: ", readInt));
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            HashMap<String, c>[] hashMapArr = this.f36240d;
            if (i10 < hashMapArr.length) {
                StringBuilder n10 = k.n("The size of tag group[", i10, "]: ");
                n10.append(hashMapArr[i10].size());
                Log.d("ExifInterface", n10.toString());
                for (Map.Entry<String, c> entry : hashMapArr[i10].entrySet()) {
                    c value = entry.getValue();
                    Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.g(this.f) + "'");
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void r(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(x0.a.f r32, int r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.s(x0.a$f, int):void");
    }

    public final void t(int i10, String str, String str2) {
        HashMap<String, c>[] hashMapArr = this.f36240d;
        if (!hashMapArr[i10].isEmpty() && hashMapArr[i10].get(str) != null) {
            HashMap<String, c> hashMap = hashMapArr[i10];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i10].remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(x0.a.b r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.u(x0.a$b):void");
    }

    public final void v(int i10, int i11) throws IOException {
        HashMap<String, c>[] hashMapArr = this.f36240d;
        boolean isEmpty = hashMapArr[i10].isEmpty();
        boolean z10 = f36224l;
        if (!isEmpty && !hashMapArr[i11].isEmpty()) {
            c cVar = hashMapArr[i10].get("ImageLength");
            c cVar2 = hashMapArr[i10].get("ImageWidth");
            c cVar3 = hashMapArr[i11].get("ImageLength");
            c cVar4 = hashMapArr[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int f10 = cVar.f(this.f);
                    int f11 = cVar2.f(this.f);
                    int f12 = cVar3.f(this.f);
                    int f13 = cVar4.f(this.f);
                    if (f10 < f12 && f11 < f13) {
                        HashMap<String, c> hashMap = hashMapArr[i10];
                        hashMapArr[i10] = hashMapArr[i11];
                        hashMapArr[i11] = hashMap;
                        return;
                    }
                    return;
                }
                if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f fVar, int i10) throws IOException {
        c d10;
        c d11;
        HashMap<String, c>[] hashMapArr = this.f36240d;
        c cVar = hashMapArr[i10].get("DefaultCropSize");
        c cVar2 = hashMapArr[i10].get("SensorTopBorder");
        c cVar3 = hashMapArr[i10].get("SensorLeftBorder");
        c cVar4 = hashMapArr[i10].get("SensorBottomBorder");
        c cVar5 = hashMapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f36255a == 5) {
                e[] eVarArr = (e[]) cVar.h(this.f);
                if (eVarArr != null && eVarArr.length == 2) {
                    d10 = c.c(eVarArr[0], this.f);
                    d11 = c.c(eVarArr[1], this.f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.h(this.f);
                if (iArr != null && iArr.length == 2) {
                    d10 = c.d(iArr[0], this.f);
                    d11 = c.d(iArr[1], this.f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i10].put("ImageWidth", d10);
            hashMapArr[i10].put("ImageLength", d11);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int f10 = cVar2.f(this.f);
            int f11 = cVar4.f(this.f);
            int f12 = cVar5.f(this.f);
            int f13 = cVar3.f(this.f);
            if (f11 > f10 && f12 > f13) {
                c d12 = c.d(f11 - f10, this.f);
                c d13 = c.d(f12 - f13, this.f);
                hashMapArr[i10].put("ImageLength", d12);
                hashMapArr[i10].put("ImageWidth", d13);
                return;
            }
            return;
        }
        c cVar6 = hashMapArr[i10].get("ImageLength");
        c cVar7 = hashMapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = hashMapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = hashMapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 != null && cVar9 != null) {
                int f14 = cVar8.f(this.f);
                int f15 = cVar8.f(this.f);
                fVar.c(f14);
                byte[] bArr = new byte[f15];
                fVar.read(bArr);
                e(new b(bArr), f14, i10);
            }
        }
    }

    public final void x() throws IOException {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap<String, c>[] hashMapArr = this.f36240d;
        c cVar = hashMapArr[1].get("PixelXDimension");
        c cVar2 = hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class f extends b {
        public f(byte[] bArr) throws IOException {
            super(bArr);
            this.f36251s.mark(Integer.MAX_VALUE);
        }

        public final void c(long j10) throws IOException {
            int i10 = this.f36253u;
            if (i10 > j10) {
                this.f36253u = 0;
                this.f36251s.reset();
            } else {
                j10 -= i10;
            }
            b((int) j10);
        }

        public f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f36251s.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f36259a;

        /* renamed from: b, reason: collision with root package name */
        public final String f36260b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36261c;

        /* renamed from: d, reason: collision with root package name */
        public final int f36262d;

        public d(String str, int i10, int i11) {
            this.f36260b = str;
            this.f36259a = i10;
            this.f36261c = i11;
            this.f36262d = -1;
        }

        public d(int i10, String str, int i11, int i12) {
            this.f36260b = str;
            this.f36259a = i10;
            this.f36261c = i11;
            this.f36262d = i12;
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: x0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0503a extends MediaDataSource {

        /* renamed from: s, reason: collision with root package name */
        public long f36247s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f f36248t;

        public C0503a(f fVar) {
            this.f36248t = fVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f36247s;
                f fVar = this.f36248t;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + fVar.available()) {
                        return -1;
                    }
                    fVar.c(j10);
                    this.f36247s = j10;
                }
                if (i11 > fVar.available()) {
                    i11 = fVar.available();
                }
                int read = fVar.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f36247s += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f36247s = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
