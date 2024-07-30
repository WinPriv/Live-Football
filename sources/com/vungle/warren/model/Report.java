package com.vungle.warren.model;

import android.text.TextUtils;
import com.vungle.warren.AdConfig;
import com.vungle.warren.SessionTracker;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.utility.HashUtility;
import e0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m8.l;
import m8.q;
import n8.b;

/* loaded from: classes2.dex */
public class Report {
    private static final String DOWNLOAD_ACTION = "download";
    public static final int FAILED = 3;
    public static final int NEW = 0;
    public static final int READY = 1;
    public static final int SENDING = 2;
    long adDuration;
    String adSize;
    long adStartTime;
    String adToken;
    String adType;
    String advertisementID;
    String appId;
    public long assetDownloadDuration;
    String campaign;
    final List<String> clickedThrough;
    final List<String> errors;
    boolean headerBidding;
    boolean incentivized;
    public long initTimeStamp;
    int ordinal;
    String placementId;
    boolean playRemoteUrl;
    int status;
    String templateId;
    long ttDownload;
    String url;
    final List<UserAction> userActions;
    String userID;
    long videoLength;
    int videoViewed;
    volatile boolean wasCTAClicked;

    /* loaded from: classes2.dex */
    public @interface Status {
    }

    /* loaded from: classes2.dex */
    public static class UserAction {

        @b("action")
        private String action;

        @b("timestamp")
        private long timestamp;

        @b("value")
        private String value;

        public UserAction(String str, String str2, long j10) {
            this.action = str;
            this.value = str2;
            this.timestamp = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UserAction userAction = (UserAction) obj;
            if (userAction.action.equals(this.action) && userAction.value.equals(this.value) && userAction.timestamp == this.timestamp) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int b10 = i.b(this.value, this.action.hashCode() * 31, 31);
            long j10 = this.timestamp;
            return b10 + ((int) (j10 ^ (j10 >>> 32)));
        }

        public q toJson() {
            q qVar = new q();
            qVar.q("action", this.action);
            String str = this.value;
            if (str != null && !str.isEmpty()) {
                qVar.q("value", this.value);
            }
            qVar.p("timestamp_millis", Long.valueOf(this.timestamp));
            return qVar;
        }
    }

    public Report() {
        this.status = 0;
        this.userActions = new ArrayList();
        this.clickedThrough = new ArrayList();
        this.errors = new ArrayList();
    }

