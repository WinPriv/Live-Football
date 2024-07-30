package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class AdTimeStatistics implements Serializable {
    private static final long serialVersionUID = 5562197861234973073L;
    long adInfoPrepEndTS;
    long adLoadEndTS;
    long adLoadStartTS;
    long adNetReqEndTS;
    long adNetReqStartTS;
    long adPhyReqEndTS;
    long adPhyReqStartTS;
    long adRspParseEndTS;
    long adRspParseStartTS;
    long kitSdkIPCEndTS;
    long kitSdkIPCStartTS;
    long sdkKitIPCEndTS;
    long sdkKitIPCStartTS;
    long splashAdDownloadTS;
    long splashAdMaterialLoadedTS;

    public final long e() {
        return this.splashAdMaterialLoadedTS;
    }

    public final long k() {
        return this.adLoadStartTS;
    }

    public final void l(long j10) {
        this.adLoadStartTS = j10;
    }

    public final void m(long j10) {
        this.adRspParseEndTS = j10;
    }

    public final long p() {
        return this.adLoadEndTS;
    }

    public final void q(long j10) {
        this.adLoadEndTS = j10;
    }

    public final long r() {
        return this.kitSdkIPCEndTS;
    }

    public final void s(long j10) {
        this.kitSdkIPCEndTS = j10;
    }

    public final long u() {
        return this.splashAdDownloadTS;
    }

    public final void v(long j10) {
        this.splashAdDownloadTS = j10;
    }

    public final void w(long j10) {
        this.splashAdMaterialLoadedTS = j10;
    }
}
