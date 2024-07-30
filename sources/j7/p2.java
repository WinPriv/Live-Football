package j7;

import java.io.Serializable;

/* compiled from: Tables.java */
/* loaded from: classes2.dex */
public final class p2<R, C, V> extends o2<R, C, V> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final R f30076s;

    /* renamed from: t, reason: collision with root package name */
    public final C f30077t;

    /* renamed from: u, reason: collision with root package name */
    public final V f30078u;

    public p2(R r10, C c10, V v3) {
        this.f30076s = r10;
        this.f30077t = c10;
        this.f30078u = v3;
    }

    @Override // j7.n2.a
    public final V getValue() {
        return this.f30078u;
    }

    @Override // j7.n2.a
    public final C k() {
        return this.f30077t;
    }

    @Override // j7.n2.a
    public final R p() {
        return this.f30076s;
    }
}
