package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ak<E> extends s<E> {

    /* renamed from: a, reason: collision with root package name */
    static final s<Object> f13692a = new ak(new Object[0], 0);

    /* renamed from: b, reason: collision with root package name */
    final transient Object[] f13693b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f13694c;

    public ak(Object[] objArr, int i10) {
        this.f13693b = objArr;
        this.f13694c = i10;
    }

    @Override // com.applovin.exoplayer2.common.a.s, com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f13693b, 0, objArr, i10, this.f13694c);
        return i10 + this.f13694c;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public Object[] b() {
        return this.f13693b;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int c() {
        return 0;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int d() {
        return this.f13694c;
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        Preconditions.checkElementIndex(i10, this.f13694c);
        return (E) this.f13693b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13694c;
    }
}
