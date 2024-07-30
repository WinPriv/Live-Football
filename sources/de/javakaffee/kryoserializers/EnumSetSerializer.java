package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class EnumSetSerializer extends Serializer<EnumSet<? extends Enum<?>>> {
    private static final Field TYPE_FIELD;

    static {
        try {
            Field declaredField = EnumSet.class.getDeclaredField("elementType");
            TYPE_FIELD = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException("The EnumSet class seems to have changed, could not access expected field.", e10);
        }
    }

    private Class<? extends Enum<?>> getElementType(EnumSet<? extends Enum<?>> enumSet) {
        try {
            return (Class) TYPE_FIELD.get(enumSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not access keys field.", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public EnumSet<? extends Enum<?>> copy(Kryo kryo, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.clone();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public EnumSet<? extends Enum<?>> read(Kryo kryo, Input input, Class<EnumSet<? extends Enum<?>>> cls) {
        Class type = kryo.readClass(input).getType();
        EnumSet<? extends Enum<?>> noneOf = EnumSet.noneOf(type);
        int readInt = input.readInt(true);
        Enum[] enumArr = (Enum[]) type.getEnumConstants();
        for (int i10 = 0; i10 < readInt; i10++) {
            noneOf.add(enumArr[input.readInt(true)]);
        }
        return noneOf;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, EnumSet<? extends Enum<?>> enumSet) {
        kryo.writeClass(output, getElementType(enumSet));
        output.writeInt(enumSet.size(), true);
        Iterator<E> it = enumSet.iterator();
        while (it.hasNext()) {
            output.writeInt(((Enum) it.next()).ordinal(), true);
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Wrote EnumSet: " + enumSet);
        }
    }
}
