package r5;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.exoplayer2.a0;
import d6.g0;
import java.util.Arrays;

/* compiled from: Cue.java */
/* loaded from: classes2.dex */
public final class a implements k4.f {
    public static final a J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f34892c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final a0 f34893d0;
    public final int A;
    public final float B;
    public final float C;
    public final boolean D;
    public final int E;
    public final int F;
    public final float G;
    public final int H;
    public final float I;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f34894s;

    /* renamed from: t, reason: collision with root package name */
    public final Layout.Alignment f34895t;

    /* renamed from: u, reason: collision with root package name */
    public final Layout.Alignment f34896u;

    /* renamed from: v, reason: collision with root package name */
    public final Bitmap f34897v;

    /* renamed from: w, reason: collision with root package name */
    public final float f34898w;

    /* renamed from: x, reason: collision with root package name */
    public final int f34899x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final float f34900z;

    static {
        C0471a c0471a = new C0471a();
        c0471a.f34901a = "";
        J = c0471a.a();
        K = g0.F(0);
        L = g0.F(1);
        M = g0.F(2);
        N = g0.F(3);
        O = g0.F(4);
        P = g0.F(5);
        Q = g0.F(6);
        R = g0.F(7);
        S = g0.F(8);
        T = g0.F(9);
        U = g0.F(10);
        V = g0.F(11);
        W = g0.F(12);
        X = g0.F(13);
        Y = g0.F(14);
        Z = g0.F(15);
        f34892c0 = g0.F(16);
        f34893d0 = new a0(27);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            d6.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f34894s = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f34894s = charSequence.toString();
        } else {
            this.f34894s = null;
        }
        this.f34895t = alignment;
        this.f34896u = alignment2;
        this.f34897v = bitmap;
        this.f34898w = f;
        this.f34899x = i10;
        this.y = i11;
        this.f34900z = f10;
        this.A = i12;
        this.B = f12;
        this.C = f13;
        this.D = z10;
        this.E = i14;
        this.F = i13;
        this.G = f11;
        this.H = i15;
        this.I = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.f34894s, aVar.f34894s) && this.f34895t == aVar.f34895t && this.f34896u == aVar.f34896u) {
            Bitmap bitmap = aVar.f34897v;
            Bitmap bitmap2 = this.f34897v;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f34898w == aVar.f34898w && this.f34899x == aVar.f34899x && this.y == aVar.y && this.f34900z == aVar.f34900z && this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34894s, this.f34895t, this.f34896u, this.f34897v, Float.valueOf(this.f34898w), Integer.valueOf(this.f34899x), Integer.valueOf(this.y), Float.valueOf(this.f34900z), Integer.valueOf(this.A), Float.valueOf(this.B), Float.valueOf(this.C), Boolean.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Float.valueOf(this.G), Integer.valueOf(this.H), Float.valueOf(this.I)});
    }

    /* compiled from: Cue.java */
    /* renamed from: r5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0471a {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f34901a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f34902b;

        /* renamed from: c, reason: collision with root package name */
        public Layout.Alignment f34903c;

        /* renamed from: d, reason: collision with root package name */
        public Layout.Alignment f34904d;

        /* renamed from: e, reason: collision with root package name */
        public float f34905e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f34906g;

        /* renamed from: h, reason: collision with root package name */
        public float f34907h;

        /* renamed from: i, reason: collision with root package name */
        public int f34908i;

        /* renamed from: j, reason: collision with root package name */
        public int f34909j;

        /* renamed from: k, reason: collision with root package name */
        public float f34910k;

        /* renamed from: l, reason: collision with root package name */
        public float f34911l;

        /* renamed from: m, reason: collision with root package name */
        public float f34912m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f34913n;
        public int o;

        /* renamed from: p, reason: collision with root package name */
        public int f34914p;

        /* renamed from: q, reason: collision with root package name */
        public float f34915q;

        public C0471a() {
            this.f34901a = null;
            this.f34902b = null;
            this.f34903c = null;
            this.f34904d = null;
            this.f34905e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.f34906g = Integer.MIN_VALUE;
            this.f34907h = -3.4028235E38f;
            this.f34908i = Integer.MIN_VALUE;
            this.f34909j = Integer.MIN_VALUE;
            this.f34910k = -3.4028235E38f;
            this.f34911l = -3.4028235E38f;
            this.f34912m = -3.4028235E38f;
            this.f34913n = false;
            this.o = -16777216;
            this.f34914p = Integer.MIN_VALUE;
        }

        public final a a() {
            return new a(this.f34901a, this.f34903c, this.f34904d, this.f34902b, this.f34905e, this.f, this.f34906g, this.f34907h, this.f34908i, this.f34909j, this.f34910k, this.f34911l, this.f34912m, this.f34913n, this.o, this.f34914p, this.f34915q);
        }

        public C0471a(a aVar) {
            this.f34901a = aVar.f34894s;
            this.f34902b = aVar.f34897v;
            this.f34903c = aVar.f34895t;
            this.f34904d = aVar.f34896u;
            this.f34905e = aVar.f34898w;
            this.f = aVar.f34899x;
            this.f34906g = aVar.y;
            this.f34907h = aVar.f34900z;
            this.f34908i = aVar.A;
            this.f34909j = aVar.F;
            this.f34910k = aVar.G;
            this.f34911l = aVar.B;
            this.f34912m = aVar.C;
            this.f34913n = aVar.D;
            this.o = aVar.E;
            this.f34914p = aVar.H;
            this.f34915q = aVar.I;
        }
    }
}
