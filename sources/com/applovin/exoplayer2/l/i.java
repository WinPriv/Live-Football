package com.applovin.exoplayer2.l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16300a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f16301b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set<E> f16302c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private List<E> f16303d = Collections.emptyList();

    public void a(E e10) {
        synchronized (this.f16300a) {
            ArrayList arrayList = new ArrayList(this.f16303d);
            arrayList.add(e10);
            this.f16303d = Collections.unmodifiableList(arrayList);
            Integer num = this.f16301b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f16302c);
                hashSet.add(e10);
                this.f16302c = Collections.unmodifiableSet(hashSet);
            }
            this.f16301b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void b(E e10) {
        synchronized (this.f16300a) {
            Integer num = this.f16301b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f16303d);
            arrayList.remove(e10);
            this.f16303d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f16301b.remove(e10);
                HashSet hashSet = new HashSet(this.f16302c);
                hashSet.remove(e10);
                this.f16302c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f16301b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public int c(E e10) {
        int i10;
        synchronized (this.f16300a) {
            if (this.f16301b.containsKey(e10)) {
                i10 = this.f16301b.get(e10).intValue();
            } else {
                i10 = 0;
            }
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f16300a) {
            it = this.f16303d.iterator();
        }
        return it;
    }

    public Set<E> a() {
        Set<E> set;
        synchronized (this.f16300a) {
            set = this.f16302c;
        }
        return set;
    }
}
