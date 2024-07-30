package com.google.gson.internal.bind;

import java.io.IOException;
import m8.a0;
import m8.b0;
import m8.i;
import m8.u;
import m8.x;
import m8.y;

/* compiled from: NumberTypeAdapter.java */
/* loaded from: classes2.dex */
public final class d extends a0<Number> {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f21407b = c(x.f32947t);

    /* renamed from: a, reason: collision with root package name */
    public final y f21408a;

    public d(x.b bVar) {
        this.f21408a = bVar;
    }

    public static b0 c(x.b bVar) {
        final d dVar = new d(bVar);
        return new b0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // m8.b0
            public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
                if (aVar.getRawType() == Number.class) {
                    return d.this;
                }
                return null;
            }
        };
    }

    @Override // m8.a0
    public final Number a(s8.a aVar) throws IOException {
        int f02 = aVar.f0();
        int c10 = s.f.c(f02);
        if (c10 != 5 && c10 != 6) {
            if (c10 == 8) {
                aVar.b0();
                return null;
            }
            throw new u("Expecting number, got: " + com.ironsource.adapters.facebook.a.z(f02) + "; at path " + aVar.i());
        }
        return this.f21408a.a(aVar);
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Number number) throws IOException {
        bVar.S(number);
    }
}
