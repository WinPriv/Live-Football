package j5;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: TrackGroup.java */
/* loaded from: classes2.dex */
public final class m0 implements k4.f {

    /* renamed from: x, reason: collision with root package name */
    public static final String f29799x = d6.g0.F(0);
    public static final String y = d6.g0.F(1);

    /* renamed from: z, reason: collision with root package name */
    public static final com.applovin.exoplayer2.a.l f29800z = new com.applovin.exoplayer2.a.l(20);

    /* renamed from: s, reason: collision with root package name */
    public final int f29801s;

    /* renamed from: t, reason: collision with root package name */
    public final String f29802t;

    /* renamed from: u, reason: collision with root package name */
    public final int f29803u;

    /* renamed from: v, reason: collision with root package name */
    public final k4.i0[] f29804v;

    /* renamed from: w, reason: collision with root package name */
    public int f29805w;

    public m0() {
        throw null;
    }

    public m0(String str, k4.i0... i0VarArr) {
        d6.a.a(i0VarArr.length > 0);
        this.f29802t = str;
        this.f29804v = i0VarArr;
        this.f29801s = i0VarArr.length;
        int i10 = d6.r.i(i0VarArr[0].D);
        this.f29803u = i10 == -1 ? d6.r.i(i0VarArr[0].C) : i10;
        String str2 = i0VarArr[0].f30520u;
        str2 = (str2 == null || str2.equals(com.anythink.expressad.exoplayer.b.ar)) ? "" : str2;
        int i11 = i0VarArr[0].f30522w | 16384;
        for (int i12 = 1; i12 < i0VarArr.length; i12++) {
            String str3 = i0VarArr[i12].f30520u;
            if (!str2.equals((str3 == null || str3.equals(com.anythink.expressad.exoplayer.b.ar)) ? "" : str3)) {
                b(i12, "languages", i0VarArr[0].f30520u, i0VarArr[i12].f30520u);
                return;
            } else {
                if (i11 != (i0VarArr[i12].f30522w | 16384)) {
                    b(i12, "role flags", Integer.toBinaryString(i0VarArr[0].f30522w), Integer.toBinaryString(i0VarArr[i12].f30522w));
                    return;
                }
            }
        }
    }

    public static void b(int i10, String str, String str2, String str3) {
        StringBuilder o = a3.k.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o.append(str3);
        o.append("' (track ");
        o.append(i10);
        o.append(")");
        d6.p.d("TrackGroup", "", new IllegalStateException(o.toString()));
    }

    public final int a(k4.i0 i0Var) {
        int i10 = 0;
        while (true) {
            k4.i0[] i0VarArr = this.f29804v;
            if (i10 < i0VarArr.length) {
                if (i0Var == i0VarArr[i10]) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f29802t.equals(m0Var.f29802t) && Arrays.equals(this.f29804v, m0Var.f29804v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29805w == 0) {
            this.f29805w = e0.i.b(this.f29802t, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.f29804v);
        }
        return this.f29805w;
    }
}
