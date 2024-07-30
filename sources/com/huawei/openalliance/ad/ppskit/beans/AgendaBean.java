package com.huawei.openalliance.ad.ppskit.beans;

import ma.d;

/* loaded from: classes2.dex */
public class AgendaBean {

    @d(a = "allday")
    private int allDay;
    private String description;

    @d(a = "dtend")
    private long dtEnd;

    @d(a = "dtstart")
    private long dtStart;
    private String location;
    private Integer minutes;

    @d(a = "timezone")
    private String timeZone;
    private String title;

    public final String a() {
        return this.title;
    }

    public final void b() {
        this.allDay = 0;
    }

    public final String c() {
        return this.location;
    }

    public final long d() {
        return this.dtStart;
    }

    public final long e() {
        return this.dtEnd;
    }

    public final int f() {
        return this.allDay;
    }

    public final String g() {
        return this.timeZone;
    }

    public final Integer h() {
        return this.minutes;
    }

    public final String i() {
        return this.description;
    }
}
