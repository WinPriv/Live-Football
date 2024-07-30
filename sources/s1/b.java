package s1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.q;
import r1.k;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public final class b implements r1.k {

    /* renamed from: c, reason: collision with root package name */
    public final q<k.a> f35049c = new q<>();

    /* renamed from: d, reason: collision with root package name */
    public final c2.c<k.a.c> f35050d = new c2.c<>();

    public b() {
        a(r1.k.f34826b);
    }

    public final void a(k.a aVar) {
        boolean z10;
        q<k.a> qVar = this.f35049c;
        synchronized (qVar.f1920a) {
            if (qVar.f == LiveData.f1919k) {
                z10 = true;
            } else {
                z10 = false;
            }
            qVar.f = aVar;
        }
        if (z10) {
            j.a.i().j(qVar.f1928j);
        }
        if (aVar instanceof k.a.c) {
            this.f35050d.i((k.a.c) aVar);
        } else if (aVar instanceof k.a.C0468a) {
            this.f35050d.j(((k.a.C0468a) aVar).f34827a);
        }
    }
}
