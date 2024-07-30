package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface an {

    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: a */
        public static final a f13214a = new C0151a().a();

        /* renamed from: b */
        public static final g.a<a> f13215b = new a0(1);

        /* renamed from: c */
        private final com.applovin.exoplayer2.l.m f13216c;

        /* renamed from: com.applovin.exoplayer2.an$a$a */
        /* loaded from: classes.dex */
        public static final class C0151a {

            /* renamed from: a */
            private static final int[] f13217a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: b */
            private final m.a f13218b = new m.a();

            public C0151a a(int i10) {
                this.f13218b.a(i10);
                return this;
            }

            public C0151a a(int i10, boolean z10) {
                this.f13218b.a(i10, z10);
                return this;
            }

            public C0151a a(int... iArr) {
                this.f13218b.a(iArr);
                return this;
            }

            public C0151a a(a aVar) {
                this.f13218b.a(aVar.f13216c);
                return this;
            }

            public a a() {
                return new a(this.f13218b.a());
            }
        }

        public /* synthetic */ a(com.applovin.exoplayer2.l.m mVar, AnonymousClass1 anonymousClass1) {
            this(mVar);
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f13216c.equals(((a) obj).f13216c);
        }

        public int hashCode() {
            return this.f13216c.hashCode();
        }

        private a(com.applovin.exoplayer2.l.m mVar) {
            this.f13216c = mVar;
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean a(int i10) {
            return this.f13216c.a(i10);
        }

        public static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f13214a;
            }
            C0151a c0151a = new C0151a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                c0151a.a(integerArrayList.get(i10).intValue());
            }
            return c0151a.a();
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b {
        default void a(ab abVar, int i10) {
        }

        @Deprecated
        default void b() {
        }

        default void c(int i10) {
        }

        default void d(int i10) {
        }

        @Deprecated
        default void e(int i10) {
        }

        default void a(ac acVar) {
        }

        default void b(int i10) {
        }

        @Deprecated
        default void c(boolean z10) {
        }

        default void d(boolean z10) {
        }

        default void e(boolean z10) {
        }

        default void a(ak akVar) {
        }

        default void b(ak akVar) {
        }

        default void a(am amVar) {
        }

        default void b(boolean z10, int i10) {
        }

        default void a(a aVar) {
        }

        default void a(e eVar, e eVar2, int i10) {
        }

        default void a(an anVar, c cVar) {
        }

        default void a(ba baVar, int i10) {
        }

        default void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
        }

        @Deprecated
        default void a(boolean z10, int i10) {
        }

        default void b_(boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final com.applovin.exoplayer2.l.m f13219a;

        public c(com.applovin.exoplayer2.l.m mVar) {
            this.f13219a = mVar;
        }

        public boolean a(int i10) {
            return this.f13219a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f13219a.equals(((c) obj).f13219a);
        }

        public int hashCode() {
            return this.f13219a.hashCode();
        }

        public boolean a(int... iArr) {
            return this.f13219a.a(iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface d extends b {
        default void a() {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b(int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void d(int i10) {
        }

        default void a(float f) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b(ak akVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void d(boolean z10) {
        }

        default void a(int i10, int i11) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b(boolean z10, int i10) {
        }

        default void a(int i10, boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ab abVar, int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ac acVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ak akVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(am amVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(a aVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(e eVar, e eVar2, int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(an anVar, c cVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ba baVar, int i10) {
        }

        default void a(com.applovin.exoplayer2.g.a aVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
        }

        default void a(com.applovin.exoplayer2.m.o oVar) {
        }

        default void a(o oVar) {
        }

        default void a(List<com.applovin.exoplayer2.i.a> list) {
        }

        default void a_(boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b_(boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void c(int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void e(boolean z10) {
        }
    }

    long A();

    long B();

    long C();

    am D();

    int F();

    int G();

    long H();

    long I();

    long J();

    boolean K();

    int L();

    int M();

    long N();

    long O();

    com.applovin.exoplayer2.h.ad P();

    com.applovin.exoplayer2.j.h Q();

    ac R();

    ba S();

    com.applovin.exoplayer2.m.o T();

    List<com.applovin.exoplayer2.i.a> V();

    void a(int i10, long j10);

    void a(long j10);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(d dVar);

    void a(boolean z10);

    boolean a();

    boolean a(int i10);

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(d dVar);

    void b(boolean z10);

    void c();

    void c(int i10);

    void d();

    ak e();

    void g();

    void j();

    boolean o();

    Looper r();

    a s();

    int t();

    int u();

    void w();

    boolean x();

    int y();

    boolean z();

    /* loaded from: classes.dex */
    public static final class e implements g {

        /* renamed from: j */
        public static final g.a<e> f13220j = new b0(2);

        /* renamed from: a */
        public final Object f13221a;

        /* renamed from: b */
        public final int f13222b;

        /* renamed from: c */
        public final ab f13223c;

        /* renamed from: d */
        public final Object f13224d;

        /* renamed from: e */
        public final int f13225e;
        public final long f;

        /* renamed from: g */
        public final long f13226g;

        /* renamed from: h */
        public final int f13227h;

        /* renamed from: i */
        public final int f13228i;

        public e(Object obj, int i10, ab abVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f13221a = obj;
            this.f13222b = i10;
            this.f13223c = abVar;
            this.f13224d = obj2;
            this.f13225e = i11;
            this.f = j10;
            this.f13226g = j11;
            this.f13227h = i12;
            this.f13228i = i13;
        }

        public static e a(Bundle bundle) {
            return new e(null, bundle.getInt(a(0), -1), (ab) com.applovin.exoplayer2.l.c.a(ab.f13025g, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), com.anythink.expressad.exoplayer.b.f7291b), bundle.getLong(a(4), com.anythink.expressad.exoplayer.b.f7291b), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        public static /* synthetic */ e b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f13222b == eVar.f13222b && this.f13225e == eVar.f13225e && this.f == eVar.f && this.f13226g == eVar.f13226g && this.f13227h == eVar.f13227h && this.f13228i == eVar.f13228i && Objects.equal(this.f13221a, eVar.f13221a) && Objects.equal(this.f13224d, eVar.f13224d) && Objects.equal(this.f13223c, eVar.f13223c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f13221a, Integer.valueOf(this.f13222b), this.f13223c, this.f13224d, Integer.valueOf(this.f13225e), Integer.valueOf(this.f13222b), Long.valueOf(this.f), Long.valueOf(this.f13226g), Integer.valueOf(this.f13227h), Integer.valueOf(this.f13228i));
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }
}
