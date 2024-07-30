package com.huawei.hms.ads.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.transition.n;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jb;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.h;
import com.huawei.openalliance.ad.views.PPSSplashView;
import gb.e;
import java.util.List;

@GlobalApi
/* loaded from: classes2.dex */
public class SplashView extends PPSSplashView {
    private SplashAdDisplayListener D;
    private SplashAdLoadListener F;

    @GlobalApi
    public SplashView(Context context) {
        super(context);
    }

    private void Z() {
        Integer n10;
        String str;
        if (isLoading()) {
            SplashAdLoadListener splashAdLoadListener = this.F;
            if (splashAdLoadListener != null) {
                splashAdLoadListener.onAdFailedToLoad(4);
                return;
            }
            return;
        }
        jb splashPresenter = getSplashPresenter();
        if (!splashPresenter.V()) {
            return;
        }
        AdSlotParam adSlotParam = getAdSlotParam();
        if (splashPresenter.C() && adSlotParam != null && (n10 = adSlotParam.n()) != null && n10.intValue() == 0) {
            List<String> f = adSlotParam.f();
            if (!n.h(f)) {
                str = f.get(0);
            } else {
                str = null;
            }
            splashPresenter.Code(str, 1);
            splashPresenter.S();
            return;
        }
        if (adSlotParam != null) {
            e.b(getContext().getApplicationContext(), adSlotParam.a());
        }
        getSplashPresenter().Code();
    }

    private void setAdLoadListener(SplashAdLoadListener splashAdLoadListener) {
        this.F = splashAdLoadListener;
        getSplashPresenter().Code(splashAdLoadListener);
        if (getAdMediator() != null) {
            getAdMediator().Code(splashAdLoadListener);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView, com.huawei.hms.ads.ka
    public void Code(int i10) {
        super.Code(i10);
        getAdMediator().Code(this.F);
        getAdMediator().Code(this.D);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView, com.huawei.hms.ads.km
    @GlobalApi
    public void destroyView() {
        super.destroyView();
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public boolean isLoaded() {
        return super.isLoaded();
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public boolean isLoading() {
        return super.isLoading();
    }

    @GlobalApi
    public void load(String str, int i10, AdParam adParam, SplashAdLoadListener splashAdLoadListener) {
        this.C = System.currentTimeMillis();
        ex.V("SplashView", h.Code);
        setAdLoadListener(splashAdLoadListener);
        AdSlotParam.a aVar = new AdSlotParam.a();
        SplashAd.Code(getContext(), str, i10, adParam, aVar);
        super.setAdSlotParam(aVar.b());
        Z();
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView, com.huawei.hms.ads.km
    @GlobalApi
    public void pauseView() {
        super.pauseView();
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView, com.huawei.hms.ads.km
    @GlobalApi
    public void resumeView() {
        super.resumeView();
    }

    @GlobalApi
    public void setAdDisplayListener(SplashAdDisplayListener splashAdDisplayListener) {
        this.D = splashAdDisplayListener;
        if (getAdMediator() != null) {
            getAdMediator().Code(this.D);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setAudioFocusType(int i10) {
        super.setAudioFocusType(i10);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setLogo(View view) {
        super.setLogo(view);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setLogoBitmap(Bitmap bitmap) {
        super.setLogoBitmap(bitmap);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setLogoResId(int i10) {
        super.setLogoResId(i10);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setMediaNameResId(int i10) {
        super.setMediaNameResId(i10);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setMediaNameString(String str) {
        super.setMediaNameString(str);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        super.setRewardVerifyConfig(rewardVerifyConfig);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setSloganResId(int i10) {
        super.setSloganResId(i10);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setSloganView(View view) {
        super.setSloganView(view);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setWideSloganResId(int i10) {
        super.setWideSloganResId(i10);
    }

    @GlobalApi
    public SplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.views.PPSSplashView
    @GlobalApi
    public void setLogo(View view, int i10) {
        super.setLogo(view, i10);
    }

    @GlobalApi
    public SplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @GlobalApi
    /* loaded from: classes2.dex */
    public static abstract class SplashAdLoadListener {
        @GlobalApi
        public void onAdDismissed() {
        }

        @GlobalApi
        public void onAdLoaded() {
        }

        @GlobalApi
        public void onAdFailedToLoad(int i10) {
        }
    }
}
