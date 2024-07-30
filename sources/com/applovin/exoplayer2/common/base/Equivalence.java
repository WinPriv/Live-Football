package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Equivalence<T> {

    /* loaded from: classes.dex */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @NullableDecl
        private final T reference;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                Wrapper wrapper = (Wrapper) obj;
                if (this.equivalence.equals(wrapper.equivalence)) {
                    return this.equivalence.equivalent(this.reference, wrapper.reference);
                }
                return false;
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t10) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t10;
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends Equivalence<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final a f13893a = new a();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Predicate<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Equivalence<T> f13894a;

        /* renamed from: b, reason: collision with root package name */
        @NullableDecl
        private final T f13895b;

        public b(Equivalence<T> equivalence, @NullableDecl T t10) {
            this.f13894a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f13895b = t10;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            return this.f13894a.equivalent(t10, this.f13895b);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f13894a.equals(bVar.f13894a) && Objects.equal(this.f13895b, bVar.f13895b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f13894a, this.f13895b);
        }

        public String toString() {
            return this.f13894a + ".equivalentTo(" + this.f13895b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Equivalence<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final c f13896a = new c();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Equivalence<Object> equals() {
        return a.f13893a;
    }

    public static Equivalence<Object> identity() {
        return c.f13896a;
    }

    public abstract boolean doEquivalent(T t10, T t11);

    public abstract int doHash(T t10);

    public final boolean equivalent(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 != null && t11 != null) {
            return doEquivalent(t10, t11);
        }
        return false;
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t10) {
        return new b(this, t10);
    }

    public final int hash(@NullableDecl T t10) {
        if (t10 == null) {
            return 0;
        }
        return doHash(t10);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s10) {
        return new Wrapper<>(s10);
    }
}
