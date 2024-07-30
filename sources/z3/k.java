package z3;

import android.content.Context;
import g4.f;
import g4.g;
import g4.h;
import i4.b;
import i4.c;
import java.util.concurrent.Executor;
import z3.o;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: s, reason: collision with root package name */
    public tc.a<Executor> f36947s = b4.a.a(o.a.f36955a);

    /* renamed from: t, reason: collision with root package name */
    public b4.c f36948t;

    /* renamed from: u, reason: collision with root package name */
    public tc.a f36949u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.viewpager2.widget.d f36950v;

    /* renamed from: w, reason: collision with root package name */
    public tc.a<g4.o> f36951w;

    /* renamed from: x, reason: collision with root package name */
    public tc.a<w> f36952x;

    public k(Context context) {
        if (context != null) {
            b4.c cVar = new b4.c(context);
            this.f36948t = cVar;
            i4.b bVar = b.a.f29166a;
            i4.c cVar2 = c.a.f29167a;
            this.f36949u = b4.a.a(new a4.l(0, cVar, new a4.j(cVar, bVar, cVar2)));
            b4.c cVar3 = this.f36948t;
            this.f36950v = new androidx.viewpager2.widget.d(cVar3, f.a.f28487a, g.a.f28488a);
            tc.a<g4.o> a10 = b4.a.a(new q2.j(bVar, cVar2, h.a.f28489a, this.f36950v, b4.a.a(new e4.c(cVar3, 1))));
            this.f36951w = a10;
            e4.c cVar4 = new e4.c(bVar, 0);
            b4.c cVar5 = this.f36948t;
            m2.g gVar = new m2.g(cVar5, a10, cVar4);
            tc.a<Executor> aVar = this.f36947s;
            tc.a aVar2 = this.f36949u;
            this.f36952x = b4.a.a(new y(bVar, cVar2, new y(aVar, aVar2, gVar, a10, a10, 1), new f4.i(cVar5, aVar2, a10, gVar, aVar, a10, a10), new y1.g(aVar, a10, gVar, a10, 2), 0));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
