package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.constant.bd;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class ImageInfo implements Serializable {
    private static final long serialVersionUID = 5884357961234973073L;
    private int checkSha256Flag;
    private String origUrl;
    private String sha256;
    private String url;
    private int width = 0;
    private int height = 0;
    private String imageType = bd.Code;
    private int fileSize = 0;

    public final int A() {
        return this.width;
    }

    public final int k() {
        return this.height;
    }

    public final int p() {
        return this.fileSize;
    }

    public final String q() {
        return this.sha256;
    }

    public final String r() {
        return this.origUrl;
    }

    public final String u() {
        return this.url;
    }

    public final int v() {
        return this.checkSha256Flag;
    }

    public final String x() {
        return this.imageType;
    }
}
