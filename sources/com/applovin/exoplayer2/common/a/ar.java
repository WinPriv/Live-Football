package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ar<E> extends w<E> {

    /* renamed from: a, reason: collision with root package name */
    final transient E f13725a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f13726b;

    public ar(E e10) {
        this.f13725a = (E) Preconditions.checkNotNull(e10);
    }

    @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public ax<E> iterator() {
        return y.a(this.f13725a);
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f13725a.equals(obj);
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public boolean f() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public boolean h() {
        if (this.f13726b != 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.a.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f13726b;
        if (i10 == 0) {
            int hashCode = this.f13725a.hashCode();
            this.f13726b = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // com.applovin.exoplayer2.common.a.w
    public s<E> i() {
        return s.a(this.f13725a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.f13725a.toString() + ']';
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public int a(Object[] objArr, int i10) {
        objArr[i10] = this.f13725a;
        return i10 + 1;
    }

    public ar(E e10, int i10) {
        this.f13725a = e10;
        this.f13726b = i10;
    }
}
