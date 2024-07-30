package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class SlotTemplate {
    private String slotId;
    private List<TemplateConfig> templates;

    public SlotTemplate(String str, List<TemplateConfig> list) {
        this.slotId = str;
        this.templates = list;
    }
}
