package k1;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.io.IOException;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
public final class a implements j1.b {

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f30287t = new String[0];

    /* renamed from: s, reason: collision with root package name */
    public final SQLiteDatabase f30288s;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: k1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0414a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j1.d f30289a;

        public C0414a(j1.d dVar) {
            this.f30289a = dVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f30289a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f30288s = sQLiteDatabase;
    }

    public final void b() {
        this.f30288s.beginTransaction();
    }

    public final void c() {
        this.f30288s.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30288s.close();
    }

    public final void d(String str) throws SQLException {
        this.f30288s.execSQL(str);
    }

    public final Cursor e(j1.d dVar) {
        return this.f30288s.rawQueryWithFactory(new C0414a(dVar), dVar.m(), f30287t, null);
    }

    public final Cursor f(String str) {
        return e(new j1.a(str));
    }

    public final void g() {
        this.f30288s.setTransactionSuccessful();
    }
}
