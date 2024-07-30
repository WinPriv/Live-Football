package z3;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
public final class t implements w3.e {

    /* renamed from: a, reason: collision with root package name */
    public final Set<w3.b> f36959a;

    /* renamed from: b, reason: collision with root package name */
    public final s f36960b;

    /* renamed from: c, reason: collision with root package name */
    public final v f36961c;

    public t(Set set, j jVar, w wVar) {
        this.f36959a = set;
        this.f36960b = jVar;
        this.f36961c = wVar;
    }

    @Override // w3.e
    public final u a(w3.b bVar, com.applovin.exoplayer2.d.w wVar) {
        Set<w3.b> set = this.f36959a;
        if (set.contains(bVar)) {
            return new u(this.f36960b, bVar, wVar, this.f36961c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}
