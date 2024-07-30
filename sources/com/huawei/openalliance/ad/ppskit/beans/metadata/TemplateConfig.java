package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class TemplateConfig {
    private String style;
    private int styleVer;
    private String tag;
    private String templateId;

    public TemplateConfig() {
    }

    public TemplateConfig(String str, int i10) {
        this.templateId = str;
        this.styleVer = i10;
    }

    public final String a() {
        return this.templateId;
    }

    public final int b() {
        return this.styleVer;
    }

    public final String c() {
        return this.style;
    }

    public final String d() {
        return this.tag;
    }
}
