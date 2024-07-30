package p3;

import a3.n;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.expressad.exoplayer.h.o;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p3.a;
import t3.l;
import y2.k;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean E;
    public Drawable G;
    public int H;
    public boolean L;
    public Resources.Theme M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean R;

    /* renamed from: s, reason: collision with root package name */
    public int f34238s;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f34242w;

    /* renamed from: x, reason: collision with root package name */
    public int f34243x;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public int f34244z;

    /* renamed from: t, reason: collision with root package name */
    public float f34239t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public n f34240u = n.f156c;

    /* renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.j f34241v = com.bumptech.glide.j.NORMAL;
    public boolean A = true;
    public int B = -1;
    public int C = -1;
    public y2.e D = s3.c.f35119b;
    public boolean F = true;
    public y2.g I = new y2.g();
    public t3.b J = new t3.b();
    public Class<?> K = Object.class;
    public boolean Q = true;

    public static boolean e(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public T a(a<?> aVar) {
        if (this.N) {
            return (T) clone().a(aVar);
        }
        if (e(aVar.f34238s, 2)) {
            this.f34239t = aVar.f34239t;
        }
        if (e(aVar.f34238s, 262144)) {
            this.O = aVar.O;
        }
        if (e(aVar.f34238s, o.f8460d)) {
            this.R = aVar.R;
        }
        if (e(aVar.f34238s, 4)) {
            this.f34240u = aVar.f34240u;
        }
        if (e(aVar.f34238s, 8)) {
            this.f34241v = aVar.f34241v;
        }
        if (e(aVar.f34238s, 16)) {
            this.f34242w = aVar.f34242w;
            this.f34243x = 0;
            this.f34238s &= -33;
        }
        if (e(aVar.f34238s, 32)) {
            this.f34243x = aVar.f34243x;
            this.f34242w = null;
            this.f34238s &= -17;
        }
        if (e(aVar.f34238s, 64)) {
            this.y = aVar.y;
            this.f34244z = 0;
            this.f34238s &= -129;
        }
        if (e(aVar.f34238s, 128)) {
            this.f34244z = aVar.f34244z;
            this.y = null;
            this.f34238s &= -65;
        }
        if (e(aVar.f34238s, 256)) {
            this.A = aVar.A;
        }
        if (e(aVar.f34238s, 512)) {
            this.C = aVar.C;
            this.B = aVar.B;
        }
        if (e(aVar.f34238s, 1024)) {
            this.D = aVar.D;
        }
        if (e(aVar.f34238s, 4096)) {
            this.K = aVar.K;
        }
        if (e(aVar.f34238s, 8192)) {
            this.G = aVar.G;
            this.H = 0;
            this.f34238s &= -16385;
        }
        if (e(aVar.f34238s, 16384)) {
            this.H = aVar.H;
            this.G = null;
            this.f34238s &= -8193;
        }
        if (e(aVar.f34238s, 32768)) {
            this.M = aVar.M;
        }
        if (e(aVar.f34238s, com.anythink.expressad.exoplayer.b.aX)) {
            this.F = aVar.F;
        }
        if (e(aVar.f34238s, 131072)) {
            this.E = aVar.E;
        }
        if (e(aVar.f34238s, 2048)) {
            this.J.putAll(aVar.J);
            this.Q = aVar.Q;
        }
        if (e(aVar.f34238s, 524288)) {
            this.P = aVar.P;
        }
        if (!this.F) {
            this.J.clear();
            int i10 = this.f34238s & (-2049);
            this.E = false;
            this.f34238s = i10 & (-131073);
            this.Q = true;
        }
        this.f34238s |= aVar.f34238s;
        this.I.f36567b.i(aVar.I.f36567b);
        j();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            y2.g gVar = new y2.g();
            t10.I = gVar;
            gVar.f36567b.i(this.I.f36567b);
            t3.b bVar = new t3.b();
            t10.J = bVar;
            bVar.putAll(this.J);
            t10.L = false;
            t10.N = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T c(Class<?> cls) {
        if (this.N) {
            return (T) clone().c(cls);
        }
        this.K = cls;
        this.f34238s |= 4096;
        j();
        return this;
    }

    public final T d(n nVar) {
        if (this.N) {
            return (T) clone().d(nVar);
        }
        androidx.activity.n.n0(nVar);
        this.f34240u = nVar;
        this.f34238s |= 4;
        j();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f34239t, this.f34239t) == 0 && this.f34243x == aVar.f34243x && l.b(this.f34242w, aVar.f34242w) && this.f34244z == aVar.f34244z && l.b(this.y, aVar.y) && this.H == aVar.H && l.b(this.G, aVar.G) && this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && this.E == aVar.E && this.F == aVar.F && this.O == aVar.O && this.P == aVar.P && this.f34240u.equals(aVar.f34240u) && this.f34241v == aVar.f34241v && this.I.equals(aVar.I) && this.J.equals(aVar.J) && this.K.equals(aVar.K) && l.b(this.D, aVar.D) && l.b(this.M, aVar.M)) {
                return true;
            }
        }
        return false;
    }

    public final a f(h3.l lVar, h3.f fVar) {
        if (this.N) {
            return clone().f(lVar, fVar);
        }
        y2.f fVar2 = h3.l.f;
        androidx.activity.n.n0(lVar);
        k(fVar2, lVar);
        return o(fVar, false);
    }

    public final T g(int i10, int i11) {
        if (this.N) {
            return (T) clone().g(i10, i11);
        }
        this.C = i10;
        this.B = i11;
        this.f34238s |= 512;
        j();
        return this;
    }

    public final T h(int i10) {
        if (this.N) {
            return (T) clone().h(i10);
        }
        this.f34244z = i10;
        int i11 = this.f34238s | 128;
        this.y = null;
        this.f34238s = i11 & (-65);
        j();
        return this;
    }

    public int hashCode() {
        float f = this.f34239t;
        char[] cArr = l.f35429a;
        return l.f(l.f(l.f(l.f(l.f(l.f(l.f(l.g(l.g(l.g(l.g((((l.g(l.f((l.f((l.f(((Float.floatToIntBits(f) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f34243x, this.f34242w) * 31) + this.f34244z, this.y) * 31) + this.H, this.G), this.A) * 31) + this.B) * 31) + this.C, this.E), this.F), this.O), this.P), this.f34240u), this.f34241v), this.I), this.J), this.K), this.D), this.M);
    }

    public final a i() {
        com.bumptech.glide.j jVar = com.bumptech.glide.j.LOW;
        if (this.N) {
            return clone().i();
        }
        this.f34241v = jVar;
        this.f34238s |= 8;
        j();
        return this;
    }

    public final void j() {
        if (!this.L) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T k(y2.f<Y> fVar, Y y) {
        if (this.N) {
            return (T) clone().k(fVar, y);
        }
        androidx.activity.n.n0(fVar);
        androidx.activity.n.n0(y);
        this.I.f36567b.put(fVar, y);
        j();
        return this;
    }

    public final T l(y2.e eVar) {
        if (this.N) {
            return (T) clone().l(eVar);
        }
        this.D = eVar;
        this.f34238s |= 1024;
        j();
        return this;
    }

    public final a m() {
        if (this.N) {
            return clone().m();
        }
        this.A = false;
        this.f34238s |= 256;
        j();
        return this;
    }

    public final <Y> T n(Class<Y> cls, k<Y> kVar, boolean z10) {
        if (this.N) {
            return (T) clone().n(cls, kVar, z10);
        }
        androidx.activity.n.n0(kVar);
        this.J.put(cls, kVar);
        int i10 = this.f34238s | 2048;
        this.F = true;
        int i11 = i10 | com.anythink.expressad.exoplayer.b.aX;
        this.f34238s = i11;
        this.Q = false;
        if (z10) {
            this.f34238s = i11 | 131072;
            this.E = true;
        }
        j();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T o(k<Bitmap> kVar, boolean z10) {
        if (this.N) {
            return (T) clone().o(kVar, z10);
        }
        h3.o oVar = new h3.o(kVar, z10);
        n(Bitmap.class, kVar, z10);
        n(Drawable.class, oVar, z10);
        n(BitmapDrawable.class, oVar, z10);
        n(l3.c.class, new l3.f(kVar), z10);
        j();
        return this;
    }

    public final a p() {
        if (this.N) {
            return clone().p();
        }
        this.R = true;
        this.f34238s |= o.f8460d;
        j();
        return this;
    }
}
