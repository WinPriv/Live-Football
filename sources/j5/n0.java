package j5;

import j7.v1;

/* compiled from: TrackGroupArray.java */
/* loaded from: classes2.dex */
public final class n0 implements k4.f {

    /* renamed from: v, reason: collision with root package name */
    public static final n0 f29811v = new n0(new m0[0]);

    /* renamed from: w, reason: collision with root package name */
    public static final String f29812w = d6.g0.F(0);

    /* renamed from: x, reason: collision with root package name */
    public static final com.applovin.exoplayer2.a0 f29813x = new com.applovin.exoplayer2.a0(25);

    /* renamed from: s, reason: collision with root package name */
    public final int f29814s;

    /* renamed from: t, reason: collision with root package name */
    public final v1 f29815t;

    /* renamed from: u, reason: collision with root package name */
    public int f29816u;

    public n0(m0... m0VarArr) {
        this.f29815t = j7.j0.D(m0VarArr);
        this.f29814s = m0VarArr.length;
        int i10 = 0;
        while (true) {
            v1 v1Var = this.f29815t;
            if (i10 < v1Var.f30115v) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < v1Var.f30115v; i12++) {
                    if (((m0) v1Var.get(i10)).equals(v1Var.get(i12))) {
                        d6.p.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final m0 a(int i10) {
        return (m0) this.f29815t.get(i10);
    }

    public final int b(m0 m0Var) {
        int indexOf = this.f29815t.indexOf(m0Var);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f29814s == n0Var.f29814s && this.f29815t.equals(n0Var.f29815t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29816u == 0) {
            this.f29816u = this.f29815t.hashCode();
        }
        return this.f29816u;
    }
}
