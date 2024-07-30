package xc;

import xc.c;
import yc.l;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class b<B extends c, E extends B> implements d<E> {

    /* renamed from: s, reason: collision with root package name */
    public final l<c, E> f36523s;

    /* renamed from: t, reason: collision with root package name */
    public final d<?> f36524t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [xc.d<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [yc.l<xc.c, E extends B>, yc.l<? super xc.c, ? extends E extends B>] */
    public b(d<B> dVar, l<? super c, ? extends E> lVar) {
        zc.d.d(dVar, "baseKey");
        this.f36523s = lVar;
        this.f36524t = dVar instanceof b ? (d<B>) ((b) dVar).f36524t : dVar;
    }
}
