package f4;

import android.content.Context;
import i4.b;
import i4.c;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class i implements b4.b<h> {
    public final tc.a<g4.c> A;

    /* renamed from: s, reason: collision with root package name */
    public final tc.a<Context> f28097s;

    /* renamed from: t, reason: collision with root package name */
    public final tc.a<a4.e> f28098t;

    /* renamed from: u, reason: collision with root package name */
    public final tc.a<g4.d> f28099u;

    /* renamed from: v, reason: collision with root package name */
    public final tc.a<k> f28100v;

    /* renamed from: w, reason: collision with root package name */
    public final tc.a<Executor> f28101w;

    /* renamed from: x, reason: collision with root package name */
    public final tc.a<h4.b> f28102x;
    public final tc.a<i4.a> y;

    /* renamed from: z, reason: collision with root package name */
    public final tc.a<i4.a> f28103z;

    public i(tc.a aVar, tc.a aVar2, tc.a aVar3, m2.g gVar, tc.a aVar4, tc.a aVar5, tc.a aVar6) {
        i4.b bVar = b.a.f29166a;
        i4.c cVar = c.a.f29167a;
        this.f28097s = aVar;
        this.f28098t = aVar2;
        this.f28099u = aVar3;
        this.f28100v = gVar;
        this.f28101w = aVar4;
        this.f28102x = aVar5;
        this.y = bVar;
        this.f28103z = cVar;
        this.A = aVar6;
    }

    @Override // tc.a
    public final Object get() {
        return new h(this.f28097s.get(), this.f28098t.get(), this.f28099u.get(), this.f28100v.get(), this.f28101w.get(), this.f28102x.get(), this.y.get(), this.f28103z.get(), this.A.get());
    }
}
