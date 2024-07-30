package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.j;

/* loaded from: classes2.dex */
public class ArrayListMultimapSerializer extends MultimapSerializerBase<Object, Object, j<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public ArrayListMultimapSerializer() {
        super(false, false);
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(j.class, new ArrayListMultimapSerializer());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
        return read(kryo, input, (Class<j<Object, Object>>) cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public j<Object, Object> read(Kryo kryo, Input input, Class<j<Object, Object>> cls) {
        j<Object, Object> jVar = new j<>();
        readMultimap(kryo, input, jVar);
        return jVar;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, j<Object, Object> jVar) {
        writeMultimap(kryo, output, jVar);
    }
}
