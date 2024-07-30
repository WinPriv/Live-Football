package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ClosureSerializer extends Serializer {
    private static Method readResolve;
    private static Class serializedLambda = SerializedLambda.class;

    /* loaded from: classes.dex */
    public static class Closure {
    }

    static {
        try {
            Method declaredMethod = SerializedLambda.class.getDeclaredMethod("readResolve", new Class[0]);
            readResolve = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException("Could not obtain SerializedLambda or its methods via reflection", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("writeReplace", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            if (serializedLambda.isInstance(invoke)) {
                return readResolve.invoke(invoke, new Object[0]);
            }
            throw new RuntimeException("Could not serialize lambda");
        } catch (Exception e10) {
            throw new RuntimeException("Could not serialize lambda", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class cls) {
        try {
            return readResolve.invoke(kryo.readObject(input, serializedLambda), new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException("Could not serialize lambda", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("writeReplace", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            if (serializedLambda.isInstance(invoke)) {
                kryo.writeObject(output, invoke);
                return;
            }
            throw new RuntimeException("Could not serialize lambda");
        } catch (Exception e10) {
            throw new RuntimeException("Could not serialize lambda", e10);
        }
    }
}
