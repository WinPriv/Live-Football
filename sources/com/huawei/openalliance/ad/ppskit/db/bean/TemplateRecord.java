package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.e;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class TemplateRecord extends a {
    public static final String TEMPLATE_ID = "templateId";

    @e
    private String _id;
    private String appPkgName;
    private String templateContent;
    private String templateId;

    public final String A() {
        return this.templateId;
    }

    public final void B(String str) {
        this.templateId = str;
    }

    public final void C(String str) {
        this.templateContent = str;
    }
}
