package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ag extends ai<Comparable> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final ag f13691a = new ag();

    private ag() {
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // com.applovin.exoplayer2.common.a.ai
    public <S extends Comparable> ai<S> a() {
        return an.f13714a;
    }
}
