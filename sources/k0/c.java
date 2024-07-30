package k0;

import android.os.Handler;
import f0.e;
import k0.k;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.activity.n f30247a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f30248b;

    public c(e.a aVar, Handler handler) {
        this.f30247a = aVar;
        this.f30248b = handler;
    }

    public final void a(k.a aVar) {
        boolean z10;
        int i10 = aVar.f30271b;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Handler handler = this.f30248b;
        androidx.activity.n nVar = this.f30247a;
        if (z10) {
            handler.post(new a(nVar, aVar.f30270a));
        } else {
            handler.post(new b(nVar, i10));
        }
    }
}
