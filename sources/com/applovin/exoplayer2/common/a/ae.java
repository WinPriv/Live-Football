package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class ae {

    /* loaded from: classes.dex */
    public static class a<K, V> extends c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        transient Supplier<? extends List<V>> f13690a;

        public a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            this.f13690a = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.applovin.exoplayer2.common.a.c, com.applovin.exoplayer2.common.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> c() {
            return this.f13690a.get();
        }

        @Override // com.applovin.exoplayer2.common.a.d, com.applovin.exoplayer2.common.a.f
        public Set<K> f() {
            return g();
        }

        @Override // com.applovin.exoplayer2.common.a.d, com.applovin.exoplayer2.common.a.f
        public Map<K, Collection<V>> n() {
            return o();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract ac<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return a().b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return a().c(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().d();
        }
    }

    public static <K, V> z<K, V> a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new a(map, supplier);
    }

    public static boolean a(ac<?, ?> acVar, @NullableDecl Object obj) {
        if (obj == acVar) {
            return true;
        }
        if (obj instanceof ac) {
            return acVar.b().equals(((ac) obj).b());
        }
        return false;
    }
}
