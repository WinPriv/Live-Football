package j7;

import j7.g1;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: LinkedListMultimap.java */
/* loaded from: classes2.dex */
public final class f1 extends AbstractSequentialList<Map.Entry<Object, Object>> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1 f29949s;

    public f1(g1 g1Var) {
        this.f29949s = g1Var;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry<Object, Object>> listIterator(int i10) {
        return new g1.e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29949s.f29959z;
    }
}
