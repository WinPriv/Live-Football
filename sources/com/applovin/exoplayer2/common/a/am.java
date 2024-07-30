package com.applovin.exoplayer2.common.a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class am<E> extends w<E> {

    /* renamed from: a, reason: collision with root package name */
    static final am<Object> f13709a = new am<>(new Object[0], 0, null, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    final transient Object[] f13710b;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f13711c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f13712d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f13713e;
    private final transient int f;

    public am(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f13710b = objArr;
        this.f13711c = objArr2;
        this.f13712d = i11;
        this.f13713e = i10;
        this.f = i12;
    }

    @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public ax<E> iterator() {
        return e().iterator();
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public Object[] b() {
        return this.f13710b;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int c() {
        return 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f13711c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a10 = p.a(obj);
        while (true) {
            int i10 = a10 & this.f13712d;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a10 = i10 + 1;
        }
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int d() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public boolean f() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public boolean h() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.a.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f13713e;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public s<E> i() {
        return s.b(this.f13710b, this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f13710b, 0, objArr, i10, this.f);
        return i10 + this.f;
    }
}
