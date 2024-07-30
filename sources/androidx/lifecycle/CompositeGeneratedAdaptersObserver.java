package androidx.lifecycle;

import androidx.lifecycle.i;
import java.util.HashMap;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements k {

    /* renamed from: s, reason: collision with root package name */
    public final f[] f1912s;

    public CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.f1912s = fVarArr;
    }

    @Override // androidx.lifecycle.k
    public final void c(m mVar, i.b bVar) {
        new HashMap();
        f[] fVarArr = this.f1912s;
        for (f fVar : fVarArr) {
            fVar.a();
        }
        for (f fVar2 : fVarArr) {
            fVar2.a();
        }
    }
}
