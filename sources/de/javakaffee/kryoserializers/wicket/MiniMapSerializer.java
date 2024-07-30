package de.javakaffee.kryoserializers.wicket;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Field;
import java.util.Map;
import org.apache.wicket.util.collections.MiniMap;

/* loaded from: classes2.dex */
public class MiniMapSerializer extends Serializer<MiniMap<Object, Object>> {
    private static final Field KEYS_FIELD;

    static {
        try {
            Field declaredField = MiniMap.class.getDeclaredField("keys");
            KEYS_FIELD = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException("The MiniMap seems to have changed, could not access expected field.", e10);
        }
    }

    private int getMaxEntries(MiniMap<?, ?> miniMap) {
        try {
            return ((Object[]) KEYS_FIELD.get(miniMap)).length;
        } catch (Exception e10) {
            throw new RuntimeException("Could not access keys field.", e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public MiniMap<Object, Object> read(Kryo kryo, Input input, Class<MiniMap<Object, Object>> cls) {
        MiniMap<Object, Object> miniMap = new MiniMap<>(input.readInt(true));
        int readInt = input.readInt(true);
        for (int i10 = 0; i10 < readInt; i10++) {
            miniMap.put(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }
        return miniMap;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, MiniMap<Object, Object> miniMap) {
        output.writeInt(getMaxEntries(miniMap), true);
        output.writeInt(miniMap.size(), true);
        for (Map.Entry entry : miniMap.entrySet()) {
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Wrote map: " + miniMap);
        }
    }
}
