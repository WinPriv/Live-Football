package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.e.ae;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class l extends com.anythink.core.common.c.a<ae> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile l f5348c;

    /* renamed from: b, reason: collision with root package name */
    private final String f5349b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5350a = "placement_ad_impression";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5351b = "format";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5352c = "placement_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5353d = "adsource_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5354e = "hour_time";
        public static final String f = "hour_imp";

        /* renamed from: g, reason: collision with root package name */
        public static final String f5355g = "date_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f5356h = "date_imp";

        /* renamed from: i, reason: collision with root package name */
        public static final String f5357i = "show_time";

        /* renamed from: j, reason: collision with root package name */
        public static final String f5358j = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
    }

    private l(b bVar) {
        super(bVar);
        this.f5349b = l.class.getName();
    }

    public static l a(b bVar) {
        if (f5348c == null) {
            synchronized (l.class) {
                if (f5348c == null) {
                    f5348c = new l(bVar);
                }
            }
        }
        return f5348c;
    }

    private boolean b(String str) {
        Cursor query = a().query(a.f5350a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private static ae.a b(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        cursor.moveToNext();
        ae.a aVar = new ae.a();
        aVar.f5462a = cursor.getString(cursor.getColumnIndex("adsource_id"));
        aVar.f5463b = cursor.getString(cursor.getColumnIndex(a.f5354e));
        aVar.f5464c = cursor.getString(cursor.getColumnIndex(a.f5355g));
        if (!TextUtils.equals(aVar.f5463b, str2)) {
            aVar.f5466e = 0;
        } else {
            aVar.f5466e = cursor.getInt(cursor.getColumnIndex(a.f));
        }
        if (!TextUtils.equals(aVar.f5464c, str)) {
            aVar.f5465d = 0;
        } else {
            aVar.f5465d = cursor.getInt(cursor.getColumnIndex(a.f5356h));
        }
        aVar.f = cursor.getLong(cursor.getColumnIndex("show_time"));
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        if (r1 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.Map<java.lang.String, com.anythink.core.common.e.ae> a(int r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.l.a(int, java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r11 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r11 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r11 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.e.ae a(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.l.a(java.lang.String, java.lang.String, java.lang.String):com.anythink.core.common.e.ae");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r11 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r11 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r11 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.e.ae.a a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.a()     // Catch: java.lang.Throwable -> L91 java.lang.OutOfMemoryError -> L95 java.lang.Exception -> La6
            java.lang.String r2 = "placement_ad_impression"
            r3 = 0
            java.lang.String r4 = "adsource_id=? AND placement_id=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L91 java.lang.OutOfMemoryError -> L95 java.lang.Exception -> La6
            r9 = 0
            r5[r9] = r12     // Catch: java.lang.Throwable -> L91 java.lang.OutOfMemoryError -> L95 java.lang.Exception -> La6
            r12 = 1
            r5[r12] = r11     // Catch: java.lang.Throwable -> L91 java.lang.OutOfMemoryError -> L95 java.lang.Exception -> La6
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L91 java.lang.OutOfMemoryError -> L95 java.lang.Exception -> La6
            if (r11 == 0) goto L8a
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            if (r12 <= 0) goto L8a
            r11.moveToNext()     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            com.anythink.core.common.e.ae$a r12 = new com.anythink.core.common.e.ae$a     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = "adsource_id"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.f5462a = r1     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = "hour_time"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.f5463b = r1     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = "date_time"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.f5464c = r1     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            java.lang.String r1 = r12.f5463b     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            boolean r14 = android.text.TextUtils.equals(r1, r14)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            if (r14 != 0) goto L5a
            r12.f5466e = r9     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            goto L66
        L5a:
            java.lang.String r14 = "hour_imp"
            int r14 = r11.getColumnIndex(r14)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            int r14 = r11.getInt(r14)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.f5466e = r14     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
        L66:
            java.lang.String r14 = r12.f5464c     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            boolean r13 = android.text.TextUtils.equals(r14, r13)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            if (r13 != 0) goto L71
            r12.f5465d = r9     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            goto L7d
        L71:
            java.lang.String r13 = "date_imp"
            int r13 = r11.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            int r13 = r11.getInt(r13)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.f5465d = r13     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
        L7d:
            java.lang.String r13 = "show_time"
            int r13 = r11.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            long r13 = r11.getLong(r13)     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r12.f = r13     // Catch: java.lang.Throwable -> L92 java.lang.OutOfMemoryError -> L96 java.lang.Exception -> La7
            r0 = r12
        L8a:
            if (r11 == 0) goto L8f
            r11.close()     // Catch: java.lang.Throwable -> Laa
        L8f:
            monitor-exit(r10)
            return r0
        L91:
            r11 = r0
        L92:
            if (r11 == 0) goto Lad
            goto La9
        L95:
            r11 = r0
        L96:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L9f
            if (r11 == 0) goto Lad
        L9b:
            r11.close()     // Catch: java.lang.Throwable -> Laa
            goto Lad
        L9f:
            r12 = move-exception
            if (r11 == 0) goto La5
            r11.close()     // Catch: java.lang.Throwable -> Laa
        La5:
            throw r12     // Catch: java.lang.Throwable -> Laa
        La6:
            r11 = r0
        La7:
            if (r11 == 0) goto Lad
        La9:
            goto L9b
        Laa:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        Lad:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.l.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.anythink.core.common.e.ae$a");
    }

    public final synchronized long a(int i10, String str, ae.a aVar) {
        boolean z10;
        if (b() == null || aVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i10));
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", aVar.f5462a);
            contentValues.put(a.f5354e, aVar.f5463b);
            contentValues.put(a.f, Integer.valueOf(aVar.f5466e));
            contentValues.put(a.f5355g, aVar.f5464c);
            contentValues.put(a.f5356h, Integer.valueOf(aVar.f5465d));
            contentValues.put("show_time", Long.valueOf(aVar.f));
            Cursor query = a().query(a.f5350a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{aVar.f5462a}, "adsource_id", null, null);
            if (query == null || query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                z10 = false;
            } else {
                query.close();
                z10 = true;
            }
            if (z10) {
                return b().update(a.f5350a, contentValues, "adsource_id = ? ", new String[]{aVar.f5462a});
            }
            return b().insert(a.f5350a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static ae a(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        ae aeVar = new ae();
        aeVar.f = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            aeVar.f5457a = cursor.getInt(cursor.getColumnIndex("format"));
            aeVar.f5458b = cursor.getString(cursor.getColumnIndex("placement_id"));
            ae.a aVar = new ae.a();
            aVar.f5462a = cursor.getString(cursor.getColumnIndex("adsource_id"));
            aVar.f5463b = cursor.getString(cursor.getColumnIndex(a.f5354e));
            aVar.f5464c = cursor.getString(cursor.getColumnIndex(a.f5355g));
            if (!TextUtils.equals(aVar.f5463b, str2)) {
                aVar.f5466e = 0;
            } else {
                aVar.f5466e = cursor.getInt(cursor.getColumnIndex(a.f));
            }
            aeVar.f5460d += aVar.f5466e;
            if (!TextUtils.equals(aVar.f5464c, str)) {
                aVar.f5465d = 0;
            } else {
                aVar.f5465d = cursor.getInt(cursor.getColumnIndex(a.f5356h));
            }
            aeVar.f5459c += aVar.f5465d;
            long j10 = cursor.getLong(cursor.getColumnIndex("show_time"));
            aVar.f = j10;
            if (j10 >= aeVar.f5461e) {
                aeVar.f5461e = j10;
            }
            aeVar.f.put(aVar.f5462a, aVar);
        }
        cursor.close();
        return aeVar;
    }

    public final void a(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "date_time!='" + str + "'";
            } catch (Exception unused) {
            }
            if (b() == null) {
                return;
            }
            b().delete(a.f5350a, str2, null);
        }
    }
}
