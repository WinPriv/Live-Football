package wb;

import android.util.Log;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.controller.y;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f36193s;

    public b(g gVar) {
        this.f36193s = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f36193s;
        try {
            g gVar2 = this.f36193s;
            y yVar = gVar2.y;
            gVar2.f26120a = g.a(gVar2, yVar.f26387a, yVar.f26389c, yVar.f26388b, yVar.f26390d, yVar.f26391e, yVar.f);
            gVar.f26120a.g();
        } catch (Exception e10) {
            gVar.e(Log.getStackTraceString(e10));
        }
    }
}
