package com.vungle.warren;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.vungle.warren.AdConfig;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.log.LogManager;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.FutureResult;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.AdMarkupDecoder;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import d1.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m8.i;
import m8.j;
import m8.q;

@Keep
/* loaded from: classes2.dex */
public class Vungle {
    private static final int DEFAULT_SESSION_TIMEOUT = 900;
    private static volatile boolean isInitialized;
    volatile String appID;
    private volatile String consentVersion;
    private Context context;
    static final Vungle _instance = new Vungle();
    private static final String TAG = Vungle.class.getCanonicalName();
    private static AtomicBoolean isInitializing = new AtomicBoolean(false);
    private static AtomicBoolean isDepInit = new AtomicBoolean(false);
    private static i gson = new j().a();
    private static CacheManager.Listener cacheListener = new CacheManager.Listener() { // from class: com.vungle.warren.Vungle.19
        @Override // com.vungle.warren.persistence.CacheManager.Listener
        public void onCacheChanged() {
            Vungle vungle = Vungle._instance;
            if (vungle.context != null) {
                Vungle.stopPlaying();
                ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
                CacheManager cacheManager = (CacheManager) serviceLocator.getService(CacheManager.class);
                Downloader downloader = (Downloader) serviceLocator.getService(Downloader.class);
                if (cacheManager.getCache() != null) {
                    List<DownloadRequest> allRequests = downloader.getAllRequests();
                    String path = cacheManager.getCache().getPath();
                    for (DownloadRequest downloadRequest : allRequests) {
                        if (!downloadRequest.path.startsWith(path)) {
                            downloader.cancel(downloadRequest);
                        }
                    }
                }
                downloader.init();
            }
        }
    };
    private final AtomicReference<Consent> consent = new AtomicReference<>();
    private final AtomicReference<Consent> ccpaStatus = new AtomicReference<>();
    private Map<String, Boolean> playOperations = new ConcurrentHashMap();
    private AtomicInteger hbpOrdinalViewCount = new AtomicInteger(0);

    /* renamed from: com.vungle.warren.Vungle$12, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass12 implements Runnable {
        final /* synthetic */ Runnable val$OOMRunnable;
        final /* synthetic */ AdLoader val$adLoader;
        final /* synthetic */ PlayAdCallback val$listener;
        final /* synthetic */ String val$markup;
        final /* synthetic */ String val$placementId;
        final /* synthetic */ Repository val$repository;
        final /* synthetic */ Executors val$sdkExecutors;
        final /* synthetic */ AdConfig val$settings;
        final /* synthetic */ VungleApiClient val$vungleApiClient;

