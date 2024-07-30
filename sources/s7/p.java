package s7;

/* compiled from: Lazy.java */
/* loaded from: classes2.dex */
public final class p<T> implements c8.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f35248c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f35249a = f35248c;

    /* renamed from: b, reason: collision with root package name */
    public volatile c8.a<T> f35250b;

    public p(c8.a<T> aVar) {
        this.f35250b = aVar;
    }

    @Override // c8.a
    public final T get() {
        T t10 = (T) this.f35249a;
        Object obj = f35248c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f35249a;
                if (t10 == obj) {
                    t10 = this.f35250b.get();
                    this.f35249a = t10;
                    this.f35250b = null;
                }
            }
        }
        return t10;
    }
}
