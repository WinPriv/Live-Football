package ka;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class u4 extends SQLiteOpenHelper {

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicInteger f31924t = new AtomicInteger();

    /* renamed from: s, reason: collision with root package name */
    public SQLiteDatabase f31925s;

    public u4(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f31925s = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P(java.lang.String r6) {
        /*
            r5 = this;
            y6.m r0 = r5.k()
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r1 == 0) goto Lf
            goto L4f
        Lf:
            java.lang.Object r1 = r0.f36806c
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            pa.a r3 = (pa.a) r3
            java.lang.String r3 = r3.x()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L17
        L2e:
            r2 = r4
            goto L4f
        L30:
            java.lang.Object r0 = r0.f36805b
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            pa.a r1 = (pa.a) r1
            java.lang.String r1 = r1.x()
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L38
            goto L2e
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.u4.P(java.lang.String):boolean");
    }

    public final synchronized int b(String str, ContentValues contentValues, String str2, String[] strArr) {
        int i10;
        try {
            i10 = getWritableDatabase().update(str, contentValues, str2, strArr);
        } catch (Throwable th) {
            n7.h(d(), "update %s", th.getClass().getSimpleName());
            n7.b(d(), "update " + th.getMessage());
            i10 = 0;
        }
        return i10;
    }

    public final synchronized long c(ContentValues contentValues, String str) {
        long j10;
        try {
            j10 = getWritableDatabase().insertOrThrow(str, null, contentValues);
        } catch (Throwable th) {
            n7.c(d(), "insert ex %s", th.getMessage());
            n7.g(d(), "insert ex ".concat(th.getClass().getSimpleName()));
            n7.a();
            j10 = -1;
        }
        return j10;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        if (f31924t.decrementAndGet() <= 0) {
            super.close();
        }
    }

    public abstract String d();

    public final void e() {
        try {
            try {
                y6.m k10 = k();
                this.f31925s.beginTransaction();
                k10.d();
                this.f31925s.setTransactionSuccessful();
            } catch (t5 unused) {
                n7.g(d(), "initTables error");
            }
        } finally {
            this.f31925s.endTransaction();
        }
    }

    public final synchronized void f(String str, ContentValues contentValues, String str2, ArrayList arrayList) {
        SQLiteDatabase sQLiteDatabase;
        if (arrayList.isEmpty()) {
            n7.b(d(), "nothing update, items is empty");
            return;
        }
        try {
            sQLiteDatabase = getWritableDatabase();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.update(str, contentValues, str2, new String[]{(String) it.next()});
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable unused2) {
            try {
                d();
                n7.f31494a.getClass();
            } finally {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            }
        }
    }

    public final synchronized void g(String str, String str2, List<String> list) {
        SQLiteDatabase sQLiteDatabase;
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    sQLiteDatabase = getWritableDatabase();
                    try {
                        sQLiteDatabase.beginTransaction();
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            sQLiteDatabase.delete(str, str2, new String[]{it.next()});
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = null;
                }
            }
        }
        n7.b(d(), "noting delete, items is empty");
    }

    public final synchronized void h(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w4 w4Var = (w4) it.next();
                    if (i(writableDatabase, w4Var)) {
                        writableDatabase.update(w4Var.f32043a, w4Var.f, w4Var.f32046d, w4Var.f32047e);
                    } else {
                        writableDatabase.insertOrThrow(w4Var.f32043a, null, w4Var.f);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable unused) {
                sQLiteDatabase = writableDatabase;
                try {
                    d();
                    n7.f31494a.getClass();
                } finally {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final boolean i(SQLiteDatabase sQLiteDatabase, w4 w4Var) {
        boolean z10 = true;
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query(w4Var.f32043a, null, w4Var.f32044b, w4Var.f32045c, null, null, null, null);
                if (cursor != null) {
                    if (cursor.getCount() <= 0) {
                        z10 = false;
                    }
                    return z10;
                }
            } catch (Exception e10) {
                n7.j(d(), "query exception：%s", e10.getClass().getSimpleName());
            }
            return false;
        } finally {
            androidx.transition.n.D(cursor);
        }
    }

    public final void j(String str) {
        if (!P(str)) {
            n7.h(d(), "tableName: %s is invalid", str);
            return;
        }
        try {
            this.f31925s.execSQL(" DROP TABLE ".concat(str));
        } catch (Exception e10) {
            n7.h(d(), "delete table: %s fail, exception: %s", str, e10.getClass().getSimpleName());
        }
    }

    public abstract y6.m k();

    public final void l(String str) {
        try {
            this.f31925s.execSQL(str);
        } catch (Exception unused) {
            n7.g(d(), "executeSQL error");
            throw new t5("execute sql failed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r0.getInt(0) > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6.P(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            java.lang.String r0 = "select count(1) as c from sqlite_master where type ='table' and name = ?"
            android.database.sqlite.SQLiteDatabase r3 = r6.f31925s     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r7.trim()     // Catch: java.lang.Throwable -> L2a
            r4[r2] = r5     // Catch: java.lang.Throwable -> L2a
            android.database.Cursor r0 = r3.rawQuery(r0, r4)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L25
            int r7 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2b
            if (r7 <= 0) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            r0.close()
            return r1
        L2a:
            r0 = 0
        L2b:
            ka.t5 r3 = new ka.t5     // Catch: java.lang.Throwable -> L41
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "query tableName: %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L41
            r1[r2] = r7     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = java.lang.String.format(r4, r5, r1)     // Catch: java.lang.Throwable -> L41
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L41:
            r7 = move-exception
            if (r0 == 0) goto L47
            r0.close()
        L47:
            throw r7
        L48:
            ka.t5 r0 = new ka.t5
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = r7.trim()
            r1[r2] = r7
            java.lang.String r7 = "tableName: %s is invalid"
            java.lang.String r7 = java.lang.String.format(r3, r7, r1)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.u4.m(java.lang.String):boolean");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AtomicInteger atomicInteger = f31924t;
        atomicInteger.incrementAndGet();
        this.f31925s = sQLiteDatabase;
        e();
        atomicInteger.decrementAndGet();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        AtomicInteger atomicInteger = f31924t;
        atomicInteger.incrementAndGet();
        this.f31925s = sQLiteDatabase;
        e();
        atomicInteger.decrementAndGet();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        AtomicInteger atomicInteger = f31924t;
        atomicInteger.incrementAndGet();
        this.f31925s = sQLiteDatabase;
        e();
        atomicInteger.decrementAndGet();
    }
}
