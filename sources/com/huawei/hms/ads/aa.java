package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.inter.data.IInterstitialAd;
import com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener;
import com.huawei.hms.ads.reward.OnMetadataChangedListener;
import com.huawei.hms.ads.reward.RewardAdListener;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.beans.inner.BaseAdReqParam;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.h0;
import gb.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class aa {
    private String B;
    private OnMetadataChangedListener C;
    private Bundle D;
    private Context I;
    private String L;
    private RewardAdListener S;
    private AdListener Z;

    /* renamed from: a, reason: collision with root package name */
    private long f21524a;

    /* renamed from: b, reason: collision with root package name */
    private long f21525b;

    /* renamed from: c, reason: collision with root package name */
    private long f21526c;

    /* renamed from: d, reason: collision with root package name */
    private App f21527d;

    /* renamed from: g, reason: collision with root package name */
    private RewardVerifyConfig f21529g;

    /* renamed from: h, reason: collision with root package name */
    private ga.g f21530h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f21531i;
    private a V = a.IDLE;

    /* renamed from: e, reason: collision with root package name */
    private List<IInterstitialAd> f21528e = new ArrayList();
    private IInterstitialAd f = null;

    /* renamed from: j, reason: collision with root package name */
    private IInterstitialAdStatusListener f21532j = new b(this);

    /* renamed from: k, reason: collision with root package name */
    private INonwifiActionListener f21533k = new INonwifiActionListener() { // from class: com.huawei.hms.ads.aa.1
        @Override // com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener
        public boolean Code(long j10) {
            return false;
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener
        public boolean Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, long j10) {
            return false;
        }
    };

    /* loaded from: classes2.dex */
    public enum a {
        IDLE,
        LOADING
    }

    /* loaded from: classes2.dex */
    public static class b implements IInterstitialAdStatusListener {
        private WeakReference<aa> Code;

        public b(aa aaVar) {
            this.Code = new WeakReference<>(aaVar);
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdClicked() {
            aa aaVar = this.Code.get();
            if (aaVar != null && aaVar.Z != null) {
                aaVar.Z.onAdClicked();
            }
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdClosed() {
            aa aaVar = this.Code.get();
            if (aaVar != null) {
                if (aaVar.Z != null) {
                    aaVar.Z.onAdClosed();
                }
                if (aaVar.S != null) {
                    aaVar.S.onRewardAdClosed();
                }
            }
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdCompleted() {
            aa aaVar = this.Code.get();
            if (aaVar != null && aaVar.S != null) {
                aaVar.S.onRewardAdCompleted();
            }
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdError(int i10, int i11) {
            aa aaVar = this.Code.get();
            if (aaVar != null) {
                if (aaVar.Z != null) {
                    aaVar.Z.onAdFailed(ci.Code(i10));
                }
                if (aaVar.S != null) {
                    aaVar.S.onRewardAdFailedToLoad(ci.Code(i10));
                }
            }
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onAdShown() {
            aa aaVar = this.Code.get();
            if (aaVar != null) {
                if (aaVar.Z != null) {
                    aaVar.Z.onAdOpened();
                }
                if (aaVar.S != null) {
                    aaVar.S.onRewardAdOpened();
                }
            }
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onLeftApp() {
            aa aaVar = this.Code.get();
            if (aaVar != null) {
                if (aaVar.Z != null) {
                    aaVar.Z.onAdLeave();
                }
                if (aaVar.S != null) {
                    aaVar.S.onRewardAdLeftApp();
                }
            }
        }

        @Override // com.huawei.hms.ads.inter.listeners.IInterstitialAdStatusListener
        public void onRewarded() {
            aa aaVar = this.Code.get();
            if (aaVar != null && aaVar.S != null) {
                aaVar.S.onRewarded(new cb(aaVar.f.B()));
            }
        }
    }

    public aa(Context context) {
        this.I = context;
    }

    public final Bundle C() {
        Bundle bundle = this.D;
        return bundle == null ? new Bundle() : bundle;
    }

    private boolean F() {
        if (!r0.c(this.I)) {
            AdListener adListener = this.Z;
            if (adListener != null) {
                adListener.onAdFailed(5);
            }
            RewardAdListener rewardAdListener = this.S;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdFailedToLoad(5);
            }
            return false;
        }
        if (this.V == a.LOADING) {
            ex.V("InterstitialAdManager", "waiting for request finish");
            AdListener adListener2 = this.Z;
            if (adListener2 != null) {
                adListener2.onAdFailed(4);
            }
            RewardAdListener rewardAdListener2 = this.S;
            if (rewardAdListener2 != null) {
                rewardAdListener2.onRewardAdFailedToLoad(4);
            }
            return false;
        }
        if (!TextUtils.isEmpty(this.B)) {
            return true;
        }
        ex.I("InterstitialAdManager", "empty ad ids");
        AdListener adListener3 = this.Z;
        if (adListener3 != null) {
            adListener3.onAdFailed(1);
        }
        RewardAdListener rewardAdListener3 = this.S;
        if (rewardAdListener3 != null) {
            rewardAdListener3.onRewardAdFailedToLoad(1);
        }
        return false;
    }

    public final AdListener Code() {
        return this.Z;
    }

    public final boolean I() {
        if (androidx.transition.n.h(this.f21528e)) {
            return false;
        }
        for (IInterstitialAd iInterstitialAd : this.f21528e) {
            if (iInterstitialAd != null && !iInterstitialAd.Z()) {
                return true;
            }
        }
        return false;
    }

    public final void S() {
        ex.V("InterstitialAdManager", bj.b.V);
        Code(this.I);
    }

    public final boolean Z() {
        return this.V == a.LOADING;
    }

    public final String V() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(Map<String, List<IInterstitialAd>> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (List<IInterstitialAd> list : map.values()) {
            if (!androidx.transition.n.h(list)) {
                for (IInterstitialAd iInterstitialAd : list) {
                    if (iInterstitialAd.g() || !iInterstitialAd.V()) {
                        ex.V("InterstitialAdManager", "ad is invalid, content id:" + iInterstitialAd.L());
                    } else {
                        this.f21528e.add(iInterstitialAd);
                    }
                }
            }
        }
        OnMetadataChangedListener onMetadataChangedListener = this.C;
        if (onMetadataChangedListener != null) {
            onMetadataChangedListener.onMetadataChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(final int i10) {
        ex.V("InterstitialAdManager", "onAdFailed, errorCode:" + i10);
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.aa.3
            @Override // java.lang.Runnable
            public void run() {
                aa.this.f21525b = System.currentTimeMillis();
                if (aa.this.Z != null) {
                    aa.this.Z.onAdFailed(ci.Code(i10));
                }
                if (aa.this.f21530h != null) {
                    aa.this.f21530h.Code(i10);
                }
                if (aa.this.S != null) {
                    aa.this.S.onRewardAdFailedToLoad(ci.Code(i10));
                }
                cz.Code(aa.this.I, i10, aa.this.L, 12, null, aa.this.f21524a, aa.this.f21525b, aa.this.f21526c);
            }
        });
    }

    public final void Code(Activity activity) {
        ex.V("InterstitialAdManager", "show activity");
        Code((Context) activity);
    }

    private void Code(Context context) {
        for (IInterstitialAd iInterstitialAd : this.f21528e) {
            if (iInterstitialAd != null && !iInterstitialAd.Z()) {
                this.f = iInterstitialAd;
                iInterstitialAd.Code(this.f21529g);
                iInterstitialAd.setRewardAdListener(this.S);
                iInterstitialAd.setNonwifiActionListener(this.f21533k);
                iInterstitialAd.show(context, this.f21532j);
                return;
            }
        }
    }

    public final void Code(AdListener adListener) {
        this.Z = adListener;
    }

    public final void Code(AdParam adParam) {
        this.f21524a = System.currentTimeMillis();
        ex.V("InterstitialAdManager", com.huawei.openalliance.ad.constant.h.Code);
        if (F()) {
            AdSlotParam.a aVar = new AdSlotParam.a();
            Code(adParam, aVar);
            if (this.f21527d != null && !r0.g(this.I)) {
                ex.I("InterstitialAdManager", "hms ver not support set appInfo.");
                Code(com.huawei.openalliance.ad.constant.ag.T);
                return;
            }
            gb.e.b(this.I.getApplicationContext(), aVar.f21974l);
            this.V = a.LOADING;
            this.f21528e.clear();
            BaseAdReqParam baseAdReqParam = new BaseAdReqParam();
            baseAdReqParam.a(this.f21524a);
            jd.Code(this.I, "interstitial_ad_load", aVar.b(), gb.b.p(baseAdReqParam), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.aa.2
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                    aa aaVar;
                    int code;
                    aa.this.f21526c = System.currentTimeMillis();
                    if (callResult.getCode() == 200) {
                        Map<String, List<AdContentData>> map = (Map) gb.b.o(Map.class, callResult.getData(), List.class, AdContentData.class);
                        if (aa.this.f21530h != null) {
                            aa.this.f21530h.Code(map);
                        }
                        code = 204;
                        if (map != null && map.size() > 0) {
                            HashMap hashMap = new HashMap(map.size());
                            for (Map.Entry<String, List<AdContentData>> entry : map.entrySet()) {
                                String key = entry.getKey();
                                List<AdContentData> value = entry.getValue();
                                if (value != null) {
                                    ArrayList arrayList = new ArrayList(value.size());
                                    for (AdContentData adContentData : value) {
                                        if (aa.this.L == null) {
                                            aa.this.L = adContentData.E();
                                        }
                                        arrayList.add(new com.huawei.hms.ads.inter.data.a(adContentData));
                                    }
                                    hashMap.put(key, arrayList);
                                }
                            }
                            if (!a0.a.r(hashMap)) {
                                aa.this.V(hashMap);
                                if (!androidx.transition.n.h(aa.this.f21528e)) {
                                    aa.this.Code(hashMap);
                                    aa.this.V = a.IDLE;
                                }
                            }
                        }
                        aaVar = aa.this;
                    } else {
                        aaVar = aa.this;
                        code = callResult.getCode();
                    }
                    aaVar.Code(code);
                    aa.this.V = a.IDLE;
                }
            }, String.class);
        }
    }

    private void Code(AdParam adParam, AdSlotParam.a aVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.B);
        int c10 = h0.c(this.I);
        aVar.f21964a = arrayList;
        aVar.f21967d = c10;
        aVar.f21965b = this.I.getResources().getConfiguration().orientation != 1 ? 0 : 1;
        aVar.f21968e = gb.z.k(this.I);
        aVar.f = gb.z.a(this.I);
        Integer num = this.f21531i;
        if (num != null) {
            aVar.B = num;
        }
        if (adParam != null) {
            RequestOptions Code = cj.Code(adParam.V());
            App app = Code.getApp();
            if (app != null) {
                this.f21527d = app;
            }
            aVar.f21974l = Code;
            aVar.f21975m = adParam.getGender();
            aVar.f21976n = adParam.getTargetingContentUrl();
            aVar.f21977p = adParam.getKeywords();
            aVar.f21985x = this.f21527d;
            aVar.o = adParam.I();
            aVar.a(adParam.C());
            if (adParam.Code() != null) {
                aVar.f21973k = adParam.Code();
            }
        }
    }

    public final void Code(OnMetadataChangedListener onMetadataChangedListener) {
        if (this.C != null) {
            ex.V("InterstitialAdManager", "Update ad metadata listener.");
        }
        this.C = onMetadataChangedListener;
    }

    public final void Code(RewardAdListener rewardAdListener) {
        if (this.S != null) {
            ex.V("InterstitialAdManager", "Update rewarded video listener.");
        }
        this.S = rewardAdListener;
    }

    public final void Code(RewardVerifyConfig rewardVerifyConfig) {
        this.f21529g = rewardVerifyConfig;
    }

    public void Code(ga.g gVar) {
        this.f21530h = gVar;
    }

    public void Code(Integer num) {
        this.f21531i = num;
    }

    public final void Code(String str) {
        this.B = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(final Map<String, List<IInterstitialAd>> map) {
        StringBuilder sb2 = new StringBuilder("onAdsLoaded, size:");
        sb2.append(map != null ? Integer.valueOf(map.size()) : null);
        ex.V("InterstitialAdManager", sb2.toString());
        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.aa.4
            @Override // java.lang.Runnable
            public void run() {
                aa.this.f21525b = System.currentTimeMillis();
                if (aa.this.Z != null) {
                    aa.this.Z.onAdLoaded();
                }
                if (aa.this.S != null) {
                    aa.this.S.onRewardAdLoaded();
                }
                cz.Code(aa.this.I, 200, aa.this.L, 12, map, aa.this.f21524a, aa.this.f21525b, aa.this.f21526c);
            }
        });
    }
}
