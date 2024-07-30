package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e extends com.anythink.core.common.c.a<com.anythink.core.common.a.e> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f5285c;

    /* renamed from: b, reason: collision with root package name */
    private final String f5286b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5287a = "dsp_offer_install_record";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5288b = "dsp_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5289c = "dsp_offer_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5290d = "package_name";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5291e = "last_update_time";
        public static final String f = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
    }

    private e(b bVar) {
        super(bVar);
        this.f5286b = e.class.getName();
    }

    public static e a(b bVar) {
        if (f5285c == null) {
            synchronized (e.class) {
                if (f5285c == null) {
                    f5285c = new e(bVar);
                }
            }
        }
        return f5285c;
    }

    public final synchronized long a(com.anythink.core.common.a.e eVar) {
        if (b() == null) {
            return -1L;
        }
        if (!a(eVar.a(), eVar.b())) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", eVar.a());
                contentValues.put("dsp_offer_id", eVar.b());
                contentValues.put("package_name", eVar.c());
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                eVar.a();
                eVar.b();
                eVar.c();
                return b().insert(a.f5287a, null, contentValues);
            } catch (Exception unused) {
            }
        } else {
            eVar.a();
            eVar.b();
            eVar.c();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.a()     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3a
            java.lang.String r3 = "dsp_offer_install_record"
            r4 = 0
            java.lang.String r5 = "dsp_id = ?  AND dsp_offer_id = ? "
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3a
            r6[r0] = r11     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3a
            r11 = 1
            r6[r11] = r12     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3a
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3a
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3a
            if (r12 <= 0) goto L22
            r0 = r11
        L22:
            r1.close()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r10)
            return r0
        L27:
            if (r1 == 0) goto L40
            goto L3c
        L2a:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L40
        L2f:
            r1.close()     // Catch: java.lang.Throwable -> L3d
            goto L40
        L33:
            r11 = move-exception
            if (r1 == 0) goto L39
            r1.close()     // Catch: java.lang.Throwable -> L3d
        L39:
            throw r11     // Catch: java.lang.Throwable -> L3d
        L3a:
            if (r1 == 0) goto L40
        L3c:
            goto L2f
        L3d:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L40:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.e.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
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
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            if (r12 > 0) goto La
            monitor-exit(r11)
            return r0
        La:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.a()     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L33 java.lang.Exception -> L40
            java.lang.String r3 = "dsp_offer_install_record"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "last_update_time DESC"
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L33 java.lang.Exception -> L40
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L33 java.lang.Exception -> L40
            java.util.List r12 = r11.a(r1)     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L33 java.lang.Exception -> L40
            r12.size()     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L33 java.lang.Exception -> L40
            r0.addAll(r12)     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L33 java.lang.Exception -> L40
            if (r1 == 0) goto L43
        L2c:
            r1.close()     // Catch: java.lang.Throwable -> L45
            goto L43
        L30:
            if (r1 == 0) goto L43
            goto L2c
        L33:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L43
            goto L2c
        L39:
            r12 = move-exception
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.lang.Throwable -> L45
        L3f:
            throw r12     // Catch: java.lang.Throwable -> L45
        L40:
            if (r1 == 0) goto L43
            goto L2c
        L43:
            monitor-exit(r11)
            return r0
        L45:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.e.a(int):java.util.List");
    }

    private synchronized List<com.anythink.core.common.a.e> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.e eVar = new com.anythink.core.common.a.e();
                        eVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        eVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        eVar.c(cursor.getString(cursor.getColumnIndex("package_name")));
                        arrayList.add(eVar);
                    } catch (Throwable unused) {
                    }
                }
                cursor.close();
            }
        }
        return arrayList;
    }
}
