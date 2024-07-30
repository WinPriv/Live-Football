package com.google.gson.internal.sql;

import a3.l;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import m8.a0;
import m8.b0;
import m8.i;
import m8.u;
import s8.b;

/* loaded from: classes2.dex */
public final class SqlTimeTypeAdapter extends a0<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f21424b = new b0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // m8.b0
        public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f21425a = new SimpleDateFormat("hh:mm:ss a");

    @Override // m8.a0
    public final Time a(s8.a aVar) throws IOException {
        Time time;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String d02 = aVar.d0();
        try {
            synchronized (this) {
                time = new Time(this.f21425a.parse(d02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder s10 = l.s("Failed parsing '", d02, "' as SQL Time; at path ");
            s10.append(aVar.k());
            throw new u(s10.toString(), e10);
        }
    }

    @Override // m8.a0
    public final void b(b bVar, Time time) throws IOException {
        String format;
        Time time2 = time;
        if (time2 == null) {
            bVar.j();
            return;
        }
        synchronized (this) {
            format = this.f21425a.format((Date) time2);
        }
        bVar.X(format);
    }
}
