package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class BitSetSerializer extends Serializer<BitSet> {
    @Override // com.esotericsoftware.kryo.Serializer
    public BitSet copy(Kryo kryo, BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bitSet2.set(i10, bitSet.get(i10));
        }
        return bitSet2;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public BitSet read(Kryo kryo, Input input, Class<BitSet> cls) {
        int readInt = input.readInt(true);
        BitSet bitSet = new BitSet(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            bitSet.set(i10, input.readBoolean());
        }
        return bitSet;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, BitSet bitSet) {
        int length = bitSet.length();
        output.writeInt(length, true);
        for (int i10 = 0; i10 < length; i10++) {
            output.writeBoolean(bitSet.get(i10));
        }
    }
}
