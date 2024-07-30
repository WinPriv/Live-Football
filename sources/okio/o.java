package okio;

import java.io.IOException;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class o implements y {
    @Override // okio.y
    public final a0 timeout() {
        return a0.NONE;
    }

    @Override // okio.y
    public final void write(b bVar, long j10) throws IOException {
        bVar.skip(j10);
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // okio.y, java.io.Flushable
    public final void flush() throws IOException {
    }
}
