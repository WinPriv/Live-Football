package z3;

import android.content.Context;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: e, reason: collision with root package name */
    public static volatile k f36967e;

    /* renamed from: a, reason: collision with root package name */
    public final i4.a f36968a;

    /* renamed from: b, reason: collision with root package name */
    public final i4.a f36969b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.b f36970c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.h f36971d;

    public w(i4.a aVar, i4.a aVar2, e4.b bVar, f4.h hVar, f4.j jVar) {
        this.f36968a = aVar;
        this.f36969b = aVar2;
        this.f36970c = bVar;
        this.f36971d = hVar;
        jVar.getClass();
        jVar.f28104a.execute(new androidx.activity.g(jVar, 3));
    }

    public static w a() {
        k kVar = f36967e;
        if (kVar != null) {
            return kVar.f36952x.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f36967e == null) {
            synchronized (w.class) {
                if (f36967e == null) {
                    context.getClass();
                    f36967e = new k(context);
                }
            }
        }
    }
}
