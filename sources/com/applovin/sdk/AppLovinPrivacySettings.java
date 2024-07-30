package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.b.a;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        y.f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a10 = a.b().a(context);
        if (a10 != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        y.f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a10 = a.a().a(context);
        if (a10 != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        y.f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        if (a.a().a(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        y.f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a10 = a.c().a(context);
        if (a10 != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        y.f("AppLovinPrivacySettings", "isDoNotSellSet()");
        if (a.c().a(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean isUserConsentSet(Context context) {
        y.f("AppLovinPrivacySettings", "isUserConsentSet()");
        if (a.b().a(context) != null) {
            return true;
        }
        return false;
    }

    public static void setDoNotSell(boolean z10, Context context) {
        y.f("AppLovinPrivacySettings", "setDoNotSell()");
        if (a.c(z10, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z10));
        }
    }

    public static void setHasUserConsent(boolean z10, Context context) {
        y.f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (a.b(z10, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z10), null, null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z10, Context context) {
        y.f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (a.a(z10, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z10), null);
        }
    }
}
