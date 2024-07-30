package k1;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
public class d implements Closeable {

    /* renamed from: s, reason: collision with root package name */
    public final SQLiteProgram f30301s;

    public d(SQLiteProgram sQLiteProgram) {
        this.f30301s = sQLiteProgram;
    }

    public final void b(int i10, byte[] bArr) {
        this.f30301s.bindBlob(i10, bArr);
    }

    public final void c(double d10, int i10) {
        this.f30301s.bindDouble(i10, d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30301s.close();
    }

    public final void d(int i10, long j10) {
        this.f30301s.bindLong(i10, j10);
    }

    public final void e(int i10) {
        this.f30301s.bindNull(i10);
    }

    public final void f(int i10, String str) {
        this.f30301s.bindString(i10, str);
    }
}
