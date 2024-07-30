package com.ironsource.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends SQLiteOpenHelper {

    /* renamed from: s, reason: collision with root package name */
    public static a f24591s;

    public a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
    }

    public static synchronized a a(Context context, String str, int i10) {
        a aVar;
        synchronized (a.class) {
            if (f24591s == null) {
                f24591s = new a(context, str);
            }
            aVar = f24591s;
        }
        return aVar;
    }

    public final synchronized SQLiteDatabase b(boolean z10) {
        int i10 = 0;
        while (true) {
            try {
                if (z10) {
                    return getWritableDatabase();
                }
                return getReadableDatabase();
            } finally {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r11.isOpen() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r11.isOpen() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList<com.ironsource.mediationsdk.a.c> a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac
            r0.<init>()     // Catch: java.lang.Throwable -> Lac
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r11 = r12.b(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = "type = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73
            r7[r1] = r13     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r5 = 0
            r8 = 0
            r9 = 0
            r3 = r11
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L73
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L73
            if (r13 <= 0) goto L60
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L73
        L28:
            boolean r13 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L73
            if (r13 != 0) goto L5d
            java.lang.String r13 = "eventid"
            int r13 = r2.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L73
            int r13 = r2.getInt(r13)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L73
            long r3 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "data"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L73
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L73
            r5.<init>(r13, r3, r6)     // Catch: java.lang.Throwable -> L73
            r0.add(r5)     // Catch: java.lang.Throwable -> L73
            r2.moveToNext()     // Catch: java.lang.Throwable -> L73
            goto L28
        L5d:
            r2.close()     // Catch: java.lang.Throwable -> L73
        L60:
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lac
            if (r13 != 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> Lac
        L69:
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lac
            if (r13 == 0) goto L92
        L6f:
            r11.close()     // Catch: java.lang.Throwable -> Lac
            goto L92
        L73:
            r13 = move-exception
            goto L77
        L75:
            r13 = move-exception
            r11 = r2
        L77:
            java.lang.String r1 = "IronSource"
            java.lang.String r3 = "Exception while loading events: "
            android.util.Log.e(r1, r3, r13)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L89
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lac
            if (r13 != 0) goto L89
            r2.close()     // Catch: java.lang.Throwable -> Lac
        L89:
            if (r11 == 0) goto L92
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lac
            if (r13 == 0) goto L92
            goto L6f
        L92:
            monitor-exit(r12)
            return r0
        L94:
            r13 = move-exception
            if (r2 == 0) goto La0
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto La0
            r2.close()     // Catch: java.lang.Throwable -> Lac
        La0:
            if (r11 == 0) goto Lab
            boolean r0 = r11.isOpen()     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lab
            r11.close()     // Catch: java.lang.Throwable -> Lac
        Lab:
            throw r13     // Catch: java.lang.Throwable -> Lac
        Lac:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.b.a.a(java.lang.String):java.util.ArrayList");
    }

    public final synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {str};
        try {
            sQLiteDatabase = b(true);
            try {
                sQLiteDatabase.delete("events", "type = ?", strArr);
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    Log.e(IronSourceConstants.IRONSOURCE_CONFIG_NAME, "Exception while clearing events: ", th);
                } finally {
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    public final synchronized void a(List<com.ironsource.mediationsdk.a.c> list, String str) {
        ContentValues contentValues;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase b10 = b(true);
                    try {
                        for (com.ironsource.mediationsdk.a.c cVar : list) {
                            if (cVar != null) {
                                contentValues = new ContentValues(4);
                                contentValues.put("eventid", Integer.valueOf(cVar.a()));
                                contentValues.put("timestamp", Long.valueOf(cVar.b()));
                                contentValues.put("type", str);
                                contentValues.put("data", cVar.c());
                            } else {
                                contentValues = null;
                            }
                            if (b10 != null && contentValues != null) {
                                b10.insert("events", null, contentValues);
                            }
                        }
                        if (b10 != null && b10.isOpen()) {
                            b10.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = b10;
                        try {
                            Log.e(IronSourceConstants.IRONSOURCE_CONFIG_NAME, "Exception while saving events: ", th);
                        } finally {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }
}
