package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import android.text.TextUtils;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.KitDevice;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ka.n7;
import ma.a;
import ma.g;

@DataKeep
/* loaded from: classes2.dex */
public class KitConfigReq extends ConfigReq {
    private static final String TAG = "KitConfigReq";

    @a
    private KitDevice device;

    @a
    private String localeCountry;

    @a
    private String ppsKitVerCode;

    @a
    private String routerCountry;

    @a
    private String serCountry;

    @g
    private String sha256;

    @a
    private String simCountryIso;

    public KitConfigReq() {
        int lastIndexOf;
        String o = z1.o(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP);
        if (TextUtils.isEmpty(o)) {
            String o6 = z1.o(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP);
            if (TextUtils.isEmpty(o6) || (lastIndexOf = o6.lastIndexOf("-")) == -1) {
                o = z1.x();
                if (TextUtils.isEmpty(o)) {
                    o = "";
                }
            } else {
                o = o6.substring(lastIndexOf + 1);
            }
        }
        this.serCountry = o;
        this.localeCountry = z1.x();
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "ppsKitConfig";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_ppskit_config_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/sdkserver/ppsKitConfig";
    }

    public KitConfigReq(Context context) {
        this();
        String string;
        try {
            this.simCountryIso = z1.O(context);
            this.routerCountry = y1.v(a0.a.K(context).a());
            this.ppsKitVerCode = String.valueOf(30465300);
            this.device = new KitDevice(context);
            ConfigSpHandler b10 = ConfigSpHandler.b(context);
            synchronized (b10.f22478a) {
                string = b10.s().getString(ba.au, "");
            }
            this.sha256 = string;
        } catch (Throwable unused) {
            n7.g(TAG, "get kit config req exception");
        }
    }
}
