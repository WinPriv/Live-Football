package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class CollectionsEmptySetSerializer extends Serializer<Set<?>> {
    public CollectionsEmptySetSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Set<?> set) {
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Set<?> read(Kryo kryo, Input input, Class<Set<?>> cls) {
        return Collections.EMPTY_SET;
    }
}
