package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.s2;
import j7.t1;

/* loaded from: classes2.dex */
public class TreeMultimapSerializer extends MultimapSerializerBase<Comparable, Comparable, s2<Comparable, Comparable>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = false;

    public TreeMultimapSerializer() {
        super(true, false);
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(s2.class, new TreeMultimapSerializer());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
        return read(kryo, input, (Class<s2<Comparable, Comparable>>) cls);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public s2<Comparable, Comparable> read(Kryo kryo, Input input, Class<s2<Comparable, Comparable>> cls) {
        t1 t1Var = t1.f30103s;
        s2<Comparable, Comparable> s2Var = new s2<>(t1Var, t1Var);
        readMultimap(kryo, input, s2Var);
        return s2Var;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, s2<Comparable, Comparable> s2Var) {
        writeMultimap(kryo, output, s2Var);
    }
}
