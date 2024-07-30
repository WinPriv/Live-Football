package com.ironsource.mediationsdk.model;

/* loaded from: classes2.dex */
public class Placement {

    /* renamed from: a, reason: collision with root package name */
    public final int f25625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25626b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25627c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25628d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25629e;
    public final n f;

    public Placement(int i10, String str, boolean z10, String str2, int i11, n nVar) {
        this.f25625a = i10;
        this.f25626b = str;
        this.f25627c = z10;
        this.f25628d = str2;
        this.f25629e = i11;
        this.f = nVar;
    }

    public n getPlacementAvailabilitySettings() {
        return this.f;
    }

    public int getPlacementId() {
        return this.f25625a;
    }

    public String getPlacementName() {
        return this.f25626b;
    }

    public int getRewardAmount() {
        return this.f25629e;
    }

    public String getRewardName() {
        return this.f25628d;
    }

    public boolean isDefault() {
        return this.f25627c;
    }

    public String toString() {
        return "placement name: " + this.f25626b + ", reward name: " + this.f25628d + " , amount: " + this.f25629e;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f25625a = interstitialPlacement.getPlacementId();
        this.f25626b = interstitialPlacement.getPlacementName();
        this.f25627c = interstitialPlacement.isDefault();
        this.f = interstitialPlacement.getPlacementAvailabilitySettings();
    }
}
