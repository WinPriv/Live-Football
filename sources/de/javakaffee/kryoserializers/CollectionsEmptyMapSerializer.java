package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class CollectionsEmptyMapSerializer extends Serializer<Map<?, ?>> {
    public CollectionsEmptyMapSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Map<?, ?> map) {
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Map<?, ?> read(Kryo kryo, Input input, Class<Map<?, ?>> cls) {
        return Collections.EMPTY_MAP;
    }
}
