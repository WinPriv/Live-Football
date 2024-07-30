package com.vungle.warren;

import android.annotation.TargetApi;
import com.ironsource.adapters.facebook.a;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.VisionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.NetworkProvider;
import com.vungle.warren.vision.VisionAggregationData;
import com.vungle.warren.vision.VisionAggregationInfo;
import com.vungle.warren.vision.VisionConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m8.l;
import m8.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VisionController {
    static final String ADVERTISER_DETAILS = "advertiser_details";
    static final String AGGREGATE = "aggregate";
    static final String CAMPAIGN_DETAILS = "campaign_details";
    static final String CREATIVE_DETAILS = "creative_details";
    static final String DATA_SCIENCE_CACHE = "data_science_cache";
    static final String FILTER_ID = "_id";
    static final String LAST_TIME_VIEWED = "last_time_viewed";
    static final String LAST_VIEWED_ADVERTISER_ID = "last_viewed_advertiser_id";
    static final String LAST_VIEWED_CAMPAIGN_ID = "last_viewed_campaign_id";
    static final String LAST_VIEWED_CREATIVE_ID = "last_viewed_creative_id";
    static final String TOTAL_VIEW_COUNT = "total_view_count";
    static final String VIEW_COUNT = "view_count";
    static final String VISION = "vision";
    static final String VISION_COOKIE = "visionCookie";
    static final String WINDOW = "window";
    private VisionConfig config = new VisionConfig();
    private final NetworkProvider networkProvider;
    private final Repository repository;

    public VisionController(Repository repository, NetworkProvider networkProvider) {
        this.repository = repository;
        this.networkProvider = networkProvider;
    }

    private String getDataScienceCache() {
        Cookie cookie = (Cookie) this.repository.load(VISION_COOKIE, Cookie.class).get();
        if (cookie == null) {
            return null;
        }
        return cookie.getString(DATA_SCIENCE_CACHE);
    }

    public void clearData() throws DatabaseHelper.DBException {
        this.repository.trimVisionData(0);
    }

    public String getFilterName(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1329100269:
                if (str.equals(CAMPAIGN_DETAILS)) {
                    c10 = 0;
                    break;
                }
                break;
            case 1272113586:
                if (str.equals(CREATIVE_DETAILS)) {
                    c10 = 1;
                    break;
                }
                break;
            case 1845893934:
                if (str.equals(ADVERTISER_DETAILS)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "campaign";
            case 1:
                return "creative";
            case 2:
                return VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER;
            default:
                return null;
        }
    }

    @TargetApi(21)
    public q getPayload() {
        int i10;
        String str;
        int i11;
        int i12;
        VisionController visionController = this;
        q qVar = new q();
        String dataScienceCache = getDataScienceCache();
        if (dataScienceCache != null) {
            qVar.q(DATA_SCIENCE_CACHE, dataScienceCache);
        }
        if (visionController.config.viewLimit != null) {
            int currentNetworkType = visionController.networkProvider.getCurrentNetworkType();
            if (currentNetworkType != 0) {
                if (currentNetworkType != 1) {
                    if (currentNetworkType != 4) {
                        if (currentNetworkType != 9) {
                            if (currentNetworkType != 17) {
                                if (currentNetworkType != 6) {
                                    if (currentNetworkType != 7) {
                                        i10 = visionController.config.viewLimit.device;
                                    }
                                }
                            }
                        }
                    }
                }
                VisionConfig.Limits limits = visionController.config.viewLimit;
                i12 = limits.wifi;
                if (i12 <= 0) {
                    i10 = limits.device;
                }
                i10 = i12;
            }
            VisionConfig.Limits limits2 = visionController.config.viewLimit;
            i12 = limits2.mobile;
            if (i12 <= 0) {
                i10 = limits2.device;
            }
            i10 = i12;
        } else {
            i10 = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = new l();
        qVar.n(lVar, AGGREGATE);
        int[] iArr = visionController.config.aggregationTimeWindows;
        if (iArr != null) {
            int length = iArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = iArr[i13];
                long millis = currentTimeMillis - TimeUnit.DAYS.toMillis(i14);
                VisionAggregationInfo visionAggregationInfo = visionController.repository.getVisionAggregationInfo(millis).get();
                q qVar2 = new q();
                qVar2.p(WINDOW, Integer.valueOf(i14));
                if (visionAggregationInfo != null) {
                    str = visionAggregationInfo.lastCreative;
                } else {
                    str = null;
                }
                qVar2.q(LAST_VIEWED_CREATIVE_ID, str);
                if (visionAggregationInfo != null) {
                    i11 = visionAggregationInfo.totalCount;
                } else {
                    i11 = 0;
                }
                qVar2.p(TOTAL_VIEW_COUNT, Integer.valueOf(i11));
                String[] strArr = visionController.config.aggregationFilters;
                if (strArr != null) {
                    int length2 = strArr.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        String str2 = strArr[i15];
                        long j10 = currentTimeMillis;
                        l lVar2 = new l();
                        qVar2.n(lVar2, str2);
                        String filterName = visionController.getFilterName(str2);
                        List<VisionAggregationData> list = visionController.repository.getVisionAggregationData(millis, i10, filterName).get();
                        if (list != null) {
                            for (VisionAggregationData visionAggregationData : list) {
                                int i16 = i10;
                                q qVar3 = new q();
                                qVar3.q(a.h(filterName, "_id"), visionAggregationData.f27245id);
                                qVar3.p(VIEW_COUNT, Integer.valueOf(visionAggregationData.viewCount));
                                qVar3.p(LAST_TIME_VIEWED, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(visionAggregationData.lastTimeStamp)));
                                lVar2.o(qVar3);
                                i10 = i16;
                                iArr = iArr;
                                filterName = filterName;
                                length = length;
                            }
                        }
                        i15++;
                        visionController = this;
                        currentTimeMillis = j10;
                        i10 = i10;
                        iArr = iArr;
                        length = length;
                    }
                }
                lVar.o(qVar2);
                i13++;
                visionController = this;
                currentTimeMillis = currentTimeMillis;
                i10 = i10;
                iArr = iArr;
                length = length;
            }
        }
        return qVar;
    }

    public VisionConfig getVisionConfig() {
        return this.config;
    }

    public boolean isEnabled() {
        return this.config.enabled;
    }

    public void reportData(String str, String str2, String str3) throws DatabaseHelper.DBException {
        int i10;
        this.repository.save(new VisionData(System.currentTimeMillis(), str, str2, str3));
        Repository repository = this.repository;
        VisionConfig.Limits limits = this.config.viewLimit;
        if (limits != null) {
            i10 = limits.device;
        } else {
            i10 = 0;
        }
        repository.trimVisionData(i10);
    }

    public void setConfig(VisionConfig visionConfig) throws DatabaseHelper.DBException {
        int i10;
        this.config = visionConfig;
        if (visionConfig.enabled) {
            Repository repository = this.repository;
            VisionConfig.Limits limits = visionConfig.viewLimit;
            if (limits != null) {
                i10 = limits.device;
            } else {
                i10 = 0;
            }
            repository.trimVisionData(i10);
        }
    }

    public void setDataScienceCache(String str) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(VISION_COOKIE);
        if (str != null) {
            cookie.putValue(DATA_SCIENCE_CACHE, str);
        }
        this.repository.save(cookie);
    }
}
