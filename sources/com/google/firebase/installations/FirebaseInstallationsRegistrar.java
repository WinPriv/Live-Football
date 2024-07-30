package com.google.firebase.installations;

import a8.g;
import a8.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k8.f;
import n7.e;
import r7.a;
import s7.b;
import s7.l;
import s7.u;
import t7.k;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static c lambda$getComponents$0(s7.c cVar) {
        return new b((e) cVar.a(e.class), cVar.b(h.class), (ExecutorService) cVar.d(new u(a.class, ExecutorService.class)), new k((Executor) cVar.d(new u(r7.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s7.b<?>> getComponents() {
        b.a a10 = s7.b.a(c.class);
        a10.f35218a = LIBRARY_NAME;
        a10.a(l.a(e.class));
        a10.a(new l(0, 1, h.class));
        a10.a(new l((u<?>) new u(a.class, ExecutorService.class), 1, 0));
        a10.a(new l((u<?>) new u(r7.b.class, Executor.class), 1, 0));
        a10.f = new com.applovin.exoplayer2.a.l(2);
        a0.a aVar = new a0.a();
        b.a a11 = s7.b.a(g.class);
        a11.f35222e = 1;
        a11.f = new s7.a(aVar);
        return Arrays.asList(a10.b(), a11.b(), f.a(LIBRARY_NAME, "17.1.4"));
    }
}
