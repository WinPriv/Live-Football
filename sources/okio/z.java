package okio;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source.java */
/* loaded from: classes2.dex */
public interface z extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(b bVar, long j10) throws IOException;

    a0 timeout();
}
