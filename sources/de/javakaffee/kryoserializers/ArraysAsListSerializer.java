package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class ArraysAsListSerializer extends Serializer<List<?>> {
    private Field _arrayField;

    public ArraysAsListSerializer() {
        try {
            Field declaredField = Class.forName("java.util.Arrays$ArrayList").getDeclaredField("a");
            this._arrayField = declaredField;
            declaredField.setAccessible(true);
            setImmutable(true);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Class<?> getPrimitiveWrapperClass(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls.equals(Long.TYPE)) {
                return Long.class;
            }
            if (cls.equals(Integer.TYPE)) {
                return Integer.class;
            }
            if (cls.equals(Double.TYPE)) {
                return Double.class;
            }
            if (cls.equals(Float.TYPE)) {
                return Float.class;
            }
            if (cls.equals(Boolean.TYPE)) {
                return Boolean.class;
            }
            if (cls.equals(Character.TYPE)) {
                return Character.class;
            }
            if (cls.equals(Short.TYPE)) {
                return Short.class;
            }
            if (cls.equals(Byte.TYPE)) {
                return Byte.class;
            }
            return cls;
        }
        return cls;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
        int readInt = input.readInt(true);
        Class<?> type = kryo.readClass(input).getType();
        if (type.isPrimitive()) {
            type = getPrimitiveWrapperClass(type);
        }
        try {
            Object newInstance = Array.newInstance(type, readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                Array.set(newInstance, i10, kryo.readClassAndObject(input));
            }
            return Arrays.asList((Object[]) newInstance);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, List<?> list) {
        try {
            Object[] objArr = (Object[]) this._arrayField.get(list);
            output.writeInt(objArr.length, true);
            kryo.writeClass(output, objArr.getClass().getComponentType());
            for (Object obj : objArr) {
                kryo.writeClassAndObject(output, obj);
            }
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
