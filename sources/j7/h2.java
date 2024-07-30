package j7;

import j7.n2;
import java.util.Map;

/* compiled from: SingletonImmutableTable.java */
/* loaded from: classes2.dex */
public final class h2<R, C, V> extends w0<R, C, V> {

    /* renamed from: u, reason: collision with root package name */
    public final R f29992u;

    /* renamed from: v, reason: collision with root package name */
    public final C f29993v;

    /* renamed from: w, reason: collision with root package name */
    public final V f29994w;

    public h2(n2.a<R, C, V> aVar) {
        R p10 = aVar.p();
        C k10 = aVar.k();
        V value = aVar.getValue();
        p10.getClass();
        this.f29992u = p10;
        k10.getClass();
        this.f29993v = k10;
        value.getClass();
        this.f29994w = value;
    }

    @Override // j7.w0
    /* renamed from: A */
    public final g0<V> C() {
        int i10 = t0.f30101u;
        return new g2(this.f29994w);
    }

    @Override // j7.w0, j7.n2
    /* renamed from: E */
    public final m0<R, Map<C, V>> p() {
        return m0.w(this.f29992u, m0.w(this.f29993v, this.f29994w));
    }

    @Override // j7.n2
    public final int size() {
        return 1;
    }

    @Override // j7.w0, j7.i
    /* renamed from: x */
    public final t0<n2.a<R, C, V>> u() {
        p2 w10 = w0.w(this.f29992u, this.f29993v, this.f29994w);
        int i10 = t0.f30101u;
        return new g2(w10);
    }
}
