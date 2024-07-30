package h3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: classes.dex */
public final class k implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f28697a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f28698b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28699a;

        public a(ByteBuffer byteBuffer) {
            this.f28699a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // h3.k.c
        public final int a() throws c.a {
            return (b() << 8) | b();
        }

        @Override // h3.k.c
        public final short b() throws c.a {
            ByteBuffer byteBuffer = this.f28699a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & DefaultClassResolver.NAME);
            }
            throw new c.a();
        }

        @Override // h3.k.c
        public final int c(int i10, byte[] bArr) {
            ByteBuffer byteBuffer = this.f28699a;
            int min = Math.min(i10, byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, min);
            return min;
        }

        @Override // h3.k.c
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f28699a;
            int min = (int) Math.min(byteBuffer.remaining(), j10);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28700a;

        public b(byte[] bArr, int i10) {
            this.f28700a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            boolean z10;
            ByteBuffer byteBuffer = this.f28700a;
            if (byteBuffer.remaining() - i10 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return byteBuffer.getShort(i10);
            }
            return (short) -1;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        /* loaded from: classes.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        short b() throws IOException;

        int c(int i10, byte[] bArr) throws IOException;

        long skip(long j10) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f28701a;

        public d(InputStream inputStream) {
            this.f28701a = inputStream;
        }

        @Override // h3.k.c
        public final int a() throws IOException {
            return (b() << 8) | b();
        }

        @Override // h3.k.c
        public final short b() throws IOException {
            int read = this.f28701a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // h3.k.c
        public final int c(int i10, byte[] bArr) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f28701a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // h3.k.c
        public final long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                InputStream inputStream = this.f28701a;
                long skip = inputStream.skip(j11);
                if (skip > 0) {
                    j11 -= skip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j11--;
                }
            }
            return j10 - j11;
        }
    }

    public static int e(c cVar, b3.b bVar) throws IOException {
        boolean z10;
        try {
            int a10 = cVar.a();
            if ((a10 & 65496) != 65496 && a10 != 19789 && a10 != 18761) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                }
                return -1;
            }
            int g6 = g(cVar);
            if (g6 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(byte[].class, g6);
            try {
                return h(cVar, bArr, g6);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    public static ImageHeaderParser.ImageType f(c cVar) throws IOException {
        try {
            int a10 = cVar.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int b10 = (a10 << 8) | cVar.b();
            if (b10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int b11 = (b10 << 8) | cVar.b();
            if (b11 == -1991225785) {
                cVar.skip(21L);
                try {
                    if (cVar.b() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (b11 != 1380533830) {
                boolean z10 = false;
                if (((cVar.a() << 16) | cVar.a()) == 1718909296) {
                    int a11 = (cVar.a() << 16) | cVar.a();
                    if (a11 != 1635150182 && a11 != 1635150195) {
                        cVar.skip(4L);
                        int i10 = b11 - 16;
                        if (i10 % 4 == 0) {
                            int i11 = 0;
                            while (i11 < 5 && i10 > 0) {
                                int a12 = (cVar.a() << 16) | cVar.a();
                                if (a12 != 1635150182 && a12 != 1635150195) {
                                    i11++;
                                    i10 -= 4;
                                }
                            }
                        }
                    }
                    z10 = true;
                    break;
                }
                if (z10) {
                    return ImageHeaderParser.ImageType.AVIF;
                }
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a13 = (cVar.a() << 16) | cVar.a();
            if ((a13 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i12 = a13 & com.anythink.expressad.exoplayer.k.p.f9095b;
            if (i12 == 88) {
                cVar.skip(4L);
                short b12 = cVar.b();
                if ((b12 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                if ((b12 & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            if (i12 == 76) {
                cVar.skip(4L);
                if ((cVar.b() & 8) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int g(c cVar) throws IOException {
        short b10;
        int a10;
        long j10;
        long skip;
        do {
            short b11 = cVar.b();
            if (b11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) b11));
                }
                return -1;
            }
            b10 = cVar.b();
            if (b10 == 218) {
                return -1;
            }
            if (b10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = cVar.a() - 2;
            if (b10 != 225) {
                j10 = a10;
                skip = cVar.skip(j10);
            } else {
                return a10;
            }
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder r10 = a3.l.r("Unable to skip enough data, type: ", b10, ", wanted to skip: ", a10, ", but actually skipped: ");
            r10.append(skip);
            Log.d("DfltImageHeaderParser", r10.toString());
        }
        return -1;
    }

    public static int h(c cVar, byte[] bArr, int i10) throws IOException {
        boolean z10;
        ByteOrder byteOrder;
        boolean z11;
        int i11;
        int i12;
        int c10 = cVar.c(i10, bArr);
        if (c10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + c10);
            }
            return -1;
        }
        short s10 = 1;
        byte[] bArr2 = f28697a;
        if (bArr != null && i10 > bArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length) {
                    break;
                }
                if (bArr[i13] != bArr2[i13]) {
                    z10 = false;
                    break;
                }
                i13++;
            }
        }
        if (z10) {
            b bVar = new b(bArr, i10);
            short a10 = bVar.a(6);
            if (a10 != 18761) {
                if (a10 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a10));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f28700a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = byteBuffer.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short a11 = bVar.a(i14);
            int i15 = 0;
            while (i15 < a11) {
                int i16 = (i15 * 12) + i14 + 2;
                short a12 = bVar.a(i16);
                if (a12 == 274) {
                    short a13 = bVar.a(i16 + 2);
                    if (a13 >= s10 && a13 <= 12) {
                        int i17 = i16 + 4;
                        if (byteBuffer.remaining() - i17 < 4) {
                            s10 = 0;
                        }
                        if (s10 != 0) {
                            i12 = byteBuffer.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder r10 = a3.l.r("Got tagIndex=", i15, " tagType=", a12, " formatCode=");
                                r10.append((int) a13);
                                r10.append(" componentCount=");
                                r10.append(i12);
                                Log.d("DfltImageHeaderParser", r10.toString());
                            }
                            int i18 = i12 + f28698b[a13];
                            if (i18 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a13));
                                }
                            } else {
                                int i19 = i16 + 8;
                                if (i19 >= 0 && i19 <= byteBuffer.remaining()) {
                                    if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                        return bVar.a(i19);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a12));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i19 + " tagType=" + ((int) a12));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a13));
                    }
                }
                i15++;
                s10 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        androidx.activity.n.n0(byteBuffer);
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        androidx.activity.n.n0(inputStream);
        return f(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, b3.b bVar) throws IOException {
        androidx.activity.n.n0(inputStream);
        d dVar = new d(inputStream);
        androidx.activity.n.n0(bVar);
        return e(dVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, b3.b bVar) throws IOException {
        androidx.activity.n.n0(byteBuffer);
        a aVar = new a(byteBuffer);
        androidx.activity.n.n0(bVar);
        return e(aVar, bVar);
    }
}
