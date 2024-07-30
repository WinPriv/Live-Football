package com.applovin.exoplayer2.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c4.a;
import c4.c;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import g4.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements p.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13020s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13021t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13022u;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3) {
        this.f13020s = obj;
        this.f13021t = obj2;
        this.f13022u = obj3;
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        g4.o oVar = (g4.o) this.f13020s;
        Map map = (Map) this.f13021t;
        a.C0039a c0039a = (a.C0039a) this.f13022u;
        Cursor cursor = (Cursor) obj;
        w3.b bVar = g4.o.f28502x;
        oVar.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i10 = cursor.getInt(1);
            c.a aVar = c.a.REASON_UNKNOWN;
            if (i10 != 0) {
                if (i10 == 1) {
                    aVar = c.a.MESSAGE_TOO_OLD;
                } else if (i10 == 2) {
                    aVar = c.a.CACHE_FULL;
                } else if (i10 == 3) {
                    aVar = c.a.PAYLOAD_TOO_BIG;
                } else if (i10 == 4) {
                    aVar = c.a.MAX_RETRIES_REACHED;
                } else if (i10 == 5) {
                    aVar = c.a.INVALID_PAYLOD;
                } else if (i10 == 6) {
                    aVar = c.a.SERVER_ERROR;
                } else {
                    d4.a.a(Integer.valueOf(i10), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                }
            }
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new c4.c(j10, aVar));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i11 = c4.d.f3275c;
            new ArrayList();
            c0039a.f3262b.add(new c4.d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        final long a10 = oVar.f28504t.a();
        SQLiteDatabase f = oVar.f();
        f.beginTransaction();
        try {
            c4.f fVar = (c4.f) g4.o.k(f.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new o.a() { // from class: g4.n
                @Override // g4.o.a
                public final Object apply(Object obj2) {
                    Cursor cursor2 = (Cursor) obj2;
                    cursor2.moveToNext();
                    return new c4.f(cursor2.getLong(0), a10);
                }
            });
            f.setTransactionSuccessful();
            f.endTransaction();
            c0039a.f3261a = fVar;
            c0039a.f3263c = new c4.b(new c4.e(oVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * oVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong(), g4.e.f28486a.f28479b));
            c0039a.f3264d = oVar.f28507w.get();
            return new c4.a(c0039a.f3261a, Collections.unmodifiableList(c0039a.f3262b), c0039a.f3263c, c0039a.f3264d);
        } catch (Throwable th) {
            f.endTransaction();
            throw th;
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        ((b) obj).a((b.a) this.f13020s, (com.applovin.exoplayer2.h.j) this.f13021t, (com.applovin.exoplayer2.h.m) this.f13022u);
    }
}
