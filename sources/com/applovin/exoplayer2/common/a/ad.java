package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class ad<K0, V0> {

    /* renamed from: com.applovin.exoplayer2.common.a.ad$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends c<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13685a;

        @Override // com.applovin.exoplayer2.common.a.ad.c
        public <K, V> Map<K, Collection<V>> a() {
            return aj.a(this.f13685a);
        }
    }

    /* loaded from: classes.dex */
    public static final class a<V> implements Supplier<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f13687a;

        public a(int i10) {
            this.f13687a = j.a(i10, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f13687a);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<K0, V0> extends ad<K0, V0> {
        public b() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> z<K, V> b();
    }

    /* loaded from: classes.dex */
    public static abstract class c<K0> {
        public b<K0, Object> a(final int i10) {
            j.a(i10, "expectedValuesPerKey");
            return new b<K0, Object>() { // from class: com.applovin.exoplayer2.common.a.ad.c.1
                @Override // com.applovin.exoplayer2.common.a.ad.b
                public <K extends K0, V> z<K, V> b() {
                    return ae.a(c.this.a(), new a(i10));
                }
            };
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> a();

        public b<K0, Object> b() {
            return a(2);
        }
    }

    private ad() {
    }

    public /* synthetic */ ad(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static c<Comparable> a() {
        return a(ai.b());
    }

    public static <K0> c<K0> a(final Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new c<K0>() { // from class: com.applovin.exoplayer2.common.a.ad.2
            @Override // com.applovin.exoplayer2.common.a.ad.c
            public <K extends K0, V> Map<K, Collection<V>> a() {
                return new TreeMap(comparator);
            }
        };
    }
}
