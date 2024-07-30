package androidx.lifecycle;

import androidx.lifecycle.i;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements k {

    /* renamed from: s, reason: collision with root package name */
    public final z f1936s;

    public SavedStateHandleAttacher(z zVar) {
        this.f1936s = zVar;
    }

    @Override // androidx.lifecycle.k
    public final void c(m mVar, i.b bVar) {
        boolean z10;
        if (bVar == i.b.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            mVar.getLifecycle().c(this);
            this.f1936s.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
        }
    }
}
