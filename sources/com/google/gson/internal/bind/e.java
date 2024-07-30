package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m8.a0;
import m8.b0;
import m8.i;
import m8.x;
import m8.y;
import o8.r;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes2.dex */
public final class e extends a0<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f21409c = new ObjectTypeAdapter$1(x.f32946s);

    /* renamed from: a, reason: collision with root package name */
    public final i f21410a;

    /* renamed from: b, reason: collision with root package name */
    public final y f21411b;

    public e(i iVar, y yVar) {
        this.f21410a = iVar;
        this.f21411b = yVar;
    }

    public static b0 c(x.a aVar) {
        if (aVar == x.f32946s) {
            return f21409c;
        }
        return new ObjectTypeAdapter$1(aVar);
    }

    public static Serializable e(s8.a aVar, int i10) throws IOException {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 2) {
                    return null;
                }
                aVar.c();
                return new r();
            }
            aVar.b();
            return new ArrayList();
        }
        throw null;
    }

    @Override // m8.a0
    public final Object a(s8.a aVar) throws IOException {
        String str;
        boolean z10;
        Serializable serializable;
        int f02 = aVar.f0();
        Object e10 = e(aVar, f02);
        if (e10 == null) {
            return d(aVar, f02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.l()) {
                if (e10 instanceof Map) {
                    str = aVar.Z();
                } else {
                    str = null;
                }
                int f03 = aVar.f0();
                Serializable e11 = e(aVar, f03);
                if (e11 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e11 == null) {
                    serializable = d(aVar, f03);
                } else {
                    serializable = e11;
                }
                if (e10 instanceof List) {
                    ((List) e10).add(serializable);
                } else {
                    ((Map) e10).put(str, serializable);
                }
                if (z10) {
                    arrayDeque.addLast(e10);
                    e10 = serializable;
                }
            } else {
                if (e10 instanceof List) {
                    aVar.f();
                } else {
                    aVar.g();
                }
                if (arrayDeque.isEmpty()) {
                    return e10;
                }
                e10 = arrayDeque.removeLast();
            }
        }
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.j();
            return;
        }
        Class<?> cls = obj.getClass();
        i iVar = this.f21410a;
        iVar.getClass();
        a0 g6 = iVar.g(r8.a.get((Class) cls));
        if (g6 instanceof e) {
            bVar.d();
            bVar.g();
        } else {
            g6.b(bVar, obj);
        }
    }

    public final Serializable d(s8.a aVar, int i10) throws IOException {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 == 8) {
                            aVar.b0();
                            return null;
                        }
                        throw new IllegalStateException("Unexpected token: ".concat(com.ironsource.adapters.facebook.a.z(i10)));
                    }
                    return Boolean.valueOf(aVar.Q());
                }
                return this.f21411b.a(aVar);
            }
            return aVar.d0();
        }
        throw null;
    }
}
