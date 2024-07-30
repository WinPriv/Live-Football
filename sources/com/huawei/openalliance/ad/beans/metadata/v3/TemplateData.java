package com.huawei.openalliance.ad.beans.metadata.v3;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class TemplateData implements Serializable {
    private static final long serialVersionUID = 4943303525973528850L;
    private List<MotionData> motionData;
    private String motions;
    private String templateContext;
}
