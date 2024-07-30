package com.huawei.hms.ads.reward;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.App;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.cb;
import com.huawei.hms.ads.ci;
import com.huawei.hms.ads.cj;
import com.huawei.hms.ads.k;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.data.g;
import com.huawei.openalliance.ad.inter.data.m;
import fa.v;
import ga.e;
import ga.f;
import gb.h0;
import java.util.List;
import java.util.Map;

@GlobalApi
/* loaded from: classes2.dex */
public class RewardAd {
    private Reward B;
    private RewardVerifyConfig C;
    private OnMetadataChangedListener Code;
    private v F;
    private RewardAdListener L;
    private m S;
    private Context V;
    private String Z;

    /* renamed from: a, reason: collision with root package name */
    private String f21773a;

    /* renamed from: b, reason: collision with root package name */
    private String f21774b;

    /* renamed from: d, reason: collision with root package name */
    private int f21776d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21777e;
    private boolean I = false;
    private Bundle D = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private boolean f21775c = false;

    /* loaded from: classes2.dex */
    public class a implements ga.m {
        private RewardAdListener I;
        private RewardAdLoadListener V;

        public a(RewardAdLoadListener rewardAdLoadListener, RewardAdListener rewardAdListener) {
            this.V = rewardAdLoadListener;
            this.I = rewardAdListener;
        }

        @Override // ga.m
        public void Code(int i10) {
            RewardAd.this.I = false;
            RewardAdLoadListener rewardAdLoadListener = this.V;
            if (rewardAdLoadListener != null) {
                rewardAdLoadListener.onRewardAdFailedToLoad(ci.Code(i10));
            }
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdFailedToLoad(ci.Code(i10));
            }
        }

        @Override // ga.m
        public void Code(Map<String, List<g>> map) {
            RewardAdListener rewardAdListener;
            RewardAd.this.I = true;
            List<g> list = map.get(RewardAd.this.Z);
            if (n.h(list)) {
                RewardAdLoadListener rewardAdLoadListener = this.V;
                if (rewardAdLoadListener != null) {
                    rewardAdLoadListener.onRewardAdFailedToLoad(3);
                }
                rewardAdListener = this.I;
                if (rewardAdListener == null) {
                    return;
                }
            } else {
                g gVar = list.get(0);
                if (gVar instanceof m) {
                    RewardAd.this.S = (m) gVar;
                    RewardAd.this.S.A = RewardAd.this.f21777e;
                    RewardAd rewardAd = RewardAd.this;
                    rewardAd.B = new cb(rewardAd.S.f22293w);
                    RewardAdLoadListener rewardAdLoadListener2 = this.V;
                    if (rewardAdLoadListener2 != null) {
                        rewardAdLoadListener2.onRewardedLoaded();
                    }
                    RewardAdListener rewardAdListener2 = this.I;
                    if (rewardAdListener2 != null) {
                        rewardAdListener2.onRewardAdLoaded();
                    }
                    if (RewardAd.this.Code != null) {
                        RewardAd.this.Code.onMetadataChanged();
                        return;
                    }
                    return;
                }
                RewardAdLoadListener rewardAdLoadListener3 = this.V;
                if (rewardAdLoadListener3 != null) {
                    rewardAdLoadListener3.onRewardAdFailedToLoad(3);
                }
                rewardAdListener = this.I;
                if (rewardAdListener == null) {
                    return;
                }
            }
            rewardAdListener.onRewardAdFailedToLoad(3);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements e, f {
        private RewardAdListener I;
        private RewardAdStatusListener V;

        public b(RewardAdStatusListener rewardAdStatusListener, RewardAdListener rewardAdListener) {
            this.V = rewardAdStatusListener;
            this.I = rewardAdListener;
        }

        @Override // ga.e
        public void B() {
            Reward reward;
            RewardItem rewardItem = RewardAd.this.S.f22293w;
            RewardAdStatusListener rewardAdStatusListener = this.V;
            if (rewardAdStatusListener != null) {
                if (rewardItem != null) {
                    reward = new cb(rewardItem);
                } else {
                    reward = Reward.DEFAULT;
                }
                rewardAdStatusListener.onRewarded(reward);
            }
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewarded(new cb(rewardItem));
            }
        }

        @Override // ga.f
        public void C() {
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdStarted();
            }
        }

