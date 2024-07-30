package com.huawei.hms.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import java.util.Locale;

/* loaded from: classes2.dex */
public class co extends cn {
    private static final int B = 0;
    private static final String I = "BaseHwnDeviceImpl";
    private static final String Z = "display_notch_status";

    public co(Context context) {
        super(context);
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean Code(Context context) {
        try {
            int i10 = Settings.Secure.getInt(context.getContentResolver(), Z);
            ex.Code(I, "isNotchEnable, displayNotch: %s", Integer.valueOf(i10));
            if (i10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ex.V(I, "isNotchEnable err:".concat(th.getClass().getSimpleName()));
            if (Build.VERSION.SDK_INT >= 26 && Code((View) null) > 0) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean V() {
        String str;
        String d10 = gb.u.d(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(d10)) {
            return "cn".equalsIgnoreCase(d10);
        }
        String d11 = gb.u.d(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(d11)) {
            return d11.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str = locale.getCountry();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return "cn".equalsIgnoreCase(str);
        }
        return false;
    }
}
