package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m<T> extends ai<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<T> f13801a;

    public m(Comparator<T> comparator) {
        this.f13801a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f13801a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f13801a.equals(((m) obj).f13801a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13801a.hashCode();
    }

    public String toString() {
        return this.f13801a.toString();
    }
}
