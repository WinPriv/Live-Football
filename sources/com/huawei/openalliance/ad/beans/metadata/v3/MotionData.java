package com.huawei.openalliance.ad.beans.metadata.v3;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class MotionData implements Serializable {
    private static final long serialVersionUID = -4033124660273385722L;
    private long dataId;
    private int duration;
    private String filePath;
    private String format;
    private int height;
    private String sha256;
    private int size;
    private String url;
    private int width;
}
