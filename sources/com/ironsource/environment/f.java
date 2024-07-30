package com.ironsource.environment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f extends SQLiteOpenHelper {
    public f(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i10) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase readableDatabase = new f(e.a().f).getReadableDatabase();
            try {
                Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + w.aG, null);
                readableDatabase.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = readableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Cursor b() {
        SQLiteDatabase readableDatabase;
        f fVar = new f(e.a().f);
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            readableDatabase = fVar.getReadableDatabase();
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM REPORTS;", null);
            readableDatabase.close();
            return rawQuery;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = readableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void c() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new f(e.a().f).getWritableDatabase();
            try {
                sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
                sQLiteDatabase.close();
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r1.add(new com.ironsource.environment.c(r2.getInt(0), r2.getString(1), r2.getString(2), r2.getString(3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r2.moveToNext() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ironsource.environment.c> a() {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.e.a()
            android.content.Context r1 = r1.f
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM REPORTS ;"
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d
            android.database.Cursor r2 = r0.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L4a
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L43
        L21:
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L4a
            r4 = 1
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L4a
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L4a
            r6 = 3
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Throwable -> L4a
            com.ironsource.environment.c r7 = new com.ironsource.environment.c     // Catch: java.lang.Throwable -> L4a
            r7.<init>(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
            r1.add(r7)     // Catch: java.lang.Throwable -> L4a
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L21
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L4a
            r0.close()
            return r1
        L4a:
            r1 = move-exception
            r3 = r0
            goto L4e
        L4d:
            r1 = move-exception
        L4e:
            if (r3 == 0) goto L53
            r3.close()
        L53:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.f.a():java.util.List");
    }

    public static void a(c cVar) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = new f(e.a().f).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String a10 = cVar.a();
                String b10 = cVar.b();
                String c10 = cVar.c();
                contentValues.put(CrashHianalyticsData.STACK_TRACE, a10);
                contentValues.put("crash_date", b10);
                contentValues.put("crashType", c10);
                writableDatabase.insert("REPORTS", null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
