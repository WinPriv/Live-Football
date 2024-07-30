package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class CollectionsSingletonListSerializer extends Serializer<List<?>> {
    public CollectionsSingletonListSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public List<?> read(Kryo kryo, Input input, Class<List<?>> cls) {
        return Collections.singletonList(kryo.readClassAndObject(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, List<?> list) {
        kryo.writeClassAndObject(output, list.get(0));
    }
}
