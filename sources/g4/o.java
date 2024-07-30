package g4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import c4.a;
import c4.c;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.applovin.exoplayer2.a.z;
import com.applovin.exoplayer2.a0;
import com.applovin.exoplayer2.d.w;
import com.applovin.exoplayer2.h.k0;
import h4.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public final class o implements d, h4.b, c {

    /* renamed from: x, reason: collision with root package name */
    public static final w3.b f28502x = new w3.b("proto");

    /* renamed from: s, reason: collision with root package name */
    public final t f28503s;

    /* renamed from: t, reason: collision with root package name */
    public final i4.a f28504t;

    /* renamed from: u, reason: collision with root package name */
    public final i4.a f28505u;

    /* renamed from: v, reason: collision with root package name */
    public final e f28506v;

    /* renamed from: w, reason: collision with root package name */
    public final tc.a<String> f28507w;

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface a<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f28508a;

        /* renamed from: b, reason: collision with root package name */
        public final String f28509b;

        public b(String str, String str2) {
            this.f28508a = str;
            this.f28509b = str2;
        }
    }

    public o(i4.a aVar, i4.a aVar2, e eVar, t tVar, tc.a<String> aVar3) {
        this.f28503s = tVar;
        this.f28504t = aVar;
        this.f28505u = aVar2;
        this.f28506v = eVar;
        this.f28507w = aVar3;
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, z3.s sVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(sVar.b(), String.valueOf(j4.a.a(sVar.d()))));
        if (sVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) k(sQLiteDatabase.query("transport_contexts", new String[]{pa.a.ID}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new com.applovin.exoplayer2.a.l(13));
    }

    public static String j(Iterable<i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T k(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // g4.d
    public final g4.b C(z3.s sVar, z3.n nVar) {
        Object[] objArr = {sVar.d(), nVar.g(), sVar.b()};
        String c10 = d4.a.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) h(new com.applovin.exoplayer2.a.d(this, nVar, sVar, 4))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new g4.b(longValue, sVar, nVar);
    }

    @Override // g4.d
    public final boolean E(z3.s sVar) {
        return ((Boolean) h(new k(this, sVar, 0))).booleanValue();
    }

    @Override // g4.d
    public final void F(long j10, z3.s sVar) {
        h(new j(j10, sVar));
    }

    @Override // g4.d
    public final void R(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        h(new com.applovin.exoplayer2.a.m(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + j(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 3));
    }

    @Override // g4.c
    public final void b() {
        h(new k0(this, 2));
    }

    @Override // g4.c
    public final void c(long j10, c.a aVar, String str) {
        h(new l(str, aVar, j10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28503s.close();
    }

    @Override // g4.c
    public final c4.a d() {
        int i10 = c4.a.f3256e;
        a.C0039a c0039a = new a.C0039a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            c4.a aVar = (c4.a) k(f.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new z(this, hashMap, c0039a));
            f.setTransactionSuccessful();
            return aVar;
        } finally {
            f.endTransaction();
        }
    }

    @Override // h4.b
    public final <T> T e(b.a<T> aVar) {
        SQLiteDatabase f = f();
        a0 a0Var = new a0(12);
        i4.a aVar2 = this.f28505u;
        long a10 = aVar2.a();
        while (true) {
            try {
                f.beginTransaction();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar2.a() >= this.f28506v.a() + a10) {
                    a0Var.apply(e10);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            T execute = aVar.execute();
            f.setTransactionSuccessful();
            return execute;
        } finally {
            f.endTransaction();
        }
    }

    public final SQLiteDatabase f() {
        t tVar = this.f28503s;
        Objects.requireNonNull(tVar);
        i4.a aVar = this.f28505u;
        long a10 = aVar.a();
        while (true) {
            try {
                return tVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() < this.f28506v.a() + a10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new h4.a("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    public final <T> T h(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            T apply = aVar.apply(f);
            f.setTransactionSuccessful();
            return apply;
        } finally {
            f.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, z3.s sVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long g6 = g(sQLiteDatabase, sVar);
        if (g6 == null) {
            return arrayList;
        }
        k(sQLiteDatabase.query("events", new String[]{pa.a.ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", CallMraidJS.f7009k}, "context_id = ?", new String[]{g6.toString()}, null, null, null, String.valueOf(i10)), new com.applovin.exoplayer2.a.d(this, arrayList, sVar, 3));
        return arrayList;
    }

    @Override // g4.d
    public final int o() {
        return ((Integer) h(new j(this, this.f28504t.a() - this.f28506v.b()))).intValue();
    }

    @Override // g4.d
    public final void p(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        f().compileStatement("DELETE FROM events WHERE _id in " + j(iterable)).execute();
    }

    @Override // g4.d
    public final Iterable<i> s(z3.s sVar) {
        return (Iterable) h(new k(this, sVar, 1));
    }

    @Override // g4.d
    public final Iterable<z3.s> v() {
        return (Iterable) h(new com.applovin.exoplayer2.a.l(11));
    }

    @Override // g4.d
    public final long x(z3.s sVar) {
        return ((Long) k(f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(j4.a.a(sVar.d()))}), new w(4))).longValue();
    }
}
