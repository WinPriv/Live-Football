package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationBidManager;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.facebook.FacebookATBaseNativeAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeBannerAd;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f12638a;

    /* renamed from: b, reason: collision with root package name */
    String f12639b = "";

    /* renamed from: c, reason: collision with root package name */
    String f12640c = "0";

    /* renamed from: d, reason: collision with root package name */
    String f12641d = "";

    /* renamed from: e, reason: collision with root package name */
    boolean f12642e = false;

    /* renamed from: com.anythink.network.facebook.FacebookATAdapter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements FacebookATBaseNativeAd.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FacebookATBaseNativeAd f12643a;

        public AnonymousClass1(FacebookATBaseNativeAd facebookATBaseNativeAd) {
            this.f12643a = facebookATBaseNativeAd;
        }

        @Override // com.anythink.network.facebook.FacebookATBaseNativeAd.a
        public final void onLoadFail(String str, String str2) {
            if (((ATBaseAdAdapter) FacebookATAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) FacebookATAdapter.this).mLoadListener.onAdLoadError(str, str2);
            }
        }

        @Override // com.anythink.network.facebook.FacebookATBaseNativeAd.a
        public final void onLoadSuccess() {
            if (((ATBaseAdAdapter) FacebookATAdapter.this).mLoadListener != null && ((ATBaseAdAdapter) FacebookATAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) FacebookATAdapter.this).mLoadListener.onAdCacheLoaded(this.f12643a);
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12639b = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, false, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12639b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        char c10;
        FacebookATBaseNativeAd facebookATNativeBannerExpressAd;
        try {
            if (map.containsKey("unit_id")) {
                this.f12639b = map.get("unit_id").toString();
            }
            if (map.containsKey("unit_type")) {
                this.f12640c = map.get("unit_type").toString();
            }
            if (map.containsKey(ContentRecord.HEIGHT)) {
                this.f12641d = map.get(ContentRecord.HEIGHT).toString();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (TextUtils.isEmpty(this.f12639b)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "facebook unitId is empty.");
                return;
            }
            return;
        }
        if (map != null) {
            try {
                this.f12642e = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
            } catch (Exception unused) {
            }
        }
        FacebookATInitManager.getInstance().initSDK(context.getApplicationContext(), map);
        if (map.containsKey("payload")) {
            this.f12638a = map.get("payload").toString();
        }
        String str = this.f12640c;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 49:
                if (str.equals("1")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    facebookATNativeBannerExpressAd = new FacebookATNativeAd(context, new NativeAd(context, this.f12639b));
                } else {
                    facebookATNativeBannerExpressAd = new FacebookATNativeBannerAd(context, new NativeBannerAd(context, this.f12639b));
                }
            } else {
                facebookATNativeBannerExpressAd = new FacebookATNativeExpressAd(context, new NativeAd(context, this.f12639b));
            }
        } else {
            facebookATNativeBannerExpressAd = new FacebookATNativeBannerExpressAd(context, new NativeBannerAd(context, this.f12639b), this.f12641d);
        }
        facebookATNativeBannerExpressAd.loadAd(this.f12638a, new AnonymousClass1(facebookATNativeBannerExpressAd));
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(Context context, Map<String, Object> map) {
        char c10;
        FacebookATBaseNativeAd facebookATNativeBannerExpressAd;
        if (map.containsKey("payload")) {
            this.f12638a = map.get("payload").toString();
        }
        String str = this.f12640c;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 49:
                if (str.equals("1")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            facebookATNativeBannerExpressAd = new FacebookATNativeBannerExpressAd(context, new NativeBannerAd(context, this.f12639b), this.f12641d);
        } else if (c10 == 1) {
            facebookATNativeBannerExpressAd = new FacebookATNativeExpressAd(context, new NativeAd(context, this.f12639b));
        } else if (c10 != 2) {
            facebookATNativeBannerExpressAd = new FacebookATNativeAd(context, new NativeAd(context, this.f12639b));
        } else {
            facebookATNativeBannerExpressAd = new FacebookATNativeBannerAd(context, new NativeBannerAd(context, this.f12639b));
        }
        facebookATNativeBannerExpressAd.loadAd(this.f12638a, new AnonymousClass1(facebookATNativeBannerExpressAd));
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
    }
}
