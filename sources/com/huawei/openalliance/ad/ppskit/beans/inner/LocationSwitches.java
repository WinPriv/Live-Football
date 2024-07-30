package com.huawei.openalliance.ad.ppskit.beans.inner;

/* loaded from: classes2.dex */
public class LocationSwitches {
    public static final int SWITCH_OFF = 0;
    public static final int SWITCH_ON = 1;
    private int adsLoc;
    private int gpsOn;
    private boolean locationAvailable;

    public final int a() {
        return this.adsLoc;
    }

    public final void b(int i10) {
        this.adsLoc = i10;
    }

    public final void c(boolean z10) {
        this.locationAvailable = z10;
    }

    public final int d() {
        return this.gpsOn;
    }

    public final void e(int i10) {
        this.gpsOn = i10;
    }

    public final boolean f() {
        return this.locationAvailable;
    }
}
