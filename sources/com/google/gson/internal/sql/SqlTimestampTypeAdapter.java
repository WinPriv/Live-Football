package com.google.gson.internal.sql;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import m8.a0;
import m8.b0;
import m8.i;
import s8.b;

/* loaded from: classes2.dex */
public final class SqlTimestampTypeAdapter extends a0<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f21426b = new b0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // m8.b0
        public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                iVar.getClass();
                return new SqlTimestampTypeAdapter(iVar.g(r8.a.get(Date.class)));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a0<Date> f21427a;

    public SqlTimestampTypeAdapter(a0 a0Var) {
        this.f21427a = a0Var;
    }

    @Override // m8.a0
    public final Timestamp a(s8.a aVar) throws IOException {
        Date a10 = this.f21427a.a(aVar);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    @Override // m8.a0
    public final void b(b bVar, Timestamp timestamp) throws IOException {
        this.f21427a.b(bVar, timestamp);
    }
}
