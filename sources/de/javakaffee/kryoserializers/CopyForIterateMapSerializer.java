package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class CopyForIterateMapSerializer extends MapSerializer {
    @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Map map) {
        Map hashMap;
        if (map instanceof LinkedHashMap) {
            hashMap = new LinkedHashMap(map);
        } else {
            hashMap = new HashMap(map);
        }
        super.write(kryo, output, hashMap);
    }
}
