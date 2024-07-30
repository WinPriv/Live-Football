package x1;

import a2.o;
import android.content.Context;
import android.os.Build;
import r1.i;

/* compiled from: NetworkMeteredController.java */
/* loaded from: classes.dex */
public final class e extends c<w1.b> {

    /* renamed from: e, reason: collision with root package name */
    public static final String f36269e = r1.h.e("NetworkMeteredCtrlr");

    public e(Context context, d2.a aVar) {
        super((y1.e) y1.g.c(context, aVar).f36546v);
    }

    @Override // x1.c
    public final boolean b(o oVar) {
        if (oVar.f64j.f34801a == i.METERED) {
            return true;
        }
        return false;
    }

    @Override // x1.c
    public final boolean c(w1.b bVar) {
        w1.b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            r1.h.c().a(f36269e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar2.f36034a;
        }
        if (bVar2.f36034a && bVar2.f36036c) {
            z10 = false;
        }
        return z10;
    }
}
