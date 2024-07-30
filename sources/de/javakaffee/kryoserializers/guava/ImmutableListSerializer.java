package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import i7.f;
import j7.d0;
import j7.f0;
import j7.h2;
import j7.i1;
import j7.j0;
import j7.j2;
import j7.n2;
import j7.p2;
import j7.r;
import j7.t0;
import j7.v1;
import j7.w;
import j7.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class ImmutableListSerializer extends Serializer<j0<Object>> {
    private static final boolean DOES_NOT_ACCEPT_NULL = false;
    private static final boolean IMMUTABLE = true;

    public ImmutableListSerializer() {
        super(false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void registerSerializers(Kryo kryo) {
        w0 w0Var;
        w0 j2Var;
        ImmutableListSerializer immutableListSerializer = new ImmutableListSerializer();
        kryo.register(j0.class, immutableListSerializer);
        j0.b bVar = j0.f30006t;
        v1 v1Var = v1.f30113w;
        kryo.register(v1Var.getClass(), immutableListSerializer);
        kryo.register(j0.G(1).getClass(), immutableListSerializer);
        Object[] objArr = {1, 2, 3};
        f0.a(3, objArr);
        kryo.register(j0.B(3, objArr).subList(1, 2).getClass(), immutableListSerializer);
        kryo.register(v1Var.H().getClass(), immutableListSerializer);
        new i1.c("KryoRocks");
        kryo.register(i1.c.class, immutableListSerializer);
        d0 d0Var = new d0(new LinkedHashMap(), new d0.a());
        d0Var.w(1, 2, 3);
        d0Var.w(4, 5, 6);
        if (d0Var instanceof w0) {
            w0Var = (w0) d0Var;
        } else {
            Set<n2.a> k10 = d0Var.k();
            ArrayList arrayList = new ArrayList();
            for (n2.a aVar : k10) {
                if (aVar instanceof p2) {
                    f.c(aVar.p(), "row");
                    f.c(aVar.k(), "column");
                    f.c(aVar.getValue(), "value");
                    arrayList.add(aVar);
                } else {
                    arrayList.add(w0.w(aVar.p(), aVar.k(), aVar.getValue()));
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    j0 C = j0.C(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n2.a aVar2 = (n2.a) it.next();
                        linkedHashSet.add(aVar2.p());
                        linkedHashSet2.add(aVar2.k());
                    }
                    t0 D = t0.D(linkedHashSet);
                    t0 D2 = t0.D(linkedHashSet2);
                    if (C.size() > (D.size() * D2.size()) / 2) {
                        j2Var = new w(C, D, D2);
                    } else {
                        j2Var = new j2(C, D, D2);
                    }
                    w0Var = j2Var;
                } else {
                    w0Var = new h2((n2.a) r.C(arrayList));
                }
            } else {
                w0Var = j2.f30012x;
            }
        }
        kryo.register(w0Var.F().getClass(), immutableListSerializer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.esotericsoftware.kryo.Serializer
    public j0<Object> read(Kryo kryo, Input input, Class<j0<Object>> cls) {
        int readInt = input.readInt(true);
        Object[] objArr = new Object[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            objArr[i10] = kryo.readClassAndObject(input);
        }
        return j0.D(objArr);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, j0<Object> j0Var) {
        output.writeInt(j0Var.size(), true);
        j0.b listIterator = j0Var.listIterator(0);
        while (listIterator.hasNext()) {
            kryo.writeClassAndObject(output, listIterator.next());
        }
    }
}
