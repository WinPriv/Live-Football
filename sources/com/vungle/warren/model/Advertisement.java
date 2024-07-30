package com.vungle.warren.model;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.d.c;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.hms.ads.ep;
import com.vungle.warren.AdConfig;
import com.vungle.warren.NativeAd;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.HashUtility;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m8.i;
import m8.l;
import m8.q;
import n8.b;
import o8.r;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import s.f;

/* loaded from: classes2.dex */
public class Advertisement implements Comparable<Advertisement> {
    public static final int DONE = 3;
    public static final int ERROR = 4;
    public static final String FILE_SCHEME = "file://";
    static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final int INVALID = 5;
    public static final String KEY_POSTROLL = "postroll";
    public static final String KEY_TEMPLATE = "template";
    public static final String KEY_VIDEO = "video";
    public static final int LANDSCAPE = 1;
    private static final String MRAID_ARGS = "mraid_args";
    public static final int NEW = 0;
    public static final int PORTRAIT = 0;
    public static final int READY = 1;
    static final String START_MUTED = "START_MUTED";
    private static final String TAG = "Advertisement";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    public static final int TYPE_VUNGLE_LOCAL = 0;
    public static final int TYPE_VUNGLE_MRAID = 1;
    private static final String UNKNOWN = "unknown";
    public static final int VIEWING = 2;
    AdConfig adConfig;
    String adMarketId;
    public long adRequestStartTime;
    String adToken;

    @AdType
    int adType;
    String appID;
    public long assetDownloadDuration;
    public long assetDownloadStartTime;
    public boolean assetsFullyDownloaded;
    String bidToken;
    Map<String, Pair<String, String>> cacheableAssets;
    String campaign;
    List<Checkpoint> checkpoints;
    boolean clickCoordinatesEnabled;
    int countdown;
    boolean ctaClickArea;
    String ctaDestinationUrl;
    boolean ctaOverlayEnabled;
    String ctaUrl;
    String deeplink;
    int delay;
    Map<String, ArrayList<String>> dynamicEventsAndUrls;
    boolean enableOm;
    long expireTime;
    private i gson;
    boolean headerBidding;
    String identifier;
    Map<String, String> incentivizedTextSettings;
    String md5;
    Map<String, String> mraidFiles;
    String omExtraVast;
    String placementId;
    String postrollBundleUrl;
    boolean requiresNonMarketInstall;
    int retryCount;
    long serverRequestTimestamp;
    int showCloseDelay;
    int showCloseIncentivized;
    int state;
    String templateId;
    Map<String, String> templateSettings;
    String templateType;
    String templateUrl;
    long ttDownload;
    int videoHeight;
    String videoIdentifier;
    String videoUrl;
    int videoWidth;
    private List<String> winNotifications;
    private static final Collection<String> STATIC_TPAT_EVENTS = Arrays.asList(c.ci, "checkpoint.0", "checkpoint.25", "checkpoint.50", "checkpoint.75", "checkpoint.100");
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    /* loaded from: classes2.dex */
    public @interface AdType {
    }

    /* loaded from: classes2.dex */
    public @interface CacheKey {
    }

    /* loaded from: classes2.dex */
    public static class Checkpoint implements Comparable<Checkpoint> {

        @b("percentage")
        private byte percentage;

        @b("urls")
        private String[] urls;

