package com.anythink.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.b.g;
import com.vungle.warren.HeaderBiddingCallback;
import com.vungle.warren.InitCallback;
import com.vungle.warren.Plugin;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class VungleATInitManager extends ATInitMediation {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12827a = "VungleATInitManager";

    /* renamed from: b, reason: collision with root package name */
    private static volatile VungleATInitManager f12828b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12829c;

    /* renamed from: d, reason: collision with root package name */
    private List<MediationInitCallback> f12830d;
    private Map<String, HeaderBiddingCallback> f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12833h;

    /* renamed from: i, reason: collision with root package name */
    private String f12834i;

    /* renamed from: e, reason: collision with root package name */
    private final Object f12831e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, WeakReference> f12832g = new ConcurrentHashMap();

    /* renamed from: com.anythink.network.vungle.VungleATInitManager$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements HeaderBiddingCallback {
        public AnonymousClass2() {
        }

        @Override // com.vungle.warren.HeaderBiddingCallback
        public final void adAvailableForBidToken(String str, String str2) {
            HeaderBiddingCallback headerBiddingCallback = (HeaderBiddingCallback) VungleATInitManager.this.f.remove(str);
            if (headerBiddingCallback != null) {
                try {
                    headerBiddingCallback.adAvailableForBidToken(str, str2);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.vungle.warren.HeaderBiddingCallback
        public final void onBidTokenAvailable(String str, String str2) {
            HeaderBiddingCallback headerBiddingCallback = (HeaderBiddingCallback) VungleATInitManager.this.f.remove(str);
            if (headerBiddingCallback != null) {
                try {
                    headerBiddingCallback.onBidTokenAvailable(str, str2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface InitListener {
        void onError(Throwable th);

        void onSuccess();
    }

    private VungleATInitManager() {
    }

    public static VungleATInitManager getInstance() {
        if (f12828b == null) {
            synchronized (VungleATInitManager.class) {
                if (f12828b == null) {
                    f12828b = new VungleATInitManager();
                }
            }
        }
        return f12828b;
    }

    public final WeakReference b(String str) {
        return this.f12832g.remove(str);
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return com.vungle.warren.BuildConfig.OMSDK_PARTNER_NAME;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.vungle.warren.Vungle";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return VungleATConst.getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        hashMap.put("play-services-ads-identifier-*.aar", bool);
        hashMap.put("play-services-basement-*.aar", bool);
        hashMap.put("gson-*.aar", bool);
        hashMap.put("okhttp-*.jar", bool);
        hashMap.put("okio-*.jar", bool);
        try {
            hashMap.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            hashMap.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            hashMap.put("gson-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            hashMap.put("okhttp-*.jar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            hashMap.put("okio-*.jar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        return hashMap;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        synchronized (this.f12831e) {
            String obj = map.get("app_id").toString();
            if (map.containsKey(ATInitMediation.KEY_LOCAL)) {
                this.f12834i = obj;
            } else {
                String str = this.f12834i;
                if (str != null && !TextUtils.equals(str, obj)) {
                    checkToSaveInitData(getNetworkName(), map, this.f12834i);
                    this.f12834i = null;
                }
            }
            if (this.f12830d == null) {
                this.f12830d = new ArrayList();
            }
            try {
                if (((Boolean) map.get(g.k.f5112c)).booleanValue()) {
                    Vungle.updateCCPAStatus(Vungle.Consent.OPTED_IN);
                }
            } catch (Throwable unused) {
            }
            try {
                Vungle.updateUserCoppaStatus(((Boolean) map.get(g.k.f5113d)).booleanValue());
            } catch (Throwable unused2) {
            }
            if (!Vungle.isInitialized()) {
                if (mediationInitCallback != null) {
                    this.f12830d.add(mediationInitCallback);
                }
                if (this.f12829c) {
                    return;
                }
                this.f12829c = true;
                Plugin.addWrapperInfo(VungleApiClient.WrapperFramework.vunglehbs, "7.0.0");
                Vungle.init(obj, context.getApplicationContext(), new InitCallback() { // from class: com.anythink.network.vungle.VungleATInitManager.1
                    @Override // com.vungle.warren.InitCallback
                    public final void onError(VungleException vungleException) {
                        VungleATInitManager.a(VungleATInitManager.this, false, vungleException);
                    }

                    @Override // com.vungle.warren.InitCallback
                    public final void onSuccess() {
                        VungleATInitManager.a(VungleATInitManager.this, true, (VungleException) null);
                    }

                    @Override // com.vungle.warren.InitCallback
                    public final void onAutoCacheAdAvailable(String str2) {
                    }
                }, new VungleSettings.Builder().disableBannerRefresh().build());
            } else if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
            }
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        Vungle.Consent consent;
        if (z10) {
            consent = Vungle.Consent.OPTED_IN;
        } else {
            consent = Vungle.Consent.OPTED_OUT;
        }
        Vungle.updateConsentStatus(consent, "1.0.0");
        return true;
    }

    private void a() {
        Vungle.setHeaderBiddingCallback(new AnonymousClass2());
    }

    private void a(boolean z10, VungleException vungleException) {
        synchronized (this.f12831e) {
            this.f12829c = false;
            int size = this.f12830d.size();
            for (int i10 = 0; i10 < size; i10++) {
                MediationInitCallback mediationInitCallback = this.f12830d.get(i10);
                if (mediationInitCallback != null) {
                    if (z10) {
                        mediationInitCallback.onSuccess();
                    } else {
                        mediationInitCallback.onFail(vungleException.getLocalizedMessage());
                    }
                }
            }
            this.f12830d.clear();
        }
    }

    public final void a(String str, HeaderBiddingCallback headerBiddingCallback) {
        if (this.f == null) {
            this.f = new ConcurrentHashMap(3);
        }
        this.f.put(str, headerBiddingCallback);
        synchronized (this.f12831e) {
            if (!this.f12833h) {
                this.f12833h = true;
                Vungle.setHeaderBiddingCallback(new AnonymousClass2());
            }
        }
    }

    public final void a(String str) {
        Map<String, HeaderBiddingCallback> map = this.f;
        if (map != null) {
            map.remove(str);
        }
    }

    public final void a(String str, WeakReference weakReference) {
        try {
            this.f12832g.put(str, weakReference);
        } catch (Throwable unused) {
        }
    }

    public final void a(final Context context, final Map<String, Object> map, final ATBidRequestInfoListener aTBidRequestInfoListener) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.vungle.VungleATInitManager.3
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
                ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener2 != null) {
                    aTBidRequestInfoListener2.onFailed(str);
                }
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                VungleATInitManager.this.runOnThreadPool(new Runnable() { // from class: com.anythink.network.vungle.VungleATInitManager.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        VungleBidRequestInfo vungleBidRequestInfo = new VungleBidRequestInfo(context, map);
                        if (!vungleBidRequestInfo.isValid()) {
                            ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                            if (aTBidRequestInfoListener2 != null) {
                                aTBidRequestInfoListener2.onFailed(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                                return;
                            }
                            return;
                        }
                        ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                        if (aTBidRequestInfoListener3 != null) {
                            aTBidRequestInfoListener3.onSuccess(vungleBidRequestInfo);
                        }
                    }
                });
            }
        });
    }

    public static /* synthetic */ void a(VungleATInitManager vungleATInitManager, boolean z10, VungleException vungleException) {
        synchronized (vungleATInitManager.f12831e) {
            vungleATInitManager.f12829c = false;
            int size = vungleATInitManager.f12830d.size();
            for (int i10 = 0; i10 < size; i10++) {
                MediationInitCallback mediationInitCallback = vungleATInitManager.f12830d.get(i10);
                if (mediationInitCallback != null) {
                    if (z10) {
                        mediationInitCallback.onSuccess();
                    } else {
                        mediationInitCallback.onFail(vungleException.getLocalizedMessage());
                    }
                }
            }
            vungleATInitManager.f12830d.clear();
        }
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }
}
