package kd;

import java.lang.reflect.InvocationTargetException;

/* compiled from: GCJInstantiator.java */
/* loaded from: classes2.dex */
public final class a<T> extends b<T> {
    public a(Class<T> cls) {
        super(cls);
    }

    @Override // id.a
    public final T newInstance() {
        try {
            Class<T> cls = this.f32288s;
            return cls.cast(b.f32286t.invoke(b.f32287u, cls, Object.class));
        } catch (IllegalAccessException e10) {
            throw new r2.a(e10);
        } catch (RuntimeException e11) {
            throw new r2.a(e11);
        } catch (InvocationTargetException e12) {
            throw new r2.a(e12);
        }
    }
}
