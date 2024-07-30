package com.huawei.hms.ads.consent.bean;

import android.text.TextUtils;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.openalliance.ad.annotations.DataKeep;
import e0.i;

@DataKeep
/* loaded from: classes2.dex */
public class AdProvider {

    /* renamed from: id, reason: collision with root package name */
    private String f21585id = "";
    private String name = "";
    private String serviceArea = "";
    private String privacyPolicyUrl = "";

    @AllApi
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdProvider adProvider = (AdProvider) obj;
        if (this.f21585id.equals(adProvider.f21585id) && this.name.equals(adProvider.name) && this.serviceArea.equals(adProvider.serviceArea) && this.privacyPolicyUrl.equals(adProvider.privacyPolicyUrl)) {
            return true;
        }
        return false;
    }

    @AllApi
    public String getId() {
        return this.f21585id;
    }

    @AllApi
    public String getName() {
        return this.name;
    }

    @AllApi
    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    @AllApi
    public String getServiceArea() {
        return this.serviceArea;
    }

    @AllApi
    public int hashCode() {
        return this.privacyPolicyUrl.hashCode() + i.b(this.serviceArea, i.b(this.name, this.f21585id.hashCode() * 31, 31), 31);
    }

    @AllApi
    public void setId(String str) {
        this.f21585id = str;
    }

    @AllApi
    public void setName(String str) {
        this.name = str;
    }

    @AllApi
    public void setPrivacyPolicyUrl(String str) {
        this.privacyPolicyUrl = str;
    }

    @AllApi
    public void setServiceArea(String str) {
        this.serviceArea = str;
    }

    @AllApi
    public boolean valid() {
        if (!TextUtils.isEmpty(this.f21585id) && !TextUtils.isEmpty(this.name) && !TextUtils.isEmpty(this.privacyPolicyUrl)) {
            return true;
        }
        return false;
    }

    @AllApi
    public boolean validPart() {
        if (!TextUtils.isEmpty(this.f21585id) && !TextUtils.isEmpty(this.name)) {
            return true;
        }
        return false;
    }
}
