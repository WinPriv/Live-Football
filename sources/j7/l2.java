package j7;

import j7.k2;
import java.util.Iterator;
import java.util.Map;

/* compiled from: StandardTable.java */
/* loaded from: classes2.dex */
public final class l2 implements Iterator<Map.Entry<Object, Object>> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Iterator f30033s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k2.b f30034t;

    public l2(k2.b bVar, Iterator it) {
        this.f30034t = bVar;
        this.f30033s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30033s.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        Map.Entry entry = (Map.Entry) this.f30033s.next();
        this.f30034t.getClass();
        return new m2(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30033s.remove();
        this.f30034t.b();
    }
}
