package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ag extends AbstractC1414b implements RewardedVideoSmashListener {

    /* renamed from: t, reason: collision with root package name */
    public final JSONObject f25308t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f25309u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f25310v;

    /* renamed from: w, reason: collision with root package name */
    public int f25311w;

    /* renamed from: x, reason: collision with root package name */
    public long f25312x;
    public final String y;

    /* renamed from: z, reason: collision with root package name */
    public final int f25313z;

    public ag(NetworkSettings networkSettings, int i10) {
        super(networkSettings);
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.f25308t = rewardedVideoSettings;
        this.o = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.f25333p = rewardedVideoSettings.optInt("maxAdsPerSession", 99);
        this.f25331m = rewardedVideoSettings.optInt("maxAdsPerDay", 99);
        this.y = rewardedVideoSettings.optString(IronSourceConstants.REQUEST_URL);
        this.f25310v = new AtomicBoolean(false);
        this.f25313z = i10;
    }

    @Override // com.ironsource.mediationsdk.AbstractC1414b
    public final void h() {
        AbstractC1414b.a aVar;
        this.f25328j = 0;
        if (o()) {
            aVar = AbstractC1414b.a.AVAILABLE;
        } else {
            aVar = AbstractC1414b.a.NOT_AVAILABLE;
        }
        a(aVar);
    }

    @Override // com.ironsource.mediationsdk.AbstractC1414b
    public final String i() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    public final void k(int i10, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                this.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    public final void n() {
        this.f25335r = null;
        if (this.f25321b != null) {
            AbstractC1414b.a aVar = this.f25320a;
            if (aVar != AbstractC1414b.a.CAPPED_PER_DAY && aVar != AbstractC1414b.a.CAPPED_PER_SESSION) {
                this.f25310v.set(true);
                this.f25312x = new Date().getTime();
            }
            this.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), this.f25324e, ":fetchRewardedVideoForAutomaticLoad()"), 1);
            this.f25321b.fetchRewardedVideoForAutomaticLoad(this.f25308t, null, this);
        }
    }

    public final boolean o() {
        if (this.f25321b != null) {
            this.f25336s.log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.p(new StringBuilder(), this.f25324e, ":isRewardedVideoAvailable()"), 1);
            return this.f25321b.isRewardedVideoAvailable(this.f25308t);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.b(this);
        }
        n();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        l0 l0Var = this.f25309u;
        if (l0Var != null) {
            l0Var.g(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean z10) {
        int i10;
        AbstractC1414b.a aVar;
        int i11;
        f();
        if (this.f25310v.compareAndSet(true, false)) {
            long time = new Date().getTime() - this.f25312x;
            if (z10) {
                i11 = 1002;
            } else {
                i11 = 1200;
            }
            k(i11, new Object[][]{new Object[]{"duration", Long.valueOf(time)}});
        } else {
            if (z10) {
                i10 = IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE;
            } else {
                i10 = IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE;
            }
            k(i10, null);
        }
        if (d()) {
            if ((z10 && this.f25320a != AbstractC1414b.a.AVAILABLE) || (!z10 && this.f25320a != AbstractC1414b.a.NOT_AVAILABLE)) {
                if (z10) {
                    aVar = AbstractC1414b.a.AVAILABLE;
                } else {
                    aVar = AbstractC1414b.a.NOT_AVAILABLE;
                }
                a(aVar);
                if (z10) {
                    this.f25334q = Long.valueOf(System.currentTimeMillis());
                }
                l0 l0Var = this.f25309u;
                if (l0Var != null) {
                    l0Var.a(z10, this);
                }
            } else {
                IronLog.INTERNAL.info(this.f25324e + ": state remains " + z10 + " in smash, mediation remains unchanged");
            }
        } else {
            IronLog.INTERNAL.info(this.f25324e + ": is capped or exhausted");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long e10 = e0.i.e() - this.f25312x;
        if (ironSourceError.getErrorCode() == 1058) {
            k(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(e10)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f25335r = Long.valueOf(System.currentTimeMillis());
        }
        k(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(e10)}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }
}
