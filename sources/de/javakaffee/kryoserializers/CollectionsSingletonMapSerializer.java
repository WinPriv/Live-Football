package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class CollectionsSingletonMapSerializer extends Serializer<Map<?, ?>> {
    public CollectionsSingletonMapSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Map<?, ?> read(Kryo kryo, Input input, Class<Map<?, ?>> cls) {
        return Collections.singletonMap(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Map<?, ?> map) {
        Map.Entry<?, ?> next = map.entrySet().iterator().next();
        kryo.writeClassAndObject(output, next.getKey());
        kryo.writeClassAndObject(output, next.getValue());
    }
}
