package okhttp3.internal.cache;

import java.io.IOException;
import okio.b;
import okio.g;
import okio.y;

/* loaded from: classes2.dex */
class FaultHidingSink extends g {
    private boolean hasErrors;

    public FaultHidingSink(y yVar) {
        super(yVar);
    }

    @Override // okio.g, okio.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            onException(e10);
        }
    }

    @Override // okio.g, okio.y, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            onException(e10);
        }
    }

    @Override // okio.g, okio.y
    public void write(b bVar, long j10) throws IOException {
        if (this.hasErrors) {
            bVar.skip(j10);
            return;
        }
        try {
            super.write(bVar, j10);
        } catch (IOException e10) {
            this.hasErrors = true;
            onException(e10);
        }
    }

    public void onException(IOException iOException) {
    }
}
