package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import j7.i1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ReverseListSerializer extends Serializer<List<Object>> {
    private static final CollectionSerializer serializer = new CollectionSerializer();

    /* loaded from: classes2.dex */
    public static class RandomAccessReverseList extends ReverseListSerializer {
        private RandomAccessReverseList() {
        }

        @Override // de.javakaffee.kryoserializers.guava.ReverseListSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ List<Object> copy(Kryo kryo, List<Object> list) {
            return super.copy(kryo, list);
        }

        @Override // de.javakaffee.kryoserializers.guava.ReverseListSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, List<Object> list) {
            super.write(kryo, output, list);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List<Object> read(Kryo kryo, Input input, Class<List<Object>> cls) {
            return i1.c((List) ReverseListSerializer.serializer.read(kryo, input, ArrayList.class));
        }
    }

    /* loaded from: classes2.dex */
    public static class ReverseList extends ReverseListSerializer {
        private ReverseList() {
        }

        @Override // de.javakaffee.kryoserializers.guava.ReverseListSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ List<Object> copy(Kryo kryo, List<Object> list) {
            return super.copy(kryo, list);
        }

        @Override // de.javakaffee.kryoserializers.guava.ReverseListSerializer, com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, List<Object> list) {
            super.write(kryo, output, list);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List<Object> read(Kryo kryo, Input input, Class<List<Object>> cls) {
            return i1.c((List) ReverseListSerializer.serializer.read(kryo, input, LinkedList.class));
        }
    }

    public static ReverseListSerializer forRandomAccessReverseList() {
        return new RandomAccessReverseList();
    }

    public static ReverseListSerializer forReverseList() {
        return new ReverseList();
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(i1.c(new LinkedList()).getClass(), forReverseList());
        kryo.register(i1.c(new ArrayList()).getClass(), forRandomAccessReverseList());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public List<Object> copy(Kryo kryo, List<Object> list) {
        return i1.c((List) serializer.copy(kryo, (Collection) i1.c(list)));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, List<Object> list) {
        serializer.write(kryo, output, (Collection) i1.c(list));
    }
}
