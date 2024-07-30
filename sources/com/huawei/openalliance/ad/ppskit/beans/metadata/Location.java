package com.huawei.openalliance.ad.ppskit.beans.metadata;

import androidx.activity.n;
import com.anythink.core.common.g.c;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.LocationSwitches;
import ma.a;
import ma.d;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class Location {
    private int clctSource;
    private Long clctTime;
    private Integer lastfix;

    @a
    @d(a = "lat")
    private Double latitude;

    @f
    private LocationSwitches locationSwitches;

    @a
    @d(a = c.C)
    private Double longitude;

    public final Location a() {
        Location location = new Location();
        location.longitude = this.longitude;
        location.latitude = this.latitude;
        location.lastfix = this.lastfix;
        location.clctTime = this.clctTime;
        location.clctSource = this.clctSource;
        return location;
    }

    public final void b(long j10) {
        Long l10 = this.clctTime;
        if (l10 != null && l10.longValue() < j10) {
            this.lastfix = Integer.valueOf(Math.round(((float) (j10 - this.clctTime.longValue())) / 1000.0f));
        }
    }

    public final void c(LocationSwitches locationSwitches) {
        this.locationSwitches = locationSwitches;
    }

    public final void d(Double d10) {
        this.longitude = n.C(d10);
    }

    public final void e(Long l10) {
        this.clctTime = l10;
    }

    public final Double f() {
        return this.longitude;
    }

    public final void g(Double d10) {
        this.latitude = n.C(d10);
    }

    public final Double h() {
        return this.latitude;
    }

    public final Long i() {
        return this.clctTime;
    }

    public final int j() {
        return this.clctSource;
    }

    public final LocationSwitches k() {
        return this.locationSwitches;
    }

    public final boolean l() {
        if (this.longitude != null && this.latitude != null) {
            return true;
        }
        return false;
    }
}
