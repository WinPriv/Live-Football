package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public class ErrorBuilder {
    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, com.ironsource.adapters.facebook.a.h(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, com.ironsource.adapters.facebook.a.h(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str);
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        String f;
        if (TextUtils.isEmpty(str)) {
            f = com.ironsource.adapters.facebook.a.h(str2, " init failed due to an unknown error");
        } else {
            f = e0.i.f(str2, " - ", str);
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, f);
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, com.ironsource.adapters.facebook.a.h(str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        String str4;
        StringBuilder o = a3.k.o("Init Fail - ", str, " value ", str2, " is not valid");
        if (!TextUtils.isEmpty(str3)) {
            str4 = s.f.b(" - ", str3);
        } else {
            str4 = "";
        }
        o.append(str4);
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, o.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder("Mediation - ");
            sb2.append(str);
            sb2.append(" value is not valid for ");
            sb2.append(str2);
            if (!TextUtils.isEmpty(str3)) {
                str4 = s.f.b(" - ", str3);
            } else {
                str4 = "";
            }
            sb2.append(str4);
            return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sb2.toString());
        }
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new IronSourceError(IronSourceError.ERROR_CODE_KEY_NOT_SET, str3 + " Mediation - " + str + " is not set for " + str2);
        }
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : s.f.b("Load failed - ", str));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, com.ironsource.adapters.facebook.a.h(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, com.ironsource.adapters.facebook.a.h(str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, com.ironsource.adapters.facebook.a.h(str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, com.ironsource.adapters.facebook.a.h(str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, com.ironsource.adapters.facebook.a.h(str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, com.ironsource.adapters.facebook.a.h(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, e0.i.f(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, com.ironsource.adapters.facebook.a.h(str, " unsupported banner size"));
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String p10 = a3.l.p(com.ironsource.adapters.facebook.a.l(str, " Load Fail"), !TextUtils.isEmpty(str2) ? s.f.b(" ", str2) : "", " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, com.ironsource.adapters.facebook.a.h(p10, str3));
    }
}
