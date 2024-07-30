package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.content.Context;
import android.os.Build;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.util.Locale;
import ka.Cif;
import ka.l;

@DataKeep
/* loaded from: classes2.dex */
public class KitDevice {
    private String agCountryCode;
    private String brand;
    private Integer emuiSdkInt;
    private String hmVer;
    private String language;
    private String os = "android";
    private String roLocale;
    private String roLocaleCountry;
    private String script;
    private Integer type;
    private String vendor;
    private String vendorCountry;
    private String verCodeOfAG;
    private String verCodeOfHms;
    private String verCodeOfHsf;
    private String version;

    public KitDevice(Context context) {
        l a10 = Cif.a(context);
        this.version = Build.VERSION.RELEASE;
        this.language = i2.c();
        this.script = Locale.getDefault().getScript();
        this.emuiSdkInt = a10.h();
        this.verCodeOfHsf = i2.n(context);
        this.verCodeOfHms = i2.p(context);
        this.verCodeOfAG = i2.r(context);
        this.agCountryCode = i2.s(context);
        this.roLocaleCountry = y1.v(z1.o(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP));
        this.roLocale = y1.v(z1.o(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP));
        this.vendorCountry = y1.v(a10.l());
        this.vendor = y1.v(a10.k());
        this.brand = z1.d(context);
        this.type = Integer.valueOf(m.a(context));
        this.hmVer = m.u(context);
    }
}
