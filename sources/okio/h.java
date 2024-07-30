package okio;

import java.io.IOException;

/* compiled from: ForwardingSource.java */
/* loaded from: classes2.dex */
public abstract class h implements z {
    private final z delegate;

    public h(z zVar) {
        if (zVar != null) {
            this.delegate = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final z delegate() {
        return this.delegate;
    }

    @Override // okio.z
    public long read(b bVar, long j10) throws IOException {
        return this.delegate.read(bVar, j10);
    }

    @Override // okio.z
    public a0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }
}