        public Checkpoint(q qVar) throws IllegalArgumentException {
            if (JsonUtil.hasNonNull(qVar, "checkpoint")) {
                this.percentage = (byte) (qVar.s("checkpoint").g() * 100.0f);
                if (JsonUtil.hasNonNull(qVar, "urls")) {
                    l t10 = qVar.t("urls");
                    this.urls = new String[t10.size()];
                    for (int i10 = 0; i10 < t10.size(); i10++) {
                        if (t10.q(i10) != null && !"null".equalsIgnoreCase(t10.q(i10).toString())) {
                            this.urls[i10] = t10.q(i10).m();
                        } else {
                            this.urls[i10] = "";
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Checkpoint missing reporting URL!");
            }
            throw new IllegalArgumentException("Checkpoint missing percentage!");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Checkpoint)) {
                return false;
            }
            Checkpoint checkpoint = (Checkpoint) obj;
            if (checkpoint.percentage != this.percentage || checkpoint.urls.length != this.urls.length) {
                return false;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.urls;
                if (i10 >= strArr.length) {
                    return true;
                }
                if (!checkpoint.urls[i10].equals(strArr[i10])) {
                    return false;
                }
                i10++;
            }
        }

        public byte getPercentage() {
            return this.percentage;
        }

        public String[] getUrls() {
            return (String[]) this.urls.clone();
        }

        public int hashCode() {
            int i10 = this.percentage * Ascii.US;
            String[] strArr = this.urls;
            return ((i10 + strArr.length) * 31) + Arrays.hashCode(strArr);
        }

        @Override // java.lang.Comparable
        public int compareTo(Checkpoint checkpoint) {
            return Float.compare(this.percentage, checkpoint.percentage);
        }

        public Checkpoint(l lVar, byte b10) {
            if (lVar.size() != 0) {
                this.urls = new String[lVar.size()];
                for (int i10 = 0; i10 < lVar.size(); i10++) {
                    this.urls[i10] = lVar.q(i10).m();
                }
                this.percentage = b10;
                return;
            }
            throw new IllegalArgumentException("Empty URLS!");
        }
    }

    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public @interface State {
    }

    public Advertisement() {
        this.gson = new i();
        this.dynamicEventsAndUrls = new r();
        this.ctaClickArea = true;
        this.mraidFiles = new HashMap();
        this.cacheableAssets = new HashMap();
        this.incentivizedTextSettings = new HashMap();
        this.state = 0;
        this.assetsFullyDownloaded = false;
        this.winNotifications = new ArrayList();
    }

    private boolean isValidUrl(String str) {
        if (!TextUtils.isEmpty(str) && HttpUrl.parse(str) != null) {
            return true;
        }
        return false;
    }

    public void configure(AdConfig adConfig) {
        if (adConfig == null) {
            this.adConfig = new AdConfig();
        } else {
            this.adConfig = adConfig;
        }
    }

