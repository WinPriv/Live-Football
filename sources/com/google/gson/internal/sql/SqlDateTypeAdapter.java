package com.google.gson.internal.sql;

import a3.l;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import m8.a0;
import m8.b0;
import m8.i;
import m8.u;
import s8.b;

/* loaded from: classes2.dex */
public final class SqlDateTypeAdapter extends a0<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f21422b = new b0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // m8.b0
        public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f21423a = new SimpleDateFormat("MMM d, yyyy");

    @Override // m8.a0
    public final Date a(s8.a aVar) throws IOException {
        java.util.Date parse;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String d02 = aVar.d0();
        try {
            synchronized (this) {
                parse = this.f21423a.parse(d02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            StringBuilder s10 = l.s("Failed parsing '", d02, "' as SQL Date; at path ");
            s10.append(aVar.k());
            throw new u(s10.toString(), e10);
        }
    }

    @Override // m8.a0
    public final void b(b bVar, Date date) throws IOException {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.j();
            return;
        }
        synchronized (this) {
            format = this.f21423a.format((java.util.Date) date2);
        }
        bVar.X(format);
    }
}
