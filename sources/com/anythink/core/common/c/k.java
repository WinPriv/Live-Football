package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.b.n;

/* loaded from: classes.dex */
public class k extends com.anythink.core.common.c.a<com.anythink.core.common.a.h> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile k f5341c;

    /* renamed from: b, reason: collision with root package name */
    private final String f5342b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f5343a = "offer_data_cache";

        /* renamed from: b, reason: collision with root package name */
        public static final String f5344b = "bid_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f5345c = "adsource_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f5346d = "network_firm_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f5347e = "offer_data";
        public static final String f = "CREATE TABLE IF NOT EXISTS offer_data_cache(bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,offer_data TEXT)";
    }

    private k(b bVar) {
        super(bVar);
        this.f5342b = k.class.getName();
    }

    public static k a(b bVar) {
        if (f5341c == null) {
            synchronized (k.class) {
                if (f5341c == null) {
                    f5341c = new k(bVar);
                }
            }
        }
        return f5341c;
    }

    public final synchronized String b(String str) {
        Cursor query = a().query(a.f5343a, new String[]{a.f5347e}, "bid_id=?", new String[]{str}, null, null, null);
        if (query == null || query.getCount() <= 0) {
            return "";
        }
        query.moveToNext();
        String string = query.getString(0);
        query.close();
        return string;
    }

    public final synchronized void a(String str) {
        try {
            b().delete(a.f5343a, "bid_id = ? ", new String[]{str});
        } catch (Throwable th) {
            com.anythink.core.common.j.c.a("Error_SQL_DELETE", th.getMessage(), n.a().r());
        }
    }

    private synchronized boolean b(com.anythink.core.common.a.h hVar) {
        Cursor query;
        if (hVar == null) {
            return false;
        }
        if (hVar.c() == 67) {
            query = a().query(a.f5343a, new String[]{a.f5347e}, "adsource_id=?", new String[]{hVar.b()}, null, null, null);
        } else {
            query = a().query(a.f5343a, new String[]{a.f5347e}, "bid_id=?", new String[]{hVar.a()}, null, null, null);
        }
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized long a(com.anythink.core.common.a.h hVar) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.f5344b, hVar.a());
            contentValues.put("adsource_id", hVar.b());
            contentValues.put(a.f5346d, hVar.a());
            contentValues.put(a.f5347e, hVar.d());
            if (b(hVar)) {
                if (hVar.c() == 67) {
                    hVar.a();
                    hVar.b();
                    return b().update(a.f5343a, contentValues, "adsource_id = ? ", new String[]{hVar.b()});
                }
                hVar.a();
                return b().update(a.f5343a, contentValues, "bid_id = ? ", new String[]{hVar.a()});
            }
            hVar.a();
            hVar.b();
            return b().insert(a.f5343a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
