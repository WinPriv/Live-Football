package o8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import q8.a;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class o implements s<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Constructor f33748a;

    public o(Constructor constructor) {
        this.f33748a = constructor;
    }

    @Override // o8.s
    public final Object a() {
        Constructor constructor = this.f33748a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            a.AbstractC0464a abstractC0464a = q8.a.f34709a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + q8.a.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + q8.a.b(constructor) + "' with no args", e12.getCause());
        }
    }
}
