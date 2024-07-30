package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class m<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<T> f19516a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<T> f19517b = new HashSet<>();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(T t10) {
        if (contains(t10)) {
            return false;
        }
        if (!isEmpty() && t10.compareTo(a()) <= 0) {
            this.f19516a.add(c(t10), t10);
        } else {
            this.f19516a.add(t10);
        }
        return this.f19517b.add(t10);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (add((m<T>) it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public T b(int i10) {
        T remove = this.f19516a.remove(i10);
        this.f19517b.remove(remove);
        return remove;
    }

    public int c(T t10) {
        int binarySearch = Collections.binarySearch(this.f19516a, t10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        T a10 = a(binarySearch);
        while (binarySearch >= 0 && a10 == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f19516a.clear();
        this.f19517b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f19517b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f19517b.containsAll(collection);
    }

    public int d(T t10) {
        int binarySearch = Collections.binarySearch(this.f19516a, t10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        T a10 = a(binarySearch);
        while (binarySearch < size() && a10 == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f19516a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f19516a.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int b10 = b((m<T>) obj);
        if (b10 == -1) {
            return false;
        }
        this.f19516a.remove(b10);
        return this.f19517b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                if (z10 || remove(obj)) {
                    z10 = true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            T t10 = this.f19516a.get(size);
            if (!collection.contains(t10)) {
                this.f19516a.remove(size);
                this.f19517b.remove(t10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f19516a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f19516a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        return (T1[]) this.f19516a.toArray(t1Arr);
    }

    public int b(T t10) {
        if (t10 == null || !contains(t10)) {
            return -1;
        }
        return c(t10);
    }

    public T a(int i10) {
        return this.f19516a.get(i10);
    }

    public void a(int i10, T t10) {
        this.f19517b.remove(this.f19516a.get(i10));
        this.f19516a.set(i10, t10);
        this.f19517b.add(t10);
    }

    public T a() {
        return this.f19516a.get(size() - 1);
    }
}
