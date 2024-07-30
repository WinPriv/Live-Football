package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.a.a;

/* loaded from: classes.dex */
public abstract class ba implements g {

    /* renamed from: a */
    public static final ba f13573a = new ba() { // from class: com.applovin.exoplayer2.ba.1
        @Override // com.applovin.exoplayer2.ba
        public c a(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public a a(int i10, a aVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            throw new IndexOutOfBoundsException();
        }
    };

    /* renamed from: b */
    public static final g.a<ba> f13574b = new com.applovin.exoplayer2.a.l(4);

    /* renamed from: com.applovin.exoplayer2.ba$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends ba {
        @Override // com.applovin.exoplayer2.ba
        public c a(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public a a(int i10, a aVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: g */
        public static final g.a<a> f13575g = new a0(3);

        /* renamed from: a */
        public Object f13576a;

        /* renamed from: b */
        public Object f13577b;

        /* renamed from: c */
        public int f13578c;

        /* renamed from: d */
        public long f13579d;

        /* renamed from: e */
        public long f13580e;
        public boolean f;

        /* renamed from: h */
        private com.applovin.exoplayer2.h.a.a f13581h = com.applovin.exoplayer2.h.a.a.f15249a;

        public static /* synthetic */ a b(Bundle bundle) {
            return a(bundle);
        }

        private static String g(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c() {
            return this.f13580e;
        }

        public int d() {
            return this.f13581h.f15253c;
        }

        public int e() {
            return this.f13581h.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !a.class.equals(obj.getClass())) {
                return false;
            }
            a aVar = (a) obj;
            if (com.applovin.exoplayer2.l.ai.a(this.f13576a, aVar.f13576a) && com.applovin.exoplayer2.l.ai.a(this.f13577b, aVar.f13577b) && this.f13578c == aVar.f13578c && this.f13579d == aVar.f13579d && this.f13580e == aVar.f13580e && this.f == aVar.f && com.applovin.exoplayer2.l.ai.a(this.f13581h, aVar.f13581h)) {
                return true;
            }
            return false;
        }

        public long f() {
            return this.f13581h.f15254d;
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.f13576a;
            int i10 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i11 = (217 + hashCode) * 31;
            Object obj2 = this.f13577b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            int i12 = (((i11 + i10) * 31) + this.f13578c) * 31;
            long j10 = this.f13579d;
            int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f13580e;
            return this.f13581h.hashCode() + ((((i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }

        public a a(Object obj, Object obj2, int i10, long j10, long j11) {
            return a(obj, obj2, i10, j10, j11, com.applovin.exoplayer2.h.a.a.f15249a, false);
        }

        public long b() {
            return h.a(this.f13580e);
        }

        public boolean c(int i10) {
            return !this.f13581h.a(i10).c();
        }

        public int d(int i10) {
            return this.f13581h.a(i10).f15259b;
        }

        public boolean e(int i10) {
            return this.f13581h.a(i10).f15263g;
        }

        public long f(int i10) {
            return this.f13581h.a(i10).f;
        }

        public a a(Object obj, Object obj2, int i10, long j10, long j11, com.applovin.exoplayer2.h.a.a aVar, boolean z10) {
            this.f13576a = obj;
            this.f13577b = obj2;
            this.f13578c = i10;
            this.f13579d = j10;
            this.f13580e = j11;
            this.f13581h = aVar;
            this.f = z10;
            return this;
        }

        public int b(int i10) {
            return this.f13581h.a(i10).a();
        }

        public int b(long j10) {
            return this.f13581h.b(j10, this.f13579d);
        }

        public long b(int i10, int i11) {
            a.C0173a a10 = this.f13581h.a(i10);
            return a10.f15259b != -1 ? a10.f15262e[i11] : com.anythink.expressad.exoplayer.b.f7291b;
        }

        public long a() {
            return this.f13579d;
        }

        public long a(int i10) {
            return this.f13581h.a(i10).f15258a;
        }

        public int a(int i10, int i11) {
            return this.f13581h.a(i10).a(i11);
        }

        public int a(long j10) {
            return this.f13581h.a(j10, this.f13579d);
        }

        public static a a(Bundle bundle) {
            com.applovin.exoplayer2.h.a.a aVar;
            int i10 = bundle.getInt(g(0), 0);
            long j10 = bundle.getLong(g(1), com.anythink.expressad.exoplayer.b.f7291b);
            long j11 = bundle.getLong(g(2), 0L);
            boolean z10 = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                aVar = com.applovin.exoplayer2.h.a.a.f15250g.fromBundle(bundle2);
            } else {
                aVar = com.applovin.exoplayer2.h.a.a.f15249a;
            }
            com.applovin.exoplayer2.h.a.a aVar2 = aVar;
            a aVar3 = new a();
            aVar3.a(null, null, i10, j10, j11, aVar2, z10);
            return aVar3;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ba {

        /* renamed from: c */
        private final com.applovin.exoplayer2.common.a.s<c> f13582c;

        /* renamed from: d */
        private final com.applovin.exoplayer2.common.a.s<a> f13583d;

        /* renamed from: e */
        private final int[] f13584e;
        private final int[] f;

        public b(com.applovin.exoplayer2.common.a.s<c> sVar, com.applovin.exoplayer2.common.a.s<a> sVar2, int[] iArr) {
            boolean z10;
            if (sVar.size() == iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.applovin.exoplayer2.l.a.a(z10);
            this.f13582c = sVar;
            this.f13583d = sVar2;
            this.f13584e = iArr;
            this.f = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f[iArr[i10]] = i10;
            }
        }

        @Override // com.applovin.exoplayer2.ba
        public c a(int i10, c cVar, long j10) {
            c cVar2 = this.f13582c.get(i10);
            cVar.a(cVar2.f13589b, cVar2.f13591d, cVar2.f13592e, cVar2.f, cVar2.f13593g, cVar2.f13594h, cVar2.f13595i, cVar2.f13596j, cVar2.f13598l, cVar2.f13600n, cVar2.o, cVar2.f13601p, cVar2.f13602q, cVar2.f13603r);
            cVar.f13599m = cVar2.f13599m;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return this.f13582c.size();
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return this.f13583d.size();
        }

        @Override // com.applovin.exoplayer2.ba
        public int b(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != b(z10)) {
                return z10 ? this.f13584e[this.f[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int a(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != a(z10)) {
                return z10 ? this.f13584e[this.f[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return b(z10);
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b(boolean z10) {
            if (d()) {
                return -1;
            }
            if (z10) {
                return this.f13584e[0];
            }
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int a(boolean z10) {
            if (d()) {
                return -1;
            }
            if (z10) {
                return this.f13584e[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public a a(int i10, a aVar, boolean z10) {
            a aVar2 = this.f13583d.get(i10);
            aVar.a(aVar2.f13576a, aVar2.f13577b, aVar2.f13578c, aVar2.f13579d, aVar2.f13580e, aVar2.f13581h, aVar2.f);
            return aVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g {

        /* renamed from: c */
        @Deprecated
        public Object f13590c;

        /* renamed from: e */
        public Object f13592e;
        public long f;

        /* renamed from: g */
        public long f13593g;

        /* renamed from: h */
        public long f13594h;

        /* renamed from: i */
        public boolean f13595i;

        /* renamed from: j */
        public boolean f13596j;

        /* renamed from: k */
        @Deprecated
        public boolean f13597k;

        /* renamed from: l */
        public ab.e f13598l;

        /* renamed from: m */
        public boolean f13599m;

        /* renamed from: n */
        public long f13600n;
        public long o;

        /* renamed from: p */
        public int f13601p;

        /* renamed from: q */
        public int f13602q;

        /* renamed from: r */
        public long f13603r;

        /* renamed from: a */
        public static final Object f13585a = new Object();

        /* renamed from: t */
        private static final Object f13587t = new Object();

        /* renamed from: u */
        private static final ab f13588u = new ab.b().a("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: s */
        public static final g.a<c> f13586s = new b0(3);

        /* renamed from: b */
        public Object f13589b = f13585a;

        /* renamed from: d */
        public ab f13591d = f13588u;

        public static /* synthetic */ c b(Bundle bundle) {
            return a(bundle);
        }

        public c a(Object obj, ab abVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, ab.e eVar, long j13, long j14, int i10, int i11, long j15) {
            ab.f fVar;
            this.f13589b = obj;
            this.f13591d = abVar != null ? abVar : f13588u;
            this.f13590c = (abVar == null || (fVar = abVar.f13027c) == null) ? null : fVar.f13082h;
            this.f13592e = obj2;
            this.f = j10;
            this.f13593g = j11;
            this.f13594h = j12;
            this.f13595i = z10;
            this.f13596j = z11;
            this.f13597k = eVar != null;
            this.f13598l = eVar;
            this.f13600n = j13;
            this.o = j14;
            this.f13601p = i10;
            this.f13602q = i11;
            this.f13603r = j15;
            this.f13599m = false;
            return this;
        }

        public long c() {
            return h.a(this.o);
        }

        public long d() {
            return com.applovin.exoplayer2.l.ai.c(this.f13594h);
        }

        public boolean e() {
            boolean z10;
            boolean z11;
            boolean z12 = this.f13597k;
            if (this.f13598l != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            com.applovin.exoplayer2.l.a.b(z11);
            if (this.f13598l != null) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (com.applovin.exoplayer2.l.ai.a(this.f13589b, cVar.f13589b) && com.applovin.exoplayer2.l.ai.a(this.f13591d, cVar.f13591d) && com.applovin.exoplayer2.l.ai.a(this.f13592e, cVar.f13592e) && com.applovin.exoplayer2.l.ai.a(this.f13598l, cVar.f13598l) && this.f == cVar.f && this.f13593g == cVar.f13593g && this.f13594h == cVar.f13594h && this.f13595i == cVar.f13595i && this.f13596j == cVar.f13596j && this.f13599m == cVar.f13599m && this.f13600n == cVar.f13600n && this.o == cVar.o && this.f13601p == cVar.f13601p && this.f13602q == cVar.f13602q && this.f13603r == cVar.f13603r) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.f13591d.hashCode() + ((this.f13589b.hashCode() + 217) * 31)) * 31;
            Object obj = this.f13592e;
            int i10 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i11 = (hashCode2 + hashCode) * 31;
            ab.e eVar = this.f13598l;
            if (eVar != null) {
                i10 = eVar.hashCode();
            }
            int i12 = (i11 + i10) * 31;
            long j10 = this.f;
            int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f13593g;
            int i14 = (i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f13594h;
            int i15 = (((((((i14 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f13595i ? 1 : 0)) * 31) + (this.f13596j ? 1 : 0)) * 31) + (this.f13599m ? 1 : 0)) * 31;
            long j13 = this.f13600n;
            int i16 = (i15 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.o;
            int i17 = (((((i16 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f13601p) * 31) + this.f13602q) * 31;
            long j15 = this.f13603r;
            return i17 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public long b() {
            return this.f13600n;
        }

        public long a() {
            return h.a(this.f13600n);
        }

        public static c a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            ab fromBundle = bundle2 != null ? ab.f13025g.fromBundle(bundle2) : null;
            long j10 = bundle.getLong(a(2), com.anythink.expressad.exoplayer.b.f7291b);
            long j11 = bundle.getLong(a(3), com.anythink.expressad.exoplayer.b.f7291b);
            long j12 = bundle.getLong(a(4), com.anythink.expressad.exoplayer.b.f7291b);
            boolean z10 = bundle.getBoolean(a(5), false);
            boolean z11 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            ab.e fromBundle2 = bundle3 != null ? ab.e.f13066g.fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(a(8), false);
            long j13 = bundle.getLong(a(9), 0L);
            long j14 = bundle.getLong(a(10), com.anythink.expressad.exoplayer.b.f7291b);
            int i10 = bundle.getInt(a(11), 0);
            int i11 = bundle.getInt(a(12), 0);
            long j15 = bundle.getLong(a(13), 0L);
            c cVar = new c();
            cVar.a(f13587t, fromBundle, null, j10, j11, j12, z10, z11, fromBundle2, j13, j14, i10, i11, j15);
            cVar.f13599m = z12;
            return cVar;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    public static /* synthetic */ ba b(Bundle bundle) {
        return a(bundle);
    }

    private static int[] c(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract a a(int i10, a aVar, boolean z10);

    public abstract c a(int i10, c cVar, long j10);

    public abstract Object a(int i10);

    public abstract int b();

    public abstract int c();

    public abstract int c(Object obj);

    public final boolean d() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (baVar.b() != b() || baVar.c() != c()) {
            return false;
        }
        c cVar = new c();
        a aVar = new a();
        c cVar2 = new c();
        a aVar2 = new a();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, cVar).equals(baVar.a(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < c(); i11++) {
            if (!a(i11, aVar, true).equals(baVar.a(i11, aVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        c cVar = new c();
        a aVar = new a();
        int b10 = b() + 217;
        for (int i10 = 0; i10 < b(); i10++) {
            b10 = (b10 * 31) + a(i10, cVar).hashCode();
        }
        int c10 = c() + (b10 * 31);
        for (int i11 = 0; i11 < c(); i11++) {
            c10 = (c10 * 31) + a(i11, aVar, true).hashCode();
        }
        return c10;
    }

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public int a(boolean z10) {
        if (d()) {
            return -1;
        }
        return b() - 1;
    }

    public final c a(int i10, c cVar) {
        return a(i10, cVar, 0L);
    }

    public int b(boolean z10) {
        return d() ? -1 : 0;
    }

    public final int a(int i10, a aVar, c cVar, int i11, boolean z10) {
        int i12 = a(i10, aVar).f13578c;
        if (a(i12, cVar).f13602q != i10) {
            return i10 + 1;
        }
        int a10 = a(i12, i11, z10);
        if (a10 == -1) {
            return -1;
        }
        return a(a10, cVar).f13601p;
    }

    public final boolean b(int i10, a aVar, c cVar, int i11, boolean z10) {
        return a(i10, aVar, cVar, i11, z10) == -1;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i10, long j10) {
        return (Pair) com.applovin.exoplayer2.l.a.b(a(cVar, aVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i10, long j10, long j11) {
        com.applovin.exoplayer2.l.a.a(i10, 0, b());
        a(i10, cVar, j11);
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = cVar.b();
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return null;
            }
        }
        int i11 = cVar.f13601p;
        a(i11, aVar);
        while (i11 < cVar.f13602q && aVar.f13580e != j10) {
            int i12 = i11 + 1;
            if (a(i12, aVar).f13580e > j10) {
                break;
            }
            i11 = i12;
        }
        a(i11, aVar, true);
        long j12 = j10 - aVar.f13580e;
        long j13 = aVar.f13579d;
        if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(com.applovin.exoplayer2.l.a.b(aVar.f13577b), Long.valueOf(Math.max(0L, j12)));
    }

    public a a(Object obj, a aVar) {
        return a(c(obj), aVar, true);
    }

    public final a a(int i10, a aVar) {
        return a(i10, aVar, false);
    }

    public static ba a(Bundle bundle) {
        com.applovin.exoplayer2.common.a.s a10 = a(c.f13586s, com.applovin.exoplayer2.l.b.a(bundle, b(0)));
        com.applovin.exoplayer2.common.a.s a11 = a(a.f13575g, com.applovin.exoplayer2.l.b.a(bundle, b(1)));
        int[] intArray = bundle.getIntArray(b(2));
        if (intArray == null) {
            intArray = c(a10.size());
        }
        return new b(a10, a11, intArray);
    }

    private static <T extends g> com.applovin.exoplayer2.common.a.s<T> a(g.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.applovin.exoplayer2.common.a.s.g();
        }
        s.a aVar2 = new s.a();
        com.applovin.exoplayer2.common.a.s<Bundle> a10 = f.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.fromBundle(a10.get(i10)));
        }
        return aVar2.a();
    }
}
