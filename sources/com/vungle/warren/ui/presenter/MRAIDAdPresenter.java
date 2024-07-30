package com.vungle.warren.ui.presenter;

import a3.l;
import android.content.ActivityNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.anythink.basead.b.a;
import com.huawei.hms.ads.ep;
import com.huawei.hms.ads.gl;
import com.vungle.warren.ClickCoordinateTracker;
import com.vungle.warren.SessionTracker;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.omsdk.OMTracker;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.WebViewAPI;
import com.vungle.warren.utility.AsyncFileUtils;
import com.vungle.warren.utility.Constants;
import com.vungle.warren.utility.Scheduler;
import com.vungle.warren.utility.ThreadUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m8.q;
import m8.s;

/* loaded from: classes2.dex */
public class MRAIDAdPresenter implements WebAdContract.WebAdPresenter, WebViewAPI.MRAIDDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    private static final String ACTION_WITH_VALUE = "actionWithValue";
    private static final String CLOSE = "close";
    private static final String CONSENT_ACTION = "consentAction";
    private static final String ERROR = "error";
    private static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    private static final String EXTRA_REPORT = "saved_report";
    private static final String OPEN = "open";
    private static final String OPEN_DEEPLINK_SUCCESS = "deeplinkSuccess";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    private static final String OPEN_PRIVACY = "openPrivacy";
    private static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    private static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "com.vungle.warren.ui.presenter.MRAIDAdPresenter";
    private static final String TPAT = "tpat";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    private static final String VIDEO_VIEWED = "videoViewed";
    private WebAdContract.WebAdView adView;
    private boolean adViewed;
    private Advertisement advertisement;
    private final AdAnalytics analytics;
    private File assetDir;
    private boolean backEnabled;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private ClickCoordinateTracker clickCoordinateTracker;
    private long duration;
    private DurationRecorder durationRecorder;
    private AsyncFileUtils.ExistenceOperation fileExistenceOperation;
    private final String[] impressionUrls;
    private final OMTracker omTracker;
    private final Placement placement;
    private Report report;
    private Repository repository;
    private final Scheduler scheduler;
    private WebViewAPI webClient;
    private Map<String, Cookie> cookieMap = new HashMap();
    private AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private AtomicBoolean isDestroying = new AtomicBoolean(false);
    private Repository.SaveCallback repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.1
        boolean errorHappened = false;

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onError(Exception exc) {
            if (this.errorHappened) {
                return;
            }
            this.errorHappened = true;
            VungleException vungleException = new VungleException(26);
            MRAIDAdPresenter.this.makeBusError(vungleException);
            VungleLogger.error("MRAIDAdPresenter", vungleException.getLocalizedMessage());
            MRAIDAdPresenter.this.closeView();
        }

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onSaved() {
        }
    };

    public MRAIDAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, WebViewAPI webViewAPI, OptionsState optionsState, File file, OMTracker oMTracker, String[] strArr) {
        this.advertisement = advertisement;
        this.repository = repository;
        this.placement = placement;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.webClient = webViewAPI;
        this.assetDir = file;
        this.omTracker = oMTracker;
        this.impressionUrls = strArr;
        loadData(optionsState);
        if (advertisement.isClickCoordinatesTrackingEnabled()) {
            this.clickCoordinateTracker = new ClickCoordinateTracker(advertisement, adAnalytics);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeView() {
        this.adView.close();
        this.scheduler.cancelAll();
    }

    private void download() {
        reportAction(a.C0052a.f3676k, "");
        try {
            this.analytics.ping(new String[]{this.advertisement.getCTAURL(true)});
            this.adView.open(this.advertisement.getDeeplinkUrl(), this.advertisement.getCTAURL(false), new PresenterAppLeftCallback(this.bus, this.placement), new PresenterAdOpenCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.8
                @Override // com.vungle.warren.ui.PresenterAdOpenCallback
                public void onAdOpenType(PresenterAdOpenCallback.AdOpenType adOpenType) {
                    if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                        MRAIDAdPresenter.this.reportAction(MRAIDAdPresenter.OPEN_DEEPLINK_SUCCESS, null);
                    }
                }
            });
        } catch (ActivityNotFoundException unused) {
            VungleLogger.error("MRAIDAdPresenter#download", "Download - Activity Not Found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWebViewException(VungleException vungleException) {
        WebAdContract.WebAdView webAdView = this.adView;
        if (webAdView != null) {
            webAdView.removeWebView();
        }
        VungleLogger.error("MRAIDAdPresenter#handleWebViewException", "WebViewException: " + vungleException.getLocalizedMessage());
        reportErrorAndCloseAd(vungleException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void loadData(OptionsState optionsState) {
        Report report;
        this.cookieMap.put(Cookie.INCENTIVIZED_TEXT_COOKIE, this.repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get());
        this.cookieMap.put(Cookie.CONSENT_COOKIE, this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get());
        this.cookieMap.put(Cookie.CONFIG_COOKIE, this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get());
        if (optionsState != null) {
            String string = optionsState.getString(EXTRA_REPORT);
            if (TextUtils.isEmpty(string)) {
                report = null;
            } else {
                report = (Report) this.repository.load(string, Report.class).get();
            }
            if (report != null) {
                this.report = report;
            }
        }
    }

    private void loadMraid(File file) {
        File file2 = new File(file.getParent());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file2.getPath());
        final File file3 = new File(l.p(sb2, File.separator, "index.html"));
        this.fileExistenceOperation = AsyncFileUtils.isFileExistAsync(file3, new AsyncFileUtils.FileExistCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.3
            @Override // com.vungle.warren.utility.AsyncFileUtils.FileExistCallback
            public void status(boolean z10) {
                if (!z10) {
                    MRAIDAdPresenter.this.makeBusError(new VungleException(27));
                    MRAIDAdPresenter.this.makeBusError(new VungleException(10));
                    MRAIDAdPresenter.this.adView.close();
                } else {
                    MRAIDAdPresenter.this.adView.showWebsite(Advertisement.FILE_SCHEME + file3.getPath());
                    MRAIDAdPresenter.this.recordPlayRemoteUrl();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(VungleException vungleException) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(vungleException, this.placement.getId());
        }
    }

    private void prepare(OptionsState optionsState) {
        String string;
        this.webClient.setMRAIDDelegate(this);
        this.webClient.setErrorHandler(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.assetDir.getPath());
        loadMraid(new File(l.p(sb2, File.separator, "template")));
        Cookie cookie = this.cookieMap.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie != null) {
            this.advertisement.setIncentivizedText(cookie.getString("title"), cookie.getString("body"), cookie.getString("continue"), cookie.getString("close"));
        }
        if (cookie == null) {
            string = null;
        } else {
            string = cookie.getString("userID");
        }
        boolean z10 = false;
        if (this.report == null) {
            Report report = new Report(this.advertisement, this.placement, System.currentTimeMillis(), string);
            this.report = report;
            report.setTtDownload(this.advertisement.getTtDownload());
            this.repository.save(this.report, this.repoCallback, false);
        }
        if (this.durationRecorder == null) {
            this.durationRecorder = new DurationRecorder(this.report, this.repository, this.repoCallback);
        }
        Cookie cookie2 = this.cookieMap.get(Cookie.CONSENT_COOKIE);
        if (cookie2 != null) {
            if (cookie2.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie2.getString("consent_status"))) {
                z10 = true;
            }
            this.webClient.setConsentStatus(z10, cookie2.getString("consent_title"), cookie2.getString("consent_message"), cookie2.getString("button_accept"), cookie2.getString("button_deny"));
            if (z10) {
                cookie2.putValue("consent_status", Gdpr.OPTED_OUT_BY_TIMEOUT);
                cookie2.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                cookie2.putValue("consent_source", "vungle_modal");
                this.repository.save(cookie2, this.repoCallback);
            }
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(this.placement.isIncentivized());
        if (showCloseDelay > 0) {
            this.scheduler.schedule(new Runnable() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    MRAIDAdPresenter.this.backEnabled = true;
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        this.adView.updateWindow();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("start", null, this.placement.getId());
        }
    }

    private void recordMraidError(String str) {
        if (this.report != null && !TextUtils.isEmpty(str)) {
            this.report.recordError(str);
            this.repository.save(this.report, this.repoCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPlayRemoteUrl() {
        Report report;
        Advertisement advertisement = (Advertisement) this.repository.load(this.advertisement.getId(), Advertisement.class).get();
        if (advertisement != null && (report = this.report) != null) {
            report.setAllAssetDownloaded(advertisement.assetsFullyDownloaded);
            this.repository.save(this.report, this.repoCallback, false);
        }
    }

    private void reportErrorAndCloseAd(VungleException vungleException) {
        makeBusError(vungleException);
        closeView();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(@AdContract.AdStopReason int i10) {
        AsyncFileUtils.ExistenceOperation existenceOperation = this.fileExistenceOperation;
        if (existenceOperation != null) {
            existenceOperation.cancel();
        }
        stop(i10);
        this.webClient.setWebViewObserver(null);
        this.adView.destroyAdView(this.omTracker.stop());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        this.repository.save(this.report, this.repoCallback);
        optionsState.put(EXTRA_REPORT, this.report.getId());
        optionsState.put(EXTRA_INCENTIVIZED_SENT, this.sendReportIncentivized.get());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        if (this.backEnabled) {
            this.adView.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
            return false;
        }
        return false;
    }

    @Override // com.vungle.warren.ui.JavascriptBridge.MraidHandler
    public void onMraidAction(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -314498168:
                if (str.equals(JavascriptBridge.MraidHandler.PRIVACY_ACTION)) {
                    c10 = 0;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1427818632:
                if (str.equals("download")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return;
            case 1:
                closeView();
                return;
            case 2:
                download();
                return;
            default:
                throw new IllegalArgumentException("Unknown action ".concat(str));
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String str, boolean z10) {
        recordMraidError(str);
        VungleLogger.error("MRAIDAdPresenter#onReceivedError", str);
        if (z10) {
            reportErrorAndCloseAd(new VungleException(38));
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        VungleException vungleException = new VungleException(32);
        handleWebViewException(vungleException);
        VungleLogger.error("MRAIDAdPresenter#onRenderProcessUnresponsive", vungleException.getLocalizedMessage());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.adView.updateWindow();
        this.webClient.notifyPropertiesChange(true);
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdPresenter
    public void onViewTouched(MotionEvent motionEvent) {
        ClickCoordinateTracker clickCoordinateTracker = this.clickCoordinateTracker;
        if (clickCoordinateTracker != null) {
            clickCoordinateTracker.trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, boolean z10) {
        handleWebViewException(new VungleException(31));
        VungleLogger.error("MRAIDAdPresenteronWebRenderingProcessGone", new VungleException(31).getLocalizedMessage());
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.vungle.warren.ui.view.WebViewAPI.MRAIDDelegate
    public boolean processCommand(String str, q qVar) {
        char c10;
        float f;
        char c11;
        char c12;
        Handler handler = new Handler(Looper.getMainLooper());
        str.getClass();
        switch (str.hashCode()) {
            case -1912374177:
                if (str.equals(SUCCESSFUL_VIEW)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1422950858:
                if (str.equals("action")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -735200587:
                if (str.equals(ACTION_WITH_VALUE)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -660787472:
                if (str.equals(CONSENT_ACTION)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -511324706:
                if (str.equals(OPEN_PRIVACY)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -418575596:
                if (str.equals(OPEN_NON_MRAID)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -348095344:
                if (str.equals(USE_CUSTOM_PRIVACY)) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3417674:
                if (str.equals("open")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3566511:
                if (str.equals(TPAT)) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 133423073:
                if (str.equals(SET_ORIENTATION_PROPERTIES)) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1614272768:
                if (str.equals(USE_CUSTOM_CLOSE)) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
                if (eventListener != null) {
                    eventListener.onNext(SUCCESSFUL_VIEW, null, this.placement.getId());
                }
                Cookie cookie = this.cookieMap.get(Cookie.CONFIG_COOKIE);
                if (this.placement.isIncentivized() && cookie != null && cookie.getBoolean("isReportIncentivizedEnabled").booleanValue() && !this.sendReportIncentivized.getAndSet(true)) {
                    q qVar2 = new q();
                    qVar2.n(new s(this.placement.getId()), "placement_reference_id");
                    qVar2.n(new s(this.advertisement.getAppID()), "app_id");
                    qVar2.n(new s(Long.valueOf(this.report.getAdStartTime())), ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME);
                    qVar2.n(new s(this.report.getUserID()), "user");
                    this.analytics.ri(qVar2);
                }
                return true;
            case 2:
                String m10 = qVar.s("event").m();
                String m11 = qVar.s("value").m();
                this.report.recordAction(m10, m11, System.currentTimeMillis());
                this.repository.save(this.report, this.repoCallback);
                if (m10.equals("videoViewed")) {
                    try {
                        f = Float.parseFloat(m11);
                    } catch (NumberFormatException unused) {
                        Log.e(TAG, "value for videoViewed is null !");
                        f = 0.0f;
                    }
                    AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
                    if (eventListener2 != null && f > gl.Code && !this.adViewed) {
                        this.adViewed = true;
                        eventListener2.onNext("adViewed", null, this.placement.getId());
                        String[] strArr = this.impressionUrls;
                        if (strArr != null) {
                            this.analytics.ping(strArr);
                        }
                    }
                    if (this.duration > 0) {
                        this.durationRecorder.update();
                    }
                }
                if (m10.equals("videoLength")) {
                    this.duration = Long.parseLong(m11);
                    reportAction("videoLength", m11);
                    handler.post(new Runnable() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            MRAIDAdPresenter.this.webClient.notifyPropertiesChange(true);
                        }
                    });
                }
                handler.post(new Runnable() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MRAIDAdPresenter.this.adView.setVisibility(true);
                    }
                });
                break;
            case 1:
                return true;
            case 3:
                Cookie cookie2 = this.cookieMap.get(Cookie.CONSENT_COOKIE);
                if (cookie2 == null) {
                    cookie2 = new Cookie(Cookie.CONSENT_COOKIE);
                }
                cookie2.putValue("consent_status", qVar.s("event").m());
                cookie2.putValue("consent_source", "vungle_modal");
                cookie2.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                this.repository.save(cookie2, this.repoCallback);
                return true;
            case 4:
                this.adView.open(null, qVar.s("url").m(), new PresenterAppLeftCallback(this.bus, this.placement), null);
                return true;
            case 5:
            case 7:
                reportAction("download", null);
                if ("open".equalsIgnoreCase(str)) {
                    reportAction("mraidOpen", null);
                } else {
                    reportAction("nonMraidOpen", null);
                }
                String deeplinkUrl = this.advertisement.getDeeplinkUrl();
                String m12 = qVar.s("url").m();
                if ((deeplinkUrl != null && !deeplinkUrl.isEmpty()) || (m12 != null && !m12.isEmpty())) {
                    this.adView.open(deeplinkUrl, m12, new PresenterAppLeftCallback(this.bus, this.placement), new PresenterAdOpenCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.6
                        @Override // com.vungle.warren.ui.PresenterAdOpenCallback
                        public void onAdOpenType(PresenterAdOpenCallback.AdOpenType adOpenType) {
                            if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                                MRAIDAdPresenter.this.reportAction(MRAIDAdPresenter.OPEN_DEEPLINK_SUCCESS, null);
                            }
                        }
                    });
                } else {
                    Log.e(TAG, "CTA destination URL is not configured properly");
                }
                AdContract.AdvertisementPresenter.EventListener eventListener3 = this.bus;
                if (eventListener3 != null) {
                    eventListener3.onNext("open", "adClick", this.placement.getId());
                }
                return true;
            case 6:
                String m13 = qVar.s(USE_CUSTOM_PRIVACY).m();
                m13.getClass();
                switch (m13.hashCode()) {
                    case 3178655:
                        if (m13.equals("gone")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3569038:
                        if (m13.equals(ep.Code)) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 97196323:
                        if (m13.equals(ep.V)) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                    case 1:
                    case 2:
                        return true;
                    default:
                        throw new IllegalArgumentException("Unknown value ".concat(m13));
                }
            case '\b':
                this.analytics.ping(this.advertisement.getTpatUrls(qVar.s("event").m()));
                return true;
            case '\t':
                reportAction("mraidClose", null);
                closeView();
                return true;
            case '\n':
                String asString = JsonUtil.getAsString(qVar, "code", null);
                final String format = String.format("%s Creative Id: %s", asString, this.advertisement.getCreativeId());
                Log.e(TAG, "Receive Creative error: " + format);
                recordMraidError(asString);
                ThreadUtil.runOnUiThread(new Runnable() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.7
                    @Override // java.lang.Runnable
                    public void run() {
                        MRAIDAdPresenter.this.handleWebViewException(new VungleException(40, format));
                    }
                });
                return true;
            case 11:
                String asString2 = JsonUtil.getAsString(qVar, "forceOrientation", null);
                if (!TextUtils.isEmpty(asString2)) {
                    String lowerCase = asString2.toLowerCase();
                    lowerCase.getClass();
                    if (!lowerCase.equals("portrait")) {
                        if (lowerCase.equals("landscape")) {
                            this.adView.setOrientation(6);
                        }
                    } else {
                        this.adView.setOrientation(7);
                    }
                }
                return true;
            case '\f':
                String m14 = qVar.s("sdkCloseButton").m();
                m14.getClass();
                switch (m14.hashCode()) {
                    case -1901805651:
                        if (m14.equals("invisible")) {
                            c12 = 0;
                            break;
                        }
                        c12 = 65535;
                        break;
                    case 3178655:
                        if (m14.equals("gone")) {
                            c12 = 1;
                            break;
                        }
                        c12 = 65535;
                        break;
                    case 466743410:
                        if (m14.equals("visible")) {
                            c12 = 2;
                            break;
                        }
                        c12 = 65535;
                        break;
                    default:
                        c12 = 65535;
                        break;
                }
                switch (c12) {
                    case 0:
                    case 1:
                    case 2:
                        return true;
                    default:
                        throw new IllegalArgumentException("Unknown value ".concat(m14));
                }
            default:
                VungleLogger.error("MRAIDAdPresenter#processCommand", "Unknown MRAID Command");
                return true;
        }
    }

    public void reportAction(String str, String str2) {
        if (str.equals("videoLength")) {
            long parseLong = Long.parseLong(str2);
            this.duration = parseLong;
            this.report.setVideoLength(parseLong);
            this.repository.save(this.report, this.repoCallback);
            return;
        }
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void restoreFromSave(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        boolean z10 = optionsState.getBoolean(EXTRA_INCENTIVIZED_SENT, false);
        if (z10) {
            this.sendReportIncentivized.set(z10);
        }
        if (this.report == null) {
            this.adView.close();
            VungleLogger.error("MRAIDAdPresenter#restoreFromSave", "The advertisement was not started and cannot be restored.");
        }
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdPresenter
    public void setAdVisibility(boolean z10) {
        this.webClient.setAdVisibility(z10);
        if (z10) {
            this.durationRecorder.start();
        } else {
            this.durationRecorder.stop();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        if (!this.adView.hasWebView()) {
            reportErrorAndCloseAd(new VungleException(31));
            return;
        }
        this.adView.setImmersiveMode();
        this.adView.resumeWeb();
        setAdVisibility(true);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(@AdContract.AdStopReason int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.adView.pauseWeb();
        setAdVisibility(false);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true)) {
            WebViewAPI webViewAPI = this.webClient;
            String str = null;
            if (webViewAPI != null) {
                webViewAPI.setMRAIDDelegate(null);
            }
            if (z12) {
                reportAction("mraidCloseByApi", null);
            }
            this.repository.save(this.report, this.repoCallback);
            AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
            if (eventListener != null) {
                if (this.report.isCTAClicked()) {
                    str = "isCTAClicked";
                }
                eventListener.onNext("end", str, this.placement.getId());
            }
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void attach(WebAdContract.WebAdView webAdView, OptionsState optionsState) {
        this.isDestroying.set(false);
        this.adView = webAdView;
        webAdView.setPresenter(this);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(Constants.ATTACH, this.advertisement.getCreativeId(), this.placement.getId());
        }
        this.omTracker.start();
        int settings = this.advertisement.getAdConfig().getSettings();
        if (settings > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        int adOrientation = this.advertisement.getAdConfig().getAdOrientation();
        int i10 = 6;
        if (adOrientation == 3) {
            int orientation = this.advertisement.getOrientation();
            if (orientation != 0) {
                if (orientation != 1) {
                    i10 = -1;
                }
            }
            i10 = 7;
        } else {
            if (adOrientation != 0) {
                if (adOrientation != 1) {
                    i10 = 4;
                }
            }
            i10 = 7;
        }
        Log.d(TAG, "Requested Orientation " + i10);
        webAdView.setOrientation(i10);
        prepare(optionsState);
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, true).addData(SessionAttribute.EVENT_ID, this.advertisement.getId()).build());
    }
}
