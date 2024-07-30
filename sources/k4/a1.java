package k4;

import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* compiled from: PercentageRating.java */
/* loaded from: classes2.dex */
public final class a1 extends h1 {

    /* renamed from: v, reason: collision with root package name */
    public static final String f30358v = d6.g0.F(1);

    /* renamed from: w, reason: collision with root package name */
    public static final com.applovin.exoplayer2.a.l f30359w = new com.applovin.exoplayer2.a.l(16);

    /* renamed from: u, reason: collision with root package name */
    public final float f30360u;

    public a1() {
        this.f30360u = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        if (this.f30360u != ((a1) obj).f30360u) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f30360u)});
    }

    public a1(float f) {
        d6.a.b(f >= gl.Code && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f30360u = f;
    }
}
