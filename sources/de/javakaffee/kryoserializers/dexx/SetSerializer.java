package de.javakaffee.kryoserializers.dexx;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.andrewoma.dexx.collection.Builder;
import com.github.andrewoma.dexx.collection.Set;
import com.github.andrewoma.dexx.collection.Sets;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SetSerializer extends Serializer<Set<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    public SetSerializer() {
        super(false, true);
    }

    public static void registerSerializers(Kryo kryo) {
        SetSerializer setSerializer = new SetSerializer();
        kryo.register(Set.class, setSerializer);
        kryo.register(Sets.of().getClass(), setSerializer);
        kryo.register(Sets.of(1).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5, 6).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5, 6, 7).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5, 6, 7, 8).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).getClass(), setSerializer);
        kryo.register(Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, new Integer[]{11}).getClass(), setSerializer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.esotericsoftware.kryo.Serializer
    public Set<Object> read(Kryo kryo, Input input, Class<Set<Object>> cls) {
        int readInt = input.readInt(true);
        Builder builder = Sets.builder();
        for (int i10 = 0; i10 < readInt; i10++) {
            builder.add(kryo.readClassAndObject(input));
        }
        return (Set) builder.build();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Set<Object> set) {
        output.writeInt(set.size(), true);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kryo.writeClassAndObject(output, it.next());
        }
    }
}
