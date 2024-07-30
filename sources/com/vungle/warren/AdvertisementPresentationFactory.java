package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.vungle.warren.AdConfig;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.analytics.JobDelegateAnalytics;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.omsdk.OMTracker;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.NativeAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.presenter.NativeAdPresenter;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.FullAdWidget;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.NativeAdView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.HandlerScheduler;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class AdvertisementPresentationFactory implements PresentationFactory {
    private static final String EXTRA_ADVERTISEMENT = "ADV_FACTORY_ADVERTISEMENT";
    private static final String TAG = "AdvertisementPresentationFactory";
    private final AdLoader adLoader;
    private VungleApiClient apiClient;
    private Advertisement currentAdvertisement;
    private final JobRunner jobRunner;
    private final OMTracker.Factory omTrackerFactory;
    private BaseTask.OnModelLoadListener onModelLoadListener = new BaseTask.OnModelLoadListener() { // from class: com.vungle.warren.AdvertisementPresentationFactory.1
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask.OnModelLoadListener
        public void onLoad(Advertisement advertisement, Placement placement) {
            AdvertisementPresentationFactory.this.currentAdvertisement = advertisement;
        }
    };
    private Repository repository;
    private BaseTask task;
    private final ExecutorService taskExecutor;
    private VungleStaticApi vungleStaticApi;

    /* loaded from: classes2.dex */
    public static class BannerViewPresentationTask extends BaseTask {
        private final AdConfig adConfig;
        private final AdLoader adLoader;
        private final VungleApiClient apiClient;

        @SuppressLint({"StaticFieldLeak"})
        private Context context;
        private final JobRunner jobRunner;
        private final OMTracker.Factory omTrackerFactory;
        private final AdRequest request;
        private final Bundle savedState;
        private final PresentationFactory.ViewCallback viewCallback;

        public BannerViewPresentationTask(Context context, AdRequest adRequest, AdConfig adConfig, AdLoader adLoader, Repository repository, VungleStaticApi vungleStaticApi, JobRunner jobRunner, PresentationFactory.ViewCallback viewCallback, Bundle bundle, BaseTask.OnModelLoadListener onModelLoadListener, VungleApiClient vungleApiClient, OMTracker.Factory factory) {
            super(repository, vungleStaticApi, onModelLoadListener);
            this.context = context;
            this.request = adRequest;
            this.adConfig = adConfig;
            this.viewCallback = viewCallback;
            this.savedState = bundle;
            this.jobRunner = jobRunner;
            this.adLoader = adLoader;
            this.apiClient = vungleApiClient;
            this.omTrackerFactory = factory;
        }

        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask
        public void clear() {
            super.clear();
            this.context = null;
        }

        @Override // android.os.AsyncTask
        public PresentationResultHolder doInBackground(Void... voidArr) {
            try {
                Pair<Advertisement, Placement> loadPresentationData = loadPresentationData(this.request, this.savedState);
                Advertisement advertisement = (Advertisement) loadPresentationData.first;
                if (advertisement.getAdType() != 1) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Invalid Ad Type for Native Ad.");
                    return new PresentationResultHolder(new VungleException(10));
                }
                Placement placement = (Placement) loadPresentationData.second;
                if (!this.adLoader.canPlayAd(advertisement)) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement is null or assets are missing");
                    return new PresentationResultHolder(new VungleException(10));
                }
                Cookie cookie = (Cookie) this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get();
                if ((cookie != null && cookie.getBoolean("isAdDownloadOptEnabled").booleanValue()) && !advertisement.assetsFullyDownloaded) {
                    List<AdAsset> loadAllAdAssetByStatus = this.repository.loadAllAdAssetByStatus(advertisement.getId(), 3);
                    if (!loadAllAdAssetByStatus.isEmpty()) {
                        advertisement.updateMRAIDTokensFromAssetDB(loadAllAdAssetByStatus);
                        try {
                            this.repository.save(advertisement);
                        } catch (DatabaseHelper.DBException unused) {
                            Log.e(AdvertisementPresentationFactory.TAG, "Unable to update tokens");
                        }
                    }
                }
                JobDelegateAnalytics jobDelegateAnalytics = new JobDelegateAnalytics(this.jobRunner);
                VungleWebClient vungleWebClient = new VungleWebClient(advertisement, placement, ((Executors) ServiceLocator.getInstance(this.context).getService(Executors.class)).getOffloadExecutor());
                File file = this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
                if (file == null || !file.isDirectory()) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                    return new PresentationResultHolder(new VungleException(26));
                }
                if ("mrec".equals(advertisement.getTemplateType()) && this.adConfig.getAdSize() != AdConfig.AdSize.VUNGLE_MREC) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Corresponding AdConfig#setAdSize must be passed for the type/size of banner ad");
                    return new PresentationResultHolder(new VungleException(28));
                }
                if (placement.getPlacementAdType() == 0) {
                    return new PresentationResultHolder(new VungleException(10));
                }
                advertisement.configure(this.adConfig);
                try {
                    this.repository.save(advertisement);
                    OMTracker make = this.omTrackerFactory.make(this.apiClient.getOmEnabled() && advertisement.getOmEnabled());
                    vungleWebClient.setWebViewObserver(make);
                    return new PresentationResultHolder(null, new MRAIDAdPresenter(advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, vungleWebClient, null, file, make, this.request.getImpression()), vungleWebClient);
                } catch (DatabaseHelper.DBException unused2) {
                    return new PresentationResultHolder(new VungleException(26));
                }
            } catch (VungleException e10) {
                return new PresentationResultHolder(e10);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask, android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            PresentationFactory.ViewCallback viewCallback;
            super.onPostExecute(presentationResultHolder);
            if (isCancelled() || (viewCallback = this.viewCallback) == null) {
                return;
            }
            viewCallback.onResult(new Pair<>((WebAdContract.WebAdPresenter) presentationResultHolder.advertisementPresenter, presentationResultHolder.webClient), presentationResultHolder.exception);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class BaseTask extends AsyncTask<Void, Void, PresentationResultHolder> {
        private AdLoader adLoader;
        private Downloader downloader;
        private OnModelLoadListener onDataLoadedListener;
        protected final Repository repository;
        protected final VungleStaticApi vungleStaticApi;
        private AtomicReference<Advertisement> adRef = new AtomicReference<>();
        private AtomicReference<Placement> plRef = new AtomicReference<>();

        /* loaded from: classes2.dex */
        public interface OnModelLoadListener {
            void onLoad(Advertisement advertisement, Placement placement);
        }

        public BaseTask(Repository repository, VungleStaticApi vungleStaticApi, OnModelLoadListener onModelLoadListener) {
            this.repository = repository;
            this.vungleStaticApi = vungleStaticApi;
            this.onDataLoadedListener = onModelLoadListener;
            Context appContext = Vungle.appContext();
            if (appContext != null) {
                ServiceLocator serviceLocator = ServiceLocator.getInstance(appContext);
                this.adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
                this.downloader = (Downloader) serviceLocator.getService(Downloader.class);
            }
        }

        public void clear() {
            this.onDataLoadedListener = null;
        }

        public Pair<Advertisement, Placement> loadPresentationData(AdRequest adRequest, Bundle bundle) throws VungleException {
            Advertisement advertisement;
            if (this.vungleStaticApi.isInitialized()) {
                if (adRequest != null && !TextUtils.isEmpty(adRequest.getPlacementId())) {
                    Placement placement = (Placement) this.repository.load(adRequest.getPlacementId(), Placement.class).get();
                    if (placement != null) {
                        if (placement.isMultipleHBPEnabled() && adRequest.getEventId() == null) {
                            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
                            throw new VungleException(36);
                        }
                        this.plRef.set(placement);
                        if (bundle == null) {
                            advertisement = this.repository.findValidAdvertisementForPlacement(adRequest.getPlacementId(), adRequest.getEventId()).get();
                        } else {
                            String string = bundle.getString(AdvertisementPresentationFactory.EXTRA_ADVERTISEMENT);
                            if (!TextUtils.isEmpty(string)) {
                                advertisement = (Advertisement) this.repository.load(string, Advertisement.class).get();
                            } else {
                                advertisement = null;
                            }
                        }
                        if (advertisement != null) {
                            this.adRef.set(advertisement);
                            File file = this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
                            if (file != null && file.isDirectory()) {
                                AdLoader adLoader = this.adLoader;
                                if (adLoader != null && this.downloader != null && adLoader.isAdLoadOptimizationEnabled(advertisement)) {
                                    Log.d(AdvertisementPresentationFactory.TAG, "Try to cancel downloading assets.");
                                    for (DownloadRequest downloadRequest : this.downloader.getAllRequests()) {
                                        if (advertisement.getId().equals(downloadRequest.getAdvertisementId())) {
                                            Log.d(AdvertisementPresentationFactory.TAG, "Cancel downloading: " + downloadRequest);
                                            this.downloader.cancel(downloadRequest);
                                        }
                                    }
                                }
                                return new Pair<>(advertisement, placement);
                            }
                            Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.EVENT_ID, advertisement.getId()).build());
                            throw new VungleException(26);
                        }
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
                        throw new VungleException(10);
                    }
                    Log.e(AdvertisementPresentationFactory.TAG, "No Placement for ID");
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
                    throw new VungleException(13);
                }
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
                throw new VungleException(10);
            }
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
            throw new VungleException(9);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            super.onPostExecute((BaseTask) presentationResultHolder);
            OnModelLoadListener onModelLoadListener = this.onDataLoadedListener;
            if (onModelLoadListener != null) {
                onModelLoadListener.onLoad(this.adRef.get(), this.plRef.get());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class FullScreenPresentationTask extends BaseTask {
        private final AdLoader adLoader;
        private Advertisement advertisement;
        private final VungleApiClient apiClient;
        private final CloseDelegate closeDelegate;

        @SuppressLint({"StaticFieldLeak"})
        private Context context;

        @SuppressLint({"StaticFieldLeak"})
        private FullAdWidget fullAdWidget;
        private final PresentationFactory.FullScreenCallback fullscreenCallback;
        private final JobRunner jobRunner;
        private final OMTracker.Factory omTrackerFactory;
        private final OptionsState optionsState;
        private final OrientationDelegate orientationDelegate;
        private final AdRequest request;
        private final Bundle savedState;

        public FullScreenPresentationTask(Context context, AdLoader adLoader, AdRequest adRequest, Repository repository, VungleStaticApi vungleStaticApi, JobRunner jobRunner, VungleApiClient vungleApiClient, FullAdWidget fullAdWidget, OptionsState optionsState, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate, PresentationFactory.FullScreenCallback fullScreenCallback, BaseTask.OnModelLoadListener onModelLoadListener, Bundle bundle, OMTracker.Factory factory) {
            super(repository, vungleStaticApi, onModelLoadListener);
            this.request = adRequest;
            this.fullAdWidget = fullAdWidget;
            this.optionsState = optionsState;
            this.context = context;
            this.fullscreenCallback = fullScreenCallback;
            this.savedState = bundle;
            this.jobRunner = jobRunner;
            this.apiClient = vungleApiClient;
            this.orientationDelegate = orientationDelegate;
            this.closeDelegate = closeDelegate;
            this.adLoader = adLoader;
            this.omTrackerFactory = factory;
        }

        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask
        public void clear() {
            super.clear();
            this.context = null;
            this.fullAdWidget = null;
        }

        @Override // android.os.AsyncTask
        public PresentationResultHolder doInBackground(Void... voidArr) {
            try {
                Pair<Advertisement, Placement> loadPresentationData = loadPresentationData(this.request, this.savedState);
                Advertisement advertisement = (Advertisement) loadPresentationData.first;
                this.advertisement = advertisement;
                Placement placement = (Placement) loadPresentationData.second;
                if (!this.adLoader.canRenderAd(advertisement)) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement is null or assets are missing");
                    return new PresentationResultHolder(new VungleException(10));
                }
                if (placement.getPlacementAdType() == 4) {
                    return new PresentationResultHolder(new VungleException(41));
                }
                if (placement.getPlacementAdType() != 0) {
                    return new PresentationResultHolder(new VungleException(29));
                }
                JobDelegateAnalytics jobDelegateAnalytics = new JobDelegateAnalytics(this.jobRunner);
                Cookie cookie = (Cookie) this.repository.load("appId", Cookie.class).get();
                if (cookie != null && !TextUtils.isEmpty(cookie.getString("appId"))) {
                    cookie.getString("appId");
                }
                Cookie cookie2 = (Cookie) this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get();
                boolean z10 = false;
                if (cookie2 != null && cookie2.getBoolean("isAdDownloadOptEnabled").booleanValue()) {
                    Advertisement advertisement2 = this.advertisement;
                    if (!advertisement2.assetsFullyDownloaded) {
                        List<AdAsset> loadAllAdAssetByStatus = this.repository.loadAllAdAssetByStatus(advertisement2.getId(), 3);
                        if (!loadAllAdAssetByStatus.isEmpty()) {
                            this.advertisement.updateMRAIDTokensFromAssetDB(loadAllAdAssetByStatus);
                            try {
                                this.repository.save(this.advertisement);
                            } catch (DatabaseHelper.DBException unused) {
                                Log.e(AdvertisementPresentationFactory.TAG, "Unable to update tokens");
                            }
                        }
                    }
                }
                VungleWebClient vungleWebClient = new VungleWebClient(this.advertisement, placement, ((Executors) ServiceLocator.getInstance(this.context).getService(Executors.class)).getOffloadExecutor());
                File file = this.repository.getAdvertisementAssetDirectory(this.advertisement.getId()).get();
                if (file == null || !file.isDirectory()) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                    return new PresentationResultHolder(new VungleException(26));
                }
                int adType = this.advertisement.getAdType();
                if (adType == 0) {
                    return new PresentationResultHolder(new LocalAdView(this.context, this.fullAdWidget, this.orientationDelegate, this.closeDelegate), new LocalAdPresenter(this.advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, vungleWebClient, this.optionsState, file, this.request.getImpression()), vungleWebClient);
                }
                if (adType != 1) {
                    return new PresentationResultHolder(new VungleException(10));
                }
                OMTracker.Factory factory = this.omTrackerFactory;
                if (this.apiClient.getOmEnabled() && this.advertisement.getOmEnabled()) {
                    z10 = true;
                }
                OMTracker make = factory.make(z10);
                vungleWebClient.setWebViewObserver(make);
                return new PresentationResultHolder(new MRAIDAdView(this.context, this.fullAdWidget, this.orientationDelegate, this.closeDelegate), new MRAIDAdPresenter(this.advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, vungleWebClient, this.optionsState, file, make, this.request.getImpression()), vungleWebClient);
            } catch (VungleException e10) {
                return new PresentationResultHolder(e10);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask, android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            super.onPostExecute(presentationResultHolder);
            if (isCancelled() || this.fullscreenCallback == null) {
                return;
            }
            if (presentationResultHolder.exception != null) {
                Log.e(AdvertisementPresentationFactory.TAG, "Exception on creating presenter", presentationResultHolder.exception);
                this.fullscreenCallback.onResult(new Pair<>(null, null), presentationResultHolder.exception);
            } else {
                this.fullAdWidget.linkWebView(presentationResultHolder.webClient, new JavascriptBridge(presentationResultHolder.advertisementPresenter));
                this.fullscreenCallback.onResult(new Pair<>(presentationResultHolder.adView, presentationResultHolder.advertisementPresenter), presentationResultHolder.exception);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class NativeViewPresentationTask extends BaseTask {
        private final AdConfig adConfig;
        private final AdLoader adLoader;

        @SuppressLint({"StaticFieldLeak"})
        private Context context;
        private final JobRunner jobRunner;

        @SuppressLint({"StaticFieldLeak"})
        private NativeAdLayout nativeAdLayout;
        private final PresentationFactory.NativeViewCallback nativeViewCallback;
        private final AdRequest request;
        private final Bundle savedState;

        public NativeViewPresentationTask(Context context, NativeAdLayout nativeAdLayout, AdRequest adRequest, AdConfig adConfig, AdLoader adLoader, Repository repository, VungleStaticApi vungleStaticApi, JobRunner jobRunner, PresentationFactory.NativeViewCallback nativeViewCallback, Bundle bundle, BaseTask.OnModelLoadListener onModelLoadListener) {
            super(repository, vungleStaticApi, onModelLoadListener);
            this.context = context;
            this.nativeAdLayout = nativeAdLayout;
            this.request = adRequest;
            this.adConfig = adConfig;
            this.nativeViewCallback = nativeViewCallback;
            this.savedState = bundle;
            this.jobRunner = jobRunner;
            this.adLoader = adLoader;
        }

        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask
        public void clear() {
            super.clear();
            this.context = null;
            this.nativeAdLayout = null;
        }

        @Override // android.os.AsyncTask
        public PresentationResultHolder doInBackground(Void... voidArr) {
            try {
                Pair<Advertisement, Placement> loadPresentationData = loadPresentationData(this.request, this.savedState);
                Advertisement advertisement = (Advertisement) loadPresentationData.first;
                if (advertisement.getAdType() != 1) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Invalid Ad Type for Native Ad.");
                    return new PresentationResultHolder(new VungleException(10));
                }
                Placement placement = (Placement) loadPresentationData.second;
                if (!this.adLoader.canPlayAd(advertisement)) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement is null or assets are missing");
                    return new PresentationResultHolder(new VungleException(10));
                }
                Cookie cookie = (Cookie) this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get();
                if ((cookie != null && cookie.getBoolean("isAdDownloadOptEnabled").booleanValue()) && !advertisement.assetsFullyDownloaded) {
                    List<AdAsset> loadAllAdAssetByStatus = this.repository.loadAllAdAssetByStatus(advertisement.getId(), 3);
                    if (!loadAllAdAssetByStatus.isEmpty()) {
                        advertisement.updateMRAIDTokensFromAssetDB(loadAllAdAssetByStatus);
                        try {
                            this.repository.save(advertisement);
                        } catch (DatabaseHelper.DBException unused) {
                            Log.e(AdvertisementPresentationFactory.TAG, "Unable to update tokens");
                        }
                    }
                }
                JobDelegateAnalytics jobDelegateAnalytics = new JobDelegateAnalytics(this.jobRunner);
                File file = this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
                if (file == null || !file.isDirectory()) {
                    Log.e(AdvertisementPresentationFactory.TAG, "Advertisement assets dir is missing");
                    return new PresentationResultHolder(new VungleException(26));
                }
                if (!advertisement.isNativeTemplateType()) {
                    return new PresentationResultHolder(new VungleException(10));
                }
                advertisement.configure(this.adConfig);
                try {
                    this.repository.save(advertisement);
                    return new PresentationResultHolder(new NativeAdView(this.context, this.nativeAdLayout), new NativeAdPresenter(advertisement, placement, this.repository, new HandlerScheduler(), jobDelegateAnalytics, null, this.request.getImpression()), null);
                } catch (DatabaseHelper.DBException unused2) {
                    return new PresentationResultHolder(new VungleException(26));
                }
            } catch (VungleException e10) {
                return new PresentationResultHolder(e10);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vungle.warren.AdvertisementPresentationFactory.BaseTask, android.os.AsyncTask
        public void onPostExecute(PresentationResultHolder presentationResultHolder) {
            PresentationFactory.NativeViewCallback nativeViewCallback;
            super.onPostExecute(presentationResultHolder);
            if (isCancelled() || (nativeViewCallback = this.nativeViewCallback) == null) {
                return;
            }
            nativeViewCallback.onResult(new Pair<>((NativeAdContract.NativeView) presentationResultHolder.adView, (NativeAdContract.NativePresenter) presentationResultHolder.advertisementPresenter), presentationResultHolder.exception);
        }
    }

    public AdvertisementPresentationFactory(AdLoader adLoader, VungleStaticApi vungleStaticApi, Repository repository, VungleApiClient vungleApiClient, JobRunner jobRunner, OMTracker.Factory factory, ExecutorService executorService) {
        this.vungleStaticApi = vungleStaticApi;
        this.repository = repository;
        this.apiClient = vungleApiClient;
        this.jobRunner = jobRunner;
        this.adLoader = adLoader;
        this.omTrackerFactory = factory;
        this.taskExecutor = executorService;
    }

    private void cancelTask() {
        BaseTask baseTask = this.task;
        if (baseTask != null) {
            baseTask.cancel(true);
            this.task.clear();
        }
    }

    @Override // com.vungle.warren.PresentationFactory
    public void destroy() {
        cancelTask();
    }

    @Override // com.vungle.warren.PresentationFactory
    public void getBannerViewPresentation(Context context, AdRequest adRequest, AdConfig adConfig, CloseDelegate closeDelegate, PresentationFactory.ViewCallback viewCallback) {
        cancelTask();
        BannerViewPresentationTask bannerViewPresentationTask = new BannerViewPresentationTask(context, adRequest, adConfig, this.adLoader, this.repository, this.vungleStaticApi, this.jobRunner, viewCallback, null, this.onModelLoadListener, this.apiClient, this.omTrackerFactory);
        this.task = bannerViewPresentationTask;
        bannerViewPresentationTask.executeOnExecutor(this.taskExecutor, new Void[0]);
    }

    @Override // com.vungle.warren.PresentationFactory
    public void getFullScreenPresentation(Context context, AdRequest adRequest, FullAdWidget fullAdWidget, OptionsState optionsState, CloseDelegate closeDelegate, OrientationDelegate orientationDelegate, Bundle bundle, PresentationFactory.FullScreenCallback fullScreenCallback) {
        cancelTask();
        FullScreenPresentationTask fullScreenPresentationTask = new FullScreenPresentationTask(context, this.adLoader, adRequest, this.repository, this.vungleStaticApi, this.jobRunner, this.apiClient, fullAdWidget, optionsState, orientationDelegate, closeDelegate, fullScreenCallback, this.onModelLoadListener, bundle, this.omTrackerFactory);
        this.task = fullScreenPresentationTask;
        fullScreenPresentationTask.executeOnExecutor(this.taskExecutor, new Void[0]);
    }

    @Override // com.vungle.warren.PresentationFactory
    public void getNativeViewPresentation(Context context, NativeAdLayout nativeAdLayout, AdRequest adRequest, AdConfig adConfig, PresentationFactory.NativeViewCallback nativeViewCallback) {
        cancelTask();
        NativeViewPresentationTask nativeViewPresentationTask = new NativeViewPresentationTask(context, nativeAdLayout, adRequest, adConfig, this.adLoader, this.repository, this.vungleStaticApi, this.jobRunner, nativeViewCallback, null, this.onModelLoadListener);
        this.task = nativeViewPresentationTask;
        nativeViewPresentationTask.executeOnExecutor(this.taskExecutor, new Void[0]);
    }

    @Override // com.vungle.warren.PresentationFactory
    public void saveState(Bundle bundle) {
        String id2;
        Advertisement advertisement = this.currentAdvertisement;
        if (advertisement == null) {
            id2 = null;
        } else {
            id2 = advertisement.getId();
        }
        bundle.putString(EXTRA_ADVERTISEMENT, id2);
    }

    /* loaded from: classes2.dex */
    public static class PresentationResultHolder {
        private AdContract.AdView adView;
        private AdContract.AdvertisementPresenter advertisementPresenter;
        private VungleException exception;
        private VungleWebClient webClient;

        public PresentationResultHolder(VungleException vungleException) {
            this.exception = vungleException;
        }

        public PresentationResultHolder(AdContract.AdView adView, AdContract.AdvertisementPresenter advertisementPresenter, VungleWebClient vungleWebClient) {
            this.adView = adView;
            this.advertisementPresenter = advertisementPresenter;
            this.webClient = vungleWebClient;
        }
    }
}
