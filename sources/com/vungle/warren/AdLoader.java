package com.vungle.warren;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.vungle.warren.AdConfig;
import com.vungle.warren.OperationSequence;
import com.vungle.warren.analytics.JobDelegateAnalytics;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.AssetPriority;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.admarkup.AdMarkupV2;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.Callback;
import com.vungle.warren.network.Response;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionConstants;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.tasks.DownloadJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.HackMraid;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.UnzipUtility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m8.l;
import m8.n;
import m8.p;
import m8.q;

/* loaded from: classes2.dex */
public class AdLoader {
    public static final boolean DEFAULT_LOAD_OPTIMIZATION_ENABLED = false;
    private static final String DOWNLOAD_AD_ASSETS_CONTEXT = "AdLoader#downloadAdAssets; loadAd sequence";
    private static final String DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT = "AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence";
    public static final long EXPONENTIAL_RATE = 2;
    private static final String FETCH_AD_METADATA_CONTEXT = "AdLoader#fetchAdMetadata; loadAd sequence";
    private static final String GET_ASSET_DOWNLOAD_LISTENER_CONTEXT = "AdLoader#getAssetDownloadListener; loadAd sequence";
    private static final String LOAD_AD_EXECUTE_CONTEXT = "AdLoader#loadAd#execute; loadAd sequence";
    private static final String NOT_A_DIR = "not a dir";
    private static final String ON_ASSET_DOWNLOAD_FINISHED_CONTEXT = "AdLoader#onAssetDownloadFinished; loadAd sequence";
    private static final String OP_ID_AND_ADVERTISEMENT_FORMAT = "request = %1$s; advertisement = %2$s";
    private static final String PLACEMENT_ID_AND_ADVERTISEMENT_FORMAT_2_3 = "request = %2$s; advertisement = %3$s";
    private static final String PLACEMENT_ID_AND_ADVERTISEMENT_FORMAT_3_4 = "request = %3$s; advertisement = %4$s";
    public static final int RETRY_COUNT = 5;
    public static final long RETRY_DELAY = 2000;
    private static final String STRING_AND_OP_ID_FORMAT = "%1$s; request = %2$s";
    private static final String TAG = "com.vungle.warren.AdLoader";
    public static final String TT_DOWNLOAD_CONTEXT = "ttDownloadContext";
    private final CacheManager cacheManager;
    private final Downloader downloader;
    private final OMInjector omInjector;
    private final Repository repository;
    private final RuntimeValues runtimeValues;
    private final Executors sdkExecutors;
    private final OperationSequence sequence;
    private final VisionController visionController;
    private final VungleStaticApi vungleApi;
    private final VungleApiClient vungleApiClient;
    private final Map<AdRequest, Operation> loadOperations = new ConcurrentHashMap();
    private final Map<AdRequest, Operation> pendingOperations = new ConcurrentHashMap();
    private final List<Operation> startingOperations = new CopyOnWriteArrayList();
    private AdRequest sequenceLoadingRequest = null;
    private final AtomicReference<JobRunner> jobRunnerRef = new AtomicReference<>();
    private boolean adLoadOptimizationEnabled = false;

    /* loaded from: classes2.dex */
    public static class Operation {
        long delay;
        final Set<LoadAdCallback> loadAdCallbacks;
        final AtomicBoolean loading;
        boolean logError;
        int policy;

        @Priority
        int priority;
        final AdRequest request;
        List<DownloadRequest> requests;
        int retry;
        long retryDelay;
        int retryLimit;
        final AdConfig.AdSize size;

        public Operation(AdRequest adRequest, AdConfig.AdSize adSize, long j10, long j11, int i10, int i11, int i12, boolean z10, @Priority int i13, LoadAdCallback... loadAdCallbackArr) {
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.loadAdCallbacks = copyOnWriteArraySet;
            this.requests = new CopyOnWriteArrayList();
            this.request = adRequest;
            this.delay = j10;
            this.retryDelay = j11;
            this.retryLimit = i10;
            this.policy = i11;
            this.retry = i12;
            this.loading = new AtomicBoolean();
            this.size = adSize;
            this.logError = z10;
            this.priority = i13;
            if (loadAdCallbackArr != null) {
                copyOnWriteArraySet.addAll(Arrays.asList(loadAdCallbackArr));
            }
        }

