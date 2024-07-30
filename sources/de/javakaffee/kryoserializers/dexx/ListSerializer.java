package de.javakaffee.kryoserializers.dexx;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.andrewoma.dexx.collection.IndexedLists;
import com.github.andrewoma.dexx.collection.List;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ListSerializer extends Serializer<List> {
    private static final boolean DOES_NOT_ACCEPT_NULL = true;
    private static final boolean IMMUTABLE = true;

    public ListSerializer() {
        super(true, true);
    }

    public static void registerSerializers(Kryo kryo) {
        ListSerializer listSerializer = new ListSerializer();
        kryo.register(List.class, listSerializer);
        kryo.register(IndexedLists.of().getClass(), listSerializer);
        kryo.register(IndexedLists.of(1).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5, 6).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5, 6, 7).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5, 6, 7, 8).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5, 6, 7, 8, 9).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5, 6, 7, 8, 10).getClass(), listSerializer);
        kryo.register(IndexedLists.of(1, 2, 3, 4, 5, 6, 7, 8, 10, 11).getClass(), listSerializer);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public List read(Kryo kryo, Input input, Class<List> cls) {
        int readInt = input.readInt(true);
        Object[] objArr = new Object[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            objArr[i10] = kryo.readClassAndObject(input);
        }
        return IndexedLists.copyOf(objArr);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, List list) {
        output.writeInt(list.size(), true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kryo.writeClassAndObject(output, it.next());
        }
    }
}
