package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vungle.warren.analytics.VungleAnalytics;
import com.vungle.warren.downloader.AssetDownloader;
import com.vungle.warren.downloader.CleverCache;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.downloader.DownloaderCache;
import com.vungle.warren.downloader.LRUCachePolicy;
import com.vungle.warren.locale.LocaleInfo;
import com.vungle.warren.locale.SystemLocaleInfo;
import com.vungle.warren.log.LogManager;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.omsdk.OMTracker;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.Designer;
import com.vungle.warren.persistence.FilePreferences;
import com.vungle.warren.persistence.GraphicDesigner;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.tasks.JobCreator;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.tasks.ReconfigJob;
import com.vungle.warren.tasks.VungleJobCreator;
import com.vungle.warren.tasks.utility.JobRunnerThreadPriorityHelper;
import com.vungle.warren.utility.ConcurrencyTimeoutProvider;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.NetworkProvider;
import com.vungle.warren.utility.SDKExecutors;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.AndroidPlatform;
import com.vungle.warren.utility.platform.Platform;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m8.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ServiceLocator {

    @SuppressLint({"StaticFieldLeak"})
    private static ServiceLocator INSTANCE;
    private final Context ctx;
    static final VungleStaticApi VUNGLE_STATIC_API = new VungleStaticApi() { // from class: com.vungle.warren.ServiceLocator.1
        @Override // com.vungle.warren.VungleStaticApi
        public Collection<String> getValidPlacements() {
            return Vungle.getValidPlacements();
        }

        @Override // com.vungle.warren.VungleStaticApi
        public boolean isInitialized() {
            return Vungle.isInitialized();
        }
    };
    private static final ReconfigJob.ReconfigCall RECONFIG_CALL = new ReconfigJob.ReconfigCall() { // from class: com.vungle.warren.ServiceLocator.27
        @Override // com.vungle.warren.tasks.ReconfigJob.ReconfigCall
        public void reConfigVungle() {
            Vungle.reConfigure();
        }
    };
    private Map<Class, Creator> creators = new HashMap();
    private Map<Class, Object> cache = new HashMap();

    /* loaded from: classes2.dex */
    public abstract class Creator<T> {
        private Creator() {
        }

        public abstract T create();

        public boolean isSingleton() {
            return true;
        }
    }

    private ServiceLocator(Context context) {
        this.ctx = context.getApplicationContext();
        buildCreators();
    }

    private void buildCreators() {
        this.creators.put(JobCreator.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.2
            @Override // com.vungle.warren.ServiceLocator.Creator
            public JobCreator create() {
                return new VungleJobCreator((Repository) ServiceLocator.this.getOrBuild(Repository.class), (Designer) ServiceLocator.this.getOrBuild(Designer.class), (VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), new VungleAnalytics((VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), (Repository) ServiceLocator.this.getOrBuild(Repository.class)), ServiceLocator.RECONFIG_CALL, (AdLoader) ServiceLocator.this.getOrBuild(AdLoader.class), ServiceLocator.VUNGLE_STATIC_API, (LogManager) ServiceLocator.this.getOrBuild(LogManager.class));
            }
        });
        this.creators.put(JobRunner.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.3
            @Override // com.vungle.warren.ServiceLocator.Creator
            public JobRunner create() {
                return new VungleJobRunner((JobCreator) ServiceLocator.this.getOrBuild(JobCreator.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getJobExecutor(), new JobRunnerThreadPriorityHelper(), NetworkProvider.getInstance(ServiceLocator.this.ctx));
            }
        });
        this.creators.put(AdLoader.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.4
            @Override // com.vungle.warren.ServiceLocator.Creator
            public AdLoader create() {
                return new AdLoader((Executors) ServiceLocator.this.getOrBuild(Executors.class), (Repository) ServiceLocator.this.getOrBuild(Repository.class), (VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), (CacheManager) ServiceLocator.this.getOrBuild(CacheManager.class), (Downloader) ServiceLocator.this.getOrBuild(Downloader.class), (RuntimeValues) ServiceLocator.this.getOrBuild(RuntimeValues.class), (VungleStaticApi) ServiceLocator.this.getOrBuild(VungleStaticApi.class), (VisionController) ServiceLocator.this.getOrBuild(VisionController.class), (OperationSequence) ServiceLocator.this.getOrBuild(OperationSequence.class), (OMInjector) ServiceLocator.this.getOrBuild(OMInjector.class));
            }
        });
        this.creators.put(Downloader.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.5
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Downloader create() {
                return new AssetDownloader((DownloaderCache) ServiceLocator.this.getOrBuild(DownloaderCache.class), AssetDownloader.VERIFICATION_WINDOW, NetworkProvider.getInstance(ServiceLocator.this.ctx), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getDownloaderExecutor(), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getUIExecutor());
            }
        });
        this.creators.put(VungleApiClient.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.6
            @Override // com.vungle.warren.ServiceLocator.Creator
            public VungleApiClient create() {
                return new VungleApiClient(ServiceLocator.this.ctx, (CacheManager) ServiceLocator.this.getOrBuild(CacheManager.class), (Repository) ServiceLocator.this.getOrBuild(Repository.class), (OMInjector) ServiceLocator.this.getOrBuild(OMInjector.class), (Platform) ServiceLocator.this.getOrBuild(Platform.class));
            }
        });
        this.creators.put(Repository.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.7
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Repository create() {
                Executors executors = (Executors) ServiceLocator.this.getOrBuild(Executors.class);
                return new Repository(ServiceLocator.this.ctx, (Designer) ServiceLocator.this.getOrBuild(Designer.class), executors.getIOExecutor(), executors.getUIExecutor());
            }
        });
        this.creators.put(LogManager.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.8
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Object create() {
                return new LogManager(ServiceLocator.this.ctx, (CacheManager) ServiceLocator.this.getOrBuild(CacheManager.class), (VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getLoggerExecutor(), (FilePreferences) ServiceLocator.this.getOrBuild(FilePreferences.class));
            }
        });
        this.creators.put(Designer.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.9
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Designer create() {
                return new GraphicDesigner((CacheManager) ServiceLocator.this.getOrBuild(CacheManager.class));
            }
        });
        this.creators.put(CacheManager.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.10
            @Override // com.vungle.warren.ServiceLocator.Creator
            public CacheManager create() {
                return new CacheManager(ServiceLocator.this.ctx, (FilePreferences) ServiceLocator.this.getOrBuild(FilePreferences.class));
            }
        });
        this.creators.put(Platform.class, new Creator<Platform>() { // from class: com.vungle.warren.ServiceLocator.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Platform create() {
                return new AndroidPlatform(ServiceLocator.this.ctx, (Repository) ServiceLocator.this.getOrBuild(Repository.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getUAExecutor(), (TimeoutProvider) ServiceLocator.this.getOrBuild(TimeoutProvider.class));
            }
        });
        this.creators.put(Executors.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.12
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Executors create() {
                return new SDKExecutors();
            }
        });
        this.creators.put(RuntimeValues.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.13
            @Override // com.vungle.warren.ServiceLocator.Creator
            public RuntimeValues create() {
                return new RuntimeValues();
            }
        });
        this.creators.put(VungleStaticApi.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.14
            @Override // com.vungle.warren.ServiceLocator.Creator
            public VungleStaticApi create() {
                return ServiceLocator.VUNGLE_STATIC_API;
            }
        });
        this.creators.put(PresentationFactory.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.15
            @Override // com.vungle.warren.ServiceLocator.Creator
            public boolean isSingleton() {
                return false;
            }

            @Override // com.vungle.warren.ServiceLocator.Creator
            public PresentationFactory create() {
                return new AdvertisementPresentationFactory((AdLoader) ServiceLocator.this.getOrBuild(AdLoader.class), (VungleStaticApi) ServiceLocator.this.getOrBuild(VungleStaticApi.class), (Repository) ServiceLocator.this.getOrBuild(Repository.class), (VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), (JobRunner) ServiceLocator.this.getOrBuild(JobRunner.class), (OMTracker.Factory) ServiceLocator.this.getOrBuild(OMTracker.Factory.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getTaskExecutor());
            }
        });
        this.creators.put(DownloaderCache.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.16
            @Override // com.vungle.warren.ServiceLocator.Creator
            public Object create() {
                CacheManager cacheManager = (CacheManager) ServiceLocator.this.getOrBuild(CacheManager.class);
                return new CleverCache(cacheManager, new LRUCachePolicy(cacheManager, CleverCache.CC_DIR), new DownloaderSizeProvider(cacheManager, (RuntimeValues) ServiceLocator.this.getOrBuild(RuntimeValues.class), 0.1f), TimeUnit.DAYS.toMillis(90L));
            }
        });
        this.creators.put(VisionController.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.17
            @Override // com.vungle.warren.ServiceLocator.Creator
            public VisionController create() {
                return new VisionController((Repository) ServiceLocator.this.getOrBuild(Repository.class), NetworkProvider.getInstance(ServiceLocator.this.ctx));
            }
        });
        this.creators.put(TimeoutProvider.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.18
            @Override // com.vungle.warren.ServiceLocator.Creator
            public TimeoutProvider create() {
                return new ConcurrencyTimeoutProvider();
            }
        });
        this.creators.put(OperationSequence.class, new Creator() { // from class: com.vungle.warren.ServiceLocator.19
            @Override // com.vungle.warren.ServiceLocator.Creator
            public OperationSequence create() {
                return new OperationSequence();
            }
        });
        this.creators.put(OMInjector.class, new Creator<OMInjector>() { // from class: com.vungle.warren.ServiceLocator.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public OMInjector create() {
                return new OMInjector(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(OMTracker.Factory.class, new Creator<OMTracker.Factory>() { // from class: com.vungle.warren.ServiceLocator.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public OMTracker.Factory create() {
                return new OMTracker.Factory();
            }
        });
        this.creators.put(CacheBustManager.class, new Creator<CacheBustManager>() { // from class: com.vungle.warren.ServiceLocator.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public CacheBustManager create() {
                return new CacheBustManager((JobRunner) ServiceLocator.this.getOrBuild(JobRunner.class));
            }
        });
        this.creators.put(FilePreferences.class, new Creator<FilePreferences>() { // from class: com.vungle.warren.ServiceLocator.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public FilePreferences create() {
                return new FilePreferences(ServiceLocator.this.ctx, ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getIOExecutor());
            }
        });
        this.creators.put(i.class, new Creator<i>() { // from class: com.vungle.warren.ServiceLocator.24
            @Override // com.vungle.warren.ServiceLocator.Creator
            public i create() {
                return new i();
            }
        });
        this.creators.put(LocaleInfo.class, new Creator<LocaleInfo>() { // from class: com.vungle.warren.ServiceLocator.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public LocaleInfo create() {
                return new SystemLocaleInfo();
            }
        });
        this.creators.put(BidTokenEncoder.class, new Creator<BidTokenEncoder>() { // from class: com.vungle.warren.ServiceLocator.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.warren.ServiceLocator.Creator
            public BidTokenEncoder create() {
                return new BidTokenEncoder((Repository) ServiceLocator.this.getOrBuild(Repository.class), (TimeoutProvider) ServiceLocator.this.getOrBuild(TimeoutProvider.class), (LocaleInfo) ServiceLocator.this.getOrBuild(LocaleInfo.class), (Platform) ServiceLocator.this.getOrBuild(Platform.class), (i) ServiceLocator.this.getOrBuild(i.class), (SDKExecutors) ServiceLocator.this.getOrBuild(SDKExecutors.class));
            }
        });
    }

    public static synchronized void deInit() {
        synchronized (ServiceLocator.class) {
            INSTANCE = null;
        }
    }

    public static synchronized ServiceLocator getInstance(Context context) {
        ServiceLocator serviceLocator;
        synchronized (ServiceLocator.class) {
            if (INSTANCE == null) {
                INSTANCE = new ServiceLocator(context);
            }
            serviceLocator = INSTANCE;
        }
        return serviceLocator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T getOrBuild(Class<T> cls) {
        Class serviceClass = getServiceClass(cls);
        T t10 = (T) this.cache.get(serviceClass);
        if (t10 == null) {
            Creator creator = this.creators.get(serviceClass);
            if (creator != null) {
                T t11 = (T) creator.create();
                if (creator.isSingleton()) {
                    this.cache.put(serviceClass, t11);
                }
                return t11;
            }
            throw new IllegalArgumentException("Unknown class");
        }
        return t10;
    }

    private Class getServiceClass(Class cls) {
        for (Class cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public synchronized <T> void bindService(Class<T> cls, T t10) {
        this.cache.put(getServiceClass(cls), t10);
    }

    public synchronized <T> T getService(Class<T> cls) {
        return (T) getOrBuild(cls);
    }

    public synchronized <T> boolean isCreated(Class<T> cls) {
        return this.cache.containsKey(getServiceClass(cls));
    }
}
