package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.g1;

/* loaded from: classes2.dex */
public class LinkedListMultimapSerializer extends MultimapSerializerBase<Object, Object, g1<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public LinkedListMultimapSerializer() {
        super(false, false);
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(g1.class, new LinkedListMultimapSerializer());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
        return read(kryo, input, (Class<g1<Object, Object>>) cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public g1<Object, Object> read(Kryo kryo, Input input, Class<g1<Object, Object>> cls) {
        g1<Object, Object> g1Var = new g1<>();
        readMultimap(kryo, input, g1Var);
        return g1Var;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, g1<Object, Object> g1Var) {
        writeMultimap(kryo, output, g1Var);
    }
}
