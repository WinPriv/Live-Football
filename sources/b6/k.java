package b6;

import android.os.Bundle;
import d6.g0;
import j7.j0;
import j7.m0;
import j7.m1;
import j7.t0;
import j7.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes2.dex */
public class k implements k4.f {
    public static final k S = new k(new a());
    public static final String T = g0.F(1);
    public static final String U = g0.F(2);
    public static final String V = g0.F(3);
    public static final String W = g0.F(4);
    public static final String X = g0.F(5);
    public static final String Y = g0.F(6);
    public static final String Z = g0.F(7);

    /* renamed from: c0, reason: collision with root package name */
    public static final String f3073c0 = g0.F(8);

    /* renamed from: d0, reason: collision with root package name */
    public static final String f3074d0 = g0.F(9);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f3075e0 = g0.F(10);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f3076f0 = g0.F(11);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f3077g0 = g0.F(12);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f3078h0 = g0.F(13);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f3079i0 = g0.F(14);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f3080j0 = g0.F(15);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f3081k0 = g0.F(16);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f3082l0 = g0.F(17);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f3083m0 = g0.F(18);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f3084n0 = g0.F(19);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f3085o0 = g0.F(20);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f3086p0 = g0.F(21);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f3087q0 = g0.F(22);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f3088r0 = g0.F(23);

    /* renamed from: s0, reason: collision with root package name */
    public static final String f3089s0 = g0.F(24);

    /* renamed from: t0, reason: collision with root package name */
    public static final String f3090t0 = g0.F(25);

    /* renamed from: u0, reason: collision with root package name */
    public static final String f3091u0 = g0.F(26);
    public final int A;
    public final int B;
    public final boolean C;
    public final j0<String> D;
    public final int E;
    public final j0<String> F;
    public final int G;
    public final int H;
    public final int I;
    public final j0<String> J;
    public final j0<String> K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final m0<j5.m0, j> Q;
    public final t0<Integer> R;

    /* renamed from: s, reason: collision with root package name */
    public final int f3092s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3093t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3094u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3095v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3096w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3097x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3098z;

