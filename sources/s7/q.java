package s7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes2.dex */
public final class q<T> implements c8.a<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    public volatile Set<T> f35252b = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile Set<c8.a<T>> f35251a = Collections.newSetFromMap(new ConcurrentHashMap());

    public q(Collection<c8.a<T>> collection) {
        this.f35251a.addAll(collection);
    }

    @Override // c8.a
    public final Object get() {
        if (this.f35252b == null) {
            synchronized (this) {
                if (this.f35252b == null) {
                    this.f35252b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<c8.a<T>> it = this.f35251a.iterator();
                        while (it.hasNext()) {
                            this.f35252b.add(it.next().get());
                        }
                        this.f35251a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f35252b);
    }
}
