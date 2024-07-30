package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sun.reflect.ReflectionFactory;

/* loaded from: classes2.dex */
public class KryoReflectionFactorySupport extends Kryo {
    private static final ReflectionFactory REFLECTION_FACTORY = ReflectionFactory.getReflectionFactory();
    private static final Object[] INITARGS = new Object[0];
    private static final Map<Class<?>, Constructor<?>> _constructors = new ConcurrentHashMap();

    private static Constructor<?> getNoArgsConstructor(Class<?> cls) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length == 0) {
                constructor.setAccessible(true);
                return constructor;
            }
        }
        return null;
    }

    private static <T> Constructor<?> newConstructorForSerialization(Class<T> cls) {
        try {
            Constructor<?> newConstructorForSerialization = REFLECTION_FACTORY.newConstructorForSerialization(cls, Object.class.getDeclaredConstructor(new Class[0]));
            newConstructorForSerialization.setAccessible(true);
            return newConstructorForSerialization;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Object newInstanceFrom(Constructor<?> constructor) {
        try {
            return constructor.newInstance(INITARGS);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static <T> T newInstanceFromReflectionFactory(Class<T> cls) {
        Map<Class<?>, Constructor<?>> map = _constructors;
        Constructor<?> constructor = map.get(cls);
        if (constructor == null) {
            constructor = newConstructorForSerialization(cls);
            map.put(cls, constructor);
        }
        return (T) newInstanceFrom(constructor);
    }

    @Override // com.esotericsoftware.kryo.Kryo
    public Serializer<?> getDefaultSerializer(Class cls) {
        Serializer<?> defaultSerializer = super.getDefaultSerializer(cls);
        if (defaultSerializer instanceof FieldSerializer) {
            ((FieldSerializer) defaultSerializer).setIgnoreSyntheticFields(false);
        }
        return defaultSerializer;
    }

    @Override // com.esotericsoftware.kryo.Kryo
    public <T> T newInstance(Class<T> cls) {
        if (cls != null) {
            Map<Class<?>, Constructor<?>> map = _constructors;
            Constructor<?> constructor = map.get(cls);
            if (constructor == null) {
                constructor = getNoArgsConstructor(cls);
                if (constructor == null) {
                    constructor = newConstructorForSerialization(cls);
                }
                map.put(cls, constructor);
            }
            return (T) newInstanceFrom(constructor);
        }
        throw new IllegalArgumentException("type cannot be null.");
    }
}
