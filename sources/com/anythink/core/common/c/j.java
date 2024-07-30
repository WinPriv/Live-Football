package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.e.x;

/* loaded from: classes.dex */
public class j extends com.anythink.core.common.c.a<x> {

    /* renamed from: c, reason: collision with root package name */
    private static j f5332c;

    /* renamed from: b, reason: collision with root package name */
    private final String f5333b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5334a = "offer_action_record";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5335b = "adsource_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5336c = "type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5337d = "unit_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5338e = "click_count";
        public static final String f = "show_count";

        /* renamed from: g, reason: collision with root package name */
        public static final String f5339g = "expire_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f5340h = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";
    }

    private j(b bVar) {
        super(bVar);
        this.f5333b = j.class.getName();
    }

    public static j a(b bVar) {
        if (f5332c == null) {
            synchronized (j.class) {
                if (f5332c == null) {
                    f5332c = new j(bVar);
                }
            }
        }
        return f5332c;
    }

    private static String b(int i10) {
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder((i10 * 2) - 1);
            sb2.append("?");
            for (int i11 = 1; i11 < i10; i11++) {
                sb2.append(",?");
            }
            return sb2.toString();
        }
        throw new RuntimeException("No placeholders");
    }

    private boolean c(String str, int i10, String str2) {
        Cursor query = a().query(a.f5334a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i10), str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private synchronized long b(String str, int i10, String str2) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("adsource_id", str);
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("unit_id", str2);
            x a10 = a(i10, str2);
            if (a10 != null) {
                contentValues.put(a.f5338e, Integer.valueOf(a10.d()));
                contentValues.put("show_count", Integer.valueOf(a10.c()));
                contentValues.put("expire_time", Long.valueOf(a10.b()));
            } else {
                contentValues.put(a.f5338e, (Integer) 0);
                contentValues.put("show_count", (Integer) 0);
                contentValues.put("expire_time", (Integer) (-1));
            }
            return b().insert(a.f5334a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized void a(int i10, String str, int i11, int i12) {
        x a10 = a(i10, str);
        if (a10 != null) {
            a10.b(a10.d() + i11);
            a10.a(a10.c() + i12);
            a(a10);
        }
    }

    public final synchronized void a(int i10, String str, long j10) {
        x a10 = a(i10, str);
        if (a10 != null) {
            a10.a(System.currentTimeMillis() + j10);
            a(a10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.e.x> a(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            r0.<init>()     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.a()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r3 = "offer_action_record"
            r4 = 0
            java.lang.String r5 = "type = ? and expire_time > ?"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r8 = 1
            r6[r8] = r7     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            if (r1 == 0) goto L74
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            if (r2 <= 0) goto L74
        L34:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            if (r2 == 0) goto L74
            com.anythink.core.common.e.x r2 = new com.anythink.core.common.e.x     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r3 = "unit_id"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r3 = "click_count"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r2.b(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r3 = "show_count"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r2.a(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            java.lang.String r3 = "expire_time"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r2.a(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            r0.add(r2)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8a
            goto L34
        L74:
            if (r1 == 0) goto L8d
        L76:
            r1.close()     // Catch: java.lang.Throwable -> L8f
            goto L8d
        L7a:
            if (r1 == 0) goto L8d
            goto L76
        L7d:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L8d
            goto L76
        L83:
            r11 = move-exception
            if (r1 == 0) goto L89
            r1.close()     // Catch: java.lang.Throwable -> L8f
        L89:
            throw r11     // Catch: java.lang.Throwable -> L8f
        L8a:
            if (r1 == 0) goto L8d
            goto L76
        L8d:
            monitor-exit(r10)
            return r0
        L8f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.j.a(int):java.util.List");
    }

    private boolean b(int i10, String str) {
        Cursor query = a().query(a.f5334a, null, "type = ? and unit_id = ?", new String[]{String.valueOf(i10), str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.e.x> a(java.util.List<java.lang.String> r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            r0.<init>()     // Catch: java.lang.Throwable -> Lbf
            int r1 = r12.size()     // Catch: java.lang.Throwable -> Lbf
            b(r1)     // Catch: java.lang.Throwable -> Lbf
            r1 = 0
            int r2 = r12.size()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r2 = r2 + 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r12.toArray(r7)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r2 = r12.size()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r7[r2] = r3     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r2 = r12.size()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r2 = r2 + 1
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r7[r2] = r3     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            android.database.sqlite.SQLiteDatabase r3 = r11.a()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r4 = "offer_action_record"
            r5 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r6 = "adsource_id IN ("
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r12 = r12.size()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r12 = b(r12)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r2.append(r12)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r12 = ") and type = ? and expire_time > ?"
            r2.append(r12)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            if (r1 == 0) goto La4
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            if (r12 <= 0) goto La4
        L64:
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            if (r12 == 0) goto La4
            com.anythink.core.common.e.x r12 = new com.anythink.core.common.e.x     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r2 = "unit_id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r12.<init>(r13, r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r2 = "click_count"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r12.b(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r2 = "show_count"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r12.a(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            java.lang.String r2 = "expire_time"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r12.a(r2)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            r0.add(r12)     // Catch: java.lang.Throwable -> Laa java.lang.OutOfMemoryError -> Lad java.lang.Exception -> Lba
            goto L64
        La4:
            if (r1 == 0) goto Lbd
        La6:
            r1.close()     // Catch: java.lang.Throwable -> Lbf
            goto Lbd
        Laa:
            if (r1 == 0) goto Lbd
            goto La6
        Lad:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lbd
            goto La6
        Lb3:
            r12 = move-exception
            if (r1 == 0) goto Lb9
            r1.close()     // Catch: java.lang.Throwable -> Lbf
        Lb9:
            throw r12     // Catch: java.lang.Throwable -> Lbf
        Lba:
            if (r1 == 0) goto Lbd
            goto La6
        Lbd:
            monitor-exit(r11)
            return r0
        Lbf:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.j.a(java.util.List, int):java.util.List");
    }

    private synchronized long a(x xVar) {
        if (b() == null || xVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(xVar.e()));
            contentValues.put("unit_id", xVar.a());
            contentValues.put(a.f5338e, Integer.valueOf(xVar.d()));
            contentValues.put("show_count", Integer.valueOf(xVar.c()));
            contentValues.put("expire_time", Long.valueOf(xVar.b()));
            return b().update(a.f5334a, contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(xVar.e()), xVar.a()});
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r1 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.anythink.core.common.e.x a(int r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.a()     // Catch: java.lang.Throwable -> L65 java.lang.OutOfMemoryError -> L69 java.lang.Exception -> L7a
            java.lang.String r2 = "offer_action_record"
            r3 = 0
            java.lang.String r4 = "type=? and unit_id = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L65 java.lang.OutOfMemoryError -> L69 java.lang.Exception -> L7a
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L65 java.lang.OutOfMemoryError -> L69 java.lang.Exception -> L7a
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L65 java.lang.OutOfMemoryError -> L69 java.lang.Exception -> L7a
            r6 = 1
            r5[r6] = r11     // Catch: java.lang.Throwable -> L65 java.lang.OutOfMemoryError -> L69 java.lang.Exception -> L7a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L65 java.lang.OutOfMemoryError -> L69 java.lang.Exception -> L7a
            if (r1 == 0) goto L5e
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            if (r2 <= 0) goto L5e
            r1.moveToNext()     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            com.anythink.core.common.e.x r2 = new com.anythink.core.common.e.x     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            r2.<init>(r10, r11)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            java.lang.String r10 = "click_count"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            r2.b(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            java.lang.String r10 = "show_count"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            r2.a(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            java.lang.String r10 = "expire_time"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            long r10 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            r2.a(r10)     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            r1.close()     // Catch: java.lang.Throwable -> L66 java.lang.OutOfMemoryError -> L6a java.lang.Exception -> L7b
            r1.close()     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r9)
            return r2
        L5e:
            if (r1 == 0) goto L63
            r1.close()     // Catch: java.lang.Throwable -> L7e
        L63:
            monitor-exit(r9)
            return r0
        L65:
            r1 = r0
        L66:
            if (r1 == 0) goto L81
            goto L7d
        L69:
            r1 = r0
        L6a:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L81
        L6f:
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L81
        L73:
            r10 = move-exception
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Throwable -> L7e
        L79:
            throw r10     // Catch: java.lang.Throwable -> L7e
        L7a:
            r1 = r0
        L7b:
            if (r1 == 0) goto L81
        L7d:
            goto L6f
        L7e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L81:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.j.a(int, java.lang.String):com.anythink.core.common.e.x");
    }

    public final synchronized void a(String str, int i10, String str2) {
        boolean z10 = false;
        Cursor query = a().query(a.f5334a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i10), str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            z10 = true;
        } else if (query != null) {
            query.close();
        }
        if (!z10) {
            b(str, i10, str2);
        }
    }
}