    public synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                Report report = (Report) obj;
                if (!report.placementId.equals(this.placementId)) {
                    return false;
                }
                if (!report.adToken.equals(this.adToken)) {
                    return false;
                }
                if (!report.appId.equals(this.appId)) {
                    return false;
                }
                if (report.incentivized != this.incentivized) {
                    return false;
                }
                if (report.headerBidding != this.headerBidding) {
                    return false;
                }
                if (report.adStartTime != this.adStartTime) {
                    return false;
                }
                if (!report.url.equals(this.url)) {
                    return false;
                }
                if (report.videoLength != this.videoLength) {
                    return false;
                }
                if (report.adDuration != this.adDuration) {
                    return false;
                }
                if (report.ttDownload != this.ttDownload) {
                    return false;
                }
                if (!report.campaign.equals(this.campaign)) {
                    return false;
                }
                if (!report.adType.equals(this.adType)) {
                    return false;
                }
                if (!report.templateId.equals(this.templateId)) {
                    return false;
                }
                if (report.wasCTAClicked != this.wasCTAClicked) {
                    return false;
                }
                if (!report.userID.equals(this.userID)) {
                    return false;
                }
                if (report.initTimeStamp != this.initTimeStamp) {
                    return false;
                }
                if (report.assetDownloadDuration != this.assetDownloadDuration) {
                    return false;
                }
                if (report.clickedThrough.size() != this.clickedThrough.size()) {
                    return false;
                }
                for (int i10 = 0; i10 < this.clickedThrough.size(); i10++) {
                    if (!report.clickedThrough.get(i10).equals(this.clickedThrough.get(i10))) {
                        return false;
                    }
                }
                if (report.errors.size() != this.errors.size()) {
                    return false;
                }
                for (int i11 = 0; i11 < this.errors.size(); i11++) {
                    if (!report.errors.get(i11).equals(this.errors.get(i11))) {
                        return false;
                    }
                }
                if (report.userActions.size() != this.userActions.size()) {
                    return false;
                }
                for (int i12 = 0; i12 < this.userActions.size(); i12++) {
                    if (!report.userActions.get(i12).equals(this.userActions.get(i12))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public long getAdDuration() {
        return this.adDuration;
    }

    public long getAdStartTime() {
        return this.adStartTime;
    }

    public String getAdvertisementID() {
        return this.advertisementID;
    }

    public String getId() {
        return this.placementId + "_" + this.adStartTime;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    @Status
    public int getStatus() {
        return this.status;
    }

    public String getUserID() {
        return this.userID;
    }

    public synchronized int hashCode() {
        int i10;
        int i11;
        long j10;
        int hashCode = ((((HashUtility.getHashCode(this.placementId) * 31) + HashUtility.getHashCode(this.adToken)) * 31) + HashUtility.getHashCode(this.appId)) * 31;
        int i12 = 1;
        if (this.incentivized) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        if (!this.headerBidding) {
            i12 = 0;
        }
        long j11 = this.adStartTime;
        int hashCode2 = (((((i13 + i12) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + HashUtility.getHashCode(this.url)) * 31;
        long j12 = this.videoLength;
        int i14 = (hashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.adDuration;
        int i15 = (i14 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.ttDownload;
        int i16 = (i15 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.initTimeStamp;
        i11 = (i16 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        j10 = this.assetDownloadDuration;
        return ((((((((((((((((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + HashUtility.getHashCode(this.campaign)) * 31) + HashUtility.getHashCode(this.userActions)) * 31) + HashUtility.getHashCode(this.clickedThrough)) * 31) + HashUtility.getHashCode(this.errors)) * 31) + HashUtility.getHashCode(this.adType)) * 31) + HashUtility.getHashCode(this.templateId)) * 31) + HashUtility.getHashCode(this.userID)) * 31) + (this.wasCTAClicked ? 1 : 0);
    }

    public boolean isCTAClicked() {
        return this.wasCTAClicked;
    }

    public synchronized void recordAction(String str, String str2, long j10) {
        this.userActions.add(new UserAction(str, str2, j10));
        this.clickedThrough.add(str);
        if (str.equals("download")) {
            this.wasCTAClicked = true;
        }
    }

    public synchronized void recordError(String str) {
        this.errors.add(str);
    }

    public void recordProgress(int i10) {
        this.videoViewed = i10;
    }

    public void setAdDuration(long j10) {
        this.adDuration = j10;
    }

    public void setAllAssetDownloaded(boolean z10) {
        this.playRemoteUrl = !z10;
    }

    public void setStatus(@Status int i10) {
        this.status = i10;
    }

    public void setTtDownload(long j10) {
        this.ttDownload = j10;
    }

    public void setVideoLength(long j10) {
        this.videoLength = j10;
    }

    public synchronized q toReportBody() {
        q qVar;
        int i10;
        qVar = new q();
        qVar.q("placement_reference_id", this.placementId);
        qVar.q(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_AD_TOKEN, this.adToken);
        qVar.q("app_id", this.appId);
        if (this.incentivized) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        qVar.p("incentivized", Integer.valueOf(i10));
        qVar.o("header_bidding", Boolean.valueOf(this.headerBidding));
        qVar.o("play_remote_assets", Boolean.valueOf(this.playRemoteUrl));
        qVar.p(ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME, Long.valueOf(this.adStartTime));
        if (!TextUtils.isEmpty(this.url)) {
            qVar.q("url", this.url);
        }
        qVar.p("adDuration", Long.valueOf(this.adDuration));
        qVar.p("ttDownload", Long.valueOf(this.ttDownload));
        qVar.q("campaign", this.campaign);
        qVar.q("adType", this.adType);
        qVar.q("templateId", this.templateId);
        qVar.p(ReportDBAdapter.ReportColumns.COLUMN_INIT_TIMESTAMP, Long.valueOf(this.initTimeStamp));
        qVar.p("asset_download_duration", Long.valueOf(this.assetDownloadDuration));
        if (!TextUtils.isEmpty(this.adSize)) {
            qVar.q("ad_size", this.adSize);
        }
        l lVar = new l();
        q qVar2 = new q();
        qVar2.p("startTime", Long.valueOf(this.adStartTime));
        int i11 = this.videoViewed;
        if (i11 > 0) {
            qVar2.p(ReportDBAdapter.ReportColumns.COLUMN_VIDEO_VIEWED, Integer.valueOf(i11));
        }
        long j10 = this.videoLength;
        if (j10 > 0) {
            qVar2.p("videoLength", Long.valueOf(j10));
        }
        l lVar2 = new l();
        Iterator<UserAction> it = this.userActions.iterator();
        while (it.hasNext()) {
            lVar2.o(it.next().toJson());
        }
        qVar2.n(lVar2, "userActions");
        lVar.o(qVar2);
        qVar.n(lVar, "plays");
        l lVar3 = new l();
        Iterator<String> it2 = this.errors.iterator();
        while (it2.hasNext()) {
            lVar3.n(it2.next());
        }
        qVar.n(lVar3, ReportDBAdapter.ReportColumns.COLUMN_ERRORS);
        l lVar4 = new l();
        Iterator<String> it3 = this.clickedThrough.iterator();
        while (it3.hasNext()) {
            lVar4.n(it3.next());
        }
        qVar.n(lVar4, "clickedThrough");
        if (this.incentivized && !TextUtils.isEmpty(this.userID)) {
            qVar.q("user", this.userID);
        }
        int i12 = this.ordinal;
        if (i12 > 0) {
            qVar.p("ordinal_view", Integer.valueOf(i12));
        }
        return qVar;
    }

    public Report(Advertisement advertisement, Placement placement, long j10) {
        this(advertisement, placement, j10, null);
    }

    public Report(Advertisement advertisement, Placement placement, long j10, String str) {
        this.status = 0;
        this.userActions = new ArrayList();
        this.clickedThrough = new ArrayList();
        this.errors = new ArrayList();
        this.placementId = placement.getId();
        this.adToken = advertisement.getAdToken();
        this.advertisementID = advertisement.getId();
        this.appId = advertisement.getAppID();
        this.incentivized = placement.isIncentivized();
        this.headerBidding = placement.isHeaderBidding();
        this.adStartTime = j10;
        this.url = advertisement.getUrl();
        this.ttDownload = -1L;
        this.campaign = advertisement.getCampaign();
        this.initTimeStamp = SessionTracker.getInstance().getInitTimestamp();
        this.assetDownloadDuration = advertisement.getAssetDownloadDuration();
        int adType = advertisement.getAdType();
        if (adType == 0) {
            this.adType = "vungle_local";
        } else if (adType == 1) {
            this.adType = "vungle_mraid";
        } else {
            throw new IllegalArgumentException("Unknown ad type, cannot process!");
        }
        this.templateId = advertisement.getTemplateId();
        if (str == null) {
            this.userID = "";
        } else {
            this.userID = str;
        }
        this.ordinal = advertisement.getAdConfig().getOrdinal();
        AdConfig.AdSize adSize = advertisement.getAdConfig().getAdSize();
        if (AdConfig.AdSize.isNonMrecBannerAdSize(adSize)) {
            this.adSize = adSize.getName();
        }
    }
}
