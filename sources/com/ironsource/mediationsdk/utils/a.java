package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25880a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25881b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25882c = false;

    public final void a(IronSource.AD_UNIT ad_unit, boolean z10) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f25880a = z10;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f25881b = z10;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f25882c = z10;
        }
    }

    public final boolean a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f25880a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f25881b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f25882c;
        }
        return false;
    }
}
