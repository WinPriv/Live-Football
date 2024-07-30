package o8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class m implements s<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f33746a;

    public m(Type type) {
        this.f33746a = type;
    }

    @Override // o8.s
    public final Object a() {
        Type type = this.f33746a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new m8.o("Invalid EnumMap type: " + type.toString());
        }
        throw new m8.o("Invalid EnumMap type: " + type.toString());
    }
}
