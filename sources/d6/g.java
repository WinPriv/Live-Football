package d6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset.java */
/* loaded from: classes2.dex */
public final class g<E> implements Iterable<E> {

    /* renamed from: s, reason: collision with root package name */
    public final Object f27298s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f27299t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public Set<E> f27300u = Collections.emptySet();

    /* renamed from: v, reason: collision with root package name */
    public List<E> f27301v = Collections.emptyList();

    public final int a(E e10) {
        int i10;
        synchronized (this.f27298s) {
            if (this.f27299t.containsKey(e10)) {
                i10 = ((Integer) this.f27299t.get(e10)).intValue();
            } else {
                i10 = 0;
            }
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f27298s) {
            it = this.f27301v.iterator();
        }
        return it;
    }
}
