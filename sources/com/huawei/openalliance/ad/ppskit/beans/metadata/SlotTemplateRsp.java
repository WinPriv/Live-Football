package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class SlotTemplateRsp {
    private List<String> deletedTemplates;
    private String slotId;
    private List<TemplateConfig> updatedTemplates;

    public final String a() {
        return this.slotId;
    }

    public final List<TemplateConfig> b() {
        return this.updatedTemplates;
    }

    public final List<String> c() {
        return this.deletedTemplates;
    }
}
