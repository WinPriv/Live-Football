package com.huawei.openalliance.ad.ppskit.beans.openrtb;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class Video implements Serializable {
    private static final long serialVersionUID = -6156262595056906295L;
    private int checkSHA256Flag;
    private long duration;
    private String format;

    @d(a = "H")
    private int height;
    private String localPath;
    private String sha256;
    private long size;
    private String url;

    @d(a = "W")
    private int width;

    public final String a() {
        return this.url;
    }

    public final void b(String str) {
        this.localPath = str;
    }

    public final String k() {
        return this.sha256;
    }

    public final int p() {
        return this.checkSHA256Flag;
    }
}