        public AnonymousClass12(String str, String str2, AdLoader adLoader, PlayAdCallback playAdCallback, Repository repository, AdConfig adConfig, VungleApiClient vungleApiClient, Executors executors, Runnable runnable) {
            this.val$markup = str;
            this.val$placementId = str2;
            this.val$adLoader = adLoader;
            this.val$listener = playAdCallback;
            this.val$repository = repository;
            this.val$settings = adConfig;
            this.val$vungleApiClient = vungleApiClient;
            this.val$sdkExecutors = executors;
            this.val$OOMRunnable = runnable;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
        
            if (r11.getState() == 1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
        
            if (r12 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
        
            r13.val$repository.saveAndApplyState(r11, r13.val$placementId, 4);
            r13.val$adLoader.loadEndlessIfNeeded(r0, r0.getAdSize(), 0, false);
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.AnonymousClass12.run():void");
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public enum Consent {
        OPTED_IN,
        OPTED_OUT
    }

    private Vungle() {
    }

    public static Context appContext() {
        Vungle vungle = _instance;
        if (vungle != null) {
            return vungle.context;
        }
        return null;
    }

    public static boolean canPlayAd(String str) {
        return canPlayAd(str, null);
    }

    private static void clearAdvertisements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
        } else {
            final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.15
                @Override // java.lang.Runnable
                public void run() {
                    ((Downloader) ServiceLocator.this.getService(Downloader.class)).cancelAll();
                    ((AdLoader) ServiceLocator.this.getService(AdLoader.class)).clear();
                    final Repository repository = (Repository) ServiceLocator.this.getService(Repository.class);
                    ((Executors) ServiceLocator.this.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.15.1
                        @Override // java.lang.Runnable
                        public void run() {
                            List list = (List) repository.loadAll(Advertisement.class).get();
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        repository.deleteAdvertisement(((Advertisement) it.next()).getId());
                                    } catch (DatabaseHelper.DBException unused) {
                                    }
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    private static void clearCache() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
        } else {
            final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.14
                @Override // java.lang.Runnable
                public void run() {
                    ((Downloader) ServiceLocator.this.getService(Downloader.class)).cancelAll();
                    ((AdLoader) ServiceLocator.this.getService(AdLoader.class)).clear();
                    ((Repository) ServiceLocator.this.getService(Repository.class)).clearAllData();
                    Vungle vungle = Vungle._instance;
                    vungle.playOperations.clear();
                    vungle.ccpaStatus.set(null);
                    vungle.configure(((RuntimeValues) ServiceLocator.this.getService(RuntimeValues.class)).initCallback.get(), true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configure(com.vungle.warren.InitCallback r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.configure(com.vungle.warren.InitCallback, boolean):void");
    }

    public static void deInit() {
        Vungle vungle = _instance;
        Context context = vungle.context;
        if (context != null) {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
            if (serviceLocator.isCreated(CacheManager.class)) {
                ((CacheManager) serviceLocator.getService(CacheManager.class)).removeListener(cacheListener);
            }
            if (serviceLocator.isCreated(Downloader.class)) {
                ((Downloader) serviceLocator.getService(Downloader.class)).cancelAll();
            }
            if (serviceLocator.isCreated(AdLoader.class)) {
                ((AdLoader) serviceLocator.getService(AdLoader.class)).clear();
            }
            vungle.playOperations.clear();
        }
        ServiceLocator.deInit();
        isInitialized = false;
        isDepInit.set(false);
        isInitializing.set(false);
    }

    public static Context getAppContext() {
        return _instance.context;
    }

    public static String getAvailableBidTokens(Context context) {
        return getAvailableBidTokens(context, null, 0);
    }

    @Deprecated
    public static String getAvailableBidTokensBySize(Context context, int i10) {
        return getAvailableBidTokens(context, null, i10);
    }

    public static VungleBannerView getBannerViewInternal(String str, AdMarkup adMarkup, AdConfig adConfig, PlayAdCallback playAdCallback) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized, returned VungleBannerView = null");
            onPlayError(str, playAdCallback, new VungleException(9));
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            onPlayError(str, playAdCallback, new VungleException(13));
            return null;
        }
        Vungle vungle = _instance;
        ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        AdRequest adRequest = new AdRequest(str, adMarkup, true);
        boolean isLoading = adLoader.isLoading(adRequest);
        if (!Boolean.TRUE.equals(vungle.playOperations.get(str)) && !isLoading) {
            try {
                return new VungleBannerView(vungle.context.getApplicationContext(), adRequest, adConfig, (PresentationFactory) serviceLocator.getService(PresentationFactory.class), new AdEventListener(adRequest, vungle.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), adLoader, (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), null, null));
            } catch (Exception e10) {
                VungleLogger.error("Vungle#playAd", "Vungle banner ad fail: " + e10.getLocalizedMessage());
                if (playAdCallback != null) {
                    playAdCallback.onError(str, new VungleException(10));
                }
                return null;
            }
        }
        Log.e(TAG, "Playing or Loading operation ongoing. Playing " + vungle.playOperations.get(adRequest.getPlacementId()) + " Loading: " + isLoading);
        onPlayError(str, playAdCallback, new VungleException(8));
        return null;
    }

    public static Consent getCCPAStatus() {
        return _instance.ccpaStatus.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getConsent(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        if ("opted_in".equals(cookie.getString("consent_status"))) {
            return Consent.OPTED_IN;
        }
        return Consent.OPTED_OUT;
    }

    public static String getConsentMessageVersion() {
        return _instance.consentVersion;
    }

    private static String getConsentSource(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return cookie.getString("consent_source");
    }

    public static Consent getConsentStatus() {
        if (isInitialized() && isDepInit.get()) {
            return getConsentStatus(getGDPRConsent());
        }
        return _instance.consent.get();
    }

    public static AdEventListener getEventListener(AdRequest adRequest, PlayAdCallback playAdCallback) {
        Vungle vungle = _instance;
        ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
        return new AdEventListener(adRequest, vungle.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), (AdLoader) serviceLocator.getService(AdLoader.class), (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), null, null);
    }

    private static Cookie getGDPRConsent() {
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        return (Cookie) ((Repository) serviceLocator.getService(Repository.class)).load(Cookie.CONSENT_COOKIE, Cookie.class).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
    }

    public static Collection<Advertisement> getValidAdvertisementModels(String str) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        List<Advertisement> list = ((Repository) serviceLocator.getService(Repository.class)).findValidAdvertisementsForPlacement(str, null).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static Collection<Placement> getValidPlacementModels() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Collection<Placement> collection = ((Repository) serviceLocator.getService(Repository.class)).loadValidPlacements().get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        if (collection == null) {
            return Collections.emptyList();
        }
        return collection;
    }

    public static Collection<String> getValidPlacements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Collection<String> collection = ((Repository) serviceLocator.getService(Repository.class)).getValidPlacementIds().get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        if (collection == null) {
            return Collections.emptyList();
        }
        return collection;
    }

    @Deprecated
    public static void init(Collection<String> collection, String str, Context context, InitCallback initCallback) throws IllegalArgumentException {
        init(str, context, initCallback, new VungleSettings.Builder().build());
    }

    public static boolean isInitialized() {
        if (isInitialized && _instance.context != null) {
            return true;
        }
        return false;
    }

    public static void loadAd(String str, LoadAdCallback loadAdCallback) {
        loadAd(str, new AdConfig(), loadAdCallback);
    }

    public static void loadAdInternal(String str, String str2, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        LoadAdCallback loadAdCallbackWrapper;
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            onLoadError(str, loadAdCallback, new VungleException(9));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        if (loadAdCallback instanceof LoadNativeAdCallback) {
            loadAdCallbackWrapper = new LoadNativeAdCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), (LoadNativeAdCallback) loadAdCallback);
        } else {
            loadAdCallbackWrapper = new LoadAdCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), loadAdCallback);
        }
        AdMarkup decode = AdMarkupDecoder.decode(str2);
        if (!TextUtils.isEmpty(str2) && decode == null) {
            onLoadError(str, loadAdCallback, new VungleException(36));
            return;
        }
        AdMarkup decode2 = AdMarkupDecoder.decode(str2);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        if (adConfig == null) {
            adConfig = new AdConfig();
        }
        adLoader.load(new AdRequest(str, decode2, true), adConfig, loadAdCallbackWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onInitError(InitCallback initCallback, VungleException vungleException) {
        String num;
        if (initCallback != null) {
            initCallback.onError(vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() != null && vungleException.getLocalizedMessage().isEmpty()) {
                num = vungleException.getLocalizedMessage();
            } else {
                num = Integer.toString(vungleException.getExceptionCode());
            }
            VungleLogger.error("Vungle#init", num);
        }
    }

    private static void onLoadError(String str, LoadAdCallback loadAdCallback, VungleException vungleException) {
        String num;
        if (loadAdCallback != null) {
            loadAdCallback.onError(str, vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() != null && vungleException.getLocalizedMessage().isEmpty()) {
                num = vungleException.getLocalizedMessage();
            } else {
                num = Integer.toString(vungleException.getExceptionCode());
            }
            VungleLogger.error("Vungle#loadAd", num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPlayError(String str, PlayAdCallback playAdCallback, VungleException vungleException) {
        String num;
        if (playAdCallback != null) {
            playAdCallback.onError(str, vungleException);
        }
        if (vungleException != null) {
            if (vungleException.getLocalizedMessage() != null && vungleException.getLocalizedMessage().isEmpty()) {
                num = vungleException.getLocalizedMessage();
            } else {
                num = Integer.toString(vungleException.getExceptionCode());
            }
            VungleLogger.error("Vungle#playAd", num);
        }
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
    }

    public static void playAd(String str, AdConfig adConfig, PlayAdCallback playAdCallback) {
        playAd(str, null, adConfig, playAdCallback);
    }

    public static void reConfigure() {
        Vungle vungle = _instance;
        Context context = vungle.context;
        if (context == null) {
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        final RuntimeValues runtimeValues = (RuntimeValues) serviceLocator.getService(RuntimeValues.class);
        if (isInitialized()) {
            executors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.3
                @Override // java.lang.Runnable
                public void run() {
                    Vungle._instance.configure(RuntimeValues.this.initCallback.get(), true);
                }
            }, new Runnable() { // from class: com.vungle.warren.Vungle.4
                @Override // java.lang.Runnable
                public void run() {
                    Vungle.onInitError(RuntimeValues.this.initCallback.get(), new VungleException(39));
                }
            });
        } else {
            init(vungle.appID, vungle.context, runtimeValues.initCallback.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void renderAd(AdRequest adRequest, PlayAdCallback playAdCallback, Placement placement, Advertisement advertisement) {
        synchronized (Vungle.class) {
            if (!isInitialized()) {
                Log.e(TAG, "Sdk is not initialized");
                return;
            }
            Vungle vungle = _instance;
            ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
            AdActivity.setEventListener(new AdEventListener(adRequest, vungle.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), (AdLoader) serviceLocator.getService(AdLoader.class), (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), placement, advertisement) { // from class: com.vungle.warren.Vungle.13
                @Override // com.vungle.warren.AdEventListener
                public void onFinished() {
                    super.onFinished();
                    AdActivity.setEventListener(null);
                }
            });
            ActivityManager.startWhenForeground(vungle.context, null, AdActivity.createIntent(vungle.context, adRequest), null);
        }
    }

    private void saveConfigExtension(Repository repository, q qVar) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.CONFIG_EXTENSION);
        String str = "";
        if (qVar.v(Cookie.CONFIG_EXTENSION)) {
            str = JsonUtil.getAsString(qVar, Cookie.CONFIG_EXTENSION, "");
        }
        cookie.putValue(Cookie.CONFIG_EXTENSION, str);
        ((BidTokenEncoder) ServiceLocator.getInstance(_instance.context).getService(BidTokenEncoder.class)).updateConfigExtension(str);
        repository.save(cookie);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveGDPRConsent(final Repository repository, final Consent consent, final String str, final BidTokenEncoder bidTokenEncoder) {
        repository.load(Cookie.CONSENT_COOKIE, Cookie.class, new Repository.LoadCallback<Cookie>() { // from class: com.vungle.warren.Vungle.16
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Cookie cookie) {
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CONSENT_COOKIE);
                }
                cookie.putValue("consent_status", Consent.this == Consent.OPTED_IN ? "opted_in" : "opted_out");
                cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                cookie.putValue("consent_source", "publisher");
                String str2 = str;
                if (str2 == null) {
                    str2 = "";
                }
                cookie.putValue("consent_message_version", str2);
                bidTokenEncoder.updateGDPRCookie(cookie);
                repository.save(cookie, null, false);
            }
        });
    }

    public static void setHeaderBiddingCallback(HeaderBiddingCallback headerBiddingCallback) {
        Context context = _instance.context;
        if (context == null) {
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        ((RuntimeValues) serviceLocator.getService(RuntimeValues.class)).headerBiddingCallback.set(new HeaderBiddingCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), headerBiddingCallback));
    }

    public static void setIncentivizedFields(final String str, final String str2, final String str3, final String str4, final String str5) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized, context is null");
        } else {
            final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.9
                @Override // java.lang.Runnable
                public void run() {
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    if (!Vungle.isInitialized()) {
                        Log.e(Vungle.TAG, "Vungle is not initialized");
                        return;
                    }
                    Repository repository = (Repository) ServiceLocator.this.getService(Repository.class);
                    Cookie cookie = (Cookie) repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get();
                    if (cookie == null) {
                        cookie = new Cookie(Cookie.INCENTIVIZED_TEXT_COOKIE);
                    }
                    String str10 = "";
                    if (TextUtils.isEmpty(str2)) {
                        str6 = "";
                    } else {
                        str6 = str2;
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str8 = "";
                    } else {
                        str8 = str4;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        str9 = "";
                    } else {
                        str9 = str5;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str10 = str;
                    }
                    cookie.putValue("title", str6);
                    cookie.putValue("body", str7);
                    cookie.putValue("continue", str8);
                    cookie.putValue("close", str9);
                    cookie.putValue("userID", str10);
                    try {
                        repository.save(cookie);
                    } catch (DatabaseHelper.DBException e10) {
                        Log.e(Vungle.TAG, "Cannot save incentivized cookie", e10);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stopPlaying() {
        Vungle vungle = _instance;
        if (vungle.context == null) {
            return;
        }
        Intent intent = new Intent(AdContract.AdvertisementBus.ACTION);
        intent.putExtra(AdContract.AdvertisementBus.COMMAND, AdContract.AdvertisementBus.STOP_ALL);
        a.a(vungle.context).c(intent);
    }

    public static void updateCCPAStatus(Consent consent) {
        if (consent == null) {
            Log.e(TAG, "Unable to update CCPA status, Invalid input parameter.");
            return;
        }
        Vungle vungle = _instance;
        vungle.ccpaStatus.set(consent);
        if (isInitialized() && isDepInit.get()) {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
            updateCCPAStatus((Repository) serviceLocator.getService(Repository.class), consent, (BidTokenEncoder) serviceLocator.getService(BidTokenEncoder.class));
        } else {
            Log.e(TAG, "Vungle is not initialized");
        }
    }

    public static void updateConsentStatus(Consent consent, String str) {
        if (consent == null) {
            Log.e(TAG, "Cannot set consent with a null consent, please check your code");
            return;
        }
        Vungle vungle = _instance;
        vungle.consent.set(consent);
        vungle.consentVersion = str;
        if (isInitialized() && isDepInit.get()) {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
            saveGDPRConsent((Repository) serviceLocator.getService(Repository.class), vungle.consent.get(), vungle.consentVersion, (BidTokenEncoder) serviceLocator.getService(BidTokenEncoder.class));
            return;
        }
        Log.e(TAG, "Vungle is not initialized");
    }

    public static void updateUserCoppaStatus(boolean z10) {
        PrivacyManager.getInstance().updateCoppaStatus(Boolean.valueOf(z10));
        if (isInitialized()) {
            Log.e(TAG, "COPPA status changes should be passed before SDK initialization, they will ONLY take into effect during future SDK initializations and sessions");
        }
    }

    public static boolean canPlayAd(final String str, final String str2) {
        final Context context = _instance.context;
        if (context == null) {
            Log.e(TAG, "Context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "AdMarkup/PlacementId is null");
            return false;
        }
        AdMarkup decode = AdMarkupDecoder.decode(str2);
        if (str2 != null && decode == null) {
            Log.e(TAG, "Invalid AdMarkup");
            return false;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        return Boolean.TRUE.equals(new FutureResult(executors.getApiExecutor().submit(new Callable<Boolean>() { // from class: com.vungle.warren.Vungle.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                if (!Vungle.isInitialized()) {
                    Log.e(Vungle.TAG, "Vungle is not initialized");
                    return Boolean.FALSE;
                }
                Repository repository = (Repository) ServiceLocator.getInstance(context).getService(Repository.class);
                AdMarkup decode2 = AdMarkupDecoder.decode(str2);
                String eventId = decode2 != null ? decode2.getEventId() : null;
                Placement placement = (Placement) repository.load(str, Placement.class).get();
                if (placement != null && placement.isValid()) {
                    if (placement.isMultipleHBPEnabled() && eventId == null) {
                        return Boolean.FALSE;
                    }
                    Advertisement advertisement = repository.findValidAdvertisementForPlacement(str, eventId).get();
                    if (advertisement == null) {
                        return Boolean.FALSE;
                    }
                    if (placement.getPlacementAdType() != 1 && (AdConfig.AdSize.isDefaultAdSize(placement.getAdSize()) || placement.getAdSize().equals(advertisement.getAdConfig().getAdSize()))) {
                        return Boolean.valueOf(Vungle.canPlayAd(advertisement));
                    }
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS));
    }

    public static String getAvailableBidTokens(Context context, final String str, final int i10) {
        if (context == null) {
            Log.e(TAG, "Context is null");
            return null;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        final BidTokenEncoder bidTokenEncoder = (BidTokenEncoder) serviceLocator.getService(BidTokenEncoder.class);
        return (String) new FutureResult(executors.getApiExecutor().submit(new Callable<String>() { // from class: com.vungle.warren.Vungle.18
            @Override // java.util.concurrent.Callable
            public String call() {
                String encode = BidTokenEncoder.this.encode(str, i10, Vungle._instance.hbpOrdinalViewCount.incrementAndGet());
                Log.d(Vungle.TAG, "Supertoken is " + encode);
                return encode;
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getCCPAStatus(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return "opted_out".equals(cookie.getString(Cookie.CCPA_CONSENT_STATUS)) ? Consent.OPTED_OUT : Consent.OPTED_IN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getConsentMessageVersion(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return cookie.getString("consent_message_version");
    }

    public static void init(String str, Context context, InitCallback initCallback) throws IllegalArgumentException {
        init(str, context, initCallback, new VungleSettings.Builder().build());
    }

    public static void loadAd(String str, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        loadAd(str, null, adConfig, loadAdCallback);
    }

    public static void playAd(final String str, String str2, AdConfig adConfig, PlayAdCallback playAdCallback) {
        VungleLogger.debug("Vungle#playAd", "playAd call invoked");
        SessionTracker.getInstance().trackAdConfig(adConfig);
        if (!isInitialized()) {
            Log.e(TAG, "Locator is not initialized");
            if (playAdCallback != null) {
                onPlayError(str, playAdCallback, new VungleException(9));
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            onPlayError(str, playAdCallback, new VungleException(13));
            return;
        }
        AdMarkup decode = AdMarkupDecoder.decode(str2);
        if (str2 != null && decode == null) {
            onPlayError(str, playAdCallback, new VungleException(36));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        Repository repository = (Repository) serviceLocator.getService(Repository.class);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        VungleApiClient vungleApiClient = (VungleApiClient) serviceLocator.getService(VungleApiClient.class);
        final PlayAdCallbackWrapper playAdCallbackWrapper = new PlayAdCallbackWrapper(executors.getUIExecutor(), playAdCallback);
        Runnable runnable = new Runnable() { // from class: com.vungle.warren.Vungle.11
            @Override // java.lang.Runnable
            public void run() {
                Vungle.onPlayError(str, playAdCallbackWrapper, new VungleException(39));
            }
        };
        executors.getBackgroundExecutor().execute(new AnonymousClass12(str2, str, adLoader, playAdCallbackWrapper, repository, adConfig, vungleApiClient, executors, runnable), runnable);
    }

    public static void init(final String str, final Context context, final InitCallback initCallback, VungleSettings vungleSettings) throws IllegalArgumentException {
        VungleLogger.debug("Vungle#init", "init request");
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT).build());
        if (initCallback == null) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            throw new IllegalArgumentException("A valid InitCallback required to ensure API calls are being made after initialize is successful");
        }
        if (context == null) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            initCallback.onError(new VungleException(6));
            return;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        final Platform platform = (Platform) serviceLocator.getService(Platform.class);
        if (!platform.isAtLeastMinimumSDK()) {
            Log.e(TAG, "SDK is supported only for API versions 21 and above");
            initCallback.onError(new VungleException(35));
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            return;
        }
        final RuntimeValues runtimeValues = (RuntimeValues) ServiceLocator.getInstance(context).getService(RuntimeValues.class);
        runtimeValues.settings.set(vungleSettings);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        InitCallback initCallbackWrapper = initCallback instanceof InitCallbackWrapper ? initCallback : new InitCallbackWrapper(executors.getUIExecutor(), initCallback);
        if (str != null && !str.isEmpty()) {
            if (!(context instanceof Application)) {
                initCallbackWrapper.onError(new VungleException(7));
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
                return;
            }
            if (isInitialized()) {
                Log.d(TAG, "init already complete");
                initCallbackWrapper.onSuccess();
                VungleLogger.debug("Vungle#init", "init already complete");
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
                return;
            }
            if (isInitializing.getAndSet(true)) {
                Log.d(TAG, "init ongoing");
                onInitError(initCallbackWrapper, new VungleException(8));
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
                return;
            } else if (a0.a.x0(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && a0.a.x0(context, "android.permission.INTERNET") == 0) {
                SessionTracker.getInstance().setInitTimestamp(System.currentTimeMillis());
                runtimeValues.initCallback.set(initCallbackWrapper);
                executors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Vungle vungle = Vungle._instance;
                        vungle.appID = str;
                        InitCallback initCallback2 = runtimeValues.initCallback.get();
                        if (!Vungle.isDepInit.getAndSet(true)) {
                            VungleLogger.setupLoggerWithLogLevel((LogManager) serviceLocator.getService(LogManager.class), VungleLogger.LoggerLevel.DEBUG, 100);
                            CacheManager cacheManager = (CacheManager) serviceLocator.getService(CacheManager.class);
                            VungleSettings vungleSettings2 = runtimeValues.settings.get();
                            if (vungleSettings2 != null && cacheManager.getBytesAvailable() < vungleSettings2.getMinimumSpaceForInit()) {
                                Vungle.onInitError(initCallback2, new VungleException(16));
                                Vungle.deInit();
                                return;
                            }
                            cacheManager.addListener(Vungle.cacheListener);
                            vungle.context = context;
                            Repository repository = (Repository) serviceLocator.getService(Repository.class);
                            try {
                                repository.init();
                                PrivacyManager.getInstance().init(((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor(), repository);
                                ((VungleApiClient) serviceLocator.getService(VungleApiClient.class)).init();
                                if (vungleSettings2 != null) {
                                    platform.setAndroidIdFallbackDisabled(vungleSettings2.getAndroidIdOptOut());
                                }
                                ((AdLoader) serviceLocator.getService(AdLoader.class)).init((JobRunner) serviceLocator.getService(JobRunner.class));
                                if (vungle.consent.get() != null) {
                                    Vungle.saveGDPRConsent(repository, (Consent) vungle.consent.get(), vungle.consentVersion, (BidTokenEncoder) serviceLocator.getService(BidTokenEncoder.class));
                                } else {
                                    Cookie cookie = (Cookie) repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get();
                                    if (cookie == null) {
                                        vungle.consent.set(null);
                                        vungle.consentVersion = null;
                                    } else {
                                        vungle.consent.set(Vungle.getConsent(cookie));
                                        vungle.consentVersion = Vungle.getConsentMessageVersion(cookie);
                                    }
                                }
                                if (vungle.ccpaStatus.get() != null) {
                                    Vungle.updateCCPAStatus(repository, (Consent) vungle.ccpaStatus.get(), (BidTokenEncoder) serviceLocator.getService(BidTokenEncoder.class));
                                } else {
                                    vungle.ccpaStatus.set(Vungle.getCCPAStatus((Cookie) repository.load(Cookie.CCPA_COOKIE, Cookie.class).get()));
                                }
                            } catch (DatabaseHelper.DBException unused) {
                                Vungle.onInitError(initCallback2, new VungleException(26));
                                Vungle.deInit();
                                return;
                            }
                        }
                        Repository repository2 = (Repository) serviceLocator.getService(Repository.class);
                        Cookie cookie2 = (Cookie) repository2.load("appId", Cookie.class).get();
                        if (cookie2 == null) {
                            cookie2 = new Cookie("appId");
                        }
                        cookie2.putValue("appId", str);
                        try {
                            repository2.save(cookie2);
                            vungle.configure(initCallback2, false);
                            ((JobRunner) serviceLocator.getService(JobRunner.class)).execute(AnalyticsJob.makeJob(2, null, null, 1));
                        } catch (DatabaseHelper.DBException unused2) {
                            if (initCallback2 != null) {
                                Vungle.onInitError(initCallback2, new VungleException(26));
                            }
                            Vungle.isInitializing.set(false);
                        }
                    }
                }, new Runnable() { // from class: com.vungle.warren.Vungle.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Vungle.onInitError(InitCallback.this, new VungleException(39));
                    }
                });
                return;
            } else {
                Log.e(TAG, "Network permissions not granted");
                onInitError(initCallbackWrapper, new VungleException(34));
                isInitializing.set(false);
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
                return;
            }
        }
        initCallbackWrapper.onError(new VungleException(6));
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
    }

    public static void loadAd(String str, String str2, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        VungleLogger.debug("Vungle#loadAd", "loadAd API call invoked");
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            onLoadError(str, loadAdCallback, new VungleException(9));
            return;
        }
        if (adConfig != null && !AdConfig.AdSize.isDefaultAdSize(adConfig.getAdSize())) {
            onLoadError(str, loadAdCallback, new VungleException(29));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Placement placement = (Placement) ((Repository) serviceLocator.getService(Repository.class)).load(str, Placement.class).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        if (placement != null && placement.getPlacementAdType() == 4) {
            onLoadError(str, loadAdCallback, new VungleException(41));
        } else {
            loadAdInternal(str, str2, adConfig, loadAdCallback);
        }
    }

    private static Consent getConsentStatus(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        String string = cookie.getString("consent_status");
        string.getClass();
        char c10 = 65535;
        switch (string.hashCode()) {
            case -83053070:
                if (string.equals("opted_in")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1230717015:
                if (string.equals(Gdpr.OPTED_OUT_BY_TIMEOUT)) {
                    c10 = 1;
                    break;
                }
                break;
            case 1720328225:
                if (string.equals("opted_out")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                AtomicReference<Consent> atomicReference = _instance.consent;
                Consent consent = Consent.OPTED_IN;
                atomicReference.set(consent);
                return consent;
            case 1:
            case 2:
                AtomicReference<Consent> atomicReference2 = _instance.consent;
                Consent consent2 = Consent.OPTED_OUT;
                atomicReference2.set(consent2);
                return consent2;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateCCPAStatus(final Repository repository, final Consent consent, final BidTokenEncoder bidTokenEncoder) {
        repository.load(Cookie.CCPA_COOKIE, Cookie.class, new Repository.LoadCallback<Cookie>() { // from class: com.vungle.warren.Vungle.17
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Cookie cookie) {
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CCPA_COOKIE);
                }
                cookie.putValue(Cookie.CCPA_CONSENT_STATUS, Consent.this == Consent.OPTED_OUT ? "opted_out" : "opted_in");
                bidTokenEncoder.updateCCPACookie(cookie);
                repository.save(cookie, null, false);
            }
        });
    }

    public static boolean canPlayAd(Advertisement advertisement) {
        Context context = _instance.context;
        if (context == null) {
            return false;
        }
        return ((AdLoader) ServiceLocator.getInstance(context).getService(AdLoader.class)).canPlayAd(advertisement);
    }
}
