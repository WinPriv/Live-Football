package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.common.a.v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public class t<K, V> extends v<K, V> implements z<K, V> {

    /* loaded from: classes.dex */
    public static final class a<K, V> extends v.a<K, V> {
        public a<K, V> a(K k10, Iterable<? extends V> iterable) {
            super.b((a<K, V>) k10, iterable);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.a.v.a
        public /* synthetic */ v.a b(Object obj, Iterable iterable) {
            return a((a<K, V>) obj, iterable);
        }

        public a<K, V> a(K k10, V... vArr) {
            super.b((a<K, V>) k10, vArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.a.v.a
        public /* synthetic */ v.a b(Object obj, Object[] objArr) {
            return a((a<K, V>) obj, objArr);
        }

        @Override // com.applovin.exoplayer2.common.a.v.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<K, V> b() {
            return (t) super.b();
        }
    }

    public t(u<K, s<V>> uVar, int i10) {
        super(uVar, i10);
    }

    public static <K, V> a<K, V> c() {
        return new a<>();
    }

    public static <K, V> t<K, V> a() {
        return o.f13806a;
    }

    @Override // com.applovin.exoplayer2.common.a.v
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<V> b(@NullableDecl K k10) {
        s<V> sVar = (s) ((v) this).f13826b.get(k10);
        return sVar == null ? s.g() : sVar;
    }

    public static <K, V> t<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        s a10;
        if (collection.isEmpty()) {
            return a();
        }
        u.a aVar = new u.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                a10 = s.a((Collection) value);
            } else {
                a10 = s.a((Comparator) comparator, (Iterable) value);
            }
            if (!a10.isEmpty()) {
                aVar.a(key, a10);
                i10 = a10.size() + i10;
            }
        }
        return new t<>(aVar.a(), i10);
    }
}
