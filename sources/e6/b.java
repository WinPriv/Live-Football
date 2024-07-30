package e6;

import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;

/* compiled from: ColorInfo.java */
/* loaded from: classes2.dex */
public final class b implements k4.f {

    /* renamed from: s, reason: collision with root package name */
    public final int f27759s;

    /* renamed from: t, reason: collision with root package name */
    public final int f27760t;

    /* renamed from: u, reason: collision with root package name */
    public final int f27761u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f27762v;

    /* renamed from: w, reason: collision with root package name */
    public int f27763w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f27757x = g0.F(0);
    public static final String y = g0.F(1);

    /* renamed from: z, reason: collision with root package name */
    public static final String f27758z = g0.F(2);
    public static final String A = g0.F(3);
    public static final com.applovin.exoplayer2.a.l B = new com.applovin.exoplayer2.a.l(23);

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f27759s = i10;
        this.f27760t = i11;
        this.f27761u = i12;
        this.f27762v = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27759s == bVar.f27759s && this.f27760t == bVar.f27760t && this.f27761u == bVar.f27761u && Arrays.equals(this.f27762v, bVar.f27762v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27763w == 0) {
            this.f27763w = Arrays.hashCode(this.f27762v) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27759s) * 31) + this.f27760t) * 31) + this.f27761u) * 31);
        }
        return this.f27763w;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f27759s);
        sb2.append(", ");
        sb2.append(this.f27760t);
        sb2.append(", ");
        sb2.append(this.f27761u);
        sb2.append(", ");
        if (this.f27762v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
