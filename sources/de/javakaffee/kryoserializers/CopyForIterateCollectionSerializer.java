package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public class CopyForIterateCollectionSerializer extends CollectionSerializer {
    @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Collection collection) {
        super.write(kryo, output, (Collection) new ArrayList(collection));
    }
}
