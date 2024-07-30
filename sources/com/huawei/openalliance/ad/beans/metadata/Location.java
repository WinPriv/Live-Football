package com.huawei.openalliance.ad.beans.metadata;

import androidx.activity.n;
import com.anythink.core.common.g.c;
import com.huawei.openalliance.ad.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class Location {
    private int clctSource;
    private Long clctTime;
    private Integer lastfix;

    @y9.a(Code = "lat")
    private Double latitude;

    @y9.b
    private aa.a locationSwitches;

    @y9.a(Code = c.C)
    private Double longitude;

    public Location() {
    }

    public Location(Double d10, Double d11) {
        d(d10);
        g(d11);
    }

    public final Location a() {
        Location location = new Location();
        location.longitude = this.longitude;
        location.latitude = this.latitude;
        location.lastfix = this.lastfix;
        location.clctTime = this.clctTime;
        location.clctSource = this.clctSource;
        return location;
    }

    public final void b() {
        this.clctSource = 1;
    }

    public final void c(aa.a aVar) {
        this.locationSwitches = aVar;
    }

    public final void d(Double d10) {
        this.longitude = n.l(d10);
    }

    public final void e(Long l10) {
        this.clctTime = l10;
    }

    public final aa.a f() {
        return this.locationSwitches;
    }

    public final void g(Double d10) {
        this.latitude = n.l(d10);
    }
}
