package com.vungle.warren.ui.presenter;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.exoplayer.f;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.NativeAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.utility.Constants;
import com.vungle.warren.utility.Scheduler;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class NativeAdPresenter implements NativeAdContract.NativePresenter {
    private static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    private static final String EXTRA_REPORT = "saved_report";
    private static final String NO_VALUE = "";
    private static final String OPEN_ACTION = "mraidOpen";
    private static final String OPEN_DEEPLINK_SUCCESS = "deeplinkSuccess";
    private static final String TAG = "NativeAdPresenter";
    private NativeAdContract.NativeView adView;
    private boolean adViewed;
    private final Advertisement advertisement;
    private final AdAnalytics analytics;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private final LinkedList<Advertisement.Checkpoint> checkpointList;
    private DurationRecorder durationRecorder;
    private final String[] impressionUrls;
    private final Placement placement;
    private final Repository.SaveCallback repoCallback;
    private Report report;
    private final Repository repository;
    private final Scheduler scheduler;
    private final Map<String, Cookie> cookies = new HashMap();
    private final AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private final AtomicBoolean isDestroying = new AtomicBoolean(false);

    public NativeAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, OptionsState optionsState, String[] strArr) {
        LinkedList<Advertisement.Checkpoint> linkedList = new LinkedList<>();
        this.checkpointList = linkedList;
        this.repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.NativeAdPresenter.1
            boolean errorHappened = false;

            @Override // com.vungle.warren.persistence.Repository.SaveCallback
            public void onError(Exception exc) {
                if (this.errorHappened) {
                    return;
                }
                this.errorHappened = true;
                NativeAdPresenter.this.makeBusError(26);
                VungleLogger.error("LocalAdPresenter#onError", new VungleException(26).getLocalizedMessage());
                NativeAdPresenter.this.closeView();
            }

            @Override // com.vungle.warren.persistence.Repository.SaveCallback
            public void onSaved() {
            }
        };
        this.advertisement = advertisement;
        this.placement = placement;
        this.repository = repository;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.impressionUrls = strArr;
        if (advertisement.getCheckpoints() != null) {
            linkedList.addAll(advertisement.getCheckpoints());
        }
        loadData(optionsState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeView() {
        this.adView.close();
        this.scheduler.cancelAll();
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
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("start", null, this.placement.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAction(String str, String str2) {
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    private void reportVideoLength(long j10) {
        this.report.setVideoLength(j10);
        this.repository.save(this.report, this.repoCallback);
    }

    private void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.adView.showDialog(str, str2, str3, str4, onClickListener);
    }

    private void showGDPR(final Cookie cookie) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.NativeAdPresenter.3
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
                NativeAdPresenter.this.repository.save(cookie, null);
                NativeAdPresenter.this.start();
            }
        };
        cookie.putValue("consent_status", Gdpr.OPTED_OUT_BY_TIMEOUT);
        cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        cookie.putValue("consent_source", "vungle_modal");
        this.repository.save(cookie, this.repoCallback);
        showDialog(cookie.getString("consent_title"), cookie.getString("consent_message"), cookie.getString("button_accept"), cookie.getString("button_deny"), onClickListener);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(@AdContract.AdStopReason int i10) {
        Log.d(TAG, "detach() " + this.placement + " " + hashCode());
        stop(i10);
        this.adView.destroyAdView(0L);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        String id2;
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
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        closeView();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[Catch: ActivityNotFoundException -> 0x0075, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x0075, blocks: (B:3:0x0007, B:5:0x0039, B:7:0x0048, B:8:0x0063, B:10:0x0067, B:16:0x0041, B:19:0x005c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDownload() {
        /*
            r6 = this;
            java.lang.String r0 = "mraidOpen"
            java.lang.String r1 = ""
            r6.reportAction(r0, r1)
            com.vungle.warren.analytics.AdAnalytics r0 = r6.analytics     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.model.Advertisement r1 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r2 = "clickUrl"
            java.lang.String[] r1 = r1.getTpatUrls(r2)     // Catch: android.content.ActivityNotFoundException -> L75
            r0.ping(r1)     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.analytics.AdAnalytics r0 = r6.analytics     // Catch: android.content.ActivityNotFoundException -> L75
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.model.Advertisement r3 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r1 = r3.getCTAURL(r1)     // Catch: android.content.ActivityNotFoundException -> L75
            r3 = 0
            r2[r3] = r1     // Catch: android.content.ActivityNotFoundException -> L75
            r0.ping(r2)     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r0 = "download"
            r1 = 0
            r6.reportAction(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.model.Advertisement r0 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r0 = r0.getCTAURL(r3)     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.model.Advertisement r1 = r6.advertisement     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r1 = r1.getDeeplinkUrl()     // Catch: android.content.ActivityNotFoundException -> L75
            if (r1 == 0) goto L3f
            boolean r2 = r1.isEmpty()     // Catch: android.content.ActivityNotFoundException -> L75
            if (r2 == 0) goto L48
        L3f:
            if (r0 == 0) goto L5c
            boolean r2 = r0.isEmpty()     // Catch: android.content.ActivityNotFoundException -> L75
            if (r2 == 0) goto L48
            goto L5c
        L48:
            com.vungle.warren.ui.contract.NativeAdContract$NativeView r2 = r6.adView     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.ui.PresenterAppLeftCallback r3 = new com.vungle.warren.ui.PresenterAppLeftCallback     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r4 = r6.bus     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.model.Placement r5 = r6.placement     // Catch: android.content.ActivityNotFoundException -> L75
            r3.<init>(r4, r5)     // Catch: android.content.ActivityNotFoundException -> L75
            com.vungle.warren.ui.presenter.NativeAdPresenter$2 r4 = new com.vungle.warren.ui.presenter.NativeAdPresenter$2     // Catch: android.content.ActivityNotFoundException -> L75
            r4.<init>()     // Catch: android.content.ActivityNotFoundException -> L75
            r2.open(r1, r0, r3, r4)     // Catch: android.content.ActivityNotFoundException -> L75
            goto L63
        L5c:
            java.lang.String r0 = com.vungle.warren.ui.presenter.NativeAdPresenter.TAG     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r1 = "CTA destination URL is not configured properly"
            android.util.Log.e(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L75
        L63:
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r0 = r6.bus     // Catch: android.content.ActivityNotFoundException -> L75
            if (r0 == 0) goto L83
            java.lang.String r1 = "open"
            java.lang.String r2 = "adClick"
            com.vungle.warren.model.Placement r3 = r6.placement     // Catch: android.content.ActivityNotFoundException -> L75
            java.lang.String r3 = r3.getId()     // Catch: android.content.ActivityNotFoundException -> L75
            r0.onNext(r1, r2, r3)     // Catch: android.content.ActivityNotFoundException -> L75
            goto L83
        L75:
            java.lang.String r0 = com.vungle.warren.ui.presenter.NativeAdPresenter.TAG
            java.lang.String r1 = "Unable to find destination activity"
            android.util.Log.e(r0, r1)
            java.lang.String r0 = "LocalAdPresenter#download"
            java.lang.String r1 = "Download - Activity Not Found"
            com.vungle.warren.VungleLogger.error(r0, r1)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.NativeAdPresenter.onDownload():void");
    }

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void onPrivacy() {
        this.adView.open(null, this.advertisement.getPrivacyUrl(), new PresenterAppLeftCallback(this.bus, this.placement), null);
    }

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void onProgressUpdate(int i10, float f) {
        Log.d(TAG, "onProgressUpdate() " + this.placement + " " + hashCode());
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null && i10 > 0 && !this.adViewed) {
            this.adViewed = true;
            eventListener.onNext("adViewed", null, this.placement.getId());
            String[] strArr = this.impressionUrls;
            if (strArr != null) {
                this.analytics.ping(strArr);
            }
        }
        AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
        if (eventListener2 != null) {
            eventListener2.onNext("percentViewed:100", null, this.placement.getId());
        }
        reportVideoLength(f.f7962a);
        Locale locale = Locale.ENGLISH;
        reportAction("videoLength", String.format(locale, "%d", 5000));
        reportAction(ReportDBAdapter.ReportColumns.COLUMN_VIDEO_VIEWED, String.format(locale, "%d", 100));
        Advertisement.Checkpoint pollFirst = this.checkpointList.pollFirst();
        if (pollFirst != null) {
            this.analytics.ping(pollFirst.getUrls());
        }
        this.durationRecorder.update();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.adView.refreshDialogIfVisible();
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

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void setAdVisibility(boolean z10) {
        Log.d(TAG, "isViewable=" + z10 + " " + this.placement + " " + hashCode());
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
        Log.d(TAG, "start() " + this.placement + " " + hashCode());
        this.durationRecorder.start();
        Cookie cookie = this.cookies.get(Cookie.CONSENT_COOKIE);
        if (needShowGDPR(cookie)) {
            showGDPR(cookie);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(@AdContract.AdStopReason int i10) {
        boolean z10;
        boolean z11;
        Log.d(TAG, "stop() " + this.placement + " " + hashCode());
        this.durationRecorder.stop();
        boolean z12 = false;
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
        }
        if (!z10 && z11 && !this.isDestroying.getAndSet(true)) {
            String str = null;
            if (z12) {
                reportAction("mraidCloseByApi", null);
            }
            this.repository.save(this.report, this.repoCallback);
            closeView();
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
    public void attach(NativeAdContract.NativeView nativeView, OptionsState optionsState) {
        String str = TAG;
        Log.d(str, "attach() " + this.placement + " " + hashCode());
        this.isDestroying.set(false);
        this.adView = nativeView;
        nativeView.setPresenter(this);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(Constants.ATTACH, this.advertisement.getCreativeId(), this.placement.getId());
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
        Log.d(str, "Requested Orientation " + i10);
        nativeView.setOrientation(i10);
        prepare(optionsState);
    }

    @Override // com.vungle.warren.ui.JavascriptBridge.MraidHandler
    public void onMraidAction(String str) {
    }
}
