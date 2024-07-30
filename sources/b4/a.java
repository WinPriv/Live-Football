package b4;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements tc.a<T> {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f2893u = new Object();

    /* renamed from: s, reason: collision with root package name */
    public volatile tc.a<T> f2894s;

    /* renamed from: t, reason: collision with root package name */
    public volatile Object f2895t = f2893u;

    public a(b bVar) {
        this.f2894s = bVar;
    }

    public static tc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
    }

    @Override // tc.a
    public final T get() {
        boolean z10;
        T t10 = (T) this.f2895t;
        Object obj = f2893u;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f2895t;
                if (t10 == obj) {
                    t10 = this.f2894s.get();
                    Object obj2 = this.f2895t;
                    if (obj2 != obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && obj2 != t10) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t10 + ". This is likely due to a circular dependency.");
                    }
                    this.f2895t = t10;
                    this.f2894s = null;
                }
            }
        }
        return t10;
    }
}
