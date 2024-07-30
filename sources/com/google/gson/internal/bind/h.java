package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import m8.a0;
import m8.i;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes2.dex */
public final class h<T> extends a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final i f21419a;

    /* renamed from: b, reason: collision with root package name */
    public final a0<T> f21420b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f21421c;

    public h(i iVar, a0<T> a0Var, Type type) {
        this.f21419a = iVar;
        this.f21420b = a0Var;
        this.f21421c = type;
    }

    @Override // m8.a0
    public final T a(s8.a aVar) throws IOException {
        return this.f21420b.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if ((r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // m8.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(s8.b r5, T r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.f21421c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            m8.a0<T> r2 = r4.f21420b
            if (r1 == r0) goto L3c
            m8.i r0 = r4.f21419a
            r8.a r1 = r8.a.get(r1)
            m8.a0 r0 = r0.g(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r1 = r2
        L26:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.g
            if (r3 == 0) goto L36
            r3 = r1
            com.google.gson.internal.bind.g r3 = (com.google.gson.internal.bind.g) r3
            m8.a0 r3 = r3.c()
            if (r3 != r1) goto L34
            goto L36
        L34:
            r1 = r3
            goto L26
        L36:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r2.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.h.b(s8.b, java.lang.Object):void");
    }
}
