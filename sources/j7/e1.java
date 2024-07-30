package j7;

import j7.g1;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: LinkedListMultimap.java */
/* loaded from: classes2.dex */
public final class e1 extends AbstractSequentialList<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f29939s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g1 f29940t;

    public e1(g1 g1Var, Object obj) {
        this.f29940t = g1Var;
        this.f29939s = obj;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Object> listIterator(int i10) {
        return new g1.f(this.f29939s, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        g1.c cVar = (g1.c) this.f29940t.y.get(this.f29939s);
        if (cVar == null) {
            return 0;
        }
        return cVar.f29968c;
    }
}
