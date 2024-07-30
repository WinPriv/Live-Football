package com.google.firebase;

import a8.f;
import a8.h;
import a8.i;
import android.content.Context;
import android.os.Build;
import com.applovin.exoplayer2.b0;
import com.applovin.exoplayer2.d.w;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k8.d;
import k8.g;
import n7.e;
import r7.a;
import s7.b;
import s7.l;
import s7.u;
import s7.v;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        b.a a10 = b.a(g.class);
        a10.a(new l(2, 0, d.class));
        a10.f = new com.applovin.exoplayer2.a.l(3);
        arrayList.add(a10.b());
        final u uVar = new u(a.class, Executor.class);
        b.a aVar = new b.a(f.class, new Class[]{h.class, i.class});
        aVar.a(l.a(Context.class));
        aVar.a(l.a(e.class));
        aVar.a(new l(2, 0, a8.g.class));
        aVar.a(new l(1, 1, g.class));
        aVar.a(new l((u<?>) uVar, 1, 0));
        aVar.f = new s7.e() { // from class: a8.d
            @Override // s7.e
            public final Object d(v vVar) {
                return new f((Context) vVar.a(Context.class), ((n7.e) vVar.a(n7.e.class)).c(), vVar.e(u.a(g.class)), vVar.b(k8.g.class), (Executor) vVar.d(u.this));
            }
        };
        arrayList.add(aVar.b());
        arrayList.add(k8.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(k8.f.a("fire-core", "20.3.3"));
        arrayList.add(k8.f.a("device-name", a(Build.PRODUCT)));
        arrayList.add(k8.f.a("device-model", a(Build.DEVICE)));
        arrayList.add(k8.f.a("device-brand", a(Build.BRAND)));
        arrayList.add(k8.f.b("android-target-sdk", new b0(22)));
        arrayList.add(k8.f.b("android-min-sdk", new w(19)));
        arrayList.add(k8.f.b("android-platform", new com.applovin.exoplayer2.a.l(25)));
        arrayList.add(k8.f.b("android-installer", new e0.i()));
        try {
            str = uc.a.f35840w.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(k8.f.a("kotlin", str));
        }
        return arrayList;
    }
}
