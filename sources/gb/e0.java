package gb;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public String f28579a;

    public e0(Context context) {
        String str;
        this.f28579a = "UNKNOWN";
        if (context != null) {
            try {
                a(context);
                if (!"UNKNOWN".equals(this.f28579a)) {
                    str = "get issue_country code from VENDOR_COUNTRY";
                } else {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                    if (telephonyManager != null) {
                        this.f28579a = telephonyManager.getSimCountryIso();
                    }
                    String str2 = this.f28579a;
                    if (str2 == null || str2.length() != 2) {
                        this.f28579a = "UNKNOWN";
                    }
                    if (!"UNKNOWN".equals(this.f28579a)) {
                        str = "get issue_country code from SIM_COUNTRY";
                    } else if (h0.a(context)) {
                        str = "pad skip locale get issue_country code from grs ip";
                    } else {
                        b();
                        if (!"UNKNOWN".equals(this.f28579a)) {
                            str = "get issue_country code from LOCALE_INFO";
                        }
                    }
                }
                ex.V("CountryCodeBean", str);
            } catch (Throwable unused) {
                ex.I("CountryCodeBean", "get CountryCode error");
            }
        }
        this.f28579a = this.f28579a.toUpperCase(Locale.ENGLISH);
    }

    public final void a(Context context) {
        String str;
        if (cl.Z(context)) {
            str = CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN;
        } else {
            str = CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP;
        }
        String d10 = u.d(str);
        this.f28579a = d10;
        String str2 = "UNKNOWN";
        if (!"eu".equalsIgnoreCase(d10) && !"la".equalsIgnoreCase(this.f28579a)) {
            if ("uk".equalsIgnoreCase(this.f28579a)) {
                str2 = "gb";
            } else {
                String str3 = this.f28579a;
                if (str3 == null || str3.length() != 2) {
                    this.f28579a = "UNKNOWN";
                    return;
                }
                return;
            }
        }
        this.f28579a = str2;
    }

    public final void b() {
        int lastIndexOf;
        if (Build.VERSION.SDK_INT >= 28) {
            String country = Locale.getDefault().getCountry();
            this.f28579a = country;
            if (TextUtils.isEmpty(country)) {
                this.f28579a = "UNKNOWN";
                return;
            }
            return;
        }
        String d10 = u.d(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP);
        this.f28579a = d10;
        if (TextUtils.isEmpty(d10)) {
            String d11 = u.d(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP);
            if (!TextUtils.isEmpty(d11) && (lastIndexOf = d11.lastIndexOf("-")) != -1) {
                this.f28579a = d11.substring(lastIndexOf + 1);
            }
        }
        if (!"cn".equalsIgnoreCase(this.f28579a)) {
            this.f28579a = "UNKNOWN";
        }
    }
}
