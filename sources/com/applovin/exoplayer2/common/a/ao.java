package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ao<T> extends ai<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final ai<? super T> f13715a;

    public ao(ai<? super T> aiVar) {
        this.f13715a = (ai) Preconditions.checkNotNull(aiVar);
    }

    @Override // com.applovin.exoplayer2.common.a.ai
    public <S extends T> ai<S> a() {
        return this.f13715a;
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f13715a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ao) {
            return this.f13715a.equals(((ao) obj).f13715a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f13715a.hashCode();
    }

    public String toString() {
        return this.f13715a + ".reverse()";
    }
}
