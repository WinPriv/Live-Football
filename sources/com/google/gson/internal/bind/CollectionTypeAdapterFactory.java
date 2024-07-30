package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import m8.a0;
import m8.b0;
import m8.i;
import o8.j;
import o8.s;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements b0 {

    /* renamed from: s, reason: collision with root package name */
    public final j f21328s;

    /* loaded from: classes2.dex */
    public static final class a<E> extends a0<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final h f21329a;

        /* renamed from: b, reason: collision with root package name */
        public final s<? extends Collection<E>> f21330b;

        public a(i iVar, Type type, a0<E> a0Var, s<? extends Collection<E>> sVar) {
            this.f21329a = new h(iVar, a0Var, type);
            this.f21330b = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m8.a0
        public final Object a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            Collection<E> a10 = this.f21330b.a();
            aVar.b();
            while (aVar.l()) {
                a10.add(this.f21329a.a(aVar));
            }
            aVar.f();
            return a10;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.j();
                return;
            }
            bVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f21329a.b(bVar, it.next());
            }
            bVar.f();
        }
    }

    public CollectionTypeAdapterFactory(j jVar) {
        this.f21328s = jVar;
    }

    @Override // m8.b0
    public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
        Type type;
        Type type2 = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type f = o8.a.f(type2, rawType, Collection.class);
        if (f instanceof ParameterizedType) {
            type = ((ParameterizedType) f).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(iVar, type, iVar.g(r8.a.get(type)), this.f21328s.b(aVar));
    }
}
