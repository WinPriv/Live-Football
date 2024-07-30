package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.android.util.HwNotchSizeUtil;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import gb.c0;
import gb.g0;
import gb.m;

/* loaded from: classes2.dex */
public class ct extends co {
    private static final String B = "display_notch_status";
    private static final int C = 0;
    private static final byte[] D = new byte[0];
    private static cw F = null;
    private static final String I = "HwDeviceImpl";
    private static final String S = "true";
    private static final String Z = "156";

    private ct(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F() {
        String V = V("hw_sc.build.platform.version");
        gb.m mVar = this.V;
        synchronized (mVar.f28595b) {
            mVar.g();
            m.b bVar = mVar.f28596c;
            bVar.f28602v = V;
            mVar.c(bVar);
        }
        return V;
    }

    private static cw I(Context context) {
        cw cwVar;
        synchronized (D) {
            if (F == null) {
                F = new ct(context);
            }
            cwVar = F;
        }
        return cwVar;
    }

    public static cw V(Context context) {
        return I(context);
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean B() {
        return !TextUtils.isEmpty(Z());
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public String C() {
        return gb.u.d(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP);
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public int Code(View view) {
        try {
            if (!HwNotchSizeUtil.hasNotchInScreen()) {
                return 0;
            }
            int[] notchSize = HwNotchSizeUtil.getNotchSize();
            if (notchSize.length >= 2) {
                return notchSize[1];
            }
            return 0;
        } catch (Exception e10) {
            e0.i.q(e10, "getNotchHeight error:", I);
            return 0;
        }
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean S() {
        return "true".equalsIgnoreCase(gb.u.d("hw_mc.pure_mode.enable"));
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public String Z() {
        String str;
        gb.m mVar = this.V;
        synchronized (mVar.f28595b) {
            mVar.g();
            str = mVar.f28596c.f28602v;
        }
        if (TextUtils.isEmpty(str)) {
            str = F();
        } else {
            c0.c(new Runnable() { // from class: com.huawei.hms.ads.ct.1
                @Override // java.lang.Runnable
                public void run() {
                    ct.this.F();
                }
            });
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, str)) {
            return null;
        }
        return str;
    }

    private String V(String str) {
        String d10 = gb.u.d(str);
        return d10 == null ? com.huawei.openalliance.ad.constant.w.aU : d10;
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean I() {
        boolean booleanValue;
        Context context = this.Code;
        gb.m b10 = gb.m.b(context);
        synchronized (b10.f28595b) {
            b10.g();
            Boolean bool = b10.f28596c.f28600t;
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        c0.c(new g0(context, b10));
        return booleanValue;
    }

    @Override // com.huawei.hms.ads.cn, com.huawei.hms.ads.cw
    public boolean Code() {
        return Z.equals(gb.u.d("ro.config.hw_optb"));
    }
}
