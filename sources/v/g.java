package v;

import java.util.Iterator;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f35883m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f35876e = 2;
        } else {
            this.f35876e = 3;
        }
    }

    @Override // v.f
    public final void d(int i10) {
        if (this.f35880j) {
            return;
        }
        this.f35880j = true;
        this.f35877g = i10;
        Iterator it = this.f35881k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
