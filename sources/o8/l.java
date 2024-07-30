package o8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class l implements s<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f33745a;

    public l(Type type) {
        this.f33745a = type;
    }

    @Override // o8.s
    public final Object a() {
        Type type = this.f33745a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new m8.o("Invalid EnumSet type: " + type.toString());
        }
        throw new m8.o("Invalid EnumSet type: " + type.toString());
    }
}
