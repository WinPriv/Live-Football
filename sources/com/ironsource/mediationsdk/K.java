package com.ironsource.mediationsdk;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final String f24835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24836b;

    public K(String str, String str2) {
        zc.d.d(str, "advId");
        zc.d.d(str2, "advIdType");
        this.f24835a = str;
        this.f24836b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (zc.d.a(this.f24835a, k10.f24835a) && zc.d.a(this.f24836b, k10.f24836b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24836b.hashCode() + (this.f24835a.hashCode() * 31);
    }

    public final String toString() {
        return "IronSourceAdvId(advId=" + this.f24835a + ", advIdType=" + this.f24836b + ')';
    }
}
