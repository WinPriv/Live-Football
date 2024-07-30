package com.applovin.exoplayer2;

import android.util.Pair;
import com.applovin.exoplayer2.ba;

/* loaded from: classes.dex */
public abstract class a extends ba {

    /* renamed from: c, reason: collision with root package name */
    private final int f12895c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.h.z f12896d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12897e;

    public a(boolean z10, com.applovin.exoplayer2.h.z zVar) {
        this.f12897e = z10;
        this.f12896d = zVar;
        this.f12895c = zVar.a();
    }

    public static Object a(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public abstract int b(int i10);

    public abstract int c(int i10);

    @Override // com.applovin.exoplayer2.ba
    public final int c(Object obj) {
        int c10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object a10 = a(obj);
        Object b10 = b(obj);
        int d10 = d(a10);
        if (d10 == -1 || (c10 = d(d10).c(b10)) == -1) {
            return -1;
        }
        return e(d10) + c10;
    }

    public abstract int d(Object obj);

    public abstract ba d(int i10);

    public abstract int e(int i10);

    public abstract int f(int i10);

    public abstract Object g(int i10);

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(int i10, int i11, boolean z10) {
        if (this.f12897e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int c10 = c(i10);
        int f = f(c10);
        int b10 = d(c10).b(i10 - f, i11 != 2 ? i11 : 0, z10);
        if (b10 != -1) {
            return f + b10;
        }
        int b11 = b(c10, z10);
        while (b11 != -1 && d(b11).d()) {
            b11 = b(b11, z10);
        }
        if (b11 != -1) {
            return d(b11).a(z10) + f(b11);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(int i10, int i11, boolean z10) {
        if (this.f12897e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int c10 = c(i10);
        int f = f(c10);
        int a10 = d(c10).a(i10 - f, i11 != 2 ? i11 : 0, z10);
        if (a10 != -1) {
            return f + a10;
        }
        int a11 = a(c10, z10);
        while (a11 != -1 && d(a11).d()) {
            a11 = a(a11, z10);
        }
        if (a11 != -1) {
            return d(a11).b(z10) + f(a11);
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int b(boolean z10) {
        if (this.f12895c == 0) {
            return -1;
        }
        if (this.f12897e) {
            z10 = false;
        }
        int c10 = z10 ? this.f12896d.c() : 0;
        while (d(c10).d()) {
            c10 = a(c10, z10);
            if (c10 == -1) {
                return -1;
            }
        }
        return d(c10).b(z10) + f(c10);
    }

    @Override // com.applovin.exoplayer2.ba
    public int a(boolean z10) {
        int i10 = this.f12895c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f12897e) {
            z10 = false;
        }
        int b10 = z10 ? this.f12896d.b() : i10 - 1;
        while (d(b10).d()) {
            b10 = b(b10, z10);
            if (b10 == -1) {
                return -1;
            }
        }
        return d(b10).a(z10) + f(b10);
    }

    private int b(int i10, boolean z10) {
        if (z10) {
            return this.f12896d.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.c a(int i10, ba.c cVar, long j10) {
        int c10 = c(i10);
        int f = f(c10);
        int e10 = e(c10);
        d(c10).a(i10 - f, cVar, j10);
        Object g6 = g(c10);
        if (!ba.c.f13585a.equals(cVar.f13589b)) {
            g6 = a(g6, cVar.f13589b);
        }
        cVar.f13589b = g6;
        cVar.f13601p += e10;
        cVar.f13602q += e10;
        return cVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.a a(Object obj, ba.a aVar) {
        Object a10 = a(obj);
        Object b10 = b(obj);
        int d10 = d(a10);
        int f = f(d10);
        d(d10).a(b10, aVar);
        aVar.f13578c += f;
        aVar.f13577b = obj;
        return aVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final ba.a a(int i10, ba.a aVar, boolean z10) {
        int b10 = b(i10);
        int f = f(b10);
        d(b10).a(i10 - e(b10), aVar, z10);
        aVar.f13578c += f;
        if (z10) {
            aVar.f13577b = a(g(b10), com.applovin.exoplayer2.l.a.b(aVar.f13577b));
        }
        return aVar;
    }

    @Override // com.applovin.exoplayer2.ba
    public final Object a(int i10) {
        int b10 = b(i10);
        return a(g(b10), d(b10).a(i10 - e(b10)));
    }

    private int a(int i10, boolean z10) {
        if (z10) {
            return this.f12896d.a(i10);
        }
        if (i10 < this.f12895c - 1) {
            return i10 + 1;
        }
        return -1;
    }
}
