package j7;

import j7.f2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: Sets.java */
/* loaded from: classes2.dex */
public final class e2 extends f2.d<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Set f29941s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Set f29942t;

    public e2(t0 t0Var, t0 t0Var2) {
        this.f29941s = t0Var;
        this.f29942t = t0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (this.f29941s.contains(obj) && this.f29942t.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (this.f29941s.containsAll(collection) && this.f29942t.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f29942t, this.f29941s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f29941s.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f29942t.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
