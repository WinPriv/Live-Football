package com.applovin.exoplayer2.a;

import android.util.SparseArray;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import java.io.IOException;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f12915a;

        /* renamed from: b, reason: collision with root package name */
        public final ba f12916b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12917c;

        /* renamed from: d, reason: collision with root package name */
        public final p.a f12918d;

        /* renamed from: e, reason: collision with root package name */
        public final long f12919e;
        public final ba f;

        /* renamed from: g, reason: collision with root package name */
        public final int f12920g;

        /* renamed from: h, reason: collision with root package name */
        public final p.a f12921h;

        /* renamed from: i, reason: collision with root package name */
        public final long f12922i;

        /* renamed from: j, reason: collision with root package name */
        public final long f12923j;

        public a(long j10, ba baVar, int i10, p.a aVar, long j11, ba baVar2, int i11, p.a aVar2, long j12, long j13) {
            this.f12915a = j10;
            this.f12916b = baVar;
            this.f12917c = i10;
            this.f12918d = aVar;
            this.f12919e = j11;
            this.f = baVar2;
            this.f12920g = i11;
            this.f12921h = aVar2;
            this.f12922i = j12;
            this.f12923j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12915a == aVar.f12915a && this.f12917c == aVar.f12917c && this.f12919e == aVar.f12919e && this.f12920g == aVar.f12920g && this.f12922i == aVar.f12922i && this.f12923j == aVar.f12923j && Objects.equal(this.f12916b, aVar.f12916b) && Objects.equal(this.f12918d, aVar.f12918d) && Objects.equal(this.f, aVar.f) && Objects.equal(this.f12921h, aVar.f12921h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f12915a), this.f12916b, Integer.valueOf(this.f12917c), this.f12918d, Long.valueOf(this.f12919e), this.f, Integer.valueOf(this.f12920g), this.f12921h, Long.valueOf(this.f12922i), Long.valueOf(this.f12923j));
        }
    }

    /* renamed from: com.applovin.exoplayer2.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0150b {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.m f12924a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f12925b;

        public C0150b(com.applovin.exoplayer2.l.m mVar, SparseArray<a> sparseArray) {
            this.f12924a = mVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(mVar.a());
            for (int i10 = 0; i10 < mVar.a(); i10++) {
                int b10 = mVar.b(i10);
                sparseArray2.append(b10, (a) com.applovin.exoplayer2.l.a.b(sparseArray.get(b10)));
            }
            this.f12925b = sparseArray2;
        }
    }

    @Deprecated
    default void a(a aVar) {
    }

    @Deprecated
    default void b(a aVar) {
    }

    @Deprecated
    default void c(a aVar) {
    }

    default void d(a aVar) {
    }

    default void e(a aVar) {
    }

    default void f(a aVar) {
    }

    default void a(a aVar, float f) {
    }

    default void b(a aVar, int i10) {
    }

    default void c(a aVar, int i10) {
    }

    @Deprecated
    default void d(a aVar, int i10) {
    }

    default void e(a aVar, int i10) {
    }

    default void f(a aVar, int i10) {
    }

    default void a(a aVar, int i10) {
    }

    default void b(a aVar, int i10, long j10, long j11) {
    }

    default void c(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void d(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void e(a aVar, boolean z10) {
    }

    default void a(a aVar, int i10, int i11) {
    }

    @Deprecated
    default void b(a aVar, int i10, com.applovin.exoplayer2.c.e eVar) {
    }

    default void c(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void d(a aVar, Exception exc) {
    }

    @Deprecated
    default void a(a aVar, int i10, int i11, int i12, float f) {
    }

    default void b(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void c(a aVar, Exception exc) {
    }

    @Deprecated
    default void d(a aVar, boolean z10) {
    }

    default void a(a aVar, int i10, long j10) {
    }

    default void b(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void c(a aVar, boolean z10) {
    }

    default void a(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    default void b(a aVar, com.applovin.exoplayer2.v vVar) {
    }

    @Deprecated
    default void a(a aVar, int i10, com.applovin.exoplayer2.c.e eVar) {
    }

    default void b(a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    @Deprecated
    default void a(a aVar, int i10, com.applovin.exoplayer2.v vVar) {
    }

    default void b(a aVar, Exception exc) {
    }

    @Deprecated
    default void a(a aVar, int i10, String str, long j10) {
    }

    default void b(a aVar, String str) {
    }

    default void a(a aVar, long j10) {
    }

    @Deprecated
    default void b(a aVar, String str, long j10) {
    }

    default void a(a aVar, long j10, int i10) {
    }

    default void b(a aVar, String str, long j10, long j11) {
    }

    default void a(a aVar, ab abVar, int i10) {
    }

    default void b(a aVar, boolean z10) {
    }

    default void a(a aVar, ac acVar) {
    }

    default void b(a aVar, boolean z10, int i10) {
    }

    default void a(a aVar, ak akVar) {
    }

    default void a(a aVar, am amVar) {
    }

    default void a(a aVar, an.a aVar2) {
    }

    default void a(a aVar, an.e eVar, an.e eVar2, int i10) {
    }

    default void a(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.g.a aVar2) {
    }

    default void a(a aVar, ad adVar, com.applovin.exoplayer2.j.h hVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z10) {
    }

    default void a(a aVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.m.o oVar) {
    }

    @Deprecated
    default void a(a aVar, com.applovin.exoplayer2.v vVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void a(a aVar, Exception exc) {
    }

    default void a(a aVar, Object obj, long j10) {
    }

    default void g(a aVar) {
    }

    default void h(a aVar) {
    }

    default void a(a aVar, String str) {
    }

    @Deprecated
    default void a(a aVar, String str, long j10) {
    }

    default void a(a aVar, String str, long j10, long j11) {
    }

    default void a(a aVar, boolean z10) {
    }

    @Deprecated
    default void a(a aVar, boolean z10, int i10) {
    }

    default void a(an anVar, C0150b c0150b) {
    }
}
