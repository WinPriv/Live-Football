package com.anythink.core.common.c;

import com.anythink.core.common.e.o;

/* loaded from: classes.dex */
public class g extends com.anythink.core.common.c.a<o> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5302b = "com.anythink.core.common.c.g";

    /* renamed from: c, reason: collision with root package name */
    private static g f5303c;

    /* renamed from: d, reason: collision with root package name */
    private int f5304d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5305a = "request_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5306b = "id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5307c = "req_type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5308d = "req_url";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5309e = "req_head";
        public static final String f = "req_content";

        /* renamed from: g, reason: collision with root package name */
        public static final String f5310g = "time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f5311h = "extra";

        /* renamed from: i, reason: collision with root package name */
        public static final String f5312i = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )";
    }

    private g(b bVar) {
        super(bVar);
        this.f5304d = 1000;
    }

    public static g a(b bVar) {
        if (f5303c == null) {
            synchronized (g.class) {
                if (f5303c == null) {
                    f5303c = new g(bVar);
                }
            }
        }
        return f5303c;
    }

    private synchronized void d() {
        try {
            if (b() == null) {
                return;
            }
            b().delete(a.f5305a, null, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized int b(o oVar) {
        if (b() == null || oVar == null) {
            return -1;
        }
        try {
            return b().delete(a.f5305a, "id=?", new String[]{oVar.f5723a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r1 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.e.o> c() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.a()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L98 java.lang.Exception -> La9
            java.lang.String r2 = "request_info"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "time"
            java.lang.String r9 = "10"
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L98 java.lang.Exception -> La9
            if (r1 == 0) goto L8d
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            if (r2 <= 0) goto L8d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r2.<init>()     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
        L22:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            if (r3 == 0) goto L85
            com.anythink.core.common.e.o r3 = new com.anythink.core.common.e.o     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.<init>()     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f5723a = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "req_type"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            int r4 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f5724b = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "req_url"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f5726d = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "req_head"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f5725c = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "req_content"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f5727e = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "time"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = "extra"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r3.f5728g = r4     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r2.add(r3)     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            goto L22
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L95 java.lang.OutOfMemoryError -> L99 java.lang.Exception -> Laa
            r1.close()     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r10)
            return r2
        L8d:
            if (r1 == 0) goto L92
            r1.close()     // Catch: java.lang.Throwable -> Lad
        L92:
            monitor-exit(r10)
            return r0
        L94:
            r1 = r0
        L95:
            if (r1 == 0) goto Lb0
            goto Lac
        L98:
            r1 = r0
        L99:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto Lb0
        L9e:
            r1.close()     // Catch: java.lang.Throwable -> Lad
            goto Lb0
        La2:
            r0 = move-exception
            if (r1 == 0) goto La8
            r1.close()     // Catch: java.lang.Throwable -> Lad
        La8:
            throw r0     // Catch: java.lang.Throwable -> Lad
        La9:
            r1 = r0
        Laa:
            if (r1 == 0) goto Lb0
        Lac:
            goto L9e
        Lad:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        Lb0:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.g.c():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        if (r3 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long a(com.anythink.core.common.e.o r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            android.database.sqlite.SQLiteDatabase r0 = r11.b()     // Catch: java.lang.Throwable -> L85
            r1 = -1
            if (r0 != 0) goto Lb
            monitor-exit(r11)
            return r1
        Lb:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.a()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L35
            java.lang.String r4 = "request_info"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L35
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L36
            int r5 = r11.f5304d     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L36
            if (r4 < r5) goto L27
            r11.d()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L36
        L27:
            r3.close()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L85
            goto L39
        L2b:
            r12 = move-exception
            r0 = r3
            goto L2f
        L2e:
            r12 = move-exception
        L2f:
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L85
        L34:
            throw r12     // Catch: java.lang.Throwable -> L85
        L35:
            r3 = r0
        L36:
            if (r3 == 0) goto L39
            goto L27
        L39:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.<init>()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "id"
            java.lang.String r5 = r12.f5723a     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "req_type"
            int r5 = r12.f5724b     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "req_url"
            java.lang.String r5 = r12.f5726d     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "req_head"
            java.lang.String r5 = r12.f5725c     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "req_content"
            java.lang.String r5 = r12.f5727e     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "time"
            long r5 = r12.f     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "extra"
            java.lang.String r12 = r12.f5728g     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            r3.put(r4, r12)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            android.database.sqlite.SQLiteDatabase r12 = r11.b()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            java.lang.String r4 = "request_info"
            long r0 = r12.insert(r4, r0, r3)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            monitor-exit(r11)
            return r0
        L83:
            monitor-exit(r11)
            return r1
        L85:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.g.a(com.anythink.core.common.e.o):long");
    }
}
