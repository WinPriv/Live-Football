package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.e.p;

/* loaded from: classes.dex */
public class h extends com.anythink.core.common.c.a<p> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5313b = "com.anythink.core.common.c.h";

    /* renamed from: c, reason: collision with root package name */
    private static volatile h f5314c;

    /* renamed from: d, reason: collision with root package name */
    private int f5315d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5316a = "inspect_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5317b = "inspect_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5318c = "update_time";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5319d = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, update_time INTEGER )";
    }

    private h(b bVar) {
        super(bVar);
        this.f5315d = 100;
    }

    public static h a(b bVar) {
        if (f5314c == null) {
            synchronized (h.class) {
                if (f5314c == null) {
                    f5314c = new h(bVar);
                }
            }
        }
        return f5314c;
    }

    private synchronized boolean b(String str) {
        if (str == null) {
            return false;
        }
        Cursor query = a().query(a.f5316a, new String[]{a.f5317b}, "inspect_id=?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r1 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        b().delete(com.anythink.core.common.c.h.a.f5316a, "update_time<?", new java.lang.String[]{java.lang.String.valueOf(r1)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r12.a()     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            java.lang.String r4 = "inspect_info"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "update_time DESC"
            int r11 = r12.f5315d     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            if (r0 == 0) goto L35
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            int r4 = r12.f5315d     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            if (r3 < r4) goto L35
            r0.moveToLast()     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            java.lang.String r3 = "update_time"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            long r1 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
            r0.close()     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L4b
        L35:
            if (r0 == 0) goto L51
            goto L4d
        L38:
            if (r0 == 0) goto L51
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L4e
            goto L51
        L3e:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L51
            goto L4d
        L44:
            r1 = move-exception
            if (r0 == 0) goto L4a
            r0.close()     // Catch: java.lang.Throwable -> L4e
        L4a:
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4b:
            if (r0 == 0) goto L51
        L4d:
            goto L3a
        L4e:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L51:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6e
            android.database.sqlite.SQLiteDatabase r0 = r12.b()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "inspect_info"
            java.lang.String r4 = "update_time<?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r5[r2] = r1     // Catch: java.lang.Throwable -> L6e
            r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r12)
            return
        L6e:
            monitor-exit(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.h.c():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        if (r1 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.e.p> d() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.a()     // Catch: java.lang.Throwable -> L58 java.lang.OutOfMemoryError -> L5c java.lang.Exception -> L6d
            java.lang.String r2 = "inspect_info"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58 java.lang.OutOfMemoryError -> L5c java.lang.Exception -> L6d
            if (r1 == 0) goto L51
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            if (r2 <= 0) goto L51
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
        L20:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            if (r3 == 0) goto L49
            com.anythink.core.common.e.p r3 = new com.anythink.core.common.e.p     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            java.lang.String r4 = "inspect_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            java.lang.String r5 = "update_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            long r5 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            r3.a(r4)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            r3.a(r5)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            r2.add(r3)     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            goto L20
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L59 java.lang.OutOfMemoryError -> L5d java.lang.Exception -> L6e
            r1.close()     // Catch: java.lang.Throwable -> L71
            monitor-exit(r10)
            return r2
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L71
        L56:
            monitor-exit(r10)
            return r0
        L58:
            r1 = r0
        L59:
            if (r1 == 0) goto L74
            goto L70
        L5c:
            r1 = r0
        L5d:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L74
        L62:
            r1.close()     // Catch: java.lang.Throwable -> L71
            goto L74
        L66:
            r0 = move-exception
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.lang.Throwable -> L71
        L6c:
            throw r0     // Catch: java.lang.Throwable -> L71
        L6d:
            r1 = r0
        L6e:
            if (r1 == 0) goto L74
        L70:
            goto L62
        L71:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L74:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.h.d():java.util.List");
    }

    public final synchronized long a(String str) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.f5317b, str);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (b(str)) {
                return b().update(a.f5316a, contentValues, "inspect_id = ? ", new String[]{str});
            }
            return b().insert(a.f5316a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
