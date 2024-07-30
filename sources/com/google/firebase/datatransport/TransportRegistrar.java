package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k8.f;
import s7.b;
import s7.c;
import w3.b;
import w3.e;
import x3.a;
import z3.j;
import z3.l;
import z3.s;
import z3.t;
import z3.w;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static e lambda$getComponents$0(c cVar) {
        Set singleton;
        w.b((Context) cVar.a(Context.class));
        w a10 = w.a();
        a aVar = a.f36314e;
        a10.getClass();
        if (aVar instanceof l) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(a.f36313d);
        } else {
            singleton = Collections.singleton(new b("proto"));
        }
        j.a a11 = s.a();
        aVar.getClass();
        a11.b("cct");
        a11.f36945b = aVar.b();
        return new t(singleton, a11.a(), a10);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s7.b<?>> getComponents() {
        b.a a10 = s7.b.a(e.class);
        a10.f35218a = LIBRARY_NAME;
        a10.a(s7.l.a(Context.class));
        a10.f = new com.applovin.exoplayer2.a.l(1);
        return Arrays.asList(a10.b(), f.a(LIBRARY_NAME, "18.1.7"));
    }
}
