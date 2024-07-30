package com.vungle.warren.ui.presenter;

import a3.l;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.anythink.core.common.res.d;
import com.huawei.hms.ads.ep;
import com.vungle.warren.SessionTracker;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.WebViewAPI;
import com.vungle.warren.utility.AsyncFileUtils;
import com.vungle.warren.utility.Constants;
import com.vungle.warren.utility.Scheduler;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m8.q;
import m8.s;

/* loaded from: classes2.dex */
public class LocalAdPresenter implements LocalAdContract.LocalPresenter, WebViewAPI.WebClientErrorHandler {
    static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    static final String EXTRA_IN_POST = "in_post_roll";
    static final String EXTRA_IS_MUTED = "is_muted_mode";
    static final String EXTRA_REPORT = "saved_report";
    static final String EXTRA_VIDEO_POSITION = "videoPosition";
    static final String HTTPS_VUNGLE_COM_PRIVACY = "https://vungle.com/privacy/";
    public static final int INCENTIVIZED_TRESHOLD = 75;
    static final String TAG = "LocalAdPresenter";
    private LocalAdContract.LocalView adView;
    private boolean adViewed;
    private Advertisement advertisement;
    private final AdAnalytics analytics;
    private File assetDir;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private int duration;
    private DurationRecorder durationRecorder;
    private AsyncFileUtils.ExistenceOperation fileExistenceOperation;
    private final String[] impressionUrls;
    private boolean inPost;
    private boolean muted;
    private Placement placement;
    private int progress;
    private Report report;
    private Repository repository;
    private final Scheduler scheduler;
    private boolean userExitEnabled;
    private int videoPosition;
    private final WebViewAPI webViewAPI;
    private final Map<String, Cookie> cookies = new HashMap();
    private String dialogTitle = "Are you sure?";
    private String dialogBody = "If you exit now, you will not get your reward";
    private String dialogContinue = "Continue";
    private String dialogClose = "Close";
    private AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private AtomicBoolean isDestroying = new AtomicBoolean(false);
    private LinkedList<Advertisement.Checkpoint> checkpointList = new LinkedList<>();
    private Repository.SaveCallback repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.1
        boolean errorHappened = false;

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onError(Exception exc) {
            if (this.errorHappened) {
                return;
            }
            this.errorHappened = true;
            LocalAdPresenter.this.makeBusError(26);
            VungleLogger.error("LocalAdPresenter#onError", new VungleException(26).getLocalizedMessage());
            LocalAdPresenter.this.closeAndReport();
        }

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onSaved() {
        }
    };
    private AtomicBoolean busy = new AtomicBoolean(false);

    public LocalAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, WebViewAPI webViewAPI, OptionsState optionsState, File file, String[] strArr) {
        this.advertisement = advertisement;
        this.placement = placement;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.webViewAPI = webViewAPI;
        this.repository = repository;
        this.assetDir = file;
        this.impressionUrls = strArr;
        if (advertisement.getCheckpoints() != null) {
            this.checkpointList.addAll(advertisement.getCheckpoints());
            Collections.sort(this.checkpointList);
        }
        loadData(optionsState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAndReport() {
        if (this.busy.get()) {
            Log.w(TAG, "Busy with closing");
            return;
        }
        this.busy.set(true);
        reportAction("close", null);
        this.scheduler.cancelAll();
        this.adView.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueWithPostroll() {
        if (this.advertisement.hasPostroll()) {
            playPost();
        } else {
            closeAndReport();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079 A[Catch: ActivityNotFoundException -> 0x0087, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x0087, blocks: (B:3:0x0009, B:5:0x004f, B:8:0x0056, B:9:0x0075, B:11:0x0079, B:16:0x0070), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void download() {
        /*
            r7 = this;
            java.lang.String r0 = "LocalAdPresenter"
            java.lang.String r1 = "cta"
            java.lang.String r2 = ""
            r7.reportAction(r1, r2)
            com.vungle.warren.analytics.AdAnalytics r1 = r7.analytics     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Advertisement r2 = r7.advertisement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r3 = "postroll_click"
            java.lang.String[] r2 = r2.getTpatUrls(r3)     // Catch: android.content.ActivityNotFoundException -> L87
            r1.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.analytics.AdAnalytics r1 = r7.analytics     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Advertisement r2 = r7.advertisement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r3 = "click_url"
            java.lang.String[] r2 = r2.getTpatUrls(r3)     // Catch: android.content.ActivityNotFoundException -> L87
            r1.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.analytics.AdAnalytics r1 = r7.analytics     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Advertisement r2 = r7.advertisement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r3 = "video_click"
            java.lang.String[] r2 = r2.getTpatUrls(r3)     // Catch: android.content.ActivityNotFoundException -> L87
            r1.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.analytics.AdAnalytics r1 = r7.analytics     // Catch: android.content.ActivityNotFoundException -> L87
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Advertisement r4 = r7.advertisement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r2 = r4.getCTAURL(r2)     // Catch: android.content.ActivityNotFoundException -> L87
            r4 = 0
            r3[r4] = r2     // Catch: android.content.ActivityNotFoundException -> L87
            r1.ping(r3)     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r1 = "download"
            r2 = 0
            r7.reportAction(r1, r2)     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Advertisement r1 = r7.advertisement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r1 = r1.getCTAURL(r4)     // Catch: android.content.ActivityNotFoundException -> L87
            if (r1 == 0) goto L70
            boolean r2 = r1.isEmpty()     // Catch: android.content.ActivityNotFoundException -> L87
            if (r2 == 0) goto L56
            goto L70
        L56:
            com.vungle.warren.ui.contract.LocalAdContract$LocalView r2 = r7.adView     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Advertisement r3 = r7.advertisement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r3 = r3.getDeeplinkUrl()     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.ui.PresenterAppLeftCallback r4 = new com.vungle.warren.ui.PresenterAppLeftCallback     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r5 = r7.bus     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.model.Placement r6 = r7.placement     // Catch: android.content.ActivityNotFoundException -> L87
            r4.<init>(r5, r6)     // Catch: android.content.ActivityNotFoundException -> L87
            com.vungle.warren.ui.presenter.LocalAdPresenter$6 r5 = new com.vungle.warren.ui.presenter.LocalAdPresenter$6     // Catch: android.content.ActivityNotFoundException -> L87
            r5.<init>()     // Catch: android.content.ActivityNotFoundException -> L87
            r2.open(r3, r1, r4, r5)     // Catch: android.content.ActivityNotFoundException -> L87
            goto L75
        L70:
            java.lang.String r1 = "CTA destination URL is not configured properly"
            android.util.Log.e(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L87
        L75:
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r1 = r7.bus     // Catch: android.content.ActivityNotFoundException -> L87
            if (r1 == 0) goto L93
            java.lang.String r2 = "open"
            java.lang.String r3 = "adClick"
            com.vungle.warren.model.Placement r4 = r7.placement     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r4 = r4.getId()     // Catch: android.content.ActivityNotFoundException -> L87
            r1.onNext(r2, r3, r4)     // Catch: android.content.ActivityNotFoundException -> L87
            goto L93
        L87:
            java.lang.String r1 = "Unable to find destination activity"
            android.util.Log.e(r0, r1)
            java.lang.String r0 = "LocalAdPresenter#download"
            java.lang.String r1 = "Download - Activity Not Found"
            com.vungle.warren.VungleLogger.error(r0, r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.LocalAdPresenter.download():void");
    }

    private void handleWebViewException(@VungleException.ExceptionCode int i10) {
        LocalAdContract.LocalView localView = this.adView;
        if (localView != null) {
            localView.removeWebView();
        }
        reportErrorAndCloseAd(i10);
    }

    private boolean isWebPageBlank() {
        String websiteUrl = this.adView.getWebsiteUrl();
        if (!TextUtils.isEmpty(websiteUrl) && !d.f6477a.equalsIgnoreCase(websiteUrl)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void loadData(OptionsState optionsState) {
        Report report;
        this.cookies.put(Cookie.INCENTIVIZED_TEXT_COOKIE, this.repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get());
        this.cookies.put(Cookie.CONSENT_COOKIE, this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get());
        this.cookies.put(Cookie.CONFIG_COOKIE, this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(@VungleException.ExceptionCode int i10) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(new VungleException(i10), this.placement.getId());
        }
    }

    private boolean needShowGDPR(Cookie cookie) {
        if (cookie != null && cookie.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie.getString("consent_status"))) {
            return true;
        }
        return false;
    }

    private void playPost() {
        File file = new File(this.assetDir.getPath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        final File file2 = new File(l.p(sb2, File.separator, "index.html"));
        this.fileExistenceOperation = AsyncFileUtils.isFileExistAsync(file2, new AsyncFileUtils.FileExistCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.2
            @Override // com.vungle.warren.utility.AsyncFileUtils.FileExistCallback
            public void status(boolean z10) {
                if (z10) {
                    LocalAdPresenter.this.adView.showWebsite(Advertisement.FILE_SCHEME + file2.getPath());
                    LocalAdPresenter.this.analytics.ping(LocalAdPresenter.this.advertisement.getTpatUrls(AnalyticsEvent.Ad.postrollView));
                    LocalAdPresenter.this.inPost = true;
                    return;
                }
                LocalAdPresenter.this.makeBusError(27);
                LocalAdPresenter.this.makeBusError(10);
                VungleLogger.error("LocalAdPresenter#playPost", "Error Rendering Postroll");
                LocalAdPresenter.this.closeAndReport();
            }
        });
    }

    private void prepare(OptionsState optionsState) {
        String string;
        restoreFromSave(optionsState);
        Cookie cookie = this.cookies.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie == null) {
            string = null;
        } else {
            string = cookie.getString("userID");
        }
        if (this.report == null) {
            Report report = new Report(this.advertisement, this.placement, System.currentTimeMillis(), string);
            this.report = report;
            report.setTtDownload(this.advertisement.getTtDownload());
            this.repository.save(this.report, this.repoCallback);
        }
        if (this.durationRecorder == null) {
            this.durationRecorder = new DurationRecorder(this.report, this.repository, this.repoCallback);
        }
        this.webViewAPI.setErrorHandler(this);
        this.adView.showCTAOverlay(this.advertisement.isCtaOverlayEnabled(), this.advertisement.getCtaClickArea());
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("start", null, this.placement.getId());
        }
    }

    private void reportError(String str) {
        this.report.recordError(str);
        this.repository.save(this.report, this.repoCallback);
        makeBusError(27);
        if (!this.inPost && this.advertisement.hasPostroll()) {
            playPost();
        } else {
            makeBusError(10);
            this.adView.close();
        }
    }

    private void reportErrorAndCloseAd(@VungleException.ExceptionCode int i10) {
        makeBusError(i10);
        VungleLogger.error(TAG, "WebViewException: " + new VungleException(i10).getLocalizedMessage());
        closeAndReport();
    }

    private void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.adView.pauseVideo();
        this.adView.showDialog(str, str2, str3, str4, onClickListener);
    }

    private void showGDPR(final Cookie cookie) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                if (i10 == -2) {
                    str = "opted_out";
                } else if (i10 == -1) {
                    str = "opted_in";
                } else {
                    str = Gdpr.OPTED_OUT_BY_TIMEOUT;
                }
                cookie.putValue("consent_status", str);
                cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                cookie.putValue("consent_source", "vungle_modal");
                LocalAdPresenter.this.repository.save(cookie, null);
                LocalAdPresenter.this.start();
            }
        };
        cookie.putValue("consent_status", Gdpr.OPTED_OUT_BY_TIMEOUT);
        cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        cookie.putValue("consent_source", "vungle_modal");
        this.repository.save(cookie, this.repoCallback);
        showDialog(cookie.getString("consent_title"), cookie.getString("consent_message"), cookie.getString("button_accept"), cookie.getString("button_deny"), onClickListener);
    }

    private void showIncetivizedDialog() {
        String str = this.dialogTitle;
        String str2 = this.dialogBody;
        String str3 = this.dialogContinue;
        String str4 = this.dialogClose;
        Cookie cookie = this.cookies.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie != null) {
            str = cookie.getString("title");
            if (TextUtils.isEmpty(str)) {
                str = this.dialogTitle;
            }
            str2 = cookie.getString("body");
            if (TextUtils.isEmpty(str2)) {
                str2 = this.dialogBody;
            }
            str3 = cookie.getString("continue");
            if (TextUtils.isEmpty(str3)) {
                str3 = this.dialogContinue;
            }
            str4 = cookie.getString("close");
            if (TextUtils.isEmpty(str4)) {
                str4 = this.dialogClose;
            }
        }
        showDialog(str, str2, str3, str4, new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (i10 == -2) {
                    LocalAdPresenter.this.reportAction(AnalyticsEvent.Ad.videoClose, null);
                    LocalAdPresenter.this.continueWithPostroll();
                }
            }
        });
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(@AdContract.AdStopReason int i10) {
        AsyncFileUtils.ExistenceOperation existenceOperation = this.fileExistenceOperation;
        if (existenceOperation != null) {
            existenceOperation.cancel();
        }
        stop(i10);
        this.adView.destroyAdView(0L);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        String id2;
        int i10;
        if (optionsState == null) {
            return;
        }
        this.repository.save(this.report, this.repoCallback);
        Report report = this.report;
        if (report == null) {
            id2 = null;
        } else {
            id2 = report.getId();
        }
        optionsState.put(EXTRA_REPORT, id2);
        optionsState.put(EXTRA_INCENTIVIZED_SENT, this.sendReportIncentivized.get());
        optionsState.put(EXTRA_IN_POST, this.inPost);
        optionsState.put(EXTRA_IS_MUTED, this.muted);
        LocalAdContract.LocalView localView = this.adView;
        if (localView != null && localView.isVideoPlaying()) {
            i10 = this.adView.getVideoPosition();
        } else {
            i10 = this.videoPosition;
        }
        optionsState.put(EXTRA_VIDEO_POSITION, i10);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        if (this.inPost) {
            closeAndReport();
            return true;
        }
        if (!this.userExitEnabled) {
            return false;
        }
        if (this.placement.isIncentivized() && this.progress <= 75) {
            showIncetivizedDialog();
            return false;
        }
        reportAction(AnalyticsEvent.Ad.videoClose, null);
        if (this.advertisement.hasPostroll()) {
            playPost();
            return false;
        }
        closeAndReport();
        return true;
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onDownload() {
        download();
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public boolean onMediaError(String str) {
        reportError(str);
        VungleLogger.error("LocalAdPresenter#onMediaError", "Media Error: " + str);
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
                closeAndReport();
                return;
            case 2:
                download();
                closeAndReport();
                return;
            default:
                VungleLogger.error("LocalAdPresenter#onMraidAction", "Unknown MRAID Command");
                throw new IllegalArgumentException("Unknown action ".concat(str));
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onMute(boolean z10) {
        this.muted = z10;
        if (z10) {
            reportAction("mute", ep.Code);
        } else {
            reportAction("unmute", ep.V);
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onPrivacy() {
        this.adView.open(null, HTTPS_VUNGLE_COM_PRIVACY, new PresenterAppLeftCallback(this.bus, this.placement), null);
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onProgressUpdate(int i10, float f) {
        this.progress = (int) ((i10 / f) * 100.0f);
        this.videoPosition = i10;
        this.durationRecorder.update();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("percentViewed:" + this.progress, null, this.placement.getId());
        }
        AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
        if (eventListener2 != null && i10 > 0 && !this.adViewed) {
            this.adViewed = true;
            eventListener2.onNext("adViewed", null, this.placement.getId());
            String[] strArr = this.impressionUrls;
            if (strArr != null) {
                this.analytics.ping(strArr);
            }
        }
        reportAction("video_viewed", String.format(Locale.ENGLISH, "%d", Integer.valueOf(i10)));
        if (this.progress == 100) {
            if (this.checkpointList.peekLast() != null && this.checkpointList.peekLast().getPercentage() == 100) {
                this.analytics.ping(this.checkpointList.pollLast().getUrls());
            }
            continueWithPostroll();
        }
        this.report.recordProgress(this.videoPosition);
        this.repository.save(this.report, this.repoCallback);
        while (this.checkpointList.peek() != null && this.progress > this.checkpointList.peek().getPercentage()) {
            this.analytics.ping(this.checkpointList.poll().getUrls());
        }
        Cookie cookie = this.cookies.get(Cookie.CONFIG_COOKIE);
        if (this.placement.isIncentivized() && this.progress > 75 && cookie != null && cookie.getBoolean("isReportIncentivizedEnabled").booleanValue() && !this.sendReportIncentivized.getAndSet(true)) {
            q qVar = new q();
            qVar.n(new s(this.placement.getId()), "placement_reference_id");
            qVar.n(new s(this.advertisement.getAppID()), "app_id");
            qVar.n(new s(Long.valueOf(this.report.getAdStartTime())), ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME);
            qVar.n(new s(this.report.getUserID()), "user");
            this.analytics.ri(qVar);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String str, boolean z10) {
        Report report = this.report;
        if (report != null) {
            report.recordError(str);
            this.repository.save(this.report, this.repoCallback);
            VungleLogger.error("LocalAdPresenteronReceivedError", str);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException(32);
        VungleLogger.error("LocalAdPresenter#onRenderProcessUnresponsive", new VungleException(32).getLocalizedMessage());
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onVideoStart(int i10, float f) {
        reportAction("videoLength", String.format(Locale.ENGLISH, "%d", Integer.valueOf((int) f)));
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.webViewAPI.notifyPropertiesChange(true);
        this.adView.refreshDialogIfVisible();
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, boolean z10) {
        handleWebViewException(31);
        VungleLogger.error("LocalAdPresenter#onWebRenderingProcessGone", new VungleException(31).getLocalizedMessage());
        return true;
    }

    public void reportAction(String str, String str2) {
        if (str.equals("videoLength")) {
            int parseInt = Integer.parseInt(str2);
            this.duration = parseInt;
            this.report.setVideoLength(parseInt);
            this.repository.save(this.report, this.repoCallback);
            return;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -840405966:
                if (str.equals("unmute")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1370606900:
                if (str.equals(AnalyticsEvent.Ad.videoClose)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                this.analytics.ping(this.advertisement.getTpatUrls(str));
                break;
        }
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void restoreFromSave(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        if (optionsState.getBoolean(EXTRA_INCENTIVIZED_SENT, false)) {
            this.sendReportIncentivized.set(true);
        }
        this.inPost = optionsState.getBoolean(EXTRA_IN_POST, this.inPost);
        this.muted = optionsState.getBoolean(EXTRA_IS_MUTED, this.muted);
        this.videoPosition = optionsState.getInt(EXTRA_VIDEO_POSITION, this.videoPosition).intValue();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        this.durationRecorder.start();
        if (!this.adView.hasWebView()) {
            reportErrorAndCloseAd(31);
            VungleLogger.error("LocalAdPresenter#start", new VungleException(31).getLocalizedMessage());
            return;
        }
        this.adView.setImmersiveMode();
        this.adView.resumeWeb();
        Cookie cookie = this.cookies.get(Cookie.CONSENT_COOKIE);
        if (needShowGDPR(cookie)) {
            showGDPR(cookie);
            return;
        }
        if (this.inPost) {
            if (isWebPageBlank()) {
                playPost();
            }
        } else if (!this.adView.isVideoPlaying() && !this.adView.isDialogVisible()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.assetDir.getPath());
            this.adView.playVideo(new File(l.p(sb2, File.separator, "video")), this.muted, this.videoPosition);
            int showCloseDelay = this.advertisement.getShowCloseDelay(this.placement.isIncentivized());
            if (showCloseDelay > 0) {
                this.scheduler.schedule(new Runnable() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.5
                    @Override // java.lang.Runnable
                    public void run() {
                        LocalAdPresenter.this.userExitEnabled = true;
                        if (!LocalAdPresenter.this.inPost) {
                            LocalAdPresenter.this.adView.showCloseButton();
                        }
                    }
                }, showCloseDelay);
            } else {
                this.userExitEnabled = true;
                this.adView.showCloseButton();
            }
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(@AdContract.AdStopReason int i10) {
        boolean z10;
        this.durationRecorder.stop();
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        this.adView.pauseWeb();
        if (this.adView.isVideoPlaying()) {
            this.videoPosition = this.adView.getVideoPosition();
            this.adView.pauseVideo();
        }
        if (!z10 && z11) {
            if (!this.isDestroying.getAndSet(true)) {
                String str = null;
                reportAction("close", null);
                this.scheduler.cancelAll();
                AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
                if (eventListener != null) {
                    if (this.report.isCTAClicked()) {
                        str = "isCTAClicked";
                    }
                    eventListener.onNext("end", str, this.placement.getId());
                    return;
                }
                return;
            }
            return;
        }
        if (this.inPost || z11) {
            this.adView.showWebsite(d.f6477a);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void attach(LocalAdContract.LocalView localView, OptionsState optionsState) {
        this.isDestroying.set(false);
        this.adView = localView;
        localView.setPresenter(this);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(Constants.ATTACH, this.advertisement.getCreativeId(), this.placement.getId());
        }
        int settings = this.advertisement.getAdConfig().getSettings();
        if (settings > 0) {
            this.muted = (settings & 1) == 1;
            this.userExitEnabled = (settings & 2) == 2;
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
        localView.setOrientation(i10);
        prepare(optionsState);
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, true).addData(SessionAttribute.EVENT_ID, this.advertisement.getId()).build());
    }
}
