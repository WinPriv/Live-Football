package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class aq {

    /* renamed from: com.applovin.exoplayer2.common.a.aq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f13716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f13717b;

        @Override // com.applovin.exoplayer2.common.a.aq.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ax iterator() {
            return new com.applovin.exoplayer2.common.a.b() { // from class: com.applovin.exoplayer2.common.a.aq.1.1

                /* renamed from: a, reason: collision with root package name */
                final Iterator f13718a;

                /* renamed from: b, reason: collision with root package name */
                final Iterator f13719b;

                {
                    this.f13718a = AnonymousClass1.this.f13716a.iterator();
                    this.f13719b = AnonymousClass1.this.f13717b.iterator();
                }

                @Override // com.applovin.exoplayer2.common.a.b
                public Object a() {
                    if (this.f13718a.hasNext()) {
                        return this.f13718a.next();
                    }
                    while (this.f13719b.hasNext()) {
                        Object next = this.f13719b.next();
                        if (!AnonymousClass1.this.f13716a.contains(next)) {
                            return next;
                        }
                    }
                    return b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!this.f13716a.contains(obj) && !this.f13717b.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            if (this.f13716a.isEmpty() && this.f13717b.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f13716a.size();
            Iterator it = this.f13717b.iterator();
            while (it.hasNext()) {
                if (!this.f13716a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return aq.a((Set<?>) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<E> extends AbstractSet<E> {
        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public abstract ax<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> Set<E> b() {
        return Collections.newSetFromMap(ab.c());
    }

    public static <E> HashSet<E> a(int i10) {
        return new HashSet<>(ab.a(i10));
    }

    public static <E> b<E> a(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new b<E>() { // from class: com.applovin.exoplayer2.common.a.aq.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // com.applovin.exoplayer2.common.a.aq.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: a */
            public ax<E> iterator() {
                return new com.applovin.exoplayer2.common.a.b<E>() { // from class: com.applovin.exoplayer2.common.a.aq.2.1

                    /* renamed from: a, reason: collision with root package name */
                    final Iterator<E> f13723a;

                    {
                        this.f13723a = set.iterator();
                    }

                    @Override // com.applovin.exoplayer2.common.a.b
                    public E a() {
                        while (this.f13723a.hasNext()) {
                            E next = this.f13723a.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return b();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (set.contains(obj) && set2.contains(obj)) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                if (set.containsAll(collection) && set2.containsAll(collection)) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i10++;
                    }
                }
                return i10;
            }
        };
    }

    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static boolean a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }

    public static boolean a(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof af) {
            collection = ((af) collection).a();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return y.a(set.iterator(), collection);
        }
        return a(set, collection.iterator());
    }
}
