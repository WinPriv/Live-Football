package com.applovin.exoplayer2.common.a;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class r<K, V> extends e<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NullableDecl
    final K f13811a;

    /* renamed from: b, reason: collision with root package name */
    @NullableDecl
    final V f13812b;

    public r(@NullableDecl K k10, @NullableDecl V v3) {
        this.f13811a = k10;
        this.f13812b = v3;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f13811a;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f13812b;
    }

    @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
    public final V setValue(V v3) {
        throw new UnsupportedOperationException();
    }
}
