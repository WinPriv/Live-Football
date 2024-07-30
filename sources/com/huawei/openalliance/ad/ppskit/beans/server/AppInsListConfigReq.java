package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import android.content.SharedPreferences;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.handlers.g0;
import ma.a;
import ma.d;
import ma.g;

/* loaded from: classes2.dex */
public class AppInsListConfigReq extends ReqBean {
    private static final String TAG = "AppInsListConfigReq";

    @a
    private String insApps;
    private Integer reqType;

    @d(a = "SDKVerCode")
    private String sdkVerCode;

    @g
    private String sha256;

    public AppInsListConfigReq() {
    }

    public AppInsListConfigReq(Context context, Integer num) {
        String str;
        String string;
        this.reqType = num;
        g0 a10 = g0.a(context);
        synchronized (a10.f22543b) {
            try {
                SharedPreferences sharedPreferences = a10.f22542a;
                if (num != null) {
                    str = "SHA256_" + num;
                } else {
                    str = "SHA256";
                }
                string = sharedPreferences.getString(str, "");
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sha256 = string;
        this.sdkVerCode = String.valueOf(30465300);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "appInsListConfig";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_ppskit_config_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/sdkserver/appInsListConfig";
    }

    public final void e(String str) {
        this.insApps = str;
    }
}
