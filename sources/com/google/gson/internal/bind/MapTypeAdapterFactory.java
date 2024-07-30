package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import m8.a0;
import m8.b0;
import m8.i;
import m8.l;
import m8.n;
import m8.o;
import m8.p;
import m8.q;
import m8.u;
import o8.j;
import o8.s;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements b0 {

    /* renamed from: s, reason: collision with root package name */
    public final j f21334s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f21335t = false;

    /* loaded from: classes2.dex */
    public final class a<K, V> extends a0<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final h f21336a;

        /* renamed from: b, reason: collision with root package name */
        public final h f21337b;

        /* renamed from: c, reason: collision with root package name */
        public final s<? extends Map<K, V>> f21338c;

        public a(i iVar, Type type, a0<K> a0Var, Type type2, a0<V> a0Var2, s<? extends Map<K, V>> sVar) {
            this.f21336a = new h(iVar, a0Var, type);
            this.f21337b = new h(iVar, a0Var2, type2);
            this.f21338c = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m8.a0
        public final Object a(s8.a aVar) throws IOException {
            int f02 = aVar.f0();
            if (f02 == 9) {
                aVar.b0();
                return null;
            }
            Map<K, V> a10 = this.f21338c.a();
            h hVar = this.f21337b;
            h hVar2 = this.f21336a;
            if (f02 == 1) {
                aVar.b();
                while (aVar.l()) {
                    aVar.b();
                    Object a11 = hVar2.a(aVar);
                    if (a10.put(a11, hVar.a(aVar)) == null) {
                        aVar.f();
                    } else {
                        throw new u("duplicate key: " + a11);
                    }
                }
                aVar.f();
            } else {
                aVar.c();
                while (aVar.l()) {
                    c5.e.f3285u.getClass();
                    if (aVar instanceof b) {
                        b bVar = (b) aVar;
                        bVar.n0(5);
                        Map.Entry entry = (Map.Entry) ((Iterator) bVar.p0()).next();
                        bVar.r0(entry.getValue());
                        bVar.r0(new m8.s((String) entry.getKey()));
                    } else {
                        int i10 = aVar.f35272z;
                        if (i10 == 0) {
                            i10 = aVar.e();
                        }
                        if (i10 == 13) {
                            aVar.f35272z = 9;
                        } else if (i10 == 12) {
                            aVar.f35272z = 8;
                        } else if (i10 == 14) {
                            aVar.f35272z = 10;
                        } else {
                            throw new IllegalStateException("Expected a name but was " + com.ironsource.adapters.facebook.a.z(aVar.f0()) + aVar.P());
                        }
                    }
                    Object a12 = hVar2.a(aVar);
                    if (a10.put(a12, hVar.a(aVar)) != null) {
                        throw new u("duplicate key: " + a12);
                    }
                }
                aVar.g();
            }
            return a10;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Object obj) throws IOException {
            String str;
            boolean z10;
            Map map = (Map) obj;
            if (map == null) {
                bVar.j();
                return;
            }
            boolean z11 = MapTypeAdapterFactory.this.f21335t;
            h hVar = this.f21337b;
            if (!z11) {
                bVar.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.h(String.valueOf(entry.getKey()));
                    hVar.b(bVar, entry.getValue());
                }
                bVar.g();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z12 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                K key = entry2.getKey();
                h hVar2 = this.f21336a;
                hVar2.getClass();
                try {
                    c cVar = new c();
                    hVar2.b(cVar, key);
                    n a02 = cVar.a0();
                    arrayList.add(a02);
                    arrayList2.add(entry2.getValue());
                    a02.getClass();
                    if (!(a02 instanceof l) && !(a02 instanceof q)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 |= z10;
                } catch (IOException e10) {
                    throw new o(e10);
                }
            }
            if (z12) {
                bVar.c();
                int size = arrayList.size();
                while (i10 < size) {
                    bVar.c();
                    TypeAdapters.f21386z.b(bVar, (n) arrayList.get(i10));
                    hVar.b(bVar, arrayList2.get(i10));
                    bVar.f();
                    i10++;
                }
                bVar.f();
                return;
            }
            bVar.d();
            int size2 = arrayList.size();
            while (i10 < size2) {
                n nVar = (n) arrayList.get(i10);
                nVar.getClass();
                boolean z13 = nVar instanceof m8.s;
                if (z13) {
                    if (z13) {
                        m8.s sVar = (m8.s) nVar;
                        Serializable serializable = sVar.f32943s;
                        if (serializable instanceof Number) {
                            str = String.valueOf(sVar.n());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(sVar.e());
                        } else if (serializable instanceof String) {
                            str = sVar.m();
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Primitive: " + nVar);
                    }
                } else if (nVar instanceof p) {
                    str = "null";
                } else {
                    throw new AssertionError();
                }
                bVar.h(str);
                hVar.b(bVar, arrayList2.get(i10));
                i10++;
            }
            bVar.g();
        }
    }

    public MapTypeAdapterFactory(j jVar) {
        this.f21334s = jVar;
    }

    @Override // m8.b0
    public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
        Type[] typeArr;
        a0<T> a0Var;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type f = o8.a.f(type, rawType, Map.class);
            if (f instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) f).getActualTypeArguments();
            } else {
                typeArr = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = typeArr[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            a0Var = iVar.g(r8.a.get(type2));
        } else {
            a0Var = TypeAdapters.f21366c;
        }
        return new a(iVar, typeArr[0], a0Var, typeArr[1], iVar.g(r8.a.get(typeArr[1])), this.f21334s.b(aVar));
    }
}
