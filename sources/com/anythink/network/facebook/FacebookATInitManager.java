package com.anythink.network.facebook;

import android.content.Context;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.b.g;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookATInitManager extends ATInitMediation {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12661b = "FacebookATInitManager";

    /* renamed from: c, reason: collision with root package name */
    private static volatile FacebookATInitManager f12662c;

    /* renamed from: a, reason: collision with root package name */
    List<MediationInitCallback> f12663a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12664d = false;

    /* renamed from: e, reason: collision with root package name */
    private Object f12665e = new Object();

    /* loaded from: classes.dex */
    public interface InitListener {
        void onError(String str);

        void onSuccess();
    }

    private FacebookATInitManager() {
    }

    private void a(AudienceNetworkAds.InitResult initResult) {
        synchronized (this.f12665e) {
            List<MediationInitCallback> list = this.f12663a;
            if (list != null) {
                for (MediationInitCallback mediationInitCallback : list) {
                    if (initResult.isSuccess()) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    } else if (mediationInitCallback != null) {
                        mediationInitCallback.onFail(initResult.getMessage());
                    }
                }
            }
            this.f12664d = false;
        }
    }

    public static FacebookATInitManager getInstance() {
        if (f12662c == null) {
            synchronized (FacebookATInitManager.class) {
                if (f12662c == null) {
                    f12662c = new FacebookATInitManager();
                }
            }
        }
        return f12662c;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Facebook";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.facebook.ads.AudienceNetworkAds";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return FacebookATConst.getNetworkVersion();
    }

    public void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.anythink.core.api.ATInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        try {
            if (((Boolean) map.get(g.k.f5112c)).booleanValue()) {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 1, 1000);
            }
        } catch (Throwable unused) {
        }
        try {
            if (((Boolean) map.get(g.k.f5113d)).booleanValue()) {
                AdSettings.setMixedAudience(true);
            }
        } catch (Throwable unused2) {
        }
        try {
            synchronized (this.f12665e) {
                if (AudienceNetworkAds.isInitialized(context)) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                if (this.f12663a == null) {
                    this.f12663a = new ArrayList();
                }
                if (mediationInitCallback != null) {
                    this.f12663a.add(mediationInitCallback);
                }
                if (this.f12664d) {
                    return;
                }
                this.f12664d = true;
                AudienceNetworkAds.buildInitSettings(context.getApplicationContext()).withInitListener(new AudienceNetworkAds.InitListener() { // from class: com.anythink.network.facebook.FacebookATInitManager.1
                    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                        FacebookATInitManager.a(FacebookATInitManager.this, initResult);
                    }
                }).initialize();
            }
        } catch (Throwable unused3) {
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).optString(AdSDKNotificationListener.ENCRYPTED_CPM_KEY);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void a(final Context context, final Map<String, Object> map, final boolean z10, final ATBidRequestInfoListener aTBidRequestInfoListener) {
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.facebook.FacebookATInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidRequestInfo facebookBidRequestInfo = new FacebookBidRequestInfo(context, map);
                if (z10) {
                    facebookBidRequestInfo.fillBannerData(map);
                }
                if (!facebookBidRequestInfo.isValid()) {
                    ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                    if (aTBidRequestInfoListener2 != null) {
                        aTBidRequestInfoListener2.onFailed(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                        return;
                    }
                    return;
                }
                ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener3 != null) {
                    aTBidRequestInfoListener3.onSuccess(facebookBidRequestInfo);
                }
            }
        });
    }

    public static /* synthetic */ void a(FacebookATInitManager facebookATInitManager, AudienceNetworkAds.InitResult initResult) {
        synchronized (facebookATInitManager.f12665e) {
            List<MediationInitCallback> list = facebookATInitManager.f12663a;
            if (list != null) {
                for (MediationInitCallback mediationInitCallback : list) {
                    if (initResult.isSuccess()) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    } else if (mediationInitCallback != null) {
                        mediationInitCallback.onFail(initResult.getMessage());
                    }
                }
            }
            facebookATInitManager.f12664d = false;
        }
    }
}
