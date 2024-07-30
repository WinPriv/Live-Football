package b6;

import com.applovin.exoplayer2.d.w;
import d6.g0;
import j5.m0;
import j7.j0;
import java.util.Collections;
import java.util.List;

/* compiled from: TrackSelectionOverride.java */
/* loaded from: classes2.dex */
public final class j implements k4.f {

    /* renamed from: u, reason: collision with root package name */
    public static final String f3068u = g0.F(0);

    /* renamed from: v, reason: collision with root package name */
    public static final String f3069v = g0.F(1);

    /* renamed from: w, reason: collision with root package name */
    public static final w f3070w = new w(18);

    /* renamed from: s, reason: collision with root package name */
    public final m0 f3071s;

    /* renamed from: t, reason: collision with root package name */
    public final j0<Integer> f3072t;

    public j(m0 m0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m0Var.f29801s)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3071s = m0Var;
        this.f3072t = j0.C(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f3071s.equals(jVar.f3071s) && this.f3072t.equals(jVar.f3072t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3072t.hashCode() * 31) + this.f3071s.hashCode();
    }
}
