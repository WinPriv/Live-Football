package com.anythink.expressad.foundation.g.a;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a<K, V> implements e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f9801a = "cache";

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, Reference<V>> f9802b = Collections.synchronizedMap(new HashMap());

    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(K k10, V v3) {
        this.f9802b.put(k10, c(v3));
        return true;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final V b(K k10) {
        Reference<V> reference = this.f9802b.get(k10);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    public abstract Reference<V> c(V v3);

    @Override // com.anythink.expressad.foundation.g.a.e
    public void a(K k10) {
        this.f9802b.remove(k10);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<K> a() {
        HashSet hashSet;
        synchronized (this.f9802b) {
            hashSet = new HashSet(this.f9802b.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public void b() {
        this.f9802b.clear();
    }
}
