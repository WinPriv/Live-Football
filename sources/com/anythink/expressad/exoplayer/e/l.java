package com.anythink.expressad.exoplayer.e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7955a = new l(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f7956b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7957c;

    public l(long j10, long j11) {
        this.f7956b = j10;
        this.f7957c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7956b == lVar.f7956b && this.f7957c == lVar.f7957c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7956b) * 31) + ((int) this.f7957c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f7956b);
        sb2.append(", position=");
        return a3.l.n(sb2, this.f7957c, "]");
    }
}
