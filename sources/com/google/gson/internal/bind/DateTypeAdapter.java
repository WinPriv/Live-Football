package com.google.gson.internal.bind;

import a3.l;
import j7.r;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import m8.a0;
import m8.b0;
import m8.i;
import m8.u;
import o8.p;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends a0<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f21331b = new b0() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // m8.b0
        public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21332a;

    public DateTypeAdapter() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f21332a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.f33749a >= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(r.D(2, 2));
        }
    }

    @Override // m8.a0
    public final Date a(s8.a aVar) throws IOException {
        Date b10;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String d02 = aVar.d0();
        synchronized (this.f21332a) {
            Iterator it = this.f21332a.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b10 = ((DateFormat) it.next()).parse(d02);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        b10 = p8.a.b(d02, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        StringBuilder s10 = l.s("Failed parsing '", d02, "' as Date; at path ");
                        s10.append(aVar.k());
                        throw new u(s10.toString(), e10);
                    }
                }
            }
        }
        return b10;
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Date date) throws IOException {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f21332a.get(0);
        synchronized (this.f21332a) {
            format = dateFormat.format(date2);
        }
        bVar.X(format);
    }
}
