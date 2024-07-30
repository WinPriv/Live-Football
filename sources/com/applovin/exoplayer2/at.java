package com.applovin.exoplayer2;

/* loaded from: classes.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public static final at f13249a = new at(false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13250b;

    public at(boolean z10) {
        this.f13250b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && at.class == obj.getClass() && this.f13250b == ((at) obj).f13250b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return !this.f13250b ? 1 : 0;
    }
}
