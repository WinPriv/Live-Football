package x1;

import a2.o;
import android.content.Context;
import android.os.Build;
import r1.i;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public final class d extends c<w1.b> {
    public d(Context context, d2.a aVar) {
        super((y1.e) y1.g.c(context, aVar).f36546v);
    }

    @Override // x1.c
    public final boolean b(o oVar) {
        if (oVar.f64j.f34801a == i.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // x1.c
    public final boolean c(w1.b bVar) {
        w1.b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar2.f36034a || !bVar2.f36035b) {
                return true;
            }
            return false;
        }
        return true ^ bVar2.f36034a;
    }
}
