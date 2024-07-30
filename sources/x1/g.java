package x1;

import a2.o;
import android.content.Context;
import android.os.Build;
import r1.i;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public final class g extends c<w1.b> {
    public g(Context context, d2.a aVar) {
        super((y1.e) y1.g.c(context, aVar).f36546v);
    }

    @Override // x1.c
    public final boolean b(o oVar) {
        i iVar = oVar.f64j.f34801a;
        if (iVar != i.UNMETERED && (Build.VERSION.SDK_INT < 30 || iVar != i.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // x1.c
    public final boolean c(w1.b bVar) {
        w1.b bVar2 = bVar;
        if (bVar2.f36034a && !bVar2.f36036c) {
            return false;
        }
        return true;
    }
}
