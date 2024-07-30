package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class EnumMapSerializer extends Serializer<EnumMap<? extends Enum<?>, ?>> {
    private static final Object FAKE_REFERENCE;
    private static final Field TYPE_FIELD;

    static {
        try {
            Field declaredField = EnumMap.class.getDeclaredField("keyType");
            TYPE_FIELD = declaredField;
            declaredField.setAccessible(true);
            FAKE_REFERENCE = new Object();
        } catch (Exception e10) {
            throw new RuntimeException("The EnumMap class seems to have changed, could not access expected field.", e10);
        }
    }

    private EnumMap<? extends Enum<?>, ?> create(Kryo kryo, Input input, Class<EnumMap<? extends Enum<?>, ?>> cls) {
        return new EnumMap<>(kryo.readClass(input).getType());
    }

    private Class<Enum<?>> getKeyType(EnumMap<?, ?> enumMap) {
        try {
            return (Class) TYPE_FIELD.get(enumMap);
        } catch (Exception e10) {
            throw new RuntimeException("Could not access keys field.", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public EnumMap<? extends Enum<?>, ?> copy(Kryo kryo, EnumMap<? extends Enum<?>, ?> enumMap) {
        EnumMap<? extends Enum<?>, ?> enumMap2 = new EnumMap<>((EnumMap<? extends Enum<?>, ? extends Object>) enumMap);
        for (Map.Entry<? extends Enum<?>, ?> entry : enumMap.entrySet()) {
            enumMap2.put((EnumMap<? extends Enum<?>, ?>) entry.getKey(), (Enum<?>) kryo.copy(entry.getValue()));
        }
        return enumMap2;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public EnumMap<? extends Enum<?>, ?> read(Kryo kryo, Input input, Class<EnumMap<? extends Enum<?>, ?>> cls) {
        kryo.reference(FAKE_REFERENCE);
        EnumMap<? extends Enum<?>, ?> create = create(kryo, input, cls);
        Enum<?>[] enumConstants = getKeyType(create).getEnumConstants();
        int readInt = input.readInt(true);
        for (int i10 = 0; i10 < readInt; i10++) {
            create.put((EnumMap<? extends Enum<?>, ?>) enumConstants[input.readInt(true)], (Enum<?>) kryo.readClassAndObject(input));
        }
        return create;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, EnumMap<? extends Enum<?>, ?> enumMap) {
        kryo.writeClass(output, getKeyType(enumMap));
        output.writeInt(enumMap.size(), true);
        for (Map.Entry<? extends Enum<?>, ?> entry : enumMap.entrySet()) {
            output.writeInt(entry.getKey().ordinal(), true);
            kryo.writeClassAndObject(output, entry.getValue());
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Wrote EnumMap: " + enumMap);
        }
    }
}
