package z3;

import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class f implements v7.d<c4.e> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f36920a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final v7.c f36921b = new v7.c("currentCacheSizeBytes", com.ironsource.adapters.facebook.a.n(e0.i.h(y7.d.class, new y7.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final v7.c f36922c = new v7.c("maxCacheSizeBytes", com.ironsource.adapters.facebook.a.n(e0.i.h(y7.d.class, new y7.a(2))));

    @Override // v7.a
    public final void a(Object obj, v7.e eVar) throws IOException {
        c4.e eVar2 = (c4.e) obj;
        v7.e eVar3 = eVar;
        eVar3.c(f36921b, eVar2.f3278a);
        eVar3.c(f36922c, eVar2.f3279b);
    }
}
