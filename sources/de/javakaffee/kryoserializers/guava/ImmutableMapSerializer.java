package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.m0;
import j7.w1;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ImmutableMapSerializer extends Serializer<m0<Object, ? extends Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    /* loaded from: classes2.dex */
    public enum DummyEnum {
        VALUE1,
        VALUE2
    }

    public ImmutableMapSerializer() {
        super(true, true);
    }

    public static void registerSerializers(Kryo kryo) {
        ImmutableMapSerializer immutableMapSerializer = new ImmutableMapSerializer();
        kryo.register(m0.class, immutableMapSerializer);
        kryo.register(w1.y.getClass(), immutableMapSerializer);
        Object obj = new Object();
        Object obj2 = new Object();
        kryo.register(m0.w(obj, obj).getClass(), immutableMapSerializer);
        kryo.register(w1.y(2, new Object[]{obj, obj, obj2, obj2}).getClass(), immutableMapSerializer);
        EnumMap enumMap = new EnumMap(DummyEnum.class);
        for (DummyEnum dummyEnum : DummyEnum.values()) {
            enumMap.put((EnumMap) dummyEnum, (DummyEnum) obj);
        }
        kryo.register(m0.a(enumMap).getClass(), immutableMapSerializer);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public m0<Object, ? extends Object> read(Kryo kryo, Input input, Class<m0<Object, ? extends Object>> cls) {
        return m0.a((Map) kryo.readObject(input, HashMap.class));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, m0<Object, ? extends Object> m0Var) {
        kryo.writeObject(output, new HashMap(m0Var));
    }
}