        public Operation delay(long j10) {
            return new Operation(this.request, this.size, j10, this.retryDelay, this.retryLimit, this.policy, this.retry, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        public boolean getLogError() {
            return this.logError;
        }

        @Priority
        public int getPriority() {
            return this.priority;
        }

        public AdRequest getRequest() {
            return this.request;
        }

        public AdConfig.AdSize getSize() {
            return this.size;
        }

        public void merge(Operation operation) {
            this.delay = Math.min(this.delay, operation.delay);
            this.retryDelay = Math.min(this.retryDelay, operation.retryDelay);
            this.retryLimit = Math.min(this.retryLimit, operation.retryLimit);
            int i10 = operation.policy;
            if (i10 != 0) {
                i10 = this.policy;
            }
            this.policy = i10;
            this.retry = Math.min(this.retry, operation.retry);
            this.logError |= operation.logError;
            this.priority = Math.min(this.priority, operation.priority);
            this.loadAdCallbacks.addAll(operation.loadAdCallbacks);
        }

        public Operation retry(int i10) {
            return new Operation(this.request, this.size, this.delay, this.retryDelay, this.retryLimit, this.policy, i10, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        public Operation retryDelay(long j10) {
            return new Operation(this.request, this.size, this.delay, j10, this.retryLimit, this.policy, this.retry, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        public String toString() {
            return "request=" + this.request.toString() + " size=" + this.size.toString() + " priority=" + this.priority + " policy=" + this.policy + " retry=" + this.retry + "/" + this.retryLimit + " delay=" + this.delay + "->" + this.retryDelay + " log=" + this.logError;
        }
    }

    /* loaded from: classes2.dex */
    public @interface Priority {
        public static final int HIGH = 1;
        public static final int HIGHEST = 0;
        public static final int LOWEST = Integer.MAX_VALUE;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ReschedulePolicy {
        public static final int EXPONENTIAL = 0;
        public static final int EXPONENTIAL_ENDLESS_AD = 1;
    }

    public AdLoader(Executors executors, Repository repository, VungleApiClient vungleApiClient, CacheManager cacheManager, Downloader downloader, RuntimeValues runtimeValues, VungleStaticApi vungleStaticApi, VisionController visionController, OperationSequence operationSequence, OMInjector oMInjector) {
        this.sdkExecutors = executors;
        this.repository = repository;
        this.vungleApiClient = vungleApiClient;
        this.cacheManager = cacheManager;
        this.downloader = downloader;
        this.runtimeValues = runtimeValues;
        this.vungleApi = vungleStaticApi;
        this.visionController = visionController;
        this.sequence = operationSequence;
        this.omInjector = oMInjector;
    }

    private boolean canReDownload(Advertisement advertisement) {
        List<AdAsset> list;
        if (advertisement == null || ((advertisement.getState() != 0 && advertisement.getState() != 1) || (list = this.repository.loadAllAdAssets(advertisement.getId()).get()) == null || list.size() == 0)) {
            return false;
        }
        for (AdAsset adAsset : list) {
            if (adAsset.fileType == 1) {
                if (!fileIsValid(new File(adAsset.localPath), adAsset)) {
                    return false;
                }
            } else if (TextUtils.isEmpty(adAsset.serverPath)) {
                return false;
            }
        }
        return true;
    }

    private void checkAndUpdateHBPPlacementBannerSize(String str, final AdConfig.AdSize adSize) {
        this.repository.load(str, Placement.class, new Repository.LoadCallback<Placement>() { // from class: com.vungle.warren.AdLoader.4
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Placement placement) {
                if (placement != null && placement.isMultipleHBPEnabled() && placement.getPlacementAdType() == 1) {
                    AdConfig.AdSize adSize2 = placement.getAdSize();
                    AdConfig.AdSize adSize3 = adSize;
                    if (adSize2 != adSize3) {
                        placement.setAdSize(adSize3);
                        AdLoader.this.repository.save(placement, null, false);
                    }
                }
            }
        });
    }

    private void downloadAdAssets(Operation operation, Advertisement advertisement) {
        operation.requests.clear();
        for (Map.Entry<String, String> entry : advertisement.getDownloadableUrls().entrySet()) {
            if (TextUtils.isEmpty(entry.getKey()) || TextUtils.isEmpty(entry.getValue()) || !URLUtil.isValidUrl(entry.getValue())) {
                VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("One or more ad asset URLs is empty or not valid;request = %1$s; advertisement = %2$s", operation.request, advertisement));
                onDownloadFailed(new VungleException(11), operation.request, null);
                Log.e(TAG, "Aborting, Failed to download Ad assets for: " + advertisement.getId());
                return;
            }
        }
        try {
            this.repository.save(advertisement);
            List<AdAsset> list = this.repository.loadAllAdAssets(advertisement.getId()).get();
            if (list == null) {
                VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot load all ad assets; op.request = %1$s; advertisement = %2$s", operation.request, advertisement));
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return;
            }
            boolean z10 = false;
            for (AdAsset adAsset : list) {
                if (adAsset.status == 3) {
                    if (fileIsValid(new File(adAsset.localPath), adAsset)) {
                        if (FileUtility.isVideoFile(adAsset.serverPath)) {
                            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ADS_CACHED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).build());
                            z10 = true;
                        }
                    } else if (adAsset.fileType == 1) {
                        VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot download ad assets - asset filetype is zip_asset;request = %1$s; advertisement = %2$s", operation.request, advertisement));
                        onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                        return;
                    }
                }
                if (adAsset.status != 4 || adAsset.fileType != 0) {
                    if (TextUtils.isEmpty(adAsset.serverPath)) {
                        VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot download ad assets - empty ;request = %1$s; advertisement = %2$s", operation.request, advertisement));
                        onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                        return;
                    }
                    DownloadRequest downloadRequest = getDownloadRequest(operation.priority, adAsset, advertisement.getId());
                    if (adAsset.status == 1) {
                        this.downloader.cancelAndAwait(downloadRequest, 1000L);
                        downloadRequest = getDownloadRequest(operation.priority, adAsset, advertisement.getId());
                    }
                    Log.d(TAG, "Starting download for " + adAsset);
                    adAsset.status = 1;
                    try {
                        this.repository.save(adAsset);
                        operation.requests.add(downloadRequest);
                        if (FileUtility.isVideoFile(adAsset.serverPath)) {
                            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ADS_CACHED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).addData(SessionAttribute.URL, adAsset.serverPath).build());
                            z10 = true;
                        }
                    } catch (DatabaseHelper.DBException e10) {
                        VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Can't save asset %1$s; exception = %2$s", adAsset, e10));
                        onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                        return;
                    }
                }
            }
            if (!z10) {
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ADS_CACHED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).addData(SessionAttribute.VIDEO_CACHED, SessionConstants.NONE).build());
            }
            if (operation.requests.size() == 0) {
                onAssetDownloadFinished(operation, advertisement.getId(), Collections.emptyList(), true);
                return;
            }
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Start to download assets,  request = %1$s at: %2$d", operation.request, Long.valueOf(System.currentTimeMillis())));
            AssetDownloadListener assetDownloadListener = getAssetDownloadListener(advertisement, operation);
            Iterator<DownloadRequest> it = operation.requests.iterator();
            while (it.hasNext()) {
                this.downloader.download(it.next(), assetDownloadListener);
            }
        } catch (DatabaseHelper.DBException unused) {
            VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot save advertisement op.request = %1$s; advertisement = %2$s", operation.request, advertisement));
            onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
        }
    }

    private void fetchAdMetadata(final Operation operation, Placement placement) {
        String str;
        q qVar;
        final long currentTimeMillis = System.currentTimeMillis();
        if (operation.request.getAdMarkup() instanceof AdMarkupV2) {
            handleAdMetaData(operation, currentTimeMillis, ((AdMarkupV2) operation.request.getAdMarkup()).getAdvertisement(), placement, new q());
            return;
        }
        VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Start to request ad, request = %1$s, at: %2$d", operation.request, Long.valueOf(currentTimeMillis)));
        VungleApiClient vungleApiClient = this.vungleApiClient;
        String placementId = operation.request.getPlacementId();
        if (AdConfig.AdSize.isNonMrecBannerAdSize(operation.size)) {
            str = operation.size.getName();
        } else {
            str = "";
        }
        boolean isHeaderBidding = placement.isHeaderBidding();
        if (this.visionController.isEnabled()) {
            qVar = this.visionController.getPayload();
        } else {
            qVar = null;
        }
        vungleApiClient.requestAd(placementId, str, isHeaderBidding, qVar).enqueue(new Callback<q>() { // from class: com.vungle.warren.AdLoader.5
            @Override // com.vungle.warren.network.Callback
            public void onFailure(Call<q> call, final Throwable th) {
                VungleLogger.verbose(true, AdLoader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Request ad failed, request = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("failed to request ad, request = %1$s, throwable = %2$s", operation.request, th));
                AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdLoader adLoader = AdLoader.this;
                        adLoader.onDownloadFailed(adLoader.retrofitToVungleException(th), operation.request, null);
                    }
                }, new Runnable() { // from class: com.vungle.warren.AdLoader.5.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                        AdLoader.this.onCriticalFail(39, operation.request);
                    }
                });
            }

            @Override // com.vungle.warren.network.Callback
            public void onResponse(Call<q> call, final Response<q> response) {
                VungleLogger.verbose(true, AdLoader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Request ad got response, request = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Placement placement2 = (Placement) AdLoader.this.repository.load(operation.request.getPlacementId(), Placement.class).get();
                        if (placement2 == null) {
                            Log.e(AdLoader.TAG, "Placement metadata not found for requested advertisement.");
                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Placement metadata not found for requested advertisement. request = " + operation.request);
                            AdLoader.this.onDownloadFailed(new VungleException(2), operation.request, null);
                            return;
                        }
                        if (!response.isSuccessful()) {
                            long retryAfterHeaderValue = AdLoader.this.vungleApiClient.getRetryAfterHeaderValue(response);
                            if (retryAfterHeaderValue > 0 && (placement2.isAutoCached() || placement2.isMultipleHBPEnabled())) {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                AdLoader.this.loadEndlessIfNeeded(placement2, operation.size, retryAfterHeaderValue, false);
                                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Response was not successful, retrying; request = " + operation.request);
                                AdLoader.this.onDownloadFailed(new VungleException(14), operation.request, null);
                                return;
                            }
                            Log.e(AdLoader.TAG, "Failed to retrieve advertisement information");
                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response was not successful, not retrying;request = %1$s; responseCode = %2$s", operation.request, Integer.valueOf(response.code())));
                            AdLoader adLoader = AdLoader.this;
                            adLoader.onDownloadFailed(adLoader.reposeCodeToVungleException(response.code()), operation.request, null);
                            return;
                        }
                        q qVar2 = (q) response.body();
                        Log.d(AdLoader.TAG, "Ads Response: " + qVar2);
                        if (qVar2 != null && qVar2.v(d.f9543h)) {
                            n s10 = qVar2.s(d.f9543h);
                            s10.getClass();
                            if (!(s10 instanceof p)) {
                                l t10 = qVar2.t(d.f9543h);
                                if (t10 != null && t10.size() != 0) {
                                    q j10 = t10.q(0).j();
                                    q j11 = j10.s("ad_markup").j();
                                    AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                                    AdLoader.this.handleAdMetaData(operation, currentTimeMillis, j10, placement2, j11);
                                    return;
                                }
                                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Response was successful, but no ads; request = " + operation.request);
                                AdLoader.this.onDownloadFailed(new VungleException(1), operation.request, null);
                                return;
                            }
                        }
                        VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response has no ads; placement = %1$s;op.request = %2$s; response = %3$s", placement2, operation.request, qVar2));
                        AdLoader.this.onDownloadFailed(new VungleException(1), operation.request, null);
                    }
                }, new Runnable() { // from class: com.vungle.warren.AdLoader.5.4
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                        AdLoader.this.onCriticalFail(39, operation.request);
                    }
                });
            }
        });
    }

    private boolean fileIsValid(File file, AdAsset adAsset) {
        if (file.exists() && file.length() == adAsset.fileSize) {
            return true;
        }
        return false;
    }

    private AssetDownloadListener getAssetDownloadListener(Advertisement advertisement, Operation operation) {
        return new AnonymousClass6(operation, advertisement);
    }

    private AssetPriority getAssetPriority(@Priority int i10, String str) {
        return new AssetPriority(Math.max(-2147483646, i10), getAssetPriority(str, this.adLoadOptimizationEnabled));
    }

    private DownloadRequest getDownloadRequest(@Priority int i10, AdAsset adAsset, String str) {
        return new DownloadRequest(3, getAssetPriority(i10, adAsset.localPath), adAsset.serverPath, adAsset.localPath, false, adAsset.identifier, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdMetaData(Operation operation, long j10, q qVar, Placement placement, q qVar2) {
        try {
            handleAdMetaData(operation, j10, new Advertisement(qVar), placement, qVar2);
        } catch (IllegalArgumentException unused) {
            if (qVar2.v("sleep")) {
                long h10 = qVar2.s("sleep").h();
                placement.snooze(h10);
                try {
                    VungleLogger.warn(FETCH_AD_METADATA_CONTEXT, String.format("badAd - snoozed placement %1$s; request = %2$s", placement, operation.request));
                    this.repository.save(placement);
                    loadEndlessIfNeeded(placement, operation.size, 1000 * h10, false);
                } catch (DatabaseHelper.DBException unused2) {
                    VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("badAd - can't save snoozed placement %1$s; request = %2$s", placement, operation.request));
                    onDownloadFailed(new VungleException(26), operation.request, null);
                    return;
                }
            }
            VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("badAd; can't proceed %1$s; request = %2$s", placement, operation.request));
            onDownloadFailed(new VungleException(1), operation.request, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean injectOMIfNeeded(Operation operation, Advertisement advertisement) {
        String str;
        if (advertisement.getOmEnabled()) {
            try {
                File destinationDir = getDestinationDir(advertisement);
                if (destinationDir != null && destinationDir.isDirectory()) {
                    for (File file : this.omInjector.injectJsFiles(destinationDir)) {
                        AdAsset adAsset = new AdAsset(advertisement.getId(), null, file.getPath());
                        adAsset.fileSize = file.length();
                        adAsset.fileType = 2;
                        adAsset.status = 3;
                        this.repository.save(adAsset);
                    }
                }
                Object[] objArr = new Object[3];
                if (destinationDir == null) {
                    str = "null";
                } else {
                    str = NOT_A_DIR;
                }
                objArr[0] = str;
                objArr[1] = operation.request;
                objArr[2] = advertisement;
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", objArr));
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return false;
            } catch (DatabaseHelper.DBException unused) {
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return false;
            } catch (IOException unused2) {
                onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                return false;
            }
        }
        return true;
    }

    private boolean isReadyForHBP(Operation operation, Repository repository) {
        if (repository.findValidAdvertisementsForPlacement(operation.request.getPlacementId(), null).get() != null && r4.size() >= operation.request.getAdCount()) {
            return true;
        }
        return false;
    }

    private boolean isSizeInvalid(Placement placement, AdConfig.AdSize adSize) {
        if (placement.getPlacementAdType() == 1 && !AdConfig.AdSize.isNonMrecBannerAdSize(adSize)) {
            return true;
        }
        if (placement.getPlacementAdType() == 0 && !AdConfig.AdSize.isDefaultAdSize(adSize)) {
            return true;
        }
        return false;
    }

    private boolean isUrlValid(String str) {
        if (!TextUtils.isEmpty(str) && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isZip(File file) {
        if (!file.getName().equals(Advertisement.KEY_POSTROLL) && !file.getName().equals("template")) {
            return false;
        }
        return true;
    }

    private void loadAd(Operation operation) {
        Advertisement advertisement;
        String str;
        int i10;
        List<Advertisement> list;
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.vungleApi.isInitialized()) {
            VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "Vungle is not initialized");
            onDownloadFailed(new VungleException(9), operation.request, null);
            return;
        }
        Placement placement = (Placement) this.repository.load(operation.request.getPlacementId(), Placement.class).get();
        if (placement == null) {
            VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "placement not found for " + operation.request);
            onDownloadFailed(new VungleException(13), operation.request, null);
            return;
        }
        if (!placement.isValid()) {
            onDownloadFailed(new VungleException(5), operation.request, null);
            return;
        }
        if (isSizeInvalid(placement, operation.size)) {
            VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "size is invalid, size = " + operation.size);
            onDownloadFailed(new VungleException(28), operation.request, null);
            return;
        }
        if (placement.getPlacementAdType() == 1 && !placement.isMultipleHBPEnabled() && (list = this.repository.findValidAdvertisementsForPlacement(placement.getId(), operation.request.getEventId()).get()) != null) {
            boolean z10 = false;
            for (Advertisement advertisement2 : list) {
                if (advertisement2.getAdConfig().getAdSize() != operation.size) {
                    try {
                        this.repository.deleteAdvertisement(advertisement2.getId());
                        z10 = true;
                    } catch (DatabaseHelper.DBException unused) {
                        VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "cannot delete advertisement, request = " + operation.request);
                        onDownloadFailed(new VungleException(26), operation.request, null);
                        return;
                    }
                }
            }
            if (z10) {
                loadEndlessIfNeeded(placement, operation.size, 0L, operation.request.getIsExplicit());
            }
        }
        int type = operation.request.getType();
        if (type != 0 && type != 2) {
            if (operation.request.getType() == 1 && isReadyForHBP(operation, this.repository)) {
                tryLoadNextInQueue(operation.request);
                onReady(operation.request, placement, null);
                return;
            }
            advertisement = null;
        } else {
            advertisement = this.repository.findValidAdvertisementForPlacement(placement.getId(), operation.request.getEventId()).get();
            if (operation.request.getAdMarkup() != null && advertisement == null && operation.request.getAdMarkup().getVersion() == 2) {
                advertisement = ((AdMarkupV2) operation.request.getAdMarkup()).getAdvertisement();
                try {
                    this.repository.save(advertisement);
                } catch (DatabaseHelper.DBException unused2) {
                    Log.e(TAG, "Failed to persist ad from Real Time Ad");
                }
            }
            if (placement.isMultipleHBPEnabled() && operation.request.getType() == 0) {
                if (operation.request.getEventId() == null) {
                    onDownloadFailed(new VungleException(36), operation.request, null);
                    return;
                } else if (advertisement == null) {
                    onDownloadFailed(new VungleException(10), operation.request, null);
                    return;
                }
            }
            if (advertisement != null && canPlayAd(advertisement)) {
                tryLoadNextInQueue(operation.request);
                onReady(operation.request, placement, advertisement);
                return;
            }
            if (canReDownload(advertisement)) {
                Log.d(TAG, "Found valid adv but not ready - downloading content");
                VungleSettings vungleSettings = this.runtimeValues.settings.get();
                if (vungleSettings != null && this.cacheManager.getBytesAvailable() >= vungleSettings.getMinimumSpaceForAd()) {
                    setLoading(operation.request, true);
                    if (advertisement.getState() != 0) {
                        try {
                            this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 0);
                        } catch (DatabaseHelper.DBException unused3) {
                            VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", "cannot save/apply NEW state, request = " + operation.request);
                            onDownloadFailed(new VungleException(26), operation.request, null);
                            return;
                        }
                    }
                    advertisement.setAdRequestStartTime(currentTimeMillis);
                    advertisement.setAssetDownloadStartTime(System.currentTimeMillis());
                    tryLoadNextInQueue(operation.request);
                    downloadAdAssets(operation, advertisement);
                    return;
                }
                if (advertisement.getState() != 4) {
                    try {
                        this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 4);
                    } catch (DatabaseHelper.DBException unused4) {
                        VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", "cannot save/apply ERROR state, request = " + operation.request);
                        onDownloadFailed(new VungleException(26), operation.request, null);
                        return;
                    }
                }
                VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "failed to download assets, no space; request = " + operation.request);
                onDownloadFailed(new VungleException(19), operation.request, null);
                return;
            }
        }
        if (placement.getWakeupTime() > System.currentTimeMillis()) {
            onDownloadFailed(new VungleException(1), operation.request, null);
            VungleLogger.warn("AdLoader#loadAd#execute; loadAd sequence; snoozed branch", String.format("Placement with id %s is snoozed ", placement.getId()));
            String str2 = TAG;
            Log.w(str2, "Placement " + placement.getId() + " is  snoozed");
            Log.d(str2, "Placement " + placement.getId() + " is sleeping rescheduling it ");
            loadEndlessIfNeeded(placement, operation.size, placement.getWakeupTime() - System.currentTimeMillis(), false);
            return;
        }
        if (operation.request.getType() == 1) {
            str = "advs";
        } else {
            str = "adv";
        }
        String str3 = TAG;
        StringBuilder s10 = a3.l.s("didn't find cached ", str, " for ");
        s10.append(operation.request);
        s10.append(" downloading");
        Log.i(str3, s10.toString());
        if (advertisement != null) {
            try {
                this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 4);
            } catch (DatabaseHelper.DBException unused5) {
                VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; last else branch", "cannot save/apply ERROR state, request = " + operation.request);
                onDownloadFailed(new VungleException(26), operation.request, null);
                return;
            }
        }
        VungleSettings vungleSettings2 = this.runtimeValues.settings.get();
        if (vungleSettings2 != null && this.cacheManager.getBytesAvailable() < vungleSettings2.getMinimumSpaceForAd()) {
            VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; last else branch", String.format("no space to load, isAutoCached = %1$s, request = %2$s", Boolean.valueOf(placement.isAutoCached()), operation.request));
            if (placement.isAutoCached()) {
                i10 = 18;
            } else {
                i10 = 17;
            }
            onDownloadFailed(new VungleException(i10), operation.request, null);
            return;
        }
        StringBuilder s11 = a3.l.s("No ", str, " for placement ");
        s11.append(placement.getId());
        s11.append(" getting new data ");
        Log.d(str3, s11.toString());
        setLoading(operation.request, true);
        fetchAdMetadata(operation, placement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAssetDownloadFinished(Operation operation, String str, List<AssetDownloadListener.DownloadError> list, boolean z10) {
        VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Assets download completed, request  = %1$s, at: %2$d", operation.request, Long.valueOf(System.currentTimeMillis())));
        if (list.isEmpty()) {
            Advertisement advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
            if (advertisement == null) {
                VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("advertisement is null: request = %1$s; advertisementId = %2$s", operation.request, str));
                onDownloadFailed(new VungleException(11), operation.request, str);
                return;
            }
            List<AdAsset> list2 = this.repository.loadAllAdAssets(str).get();
            String str2 = "null";
            if (list2 != null && list2.size() != 0) {
                for (AdAsset adAsset : list2) {
                    int i10 = adAsset.status;
                    if (i10 == 3) {
                        File file = new File(adAsset.localPath);
                        if (!fileIsValid(file, adAsset)) {
                            VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
                            if (z10) {
                                onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                                return;
                            }
                            return;
                        }
                    } else if (adAsset.fileType == 0 && i10 != 4) {
                        VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Zip asset left unprocessed asset = %1$s,request = %2$s; advertisement = %3$s", adAsset.toString(), operation.request, advertisement));
                        onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                        return;
                    }
                }
                if (advertisement.getAdType() == 1) {
                    File destinationDir = getDestinationDir(advertisement);
                    if (destinationDir != null && destinationDir.isDirectory()) {
                        Log.d(TAG, "saving MRAID for " + advertisement.getId());
                        advertisement.setMraidAssetDir(destinationDir);
                        try {
                            this.repository.save(advertisement);
                        } catch (DatabaseHelper.DBException e10) {
                            VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Issue(s) with database: can't save advertisement;exception = %1$s; request = %2$s; advertisement = %3$s", e10, operation.request, advertisement));
                            if (z10) {
                                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                                return;
                            }
                            return;
                        }
                    } else {
                        Object[] objArr = new Object[3];
                        if (destinationDir != null) {
                            str2 = NOT_A_DIR;
                        }
                        objArr[0] = str2;
                        objArr[1] = operation.request;
                        objArr[2] = advertisement;
                        VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", objArr));
                        if (z10) {
                            onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                            return;
                        }
                        return;
                    }
                }
                if (z10) {
                    onDownloadCompleted(operation.request, advertisement.getId());
                    return;
                }
                return;
            }
            Object[] objArr2 = new Object[3];
            if (list2 != null) {
                str2 = "empty";
            }
            objArr2[0] = str2;
            objArr2[1] = operation.request;
            objArr2[2] = str;
            VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets are %1$s; request = %2$s; advertisement = %3$s", objArr2));
            if (z10) {
                onDownloadFailed(new VungleException(24), operation.request, str);
                return;
            }
            return;
        }
        Iterator<AssetDownloadListener.DownloadError> it = list.iterator();
        VungleException vungleException = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AssetDownloadListener.DownloadError next = it.next();
            if (VungleException.getExceptionCode(next.cause) == 26) {
                vungleException = new VungleException(26);
                break;
            }
            if (recoverableServerCode(next.serverCode) && next.reason == 1) {
                vungleException = new VungleException(23);
            } else if (next.reason == 0) {
                vungleException = new VungleException(23);
            } else {
                vungleException = new VungleException(24);
            }
            if (vungleException.getExceptionCode() == 24) {
                break;
            }
        }
        if (z10) {
            onDownloadFailed(vungleException, operation.request, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChangePriority(Operation operation) {
        for (DownloadRequest downloadRequest : operation.requests) {
            downloadRequest.setPriority(getAssetPriority(operation.priority, downloadRequest.path));
            this.downloader.updatePriority(downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(Operation operation, @VungleException.ExceptionCode int i10) {
        Object obj;
        Object[] objArr = new Object[2];
        objArr[0] = new VungleException(i10);
        if (operation != null) {
            obj = operation;
        } else {
            obj = "null";
        }
        objArr[1] = obj;
        VungleLogger.error("AdLoader#onError; loadAd sequence", String.format("Error %1$s occured; operation is %2$s", objArr));
        if (operation != null) {
            Iterator<LoadAdCallback> it = operation.loadAdCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onError(operation.request.getPlacementId(), new VungleException(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTemplate(Operation operation, AdAsset adAsset, Advertisement advertisement) {
        if (adAsset.status != 3) {
            onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
            return;
        }
        File file = new File(adAsset.localPath);
        if (!fileIsValid(file, adAsset)) {
            VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
            onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
            return;
        }
        if (adAsset.fileType == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String str = TAG;
            VungleLogger.verbose(true, str, TT_DOWNLOAD_CONTEXT, String.format("Start to unzip assets, request  = %1$s, at: %2$d", operation.request, Long.valueOf(currentTimeMillis)));
            try {
                unzipFile(advertisement, adAsset, file, this.repository.loadAllAdAssets(advertisement.getId()).get());
                VungleLogger.verbose(true, str, TT_DOWNLOAD_CONTEXT, String.format("Unzip assets completed, request  = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            } catch (DatabaseHelper.DBException e10) {
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Issue(s) with database: exception = %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", e10, adAsset.toString(), operation.request, advertisement));
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return;
            } catch (IOException unused) {
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Unzip failed %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
                this.downloader.dropCache(adAsset.serverPath);
                onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                return;
            }
        }
        if (isAdLoadOptimizationEnabled(advertisement)) {
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Ad ready to play, request  = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - advertisement.adRequestStartTime)));
            onDownloadCompleted(operation.request, advertisement.getId());
        }
    }

    private boolean recoverableServerCode(int i10) {
        if (i10 != 408 && (500 > i10 || i10 >= 600)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VungleException reposeCodeToVungleException(int i10) {
        if (recoverableServerCode(i10)) {
            return new VungleException(22);
        }
        return new VungleException(21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VungleException retrofitToVungleException(Throwable th) {
        if (th instanceof UnknownHostException) {
            return new VungleException(11);
        }
        if (th instanceof IOException) {
            return new VungleException(20);
        }
        return new VungleException(11);
    }

    private void setLoading(AdRequest adRequest, boolean z10) {
        Operation operation = this.loadOperations.get(adRequest);
        if (operation != null) {
            operation.loading.set(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoading(Operation operation) {
        this.loadOperations.put(operation.request, operation);
        loadAd(operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryLoadNextInQueue(AdRequest adRequest) {
        AdRequest adRequest2 = this.sequenceLoadingRequest;
        if (adRequest2 == null || adRequest2.equals(adRequest)) {
            this.sequenceLoadingRequest = null;
            OperationSequence.Entry poll = this.sequence.poll();
            if (poll != null) {
                Operation operation = poll.operation;
                this.sequenceLoadingRequest = operation.request;
                startLoading(operation);
            }
        }
    }

    private void unzipFile(Advertisement advertisement, AdAsset adAsset, final File file, List<AdAsset> list) throws IOException, DatabaseHelper.DBException {
        String str;
        final ArrayList arrayList = new ArrayList();
        for (AdAsset adAsset2 : list) {
            if (adAsset2.fileType == 2) {
                arrayList.add(adAsset2.localPath);
            }
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir != null && destinationDir.isDirectory()) {
            List<File> unzip = UnzipUtility.unzip(file.getPath(), destinationDir.getPath(), new UnzipUtility.Filter() { // from class: com.vungle.warren.AdLoader.7
                @Override // com.vungle.warren.utility.UnzipUtility.Filter
                public boolean matches(String str2) {
                    File file2 = new File(str2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file3 = new File((String) it.next());
                        if (file3.equals(file2)) {
                            return false;
                        }
                        if (file2.getPath().startsWith(file3.getPath() + File.separator)) {
                            return false;
                        }
                    }
                    return true;
                }
            });
            if (file.getName().equals("template")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(destinationDir.getPath());
                File file2 = new File(a3.l.p(sb2, File.separator, "mraid.js"));
                if (!file2.exists() && !file2.createNewFile()) {
                    Log.e(TAG, "fail to create mraid.js");
                    return;
                } else {
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                    HackMraid.apply(printWriter);
                    printWriter.close();
                }
            }
            for (File file3 : unzip) {
                AdAsset adAsset3 = new AdAsset(advertisement.getId(), null, file3.getPath());
                adAsset3.fileSize = file3.length();
                adAsset3.fileType = 1;
                adAsset3.parentId = adAsset.identifier;
                adAsset3.status = 3;
                this.repository.save(adAsset3);
            }
            Log.d(TAG, "Uzipped " + destinationDir);
            FileUtility.printDirectoryTree(destinationDir);
            adAsset.status = 4;
            this.repository.save(adAsset, new Repository.SaveCallback() { // from class: com.vungle.warren.AdLoader.8
                @Override // com.vungle.warren.persistence.Repository.SaveCallback
                public void onSaved() {
                    AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                FileUtility.delete(file);
                            } catch (IOException e10) {
                                Log.e(AdLoader.TAG, "Error on deleting zip assets archive", e10);
                            }
                        }
                    });
                }

                @Override // com.vungle.warren.persistence.Repository.SaveCallback
                public void onError(Exception exc) {
                }
            });
            return;
        }
        Object[] objArr = new Object[2];
        if (destinationDir == null) {
            str = "null";
        } else {
            str = NOT_A_DIR;
        }
        objArr[0] = str;
        objArr[1] = advertisement;
        VungleLogger.error("AdLoader#unzipFile; loadAd sequence", String.format("Can't unzip file: destination dir is %1$s; advertisement = %2$s", objArr));
        throw new IOException("Unable to access Destination Directory");
    }

    public boolean canPlayAd(Advertisement advertisement) {
        if (advertisement != null && advertisement.getState() == 1) {
            return hasAssetsFor(advertisement);
        }
        return false;
    }

    public boolean canRenderAd(Advertisement advertisement) {
        if (advertisement == null) {
            return false;
        }
        if (advertisement.getState() != 1 && advertisement.getState() != 2) {
            return false;
        }
        return hasAssetsFor(advertisement);
    }

    public void clear() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.loadOperations.keySet());
        hashSet.addAll(this.pendingOperations.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AdRequest adRequest = (AdRequest) it.next();
            Operation remove = this.loadOperations.remove(adRequest);
            this.startingOperations.remove(remove);
            onError(remove, 25);
            onError(this.pendingOperations.remove(adRequest), 25);
        }
        for (Operation operation : this.startingOperations) {
            this.startingOperations.remove(operation);
            onError(operation, 25);
        }
        this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.1
            @Override // java.lang.Runnable
            public void run() {
                AdLoader.this.sequenceLoadingRequest = null;
                Iterator<OperationSequence.Entry> it2 = AdLoader.this.sequence.removeAll().iterator();
                while (it2.hasNext()) {
                    AdLoader.this.onError(it2.next().operation, 25);
                }
            }
        });
    }

    public void dropCache(String str) {
        List<AdAsset> list = this.repository.loadAllAdAssets(str).get();
        if (list == null) {
            Log.w(TAG, "No assets found in ad cache to cleanup");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<AdAsset> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().serverPath);
        }
        Advertisement advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
        if (advertisement != null) {
            hashSet.addAll(advertisement.getDownloadableUrls().values());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            this.downloader.dropCache((String) it2.next());
        }
    }

    public File getDestinationDir(Advertisement advertisement) {
        return this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
    }

    public Collection<Operation> getPendingOperations() {
        return this.pendingOperations.values();
    }

    public Collection<Operation> getRunningOperations() {
        return this.loadOperations.values();
    }

    public boolean hasAssetsFor(Advertisement advertisement) throws IllegalStateException {
        List<AdAsset> list;
        if (advertisement == null || (list = this.repository.loadAllAdAssets(advertisement.getId()).get()) == null || list.size() == 0) {
            return false;
        }
        for (AdAsset adAsset : list) {
            if (adAsset.fileType == 0) {
                if (adAsset.status != 4) {
                    return false;
                }
            } else if (!isUrlValid(adAsset.serverPath) || !isAdLoadOptimizationEnabled(advertisement)) {
                if (adAsset.status != 3 || !fileIsValid(new File(adAsset.localPath), adAsset)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void init(JobRunner jobRunner) {
        this.jobRunnerRef.set(jobRunner);
        this.downloader.init();
    }

    public boolean isAdLoadOptimizationEnabled(Advertisement advertisement) {
        if (this.adLoadOptimizationEnabled && advertisement != null && advertisement.getAdType() == 1) {
            return true;
        }
        return false;
    }

    public boolean isLoading(AdRequest adRequest) {
        Operation operation = this.loadOperations.get(adRequest);
        if (operation != null && operation.loading.get()) {
            return true;
        }
        return false;
    }

    public void load(final Operation operation) {
        JobRunner jobRunner = this.jobRunnerRef.get();
        if (jobRunner == null) {
            VungleLogger.error("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", operation));
            onError(operation, 9);
            return;
        }
        if (operation.request.getIsExplicit()) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.LOAD_AD).addData(SessionAttribute.PLACEMENT_ID, operation.request.getPlacementId()).build());
        }
        checkAndUpdateHBPPlacementBannerSize(operation.request.getPlacementId(), operation.size);
        Operation remove = this.pendingOperations.remove(operation.request);
        if (remove != null) {
            operation.merge(remove);
        }
        if (operation.delay <= 0) {
            operation.request.timeStamp.set(System.currentTimeMillis());
            this.startingOperations.add(operation);
            this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!AdLoader.this.startingOperations.contains(operation)) {
                        return;
                    }
                    Operation operation2 = operation;
                    Operation operation3 = (Operation) AdLoader.this.loadOperations.get(operation2.request);
                    if (operation3 != null) {
                        int i10 = operation3.priority;
                        operation3.merge(operation2);
                        if (operation3.priority < i10) {
                            AdLoader.this.onChangePriority(operation3);
                        }
                    } else {
                        OperationSequence.Entry remove2 = AdLoader.this.sequence.remove(operation2.request);
                        if (remove2 != null) {
                            remove2.operation.merge(operation2);
                            operation2 = remove2.operation;
                        }
                        if (operation2.priority <= 0) {
                            AdLoader.this.startLoading(operation2);
                        } else {
                            OperationSequence operationSequence = AdLoader.this.sequence;
                            if (remove2 == null) {
                                remove2 = new OperationSequence.Entry(operation2);
                            }
                            operationSequence.offer(remove2);
                            AdLoader.this.tryLoadNextInQueue(null);
                        }
                    }
                    AdLoader.this.startingOperations.remove(operation2);
                }
            }, new Runnable() { // from class: com.vungle.warren.AdLoader.3
                @Override // java.lang.Runnable
                public void run() {
                    AdLoader.this.onError(operation, 39);
                }
            });
        } else {
            this.pendingOperations.put(operation.request, operation);
            jobRunner.execute(DownloadJob.makeJobInfo(operation.request).setDelay(operation.delay).setUpdateCurrent(true));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadEndlessIfNeeded(com.vungle.warren.model.Placement r16, com.vungle.warren.AdConfig.AdSize r17, long r18, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r16.isMultipleHBPEnabled()
            if (r1 == 0) goto L1c
            int r1 = r16.getPlacementAdType()
            r2 = 1
            if (r1 != r2) goto L1c
            boolean r1 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r17)
            if (r1 != 0) goto L1c
            com.vungle.warren.AdConfig$AdSize r1 = r16.getRecommendedAdSize()
            r4 = r1
            r1 = r16
            goto L20
        L1c:
            r1 = r16
            r4 = r17
        L20:
            boolean r2 = r15.isSizeInvalid(r1, r4)
            if (r2 == 0) goto L27
            return
        L27:
            int r2 = r16.getAutoCachePriority()
            com.vungle.warren.RuntimeValues r3 = r0.runtimeValues
            java.util.concurrent.atomic.AtomicReference<com.vungle.warren.VungleSettings> r3 = r3.settings
            java.lang.Object r3 = r3.get()
            com.vungle.warren.VungleSettings r3 = (com.vungle.warren.VungleSettings) r3
            r5 = 0
            if (r3 == 0) goto L48
            java.lang.String r6 = r16.getId()
            java.lang.String r3 = r3.getPriorityPlacement()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L48
            r13 = r5
            goto L49
        L48:
            r13 = r2
        L49:
            boolean r2 = r16.isMultipleHBPEnabled()
            if (r2 == 0) goto L68
            boolean r2 = r16.isSingleHBPEnabled()
            if (r2 != 0) goto L68
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r7 = r16.getId()
            r8 = 1
            int r1 = r16.getMaxHbCache()
            long r9 = (long) r1
            r6 = r2
            r11 = r20
            r6.<init>(r7, r8, r9, r11)
            goto L7d
        L68:
            boolean r2 = r16.isSingleHBPEnabled()
            if (r2 == 0) goto L7f
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r7 = r16.getId()
            r8 = 2
            r9 = 1
            r6 = r2
            r11 = r20
            r6.<init>(r7, r8, r9, r11)
        L7d:
            r3 = r2
            goto L97
        L7f:
            boolean r2 = r16.isAutoCached()
            if (r2 == 0) goto L95
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r7 = r16.getId()
            r8 = 0
            r9 = 1
            r6 = r2
            r11 = r20
            r6.<init>(r7, r8, r9, r11)
            goto L7d
        L95:
            r1 = 0
            r3 = r1
        L97:
            if (r3 == 0) goto Lac
            com.vungle.warren.AdLoader$Operation r1 = new com.vungle.warren.AdLoader$Operation
            r7 = 2000(0x7d0, double:9.88E-321)
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            com.vungle.warren.LoadAdCallback[] r14 = new com.vungle.warren.LoadAdCallback[r5]
            r2 = r1
            r5 = r18
            r2.<init>(r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r15.load(r1)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.loadEndlessIfNeeded(com.vungle.warren.model.Placement, com.vungle.warren.AdConfig$AdSize, long, boolean):void");
    }

    public void loadPendingInternal(AdRequest adRequest) {
        Operation remove = this.pendingOperations.remove(adRequest);
        if (remove == null) {
            return;
        }
        load(remove.delay(0L));
    }

    public void onCriticalFail(@VungleException.ExceptionCode int i10, AdRequest adRequest) {
        onError(this.loadOperations.remove(adRequest), i10);
    }

    public void onDownloadCompleted(AdRequest adRequest, String str) {
        Advertisement advertisement;
        Log.d(TAG, "download completed " + adRequest);
        Placement placement = (Placement) this.repository.load(adRequest.getPlacementId(), Placement.class).get();
        if (placement == null) {
            VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("loaded placement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
            onDownloadFailed(new VungleException(13), adRequest, str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            advertisement = null;
        } else {
            advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
        }
        if (advertisement == null) {
            VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("advertisement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
            onDownloadFailed(new VungleException(11), adRequest, str);
            return;
        }
        advertisement.setFinishedDownloadingTime(System.currentTimeMillis());
        try {
            this.repository.saveAndApplyState(advertisement, adRequest.getPlacementId(), 1);
            onReady(adRequest, placement, advertisement);
        } catch (DatabaseHelper.DBException e10) {
            VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("Can't save/apply state READY: exception = %1$s;request = %2$s; advertisement = %3$s", e10, adRequest, advertisement));
            onDownloadFailed(new VungleException(26), adRequest, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDownloadFailed(com.vungle.warren.error.VungleException r12, com.vungle.warren.AdRequest r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.onDownloadFailed(com.vungle.warren.error.VungleException, com.vungle.warren.AdRequest, java.lang.String):void");
    }

    public void onReady(AdRequest adRequest, Placement placement, Advertisement advertisement) {
        String str;
        List<String> arrayList;
        setLoading(adRequest, false);
        HeaderBiddingCallback headerBiddingCallback = this.runtimeValues.headerBiddingCallback.get();
        if (advertisement != null && placement.isHeaderBidding() && headerBiddingCallback != null) {
            headerBiddingCallback.adAvailableForBidToken(adRequest.getPlacementId(), advertisement.getBidToken());
        }
        String str2 = TAG;
        Log.i(str2, "found already cached valid adv, calling onAdLoad callback for request " + adRequest);
        InitCallback initCallback = this.runtimeValues.initCallback.get();
        int type = adRequest.getType();
        if (placement.isAutoCached() && initCallback != null && (type == 2 || type == 0)) {
            initCallback.onAutoCacheAdAvailable(adRequest.getPlacementId());
        }
        Operation remove = this.loadOperations.remove(adRequest);
        String str3 = null;
        if (advertisement != null) {
            str = advertisement.getId();
        } else {
            str = null;
        }
        if (remove != null) {
            placement.setAdSize(remove.size);
            try {
                this.repository.save(placement);
                Log.i(str2, "loading took " + (System.currentTimeMillis() - adRequest.timeStamp.get()) + "ms for:" + adRequest);
                if (adRequest.getIsExplicit()) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.LOAD_AD_END).addData(SessionAttribute.SUCCESS, true).addData(SessionAttribute.PLACEMENT_ID, placement.getId()).build());
                }
                for (LoadAdCallback loadAdCallback : remove.loadAdCallbacks) {
                    if (loadAdCallback instanceof LoadNativeAdCallbackWrapper) {
                        ((LoadNativeAdCallbackWrapper) loadAdCallback).onAdLoad(advertisement);
                    } else {
                        loadAdCallback.onAdLoad(adRequest.getPlacementId());
                    }
                }
                SessionTracker sessionTracker = SessionTracker.getInstance();
                SessionData.Builder event = new SessionData.Builder().setEvent(SessionEvent.AD_AVAILABLE);
                SessionAttribute sessionAttribute = SessionAttribute.EVENT_ID;
                if (advertisement != null) {
                    str3 = advertisement.getId();
                }
                sessionTracker.trackEvent(event.addData(sessionAttribute, str3).addData(SessionAttribute.PLACEMENT_ID, adRequest.getPlacementId()).build());
                if (adRequest.getIsExplicit()) {
                    if (advertisement != null) {
                        arrayList = advertisement.getWinNotifications();
                    } else {
                        arrayList = new ArrayList<>();
                    }
                    sendWinNotification(remove, arrayList);
                }
            } catch (DatabaseHelper.DBException e10) {
                VungleLogger.error("AdLoader#DownloadAdCallback#onReady; loadAd sequence", String.format("Can't save placement: exception = %1$s;placement = %2$s; advertisement = %3$s", e10, placement, advertisement));
                onDownloadFailed(new VungleException(26), adRequest, str);
            }
        }
    }

    public void saveAsset(Advertisement advertisement, File file, String str, String str2) throws DatabaseHelper.DBException {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        String p10 = a3.l.p(sb2, File.separator, str);
        if (!p10.endsWith(Advertisement.KEY_POSTROLL) && !p10.endsWith("template")) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        AdAsset adAsset = new AdAsset(advertisement.getId(), str2, p10);
        adAsset.status = 0;
        adAsset.fileType = i10;
        try {
            this.repository.save(adAsset);
        } catch (DatabaseHelper.DBException e10) {
            VungleLogger.error("AdLoader#saveAsset; loadAd sequence", String.format("Can't save adAsset %1$s; exception = %2$s", adAsset, e10));
            throw e10;
        }
    }

    public void sendWinNotification(Operation operation, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        JobRunner jobRunner = this.jobRunnerRef.get();
        if (jobRunner == null) {
            VungleLogger.error("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", operation));
            onError(operation, 9);
        } else {
            new JobDelegateAnalytics(jobRunner).ping((String[]) list.toArray(new String[0]));
        }
    }

    public void setAdLoadOptimizationEnabled(boolean z10) {
        this.adLoadOptimizationEnabled = z10;
    }

    @DownloadRequest.Priority
    public static int getAssetPriority(String str, boolean z10) {
        if (z10) {
            return !str.endsWith("template") ? 1 : 0;
        }
        return 0;
    }

    private void handleAdMetaData(Operation operation, long j10, Advertisement advertisement, Placement placement, q qVar) throws IllegalArgumentException {
        int state;
        HeaderBiddingCallback headerBiddingCallback = this.runtimeValues.headerBiddingCallback.get();
        try {
            if (this.visionController.isEnabled()) {
                if (JsonUtil.hasNonNull(qVar, "data_science_cache")) {
                    this.visionController.setDataScienceCache(qVar.s("data_science_cache").m());
                } else {
                    this.visionController.setDataScienceCache(null);
                }
            }
            Advertisement advertisement2 = (Advertisement) this.repository.load(advertisement.getId(), Advertisement.class).get();
            if (advertisement2 != null && ((state = advertisement2.getState()) == 0 || state == 1 || state == 2)) {
                Log.d(TAG, "Operation Cancelled");
                onDownloadFailed(new VungleException(25), operation.request, null);
                return;
            }
            if (placement.isHeaderBidding() && headerBiddingCallback != null) {
                headerBiddingCallback.onBidTokenAvailable(operation.request.getPlacementId(), advertisement.getBidToken());
            }
            this.repository.deleteAdvertisement(advertisement.getId());
            Set<Map.Entry<String, String>> entrySet = advertisement.getDownloadableUrls().entrySet();
            File destinationDir = getDestinationDir(advertisement);
            if (destinationDir != null && destinationDir.isDirectory()) {
                for (Map.Entry<String, String> entry : entrySet) {
                    if (isUrlValid(entry.getValue())) {
                        saveAsset(advertisement, destinationDir, entry.getKey(), entry.getValue());
                    } else {
                        VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but one of downloadable urls is neither http nor https : url = %1$s; op.request = %2$s, ad.getId() = %3$s", entry.getValue(), operation.request, advertisement.getId()));
                        onDownloadFailed(new VungleException(11), operation.request, advertisement.getId());
                        return;
                    }
                }
                if (placement.getPlacementAdType() == 1 && (advertisement.getAdType() != 1 || !f.f9817e.equals(advertisement.getTemplateType()))) {
                    Object[] objArr = new Object[3];
                    objArr[0] = advertisement.getAdType() != 1 ? "ad type is not MRAID" : "advertisement template type is not banner";
                    objArr[1] = operation.request;
                    objArr[2] = advertisement.getId();
                    VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but placement is banner while %1$s; op.request = %2$s, ad.getId() = %3$s", objArr));
                    onDownloadFailed(new VungleException(1), operation.request, advertisement.getId());
                    return;
                }
                advertisement.getAdConfig().setAdSize(operation.size);
                advertisement.setAdRequestStartTime(j10);
                advertisement.setAssetDownloadStartTime(System.currentTimeMillis());
                advertisement.setHeaderBidding(placement.isHeaderBidding());
                this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 0);
                int type = operation.request.getType();
                if (type != 0 && type != 2) {
                    if (operation.request.getType() == 1) {
                        if (isReadyForHBP(operation, this.repository)) {
                            tryLoadNextInQueue(operation.request);
                            onReady(operation.request, placement, null);
                            return;
                        } else {
                            fetchAdMetadata(operation, placement);
                            return;
                        }
                    }
                    return;
                }
                tryLoadNextInQueue(operation.request);
                downloadAdAssets(operation, advertisement);
                return;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = destinationDir == null ? "null" : NOT_A_DIR;
            objArr2[1] = operation.request;
            objArr2[2] = advertisement.getId();
            VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but adv directory is %1$s; op.request = %2$s, ad.getId() = %3$s", objArr2));
            onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
        } catch (DatabaseHelper.DBException e10) {
            VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("BadAd - DBException; can't proceed; placement = %1$s; op.request = %2$s; exception = %3$s", placement, operation.request, e10));
            onDownloadFailed(new VungleException(26), operation.request, null);
        }
    }

    public void load(AdRequest adRequest, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        load(new Operation(adRequest, adConfig.getAdSize(), 0L, 2000L, 5, 0, 0, true, 0, loadAdCallback));
    }

    /* renamed from: com.vungle.warren.AdLoader$6, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements AssetDownloadListener {
        AtomicLong downloadCount;
        List<AssetDownloadListener.DownloadError> errors = Collections.synchronizedList(new ArrayList());
        final /* synthetic */ Advertisement val$advertisement;
        final /* synthetic */ Operation val$op;

        public AnonymousClass6(Operation operation, Advertisement advertisement) {
            this.val$op = operation;
            this.val$advertisement = advertisement;
            this.downloadCount = new AtomicLong(operation.requests.size());
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onError(final AssetDownloadListener.DownloadError downloadError, final DownloadRequest downloadRequest) {
            AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.6.1
                @Override // java.lang.Runnable
                public void run() {
                    AdAsset adAsset;
                    Log.e(AdLoader.TAG, "Download Failed");
                    DownloadRequest downloadRequest2 = downloadRequest;
                    if (downloadRequest2 != null) {
                        String str = downloadRequest2.cookieString;
                        if (TextUtils.isEmpty(str)) {
                            adAsset = null;
                        } else {
                            adAsset = (AdAsset) AdLoader.this.repository.load(str, AdAsset.class).get();
                        }
                        if (adAsset != null) {
                            AnonymousClass6.this.errors.add(downloadError);
                            adAsset.status = 2;
                            try {
                                AdLoader.this.repository.save(adAsset);
                            } catch (DatabaseHelper.DBException unused) {
                                AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new VungleException(26), 4));
                            }
                        } else {
                            AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 1));
                        }
                    } else {
                        AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new RuntimeException("error in request"), 4));
                    }
                    if (AnonymousClass6.this.downloadCount.decrementAndGet() <= 0) {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        AdLoader.this.onAssetDownloadFinished(anonymousClass6.val$op, anonymousClass6.val$advertisement.getId(), AnonymousClass6.this.errors, true);
                    }
                }
            }, new Runnable() { // from class: com.vungle.warren.AdLoader.6.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                    AdLoader.this.onCriticalFail(39, anonymousClass6.val$op.request);
                }
            });
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onSuccess(final File file, final DownloadRequest downloadRequest) {
            AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.6.3
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
                
                    if (r0.this$0.isAdLoadOptimizationEnabled(r0.val$advertisement) == false) goto L33;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 292
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.AnonymousClass6.AnonymousClass3.run():void");
                }
            }, new Runnable() { // from class: com.vungle.warren.AdLoader.6.4
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                    AdLoader.this.onCriticalFail(39, anonymousClass6.val$op.request);
                }
            });
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        }
    }
}
