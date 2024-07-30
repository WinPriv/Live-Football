package com.huawei.openalliance.ad.ppskit.beans.metadata;

/* loaded from: classes2.dex */
public class GeoLocation {
    private Address address;
    private int clctSource;
    private Long clctTime;
    private Integer lastfix;
    private Double lat;
    private Double lon;

    public final void a(int i10) {
        this.clctSource = i10;
    }

    public final void b(Address address) {
        this.address = address;
    }

    public final void c(Double d10) {
        this.lon = d10;
    }

    public final void d(Double d10) {
        this.lat = d10;
    }

    public final void e(Long l10) {
        this.clctTime = l10;
    }
}
