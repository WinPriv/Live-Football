package com.huawei.openalliance.ad.ppskit.beans.vast;

/* loaded from: classes2.dex */
public class Creative {
    private final String adId;

    /* renamed from: id, reason: collision with root package name */
    private final String f22467id;
    private LinearCreative linearAd;
    private NonLinearAds nonLinearAd;
    private final Integer sequence;

    public Creative(String str, Integer num, String str2) {
        this.f22467id = str;
        this.sequence = num;
        this.adId = str2;
    }

    public final void a(LinearCreative linearCreative) {
        this.linearAd = linearCreative;
    }

    public final void b(NonLinearAds nonLinearAds) {
        this.nonLinearAd = nonLinearAds;
    }

    public final LinearCreative c() {
        return this.linearAd;
    }

    public final NonLinearAds d() {
        return this.nonLinearAd;
    }
}
