package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.e0;

/* loaded from: classes2.dex */
public class HashMultimapSerializer extends MultimapSerializerBase<Object, Object, e0<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public HashMultimapSerializer() {
        super(false, false);
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(e0.class, new HashMultimapSerializer());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
        return read(kryo, input, (Class<e0<Object, Object>>) cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public e0<Object, Object> read(Kryo kryo, Input input, Class<e0<Object, Object>> cls) {
        e0<Object, Object> e0Var = new e0<>();
        readMultimap(kryo, input, e0Var);
        return e0Var;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, e0<Object, Object> e0Var) {
        writeMultimap(kryo, output, e0Var);
    }
}
