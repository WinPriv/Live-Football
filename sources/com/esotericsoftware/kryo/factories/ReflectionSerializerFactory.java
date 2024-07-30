package com.esotericsoftware.kryo.factories;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.util.Util;

/* loaded from: classes.dex */
public class ReflectionSerializerFactory implements SerializerFactory {
    private final Class<? extends Serializer> serializerClass;

    public ReflectionSerializerFactory(Class<? extends Serializer> cls) {
        this.serializerClass = cls;
    }

    @Override // com.esotericsoftware.kryo.factories.SerializerFactory
    public Serializer makeSerializer(Kryo kryo, Class<?> cls) {
        return makeSerializer(kryo, this.serializerClass, cls);
    }

    public static Serializer makeSerializer(Kryo kryo, Class<? extends Serializer> cls, Class<?> cls2) {
        try {
            try {
                try {
                    try {
                        return cls.getConstructor(Kryo.class, Class.class).newInstance(kryo, cls2);
                    } catch (Exception e10) {
                        throw new IllegalArgumentException("Unable to create serializer \"" + cls.getName() + "\" for class: " + Util.className(cls2), e10);
                    }
                } catch (NoSuchMethodException unused) {
                    return cls.getConstructor(Kryo.class).newInstance(kryo);
                }
            } catch (NoSuchMethodException unused2) {
                return cls.getConstructor(Class.class).newInstance(cls2);
            }
        } catch (NoSuchMethodException unused3) {
            return cls.newInstance();
        }
    }
}
