package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.anythink.core.api.ATCustomRuleKeys;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.google.android.gms.common.Scopes;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f18446a = CollectionUtils.map();

    /* renamed from: b, reason: collision with root package name */
    private final Object f18447b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Integer f18448c = null;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinGender f18449d = null;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinAdContentRating f18450e = null;
    private String f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f18451g = null;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f18452h = null;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f18453i = null;

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f18447b) {
            if (StringUtils.isValidString(str2)) {
                this.f18446a.put(str, str2);
            } else {
                this.f18446a.remove(str);
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        synchronized (this.f18447b) {
            this.f18446a.clear();
        }
    }

    public Map<String, String> getAllData() {
        Map<String, String> map;
        synchronized (this.f18447b) {
            map = CollectionUtils.map(this.f18446a);
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getEmail() {
        return this.f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinGender getGender() {
        return this.f18449d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getInterests() {
        return this.f18453i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getKeywords() {
        return this.f18452h;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f18450e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getPhoneNumber() {
        return this.f18451g;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public Integer getYearOfBirth() {
        return this.f18448c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(String str) {
        String str2;
        if (str != null) {
            str2 = StringUtils.toFullSHA1Hash(str.toLowerCase().trim());
        } else {
            str2 = str;
        }
        a(Scopes.EMAIL, str2);
        this.f = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            a(ATCustomRuleKeys.GENDER, str);
            this.f18449d = appLovinGender;
        }
        str = null;
        a(ATCustomRuleKeys.GENDER, str);
        this.f18449d = appLovinGender;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(List<String> list) {
        String implode;
        if (list == null) {
            implode = null;
        } else {
            implode = CollectionUtils.implode(list, list.size());
        }
        a("interests", implode);
        this.f18453i = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(List<String> list) {
        String implode;
        if (list == null) {
            implode = null;
        } else {
            implode = CollectionUtils.implode(list, list.size());
        }
        a("keywords", implode);
        this.f18452h = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        String str;
        if (appLovinAdContentRating != null && appLovinAdContentRating != AppLovinAdContentRating.NONE) {
            str = Integer.toString(appLovinAdContentRating.ordinal());
        } else {
            str = null;
        }
        a("maximum_ad_content_rating", str);
        this.f18450e = appLovinAdContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(String str) {
        String str2;
        if (str != null) {
            str2 = StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", ""));
        } else {
            str2 = str;
        }
        a("phone_number", str2);
        this.f18451g = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(Integer num) {
        String num2;
        if (num == null) {
            num2 = null;
        } else {
            num2 = Integer.toString(num.intValue());
        }
        a("year_of_birth", num2);
        this.f18448c = num;
    }
}
