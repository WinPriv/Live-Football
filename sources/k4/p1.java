package k4;

import java.util.Arrays;

/* compiled from: ThumbRating.java */
/* loaded from: classes2.dex */
public final class p1 extends h1 {

    /* renamed from: w, reason: collision with root package name */
    public static final String f30738w = d6.g0.F(1);

    /* renamed from: x, reason: collision with root package name */
    public static final String f30739x = d6.g0.F(2);
    public static final com.applovin.exoplayer2.a0 y = new com.applovin.exoplayer2.a0(22);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30740u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30741v;

    public p1() {
        this.f30740u = false;
        this.f30741v = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f30741v != p1Var.f30741v || this.f30740u != p1Var.f30740u) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30740u), Boolean.valueOf(this.f30741v)});
    }

    public p1(boolean z10) {
        this.f30740u = true;
        this.f30741v = z10;
    }
}
