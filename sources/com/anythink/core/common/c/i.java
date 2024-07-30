package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.e.w;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends com.anythink.core.common.c.a<i> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5320b = "com.anythink.core.common.c.i";

    /* renamed from: c, reason: collision with root package name */
    private static i f5321c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<w> f5322a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, w> f5323b;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5324a = "notice_url_fail_info";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5325b = "id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5326c = "req_type";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5327d = "req_url";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5328e = "req_head";
        public static final String f = "first_fail_time";

        /* renamed from: g, reason: collision with root package name */
        public static final String f5329g = "offer_out_date_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f5330h = "retry_count";

        /* renamed from: i, reason: collision with root package name */
        public static final String f5331i = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";
    }

    private i(com.anythink.core.common.c.b bVar) {
        super(bVar);
    }

    public static i a(com.anythink.core.common.c.b bVar) {
        if (f5321c == null) {
            synchronized (i.class) {
                if (f5321c == null) {
                    f5321c = new i(bVar);
                }
            }
        }
        return f5321c;
    }

    private synchronized void d() {
        try {
            if (b() == null) {
                return;
            }
            b().delete(b.f5324a, null, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized int b(w wVar) {
        if (b() == null || wVar == null) {
            return -1;
        }
        try {
            return b().delete(b.f5324a, "id=?", new String[]{wVar.f5749a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r2 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.c.i.a c() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.c.i.c():com.anythink.core.common.c.i$a");
    }

    public final synchronized long a(w wVar) {
        boolean z10;
        if (b() == null || wVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", wVar.f5749a);
            contentValues.put("req_type", Integer.valueOf(wVar.f5750b));
            contentValues.put("req_url", wVar.f5752d);
            contentValues.put("req_head", wVar.f5751c);
            contentValues.put(b.f, Long.valueOf(wVar.f5753e));
            contentValues.put(b.f5329g, Long.valueOf(wVar.f));
            contentValues.put("retry_count", Integer.valueOf(wVar.f5754g));
            Cursor query = a().query(b.f5324a, new String[]{"id"}, "id=?", new String[]{wVar.f5749a}, "id", null, null);
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
                return b().update(b.f5324a, contentValues, "id = ? ", new String[]{wVar.f5749a});
            }
            return b().insert(b.f5324a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private boolean a(String str) {
        Cursor query = a().query(b.f5324a, new String[]{"id"}, "id=?", new String[]{str}, "id", null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }
}