    public k(a aVar) {
        this.f3092s = aVar.f3099a;
        this.f3093t = aVar.f3100b;
        this.f3094u = aVar.f3101c;
        this.f3095v = aVar.f3102d;
        this.f3096w = aVar.f3103e;
        this.f3097x = aVar.f;
        this.y = aVar.f3104g;
        this.f3098z = aVar.f3105h;
        this.A = aVar.f3106i;
        this.B = aVar.f3107j;
        this.C = aVar.f3108k;
        this.D = aVar.f3109l;
        this.E = aVar.f3110m;
        this.F = aVar.f3111n;
        this.G = aVar.o;
        this.H = aVar.f3112p;
        this.I = aVar.f3113q;
        this.J = aVar.f3114r;
        this.K = aVar.f3115s;
        this.L = aVar.f3116t;
        this.M = aVar.f3117u;
        this.N = aVar.f3118v;
        this.O = aVar.f3119w;
        this.P = aVar.f3120x;
        this.Q = m0.a(aVar.y);
        this.R = t0.D(aVar.f3121z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f3092s == kVar.f3092s && this.f3093t == kVar.f3093t && this.f3094u == kVar.f3094u && this.f3095v == kVar.f3095v && this.f3096w == kVar.f3096w && this.f3097x == kVar.f3097x && this.y == kVar.y && this.f3098z == kVar.f3098z && this.C == kVar.C && this.A == kVar.A && this.B == kVar.B && this.D.equals(kVar.D) && this.E == kVar.E && this.F.equals(kVar.F) && this.G == kVar.G && this.H == kVar.H && this.I == kVar.I && this.J.equals(kVar.J) && this.K.equals(kVar.K) && this.L == kVar.L && this.M == kVar.M && this.N == kVar.N && this.O == kVar.O && this.P == kVar.P) {
            m0<j5.m0, j> m0Var = this.Q;
            m0Var.getClass();
            if (m1.a(m0Var, kVar.Q) && this.R.equals(kVar.R)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.R.hashCode() + ((this.Q.hashCode() + ((((((((((((this.K.hashCode() + ((this.J.hashCode() + ((((((((this.F.hashCode() + ((((this.D.hashCode() + ((((((((((((((((((((((this.f3092s + 31) * 31) + this.f3093t) * 31) + this.f3094u) * 31) + this.f3095v) * 31) + this.f3096w) * 31) + this.f3097x) * 31) + this.y) * 31) + this.f3098z) * 31) + (this.C ? 1 : 0)) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.E) * 31)) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31)) * 31)) * 31) + this.L) * 31) + this.M) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31)) * 31);
    }

    /* compiled from: TrackSelectionParameters.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3099a;

        /* renamed from: b, reason: collision with root package name */
        public int f3100b;

        /* renamed from: c, reason: collision with root package name */
        public int f3101c;

        /* renamed from: d, reason: collision with root package name */
        public int f3102d;

        /* renamed from: e, reason: collision with root package name */
        public int f3103e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f3104g;

        /* renamed from: h, reason: collision with root package name */
        public int f3105h;

        /* renamed from: i, reason: collision with root package name */
        public int f3106i;

        /* renamed from: j, reason: collision with root package name */
        public int f3107j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3108k;

        /* renamed from: l, reason: collision with root package name */
        public j0<String> f3109l;

        /* renamed from: m, reason: collision with root package name */
        public int f3110m;

        /* renamed from: n, reason: collision with root package name */
        public j0<String> f3111n;
        public int o;

        /* renamed from: p, reason: collision with root package name */
        public int f3112p;

        /* renamed from: q, reason: collision with root package name */
        public int f3113q;

        /* renamed from: r, reason: collision with root package name */
        public j0<String> f3114r;

        /* renamed from: s, reason: collision with root package name */
        public j0<String> f3115s;

        /* renamed from: t, reason: collision with root package name */
        public int f3116t;

        /* renamed from: u, reason: collision with root package name */
        public int f3117u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f3118v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f3119w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f3120x;
        public HashMap<j5.m0, j> y;

        /* renamed from: z, reason: collision with root package name */
        public HashSet<Integer> f3121z;

        @Deprecated
        public a() {
            this.f3099a = Integer.MAX_VALUE;
            this.f3100b = Integer.MAX_VALUE;
            this.f3101c = Integer.MAX_VALUE;
            this.f3102d = Integer.MAX_VALUE;
            this.f3106i = Integer.MAX_VALUE;
            this.f3107j = Integer.MAX_VALUE;
            this.f3108k = true;
            j0.b bVar = j0.f30006t;
            v1 v1Var = v1.f30113w;
            this.f3109l = v1Var;
            this.f3110m = 0;
            this.f3111n = v1Var;
            this.o = 0;
            this.f3112p = Integer.MAX_VALUE;
            this.f3113q = Integer.MAX_VALUE;
            this.f3114r = v1Var;
            this.f3115s = v1Var;
            this.f3116t = 0;
            this.f3117u = 0;
            this.f3118v = false;
            this.f3119w = false;
            this.f3120x = false;
            this.y = new HashMap<>();
            this.f3121z = new HashSet<>();
        }

        public static v1 a(String[] strArr) {
            j0.b bVar = j0.f30006t;
            j0.a aVar = new j0.a();
            for (String str : strArr) {
                str.getClass();
                aVar.b(g0.K(str));
            }
            return aVar.e();
        }

        public a b(int i10, int i11) {
            this.f3106i = i10;
            this.f3107j = i11;
            this.f3108k = true;
            return this;
        }

        public a(Bundle bundle) {
            v1 a10;
            String str = k.Y;
            k kVar = k.S;
            this.f3099a = bundle.getInt(str, kVar.f3092s);
            this.f3100b = bundle.getInt(k.Z, kVar.f3093t);
            this.f3101c = bundle.getInt(k.f3073c0, kVar.f3094u);
            this.f3102d = bundle.getInt(k.f3074d0, kVar.f3095v);
            this.f3103e = bundle.getInt(k.f3075e0, kVar.f3096w);
            this.f = bundle.getInt(k.f3076f0, kVar.f3097x);
            this.f3104g = bundle.getInt(k.f3077g0, kVar.y);
            this.f3105h = bundle.getInt(k.f3078h0, kVar.f3098z);
            this.f3106i = bundle.getInt(k.f3079i0, kVar.A);
            this.f3107j = bundle.getInt(k.f3080j0, kVar.B);
            this.f3108k = bundle.getBoolean(k.f3081k0, kVar.C);
            String[] stringArray = bundle.getStringArray(k.f3082l0);
            this.f3109l = j0.D(stringArray == null ? new String[0] : stringArray);
            this.f3110m = bundle.getInt(k.f3090t0, kVar.E);
            String[] stringArray2 = bundle.getStringArray(k.T);
            this.f3111n = a(stringArray2 == null ? new String[0] : stringArray2);
            this.o = bundle.getInt(k.U, kVar.G);
            this.f3112p = bundle.getInt(k.f3083m0, kVar.H);
            this.f3113q = bundle.getInt(k.f3084n0, kVar.I);
            String[] stringArray3 = bundle.getStringArray(k.f3085o0);
            this.f3114r = j0.D(stringArray3 == null ? new String[0] : stringArray3);
            String[] stringArray4 = bundle.getStringArray(k.V);
            this.f3115s = a(stringArray4 == null ? new String[0] : stringArray4);
            this.f3116t = bundle.getInt(k.W, kVar.L);
            this.f3117u = bundle.getInt(k.f3091u0, kVar.M);
            this.f3118v = bundle.getBoolean(k.X, kVar.N);
            this.f3119w = bundle.getBoolean(k.f3086p0, kVar.O);
            this.f3120x = bundle.getBoolean(k.f3087q0, kVar.P);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(k.f3088r0);
            if (parcelableArrayList == null) {
                a10 = v1.f30113w;
            } else {
                a10 = d6.b.a(j.f3070w, parcelableArrayList);
            }
            this.y = new HashMap<>();
            for (int i10 = 0; i10 < a10.f30115v; i10++) {
                j jVar = (j) a10.get(i10);
                this.y.put(jVar.f3071s, jVar);
            }
            int[] intArray = bundle.getIntArray(k.f3089s0);
            intArray = intArray == null ? new int[0] : intArray;
            this.f3121z = new HashSet<>();
            for (int i11 : intArray) {
                this.f3121z.add(Integer.valueOf(i11));
            }
        }
    }
}
