package com.google.gson.internal.bind;

import m8.a0;
import m8.b0;
import m8.i;
import m8.m;
import m8.t;
import m8.z;
import o8.j;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements b0 {

    /* renamed from: s, reason: collision with root package name */
    public final j f21333s;

    public JsonAdapterAnnotationTypeAdapterFactory(j jVar) {
        this.f21333s = jVar;
    }

    public static a0 b(j jVar, i iVar, r8.a aVar, n8.a aVar2) {
        t tVar;
        m mVar;
        a0 treeTypeAdapter;
        Object a10 = jVar.b(r8.a.get((Class) aVar2.value())).a();
        boolean nullSafe = aVar2.nullSafe();
        if (a10 instanceof a0) {
            treeTypeAdapter = (a0) a10;
        } else if (a10 instanceof b0) {
            treeTypeAdapter = ((b0) a10).a(iVar, aVar);
        } else {
            boolean z10 = a10 instanceof t;
            if (!z10 && !(a10 instanceof m)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            if (z10) {
                tVar = (t) a10;
            } else {
                tVar = null;
            }
            if (a10 instanceof m) {
                mVar = (m) a10;
            } else {
                mVar = null;
            }
            treeTypeAdapter = new TreeTypeAdapter(tVar, mVar, iVar, aVar, nullSafe);
            nullSafe = false;
        }
        if (treeTypeAdapter != null && nullSafe) {
            return new z(treeTypeAdapter);
        }
        return treeTypeAdapter;
    }

    @Override // m8.b0
    public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
        n8.a aVar2 = (n8.a) aVar.getRawType().getAnnotation(n8.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f21333s, iVar, aVar, aVar2);
    }
}
