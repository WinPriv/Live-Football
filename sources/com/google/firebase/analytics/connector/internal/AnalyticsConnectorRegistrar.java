package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k8.f;
import n7.e;
import p7.a;
import p7.b;
import s7.b;
import s7.c;
import s7.l;
import z7.d;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        boolean z10;
        e eVar = (e) cVar.a(e.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (b.f34480b == null) {
            synchronized (b.class) {
                if (b.f34480b == null) {
                    Bundle bundle = new Bundle(1);
                    eVar.a();
                    if ("[DEFAULT]".equals(eVar.f33459b)) {
                        dVar.a(new Executor() { // from class: p7.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new z7.b() { // from class: p7.d
                            @Override // z7.b
                            public final void a(z7.a aVar) {
                                aVar.getClass();
                                throw null;
                            }
                        });
                        eVar.a();
                        h8.a aVar = eVar.f33463g.get();
                        synchronized (aVar) {
                            z10 = aVar.f28789b;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z10);
                    }
                    b.f34480b = new b(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return b.f34480b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<s7.b<?>> getComponents() {
        boolean z10;
        s7.b[] bVarArr = new s7.b[2];
        b.a a10 = s7.b.a(a.class);
        a10.a(l.a(e.class));
        a10.a(l.a(Context.class));
        a10.a(l.a(d.class));
        a10.f = q.e.f34518v;
        if (a10.f35221d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a10.f35221d = 2;
            bVarArr[0] = a10.b();
            bVarArr[1] = f.a("fire-analytics", "21.3.0");
            return Arrays.asList(bVarArr);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
