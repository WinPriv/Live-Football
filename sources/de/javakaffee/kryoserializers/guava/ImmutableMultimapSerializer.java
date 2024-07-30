package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.j0;
import j7.k0;
import j7.m0;
import j7.p;
import j7.s0;
import j7.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ImmutableMultimapSerializer extends Serializer<s0<Object, Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    public ImmutableMultimapSerializer() {
        super(true, true);
    }

    public static void registerSerializers(Kryo kryo) {
        if (!(kryo.getSerializer(j0.class) instanceof ImmutableListSerializer)) {
            ImmutableListSerializer.registerSerializers(kryo);
        }
        if (!(kryo.getSerializer(m0.class) instanceof ImmutableMapSerializer)) {
            ImmutableMapSerializer.registerSerializers(kryo);
        }
        ImmutableMultimapSerializer immutableMultimapSerializer = new ImmutableMultimapSerializer();
        kryo.register(s0.class, immutableMultimapSerializer);
        kryo.register(y.y.getClass(), immutableMultimapSerializer);
        Object obj = new Object();
        k0.a aVar = new k0.a();
        p pVar = aVar.f30096a;
        Collection collection = (Collection) pVar.get(obj);
        if (collection == null) {
            collection = new ArrayList();
            pVar.put(obj, collection);
        }
        collection.add(obj);
        kryo.register(aVar.c().getClass(), immutableMultimapSerializer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.esotericsoftware.kryo.Serializer
    public s0<Object, Object> read(Kryo kryo, Input input, Class<s0<Object, Object>> cls) {
        Set<Map.Entry> entrySet = ((Map) kryo.readObject(input, m0.class)).entrySet();
        s0.a aVar = new s0.a();
        for (Map.Entry entry : entrySet) {
            aVar.b((Iterable) entry.getValue(), entry.getKey());
        }
        return aVar.a();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, s0<Object, Object> s0Var) {
        kryo.writeObject(output, m0.a(s0Var.f30094w));
    }
}
