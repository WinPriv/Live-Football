package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.g2;
import j7.i0;
import j7.r;
import j7.t0;
import j7.t2;
import j7.x1;
import java.util.EnumSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ImmutableSetSerializer extends Serializer<t0<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    /* loaded from: classes2.dex */
    public enum SomeEnum {
        A,
        B,
        C
    }

    public ImmutableSetSerializer() {
        super(false, true);
    }

    public static void registerSerializers(Kryo kryo) {
        ImmutableSetSerializer immutableSetSerializer = new ImmutableSetSerializer();
        kryo.register(t0.class, immutableSetSerializer);
        int i10 = t0.f30101u;
        Object obj = x1.B;
        kryo.register(obj.getClass(), immutableSetSerializer);
        new g2(1);
        kryo.register(g2.class, immutableSetSerializer);
        kryo.register(t0.G(1, 2, 3).getClass(), immutableSetSerializer);
        EnumSet of = EnumSet.of(SomeEnum.A, SomeEnum.B, SomeEnum.C);
        int i11 = i0.f29998x;
        int size = of.size();
        if (size != 0) {
            if (size != 1) {
                obj = new i0(of);
            } else {
                obj = new g2(r.C(of));
            }
        }
        kryo.register(obj.getClass(), immutableSetSerializer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.esotericsoftware.kryo.Serializer
    public t0<Object> read(Kryo kryo, Input input, Class<t0<Object>> cls) {
        int readInt = input.readInt(true);
        int i10 = t0.f30101u;
        t0.a aVar = new t0.a();
        for (int i11 = 0; i11 < readInt; i11++) {
            aVar.d(kryo.readClassAndObject(input));
        }
        int i12 = aVar.f29955b;
        if (i12 == 0) {
            return x1.B;
        }
        if (i12 != 1) {
            t0<Object> C = t0.C(i12, aVar.f29954a);
            aVar.f29955b = C.size();
            aVar.f29956c = true;
            return C;
        }
        Object obj = aVar.f29954a[0];
        Objects.requireNonNull(obj);
        return new g2(obj);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, t0<Object> t0Var) {
        output.writeInt(t0Var.size(), true);
        t2<Object> it = t0Var.iterator();
        while (it.hasNext()) {
            kryo.writeClassAndObject(output, it.next());
        }
    }
}
