package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.e.af;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d extends com.anythink.core.common.c.a<af> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5278b = "com.anythink.core.common.c.d";

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f5279c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5280a = "sdkconfig";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5281b = "key";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5282c = "type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5283d = "value";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5284e = "lastupdatetime";
        public static final String f = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
    }

    private d(b bVar) {
        super(bVar);
    }

    public static d a(b bVar) {
        if (f5279c == null) {
            synchronized (d.class) {
                if (f5279c == null) {
                    f5279c = new d(bVar);
                }
            }
        }
        return f5279c;
    }

    private synchronized boolean b(String str, String str2) {
        Cursor query = a().query(a.f5280a, new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private synchronized void c(String str, String str2) {
        List<af> c10 = c(str, str2, af.a.f5471a);
        if (c10 != null && c10.size() > 0) {
            for (af afVar : c10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Integer.parseInt(afVar.d()) + 1);
                afVar.d(sb2.toString());
                a(afVar);
            }
            return;
        }
        af afVar2 = new af();
        afVar2.a(str2);
        afVar2.d("1");
        afVar2.c(af.a.f5471a);
        afVar2.b(str);
        a(afVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
    
        if (r10 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.anythink.core.common.e.af> d(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.a()     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "key != ? and type = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            r10 = 1
            r5[r10] = r11     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            java.util.List r11 = r9.a(r10)     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3c
            if (r10 == 0) goto L24
            r10.close()     // Catch: java.lang.Throwable -> L3f
        L24:
            monitor-exit(r9)
            return r11
        L26:
            r10 = r0
        L27:
            if (r10 == 0) goto L42
            goto L3e
        L2a:
            r10 = r0
        L2b:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L42
        L30:
            r10.close()     // Catch: java.lang.Throwable -> L3f
            goto L42
        L34:
            r11 = move-exception
            if (r10 == 0) goto L3a
            r10.close()     // Catch: java.lang.Throwable -> L3f
        L3a:
            throw r11     // Catch: java.lang.Throwable -> L3f
        L3b:
            r10 = r0
        L3c:
            if (r10 == 0) goto L42
        L3e:
            goto L30
        L3f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L42:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.d.d(java.lang.String, java.lang.String):java.util.List");
    }

    private synchronized boolean b(String str, String str2, String str3) {
        Cursor query = a().query(a.f5280a, new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized long a(String str, String str2, String str3) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            contentValues.put(a.f5284e, sb2.toString());
            if (b(str, str3)) {
                return b().update(a.f5280a, contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return b().insert(a.f5280a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0024, code lost:
    
        if (r10 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.anythink.core.common.e.af> b(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.a()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "type = ?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            java.util.List r0 = r9.a(r10)     // Catch: java.lang.Throwable -> L24 java.lang.OutOfMemoryError -> L28 java.lang.Exception -> L39
            if (r10 == 0) goto L21
            r10.close()     // Catch: java.lang.Throwable -> L3c
        L21:
            monitor-exit(r9)
            return r0
        L23:
            r10 = r0
        L24:
            if (r10 == 0) goto L3f
            goto L3b
        L27:
            r10 = r0
        L28:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L3f
        L2d:
            r10.close()     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L31:
            r0 = move-exception
            if (r10 == 0) goto L37
            r10.close()     // Catch: java.lang.Throwable -> L3c
        L37:
            throw r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r10 = r0
        L39:
            if (r10 == 0) goto L3f
        L3b:
            goto L2d
        L3c:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L3f:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.d.b(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        if (r10 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.anythink.core.common.e.af> c(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.a()     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3e
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "key = ? and type = ? and lastupdatetime = ?"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3e
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3e
            r10 = 1
            r5[r10] = r12     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3e
            r10 = 2
            r5[r10] = r11     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3e
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3e
            java.util.List r11 = r9.a(r10)     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            if (r10 == 0) goto L27
            r10.close()     // Catch: java.lang.Throwable -> L42
        L27:
            monitor-exit(r9)
            return r11
        L29:
            r10 = r0
        L2a:
            if (r10 == 0) goto L45
            goto L41
        L2d:
            r10 = r0
        L2e:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L37
            if (r10 == 0) goto L45
        L33:
            r10.close()     // Catch: java.lang.Throwable -> L42
            goto L45
        L37:
            r11 = move-exception
            if (r10 == 0) goto L3d
            r10.close()     // Catch: java.lang.Throwable -> L42
        L3d:
            throw r11     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r0
        L3f:
            if (r10 == 0) goto L45
        L41:
            goto L33
        L42:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L45:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.d.c(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    private synchronized long a(af afVar) {
        if (b() == null || afVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", afVar.b());
            contentValues.put("type", afVar.c());
            contentValues.put("value", afVar.d());
            contentValues.put(a.f5284e, afVar.a());
            if (b(afVar.b(), afVar.a(), afVar.c())) {
                return b().update(a.f5280a, contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{afVar.b(), afVar.c(), afVar.a()});
            }
            return b().insert(a.f5280a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized List<af> a(Cursor cursor) {
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    af afVar = new af();
                    afVar.b(cursor.getString(cursor.getColumnIndex("key")));
                    afVar.c(cursor.getString(cursor.getColumnIndex("type")));
                    afVar.d(cursor.getString(cursor.getColumnIndex("value")));
                    afVar.a(cursor.getString(cursor.getColumnIndex(a.f5284e)));
                    arrayList.add(afVar);
                }
                cursor.close();
                return arrayList;
            }
        }
        return null;
    }

    private synchronized void a(String str) {
        try {
            if (b() == null) {
                return;
            }
            b().delete(a.f5280a, "lastupdatetime< ? and type = ?", new String[]{str, af.a.f5471a});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
    
        if (r10 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.e.af> a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.a()     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "key = ? and type = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            r10 = 1
            r5[r10] = r11     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3b
            java.util.List r11 = r9.a(r10)     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3c
            if (r10 == 0) goto L24
            r10.close()     // Catch: java.lang.Throwable -> L3f
        L24:
            monitor-exit(r9)
            return r11
        L26:
            r10 = r0
        L27:
            if (r10 == 0) goto L42
            goto L3e
        L2a:
            r10 = r0
        L2b:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L42
        L30:
            r10.close()     // Catch: java.lang.Throwable -> L3f
            goto L42
        L34:
            r11 = move-exception
            if (r10 == 0) goto L3a
            r10.close()     // Catch: java.lang.Throwable -> L3f
        L3a:
            throw r11     // Catch: java.lang.Throwable -> L3f
        L3b:
            r10 = r0
        L3c:
            if (r10 == 0) goto L42
        L3e:
            goto L30
        L3f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L42:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.d.a(java.lang.String, java.lang.String):java.util.List");
    }
}
