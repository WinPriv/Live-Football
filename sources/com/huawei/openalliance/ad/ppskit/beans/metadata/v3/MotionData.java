package com.huawei.openalliance.ad.ppskit.beans.metadata.v3;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class MotionData implements Serializable {
    private static final long serialVersionUID = 5993334213402798519L;
    private long dataId;
    private int duration;
    private String filePath;
    private String format;
    private int height;
    private String sha256;
    private int size;
    private String url;
    private int width;

    public final String h() {
        return this.sha256;
    }

    public final String k() {
        return this.url;
    }
}
