package k4;

import java.util.Arrays;

/* compiled from: HeartRating.java */
/* loaded from: classes2.dex */
public final class j0 extends h1 {

    /* renamed from: w, reason: collision with root package name */
    public static final String f30554w = d6.g0.F(1);

    /* renamed from: x, reason: collision with root package name */
    public static final String f30555x = d6.g0.F(2);
    public static final com.applovin.exoplayer2.d.w y = new com.applovin.exoplayer2.d.w(7);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30556u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30557v;

    public j0() {
        this.f30556u = false;
        this.f30557v = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f30557v != j0Var.f30557v || this.f30556u != j0Var.f30556u) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30556u), Boolean.valueOf(this.f30557v)});
    }

    public j0(boolean z10) {
        this.f30556u = true;
        this.f30557v = z10;
    }
}
