package o8;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class w extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f33775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33776c;

    public w(int i10, Method method) {
        this.f33775b = method;
        this.f33776c = i10;
    }

    @Override // o8.z
    public final <T> T b(Class<T> cls) throws Exception {
        z.a(cls);
        return (T) this.f33775b.invoke(null, cls, Integer.valueOf(this.f33776c));
    }
}
