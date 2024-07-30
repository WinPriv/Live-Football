package com.huawei.openalliance.ad.ppskit.beans.openrtb;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class ImageExt implements Serializable {
    private static final long serialVersionUID = 687537555709319441L;
    private int checkSHA256Flag;
    private String format;
    private String sha256;
    private long size;

    public final String k() {
        return this.sha256;
    }

    public final int p() {
        return this.checkSHA256Flag;
    }
}
