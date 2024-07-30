package k0;

import e0.f;
import f0.e;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.n f30245s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f30246t;

    public b(androidx.activity.n nVar, int i10) {
        this.f30245s = nVar;
        this.f30246t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f30245s).J0;
        if (eVar != null) {
            eVar.c(this.f30246t);
        }
    }
}
