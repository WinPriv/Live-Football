package com.google.firebase.messaging;

import a8.i;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k4.w;
import k8.f;
import k8.g;
import n7.e;
import s7.b;
import s7.l;
import z7.d;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(s7.c cVar) {
        return new FirebaseMessaging((e) cVar.a(e.class), (b8.a) cVar.a(b8.a.class), cVar.b(g.class), cVar.b(i.class), (d8.c) cVar.a(d8.c.class), (w3.e) cVar.a(w3.e.class), (d) cVar.a(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<s7.b<?>> getComponents() {
        boolean z10;
        s7.b[] bVarArr = new s7.b[2];
        b.a a10 = s7.b.a(FirebaseMessaging.class);
        a10.f35218a = LIBRARY_NAME;
        a10.a(l.a(e.class));
        a10.a(new l(0, 0, b8.a.class));
        a10.a(new l(0, 1, g.class));
        a10.a(new l(0, 1, i.class));
        a10.a(new l(0, 0, w3.e.class));
        a10.a(l.a(d8.c.class));
        a10.a(l.a(d.class));
        a10.f = new w(1);
        if (a10.f35221d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a10.f35221d = 1;
            bVarArr[0] = a10.b();
            bVarArr[1] = f.a(LIBRARY_NAME, "23.2.1");
            return Arrays.asList(bVarArr);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
