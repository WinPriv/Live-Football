package k4;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Format.java */
/* loaded from: classes2.dex */
public final class i0 implements f {
    public final String A;
    public final Metadata B;
    public final String C;
    public final String D;
    public final int E;
    public final List<byte[]> F;
    public final DrmInitData G;
    public final long H;
    public final int I;
    public final int J;
    public final float K;
    public final int L;
    public final float M;
    public final byte[] N;
    public final int O;
    public final e6.b P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public int Z;

    /* renamed from: s, reason: collision with root package name */
    public final String f30518s;

    /* renamed from: t, reason: collision with root package name */
    public final String f30519t;

    /* renamed from: u, reason: collision with root package name */
    public final String f30520u;

    /* renamed from: v, reason: collision with root package name */
    public final int f30521v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30522w;

    /* renamed from: x, reason: collision with root package name */
    public final int f30523x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f30524z;

    /* renamed from: c0, reason: collision with root package name */
    public static final i0 f30495c0 = new i0(new a());

    /* renamed from: d0, reason: collision with root package name */
    public static final String f30496d0 = d6.g0.F(0);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f30497e0 = d6.g0.F(1);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f30498f0 = d6.g0.F(2);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f30499g0 = d6.g0.F(3);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f30500h0 = d6.g0.F(4);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f30501i0 = d6.g0.F(5);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f30502j0 = d6.g0.F(6);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f30503k0 = d6.g0.F(7);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f30504l0 = d6.g0.F(8);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f30505m0 = d6.g0.F(9);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f30506n0 = d6.g0.F(10);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f30507o0 = d6.g0.F(11);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f30508p0 = d6.g0.F(12);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f30509q0 = d6.g0.F(13);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f30510r0 = d6.g0.F(14);

    /* renamed from: s0, reason: collision with root package name */
    public static final String f30511s0 = d6.g0.F(15);

    /* renamed from: t0, reason: collision with root package name */
    public static final String f30512t0 = d6.g0.F(16);

    /* renamed from: u0, reason: collision with root package name */
    public static final String f30513u0 = d6.g0.F(17);

    /* renamed from: v0, reason: collision with root package name */
    public static final String f30514v0 = d6.g0.F(18);

    /* renamed from: w0, reason: collision with root package name */
    public static final String f30515w0 = d6.g0.F(19);

    /* renamed from: x0, reason: collision with root package name */
    public static final String f30516x0 = d6.g0.F(20);
    public static final String y0 = d6.g0.F(21);

    /* renamed from: z0, reason: collision with root package name */
    public static final String f30517z0 = d6.g0.F(22);
    public static final String A0 = d6.g0.F(23);
    public static final String B0 = d6.g0.F(24);
    public static final String C0 = d6.g0.F(25);
    public static final String D0 = d6.g0.F(26);
    public static final String E0 = d6.g0.F(27);
    public static final String F0 = d6.g0.F(28);
    public static final String G0 = d6.g0.F(29);
    public static final String H0 = d6.g0.F(30);
    public static final String I0 = d6.g0.F(31);
    public static final com.applovin.exoplayer2.a0 J0 = new com.applovin.exoplayer2.a0(17);

