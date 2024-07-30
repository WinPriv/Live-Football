package k4;

import j7.j0;
import j7.v1;
import java.util.Arrays;

/* compiled from: Tracks.java */
/* loaded from: classes2.dex */
public final class r1 implements f {

    /* renamed from: t, reason: collision with root package name */
    public static final r1 f30779t;

    /* renamed from: s, reason: collision with root package name */
    public final j7.j0<a> f30780s;

    /* compiled from: Tracks.java */
    /* loaded from: classes2.dex */
    public static final class a implements f {

        /* renamed from: s, reason: collision with root package name */
        public final int f30783s;

        /* renamed from: t, reason: collision with root package name */
        public final j5.m0 f30784t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f30785u;

        /* renamed from: v, reason: collision with root package name */
        public final int[] f30786v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean[] f30787w;

        /* renamed from: x, reason: collision with root package name */
        public static final String f30781x = d6.g0.F(0);
        public static final String y = d6.g0.F(1);

        /* renamed from: z, reason: collision with root package name */
        public static final String f30782z = d6.g0.F(3);
        public static final String A = d6.g0.F(4);

        static {
            new com.applovin.exoplayer2.b0(13);
        }

        public a(j5.m0 m0Var, boolean z10, int[] iArr, boolean[] zArr) {
            boolean z11;
            int i10 = m0Var.f29801s;
            this.f30783s = i10;
            boolean z12 = false;
            if (i10 == iArr.length && i10 == zArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            d6.a.a(z11);
            this.f30784t = m0Var;
            if (z10 && i10 > 1) {
                z12 = true;
            }
            this.f30785u = z12;
            this.f30786v = (int[]) iArr.clone();
            this.f30787w = (boolean[]) zArr.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30785u == aVar.f30785u && this.f30784t.equals(aVar.f30784t) && Arrays.equals(this.f30786v, aVar.f30786v) && Arrays.equals(this.f30787w, aVar.f30787w)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f30787w) + ((Arrays.hashCode(this.f30786v) + (((this.f30784t.hashCode() * 31) + (this.f30785u ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        j0.b bVar = j7.j0.f30006t;
        f30779t = new r1(v1.f30113w);
        d6.g0.F(0);
    }

    public r1(j7.j0 j0Var) {
        this.f30780s = j7.j0.C(j0Var);
    }

    public final boolean a(int i10) {
        boolean z10;
        int i11 = 0;
        while (true) {
            j7.j0<a> j0Var = this.f30780s;
            if (i11 >= j0Var.size()) {
                return false;
            }
            a aVar = j0Var.get(i11);
            boolean[] zArr = aVar.f30787w;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (zArr[i12]) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && aVar.f30784t.f29803u == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            return this.f30780s.equals(((r1) obj).f30780s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30780s.hashCode();
    }
}
