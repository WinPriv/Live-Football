package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.n1;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MultimapSerializerBase<K, V, T extends n1<K, V>> extends Serializer<T> {
    public MultimapSerializerBase(boolean z10, boolean z11) {
        super(z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void readMultimap(Kryo kryo, Input input, n1<K, V> n1Var) {
        int readInt = input.readInt(true);
        for (int i10 = 0; i10 < readInt; i10++) {
            n1Var.put(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }
    }

    public void writeMultimap(Kryo kryo, Output output, n1<K, V> n1Var) {
        output.writeInt(n1Var.size(), true);
        for (Map.Entry<K, V> entry : n1Var.k()) {
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }
    }
}
