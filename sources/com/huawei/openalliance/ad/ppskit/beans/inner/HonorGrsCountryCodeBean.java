package com.huawei.openalliance.ad.ppskit.beans.inner;

import android.content.Context;
import com.hihonor.common.grs.HihonorGrsApp;
import java.security.InvalidParameterException;
import ka.n7;

/* loaded from: classes2.dex */
public class HonorGrsCountryCodeBean {
    private static final String TAG = "HonorGrsCountryCodeBean";
    private static final String UNKNOWN = "UNKNOWN";
    private String countryCode = "UNKNOWN";

    public final String a(Context context) {
        try {
            String issueCountryCode = HihonorGrsApp.getInstance().getIssueCountryCode(context);
            this.countryCode = issueCountryCode;
            return issueCountryCode;
        } catch (Throwable th) {
            n7.h(TAG, "getIssueCountryCode via grs sdk: %s", th.getClass().getSimpleName());
            throw new InvalidParameterException();
        }
    }
}
