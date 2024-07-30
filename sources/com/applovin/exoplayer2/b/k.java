package com.applovin.exoplayer2.b;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f13432a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13433b;

    public k(int i10, float f) {
        this.f13432a = i10;
        this.f13433b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13432a == kVar.f13432a && Float.compare(kVar.f13433b, this.f13433b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f13433b) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f13432a) * 31);
    }
}
