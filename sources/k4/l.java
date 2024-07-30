package k4;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: DeviceInfo.java */
/* loaded from: classes2.dex */
public final class l implements f {

    /* renamed from: s, reason: collision with root package name */
    public final int f30562s;

    /* renamed from: t, reason: collision with root package name */
    public final int f30563t;

    /* renamed from: u, reason: collision with root package name */
    public final int f30564u;

    static {
        d6.g0.F(0);
        d6.g0.F(1);
        d6.g0.F(2);
    }

    public l(int i10, int i11, int i12) {
        this.f30562s = i10;
        this.f30563t = i11;
        this.f30564u = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f30562s == lVar.f30562s && this.f30563t == lVar.f30563t && this.f30564u == lVar.f30564u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f30562s) * 31) + this.f30563t) * 31) + this.f30564u;
    }
}
