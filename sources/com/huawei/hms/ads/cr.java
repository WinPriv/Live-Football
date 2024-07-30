package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.hihonor.android.util.HwNotchSizeUtil;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import gb.c0;
import gb.m;

/* loaded from: classes2.dex */
public class cr extends co {
    private static final String B = "true";
    private static final String C = "156";
    private static final String I = "HnDeviceImpl";
    private static final byte[] S = new byte[0];
    private static cw Z;

    private cr(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F() {
        String V = V("msc.build.platform.version");
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
        synchronized (S) {
            if (Z == null) {
                Z = new cr(context);
            }
            cwVar = Z;
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
        return gb.u.d(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN);
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
        return "true".equalsIgnoreCase(gb.u.d("msc.pure_mode.enable"));
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
            c0.c(new Runnable() { // from class: com.huawei.hms.ads.cr.1
                @Override // java.lang.Runnable
                public void run() {
                    cr.this.F();
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
    public boolean Code() {
        return C.equals(gb.u.d("msc.config.optb"));
    }
}
