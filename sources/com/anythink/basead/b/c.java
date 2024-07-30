package com.anythink.basead.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f3692a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3693b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3694a = "my_offer_cap_pacing";

        /* renamed from: b, reason: collision with root package name */
        public static final String f3695b = "offer_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f3696c = "offer_cap";

        /* renamed from: d, reason: collision with root package name */
        public static final String f3697d = "offer_pacing";

        /* renamed from: e, reason: collision with root package name */
        public static final String f3698e = "show_num";
        public static final String f = "show_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f3699g = "record_date";

        /* renamed from: h, reason: collision with root package name */
        public static final String f3700h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private c(Context context) {
        this.f3693b = context;
    }

    public static c a(Context context) {
        if (f3692a == null) {
            f3692a = new c(context);
        }
        return f3692a;
    }

    private synchronized boolean d(String str) {
        Cursor query = b.a(this.f3693b).getReadableDatabase().query(a.f3694a, new String[]{"offer_id"}, "offer_id=?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (r11 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.basead.c.c> b(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.content.Context r1 = r10.f3693b     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            com.anythink.basead.b.b r1 = com.anythink.basead.b.b.a(r1)     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            java.lang.String r3 = "my_offer_cap_pacing"
            r4 = 0
            java.lang.String r5 = "offer_cap <= show_num AND record_date=? AND offer_cap !=?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            r1 = 0
            r6[r1] = r11     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            java.lang.String r11 = "-1"
            r1 = 1
            r6[r1] = r11     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49 java.lang.OutOfMemoryError -> L50 java.lang.Exception -> L5e
            if (r11 == 0) goto L46
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
            if (r1 <= 0) goto L46
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
        L30:
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
            if (r2 == 0) goto L3e
            com.anythink.basead.c.c r2 = a(r11)     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
            r1.add(r2)     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
            goto L30
        L3e:
            r11.close()     // Catch: java.lang.Throwable -> L4a java.lang.OutOfMemoryError -> L51 java.lang.Exception -> L5f
            r11.close()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r10)
            return r1
        L46:
            if (r11 == 0) goto L65
            goto L61
        L49:
            r11 = r0
        L4a:
            if (r11 == 0) goto L65
        L4c:
            r11.close()     // Catch: java.lang.Throwable -> L62
            goto L65
        L50:
            r11 = r0
        L51:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L57
            if (r11 == 0) goto L65
            goto L61
        L57:
            r0 = move-exception
            if (r11 == 0) goto L5d
            r11.close()     // Catch: java.lang.Throwable -> L62
        L5d:
            throw r0     // Catch: java.lang.Throwable -> L62
        L5e:
            r11 = r0
        L5f:
            if (r11 == 0) goto L65
        L61:
            goto L4c
        L62:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L65:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.b.c.b(java.lang.String):java.util.List");
    }

    public final synchronized void c(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "record_date != '" + str + "'";
            } catch (Exception unused) {
            }
            if (b.a(this.f3693b).getWritableDatabase() == null) {
                return;
            }
            b.a(this.f3693b).getWritableDatabase().delete(a.f3694a, str2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.basead.c.c a(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.content.Context r1 = r10.f3693b     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4d
            com.anythink.basead.b.b r1 = com.anythink.basead.b.b.a(r1)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4d
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4d
            java.lang.String r3 = "my_offer_cap_pacing"
            r4 = 0
            java.lang.String r5 = "offer_id=?"
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4d
            r1 = 0
            r6[r1] = r11     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4d
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4d
            if (r11 == 0) goto L35
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4e
            if (r1 <= 0) goto L35
            r11.moveToNext()     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4e
            com.anythink.basead.c.c r1 = a(r11)     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4e
            r11.close()     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4e
            r11.close()     // Catch: java.lang.Throwable -> L51
            monitor-exit(r10)
            return r1
        L35:
            if (r11 == 0) goto L54
            goto L50
        L38:
            r11 = r0
        L39:
            if (r11 == 0) goto L54
        L3b:
            r11.close()     // Catch: java.lang.Throwable -> L51
            goto L54
        L3f:
            r11 = r0
        L40:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L46
            if (r11 == 0) goto L54
            goto L50
        L46:
            r0 = move-exception
            if (r11 == 0) goto L4c
            r11.close()     // Catch: java.lang.Throwable -> L51
        L4c:
            throw r0     // Catch: java.lang.Throwable -> L51
        L4d:
            r11 = r0
        L4e:
            if (r11 == 0) goto L54
        L50:
            goto L3b
        L51:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L54:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.b.c.a(java.lang.String):com.anythink.basead.c.c");
    }

    public final synchronized long a(com.anythink.basead.c.c cVar) {
        synchronized (this) {
            if (cVar == null) {
                return 0L;
            }
            try {
                if (b.a(this.f3693b).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", cVar.f3735a);
                contentValues.put(a.f3698e, Integer.valueOf(cVar.f3738d));
                contentValues.put("show_time", Long.valueOf(cVar.f3739e));
                contentValues.put(a.f3699g, cVar.f);
                contentValues.put(a.f3696c, Integer.valueOf(cVar.f3736b));
                contentValues.put(a.f3697d, Long.valueOf(cVar.f3737c));
                if (d(cVar.f3735a)) {
                    return b.a(this.f3693b).getWritableDatabase().update(a.f3694a, contentValues, "offer_id = '" + cVar.f3735a + "'", null);
                }
                return b.a(this.f3693b).getWritableDatabase().insert(a.f3694a, null, contentValues);
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1L;
            }
        }
    }

    private static com.anythink.basead.c.c a(Cursor cursor) {
        com.anythink.basead.c.c cVar = new com.anythink.basead.c.c();
        cVar.f3735a = cursor.getString(cursor.getColumnIndex("offer_id"));
        cVar.f3738d = cursor.getInt(cursor.getColumnIndex(a.f3698e));
        cVar.f3739e = cursor.getLong(cursor.getColumnIndex("show_time"));
        cVar.f = cursor.getString(cursor.getColumnIndex(a.f3699g));
        cVar.f3736b = cursor.getInt(cursor.getColumnIndex(a.f3696c));
        cVar.f3737c = cursor.getLong(cursor.getColumnIndex(a.f3697d));
        return cVar;
    }
}
