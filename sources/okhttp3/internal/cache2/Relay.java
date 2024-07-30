package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.a0;
import okio.b;
import okio.e;
import okio.z;

/* loaded from: classes2.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final e PREFIX_CLEAN = e.p("OkHttp cache v1\n");
    static final e PREFIX_DIRTY = e.p("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final e metadata;
    int sourceCount;
    z upstream;
    long upstreamPos;
    Thread upstreamReader;
    final b upstreamBuffer = new b();
    final b buffer = new b();

    /* loaded from: classes2.dex */
    public class RelaySource implements z {
        private FileOperator fileOperator;
        private long sourcePos;
        private final a0 timeout = new a0();

        public RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                int i10 = relay.sourceCount - 1;
                relay.sourceCount = i10;
                if (i10 == 0) {
                    RandomAccessFile randomAccessFile2 = relay.file;
                    relay.file = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r0 != 2) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            r2 = java.lang.Math.min(r23, r7 - r21.sourcePos);
            r21.fileOperator.read(r21.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22, r2);
            r21.sourcePos += r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        
            r0 = r21.this$0;
            r9 = r0.upstream.read(r0.upstreamBuffer, r0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        
            if (r9 != (-1)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        
            r21.this$0.commit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        
            r0 = r21.this$0;
            r0.upstreamReader = null;
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        
            r2 = java.lang.Math.min(r9, r23);
            r21.this$0.upstreamBuffer.e(0, r22, r2);
            r21.sourcePos += r2;
            r21.fileOperator.write(r7 + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r21.this$0.upstreamBuffer.clone(), r9);
            r4 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        
            r0 = r21.this$0;
            r0.buffer.write(r0.upstreamBuffer, r9);
            r0 = r21.this$0;
            r5 = r0.buffer;
            r7 = r5.f33824t;
            r11 = r0.bufferMaxSize;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        
            if (r7 <= r11) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
        
            r5.skip(r7 - r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
        
            r5 = r21.this$0;
            r5.upstreamPos += r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
        
            monitor-enter(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
        
            r0 = r21.this$0;
            r0.upstreamReader = null;
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
        
            monitor-exit(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
        
            monitor-enter(r21.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
        
            r3 = r21.this$0;
            r3.upstreamReader = null;
            r3.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00e5, code lost:
        
            throw r0;
         */
        @Override // okio.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(okio.b r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.b, long):long");
        }

        @Override // okio.z
        public a0 timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, z zVar, long j10, e eVar, long j11) {
        boolean z10;
        this.file = randomAccessFile;
        this.upstream = zVar;
        if (zVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.complete = z10;
        this.upstreamPos = j10;
        this.metadata = eVar;
        this.bufferMaxSize = j11;
    }

    public static Relay edit(File file, z zVar, e eVar, long j10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, zVar, 0L, eVar, j10);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        b bVar = new b();
        fileOperator.read(0L, bVar, FILE_HEADER_SIZE);
        if (bVar.a(r2.A()).equals(PREFIX_CLEAN)) {
            long readLong = bVar.readLong();
            long readLong2 = bVar.readLong();
            b bVar2 = new b();
            fileOperator.read(readLong + FILE_HEADER_SIZE, bVar2, readLong2);
            return new Relay(randomAccessFile, null, readLong, bVar2.j(), 0L);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(e eVar, long j10, long j11) throws IOException {
        b bVar = new b();
        bVar.Y(eVar);
        bVar.d0(j10);
        bVar.d0(j11);
        if (bVar.f33824t == FILE_HEADER_SIZE) {
            new FileOperator(this.file.getChannel()).write(0L, bVar, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void writeMetadata(long j10) throws IOException {
        b bVar = new b();
        bVar.Y(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j10, bVar, this.metadata.A());
    }

    public void commit(long j10) throws IOException {
        writeMetadata(j10);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j10, this.metadata.A());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    public boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public e metadata() {
        return this.metadata;
    }

    public z newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}
