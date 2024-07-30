package com.huawei.openalliance.ad.ppskit.beans.metadata.v3;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class TemplateV3 implements Serializable {
    private static final long serialVersionUID = -8566137528932430260L;
    private TemplateData templateData;
    private String templateId;
    private String templateUrl;

    public final String a() {
        return this.templateId;
    }

    public final String c() {
        return this.templateUrl;
    }

    public final TemplateData k() {
        return this.templateData;
    }
}
