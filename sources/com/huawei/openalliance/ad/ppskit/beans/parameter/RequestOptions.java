package com.huawei.openalliance.ad.ppskit.beans.parameter;

import android.os.Bundle;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImpEXs;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SearchInfo;
import java.util.Map;
import ma.d;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class RequestOptions {
    public static final String AD_CONTENT_CLASSIFICATION_A = "A";
    public static final String AD_CONTENT_CLASSIFICATION_J = "J";
    public static final String AD_CONTENT_CLASSIFICATION_PI = "PI";
    public static final String AD_CONTENT_CLASSIFICATION_UNSPECIFIED = "";
    public static final String AD_CONTENT_CLASSIFICATION_W = "W";
    private static final String TAG = "RequestOptions";
    public static final int TAG_FOR_CHILD_PROTECTION_FALSE = 0;
    public static final int TAG_FOR_CHILD_PROTECTION_TRUE = 1;
    public static final int TAG_FOR_CHILD_PROTECTION_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_PROMISE_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_PROMISE_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_PROMISE_UNSPECIFIED = -1;

    @d(a = "gACString")
    private String acString;
    private String adContentClassification;
    private App app;
    private String appCountry;
    private String appLang;
    private String consent;

    @f
    private Map<String, Bundle> extras;
    private String hwACString;
    private Map<String, ImpEXs> impEXs;
    private Boolean requestLocation;
    private SearchInfo searchInfo;
    private String searchTerm;
    private Boolean supportFa;
    private Integer tagForChildProtection;
    private Integer tagForUnderAgeOfPromise;
    private Integer nonPersonalizedAd = null;
    private Integer hwNonPersonalizedAd = null;
    private Integer thirdNonPersonalizedAd = null;

    /* loaded from: classes2.dex */
    public static class Builder {
        private String acString;
        private String adContentClassification;
        private App app;
        private String appCountry;
        private String appLang;
        private String consent;
        private Map<String, Bundle> extras;
        private String hwACString;
        private SearchInfo searchInfo;
        private String searchTerm;
        private Boolean supportFa;
        private Integer tagForChildProtection;
        private Integer tagForUnderAgeOfPromise;
        private Integer nonPersonalizedAd = null;
        private Integer hwNonPersonalizedAd = null;
        private Integer thirdNonPersonalizedAd = null;
    }

    public final String a() {
        return this.acString;
    }

    public final String b() {
        return this.hwACString;
    }

    public final Integer c() {
        return this.tagForChildProtection;
    }

    public final Integer d() {
        return this.tagForUnderAgeOfPromise;
    }

    public final Integer e() {
        return this.nonPersonalizedAd;
    }

    public final Integer f() {
        return this.hwNonPersonalizedAd;
    }

    public final Integer g() {
        return this.thirdNonPersonalizedAd;
    }

    public final String h() {
        return this.appLang;
    }

    public final String i() {
        return this.appCountry;
    }

    public final Map<String, ImpEXs> j() {
        return this.impEXs;
    }

    public final String k() {
        return this.consent;
    }

    public final App l() {
        return this.app;
    }

    public final Boolean m() {
        return this.requestLocation;
    }

    public final SearchInfo n() {
        return this.searchInfo;
    }

    public final Boolean o() {
        return this.supportFa;
    }

    public final String p() {
        return this.adContentClassification;
    }
}
