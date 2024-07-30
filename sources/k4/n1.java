package k4;

import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: StarRating.java */
/* loaded from: classes2.dex */
public final class n1 extends h1 {

    /* renamed from: w, reason: collision with root package name */
    public static final String f30656w = d6.g0.F(1);

    /* renamed from: x, reason: collision with root package name */
    public static final String f30657x = d6.g0.F(2);
    public static final com.applovin.exoplayer2.b0 y = new com.applovin.exoplayer2.b0(11);

    /* renamed from: u, reason: collision with root package name */
    public final int f30658u;

    /* renamed from: v, reason: collision with root package name */
    public final float f30659v;

    public n1(int i10) {
        d6.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f30658u = i10;
        this.f30659v = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f30658u != n1Var.f30658u || this.f30659v != n1Var.f30659v) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30658u), Float.valueOf(this.f30659v)});
    }

    public n1(int i10, float f) {
        d6.a.b(i10 > 0, "maxStars must be a positive integer");
        d6.a.b(f >= gl.Code && f <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f30658u = i10;
        this.f30659v = f;
    }
}
