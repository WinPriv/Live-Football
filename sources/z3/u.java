package z3;

import com.applovin.exoplayer2.a0;
import java.util.HashMap;
import z3.h;
import z3.j;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
public final class u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s f36962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36963b = "FCM_CLIENT_EVENT_LOGGING";

    /* renamed from: c, reason: collision with root package name */
    public final w3.b f36964c;

    /* renamed from: d, reason: collision with root package name */
    public final com.applovin.exoplayer2.d.w f36965d;

    /* renamed from: e, reason: collision with root package name */
    public final v f36966e;

    public u(s sVar, w3.b bVar, com.applovin.exoplayer2.d.w wVar, v vVar) {
        this.f36962a = sVar;
        this.f36964c = bVar;
        this.f36965d = wVar;
        this.f36966e = vVar;
    }

    public final void a(w3.a aVar) {
        a0 a0Var = new a0(11);
        s sVar = this.f36962a;
        if (sVar != null) {
            String str = this.f36963b;
            if (str != null) {
                com.applovin.exoplayer2.d.w wVar = this.f36965d;
                if (wVar != null) {
                    w3.b bVar = this.f36964c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, aVar, wVar, bVar);
                        w wVar2 = (w) this.f36966e;
                        wVar2.getClass();
                        w3.c<?> cVar = iVar.f36938c;
                        w3.d c10 = cVar.c();
                        s sVar2 = iVar.f36936a;
                        sVar2.getClass();
                        j.a a10 = s.a();
                        a10.b(sVar2.b());
                        a10.c(c10);
                        a10.f36945b = sVar2.c();
                        j a11 = a10.a();
                        h.a aVar2 = new h.a();
                        aVar2.f = new HashMap();
                        aVar2.f36934d = Long.valueOf(wVar2.f36968a.a());
                        aVar2.f36935e = Long.valueOf(wVar2.f36969b.a());
                        aVar2.d(iVar.f36937b);
                        aVar2.c(new m(iVar.f36940e, (byte[]) iVar.f36939d.apply(cVar.b())));
                        aVar2.f36932b = cVar.a();
                        wVar2.f36970c.a(a0Var, aVar2.b(), a11);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
