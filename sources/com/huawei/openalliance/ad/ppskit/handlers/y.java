package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import ka.s4;
import ka.u4;

/* loaded from: classes2.dex */
public final class y extends c0 {
    public y(Context context) {
        super(context);
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.c0
    public final /* bridge */ /* synthetic */ String e() {
        return "BfeDao";
    }

    @Override // com.huawei.openalliance.ad.ppskit.handlers.c0
    public final u4 m() {
        s4 s4Var;
        Context context = this.f22513b;
        synchronized (s4.f31792v) {
            if (s4.f31791u == null) {
                s4.f31791u = new s4(context.getApplicationContext().createDeviceProtectedStorageContext());
            }
            u4.f31924t.incrementAndGet();
            s4Var = s4.f31791u;
        }
        return s4Var;
    }
}
