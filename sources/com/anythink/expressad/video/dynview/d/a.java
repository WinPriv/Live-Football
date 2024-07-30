package com.anythink.expressad.video.dynview.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a<K, V> extends HashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private ReferenceQueue<V> f11445a = new ReferenceQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<K, a<K, V>.C0136a<K, V>> f11446b = new HashMap<>();

    /* renamed from: com.anythink.expressad.video.dynview.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0136a<K, V> extends SoftReference<V> {

        /* renamed from: a, reason: collision with root package name */
        K f11447a;

        public C0136a(K k10, V v3, ReferenceQueue referenceQueue) {
            super(v3, referenceQueue);
            this.f11447a = k10;
        }
    }

    private void a() {
        while (true) {
            C0136a c0136a = (C0136a) this.f11445a.poll();
            if (c0136a != null) {
                this.f11446b.remove(c0136a.f11447a);
            } else {
                return;
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.f11446b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a();
        a<K, V>.C0136a<K, V> c0136a = this.f11446b.get(obj);
        if (c0136a == null) {
            return null;
        }
        return c0136a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v3) {
        a();
        a<K, V>.C0136a<K, V> put = this.f11446b.put(k10, new C0136a<>(k10, v3, this.f11445a));
        if (put == null) {
            return null;
        }
        return put.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        a<K, V>.C0136a<K, V> remove = this.f11446b.remove(obj);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.f11446b.size();
    }
}
