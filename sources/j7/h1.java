package j7;

import j7.g1;
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: LinkedListMultimap.java */
/* loaded from: classes2.dex */
public final class h1 extends AbstractSequentialList<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1 f29990s;

    /* compiled from: LinkedListMultimap.java */
    /* loaded from: classes2.dex */
    public class a extends r2<Map.Entry<Object, Object>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g1.e f29991t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1.e eVar, g1.e eVar2) {
            super(eVar);
            this.f29991t = eVar2;
        }

        @Override // j7.q2
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public final void set(Object obj) {
            boolean z10;
            g1.d<K, V> dVar = this.f29991t.f29977u;
            if (dVar != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar.f29970t = obj;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h1(g1 g1Var) {
        this.f29990s = g1Var;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Object> listIterator(int i10) {
        g1.e eVar = new g1.e(i10);
        return new a(eVar, eVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29990s.f29959z;
    }
}
