package k4;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import com.huawei.hms.ads.gl;
import j7.j0;
import j7.v1;
import j7.w1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: MediaItem.java */
/* loaded from: classes2.dex */
public final class n0 implements k4.f {

    /* renamed from: s, reason: collision with root package name */
    public final String f30574s;

    /* renamed from: t, reason: collision with root package name */
    public final g f30575t;

    /* renamed from: u, reason: collision with root package name */
    public final e f30576u;

    /* renamed from: v, reason: collision with root package name */
    public final o0 f30577v;

    /* renamed from: w, reason: collision with root package name */
    public final c f30578w;

    /* renamed from: x, reason: collision with root package name */
    public final h f30579x;
    public static final n0 y = new a().a();

    /* renamed from: z, reason: collision with root package name */
    public static final String f30573z = d6.g0.F(0);
    public static final String A = d6.g0.F(1);
    public static final String B = d6.g0.F(2);
    public static final String C = d6.g0.F(3);
    public static final String D = d6.g0.F(4);
    public static final com.applovin.exoplayer2.a0 E = new com.applovin.exoplayer2.a0(18);

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static class b implements k4.f {

        /* renamed from: s, reason: collision with root package name */
        public final long f30593s;

        /* renamed from: t, reason: collision with root package name */
        public final long f30594t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f30595u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f30596v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f30597w;

        /* renamed from: x, reason: collision with root package name */
        public static final c f30591x = new c(new a());
        public static final String y = d6.g0.F(0);

        /* renamed from: z, reason: collision with root package name */
        public static final String f30592z = d6.g0.F(1);
        public static final String A = d6.g0.F(2);
        public static final String B = d6.g0.F(3);
        public static final String C = d6.g0.F(4);
        public static final com.applovin.exoplayer2.b0 D = new com.applovin.exoplayer2.b0(9);

        public b(a aVar) {
            this.f30593s = aVar.f30598a;
            this.f30594t = aVar.f30599b;
            this.f30595u = aVar.f30600c;
            this.f30596v = aVar.f30601d;
            this.f30597w = aVar.f30602e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f30593s == bVar.f30593s && this.f30594t == bVar.f30594t && this.f30595u == bVar.f30595u && this.f30596v == bVar.f30596v && this.f30597w == bVar.f30597w) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f30593s;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f30594t;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f30595u ? 1 : 0)) * 31) + (this.f30596v ? 1 : 0)) * 31) + (this.f30597w ? 1 : 0);
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f30598a;

            /* renamed from: b, reason: collision with root package name */
            public long f30599b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f30600c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f30601d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f30602e;

            public a() {
                this.f30599b = Long.MIN_VALUE;
            }

            public a(c cVar) {
                this.f30598a = cVar.f30593s;
                this.f30599b = cVar.f30594t;
                this.f30600c = cVar.f30595u;
                this.f30601d = cVar.f30596v;
                this.f30602e = cVar.f30597w;
            }
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class c extends b {
        public static final c E = new c(new b.a());

        public c(b.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f30629a;

        /* renamed from: b, reason: collision with root package name */
        public final String f30630b;

        /* renamed from: c, reason: collision with root package name */
        public final d f30631c;

        /* renamed from: d, reason: collision with root package name */
        public final List<StreamKey> f30632d;

        /* renamed from: e, reason: collision with root package name */
        public final String f30633e;
        public final j7.j0<j> f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f30634g;

        public f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, List list, String str2, j7.j0 j0Var, Object obj) {
            this.f30629a = uri;
            this.f30630b = str;
            this.f30631c = dVar;
            this.f30632d = list;
            this.f30633e = str2;
            this.f = j0Var;
            j0.b bVar = j7.j0.f30006t;
            j0.a aVar = new j0.a();
            for (int i10 = 0; i10 < j0Var.size(); i10++) {
                j jVar = (j) j0Var.get(i10);
                jVar.getClass();
                aVar.b(new i(new j.a(jVar)));
            }
            aVar.e();
            this.f30634g = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f30629a.equals(fVar.f30629a) && d6.g0.a(this.f30630b, fVar.f30630b) && d6.g0.a(this.f30631c, fVar.f30631c) && d6.g0.a(null, null) && this.f30632d.equals(fVar.f30632d) && d6.g0.a(this.f30633e, fVar.f30633e) && this.f.equals(fVar.f) && d6.g0.a(this.f30634g, fVar.f30634g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f30629a.hashCode() * 31;
            int i10 = 0;
            String str = this.f30630b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode4 + hashCode) * 31;
            d dVar = this.f30631c;
            if (dVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = dVar.hashCode();
            }
            int hashCode5 = (this.f30632d.hashCode() + ((((i11 + hashCode2) * 31) + 0) * 31)) * 31;
            String str2 = this.f30633e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (this.f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
            Object obj = this.f30634g;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode6 + i10;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class g extends f {
        public g(Uri uri, String str, d dVar, List list, String str2, j7.j0 j0Var, Object obj) {
            super(uri, str, dVar, list, str2, j0Var, obj);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class h implements k4.f {

        /* renamed from: u, reason: collision with root package name */
        public static final h f30635u = new h(new a());

        /* renamed from: v, reason: collision with root package name */
        public static final String f30636v = d6.g0.F(0);

        /* renamed from: w, reason: collision with root package name */
        public static final String f30637w = d6.g0.F(1);

        /* renamed from: x, reason: collision with root package name */
        public static final String f30638x = d6.g0.F(2);
        public static final com.applovin.exoplayer2.a.l y = new com.applovin.exoplayer2.a.l(15);

        /* renamed from: s, reason: collision with root package name */
        public final Uri f30639s;

        /* renamed from: t, reason: collision with root package name */
        public final String f30640t;

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f30641a;

            /* renamed from: b, reason: collision with root package name */
            public String f30642b;

            /* renamed from: c, reason: collision with root package name */
            public Bundle f30643c;
        }

        public h(a aVar) {
            this.f30639s = aVar.f30641a;
            this.f30640t = aVar.f30642b;
            Bundle bundle = aVar.f30643c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (d6.g0.a(this.f30639s, hVar.f30639s) && d6.g0.a(this.f30640t, hVar.f30640t)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i10 = 0;
            Uri uri = this.f30639s;
            if (uri == null) {
                hashCode = 0;
            } else {
                hashCode = uri.hashCode();
            }
            int i11 = hashCode * 31;
            String str = this.f30640t;
            if (str != null) {
                i10 = str.hashCode();
            }
            return i11 + i10;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class i extends j {
        public i(j.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f30644a;

        /* renamed from: b, reason: collision with root package name */
        public final String f30645b;

        /* renamed from: c, reason: collision with root package name */
        public final String f30646c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30647d;

        /* renamed from: e, reason: collision with root package name */
        public final int f30648e;
        public final String f;

        /* renamed from: g, reason: collision with root package name */
        public final String f30649g;

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Uri f30650a;

            /* renamed from: b, reason: collision with root package name */
            public final String f30651b;

            /* renamed from: c, reason: collision with root package name */
            public final String f30652c;

            /* renamed from: d, reason: collision with root package name */
            public final int f30653d;

            /* renamed from: e, reason: collision with root package name */
            public final int f30654e;
            public final String f;

            /* renamed from: g, reason: collision with root package name */
            public final String f30655g;

            public a(j jVar) {
                this.f30650a = jVar.f30644a;
                this.f30651b = jVar.f30645b;
                this.f30652c = jVar.f30646c;
                this.f30653d = jVar.f30647d;
                this.f30654e = jVar.f30648e;
                this.f = jVar.f;
                this.f30655g = jVar.f30649g;
            }
        }

        public j(a aVar) {
            this.f30644a = aVar.f30650a;
            this.f30645b = aVar.f30651b;
            this.f30646c = aVar.f30652c;
            this.f30647d = aVar.f30653d;
            this.f30648e = aVar.f30654e;
            this.f = aVar.f;
            this.f30649g = aVar.f30655g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.f30644a.equals(jVar.f30644a) && d6.g0.a(this.f30645b, jVar.f30645b) && d6.g0.a(this.f30646c, jVar.f30646c) && this.f30647d == jVar.f30647d && this.f30648e == jVar.f30648e && d6.g0.a(this.f, jVar.f) && d6.g0.a(this.f30649g, jVar.f30649g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f30644a.hashCode() * 31;
            int i10 = 0;
            String str = this.f30645b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode4 + hashCode) * 31;
            String str2 = this.f30646c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (((((i11 + hashCode2) * 31) + this.f30647d) * 31) + this.f30648e) * 31;
            String str3 = this.f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            String str4 = this.f30649g;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return i13 + i10;
        }
    }

    public n0(String str, c cVar, g gVar, e eVar, o0 o0Var, h hVar) {
        this.f30574s = str;
        this.f30575t = gVar;
        this.f30576u = eVar;
        this.f30577v = o0Var;
        this.f30578w = cVar;
        this.f30579x = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (d6.g0.a(this.f30574s, n0Var.f30574s) && this.f30578w.equals(n0Var.f30578w) && d6.g0.a(this.f30575t, n0Var.f30575t) && d6.g0.a(this.f30576u, n0Var.f30576u) && d6.g0.a(this.f30577v, n0Var.f30577v) && d6.g0.a(this.f30579x, n0Var.f30579x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f30574s.hashCode() * 31;
        g gVar = this.f30575t;
        if (gVar != null) {
            i10 = gVar.hashCode();
        } else {
            i10 = 0;
        }
        return this.f30579x.hashCode() + ((this.f30577v.hashCode() + ((this.f30578w.hashCode() + ((this.f30576u.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f30603a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f30604b;

        /* renamed from: c, reason: collision with root package name */
        public final j7.m0<String, String> f30605c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f30606d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f30607e;
        public final boolean f;

        /* renamed from: g, reason: collision with root package name */
        public final j7.j0<Integer> f30608g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f30609h;

        public d(a aVar) {
            boolean z10;
            byte[] bArr;
            boolean z11 = aVar.f;
            Uri uri = aVar.f30611b;
            if (z11 && uri == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            d6.a.d(z10);
            UUID uuid = aVar.f30610a;
            uuid.getClass();
            this.f30603a = uuid;
            this.f30604b = uri;
            this.f30605c = aVar.f30612c;
            this.f30606d = aVar.f30613d;
            this.f = z11;
            this.f30607e = aVar.f30614e;
            this.f30608g = aVar.f30615g;
            byte[] bArr2 = aVar.f30616h;
            if (bArr2 != null) {
                bArr = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                bArr = null;
            }
            this.f30609h = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f30603a.equals(dVar.f30603a) && d6.g0.a(this.f30604b, dVar.f30604b) && d6.g0.a(this.f30605c, dVar.f30605c) && this.f30606d == dVar.f30606d && this.f == dVar.f && this.f30607e == dVar.f30607e && this.f30608g.equals(dVar.f30608g) && Arrays.equals(this.f30609h, dVar.f30609h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int hashCode = this.f30603a.hashCode() * 31;
            Uri uri = this.f30604b;
            if (uri != null) {
                i10 = uri.hashCode();
            } else {
                i10 = 0;
            }
            return Arrays.hashCode(this.f30609h) + ((this.f30608g.hashCode() + ((((((((this.f30605c.hashCode() + ((hashCode + i10) * 31)) * 31) + (this.f30606d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f30607e ? 1 : 0)) * 31)) * 31);
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final UUID f30610a;

            /* renamed from: b, reason: collision with root package name */
            public final Uri f30611b;

            /* renamed from: c, reason: collision with root package name */
            public final j7.m0<String, String> f30612c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f30613d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f30614e;
            public final boolean f;

            /* renamed from: g, reason: collision with root package name */
            public final j7.j0<Integer> f30615g;

            /* renamed from: h, reason: collision with root package name */
            public final byte[] f30616h;

            public a() {
                this.f30612c = w1.y;
                j0.b bVar = j7.j0.f30006t;
                this.f30615g = v1.f30113w;
            }

            public a(d dVar) {
                this.f30610a = dVar.f30603a;
                this.f30611b = dVar.f30604b;
                this.f30612c = dVar.f30605c;
                this.f30613d = dVar.f30606d;
                this.f30614e = dVar.f30607e;
                this.f = dVar.f;
                this.f30615g = dVar.f30608g;
                this.f30616h = dVar.f30609h;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class e implements k4.f {

        /* renamed from: s, reason: collision with root package name */
        public final long f30619s;

        /* renamed from: t, reason: collision with root package name */
        public final long f30620t;

        /* renamed from: u, reason: collision with root package name */
        public final long f30621u;

        /* renamed from: v, reason: collision with root package name */
        public final float f30622v;

        /* renamed from: w, reason: collision with root package name */
        public final float f30623w;

        /* renamed from: x, reason: collision with root package name */
        public static final e f30617x = new e(com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, -3.4028235E38f, -3.4028235E38f);
        public static final String y = d6.g0.F(0);

        /* renamed from: z, reason: collision with root package name */
        public static final String f30618z = d6.g0.F(1);
        public static final String A = d6.g0.F(2);
        public static final String B = d6.g0.F(3);
        public static final String C = d6.g0.F(4);
        public static final com.applovin.exoplayer2.d.w D = new com.applovin.exoplayer2.d.w(8);

        @Deprecated
        public e(long j10, long j11, long j12, float f, float f10) {
            this.f30619s = j10;
            this.f30620t = j11;
            this.f30621u = j12;
            this.f30622v = f;
            this.f30623w = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f30619s == eVar.f30619s && this.f30620t == eVar.f30620t && this.f30621u == eVar.f30621u && this.f30622v == eVar.f30622v && this.f30623w == eVar.f30623w) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            long j10 = this.f30619s;
            long j11 = this.f30620t;
            int i11 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f30621u;
            int i12 = (i11 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f = this.f30622v;
            int i13 = 0;
            if (f != gl.Code) {
                i10 = Float.floatToIntBits(f);
            } else {
                i10 = 0;
            }
            int i14 = (i12 + i10) * 31;
            float f10 = this.f30623w;
            if (f10 != gl.Code) {
                i13 = Float.floatToIntBits(f10);
            }
            return i14 + i13;
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f30624a;

            /* renamed from: b, reason: collision with root package name */
            public long f30625b;

            /* renamed from: c, reason: collision with root package name */
            public long f30626c;

            /* renamed from: d, reason: collision with root package name */
            public float f30627d;

            /* renamed from: e, reason: collision with root package name */
            public float f30628e;

            public a() {
                this.f30624a = com.anythink.expressad.exoplayer.b.f7291b;
                this.f30625b = com.anythink.expressad.exoplayer.b.f7291b;
                this.f30626c = com.anythink.expressad.exoplayer.b.f7291b;
                this.f30627d = -3.4028235E38f;
                this.f30628e = -3.4028235E38f;
            }

            public a(e eVar) {
                this.f30624a = eVar.f30619s;
                this.f30625b = eVar.f30620t;
                this.f30626c = eVar.f30621u;
                this.f30627d = eVar.f30622v;
                this.f30628e = eVar.f30623w;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f30580a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f30581b;

        /* renamed from: c, reason: collision with root package name */
        public final String f30582c;

        /* renamed from: d, reason: collision with root package name */
        public final b.a f30583d;

        /* renamed from: e, reason: collision with root package name */
        public d.a f30584e;
        public final List<StreamKey> f;

        /* renamed from: g, reason: collision with root package name */
        public String f30585g;

        /* renamed from: h, reason: collision with root package name */
        public j7.j0<j> f30586h;

        /* renamed from: i, reason: collision with root package name */
        public Object f30587i;

        /* renamed from: j, reason: collision with root package name */
        public final o0 f30588j;

        /* renamed from: k, reason: collision with root package name */
        public e.a f30589k;

        /* renamed from: l, reason: collision with root package name */
        public final h f30590l;

        public a() {
            this.f30583d = new b.a();
            this.f30584e = new d.a();
            this.f = Collections.emptyList();
            this.f30586h = v1.f30113w;
            this.f30589k = new e.a();
            this.f30590l = h.f30635u;
        }

        public final n0 a() {
            boolean z10;
            g gVar;
            d.a aVar = this.f30584e;
            if (aVar.f30611b != null && aVar.f30610a == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            d6.a.d(z10);
            Uri uri = this.f30581b;
            d dVar = null;
            if (uri != null) {
                String str = this.f30582c;
                d.a aVar2 = this.f30584e;
                if (aVar2.f30610a != null) {
                    dVar = new d(aVar2);
                }
                gVar = new g(uri, str, dVar, this.f, this.f30585g, this.f30586h, this.f30587i);
            } else {
                gVar = null;
            }
            String str2 = this.f30580a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar3 = this.f30583d;
            aVar3.getClass();
            c cVar = new c(aVar3);
            e.a aVar4 = this.f30589k;
            aVar4.getClass();
            e eVar = new e(aVar4.f30624a, aVar4.f30625b, aVar4.f30626c, aVar4.f30627d, aVar4.f30628e);
            o0 o0Var = this.f30588j;
            if (o0Var == null) {
                o0Var = o0.f30662c0;
            }
            return new n0(str3, cVar, gVar, eVar, o0Var, this.f30590l);
        }

        public a(n0 n0Var) {
            this();
            d.a aVar;
            c cVar = n0Var.f30578w;
            cVar.getClass();
            this.f30583d = new b.a(cVar);
            this.f30580a = n0Var.f30574s;
            this.f30588j = n0Var.f30577v;
            e eVar = n0Var.f30576u;
            eVar.getClass();
            this.f30589k = new e.a(eVar);
            this.f30590l = n0Var.f30579x;
            g gVar = n0Var.f30575t;
            if (gVar != null) {
                this.f30585g = gVar.f30633e;
                this.f30582c = gVar.f30630b;
                this.f30581b = gVar.f30629a;
                this.f = gVar.f30632d;
                this.f30586h = gVar.f;
                this.f30587i = gVar.f30634g;
                d dVar = gVar.f30631c;
                if (dVar != null) {
                    aVar = new d.a(dVar);
                } else {
                    aVar = new d.a();
                }
                this.f30584e = aVar;
            }
        }
    }
}
