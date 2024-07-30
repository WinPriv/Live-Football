package k4;

import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes2.dex */
public final class d1 implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final d1 f30400v = new d1(1.0f, 1.0f);

    /* renamed from: s, reason: collision with root package name */
    public final float f30401s;

    /* renamed from: t, reason: collision with root package name */
    public final float f30402t;

    /* renamed from: u, reason: collision with root package name */
    public final int f30403u;

    static {
        d6.g0.F(0);
        d6.g0.F(1);
    }

    public d1(float f, float f10) {
        boolean z10;
        if (f > gl.Code) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        d6.a.a(f10 > gl.Code);
        this.f30401s = f;
        this.f30402t = f10;
        this.f30403u = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f30401s == d1Var.f30401s && this.f30402t == d1Var.f30402t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f30402t) + ((Float.floatToRawIntBits(this.f30401s) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return d6.g0.l("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f30401s), Float.valueOf(this.f30402t));
    }
}
