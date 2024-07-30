package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates.java */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<z> f20670a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar d10 = d(null);
        d10.setTimeInMillis(j10);
        return b(d10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d10 = d(calendar);
        Calendar d11 = d(null);
        d11.set(d10.get(1), d10.get(2), d10.get(5));
        return d11;
    }

    public static Calendar c() {
        Calendar calendar;
        z zVar = f20670a.get();
        if (zVar == null) {
            zVar = z.f20743c;
        }
        TimeZone timeZone = zVar.f20745b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l10 = zVar.f20744a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
