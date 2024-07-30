package z3;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: TransportRuntimeComponent.java */
/* loaded from: classes.dex */
public abstract class x implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((k) this).f36951w.get().close();
    }
}
