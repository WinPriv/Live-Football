package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public final class g0 extends Writer {

    /* renamed from: t, reason: collision with root package name */
    public final StringBuilder f1818t = new StringBuilder(128);

    /* renamed from: s, reason: collision with root package name */
    public final String f1817s = "FragmentManager";

    public final void b() {
        StringBuilder sb2 = this.f1818t;
        if (sb2.length() > 0) {
            Log.d(this.f1817s, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f1818t.append(c10);
            }
        }
    }
}
