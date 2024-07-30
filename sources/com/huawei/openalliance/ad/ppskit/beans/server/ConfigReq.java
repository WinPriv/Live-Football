package com.huawei.openalliance.ad.ppskit.beans.server;

import android.os.Build;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.utils.f0;
import com.huawei.openalliance.ad.ppskit.utils.m;
import java.util.Locale;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public abstract class ConfigReq extends ReqBean {
    private String androidApiVer;
    private String buildVer;
    private String emuiVer;
    private String magicUIVer;
    private String maker;
    private String model;

    @d(a = "ppsKitVersion")
    private String ppskitVersion = "3.4.65.300";

    public ConfigReq() {
        String C = m.C();
        this.model = C;
        if (C != null) {
            this.model = C.toUpperCase(Locale.ENGLISH);
        }
        this.emuiVer = f0.b("ro.build.version.emui");
        this.magicUIVer = f0.b("ro.build.version.magic");
        this.buildVer = m.D();
        this.androidApiVer = String.valueOf(Build.VERSION.SDK_INT);
        this.maker = Build.MANUFACTURER.toUpperCase(Locale.ENGLISH);
    }
}
