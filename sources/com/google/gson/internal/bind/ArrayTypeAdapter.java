package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import m8.a0;
import m8.b0;
import m8.i;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends a0<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f21325c = new b0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // m8.b0
        public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
            Type componentType;
            Type type = aVar.getType();
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z10) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new ArrayTypeAdapter(iVar, iVar.g(r8.a.get(componentType)), o8.a.e(componentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f21326a;

    /* renamed from: b, reason: collision with root package name */
    public final h f21327b;

    public ArrayTypeAdapter(i iVar, a0<E> a0Var, Class<E> cls) {
        this.f21327b = new h(iVar, a0Var, cls);
        this.f21326a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m8.a0
    public final Object a(s8.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.l()) {
            arrayList.add(this.f21327b.a(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        Class<E> cls = this.f21326a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) cls, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.j();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f21327b.b(bVar, Array.get(obj, i10));
        }
        bVar.f();
    }
}
