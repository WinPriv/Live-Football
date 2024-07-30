package com.applovin.exoplayer2.common.a;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public interface ac<K, V> {
    boolean a(@NullableDecl K k10, @NullableDecl V v3);

    Collection<V> b(@NullableDecl K k10);

    Map<K, Collection<V>> b();

    boolean b(@NullableDecl Object obj, @NullableDecl Object obj2);

    boolean c(@NullableDecl Object obj, @NullableDecl Object obj2);

    int d();

    void e();

    Collection<V> h();
}
