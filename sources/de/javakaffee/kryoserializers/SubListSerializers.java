package de.javakaffee.kryoserializers;

import com.anythink.core.api.ATAdConst;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes2.dex */
public class SubListSerializers {
    private static final Object FAKE_REFERENCE = new Object();

    /* loaded from: classes2.dex */
    public static class ArrayListSubListSerializer extends Serializer<List<?>> {
        public static final Class<?> SUBLIST_CLASS = SubListSerializers.getClassOrNull("java.util.ArrayList$SubList");
        private Field _parentField;
        private Field _parentOffsetField;
        private Field _sizeField;

        public ArrayListSubListSerializer() {
            try {
                Class<?> cls = Class.forName("java.util.ArrayList$SubList");
                this._parentField = cls.getDeclaredField("parent");
                this._parentOffsetField = cls.getDeclaredField("parentOffset");
                this._sizeField = cls.getDeclaredField(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE);
                this._parentField.setAccessible(true);
                this._parentOffsetField.setAccessible(true);
                this._sizeField.setAccessible(true);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        public static Kryo addDefaultSerializer(Kryo kryo) {
            Class<?> cls = SUBLIST_CLASS;
            if (cls != null) {
                kryo.addDefaultSerializer(cls, new ArrayListSubListSerializer());
            }
            return kryo;
        }

        public static boolean canSerialize(Class<?> cls) {
            Class<?> cls2 = SUBLIST_CLASS;
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
            return false;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List<?> copy(Kryo kryo, List<?> list) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            try {
                List list2 = (List) this._parentField.get(list);
                int i10 = this._parentOffsetField.getInt(list);
                return ((List) kryo.copy(list2)).subList(i10, this._sizeField.getInt(list) + i10);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            return ((List) kryo.readClassAndObject(input)).subList(input.readInt(true), input.readInt(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, List<?> list) {
            try {
                kryo.writeClassAndObject(output, this._parentField.get(list));
                int i10 = this._parentOffsetField.getInt(list);
                output.writeInt(i10, true);
                output.writeInt(i10 + this._sizeField.getInt(list), true);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class JavaUtilSubListSerializer extends Serializer<List<?>> {
        public static final Class<?> SUBLIST_CLASS = SubListSerializers.getClassOrNull("java.util.SubList");
        private Field _listField;
        private Field _offsetField;
        private Field _sizeField;

        public JavaUtilSubListSerializer() {
            try {
                Class<?> cls = Class.forName("java.util.SubList");
                this._listField = cls.getDeclaredField("l");
                this._offsetField = cls.getDeclaredField("offset");
                this._sizeField = cls.getDeclaredField(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE);
                this._listField.setAccessible(true);
                this._offsetField.setAccessible(true);
                this._sizeField.setAccessible(true);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        public static Kryo addDefaultSerializer(Kryo kryo) {
            Class<?> cls = SUBLIST_CLASS;
            if (cls != null) {
                kryo.addDefaultSerializer(cls, new JavaUtilSubListSerializer());
            }
            return kryo;
        }

        public static boolean canSerialize(Class<?> cls) {
            Class<?> cls2 = SUBLIST_CLASS;
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
            return false;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List<?> copy(Kryo kryo, List<?> list) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            try {
                List list2 = (List) this._listField.get(list);
                int i10 = this._offsetField.getInt(list);
                return ((List) kryo.copy(list2)).subList(i10, this._sizeField.getInt(list) + i10);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
            kryo.reference(SubListSerializers.FAKE_REFERENCE);
            return ((List) kryo.readClassAndObject(input)).subList(input.readInt(true), input.readInt(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, List<?> list) {
            try {
                kryo.writeClassAndObject(output, this._listField.get(list));
                int i10 = this._offsetField.getInt(list);
                output.writeInt(i10, true);
                output.writeInt(i10 + this._sizeField.getInt(list), true);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public static Kryo addDefaultSerializers(Kryo kryo) {
        ArrayListSubListSerializer.addDefaultSerializer(kryo);
        JavaUtilSubListSerializer.addDefaultSerializer(kryo);
        return kryo;
    }

    public static Serializer<List<?>> createFor(Class cls) {
        if (ArrayListSubListSerializer.canSerialize(cls)) {
            return new ArrayListSubListSerializer();
        }
        if (JavaUtilSubListSerializer.canSerialize(cls)) {
            return new JavaUtilSubListSerializer();
        }
        return null;
    }

    public static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Class<?> getClassOrNull(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
