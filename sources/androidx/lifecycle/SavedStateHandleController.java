package androidx.lifecycle;

import androidx.lifecycle.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements k {

    /* renamed from: s, reason: collision with root package name */
    public final String f1937s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1938t = false;

    /* renamed from: u, reason: collision with root package name */
    public final x f1939u;

    public SavedStateHandleController(String str, x xVar) {
        this.f1937s = str;
        this.f1939u = xVar;
    }

    @Override // androidx.lifecycle.k
    public final void c(m mVar, i.b bVar) {
        if (bVar == i.b.ON_DESTROY) {
            this.f1938t = false;
            mVar.getLifecycle().c(this);
        }
    }
}
