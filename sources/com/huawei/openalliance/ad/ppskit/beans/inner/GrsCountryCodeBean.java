package com.huawei.openalliance.ad.ppskit.beans.inner;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import k4.h0;
import ka.n7;

/* loaded from: classes2.dex */
public class GrsCountryCodeBean {
    private static final String TAG = "GrsCountryCodeBean";
    private static final String UNKNOWN = "UNKNOWN";
    private String countryCode = "UNKNOWN";

    public final String a(Context context) {
        try {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(context);
            this.countryCode = issueCountryCode;
            return issueCountryCode;
        } catch (Throwable th) {
            n7.h(TAG, "getIssueCountryCode via grs sdk: %s", th.getClass().getSimpleName());
            throw new h0();
        }
    }
}
