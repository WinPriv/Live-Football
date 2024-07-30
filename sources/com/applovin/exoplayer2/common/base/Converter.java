package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    /* loaded from: classes.dex */
    public static final class a<A, B, C> extends Converter<A, C> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter<A, B> f13887a;

        /* renamed from: b, reason: collision with root package name */
        final Converter<B, C> f13888b;

        public a(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f13887a = converter;
            this.f13888b = converter2;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public A correctedDoBackward(@NullableDecl C c10) {
            return (A) this.f13887a.correctedDoBackward(this.f13888b.correctedDoBackward(c10));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public C correctedDoForward(@NullableDecl A a10) {
            return (C) this.f13888b.correctedDoForward(this.f13887a.correctedDoForward(a10));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public A doBackward(C c10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public C doForward(A a10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f13887a.equals(aVar.f13887a) || !this.f13888b.equals(aVar.f13888b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13888b.hashCode() + (this.f13887a.hashCode() * 31);
        }

        public String toString() {
            return this.f13887a + ".andThen(" + this.f13888b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class b<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Function<? super A, ? extends B> f13889a;

        /* renamed from: b, reason: collision with root package name */
        private final Function<? super B, ? extends A> f13890b;

        @Override // com.applovin.exoplayer2.common.base.Converter
        public A doBackward(B b10) {
            return this.f13890b.apply(b10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public B doForward(A a10) {
            return this.f13889a.apply(a10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f13889a.equals(bVar.f13889a) || !this.f13890b.equals(bVar.f13890b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13890b.hashCode() + (this.f13889a.hashCode() * 31);
        }

        public String toString() {
            return "Converter.from(" + this.f13889a + ", " + this.f13890b + ")";
        }

        private b(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.f13889a = (Function) Preconditions.checkNotNull(function);
            this.f13890b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<A, B> extends Converter<B, A> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter<A, B> f13892a;

        public d(Converter<A, B> converter) {
            this.f13892a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public B correctedDoBackward(@NullableDecl A a10) {
            return this.f13892a.correctedDoForward(a10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public A correctedDoForward(@NullableDecl B b10) {
            return this.f13892a.correctedDoBackward(b10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public B doBackward(A a10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public A doForward(B b10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof d) {
                return this.f13892a.equals(((d) obj).f13892a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f13892a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter<A, B> reverse() {
            return this.f13892a;
        }

        public String toString() {
            return this.f13892a + ".reverse()";
        }
    }

    public Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new b(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return c.f13891a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a10) {
        return convert(a10);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a10) {
        return correctedDoForward(a10);
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() { // from class: com.applovin.exoplayer2.common.base.Converter.1
            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.applovin.exoplayer2.common.base.Converter.1.1

                    /* renamed from: b, reason: collision with root package name */
                    private final Iterator<? extends A> f13886b;

                    {
                        this.f13886b = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.f13886b.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) Converter.this.convert(this.f13886b.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.f13886b.remove();
                    }
                };
            }
        };
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b10) {
        if (this.handleNullAutomatically) {
            if (b10 == null) {
                return null;
            }
            return (A) Preconditions.checkNotNull(doBackward(b10));
        }
        return doBackward(b10);
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a10) {
        if (this.handleNullAutomatically) {
            if (a10 == null) {
                return null;
            }
            return (B) Preconditions.checkNotNull(doForward(a10));
        }
        return doForward(a10);
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new a(this, (Converter) Preconditions.checkNotNull(converter));
    }

    public abstract A doBackward(B b10);

    public abstract B doForward(A a10);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter == null) {
            d dVar = new d(this);
            this.reverse = dVar;
            return dVar;
        }
        return converter;
    }

    public Converter(boolean z10) {
        this.handleNullAutomatically = z10;
    }

    /* loaded from: classes.dex */
    public static final class c<T> extends Converter<T, T> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final c f13891a = new c();

        private c() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<T> reverse() {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public T doBackward(T t10) {
            return t10;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public T doForward(T t10) {
            return t10;
        }
    }
}
