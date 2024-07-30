package com.vungle.warren;

import android.util.Log;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.constant.w;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.tasks.SendReportsJob;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.utility.Constants;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdEventListener implements AdContract.AdvertisementPresenter.EventListener {
    private static final String TAG = "com.vungle.warren.AdEventListener";
    private final AdLoader adLoader;
    private boolean adRewarded;
    private Advertisement advertisement;
    private final JobRunner jobRunner;
    private int percentViewed = -1;
    private Placement placement;
    private final PlayAdCallback playAdCallback;
    private final Map<String, Boolean> playOperations;
    private final Repository repository;
    private final AdRequest request;
    private boolean successfulView;
    private final VisionController visionController;

    public AdEventListener(AdRequest adRequest, Map<String, Boolean> map, PlayAdCallback playAdCallback, Repository repository, AdLoader adLoader, JobRunner jobRunner, VisionController visionController, Placement placement, Advertisement advertisement) {
        this.request = adRequest;
        this.playOperations = map;
        this.playAdCallback = playAdCallback;
        this.repository = repository;
        this.adLoader = adLoader;
        this.jobRunner = jobRunner;
        this.visionController = visionController;
        this.placement = placement;
        this.advertisement = advertisement;
        map.put(adRequest.getPlacementId(), Boolean.TRUE);
    }

    private void loadAdvertisement() {
        if (this.advertisement == null) {
            this.advertisement = this.repository.findValidAdvertisementForPlacement(this.request.getPlacementId(), this.request.getEventId()).get();
        }
    }

    private void loadPlacement() {
        if (this.placement == null) {
            this.placement = (Placement) this.repository.load(this.request.getPlacementId(), Placement.class).get();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter.EventListener
    public void onError(VungleException vungleException, String str) {
        loadAdvertisement();
        if (this.advertisement != null && vungleException.getExceptionCode() == 27) {
            this.adLoader.dropCache(this.advertisement.getId());
            return;
        }
        if (this.advertisement != null && vungleException.getExceptionCode() != 15 && vungleException.getExceptionCode() != 25 && vungleException.getExceptionCode() != 36) {
            try {
                this.repository.saveAndApplyState(this.advertisement, str, 4);
                loadPlacement();
                Placement placement = this.placement;
                if (placement != null) {
                    this.adLoader.loadEndlessIfNeeded(placement, placement.getAdSize(), 0L, false);
                }
            } catch (DatabaseHelper.DBException unused) {
                vungleException = new VungleException(26);
            }
        }
        onFinished();
        PlayAdCallback playAdCallback = this.playAdCallback;
        if (playAdCallback != null) {
            playAdCallback.onError(str, vungleException);
            VungleLogger.error("AdEventListener#PlayAdCallback", vungleException.getLocalizedMessage() + " :" + str);
        }
    }

    public void onFinished() {
        this.playOperations.remove(this.request.getPlacementId());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter.EventListener
    public void onNext(String str, String str2, String str3) {
        PlayAdCallback playAdCallback;
        PlayAdCallback playAdCallback2;
        boolean z10;
        loadAdvertisement();
        if (this.advertisement == null) {
            Log.e(TAG, "No Advertisement for ID");
            onFinished();
            PlayAdCallback playAdCallback3 = this.playAdCallback;
            if (playAdCallback3 != null) {
                playAdCallback3.onError(this.request.getPlacementId(), new VungleException(10));
                VungleLogger.error("AdEventListener#PlayAdCallback", str3 + ": AD_UNABLE_TO_PLAY");
                return;
            }
            return;
        }
        loadPlacement();
        if (this.placement == null) {
            Log.e(TAG, "No Placement for ID");
            onFinished();
            PlayAdCallback playAdCallback4 = this.playAdCallback;
            if (playAdCallback4 != null) {
                playAdCallback4.onError(this.request.getPlacementId(), new VungleException(13));
                VungleLogger.error("AdEventListener#PlayAdCallback", "PLACEMENT_NOT_FOUND: " + str3);
                return;
            }
            return;
        }
        try {
            boolean z11 = false;
            if (str.equals("start")) {
                this.repository.saveAndApplyState(this.advertisement, str3, 2);
                PlayAdCallback playAdCallback5 = this.playAdCallback;
                if (playAdCallback5 != null) {
                    playAdCallback5.onAdStart(str3);
                    VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdStart: " + str3);
                }
                this.percentViewed = 0;
                Placement placement = (Placement) this.repository.load(this.request.getPlacementId(), Placement.class).get();
                this.placement = placement;
                if (placement != null) {
                    this.adLoader.loadEndlessIfNeeded(placement, placement.getAdSize(), 0L, this.request.getIsExplicit());
                }
                if (this.visionController.isEnabled()) {
                    this.visionController.reportData(this.advertisement.getCreativeId(), this.advertisement.getCampaignId(), this.advertisement.getAdvertiserAppId());
                    return;
                }
                return;
            }
            if (str.equals("end")) {
                Log.d(BuildConfig.OMSDK_PARTNER_NAME, "Cleaning up metadata and assets for placement " + str3 + " and advertisement " + this.advertisement.getId());
                this.repository.saveAndApplyState(this.advertisement, str3, 3);
                this.repository.updateAndSaveReportState(str3, this.advertisement.getAppID(), 0, 1);
                this.jobRunner.execute(SendReportsJob.makeJobInfo(false));
                onFinished();
                PlayAdCallback playAdCallback6 = this.playAdCallback;
                if (playAdCallback6 != null) {
                    if (!this.successfulView && this.percentViewed < 80) {
                        z10 = false;
                        if (str2 != null && str2.equals("isCTAClicked")) {
                            z11 = true;
                        }
                        playAdCallback6.onAdEnd(str3, z10, z11);
                        this.playAdCallback.onAdEnd(str3);
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.DID_CLOSE).addData(SessionAttribute.EVENT_ID, this.advertisement.getId()).build());
                        VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdEnd: " + str3);
                        return;
                    }
                    z10 = true;
                    if (str2 != null) {
                        z11 = true;
                    }
                    playAdCallback6.onAdEnd(str3, z10, z11);
                    this.playAdCallback.onAdEnd(str3);
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.DID_CLOSE).addData(SessionAttribute.EVENT_ID, this.advertisement.getId()).build());
                    VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdEnd: " + str3);
                    return;
                }
                return;
            }
            if (str.equals("successfulView") && this.placement.isIncentivized()) {
                this.successfulView = true;
                if (!this.adRewarded) {
                    this.adRewarded = true;
                    PlayAdCallback playAdCallback7 = this.playAdCallback;
                    if (playAdCallback7 != null) {
                        playAdCallback7.onAdRewarded(str3);
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.REWARDED).addData(SessionAttribute.EVENT_ID, this.advertisement.getId()).build());
                        VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdRewarded: " + str3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.startsWith("percentViewed") && this.placement.isIncentivized()) {
                String[] split = str.split(w.bE);
                if (split.length == 2) {
                    this.percentViewed = Integer.parseInt(split[1]);
                }
                if (!this.adRewarded && this.percentViewed >= 80) {
                    this.adRewarded = true;
                    PlayAdCallback playAdCallback8 = this.playAdCallback;
                    if (playAdCallback8 != null) {
                        playAdCallback8.onAdRewarded(str3);
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.REWARDED).addData(SessionAttribute.EVENT_ID, this.advertisement.getId()).build());
                        VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdRewarded: " + str3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (av.ai.equals(str) && this.playAdCallback != null) {
                if ("adClick".equals(str2)) {
                    this.playAdCallback.onAdClick(str3);
                    VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdClick: " + str3);
                    return;
                }
                if ("adLeftApplication".equals(str2)) {
                    this.playAdCallback.onAdLeftApplication(str3);
                    VungleLogger.debug("AdEventListener#PlayAdCallback", "onAdLeftApplication: " + str3);
                    return;
                }
                return;
            }
            if ("adViewed".equals(str) && (playAdCallback2 = this.playAdCallback) != null) {
                playAdCallback2.onAdViewed(str3);
            } else if (Constants.ATTACH.equals(str) && (playAdCallback = this.playAdCallback) != null) {
                playAdCallback.creativeId(str2);
            }
        } catch (DatabaseHelper.DBException unused) {
            onError(new VungleException(26), str3);
        }
    }
}
