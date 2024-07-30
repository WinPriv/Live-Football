package com.anythink.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.vungle.VungleATNativeAd;
import com.vungle.warren.AdConfig;
import java.util.Map;

/* loaded from: classes.dex */
public class VungleATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f12810a;

    /* renamed from: b, reason: collision with root package name */
    AdConfig f12811b;

    /* renamed from: com.anythink.network.vungle.VungleATAdapter$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements VungleATNativeAd.LoadCallbackListener {
        public AnonymousClass2() {
        }

        @Override // com.anythink.network.vungle.VungleATNativeAd.LoadCallbackListener
        public final void onFail(String str, String str2) {
            if (((ATBaseAdAdapter) VungleATAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) VungleATAdapter.this).mLoadListener.onAdLoadError(str, str2);
            }
        }

        @Override // com.anythink.network.vungle.VungleATNativeAd.LoadCallbackListener
        public final void onSuccess(CustomNativeAd customNativeAd) {
            if (((ATBaseAdAdapter) VungleATAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) VungleATAdapter.this).mLoadListener.onAdCacheLoaded(customNativeAd);
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return VungleATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12810a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return VungleATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.f12810a = (String) map.get("placement_id");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f12810a)) {
            this.f12811b = new AdConfig();
            if (map2 != null) {
                try {
                    if (map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                        int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                        if (parseInt != 0) {
                            if (parseInt != 1) {
                                if (parseInt != 2) {
                                    if (parseInt == 3) {
                                        this.f12811b.setAdOptionsPosition(2);
                                    }
                                } else {
                                    this.f12811b.setAdOptionsPosition(3);
                                }
                            } else {
                                this.f12811b.setAdOptionsPosition(1);
                            }
                        } else {
                            this.f12811b.setAdOptionsPosition(0);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            VungleATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.vungle.VungleATAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str2) {
                    if (((ATBaseAdAdapter) VungleATAdapter.this).mLoadListener != null) {
                        ((ATBaseAdAdapter) VungleATAdapter.this).mLoadListener.onAdLoadError("", str2);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    VungleATAdapter.a(VungleATAdapter.this, context.getApplicationContext());
                }
            });
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", " appid & placementId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return VungleATInitManager.getInstance().setUserDataConsent(context, z10, z11);
    }

    private void a(Context context) {
        new VungleATNativeAd(context, this.f12810a, this.f12811b, new AnonymousClass2()).startLoadAd();
    }

    public static /* synthetic */ void a(VungleATAdapter vungleATAdapter, Context context) {
        new VungleATNativeAd(context, vungleATAdapter.f12810a, vungleATAdapter.f12811b, new AnonymousClass2()).startLoadAd();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
    }
}
