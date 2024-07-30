package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.applovin.impl.sdk.a0;
import com.huawei.openalliance.ad.constant.av;
import f4.e;
import f4.h;
import j4.a;
import z3.j;
import z3.s;
import z3.w;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19903a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(av.K);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        w.b(context);
        j.a a10 = s.a();
        a10.b(queryParameter);
        a10.c(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f36945b = Base64.decode(queryParameter2, 0);
        }
        h hVar = w.a().f36971d;
        j a11 = a10.a();
        a0 a0Var = new a0(1);
        hVar.getClass();
        hVar.f28093e.execute(new e(hVar, a11, i10, a0Var));
    }
}