    public i0(a aVar) {
        this.f30518s = aVar.f30525a;
        this.f30519t = aVar.f30526b;
        this.f30520u = d6.g0.K(aVar.f30527c);
        this.f30521v = aVar.f30528d;
        this.f30522w = aVar.f30529e;
        int i10 = aVar.f;
        this.f30523x = i10;
        int i11 = aVar.f30530g;
        this.y = i11;
        this.f30524z = i11 != -1 ? i11 : i10;
        this.A = aVar.f30531h;
        this.B = aVar.f30532i;
        this.C = aVar.f30533j;
        this.D = aVar.f30534k;
        this.E = aVar.f30535l;
        List<byte[]> list = aVar.f30536m;
        this.F = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = aVar.f30537n;
        this.G = drmInitData;
        this.H = aVar.o;
        this.I = aVar.f30538p;
        this.J = aVar.f30539q;
        this.K = aVar.f30540r;
        int i12 = aVar.f30541s;
        this.L = i12 == -1 ? 0 : i12;
        float f = aVar.f30542t;
        this.M = f == -1.0f ? 1.0f : f;
        this.N = aVar.f30543u;
        this.O = aVar.f30544v;
        this.P = aVar.f30545w;
        this.Q = aVar.f30546x;
        this.R = aVar.y;
        this.S = aVar.f30547z;
        int i13 = aVar.A;
        this.T = i13 == -1 ? 0 : i13;
        int i14 = aVar.B;
        this.U = i14 != -1 ? i14 : 0;
        this.V = aVar.C;
        this.W = aVar.D;
        this.X = aVar.E;
        int i15 = aVar.F;
        if (i15 == 0 && drmInitData != null) {
            this.Y = 1;
        } else {
            this.Y = i15;
        }
    }

    public static String d(int i10) {
        return f30508p0 + "_" + Integer.toString(i10, 36);
    }

    public final a a() {
        return new a(this);
    }

    public final i0 b(int i10) {
        a a10 = a();
        a10.F = i10;
        return a10.a();
    }