    public q createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        q qVar = new q();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            qVar.q(entry.getKey(), entry.getValue());
        }
        VungleLogger.verbose(true, TAG, MRAID_ARGS, qVar.toString());
        return qVar;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Advertisement)) {
            return false;
        }
        Advertisement advertisement = (Advertisement) obj;
        if (advertisement.adType != this.adType || advertisement.delay != this.delay || advertisement.showCloseDelay != this.showCloseDelay || advertisement.showCloseIncentivized != this.showCloseIncentivized || advertisement.countdown != this.countdown || advertisement.videoWidth != this.videoWidth || advertisement.videoHeight != this.videoHeight || advertisement.ctaOverlayEnabled != this.ctaOverlayEnabled || advertisement.ctaClickArea != this.ctaClickArea || advertisement.retryCount != this.retryCount || advertisement.enableOm != this.enableOm || advertisement.requiresNonMarketInstall != this.requiresNonMarketInstall || advertisement.state != this.state || (str = advertisement.identifier) == null || (str2 = this.identifier) == null || !str.equals(str2) || !advertisement.campaign.equals(this.campaign) || !advertisement.videoUrl.equals(this.videoUrl) || !advertisement.md5.equals(this.md5) || !advertisement.postrollBundleUrl.equals(this.postrollBundleUrl) || !advertisement.ctaDestinationUrl.equals(this.ctaDestinationUrl) || !advertisement.ctaUrl.equals(this.ctaUrl) || !advertisement.adToken.equals(this.adToken) || !advertisement.videoIdentifier.equals(this.videoIdentifier)) {
            return false;
        }
        String str3 = advertisement.omExtraVast;
        if (str3 == null ? this.omExtraVast != null : !str3.equals(this.omExtraVast)) {
            return false;
        }
        if (!advertisement.adMarketId.equals(this.adMarketId) || !advertisement.bidToken.equals(this.bidToken) || advertisement.checkpoints.size() != this.checkpoints.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.checkpoints.size(); i10++) {
            if (!advertisement.checkpoints.get(i10).equals(this.checkpoints.get(i10))) {
                return false;
            }
        }
        if (this.dynamicEventsAndUrls.equals(advertisement.dynamicEventsAndUrls) && advertisement.serverRequestTimestamp == this.serverRequestTimestamp && advertisement.clickCoordinatesEnabled == this.clickCoordinatesEnabled && advertisement.headerBidding == this.headerBidding) {
            return true;
        }
        return false;
    }

    public AdConfig getAdConfig() {
        return this.adConfig;
    }

    public String getAdMarketId() {
        return this.adMarketId;
    }

    public String getAdToken() {
        return this.adToken;
    }

    @AdType
    public int getAdType() {
        return this.adType;
    }

    public String getAdvertiserAppId() {
        String appID = getAppID();
        String appID2 = getAppID();
        if (appID2 != null && appID2.length() > 3) {
            try {
                JSONObject jSONObject = new JSONObject(appID2.substring(3));
                appID = jSONObject.isNull("app_id") ? null : jSONObject.optString("app_id", null);
            } catch (JSONException e10) {
                Log.e(TAG, "JsonException : ", e10);
            }
        }
        if (TextUtils.isEmpty(appID)) {
            return "unknown";
        }
        return appID;
    }

    public String getAppID() {
        return this.appID;
    }

    public long getAssetDownloadDuration() {
        return this.assetDownloadDuration;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCTAURL(boolean z10) {
        int i10 = this.adType;
        if (i10 != 0) {
            if (i10 == 1) {
                return this.ctaUrl;
            }
            throw new IllegalArgumentException("Unknown AdType " + this.adType);
        }
        if (z10) {
            return this.ctaUrl;
        }
        return this.ctaDestinationUrl;
    }

    public String getCampaign() {
        return this.campaign;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getCampaignId() {
        /*
            r3 = this;
            java.lang.String r0 = r3.getCampaign()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L18
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 1
            if (r1 < r2) goto L18
            r1 = 0
            r0 = r0[r1]
            goto L19
        L18:
            r0 = 0
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L21
            java.lang.String r0 = "unknown"
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.getCampaignId():java.lang.String");
    }

    public List<Checkpoint> getCheckpoints() {
        return this.checkpoints;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getCreativeId() {
        /*
            r3 = this;
            java.lang.String r0 = r3.getCampaign()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L18
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L18
            r1 = 1
            r0 = r0[r1]
            goto L19
        L18:
            r0 = 0
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L21
            java.lang.String r0 = "unknown"
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.getCreativeId():java.lang.String");
    }

    public boolean getCtaClickArea() {
        return this.ctaClickArea;
    }

    public String getDeeplinkUrl() {
        return this.deeplink;
    }

    public Map<String, String> getDownloadableUrls() {
        HashMap hashMap = new HashMap();
        int i10 = this.adType;
        if (i10 != 0) {
            if (i10 == 1) {
                if (!isNativeTemplateType()) {
                    hashMap.put("template", this.templateUrl);
                }
                Iterator<Map.Entry<String, Pair<String, String>>> it = this.cacheableAssets.entrySet().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next().getValue().first;
                    if (isValidUrl(str)) {
                        hashMap.put(URLUtil.guessFileName(str, null, null), str);
                    }
                }
            } else {
                throw new IllegalStateException("Advertisement created without adType!");
            }
        } else {
            hashMap.put("video", this.videoUrl);
            if (!TextUtils.isEmpty(this.postrollBundleUrl)) {
                hashMap.put(KEY_POSTROLL, this.postrollBundleUrl);
            }
        }
        return hashMap;
    }

    public long getExpireTime() {
        return this.expireTime * 1000;
    }

    public String getId() {
        String str = this.identifier;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Map<String, String> getMRAIDArgsInMap() {
        if (this.templateSettings != null) {
            HashMap hashMap = new HashMap(this.templateSettings);
            for (Map.Entry<String, Pair<String, String>> entry : this.cacheableAssets.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().first);
            }
            if (!this.mraidFiles.isEmpty()) {
                hashMap.putAll(this.mraidFiles);
            }
            if (!this.incentivizedTextSettings.isEmpty()) {
                hashMap.putAll(this.incentivizedTextSettings);
            }
            String str = (String) hashMap.get(START_MUTED);
            String str2 = ep.Code;
            if (!ep.Code.equalsIgnoreCase(str)) {
                if ((getAdConfig().getSettings() & 1) == 0) {
                    str2 = ep.V;
                }
                hashMap.put(START_MUTED, str2);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
    }

    public boolean getOmEnabled() {
        return this.enableOm;
    }

    public String getOmExtraVast() {
        return this.omExtraVast;
    }

    @Orientation
    public int getOrientation() {
        if (this.videoWidth > this.videoHeight) {
            return 1;
        }
        return 0;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getPrivacyUrl() {
        return this.templateSettings.get(NativeAd.TOKEN_VUNGLE_PRIVACY_URL);
    }

    public long getServerRequestTimestamp() {
        return this.serverRequestTimestamp;
    }

    public int getShowCloseDelay(boolean z10) {
        int i10;
        if (z10) {
            i10 = this.showCloseIncentivized;
        } else {
            i10 = this.showCloseDelay;
        }
        return i10 * 1000;
    }

    @State
    public int getState() {
        return this.state;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public String[] getTpatUrls(String str) {
        String b10 = f.b("Unknown TPAT Event ", str);
        ArrayList<String> arrayList = this.dynamicEventsAndUrls.get(str);
        int i10 = this.adType;
        if (i10 != 0) {
            if (i10 == 1) {
                if (str.startsWith("checkpoint")) {
                    String[] strArr = EMPTY_STRING_ARRAY;
                    Checkpoint checkpoint = this.checkpoints.get(Integer.parseInt(str.split("\\.")[1]) / 25);
                    if (checkpoint != null) {
                        return checkpoint.getUrls();
                    }
                    return strArr;
                }
                if (arrayList == null) {
                    VungleLogger.warn("Advertisement#getTpatUrls", b10);
                    return EMPTY_STRING_ARRAY;
                }
                return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
            }
            throw new IllegalStateException("Unknown Advertisement Type!");
        }
        if (arrayList == null) {
            VungleLogger.warn("Advertisement#getTpatUrls", b10);
            return EMPTY_STRING_ARRAY;
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    public long getTtDownload() {
        return this.ttDownload;
    }

    public String getUrl() {
        return this.videoUrl;
    }

    public List<String> getWinNotifications() {
        return this.winNotifications;
    }

    public boolean hasPostroll() {
        return !TextUtils.isEmpty(this.postrollBundleUrl);
    }

    public int hashCode() {
        return (((((int) (((((HashUtility.getHashCode(this.bidToken) + ((HashUtility.getHashCode(this.adMarketId) + ((((((((HashUtility.getHashCode(this.winNotifications) + ((HashUtility.getHashCode(this.videoIdentifier) + ((HashUtility.getHashCode(this.adToken) + ((((HashUtility.getHashCode(this.ctaUrl) + ((HashUtility.getHashCode(this.ctaDestinationUrl) + ((((((HashUtility.getHashCode(this.postrollBundleUrl) + ((HashUtility.getHashCode(this.md5) + ((((((HashUtility.getHashCode(this.videoUrl) + ((((((((HashUtility.getHashCode(this.campaign) + ((((HashUtility.getHashCode(this.dynamicEventsAndUrls) + ((HashUtility.getHashCode(this.checkpoints) + ((HashUtility.getHashCode(this.identifier) + (this.adType * 31)) * 31)) * 31)) * 31) + this.delay) * 31)) * 31) + this.showCloseDelay) * 31) + this.showCloseIncentivized) * 31) + this.countdown) * 31)) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31)) * 31)) * 31) + (this.ctaOverlayEnabled ? 1 : 0)) * 31) + (this.ctaClickArea ? 1 : 0)) * 31)) * 31)) * 31) + this.retryCount) * 31)) * 31)) * 31)) * 31) + (this.enableOm ? 1 : 0)) * 31) + HashUtility.getHashCode(this.omExtraVast)) * 31) + (this.requiresNonMarketInstall ? 1 : 0)) * 31)) * 31)) * 31) + this.state) * 31) + this.serverRequestTimestamp)) * 31) + (this.clickCoordinatesEnabled ? 1 : 0)) * 31) + (this.headerBidding ? 1 : 0);
    }

    public boolean isClickCoordinatesTrackingEnabled() {
        return this.clickCoordinatesEnabled;
    }

    public boolean isCtaOverlayEnabled() {
        return this.ctaOverlayEnabled;
    }

    public boolean isHeaderBidding() {
        return this.headerBidding;
    }

    public boolean isNativeTemplateType() {
        return com.anythink.expressad.foundation.g.a.f.f9813a.equals(this.templateType);
    }

    public boolean isRequiresNonMarketInstall() {
        return this.requiresNonMarketInstall;
    }

    public void setAdRequestStartTime(long j10) {
        this.adRequestStartTime = j10;
    }

    public void setAssetDownloadStartTime(long j10) {
        this.assetDownloadStartTime = j10;
    }

    public void setFinishedDownloadingTime(long j10) {
        this.assetDownloadDuration = j10 - this.assetDownloadStartTime;
        this.ttDownload = j10 - this.adRequestStartTime;
    }

    public void setHeaderBidding(boolean z10) {
        this.headerBidding = z10;
    }

    public void setIncentivizedText(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, str4);
        }
    }

    public void setMraidAssetDir(File file) {
        for (Map.Entry<String, Pair<String, String>> entry : this.cacheableAssets.entrySet()) {
            String str = (String) entry.getValue().first;
            if (isValidUrl(str)) {
                File file2 = new File(file, URLUtil.guessFileName(str, null, null));
                if (file2.exists()) {
                    this.mraidFiles.put(entry.getKey(), FILE_SCHEME + file2.getPath());
                }
            }
        }
        this.assetsFullyDownloaded = true;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setState(@State int i10) {
        this.state = i10;
    }

    public void setWinNotifications(List<String> list) {
        if (list == null) {
            this.winNotifications.clear();
        } else {
            this.winNotifications = list;
        }
    }

    public String toString() {
        return "Advertisement{adType=" + this.adType + ", identifier='" + this.identifier + "', appID='" + this.appID + "', expireTime=" + this.expireTime + ", checkpoints=" + this.gson.k(this.checkpoints, AdvertisementDBAdapter.CHECKPOINT_LIST_TYPE) + ", winNotifications='" + TextUtils.join(",", this.winNotifications) + ", dynamicEventsAndUrls=" + this.gson.k(this.dynamicEventsAndUrls, AdvertisementDBAdapter.DYNAMIC_EVENTS_AND_URLS_TYPE) + ", delay=" + this.delay + ", campaign='" + this.campaign + "', showCloseDelay=" + this.showCloseDelay + ", showCloseIncentivized=" + this.showCloseIncentivized + ", countdown=" + this.countdown + ", videoUrl='" + this.videoUrl + "', videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", md5='" + this.md5 + "', postrollBundleUrl='" + this.postrollBundleUrl + "', ctaOverlayEnabled=" + this.ctaOverlayEnabled + ", ctaClickArea=" + this.ctaClickArea + ", ctaDestinationUrl='" + this.ctaDestinationUrl + "', ctaUrl='" + this.ctaUrl + "', adConfig=" + this.adConfig + ", retryCount=" + this.retryCount + ", adToken='" + this.adToken + "', videoIdentifier='" + this.videoIdentifier + "', templateUrl='" + this.templateUrl + "', templateSettings=" + this.templateSettings + ", mraidFiles=" + this.mraidFiles + ", cacheableAssets=" + this.cacheableAssets + ", templateId='" + this.templateId + "', templateType='" + this.templateType + "', enableOm=" + this.enableOm + ", oMSDKExtraVast='" + this.omExtraVast + "', requiresNonMarketInstall=" + this.requiresNonMarketInstall + ", adMarketId='" + this.adMarketId + "', bidToken='" + this.bidToken + "', state=" + this.state + "', assetDownloadStartTime='" + this.assetDownloadStartTime + "', assetDownloadDuration='" + this.assetDownloadDuration + "', adRequestStartTime='" + this.adRequestStartTime + "', requestTimestamp='" + this.serverRequestTimestamp + "', headerBidding='" + this.headerBidding + '}';
    }

    public void updateMRAIDTokensFromAssetDB(List<AdAsset> list) {
        for (Map.Entry<String, Pair<String, String>> entry : this.cacheableAssets.entrySet()) {
            String str = (String) entry.getValue().first;
            Iterator<AdAsset> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    AdAsset next = it.next();
                    if (!TextUtils.isEmpty(next.serverPath) && next.serverPath.equals(str)) {
                        File file = new File(next.localPath);
                        if (file.exists()) {
                            this.mraidFiles.put(entry.getKey(), FILE_SCHEME + file.getPath());
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Advertisement advertisement) {
        if (advertisement == null) {
            return 1;
        }
        String str = advertisement.identifier;
        if (str == null) {
            return this.identifier == null ? 0 : 1;
        }
        String str2 = this.identifier;
        if (str2 == null) {
            return -1;
        }
        return str2.compareTo(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Advertisement(m8.q r15) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.model.Advertisement.<init>(m8.q):void");
    }
}
