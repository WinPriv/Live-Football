package f1;

import java.io.File;
import java.io.IOException;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
public final class k implements j1.c {

    /* renamed from: s, reason: collision with root package name */
    public a f27983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27984t;

    @Override // j1.c
    public final synchronized j1.b H() {
        if (!this.f27984t) {
            c();
            this.f27984t = true;
        }
        throw null;
    }

    public final void b(File file) throws IOException {
        throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
    }

    public final void c() {
        getDatabaseName();
        throw null;
    }

    @Override // j1.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // j1.c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // j1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
