package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.j0;
import j7.t1;
import j7.t2;
import j7.u0;
import j7.y1;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class ImmutableSortedSetSerializer extends Serializer<u0<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    public ImmutableSortedSetSerializer() {
        super(false, true);
    }

    public static void registerSerializers(Kryo kryo) {
        ImmutableSortedSetSerializer immutableSortedSetSerializer = new ImmutableSortedSetSerializer();
        kryo.register(u0.class, immutableSortedSetSerializer);
        int i10 = u0.f30105x;
        y1<Comparable> y1Var = y1.f30149z;
        kryo.register(y1Var.getClass(), immutableSortedSetSerializer);
        new y1(j0.G(""), t1.f30103s);
        kryo.register(y1.class, immutableSortedSetSerializer);
        u0 u0Var = y1Var.f30107w;
        if (u0Var == null) {
            u0Var = y1Var.H();
            y1Var.f30107w = u0Var;
            u0Var.f30107w = y1Var;
        }
        kryo.register(u0Var.getClass(), immutableSortedSetSerializer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.esotericsoftware.kryo.Serializer
    public u0<Object> read(Kryo kryo, Input input, Class<u0<Object>> cls) {
        Comparator comparator = (Comparator) kryo.readClassAndObject(input);
        int i10 = u0.f30105x;
        u0.a aVar = new u0.a(comparator);
        int readInt = input.readInt(true);
        for (int i11 = 0; i11 < readInt; i11++) {
            aVar.e(kryo.readClassAndObject(input));
        }
        return aVar.f();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, u0<Object> u0Var) {
        kryo.writeClassAndObject(output, u0Var.f30106v);
        output.writeInt(u0Var.size(), true);
        t2<Object> it = u0Var.iterator();
        while (it.hasNext()) {
            kryo.writeClassAndObject(output, it.next());
        }
    }
}
