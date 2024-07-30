package b1;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class b implements g0.b {

    /* renamed from: a, reason: collision with root package name */
    public final e<?>[] f2799a;

    public b(e<?>... eVarArr) {
        zc.d.d(eVarArr, "initializers");
        this.f2799a = eVarArr;
    }

    @Override // androidx.lifecycle.g0.b
    public final e0 b(Class cls, d dVar) {
        e0 e0Var = null;
        for (e<?> eVar : this.f2799a) {
            if (zc.d.a(eVar.f2801a, cls)) {
                Object invoke = eVar.f2802b.invoke(dVar);
                if (invoke instanceof e0) {
                    e0Var = (e0) invoke;
                } else {
                    e0Var = null;
                }
            }
        }
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
