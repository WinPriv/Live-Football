package j1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29570a;

        public a(int i10) {
            this.f29570a = i10;
        }

        public static void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        public abstract void b(k1.a aVar, int i10, int i11);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f29571a;

        /* renamed from: b, reason: collision with root package name */
        public final String f29572b;

        /* renamed from: c, reason: collision with root package name */
        public final a f29573c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f29574d;

        public b(Context context, String str, a aVar, boolean z10) {
            this.f29571a = context;
            this.f29572b = str;
            this.f29573c = aVar;
            this.f29574d = z10;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: j1.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0403c {
        c a(b bVar);
    }

    j1.b H();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
