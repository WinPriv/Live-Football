package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class m extends com.anythink.core.common.c.a<com.anythink.core.common.a.i> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile m f5359c;

    /* renamed from: b, reason: collision with root package name */
    private final String f5360b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5361a = "video_res_cache_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5362b = "video_url";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5363c = "file_path";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5364d = "ready_rate";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5365e = "download_size";
        public static final String f = "total_size";

        /* renamed from: g, reason: collision with root package name */
        public static final String f5366g = "update_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f5367h = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";
    }

    private m(b bVar) {
        super(bVar);
        this.f5360b = com.anythink.expressad.d.a.b.dH;
    }

    public static m a(b bVar) {
        if (f5359c == null) {
            synchronized (k.class) {
                if (f5359c == null) {
                    f5359c = new m(bVar);
                }
            }
        }
        return f5359c;
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Cursor query = a().query(a.f5361a, new String[]{"video_url"}, "video_url=?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            b().update(a.f5361a, contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public final long c() {
        try {
            Cursor rawQuery = a().rawQuery("SELECT sum(download_size) FROM video_res_cache_info", null);
            if (rawQuery.moveToNext()) {
                return rawQuery.getLong(0);
            }
            return 0L;
        } catch (Throwable th) {
            th.getMessage();
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        r0.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.anythink.core.common.a.i> d() {
        /*
            r10 = this;
            java.lang.String r0 = "update_time"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r10.a()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = "video_res_cache_info"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "update_time DESC"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb3
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb3
            if (r3 <= 0) goto Lb7
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb3
            double r3 = (double) r3     // Catch: java.lang.Throwable -> Lb3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r5
            double r3 = r3 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r5
            long r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> Lb3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lb3
            r4 = 1
            int r3 = r3 - r4
            boolean r3 = r2.moveToPosition(r3)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto Lb7
            int r3 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb3
            long r5 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lb3
        L3f:
            com.anythink.core.common.a.i r3 = new com.anythink.core.common.a.i     // Catch: java.lang.Throwable -> Lb3
            r3.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "video_url"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = r2.getString(r7)     // Catch: java.lang.Throwable -> Lb3
            r3.a(r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "file_path"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = r2.getString(r7)     // Catch: java.lang.Throwable -> Lb3
            r3.b(r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "ready_rate"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb3
            int r7 = r2.getInt(r7)     // Catch: java.lang.Throwable -> Lb3
            r3.a(r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "download_size"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb3
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb3
            r3.b(r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "total_size"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb3
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb3
            r3.a(r7)     // Catch: java.lang.Throwable -> Lb3
            int r7 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb3
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb3
            r3.c(r7)     // Catch: java.lang.Throwable -> Lb3
            r1.add(r3)     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb3
            if (r3 != 0) goto L3f
            android.database.sqlite.SQLiteDatabase r0 = r10.b()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "video_res_cache_info"
            java.lang.String r3 = "update_time<=?"
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lae
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> Lae
            r0.delete(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            goto Lb7
        Lae:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r0 = move-exception
            r0.getMessage()
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.m.d():java.util.List");
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            b().delete(a.f5361a, "video_url=?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:9:0x0010, B:11:0x0050, B:13:0x006b, B:15:0x0071, B:17:0x007e, B:21:0x008f, B:25:0x0078), top: B:8:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:9:0x0010, B:11:0x0050, B:13:0x006b, B:15:0x0071, B:17:0x007e, B:21:0x008f, B:25:0x0078), top: B:8:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r14, java.lang.String r15, long r16, long r18, int r20) {
        /*
            r13 = this;
            r0 = r14
            monitor-enter(r13)
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L9d
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L10
            goto L9d
        L10:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "video_url"
            r1.put(r2, r14)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "file_path"
            r3 = r15
            r1.put(r2, r15)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "ready_rate"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> L9b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "download_size"
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> L9b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "total_size"
            java.lang.Long r3 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L9b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "update_time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L9b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L9b
            boolean r2 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L7b
            android.database.sqlite.SQLiteDatabase r5 = r13.a()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "video_res_cache_info"
            java.lang.String r2 = "video_url"
            java.lang.String[] r7 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = "video_url=?"
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9b
            r9[r4] = r0     // Catch: java.lang.Throwable -> L9b
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L76
            int r5 = r2.getCount()     // Catch: java.lang.Throwable -> L9b
            if (r5 <= 0) goto L76
            r2.close()     // Catch: java.lang.Throwable -> L9b
            r2 = r3
            goto L7c
        L76:
            if (r2 == 0) goto L7b
            r2.close()     // Catch: java.lang.Throwable -> L9b
        L7b:
            r2 = r4
        L7c:
            if (r2 == 0) goto L8f
            java.lang.String r2 = "video_url = ? "
            android.database.sqlite.SQLiteDatabase r5 = r13.b()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "video_res_cache_info"
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9b
            r3[r4] = r0     // Catch: java.lang.Throwable -> L9b
            r5.update(r6, r1, r2, r3)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r13)
            return
        L8f:
            android.database.sqlite.SQLiteDatabase r0 = r13.b()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "video_res_cache_info"
            r3 = 0
            r0.insert(r2, r3, r1)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r13)
            return
        L9b:
            monitor-exit(r13)
            return
        L9d:
            monitor-exit(r13)
            return
        L9f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.m.a(java.lang.String, java.lang.String, long, long, int):void");
    }

    private void d(String str) {
        try {
            a().query(a.f5361a, null, null, null, null, null, null).getCount();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final com.anythink.core.common.a.i a(String str) {
        try {
            Cursor query = a().query(a.f5361a, null, "video_url=?", new String[]{str}, null, null, null);
            if (query.moveToNext()) {
                com.anythink.core.common.a.i iVar = new com.anythink.core.common.a.i();
                iVar.a(str);
                iVar.b(query.getString(query.getColumnIndex(a.f5363c)));
                iVar.a(query.getInt(query.getColumnIndex("ready_rate")));
                iVar.b(query.getLong(query.getColumnIndex(a.f5365e)));
                iVar.a(query.getLong(query.getColumnIndex(a.f)));
                iVar.c(query.getLong(query.getColumnIndex("update_time")));
                return iVar;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
