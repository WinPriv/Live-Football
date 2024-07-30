package uc;

import androidx.lifecycle.z;
import java.io.Serializable;
import n0.v0;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
public final class c<T> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public yc.a<? extends T> f35847s;

    /* renamed from: t, reason: collision with root package name */
    public volatile Object f35848t = v0.f33137e;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35849u = this;

    public c(z.a aVar) {
        this.f35847s = aVar;
    }

    public final T k() {
        T t10;
        T t11 = (T) this.f35848t;
        v0 v0Var = v0.f33137e;
        if (t11 != v0Var) {
            return t11;
        }
        synchronized (this.f35849u) {
            t10 = (T) this.f35848t;
            if (t10 == v0Var) {
                yc.a<? extends T> aVar = this.f35847s;
                zc.d.b(aVar);
                t10 = aVar.k();
                this.f35848t = t10;
                this.f35847s = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z10;
        if (this.f35848t != v0.f33137e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return String.valueOf(k());
        }
        return "Lazy value not initialized yet.";
    }
}
