package de.javakaffee.kryoserializers.dexx;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.andrewoma.dexx.collection.Map;
import com.github.andrewoma.dexx.collection.Maps;
import com.github.andrewoma.dexx.collection.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MapSerializer extends Serializer<Map<Object, ? extends Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    public MapSerializer() {
        super(true, true);
    }

    public static void registerSerializers(Kryo kryo) {
        MapSerializer mapSerializer = new MapSerializer();
        kryo.register(Map.class, mapSerializer);
        kryo.register(Maps.of().getClass(), mapSerializer);
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        kryo.register(Maps.of(obj, obj).getClass(), mapSerializer);
        kryo.register(Maps.of(obj, obj, obj2, obj2).getClass(), mapSerializer);
        kryo.register(Maps.of(obj, obj, obj2, obj2, obj3, obj3).getClass(), mapSerializer);
        kryo.register(Maps.of(obj, obj, obj2, obj2, obj3, obj3, obj4, obj4).getClass(), mapSerializer);
        kryo.register(Maps.of(obj, obj, obj2, obj2, obj3, obj3, obj4, obj4, obj5, obj5).getClass(), mapSerializer);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Map<Object, ? extends Object> read(Kryo kryo, Input input, Class<Map<Object, ? extends Object>> cls) {
        HashMap hashMap = (HashMap) kryo.readObject(input, HashMap.class);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return Maps.copyOf(arrayList);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, com.github.andrewoma.dexx.collection.Map<Object, ? extends Object> map) {
        kryo.writeObject(output, map.asMap());
    }
}