    public final boolean c(i0 i0Var) {
        List<byte[]> list = this.F;
        if (list.size() != i0Var.F.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), i0Var.F.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final i0 e(i0 i0Var) {
        String str;
        String str2;
        float f;
        DrmInitData drmInitData;
        boolean z10;
        float f10;
        int i10;
        boolean z11;
        boolean z12;
        if (this == i0Var) {
            return this;
        }
        int i11 = d6.r.i(this.D);
        String str3 = i0Var.f30518s;
        String str4 = i0Var.f30519t;
        if (str4 == null) {
            str4 = this.f30519t;
        }
        if ((i11 != 3 && i11 != 1) || (str = i0Var.f30520u) == null) {
            str = this.f30520u;
        }
        int i12 = this.f30523x;
        if (i12 == -1) {
            i12 = i0Var.f30523x;
        }
        int i13 = this.y;
        if (i13 == -1) {
            i13 = i0Var.y;
        }
        String str5 = this.A;
        if (str5 == null) {
            String p10 = d6.g0.p(i11, i0Var.A);
            if (d6.g0.R(p10).length == 1) {
                str5 = p10;
            }
        }
        Metadata metadata = i0Var.B;
        Metadata metadata2 = this.B;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f19997s;
                if (entryArr.length != 0) {
                    int i14 = d6.g0.f27302a;
                    Metadata.Entry[] entryArr2 = metadata2.f19997s;
                    Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
                    metadata2 = new Metadata(metadata2.f19998t, (Metadata.Entry[]) copyOf);
                }
            }
            metadata = metadata2;
        }
        float f11 = this.K;
        if (f11 == -1.0f && i11 == 2) {
            f11 = i0Var.K;
        }
        int i15 = this.f30521v | i0Var.f30521v;
        int i16 = this.f30522w | i0Var.f30522w;
        ArrayList arrayList = new ArrayList();
        DrmInitData drmInitData2 = i0Var.G;
        if (drmInitData2 != null) {
            DrmInitData.SchemeData[] schemeDataArr = drmInitData2.f19905s;
            int length = schemeDataArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr[i17];
                DrmInitData.SchemeData[] schemeDataArr2 = schemeDataArr;
                if (schemeData.f19913w != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    arrayList.add(schemeData);
                }
                i17++;
                length = i18;
                schemeDataArr = schemeDataArr2;
            }
            str2 = drmInitData2.f19907u;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData3 = this.G;
        if (drmInitData3 != null) {
            if (str2 == null) {
                str2 = drmInitData3.f19907u;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData3.f19905s;
            int length2 = schemeDataArr3.length;
            String str6 = str2;
            int i19 = 0;
            while (i19 < length2) {
                int i20 = length2;
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i19];
                DrmInitData.SchemeData[] schemeDataArr4 = schemeDataArr3;
                if (schemeData2.f19913w != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i21 = 0;
                    while (true) {
                        if (i21 < size) {
                            i10 = size;
                            f10 = f11;
                            if (((DrmInitData.SchemeData) arrayList.get(i21)).f19910t.equals(schemeData2.f19910t)) {
                                z11 = true;
                                break;
                            }
                            i21++;
                            f11 = f10;
                            size = i10;
                        } else {
                            f10 = f11;
                            i10 = size;
                            z11 = false;
                            break;
                        }
                    }
                    if (!z11) {
                        arrayList.add(schemeData2);
                    }
                } else {
                    f10 = f11;
                    i10 = size;
                }
                i19++;
                length2 = i20;
                schemeDataArr3 = schemeDataArr4;
                f11 = f10;
                size = i10;
            }
            f = f11;
            str2 = str6;
        } else {
            f = f11;
        }
        if (arrayList.isEmpty()) {
            drmInitData = null;
        } else {
            drmInitData = new DrmInitData(str2, arrayList);
        }
        a aVar = new a(this);
        aVar.f30525a = str3;
        aVar.f30526b = str4;
        aVar.f30527c = str;
        aVar.f30528d = i15;
        aVar.f30529e = i16;
        aVar.f = i12;
        aVar.f30530g = i13;
        aVar.f30531h = str5;
        aVar.f30532i = metadata;
        aVar.f30537n = drmInitData;
        aVar.f30540r = f;
        return new i0(aVar);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i11 = this.Z;
        if (i11 != 0 && (i10 = i0Var.Z) != 0 && i11 != i10) {
            return false;
        }
        if (this.f30521v == i0Var.f30521v && this.f30522w == i0Var.f30522w && this.f30523x == i0Var.f30523x && this.y == i0Var.y && this.E == i0Var.E && this.H == i0Var.H && this.I == i0Var.I && this.J == i0Var.J && this.L == i0Var.L && this.O == i0Var.O && this.Q == i0Var.Q && this.R == i0Var.R && this.S == i0Var.S && this.T == i0Var.T && this.U == i0Var.U && this.V == i0Var.V && this.W == i0Var.W && this.X == i0Var.X && this.Y == i0Var.Y && Float.compare(this.K, i0Var.K) == 0 && Float.compare(this.M, i0Var.M) == 0 && d6.g0.a(this.f30518s, i0Var.f30518s) && d6.g0.a(this.f30519t, i0Var.f30519t) && d6.g0.a(this.A, i0Var.A) && d6.g0.a(this.C, i0Var.C) && d6.g0.a(this.D, i0Var.D) && d6.g0.a(this.f30520u, i0Var.f30520u) && Arrays.equals(this.N, i0Var.N) && d6.g0.a(this.B, i0Var.B) && d6.g0.a(this.P, i0Var.P) && d6.g0.a(this.G, i0Var.G) && c(i0Var)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.Z == 0) {
            int i11 = 0;
            String str = this.f30518s;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + hashCode) * 31;
            String str2 = this.f30519t;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i12 + i10) * 31;
            String str3 = this.f30520u;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 + hashCode2) * 31) + this.f30521v) * 31) + this.f30522w) * 31) + this.f30523x) * 31) + this.y) * 31;
            String str4 = this.A;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            Metadata metadata = this.B;
            if (metadata == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = metadata.hashCode();
            }
            int i16 = (i15 + hashCode4) * 31;
            String str5 = this.C;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            String str6 = this.D;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            this.Z = ((((((((((((((((((((Float.floatToIntBits(this.M) + ((((Float.floatToIntBits(this.K) + ((((((((((i17 + i11) * 31) + this.E) * 31) + ((int) this.H)) * 31) + this.I) * 31) + this.J) * 31)) * 31) + this.L) * 31)) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + this.Y;
        }
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f30518s);
        sb2.append(", ");
        sb2.append(this.f30519t);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.f30524z);
        sb2.append(", ");
        sb2.append(this.f30520u);
        sb2.append(", [");
        sb2.append(this.I);
        sb2.append(", ");
        sb2.append(this.J);
        sb2.append(", ");
        sb2.append(this.K);
        sb2.append("], [");
        sb2.append(this.Q);
        sb2.append(", ");
        return com.ironsource.adapters.facebook.a.i(sb2, this.R, "])");
    }

    /* compiled from: Format.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;

        /* renamed from: a, reason: collision with root package name */
        public String f30525a;

        /* renamed from: b, reason: collision with root package name */
        public String f30526b;

        /* renamed from: c, reason: collision with root package name */
        public String f30527c;

        /* renamed from: d, reason: collision with root package name */
        public int f30528d;

        /* renamed from: e, reason: collision with root package name */
        public int f30529e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f30530g;

        /* renamed from: h, reason: collision with root package name */
        public String f30531h;

        /* renamed from: i, reason: collision with root package name */
        public Metadata f30532i;

        /* renamed from: j, reason: collision with root package name */
        public String f30533j;

        /* renamed from: k, reason: collision with root package name */
        public String f30534k;

        /* renamed from: l, reason: collision with root package name */
        public int f30535l;

        /* renamed from: m, reason: collision with root package name */
        public List<byte[]> f30536m;

        /* renamed from: n, reason: collision with root package name */
        public DrmInitData f30537n;
        public long o;

        /* renamed from: p, reason: collision with root package name */
        public int f30538p;

        /* renamed from: q, reason: collision with root package name */
        public int f30539q;

        /* renamed from: r, reason: collision with root package name */
        public float f30540r;

        /* renamed from: s, reason: collision with root package name */
        public int f30541s;

        /* renamed from: t, reason: collision with root package name */
        public float f30542t;

        /* renamed from: u, reason: collision with root package name */
        public byte[] f30543u;

        /* renamed from: v, reason: collision with root package name */
        public int f30544v;

        /* renamed from: w, reason: collision with root package name */
        public e6.b f30545w;

        /* renamed from: x, reason: collision with root package name */
        public int f30546x;
        public int y;

        /* renamed from: z, reason: collision with root package name */
        public int f30547z;

        public a() {
            this.f = -1;
            this.f30530g = -1;
            this.f30535l = -1;
            this.o = Long.MAX_VALUE;
            this.f30538p = -1;
            this.f30539q = -1;
            this.f30540r = -1.0f;
            this.f30542t = 1.0f;
            this.f30544v = -1;
            this.f30546x = -1;
            this.y = -1;
            this.f30547z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        public final i0 a() {
            return new i0(this);
        }

        public final void b(int i10) {
            this.f30525a = Integer.toString(i10);
        }

        public a(i0 i0Var) {
            this.f30525a = i0Var.f30518s;
            this.f30526b = i0Var.f30519t;
            this.f30527c = i0Var.f30520u;
            this.f30528d = i0Var.f30521v;
            this.f30529e = i0Var.f30522w;
            this.f = i0Var.f30523x;
            this.f30530g = i0Var.y;
            this.f30531h = i0Var.A;
            this.f30532i = i0Var.B;
            this.f30533j = i0Var.C;
            this.f30534k = i0Var.D;
            this.f30535l = i0Var.E;
            this.f30536m = i0Var.F;
            this.f30537n = i0Var.G;
            this.o = i0Var.H;
            this.f30538p = i0Var.I;
            this.f30539q = i0Var.J;
            this.f30540r = i0Var.K;
            this.f30541s = i0Var.L;
            this.f30542t = i0Var.M;
            this.f30543u = i0Var.N;
            this.f30544v = i0Var.O;
            this.f30545w = i0Var.P;
            this.f30546x = i0Var.Q;
            this.y = i0Var.R;
            this.f30547z = i0Var.S;
            this.A = i0Var.T;
            this.B = i0Var.U;
            this.C = i0Var.V;
            this.D = i0Var.W;
            this.E = i0Var.X;
            this.F = i0Var.Y;
        }
    }
}
