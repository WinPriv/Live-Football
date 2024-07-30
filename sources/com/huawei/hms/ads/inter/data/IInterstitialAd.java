package com.huawei.hms.ads.inter.data;

import android.content.Context;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener;
import com.huawei.hms.ads.reward.RewardAdListener;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.data.d;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import java.io.Serializable;

@GlobalApi
/* loaded from: classes2.dex */
public interface IInterstitialAd extends d, Serializable {
    /* synthetic */ RewardItem B();

    /* synthetic */ void Code(Context context);

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ void Code(RewardVerifyConfig rewardVerifyConfig);

    /* synthetic */ void Code(String str);

    /* synthetic */ String D();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ RewardVerifyConfig J();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ String L();

    /* synthetic */ String M();

    /* synthetic */ String N();

    /* synthetic */ String P();

    /* synthetic */ String Q();

    /* synthetic */ int R();

    /* synthetic */ boolean T();

    /* synthetic */ void V(String str);

    /* synthetic */ boolean V();

    /* synthetic */ boolean Z();

    /* synthetic */ String a();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ int b();

    /* synthetic */ String c();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ String d();

    /* synthetic */ long e();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ long f();

    /* synthetic */ boolean g();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ String h();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ String i();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ String j();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ AdContentData m();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ String n();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ long s();

    void setNonwifiActionListener(INonwifiActionListener iNonwifiActionListener);

    void setRewardAdListener(RewardAdListener rewardAdListener);

    void show(Context context, IInterstitialAdStatusListener iInterstitialAdStatusListener);

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ int t();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ AppInfo w();

    /* synthetic */ boolean y();

    @Override // com.huawei.openalliance.ad.inter.data.d
    /* synthetic */ int z();
}
