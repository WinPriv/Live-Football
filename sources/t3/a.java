package t3;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f35403a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f35406a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35407b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f35408c;

        public b(byte[] bArr, int i10, int i11) {
            this.f35408c = bArr;
            this.f35406a = i10;
            this.f35407b = i11;
        }
    }

    public static MappedByteBuffer a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        try {
                            MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                            try {
                                fileChannel.close();
                            } catch (IOException unused) {
                            }
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused2) {
                            }
                            return load;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            fileChannel2 = fileChannel;
                            th = th3;
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (IOException unused4) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileChannel = null;
                    }
                } else {
                    throw new IOException("File unsuitable for memory mapping");
                }
            } else {
                throw new IOException("File too large to map into memory");
            }
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f35403a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void d(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: t3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0486a extends InputStream {

        /* renamed from: s, reason: collision with root package name */
        public final ByteBuffer f35404s;

        /* renamed from: t, reason: collision with root package name */
        public int f35405t = -1;

        public C0486a(ByteBuffer byteBuffer) {
            this.f35404s = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f35404s.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i10) {
            this.f35405t = this.f35404s.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f35404s;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & DefaultClassResolver.NAME;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i10 = this.f35405t;
            if (i10 != -1) {
                this.f35404s.position(i10);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f35404s;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j10, available());
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            ByteBuffer byteBuffer = this.f35404s;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i11, available());
            byteBuffer.get(bArr, i10, min);
            return min;
        }
    }
}
