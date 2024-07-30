package com.huawei.openalliance.ad.ppskit.inter.data;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import java.io.Serializable;

@OuterVisible
@DataKeep
/* loaded from: classes2.dex */
public class ImageInfo implements Serializable {
    private static final long serialVersionUID = 30414300;
    private boolean checkSha256;
    private int fileSize;
    private int height;
    private String imageType;
    private String sha256;
    private String url;
    private int width;

    @OuterVisible
    public ImageInfo() {
        this.width = 0;
        this.height = 0;
        this.checkSha256 = true;
    }

    @OuterVisible
    public int getFileSize() {
        return this.fileSize;
    }

    @OuterVisible
    public int getHeight() {
        return this.height;
    }

    @OuterVisible
    public String getImageType() {
        return this.imageType;
    }

    @OuterVisible
    public String getSha256() {
        return this.sha256;
    }

    @OuterVisible
    public String getUrl() {
        return this.url;
    }

    @OuterVisible
    public int getWidth() {
        return this.width;
    }

    @OuterVisible
    public boolean isCheckSha256() {
        return this.checkSha256;
    }

    public ImageInfo(com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo imageInfo) {
        this.width = 0;
        this.height = 0;
        this.checkSha256 = true;
        if (imageInfo != null) {
            this.url = imageInfo.g();
            this.width = imageInfo.l();
            this.height = imageInfo.m();
            this.sha256 = imageInfo.a();
            this.imageType = imageInfo.d();
            this.fileSize = imageInfo.n();
            this.checkSha256 = imageInfo.o() == 0;
        }
    }
}
