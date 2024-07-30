package m8;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import m8.b;
import m8.v;
import m8.x;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<r8.a<?>, a0<?>>> f32914a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f32915b;

    /* renamed from: c, reason: collision with root package name */
    public final o8.j f32916c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f32917d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b0> f32918e;
    public final Map<Type, k<?>> f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32919g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32920h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f32921i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f32922j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f32923k;

    /* renamed from: l, reason: collision with root package name */
    public final List<b0> f32924l;

    /* renamed from: m, reason: collision with root package name */
    public final List<b0> f32925m;

    /* renamed from: n, reason: collision with root package name */
    public final List<w> f32926n;

    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public static class a<T> extends com.google.gson.internal.bind.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public a0<T> f32927a = null;

        @Override // m8.a0
        public final T a(s8.a aVar) throws IOException {
            a0<T> a0Var = this.f32927a;
            if (a0Var != null) {
                return a0Var.a(aVar);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // m8.a0
        public final void b(s8.b bVar, T t10) throws IOException {
            a0<T> a0Var = this.f32927a;
            if (a0Var != null) {
                a0Var.b(bVar, t10);
                return;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.g
        public final a0<T> c() {
            a0<T> a0Var = this.f32927a;
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    public i() {
        this(Excluder.f21314x, b.f32910s, Collections.emptyMap(), true, true, v.f32944s, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), x.f32946s, x.f32947t, Collections.emptyList());
    }

    public static void a(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final Object b(Class cls, String str) throws u {
        return a0.a.Y0(cls).cast(d(str, r8.a.get(cls)));
    }

    public final <T> T c(String str, Type type) throws u {
        return (T) d(str, r8.a.get(type));
    }

    public final <T> T d(String str, r8.a<T> aVar) throws u {
        if (str == null) {
            return null;
        }
        s8.a aVar2 = new s8.a(new StringReader(str));
        aVar2.f35267t = this.f32923k;
        T t10 = (T) f(aVar2, aVar);
        if (t10 != null) {
            try {
                if (aVar2.f0() != 10) {
                    throw new u("JSON document was not fully consumed.");
                }
            } catch (s8.c e10) {
                throw new u(e10);
            } catch (IOException e11) {
                throw new o(e11);
            }
        }
        return t10;
    }

    public final <T> T e(n nVar, Class<T> cls) throws u {
        Object f;
        r8.a<T> aVar = r8.a.get((Class) cls);
        if (nVar == null) {
            f = null;
        } else {
            f = f(new com.google.gson.internal.bind.b(nVar), aVar);
        }
        return (T) a0.a.Y0(cls).cast(f);
    }

    public final <T> T f(s8.a aVar, r8.a<T> aVar2) throws o, u {
        boolean z10 = aVar.f35267t;
        boolean z11 = true;
        aVar.f35267t = true;
        try {
            try {
                try {
                    try {
                        try {
                            aVar.f0();
                            z11 = false;
                            T a10 = g(aVar2).a(aVar);
                            aVar.f35267t = z10;
                            return a10;
                        } catch (EOFException e10) {
                            if (z11) {
                                aVar.f35267t = z10;
                                return null;
                            }
                            throw new u(e10);
                        }
                    } catch (IllegalStateException e11) {
                        throw new u(e11);
                    }
                } catch (IOException e12) {
                    throw new u(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
            }
        } catch (Throwable th) {
            aVar.f35267t = z10;
            throw th;
        }
    }

    public final <T> a0<T> g(r8.a<T> aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f32915b;
        a0<T> a0Var = (a0) concurrentHashMap.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal<Map<r8.a<?>, a0<?>>> threadLocal = this.f32914a;
        Map<r8.a<?>, a0<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z10 = true;
        } else {
            a0<T> a0Var2 = (a0) map.get(aVar);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z10 = false;
        }
        try {
            a aVar2 = new a();
            map.put(aVar, aVar2);
            Iterator<b0> it = this.f32918e.iterator();
            a0<T> a0Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a0Var3 = it.next().a(this, aVar);
                if (a0Var3 != null) {
                    if (aVar2.f32927a == null) {
                        aVar2.f32927a = a0Var3;
                        map.put(aVar, a0Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (a0Var3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return a0Var3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } finally {
            if (z10) {
                threadLocal.remove();
            }
        }
    }

    public final <T> a0<T> h(b0 b0Var, r8.a<T> aVar) {
        List<b0> list = this.f32918e;
        if (!list.contains(b0Var)) {
            b0Var = this.f32917d;
        }
        boolean z10 = false;
        for (b0 b0Var2 : list) {
            if (!z10) {
                if (b0Var2 == b0Var) {
                    z10 = true;
                }
            } else {
                a0<T> a10 = b0Var2.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final s8.b i(Writer writer) throws IOException {
        if (this.f32920h) {
            writer.write(")]}'\n");
        }
        s8.b bVar = new s8.b(writer);
        if (this.f32922j) {
            bVar.f35276v = "  ";
            bVar.f35277w = ": ";
        }
        bVar.y = this.f32921i;
        bVar.f35278x = this.f32923k;
        bVar.A = this.f32919g;
        return bVar;
    }

    public final String j(Object obj) {
        if (obj == null) {
            n nVar = p.f32941s;
            StringWriter stringWriter = new StringWriter();
            try {
                m(nVar, i(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new o(e10);
            }
        }
        return k(obj, obj.getClass());
    }

    public final String k(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            l(obj, type, i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new o(e10);
        }
    }

    public final void l(Object obj, Type type, s8.b bVar) throws o {
        a0 g6 = g(r8.a.get(type));
        boolean z10 = bVar.f35278x;
        bVar.f35278x = true;
        boolean z11 = bVar.y;
        bVar.y = this.f32921i;
        boolean z12 = bVar.A;
        bVar.A = this.f32919g;
        try {
            try {
                try {
                    g6.b(bVar, obj);
                } catch (IOException e10) {
                    throw new o(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.f35278x = z10;
            bVar.y = z11;
            bVar.A = z12;
        }
    }

    public final void m(n nVar, s8.b bVar) throws o {
        boolean z10 = bVar.f35278x;
        bVar.f35278x = true;
        boolean z11 = bVar.y;
        bVar.y = this.f32921i;
        boolean z12 = bVar.A;
        bVar.A = this.f32919g;
        try {
            try {
                TypeAdapters.f21386z.b(bVar, nVar);
            } catch (IOException e10) {
                throw new o(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.f35278x = z10;
            bVar.y = z11;
            bVar.A = z12;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f32919g + ",factories:" + this.f32918e + ",instanceCreators:" + this.f32916c + "}";
    }

    public i(Excluder excluder, b.a aVar, Map map, boolean z10, boolean z11, v.a aVar2, List list, List list2, List list3, x.a aVar3, x.b bVar, List list4) {
        a0 fVar;
        b0 c10;
        this.f32914a = new ThreadLocal<>();
        this.f32915b = new ConcurrentHashMap();
        this.f = map;
        o8.j jVar = new o8.j(list4, map, z11);
        this.f32916c = jVar;
        this.f32919g = false;
        this.f32920h = false;
        this.f32921i = z10;
        this.f32922j = false;
        this.f32923k = false;
        this.f32924l = list;
        this.f32925m = list2;
        this.f32926n = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.A);
        arrayList.add(com.google.gson.internal.bind.e.c(aVar3));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f21377p);
        arrayList.add(TypeAdapters.f21369g);
        arrayList.add(TypeAdapters.f21367d);
        arrayList.add(TypeAdapters.f21368e);
        arrayList.add(TypeAdapters.f);
        if (aVar2 == v.f32944s) {
            fVar = TypeAdapters.f21373k;
        } else {
            fVar = new f();
        }
        arrayList.add(TypeAdapters.a(Long.TYPE, Long.class, fVar));
        arrayList.add(TypeAdapters.a(Double.TYPE, Double.class, new d()));
        arrayList.add(TypeAdapters.a(Float.TYPE, Float.class, new e()));
        if (bVar == x.f32947t) {
            c10 = com.google.gson.internal.bind.d.f21407b;
        } else {
            c10 = com.google.gson.internal.bind.d.c(bVar);
        }
        arrayList.add(c10);
        arrayList.add(TypeAdapters.f21370h);
        arrayList.add(TypeAdapters.f21371i);
        arrayList.add(TypeAdapters.b(AtomicLong.class, new z(new g(fVar))));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, new z(new h(fVar))));
        arrayList.add(TypeAdapters.f21372j);
        arrayList.add(TypeAdapters.f21374l);
        arrayList.add(TypeAdapters.f21378q);
        arrayList.add(TypeAdapters.f21379r);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f21375m));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f21376n));
        arrayList.add(TypeAdapters.b(o8.q.class, TypeAdapters.o));
        arrayList.add(TypeAdapters.f21380s);
        arrayList.add(TypeAdapters.f21381t);
        arrayList.add(TypeAdapters.f21383v);
        arrayList.add(TypeAdapters.f21384w);
        arrayList.add(TypeAdapters.y);
        arrayList.add(TypeAdapters.f21382u);
        arrayList.add(TypeAdapters.f21365b);
        arrayList.add(DateTypeAdapter.f21331b);
        arrayList.add(TypeAdapters.f21385x);
        if (com.google.gson.internal.sql.a.f21428a) {
            arrayList.add(com.google.gson.internal.sql.a.f21432e);
            arrayList.add(com.google.gson.internal.sql.a.f21431d);
            arrayList.add(com.google.gson.internal.sql.a.f);
        }
        arrayList.add(ArrayTypeAdapter.f21325c);
        arrayList.add(TypeAdapters.f21364a);
        arrayList.add(new CollectionTypeAdapterFactory(jVar));
        arrayList.add(new MapTypeAdapterFactory(jVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(jVar);
        this.f32917d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(jVar, aVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f32918e = Collections.unmodifiableList(arrayList);
    }
}
