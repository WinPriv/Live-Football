package com.huawei.openalliance.ad.ppskit.beans.inner;

import android.content.Context;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.utils.m;
import java.util.Locale;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class HonorCountryCodeBean extends CountryCodeBean {
    private static final String TAG = "HonorCountryCodeBean";
    private static boolean isHonorGrsAvailable = n.L("com.hihonor.common.grs.HihonorGrsApp", "getIssueCountryCode", new Class[]{Context.class});

    @Override // com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean
    public final void b(Context context) {
        if (isHonorGrsAvailable && Cif.c(context) && !m.K(context)) {
            try {
                this.countryCode = new HonorGrsCountryCodeBean().a(context);
            } catch (Throwable th) {
                n7.h(TAG, "getIssueCountryCode via grs sdk: %s", th.getClass().getSimpleName());
            }
            this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
        }
        d(context);
        this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    }
}
