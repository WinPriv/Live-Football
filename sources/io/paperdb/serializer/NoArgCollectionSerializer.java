package io.paperdb.serializer;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public class NoArgCollectionSerializer extends CollectionSerializer {
    @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
    public Collection create(Kryo kryo, Input input, Class<Collection> cls) {
        return new ArrayList();
    }
}
