package com.huawei.openalliance.ad.inter.data;

import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.beans.metadata.MetaData;

/* loaded from: classes2.dex */
public final class o implements d {

    /* renamed from: s, reason: collision with root package name */
    public final AdContentData f22300s;

    /* renamed from: t, reason: collision with root package name */
    public final MetaData f22301t;

    /* renamed from: u, reason: collision with root package name */
    public AppInfo f22302u;

    public o(AdContentData adContentData) {
        this.f22300s = adContentData;
        this.f22301t = adContentData.K();
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final RewardVerifyConfig J() {
        AdContentData adContentData = this.f22300s;
        if (adContentData != null) {
            RewardVerifyConfig.Builder builder = new RewardVerifyConfig.Builder();
            builder.setData(adContentData.A0());
            builder.setUserId(adContentData.B0());
            return builder.build();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final String L() {
        AdContentData adContentData = this.f22300s;
        if (adContentData == null) {
            return null;
        }
        return adContentData.L();
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final String h() {
        AdContentData adContentData = this.f22300s;
        if (adContentData == null) {
            return null;
        }
        return adContentData.k0();
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final String i() {
        AdContentData adContentData = this.f22300s;
        if (adContentData == null) {
            return null;
        }
        return adContentData.l0();
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final AdContentData m() {
        return this.f22300s;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final String n() {
        return this.f22300s.D();
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final long s() {
        MetaData metaData = this.f22301t;
        if (metaData != null) {
            return metaData.v();
        }
        return 500L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final int t() {
        MetaData metaData = this.f22301t;
        if (metaData != null) {
            return metaData.r();
        }
        return 50;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final AppInfo w() {
        AppInfo appInfo = this.f22302u;
        if (appInfo != null) {
            return appInfo;
        }
        AdContentData adContentData = this.f22300s;
        if (adContentData == null) {
            return null;
        }
        AppInfo c12 = adContentData.c1();
        this.f22302u = c12;
        return c12;
    }

    @Override // com.huawei.openalliance.ad.inter.data.d
    public final int z() {
        String str;
        AdContentData adContentData = this.f22300s;
        if (adContentData != null) {
            str = adContentData.a1();
        } else {
            str = null;
        }
        return jf.a(str);
    }
}
