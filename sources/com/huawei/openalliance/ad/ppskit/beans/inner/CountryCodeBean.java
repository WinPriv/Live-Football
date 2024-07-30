package com.huawei.openalliance.ad.ppskit.beans.inner;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.utils.e;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class CountryCodeBean {
    public static final String COUNTRYCODE_CN = "CN";
    public static final String COUNTRYCODE_OVERSEAS = "OVERSEAS";
    private static final int COUNTRYCODE_SIZE = 2;
    public static final String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final String LOCALE_INFO = "LOCALE_INFO";
    public static final String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    public static final String OVERSEA = "OVERSEA";
    private static final String SIM_COUNTRY = "SIM_COUNTRY";
    private static final String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final String SPECIAL_COUNTRYCODE_LA = "la";
    private static final String TAG = "CountryCodeBean";
    public static final String UNKNOWN = "UNKNOWN";
    public static final String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    public static final String VENDORCOUNTRY_SYSTEMPROP_HN = "msc.sys.country";
    private static final String VENDOR_COUNTRY = "VENDOR_COUNTRY";
    public static final String VENDOR_SYSTEMPROP = "ro.hw.vendor";
    public static final String VENDOR_SYSTEMPROP_HN = "msc.sys.vendor";
    private static boolean isGrsAvailable = n.L("com.huawei.hms.framework.network.grs.GrsApp", "getIssueCountryCode", new Class[]{Context.class});
    protected volatile String countryCode = "UNKNOWN";

    public CountryCodeBean(Context context) {
        if (context != null) {
            b(context.getApplicationContext());
        }
    }

    public final String a() {
        return this.countryCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r6) {
        /*
            r5 = this;
            boolean r0 = com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean.isGrsAvailable
            r1 = 0
            java.lang.String r2 = "CountryCodeBean"
            r3 = 1
            if (r0 == 0) goto L32
            boolean r0 = ka.Cif.c(r6)
            if (r0 == 0) goto L32
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.m.K(r6)
            if (r0 != 0) goto L32
            com.huawei.openalliance.ad.ppskit.beans.inner.GrsCountryCodeBean r0 = new com.huawei.openalliance.ad.ppskit.beans.inner.GrsCountryCodeBean     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.a(r6)     // Catch: java.lang.Throwable -> L20
            r5.countryCode = r0     // Catch: java.lang.Throwable -> L20
            goto L35
        L20:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r4[r1] = r0
            java.lang.String r0 = "getIssueCountryCode via grs sdk: %s"
            ka.n7.h(r2, r0, r4)
        L32:
            r5.d(r6)
        L35:
            java.lang.String r0 = r5.countryCode
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r4)
            r5.countryCode = r0
            android.content.Context r6 = r6.getApplicationContext()
            r6.createDeviceProtectedStorageContext()
            r6 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L58
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r6
            java.lang.String r1 = "use pile countryCode: %s"
            ka.n7.f(r2, r1, r0)
            r5.countryCode = r6
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean.b(android.content.Context):void");
    }

    public final void c(Context context) {
        String str;
        try {
            if (Cif.f(context)) {
                str = VENDORCOUNTRY_SYSTEMPROP_HN;
            } else {
                str = VENDORCOUNTRY_SYSTEMPROP;
            }
            this.countryCode = z1.o(str);
            if (this.countryCode == null) {
                this.countryCode = "UNKNOWN";
            }
            if (!SPECIAL_COUNTRYCODE_EU.equalsIgnoreCase(this.countryCode) && !SPECIAL_COUNTRYCODE_LA.equalsIgnoreCase(this.countryCode)) {
                if (e.f22838e.contains(y1.v(this.countryCode))) {
                    if (this.countryCode == null || this.countryCode.length() != 2) {
                        this.countryCode = "UNKNOWN";
                        return;
                    }
                    return;
                }
            }
            this.countryCode = "UNKNOWN";
        } catch (Throwable unused) {
            n7.g(TAG, "get getVendorCountryCode error");
        }
    }

    public final void d(Context context) {
        if (context != null) {
            try {
                if (Cif.d(context) && Cif.a(context).d()) {
                    this.countryCode = "CN";
                    n7.e(TAG, "getCountryCode get country code from chinaROM");
                    return;
                }
                if (Cif.c(context)) {
                    c(context);
                    if (!"UNKNOWN".equals(this.countryCode)) {
                        n7.e(TAG, "get issue_country code from VENDOR_COUNTRY");
                        return;
                    }
                }
                e(context);
                if (!"UNKNOWN".equals(this.countryCode)) {
                    n7.e(TAG, "get issue_country code from SIM_COUNTRY");
                    return;
                }
                if (m.K(context)) {
                    n7.e(TAG, "pad skip locale get issue_country code from grs ip");
                    return;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        this.countryCode = z1.x();
                        if (TextUtils.isEmpty(this.countryCode)) {
                            this.countryCode = "UNKNOWN";
                        }
                    } else {
                        f();
                    }
                } catch (Throwable unused) {
                    n7.g(TAG, "get getLocaleCountryCode error");
                }
                if (!"UNKNOWN".equals(this.countryCode)) {
                    n7.e(TAG, "get issue_country code from LOCALE_INFO");
                    return;
                } else {
                    n7.g(TAG, "fail to get grs countryCode");
                    return;
                }
            } catch (Throwable unused2) {
                n7.g(TAG, "get CountryCode error");
                return;
            }
        }
        throw new NullPointerException("context must be not null.Please provide app's Context");
    }

    public final void e(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            if (telephonyManager != null) {
                this.countryCode = telephonyManager.getSimCountryIso();
                n7.e(TAG, "countryCode by SimCountryIso is: " + this.countryCode);
            }
            if (this.countryCode == null || this.countryCode.length() != 2) {
                this.countryCode = "UNKNOWN";
            }
        } catch (Throwable unused) {
            n7.g(TAG, "get getSimCountryCode error");
        }
    }

    public final void f() {
        int lastIndexOf;
        try {
            this.countryCode = z1.o(LOCALE_REGION_COUNTRYSYSTEMPROP);
            n7.e(TAG, "countryCode by ro.product.locale.region is:" + this.countryCode);
            if (TextUtils.isEmpty(this.countryCode) || "UNKNOWN".equals(this.countryCode)) {
                String o = z1.o(LOCALE_COUNTRYSYSTEMPROP);
                if (!TextUtils.isEmpty(o) && (lastIndexOf = o.lastIndexOf("-")) != -1) {
                    this.countryCode = o.substring(lastIndexOf + 1);
                    n7.e(TAG, "countryCode by ro.product.locale is:" + this.countryCode);
                }
            }
            if (!SPECIAL_COUNTRYCODE_CN.equalsIgnoreCase(this.countryCode)) {
                this.countryCode = "UNKNOWN";
            }
        } catch (Throwable unused) {
            n7.g(TAG, "get getProductCountryCode error");
        }
    }
}
