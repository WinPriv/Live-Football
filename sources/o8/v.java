package o8;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class v extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f33773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33774c;

    public v(Object obj, Method method) {
        this.f33773b = method;
        this.f33774c = obj;
    }

    @Override // o8.z
    public final <T> T b(Class<T> cls) throws Exception {
        z.a(cls);
        return (T) this.f33773b.invoke(this.f33774c, cls);
    }
}
