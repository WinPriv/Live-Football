package com.huawei.openalliance.ad.ppskit.beans.metadata.v3;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class TemplateData implements Serializable {
    private static final long serialVersionUID = 881899438177174869L;
    private List<MotionData> motionData;
    private String motions;
    private String templateContext;

    public TemplateData() {
    }

    public TemplateData(String str, String str2, List<MotionData> list) {
        this.templateContext = str;
        this.motions = str2;
        this.motionData = list;
    }

    public final String a() {
        return this.templateContext;
    }

    public final String k() {
        return this.motions;
    }

    public final List<MotionData> p() {
        return this.motionData;
    }
}