        @Override // ga.e
        public void Code() {
            RewardAdStatusListener rewardAdStatusListener = this.V;
            if (rewardAdStatusListener != null) {
                rewardAdStatusListener.onRewardAdOpened();
            }
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdOpened();
            }
        }

        @Override // ga.e
        public void I() {
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdCompleted();
            }
        }

        @Override // ga.f
        public void S() {
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdLeftApp();
            }
        }

        @Override // ga.e
        public void Z() {
            RewardAdStatusListener rewardAdStatusListener = this.V;
            if (rewardAdStatusListener != null) {
                rewardAdStatusListener.onRewardAdClosed();
            }
            RewardAdListener rewardAdListener = this.I;
            if (rewardAdListener != null) {
                rewardAdListener.onRewardAdClosed();
            }
        }

        @Override // ga.e
        public void Code(int i10, int i11) {
            RewardAdStatusListener rewardAdStatusListener = this.V;
            if (rewardAdStatusListener != null) {
                rewardAdStatusListener.onRewardAdFailedToShow(0);
            }
        }

        @Override // ga.e
        public void V() {
        }
    }

    private RewardAd(Context context) {
        if (context != null) {
            this.V = context.getApplicationContext();
        }
    }

    @GlobalApi
    public static RewardAd createRewardAdInstance(Context context) {
        return new RewardAd(context);
    }

    @GlobalApi
    public void destroy() {
    }

    @GlobalApi
    public String getData() {
        return this.f21773a;
    }

    @GlobalApi
    public Bundle getMetadata() {
        return this.D;
    }

    @GlobalApi
    public Reward getReward() {
        return this.B;
    }

    @GlobalApi
    public RewardAdListener getRewardAdListener() {
        return this.L;
    }

    @GlobalApi
    public String getUserId() {
        return this.f21774b;
    }

    @GlobalApi
    public boolean isLoaded() {
        return this.I;
    }

    @GlobalApi
    public void loadAd(AdParam adParam, RewardAdLoadListener rewardAdLoadListener) {
        k.Code().Code(this.V);
        Code();
        Code(adParam);
        this.F.f28324d = new a(rewardAdLoadListener, null);
        this.F.a(this.f21776d);
    }

    @GlobalApi
    public void pause() {
    }

    @GlobalApi
    public void resume() {
    }

    @GlobalApi
    public void setData(String str) {
        this.f21773a = str;
    }

    @GlobalApi
    public void setImmersive(boolean z10) {
        this.f21775c = z10;
    }

    @GlobalApi
    public void setMobileDataAlertSwitch(boolean z10) {
        this.f21777e = z10;
    }

    @GlobalApi
    public void setOnMetadataChangedListener(OnMetadataChangedListener onMetadataChangedListener) {
        this.Code = onMetadataChangedListener;
    }

    @GlobalApi
    public void setRewardAdListener(RewardAdListener rewardAdListener) {
        this.L = rewardAdListener;
    }

    @GlobalApi
    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        this.C = rewardVerifyConfig;
    }

    @GlobalApi
    public void setUserId(String str) {
        this.f21774b = str;
    }

    @GlobalApi
    @Deprecated
    public void show() {
        Code(this.V);
    }

    @GlobalApi
    public RewardAd(Context context, String str) {
        this.Z = str;
        this.V = context.getApplicationContext();
        this.F = new v(context, TextUtils.isEmpty(str) ? null : new String[]{str});
        this.f21776d = h0.c(context);
    }

    @GlobalApi
    public void destroy(Context context) {
    }

    @GlobalApi
    public void pause(Context context) {
    }

    @GlobalApi
    public void resume(Context context) {
    }

    @GlobalApi
    public void show(Activity activity) {
        Code(activity);
    }

    @GlobalApi
    public void loadAd(String str, AdParam adParam) {
        this.Z = str;
        k.Code().Code(this.V);
        Code();
        v vVar = new v(this.V, TextUtils.isEmpty(str) ? null : new String[]{str});
        this.F = vVar;
        vVar.f28324d = new a(null, this.L);
        Code(adParam);
        this.F.a(this.f21776d);
    }

    @GlobalApi
    public void show(Activity activity, RewardAdStatusListener rewardAdStatusListener) {
        show(activity, rewardAdStatusListener, true);
    }

    private void Code() {
        this.I = false;
        this.S = null;
    }

    @GlobalApi
    public void show(Activity activity, RewardAdStatusListener rewardAdStatusListener, boolean z10) {
        int i10;
        m mVar = this.S;
        if (mVar == null) {
            i10 = 2;
        } else {
            if (!mVar.f22290t) {
                RewardVerifyConfig rewardVerifyConfig = this.C;
                if (rewardVerifyConfig != null) {
                    mVar.Code(rewardVerifyConfig);
                    this.S.V(this.C.getUserId());
                    this.S.Code(this.C.getData());
                }
                b bVar = new b(rewardAdStatusListener, null);
                m mVar2 = this.S;
                mVar2.f22294x = bVar;
                mVar2.l(activity, bVar);
                return;
            }
            i10 = 1;
        }
        Code(rewardAdStatusListener, i10);
    }

    private void Code(Context context) {
        m mVar;
        if (!this.I || (mVar = this.S) == null) {
            return;
        }
        mVar.V(this.f21774b);
        this.S.Code(this.f21773a);
        b bVar = new b(null, this.L);
        m mVar2 = this.S;
        mVar2.f22294x = bVar;
        mVar2.l(context, bVar);
    }

    private void Code(AdParam adParam) {
        if (adParam == null || this.F == null) {
            return;
        }
        RequestOptions V = adParam.V();
        v vVar = this.F;
        RequestOptions Code = cj.Code(V);
        vVar.f28325e = Code;
        App app = Code.getApp();
        if (app != null) {
            vVar.o = app;
        }
        this.F.f28329j = adParam.getKeywords();
        this.F.f28326g = adParam.getGender();
        this.F.f28327h = adParam.getTargetingContentUrl();
        this.F.f28328i = adParam.I();
        this.F.f28335q = adParam.C();
        this.F.f = adParam.Code();
        HiAd.getInstance(this.V).setCountryCode(adParam.Z());
    }

    private void Code(RewardAdStatusListener rewardAdStatusListener, int i10) {
        if (rewardAdStatusListener != null) {
            rewardAdStatusListener.onRewardAdFailedToShow(i10);
        }
    }
}
