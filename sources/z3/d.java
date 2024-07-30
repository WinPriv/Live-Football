package z3;

import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class d implements v7.d<c4.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f36915a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final v7.c f36916b = new v7.c("logSource", com.ironsource.adapters.facebook.a.n(e0.i.h(y7.d.class, new y7.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final v7.c f36917c = new v7.c("logEventDropped", com.ironsource.adapters.facebook.a.n(e0.i.h(y7.d.class, new y7.a(2))));

    @Override // v7.a
    public final void a(Object obj, v7.e eVar) throws IOException {
        c4.d dVar = (c4.d) obj;
        v7.e eVar2 = eVar;
        eVar2.a(f36916b, dVar.f3276a);
        eVar2.a(f36917c, dVar.f3277b);
    }
}
