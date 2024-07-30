package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class NativeAdReqParam extends BaseAdReqParam {
    private List<String> cacheContentIds;
    private boolean enableDirectCacheVideo;
    private boolean enableDirectReturnVideoAd;
    private boolean enableVideoDownloadInMobileNetwork;
    private String extraInfo;
    private int linkedVideoMode = 0;

    public final void b(String str) {
        this.extraInfo = str;
    }

    public final void c(List<String> list) {
        this.cacheContentIds = list;
    }

    public final void d(boolean z10) {
        this.enableVideoDownloadInMobileNetwork = z10;
    }

    public final void e(boolean z10) {
        this.enableDirectCacheVideo = z10;
    }

    public final void f(boolean z10) {
        this.enableDirectReturnVideoAd = z10;
    }
}
