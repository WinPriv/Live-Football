package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i<F, T> extends ai<F> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Function<F, ? extends T> f13776a;

    /* renamed from: b, reason: collision with root package name */
    final ai<T> f13777b;

    public i(Function<F, ? extends T> function, ai<T> aiVar) {
        this.f13776a = (Function) Preconditions.checkNotNull(function);
        this.f13777b = (ai) Preconditions.checkNotNull(aiVar);
    }

    @Override // com.applovin.exoplayer2.common.a.ai, java.util.Comparator
    public int compare(F f, F f10) {
        return this.f13777b.compare(this.f13776a.apply(f), this.f13776a.apply(f10));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f13776a.equals(iVar.f13776a) && this.f13777b.equals(iVar.f13777b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f13776a, this.f13777b);
    }

    public String toString() {
        return this.f13777b + ".onResultOf(" + this.f13776a + ")";
    }
}
