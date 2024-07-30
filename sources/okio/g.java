package okio;

import java.io.IOException;

/* compiled from: ForwardingSink.java */
/* loaded from: classes2.dex */
public abstract class g implements y {
    private final y delegate;

    public g(y yVar) {
        if (yVar != null) {
            this.delegate = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final y delegate() {
        return this.delegate;
    }

    @Override // okio.y, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.y
    public a0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    @Override // okio.y
    public void write(b bVar, long j10) throws IOException {
        this.delegate.write(bVar, j10);
    }
}
