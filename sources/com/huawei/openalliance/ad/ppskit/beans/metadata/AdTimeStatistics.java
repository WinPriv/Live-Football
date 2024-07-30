package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class AdTimeStatistics {
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

    public final long a() {
        return this.adLoadStartTS;
    }

    public final void b(long j10) {
        this.adLoadStartTS = j10;
    }

    public final long c() {
        return this.adInfoPrepEndTS;
    }

    public final void d(long j10) {
        this.adInfoPrepEndTS = j10;
    }

    public final long e() {
        return this.adPhyReqStartTS;
    }

    public final void f(long j10) {
        this.adPhyReqStartTS = j10;
    }

    public final void g(long j10) {
        this.adPhyReqEndTS = j10;
    }

    public final void h(long j10) {
        this.adNetReqStartTS = j10;
    }

    public final void i(long j10) {
        this.adNetReqEndTS = j10;
    }

    public final void j(long j10) {
        this.adRspParseStartTS = j10;
    }

    public final void k(long j10) {
        this.adRspParseEndTS = j10;
    }

    public final long l() {
        return this.sdkKitIPCStartTS;
    }

    public final void m(long j10) {
        this.sdkKitIPCStartTS = j10;
    }

    public final long n() {
        return this.sdkKitIPCEndTS;
    }

    public final void o(long j10) {
        this.sdkKitIPCEndTS = j10;
    }

    public final void p(long j10) {
        this.kitSdkIPCStartTS = j10;
    }
}
