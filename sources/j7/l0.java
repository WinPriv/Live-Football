package j7;

import java.util.Map;

/* compiled from: ImmutableMap.java */
/* loaded from: classes2.dex */
public final class l0 extends t2<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t2 f30031s;

    public l0(t2 t2Var) {
        this.f30031s = t2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30031s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f30031s.next()).getKey();
    }
}
