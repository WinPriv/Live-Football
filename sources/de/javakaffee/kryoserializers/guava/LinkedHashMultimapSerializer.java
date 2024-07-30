package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.c1;

/* loaded from: classes2.dex */
public class LinkedHashMultimapSerializer extends MultimapSerializerBase<Object, Object, c1<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = false;

    public LinkedHashMultimapSerializer() {
        super(false, false);
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(c1.class, new LinkedHashMultimapSerializer());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
        return read(kryo, input, (Class<c1<Object, Object>>) cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public c1<Object, Object> read(Kryo kryo, Input input, Class<c1<Object, Object>> cls) {
        c1<Object, Object> c1Var = new c1<>();
        readMultimap(kryo, input, c1Var);
        return c1Var;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, c1<Object, Object> c1Var) {
        writeMultimap(kryo, output, c1Var);
    }
}
