package m0;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class e<T> extends s.d {

    /* renamed from: d, reason: collision with root package name */
    public final Object f32637d;

    public e(int i10) {
        super(i10, 1);
        this.f32637d = new Object();
    }

    @Override // s.d, m0.d
    public final boolean a(T t10) {
        boolean a10;
        synchronized (this.f32637d) {
            a10 = super.a(t10);
        }
        return a10;
    }

    @Override // s.d, m0.d
    public final T b() {
        T t10;
        synchronized (this.f32637d) {
            t10 = (T) super.b();
        }
        return t10;
    }
}
