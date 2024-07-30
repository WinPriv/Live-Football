package com.ironsource.mediationsdk.model;

/* loaded from: classes2.dex */
public class InterstitialPlacement {

    /* renamed from: a, reason: collision with root package name */
    public final int f25608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25609b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25610c;

    /* renamed from: d, reason: collision with root package name */
    public final n f25611d;

    public InterstitialPlacement(int i10, String str, boolean z10, n nVar) {
        this.f25608a = i10;
        this.f25609b = str;
        this.f25610c = z10;
        this.f25611d = nVar;
    }

    public n getPlacementAvailabilitySettings() {
        return this.f25611d;
    }

    public int getPlacementId() {
        return this.f25608a;
    }

    public String getPlacementName() {
        return this.f25609b;
    }

    public boolean isDefault() {
        return this.f25610c;
    }

    public String toString() {
        return "placement name: " + this.f25609b;
    }
}
