package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OneSignalDbHelper.java */
/* loaded from: classes2.dex */
public final class p3 extends SQLiteOpenHelper implements o3 {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f26972s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f26973t = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: u, reason: collision with root package name */
    public static p3 f26974u;

    static {
        new c3();
    }

    public p3(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, 8);
    }

    public static void P(SQLiteDatabase sQLiteDatabase) {
        zc.d.d(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public static p3 c(Context context) {
        if (f26974u == null) {
            synchronized (f26972s) {
                if (f26974u == null) {
                    f26974u = new p3(context.getApplicationContext());
                }
            }
        }
        return f26974u;
    }

    public static void h(SQLiteDatabase sQLiteDatabase, int i10) {
        if (i10 < 2) {
            l(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
            l(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
        }
        if (i10 < 3) {
            l(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
            l(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
            l(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
        }
        if (i10 < 4) {
            l(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
        }
        if (i10 < 5) {
            l(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
            P(sQLiteDatabase);
        }
        if (i10 == 5) {
            P(sQLiteDatabase);
        }
        if (i10 < 7) {
            l(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
        }
        if (i10 < 8) {
            zc.d.d(sQLiteDatabase, "db");
            try {
                try {
                    sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                    sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                    sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                    sQLiteDatabase.execSQL("INSERT INTO outcome(_id,name,timestamp,notification_ids,weight,notification_influence_type) SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux;");
                    sQLiteDatabase.execSQL("DROP TABLE outcome_aux;");
                } finally {
                }
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            sQLiteDatabase.execSQL("COMMIT;");
            try {
                try {
                    sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                    sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                    sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM cached_unique_outcome_notification;");
                    sQLiteDatabase.execSQL("UPDATE cached_unique_outcome SET channel_type = 'notification';");
                    sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
                } catch (SQLiteException e11) {
                    e11.printStackTrace();
                }
            } finally {
            }
        }
    }

    public static StringBuilder k() {
        e3.f26775w.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        StringBuilder sb2 = new StringBuilder(a3.l.k("created_time > ", currentTimeMillis - 604800, " AND dismissed = 0 AND opened = 0 AND is_summary = 0"));
        e3.f26776x.getClass();
        if (r3.b(r3.f27010a, "OS_RESTORE_TTL_FILTER", true)) {
            sb2.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb2;
    }

    public static void l(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        }
    }

    public final void b(String str, String str2, String[] strArr) {
        synchronized (f26972s) {
            SQLiteDatabase e10 = e();
            try {
                try {
                    e10.beginTransaction();
                    e10.delete(str, str2, strArr);
                    e10.setTransactionSuccessful();
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e11) {
                        e = e11;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e12) {
                        e = e12;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                } finally {
                }
            } catch (SQLiteException e13) {
                e3.b(3, "Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e13);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e14) {
                        e = e14;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e15) {
                        e = e15;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                }
            } catch (IllegalStateException e16) {
                e3.b(3, "Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e16);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e17) {
                        e = e17;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e18) {
                        e = e18;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                }
            }
        }
    }

    public final SQLiteDatabase d() {
        SQLiteDatabase writableDatabase;
        synchronized (f26972s) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } finally {
                }
            } catch (SQLiteCantOpenDatabaseException e10) {
                throw e10;
            } catch (SQLiteDatabaseLockedException e11) {
                throw e11;
            }
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:4:0x0005->B:20:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:8:0x0009, B:18:0x0013, B:20:0x0018, B:22:0x001f), top: B:4:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.sqlite.SQLiteDatabase e() {
        /*
            r5 = this;
            java.lang.Object r0 = com.onesignal.p3.f26972s
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L5:
            android.database.sqlite.SQLiteDatabase r1 = r5.d()     // Catch: java.lang.Throwable -> Lb android.database.sqlite.SQLiteDatabaseLockedException -> Ld android.database.sqlite.SQLiteCantOpenDatabaseException -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L20
        Ld:
            r3 = move-exception
            goto L10
        Lf:
            r3 = move-exception
        L10:
            if (r1 != 0) goto L13
            r1 = r3
        L13:
            int r2 = r2 + 1
            r3 = 5
            if (r2 >= r3) goto L1f
            int r3 = r2 * 400
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb
            android.os.SystemClock.sleep(r3)     // Catch: java.lang.Throwable -> Lb
            goto L5
        L1f:
            throw r1     // Catch: java.lang.Throwable -> Lb
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.p3.e():android.database.sqlite.SQLiteDatabase");
    }

    public final void f(String str, ContentValues contentValues) {
        synchronized (f26972s) {
            SQLiteDatabase e10 = e();
            try {
                try {
                    e10.beginTransaction();
                    e10.insert(str, null, contentValues);
                    e10.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e11) {
                e3.b(3, "Error inserting on table: " + str + " with nullColumnHack: null and values: " + contentValues, e11);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e12) {
                        e = e12;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e13) {
                        e = e13;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                }
            } catch (IllegalStateException e14) {
                e3.b(3, "Error under inserting transaction under table: " + str + " with nullColumnHack: null and values: " + contentValues, e14);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                }
            }
            try {
                e10.endTransaction();
            } catch (SQLiteException e17) {
                e = e17;
                e3.b(3, "Error closing transaction! ", e);
            } catch (IllegalStateException e18) {
                e = e18;
                e3.b(3, "Error closing transaction! ", e);
            }
        }
    }

    public final void g(ContentValues contentValues) throws SQLException {
        synchronized (f26972s) {
            SQLiteDatabase e10 = e();
            try {
                try {
                    e10.beginTransaction();
                    e10.insertOrThrow("notification", null, contentValues);
                    e10.setTransactionSuccessful();
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e11) {
                        e = e11;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e12) {
                        e = e12;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                } finally {
                }
            } catch (SQLiteException e13) {
                e3.b(3, "Error inserting or throw on table: notification with nullColumnHack: null and values: " + contentValues, e13);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e14) {
                        e = e14;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e15) {
                        e = e15;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                }
            } catch (IllegalStateException e16) {
                e3.b(3, "Error under inserting or throw transaction under table: notification with nullColumnHack: null and values: " + contentValues, e16);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e17) {
                        e = e17;
                        e3.b(3, "Error closing transaction! ", e);
                    } catch (IllegalStateException e18) {
                        e = e18;
                        e3.b(3, "Error closing transaction! ", e);
                    }
                }
            }
        }
    }

    public final Cursor i(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        Cursor query;
        synchronized (f26972s) {
            query = e().query(str, strArr, str2, strArr2, null, null, str3);
        }
        return query;
    }

    public final Cursor j(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor query;
        synchronized (f26972s) {
            query = e().query(str, strArr, str2, strArr2, null, null, str3, str4);
        }
        return query;
    }

    public final int m(String str, ContentValues contentValues, String str2, String[] strArr) {
        int i10 = 0;
        if (contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (f26972s) {
            SQLiteDatabase e10 = e();
            try {
                try {
                    e10.beginTransaction();
                    i10 = e10.update(str, contentValues, str2, strArr);
                    e10.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e11) {
                e3.b(3, "Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e11);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e12) {
                        e = e12;
                        e3.b(3, "Error closing transaction! ", e);
                        return i10;
                    } catch (IllegalStateException e13) {
                        e = e13;
                        e3.b(3, "Error closing transaction! ", e);
                        return i10;
                    }
                }
            } catch (IllegalStateException e14) {
                e3.b(3, "Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                if (e10 != null) {
                    try {
                        e10.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        e3.b(3, "Error closing transaction! ", e);
                        return i10;
                    } catch (IllegalStateException e16) {
                        e = e16;
                        e3.b(3, "Error closing transaction! ", e);
                        return i10;
                    }
                }
            }
            try {
                e10.endTransaction();
            } catch (SQLiteException e17) {
                e = e17;
                e3.b(3, "Error closing transaction! ", e);
                return i10;
            } catch (IllegalStateException e18) {
                e = e18;
                e3.b(3, "Error closing transaction! ", e);
                return i10;
            }
        }
        return i10;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f26972s) {
            sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
            String[] strArr = f26973t;
            for (int i10 = 0; i10 < 6; i10++) {
                sQLiteDatabase.execSQL(strArr[i10]);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        e3.b(4, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null);
        synchronized (f26972s) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            try {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    arrayList.add(rawQuery.getString(0));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!str.startsWith("sqlite_")) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
                rawQuery.close();
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        e3.b(6, a3.k.j("OneSignal Database onUpgrade from: ", i10, " to: ", i11), null);
        synchronized (f26972s) {
            try {
                h(sQLiteDatabase, i10);
            } catch (SQLiteException e10) {
                e3.b(3, "Error in upgrade, migration may have already run! Skipping!", e10);
            }
        }
    }
}
