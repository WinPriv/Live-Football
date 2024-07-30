package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Predicates {

    /* loaded from: classes.dex */
    public static class a<T> implements Predicate<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f13903a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            for (int i10 = 0; i10 < this.f13903a.size(); i10++) {
                if (!this.f13903a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof a) {
                return this.f13903a.equals(((a) obj).f13903a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13903a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f13903a);
        }

        private a(List<? extends Predicate<? super T>> list) {
            this.f13903a = list;
        }
    }

    /* loaded from: classes.dex */
    public static class b<A, B> implements Predicate<A>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate<B> f13904a;

        /* renamed from: b, reason: collision with root package name */
        final Function<A, ? extends B> f13905b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl A a10) {
            return this.f13904a.apply(this.f13905b.apply(a10));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f13905b.equals(bVar.f13905b) || !this.f13904a.equals(bVar.f13904a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13905b.hashCode() ^ this.f13904a.hashCode();
        }

        public String toString() {
            return this.f13904a + "(" + this.f13905b + ")";
        }

        private b(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f13904a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f13905b = (Function) Preconditions.checkNotNull(function);
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> implements Predicate<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Collection<?> f13906a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            try {
                return this.f13906a.contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return this.f13906a.equals(((c) obj).f13906a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13906a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f13906a + ")";
        }

        private c(Collection<?> collection) {
            this.f13906a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Predicate<Object>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f13907a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl Object obj) {
            return this.f13907a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof d) || this.f13907a != ((d) obj).f13907a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13907a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f13907a.getName() + ")";
        }

        private d(Class<?> cls) {
            this.f13907a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class e<T> implements Predicate<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final T f13908a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(T t10) {
            return this.f13908a.equals(t10);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof e) {
                return this.f13908a.equals(((e) obj).f13908a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13908a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f13908a + ")";
        }

        private e(T t10) {
            this.f13908a = t10;
        }
    }

    /* loaded from: classes.dex */
    public static class f<T> implements Predicate<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate<T> f13909a;

        public f(Predicate<T> predicate) {
            this.f13909a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            return !this.f13909a.apply(t10);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f) {
                return this.f13909a.equals(((f) obj).f13909a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f13909a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f13909a + ")";
        }
    }

    /* loaded from: classes.dex */
    public static class h<T> implements Predicate<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f13915a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            for (int i10 = 0; i10 < this.f13915a.size(); i10++) {
                if (this.f13915a.get(i10).apply(t10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof h) {
                return this.f13915a.equals(((h) obj).f13915a);
            }
            return false;
        }

        public int hashCode() {
            return this.f13915a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f13915a);
        }

        private h(List<? extends Predicate<? super T>> list) {
            this.f13915a = list;
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Predicate<Class<?>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f13916a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            return this.f13916a.isAssignableFrom(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof i) || this.f13916a != ((i) obj).f13916a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13916a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f13916a.getName() + ")";
        }

        private i(Class<?> cls) {
            this.f13916a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return g.ALWAYS_FALSE.a();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return g.ALWAYS_TRUE.a();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new a(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new b(predicate, function);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t10) {
        if (t10 == null) {
            return isNull();
        }
        return new e(t10);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new c(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new d(cls);
    }

    public static <T> Predicate<T> isNull() {
        return g.IS_NULL.a();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new f(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return g.NOT_NULL.a();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new h(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new i(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new a(defensiveCopy(predicateArr));
    }

    public static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new h(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new a(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new h(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* loaded from: classes.dex */
    public enum g implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.applovin.exoplayer2.common.base.Predicates.g.1
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.applovin.exoplayer2.common.base.Predicates.g.2
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.applovin.exoplayer2.common.base.Predicates.g.3
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                if (obj == null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.applovin.exoplayer2.common.base.Predicates.g.4
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                if (obj != null) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        public <T> Predicate<T> a() {
            return this;
        }
    }
}
