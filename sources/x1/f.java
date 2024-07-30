package x1;

import a2.o;
import android.content.Context;
import r1.i;

/* compiled from: NetworkNotRoamingController.java */
/* loaded from: classes.dex */
public final class f extends c<w1.b> {
    static {
        r1.h.e("NetworkNotRoamingCtrlr");
    }

    public f(Context context, d2.a aVar) {
        super((y1.e) y1.g.c(context, aVar).f36546v);
    }

    @Override // x1.c
    public final boolean b(o oVar) {
        if (oVar.f64j.f34801a == i.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // x1.c
    public final boolean c(w1.b bVar) {
        w1.b bVar2 = bVar;
        if (bVar2.f36034a && bVar2.f36037d) {
            return false;
        }
        return true;
    }
}
