package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class j implements m {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f31312s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final Context f31313t;

    public j(Context context) {
        this.f31313t = context.getApplicationContext().createDeviceProtectedStorageContext();
    }

    @Override // ka.m
    public final String a() {
        switch (this.f31312s) {
            case 0:
                String str = ServerConfig.f22801b;
                boolean equalsIgnoreCase = "CN".equalsIgnoreCase(str);
                n7.c("NoGrsImpl", "init country code: %s ", str);
                if ((Cif.c(this.f31313t) || !equalsIgnoreCase) && (TextUtils.isEmpty(str) || CountryCodeBean.COUNTRYCODE_OVERSEAS.equalsIgnoreCase(str))) {
                    str = new CountryCodeBean(this.f31313t).a();
                }
                return str.toUpperCase(Locale.ENGLISH);
            default:
                return this.f31313t.getSharedPreferences("pps_recommendation", 4).getString("ads_brain_switch", "");
        }
    }

    @Override // ka.m
    public final String a(Context context, String str, String str2, String str3, String str4) {
        return null;
    }

    @Override // ka.m
    public final String a(String str, String str2) {
        return null;
    }
}
