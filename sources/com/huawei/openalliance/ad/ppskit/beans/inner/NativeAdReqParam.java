package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class NativeAdReqParam extends BaseAdReqParam {
    private List<String> cacheContentIds;
    private boolean enableDirectCacheVideo;
    private boolean enableDirectReturnVideoAd;
    private boolean enableVideoDownloadInMobileNetwork;
    private String extraInfo;
    private int linkedVideoMode = 10;

    public final String b() {
        return this.extraInfo;
    }

    public final boolean c() {
        return this.enableVideoDownloadInMobileNetwork;
    }

    public final boolean d() {
        return this.enableDirectReturnVideoAd;
    }

    public final boolean e() {
        return this.enableDirectCacheVideo;
    }

    public final List<String> f() {
        return this.cacheContentIds;
    }
}
