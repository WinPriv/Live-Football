package com.ironsource.mediationsdk.model;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f25636a;

    public b() {
        this("");
    }

    public final String a() {
        return this.f25636a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && zc.d.a(this.f25636a, ((b) obj).f25636a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25636a.hashCode();
    }

    public final String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f25636a + ')';
    }

    public b(String str) {
        zc.d.d(str, "auctionData");
        this.f25636a = str;
    }
}
