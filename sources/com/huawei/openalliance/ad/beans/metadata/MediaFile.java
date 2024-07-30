package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class MediaFile implements Serializable {
    private static final long serialVersionUID = 30422300;
    private long fileSize;
    private int height;
    private String sha256;
    private String url;
    private int width;
    private String mime = "video/mp4";
    private int checkSha256Flag = 0;
    private int downloadNetwork = 0;
    private int playMode = 1;

    public final long A() {
        return this.fileSize;
    }

    public final String k() {
        return this.url;
    }

    public final String p() {
        return this.sha256;
    }

    public final String q() {
        return this.mime;
    }

    public final int r() {
        return this.playMode;
    }

    public final int u() {
        return this.height;
    }

    public final int v() {
        return this.checkSha256Flag;
    }

    public final int x() {
        return this.width;
    }
}
