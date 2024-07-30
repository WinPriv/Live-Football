package com.huawei.openalliance.ad.fadata;

import com.huawei.openalliance.ad.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class PPSAbilityDataContent {
    private String abilityId;
    private String abilityName;
    private String appName;
    private String brief;
    private String faParams;
    private String logoUrl;
    private String moduleName;
    private String packageName;
    private String serviceName;

    public final void a(String str) {
        this.faParams = str;
    }
}
