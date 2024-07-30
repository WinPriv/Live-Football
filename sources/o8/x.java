package o8;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class x extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f33777b;

    public x(Method method) {
        this.f33777b = method;
    }

    @Override // o8.z
    public final <T> T b(Class<T> cls) throws Exception {
        z.a(cls);
        return (T) this.f33777b.invoke(null, cls, Object.class);
    }
}
