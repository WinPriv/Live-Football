package a3;

/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
public final class s<Z> implements x<Z> {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f202s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f203t;

    /* renamed from: u, reason: collision with root package name */
    public final x<Z> f204u;

    /* renamed from: v, reason: collision with root package name */
    public final a f205v;

    /* renamed from: w, reason: collision with root package name */
    public final y2.e f206w;

    /* renamed from: x, reason: collision with root package name */
    public int f207x;
    public boolean y;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(y2.e eVar, s<?> sVar);
    }

    public s(x<Z> xVar, boolean z10, boolean z11, y2.e eVar, a aVar) {
        androidx.activity.n.n0(xVar);
        this.f204u = xVar;
        this.f202s = z10;
        this.f203t = z11;
        this.f206w = eVar;
        androidx.activity.n.n0(aVar);
        this.f205v = aVar;
    }

    @Override // a3.x
    public final synchronized void a() {
        if (this.f207x <= 0) {
            if (!this.y) {
                this.y = true;
                if (this.f203t) {
                    this.f204u.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized void b() {
        if (!this.y) {
            this.f207x++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // a3.x
    public final Class<Z> c() {
        return this.f204u.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f207x;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f207x = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f205v.a(this.f206w, this);
        }
    }

    @Override // a3.x
    public final Z get() {
        return this.f204u.get();
    }

    @Override // a3.x
    public final int getSize() {
        return this.f204u.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f202s + ", listener=" + this.f205v + ", key=" + this.f206w + ", acquired=" + this.f207x + ", isRecycled=" + this.y + ", resource=" + this.f204u + '}';
    }
}
