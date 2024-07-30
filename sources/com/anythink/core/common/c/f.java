package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f extends com.anythink.core.common.c.a<com.anythink.core.common.a.f> {

    /* renamed from: d, reason: collision with root package name */
    private static volatile f f5292d;

    /* renamed from: b, reason: collision with root package name */
    private final String f5293b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5294c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5295a = "dsp_offer_show_record";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5296b = "dsp_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5297c = "dsp_offer_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5298d = "show_limit";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5299e = "show_count";
        public static final String f = "create_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f5300g = "last_update_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f5301h = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";
    }

    private f(b bVar) {
        super(bVar);
        this.f5293b = f.class.getName();
        this.f5294c = 86400000L;
    }

    public static f a(b bVar) {
        if (f5292d == null) {
            synchronized (f.class) {
                if (f5292d == null) {
                    f5292d = new f(bVar);
                }
            }
        }
        return f5292d;
    }

    public final synchronized long b(com.anythink.core.common.a.f fVar) {
        if (b() == null) {
            return -1L;
        }
        if (fVar.c() <= 0) {
            return -1L;
        }
        com.anythink.core.common.a.f a10 = a(fVar.a(), fVar.b());
        if (a10 != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", fVar.a());
                contentValues.put("dsp_offer_id", fVar.b());
                contentValues.put(a.f5298d, Integer.valueOf(fVar.c()));
                contentValues.put("show_count", Integer.valueOf(a10.d() + 1));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                fVar.a();
                fVar.b();
                a10.d();
                fVar.c();
                return b().update(a.f5295a, contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{fVar.a(), fVar.b()});
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void c() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - 86400000);
            if (b() == null) {
                return;
            }
            b().delete(a.f5295a, str, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long a(com.anythink.core.common.a.f fVar) {
        if (b() == null) {
            return -1L;
        }
        if (fVar.c() <= 0) {
            return -1L;
        }
        if (a(fVar.a(), fVar.b()) == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("dsp_id", fVar.a());
            contentValues.put("dsp_offer_id", fVar.b());
            contentValues.put(a.f5298d, Integer.valueOf(fVar.c()));
            contentValues.put("show_count", (Integer) 0);
            contentValues.put(a.f, Long.valueOf(System.currentTimeMillis()));
            contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
            fVar.a();
            fVar.b();
            return b().insert(a.f5295a, null, contentValues);
        }
        fVar.a();
        fVar.b();
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        if (r11 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.anythink.core.common.a.f a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.a()     // Catch: java.lang.Throwable -> L35 java.lang.OutOfMemoryError -> L3c java.lang.Exception -> L4a
            java.lang.String r2 = "dsp_offer_show_record"
            r3 = 0
            java.lang.String r4 = "dsp_id = ?  AND dsp_offer_id = ? "
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L35 java.lang.OutOfMemoryError -> L3c java.lang.Exception -> L4a
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L35 java.lang.OutOfMemoryError -> L3c java.lang.Exception -> L4a
            r11 = 1
            r5[r11] = r12     // Catch: java.lang.Throwable -> L35 java.lang.OutOfMemoryError -> L3c java.lang.Exception -> L4a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.OutOfMemoryError -> L3c java.lang.Exception -> L4a
            java.util.List r12 = r10.a(r11)     // Catch: java.lang.Throwable -> L36 java.lang.OutOfMemoryError -> L3d java.lang.Exception -> L4b
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L36 java.lang.OutOfMemoryError -> L3d java.lang.Exception -> L4b
            if (r1 <= 0) goto L32
            java.lang.Object r12 = r12.get(r9)     // Catch: java.lang.Throwable -> L36 java.lang.OutOfMemoryError -> L3d java.lang.Exception -> L4b
            com.anythink.core.common.a.f r12 = (com.anythink.core.common.a.f) r12     // Catch: java.lang.Throwable -> L36 java.lang.OutOfMemoryError -> L3d java.lang.Exception -> L4b
            if (r11 == 0) goto L30
            r11.close()     // Catch: java.lang.Throwable -> L4e
        L30:
            monitor-exit(r10)
            return r12
        L32:
            if (r11 == 0) goto L51
            goto L4d
        L35:
            r11 = r0
        L36:
            if (r11 == 0) goto L51
        L38:
            r11.close()     // Catch: java.lang.Throwable -> L4e
            goto L51
        L3c:
            r11 = r0
        L3d:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L43
            if (r11 == 0) goto L51
            goto L4d
        L43:
            r12 = move-exception
            if (r11 == 0) goto L49
            r11.close()     // Catch: java.lang.Throwable -> L4e
        L49:
            throw r12     // Catch: java.lang.Throwable -> L4e
        L4a:
            r11 = r0
        L4b:
            if (r11 == 0) goto L51
        L4d:
            goto L38
        L4e:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L51:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.f.a(java.lang.String, java.lang.String):com.anythink.core.common.a.f");
    }

    private synchronized List<com.anythink.core.common.a.f> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.f fVar = new com.anythink.core.common.a.f();
                        fVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        fVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        fVar.a(cursor.getInt(cursor.getColumnIndex(a.f5298d)));
                        fVar.b(cursor.getInt(cursor.getColumnIndex("show_count")));
                        arrayList.add(fVar);
                    } catch (Throwable unused) {
                    }
                }
                cursor.close();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.a.d> a(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            if (r12 > 0) goto La
            monitor-exit(r11)
            return r0
        La:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.a()     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L34 java.lang.Exception -> L41
            java.lang.String r3 = "dsp_offer_show_record"
            r4 = 0
            java.lang.String r5 = "show_count > show_limit"
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "last_update_time DESC"
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L34 java.lang.Exception -> L41
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L34 java.lang.Exception -> L41
            java.util.List r12 = r11.a(r1)     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L34 java.lang.Exception -> L41
            r12.size()     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L34 java.lang.Exception -> L41
            r0.addAll(r12)     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L34 java.lang.Exception -> L41
            if (r1 == 0) goto L44
        L2d:
            r1.close()     // Catch: java.lang.Throwable -> L46
            goto L44
        L31:
            if (r1 == 0) goto L44
            goto L2d
        L34:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L44
            goto L2d
        L3a:
            r12 = move-exception
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.lang.Throwable -> L46
        L40:
            throw r12     // Catch: java.lang.Throwable -> L46
        L41:
            if (r1 == 0) goto L44
            goto L2d
        L44:
            monitor-exit(r11)
            return r0
        L46:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.f.a(int):java.util.List");
    }
}
