package com.applovin.exoplayer2.e;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f14942a = new w(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f14943b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14944c;

    public w(long j10, long j11) {
        this.f14943b = j10;
        this.f14944c = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f14943b == wVar.f14943b && this.f14944c == wVar.f14944c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f14943b) * 31) + ((int) this.f14944c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f14943b);
        sb2.append(", position=");
        return a3.l.n(sb2, this.f14944c, "]");
    }
}
