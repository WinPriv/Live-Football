package com.anythink.expressad.exoplayer.h;

import android.util.Pair;
import com.anythink.expressad.exoplayer.ae;

/* loaded from: classes.dex */
abstract class a extends com.anythink.expressad.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private final int f8145b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f8146c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8147d;

    public a(boolean z10, aa aaVar) {
        this.f8147d = z10;
        this.f8146c = aaVar;
        this.f8145b = aaVar.a();
    }

    public abstract int a(int i10);

    @Override // com.anythink.expressad.exoplayer.ae
    public final int a(int i10, int i11, boolean z10) {
        if (this.f8147d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int b10 = b(i10);
        int e10 = e(b10);
        int a10 = c(b10).a(i10 - e10, i11 != 2 ? i11 : 0, z10);
        if (a10 != -1) {
            return e10 + a10;
        }
        int a11 = a(b10, z10);
        while (a11 != -1 && c(a11).a()) {
            a11 = a(a11, z10);
        }
        if (a11 != -1) {
            return c(a11).b(z10) + e(a11);
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    public abstract int b(int i10);

    @Override // com.anythink.expressad.exoplayer.ae
    public final int b(int i10, int i11, boolean z10) {
        if (this.f8147d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int b10 = b(i10);
        int e10 = e(b10);
        int b11 = c(b10).b(i10 - e10, i11 != 2 ? i11 : 0, z10);
        if (b11 != -1) {
            return e10 + b11;
        }
        int b12 = b(b10, z10);
        while (b12 != -1 && c(b12).a()) {
            b12 = b(b12, z10);
        }
        if (b12 != -1) {
            return c(b12).a(z10) + e(b12);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    public abstract int b(Object obj);

    public abstract com.anythink.expressad.exoplayer.ae c(int i10);

    public abstract int d(int i10);

    public abstract int e(int i10);

    public abstract Object f(int i10);

    @Override // com.anythink.expressad.exoplayer.ae
    public final int a(boolean z10) {
        int i10 = this.f8145b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f8147d) {
            z10 = false;
        }
        int b10 = z10 ? this.f8146c.b() : i10 - 1;
        while (c(b10).a()) {
            b10 = b(b10, z10);
            if (b10 == -1) {
                return -1;
            }
        }
        return c(b10).a(z10) + e(b10);
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final int b(boolean z10) {
        if (this.f8145b == 0) {
            return -1;
        }
        if (this.f8147d) {
            z10 = false;
        }
        int c10 = z10 ? this.f8146c.c() : 0;
        while (c(c10).a()) {
            c10 = a(c10, z10);
            if (c10 == -1) {
                return -1;
            }
        }
        return c(c10).b(z10) + e(c10);
    }

    private int b(int i10, boolean z10) {
        if (z10) {
            return this.f8146c.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final ae.b a(int i10, ae.b bVar, boolean z10, long j10) {
        int b10 = b(i10);
        int e10 = e(b10);
        int d10 = d(b10);
        c(b10).a(i10 - e10, bVar, z10, j10);
        bVar.f += d10;
        bVar.f7282g += d10;
        return bVar;
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final ae.a a(int i10, ae.a aVar, boolean z10) {
        int a10 = a(i10);
        int e10 = e(a10);
        c(a10).a(i10 - d(a10), aVar, z10);
        aVar.f7274c += e10;
        if (z10) {
            aVar.f7273b = Pair.create(f(a10), aVar.f7273b);
        }
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.ae
    public final int a(Object obj) {
        int a10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b10 = b(obj2);
        if (b10 == -1 || (a10 = c(b10).a(obj3)) == -1) {
            return -1;
        }
        return d(b10) + a10;
    }

    private int a(int i10, boolean z10) {
        if (z10) {
            return this.f8146c.a(i10);
        }
        if (i10 < this.f8145b - 1) {
            return i10 + 1;
        }
        return -1;
    }
}
