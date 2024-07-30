package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.java */
/* loaded from: classes2.dex */
public interface y extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    a0 timeout();

    void write(b bVar, long j10) throws IOException;
}
