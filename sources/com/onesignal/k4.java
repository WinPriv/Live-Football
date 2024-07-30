package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.d4;
import com.onesignal.e3;

/* compiled from: PushRegistratorHMS.java */
/* loaded from: classes2.dex */
public final class k4 implements d4 {
    @Override // com.onesignal.d4
    public final void a(Context context, String str, e3.k kVar) {
        new Thread(new j4(this, context, kVar), "OS_HMS_GET_TOKEN").start();
    }

    public final synchronized void c(Context context, d4.a aVar) throws ApiException {
        if (!OSUtils.f()) {
            ((e3.k) aVar).a(-28, null);
            return;
        }
        String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString("client/app_id"), "HCM");
        if (!TextUtils.isEmpty(token)) {
            e3.a(5, "Device registered for HMS, push token = " + token);
            ((e3.k) aVar).a(1, token);
        } else {
            try {
                Thread.sleep(30000L);
            } catch (InterruptedException unused) {
            }
            e3.b(3, "HmsMessageServiceOneSignal.onNewToken timed out.", null);
            ((e3.k) aVar).a(-25, null);
        }
    }
}
