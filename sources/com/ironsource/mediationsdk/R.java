package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class R<Listener extends AdapterAdInteractionListener> extends BaseAdInteractionAdapter<R<Listener>, Listener> implements AdapterDebugInterface, AdapterAPSDataInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, AdapterMetaDataInterface, AdapterSettingsInterface, InterstitialSmashListener, RewardedVideoSmashListener {

    /* renamed from: c, reason: collision with root package name */
    public AbstractAdapter f24948c;

    /* renamed from: d, reason: collision with root package name */
    public IronSource.AD_UNIT f24949d;

    /* renamed from: e, reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.b.d f24950e;
    public NetworkInitializationListener f;

    /* renamed from: g, reason: collision with root package name */
    public AdapterAdInteractionListener f24951g;

    public R(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f24948c = abstractAdapter;
        this.f24949d = ad_unit;
        this.f24950e = new com.ironsource.mediationsdk.adunit.b.d(ad_unit, d.b.PROVIDER, null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f24948c.addInterstitialListener(this);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f24948c.addRewardedVideoListener(this);
            return;
        }
        IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
    }

    public final String a(String str) {
        String ad_unit = this.f24949d.toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return e0.i.f(ad_unit, " - ", str);
    }

    public final boolean b(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.f24949d;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            if (ironSourceError.getErrorCode() == 1158) {
                return true;
            }
            return false;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            if (ironSourceError.getErrorCode() == 1058) {
                return true;
            }
            return false;
        }
        IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final void collectBiddingData(JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            IronSource.AD_UNIT ad_unit = this.f24949d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f24948c.collectInterstitialBiddingData(jSONObject2, jSONObject, biddingDataCallback);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f24948c.collectRewardedVideoBiddingData(jSONObject2, jSONObject, biddingDataCallback);
                return;
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
        } catch (Throwable th) {
            String str = "collectBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
            if (dVar != null) {
                dVar.f.n(str);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final String getAdapterVersion() {
        try {
            return this.f24948c.getVersion();
        } catch (Exception e10) {
            String str = "Exception while calling adapter.getVersion() from " + this.f24948c.getProviderName() + " - " + e10.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.f24950e.f.m(str);
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final Map<String, Object> getBiddingData(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            IronSource.AD_UNIT ad_unit = this.f24949d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f24948c.getInterstitialBiddingData(jSONObject2, jSONObject);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f24948c.getRewardedVideoBiddingData(jSONObject2, jSONObject);
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
            if (dVar != null) {
                dVar.f.n(str);
                return null;
            }
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public final LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        try {
            if (this.f24949d == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f24948c.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings());
            }
            return LoadWhileShowSupportState.NONE;
        } catch (Exception e10) {
            IronLog.INTERNAL.error(a("Exception while calling adapter.getLoadWhileShowSupportedState from " + this.f24948c.getProviderName() + " - " + e10.getLocalizedMessage()));
            return LoadWhileShowSupportState.NONE;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final String getNetworkSDKVersion() {
        try {
            return this.f24948c.getCoreSDKVersion();
        } catch (Exception e10) {
            String str = "Exception while calling adapter.getCoreSDKVersion() from " + this.f24948c.getProviderName() + " - " + e10.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.f24950e.f.m(str);
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f = networkInitializationListener;
        String string = adData.getString("userId");
        try {
            String str = L.a().f24866s;
            if (!TextUtils.isEmpty(str)) {
                this.f24948c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f24948c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
            if (dVar != null) {
                dVar.f.n(str2);
            }
        }
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f24949d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num != null && num.intValue() == 1) {
                    this.f24948c.initInterstitial("", string, a10, this);
                    return;
                } else {
                    this.f24948c.initInterstitialForBidding("", string, a10, this);
                    return;
                }
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f24948c.initRewardedVideoWithCallback("", string, a10, this);
                return;
            }
            IronLog.INTERNAL.error("ad unit not supported - " + this.f24949d);
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            com.ironsource.mediationsdk.adunit.b.d dVar2 = this.f24950e;
            if (dVar2 != null) {
                dVar2.f.n(str3);
            }
            IronSource.AD_UNIT ad_unit2 = this.f24949d;
            if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
            } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, str3));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter
    public final boolean isAdAvailable(AdData adData) {
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f24949d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f24948c.isInterstitialReady(a10);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f24948c.isRewardedVideoAvailable(a10);
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
            if (dVar != null) {
                dVar.f.n(str);
                return false;
            }
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final /* synthetic */ void loadAd(AdData adData, Activity activity, Object obj) {
        this.f24951g = (AdapterAdInteractionListener) obj;
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        JSONObject a11 = com.ironsource.mediationsdk.c.b.a(adData.getAdUnitData());
        try {
            IronSource.AD_UNIT ad_unit = this.f24949d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num != null && num.intValue() == 1) {
                    this.f24948c.loadInterstitial(a10, a11, this);
                    return;
                } else {
                    this.f24948c.loadInterstitialForBidding(a10, a11, this, adData.getServerData());
                    return;
                }
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                Integer num2 = adData.getInt("instanceType");
                if (num2 != null && num2.intValue() == 1) {
                    this.f24948c.fetchRewardedVideoForAutomaticLoad(a10, a11, this);
                    return;
                } else {
                    this.f24948c.loadRewardedVideoForBidding(a10, a11, this, adData.getServerData());
                    return;
                }
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
            if (dVar != null) {
                dVar.f.n(str);
            }
            IronSource.AD_UNIT ad_unit2 = this.f24949d;
            if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
            } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener != null) {
            adapterAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener != null) {
            if (b(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            adapterAdInteractionListener.onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener != null) {
            adapterAdInteractionListener.onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdShowSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        NetworkInitializationListener networkInitializationListener = this.f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener != null) {
            adapterAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdRewardListener) {
            ((AdapterAdRewardListener) adapterAdInteractionListener).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener instanceof AdapterAdInteractionListener) {
            adapterAdInteractionListener.onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
        IronLog.INTERNAL.verbose(a("available = " + z10));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener != null) {
            if (z10) {
                adapterAdInteractionListener.onAdLoadSuccess();
            } else {
                adapterAdInteractionListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, "");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        NetworkInitializationListener networkInitializationListener = this.f;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError r4) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r3.a(r1)
            r0.verbose(r1)
            com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener r0 = r3.f24951g
            if (r0 == 0) goto L67
            boolean r0 = r3.b(r4)
            if (r0 == 0) goto L24
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r0 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL
            goto L5a
        L24:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = r3.f24949d
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            if (r0 != r1) goto L2b
            goto L52
        L2b:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            if (r0 != r1) goto L39
            int r0 = r4.getErrorCode()
            r1 = 1057(0x421, float:1.481E-42)
            if (r0 != r1) goto L52
            r0 = 1
            goto L53
        L39:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ad unit not supported - "
            r1.<init>(r2)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r3.f24949d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r3.a(r1)
            r0.error(r1)
        L52:
            r0 = 0
        L53:
            if (r0 == 0) goto L58
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r0 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED
            goto L5a
        L58:
            com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType r0 = com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL
        L5a:
            com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener r1 = r3.f24951g
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getErrorMessage()
            r1.onAdLoadFailed(r0, r2, r4)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.R.onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError):void");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdInteractionListener adapterAdInteractionListener = this.f24951g;
        if (adapterAdInteractionListener != null) {
            adapterAdInteractionListener.onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final void releaseMemory() {
        AbstractAdapter abstractAdapter = this.f24948c;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.releaseMemory(this.f24949d, new JSONObject());
                this.f24948c = null;
            } catch (Exception e10) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f24948c.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(a(str));
                this.f24950e.f.m(str);
            }
        }
        this.f = null;
        this.f24951g = null;
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
        if (dVar != null) {
            dVar.a();
            this.f24950e = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public final void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.k kVar = this.f24948c;
        if (kVar != null && (kVar instanceof SetAPSInterface)) {
            ((SetAPSInterface) kVar).setAPSData(ad_unit, jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public final void setAdapterDebug(boolean z10) {
        AbstractAdapter abstractAdapter = this.f24948c;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setAdapterDebug(Boolean.valueOf(z10));
            } catch (Exception e10) {
                String str = "Exception while calling adapter.setAdapterDebug(adapterDebug) from " + this.f24948c.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(a(str));
                this.f24950e.f.m(str);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public final void setConsent(boolean z10) {
        AbstractAdapter abstractAdapter = this.f24948c;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setConsent(z10);
            } catch (Exception e10) {
                String str = "Exception while calling adapter.setConsent(consent) from " + this.f24948c.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(a(str));
                this.f24950e.f.m(str);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public final void setMetaData(String str, List<String> list) {
        AbstractAdapter abstractAdapter = this.f24948c;
        if (abstractAdapter != null) {
            abstractAdapter.setMetaData(str, list);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter
    public final void showAd(AdData adData, Listener listener) {
        this.f24951g = listener;
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f24949d;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f24948c.showInterstitial(a10, this);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f24948c.showRewardedVideo(a10, this);
                return;
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f24949d));
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f24950e;
            if (dVar != null) {
                dVar.f.n(str);
            }
            IronSource.AD_UNIT ad_unit2 = this.f24949d;
            if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, str));
            } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, str));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
    }
}
