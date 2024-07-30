package com.huawei.hms.ads.jsb.inner.data;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.constant.bw;

@DataKeep
/* loaded from: classes2.dex */
public class ImageInfo {
    private int fileSize;
    private int height;
    private String imageType;
    private String url;
    private int width;

    public ImageInfo(com.huawei.openalliance.ad.beans.metadata.ImageInfo imageInfo) {
        this.width = 0;
        this.height = 0;
        if (imageInfo != null) {
            String u2 = imageInfo.u();
            this.url = u2;
            if (!TextUtils.isEmpty(u2) && !this.url.startsWith(bw.HTTP.toString()) && !this.url.startsWith(bw.HTTPS.toString())) {
                this.url = imageInfo.r();
            }
            this.width = imageInfo.A();
            this.height = imageInfo.k();
            this.imageType = imageInfo.x();
            this.fileSize = imageInfo.p();
        }
    }
}
