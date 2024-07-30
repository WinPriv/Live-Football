package com.huawei.openalliance.ad.ppskit.beans.parameter;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Location;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Video;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class AdSlotParam {
    private Integer adHeight;
    private List<String> adIds;
    private Integer adWidth;
    private Integer adsLocSwitch;
    private String agcAaid;
    private Integer allowMobileTraffic;
    private String apkPkg;
    private App appInfo;
    private Integer bannerRefFlag;
    private String belongCountry;
    private Integer brand;
    private String contentBundle;
    private List<String> detailedCreativeTypeList;
    private int deviceType;
    private Map<String, Integer> fcFlagMap;
    private Integer gpsSwitch;
    private int grpIdCode;
    private int height;
    private Integer imageOrientation;
    private Integer isSmart;
    private Boolean isTrackLimited;
    private Integer linkedMode;
    private Location location;
    private int maxCount;
    private Integer mediaGpsSwitch;
    private String oaid;
    private int orientation;
    private String requestId;
    private RequestOptions requestOptions;
    private String requestSequence;
    private Integer requestType;
    private Integer sdkType;
    private Integer splashStartMode;
    private Integer splashType;
    private Boolean supportTptAd;
    private boolean test;
    private int totalDuration;
    private String uiEngineVer;
    private Map<String, Integer> unsupportedTags;
    private Video video;
    private int width;
    private boolean isPreload = false;
    private boolean sharePd = true;
    private int adType = 1;
    private boolean needDownloadImage = false;
    private boolean isRequestMultipleImages = false;

    @f
    private boolean needVerify = true;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private Integer adHeight;
        private Integer adWidth;
        private String agcAaid;
        private Integer allowMobileTraffic;
        private String apkPkg;
        private App appInfo;
        private Integer bannerRefFlag;
        private Integer brand;
        private String contentBundle;
        private List<String> detailedCreativeTypeList;
        private Integer imageOrientation;
        private Integer isSmart;
        private Boolean isTrackLimited;
        private Integer linkedMode;
        private Location location;
        private int maxCount;
        private String oaid;
        private String requestId;
        private RequestOptions requestOptions;
        private String requestSequence;
        private int totalDuration;
        private Map<String, Integer> unsupportedTags;
        private Video video;
        private List<String> adIds = new ArrayList(0);
        private int orientation = 1;
        private boolean test = false;
        private int deviceType = 4;
        private int width = 0;
        private int height = 0;
        private boolean isPreload = false;
        private boolean needDownloadImage = false;
        private boolean isRequestMultipleImages = false;
        private int adType = 1;
    }

    public final void A(List<String> list) {
        this.adIds = list;
    }

    public final int B() {
        return this.orientation;
    }

    public final void C(String str) {
        this.oaid = str;
    }

    public final void D(boolean z10) {
        this.isTrackLimited = Boolean.valueOf(z10);
    }

    public final void E() {
        this.isPreload = true;
    }

    public final void F(Integer num) {
        this.linkedMode = num;
    }

    public final boolean G() {
        return this.test;
    }

    public final int H() {
        return this.deviceType;
    }

    public final int I() {
        return this.width;
    }

    public final void J(int i10) {
        this.adType = i10;
    }

    public final int K() {
        return this.height;
    }

    public final void L(Integer num) {
        this.adsLocSwitch = num;
    }

    public final void M(int i10) {
        this.grpIdCode = i10;
    }

    public final String N() {
        return this.oaid;
    }

    public final void O(Integer num) {
        this.gpsSwitch = num;
    }

    public final Boolean P() {
        return this.isTrackLimited;
    }

    public final App Q() {
        return this.appInfo;
    }

    public final boolean R() {
        return this.isPreload;
    }

    public final boolean S() {
        return this.sharePd;
    }

    public final int T() {
        return this.adType;
    }

    public final Location U() {
        return this.location;
    }

    public final RequestOptions V() {
        return this.requestOptions;
    }

    public final int W() {
        return this.maxCount;
    }

    public final String X() {
        return this.belongCountry;
    }

    public final Integer Y() {
        return this.isSmart;
    }

    public final boolean Z() {
        return this.isRequestMultipleImages;
    }

    public final int a() {
        return this.totalDuration;
    }

    public final Integer a0() {
        return this.adWidth;
    }

    public final Integer b() {
        return this.linkedMode;
    }

    public final Integer b0() {
        return this.adHeight;
    }

    public final Integer c() {
        return this.splashType;
    }

    public final Integer c0() {
        return this.allowMobileTraffic;
    }

    public final Integer d() {
        return this.splashStartMode;
    }

    public final boolean d0() {
        return this.needVerify;
    }

    public final Integer e() {
        return this.adsLocSwitch;
    }

    public final Integer f() {
        return this.gpsSwitch;
    }

    public final Integer g() {
        return this.mediaGpsSwitch;
    }

    public final Integer h() {
        return this.brand;
    }

    public final Integer i() {
        return this.bannerRefFlag;
    }

    public final String j() {
        return this.requestId;
    }

    public final List<String> k() {
        return this.detailedCreativeTypeList;
    }

    public final Integer l() {
        return this.requestType;
    }

    public final String m() {
        return this.contentBundle;
    }

    public final String n() {
        return this.agcAaid;
    }

    public final int o() {
        return this.grpIdCode;
    }

    public final Integer p() {
        return this.sdkType;
    }

    public final String q() {
        return this.uiEngineVer;
    }

    public final Map<String, Integer> r() {
        return this.unsupportedTags;
    }

    public final Boolean s() {
        return this.supportTptAd;
    }

    public final Map<String, Integer> t() {
        Map<String, Integer> map = this.fcFlagMap;
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public final AdSlotParam u() {
        AdSlotParam adSlotParam = new AdSlotParam();
        adSlotParam.adIds = this.adIds;
        adSlotParam.orientation = this.orientation;
        adSlotParam.test = this.test;
        adSlotParam.deviceType = this.deviceType;
        adSlotParam.width = this.width;
        adSlotParam.height = this.height;
        adSlotParam.requestSequence = this.requestSequence;
        adSlotParam.oaid = this.oaid;
        adSlotParam.isTrackLimited = this.isTrackLimited;
        adSlotParam.appInfo = this.appInfo;
        adSlotParam.video = this.video;
        adSlotParam.isPreload = this.isPreload;
        adSlotParam.sharePd = this.sharePd;
        adSlotParam.apkPkg = this.apkPkg;
        adSlotParam.requestOptions = this.requestOptions;
        adSlotParam.location = this.location;
        adSlotParam.maxCount = this.maxCount;
        adSlotParam.belongCountry = this.belongCountry;
        adSlotParam.isSmart = this.isSmart;
        adSlotParam.needDownloadImage = this.needDownloadImage;
        adSlotParam.imageOrientation = this.imageOrientation;
        adSlotParam.isRequestMultipleImages = this.isRequestMultipleImages;
        adSlotParam.adWidth = this.adWidth;
        adSlotParam.adHeight = this.adHeight;
        adSlotParam.allowMobileTraffic = this.allowMobileTraffic;
        adSlotParam.needVerify = this.needVerify;
        adSlotParam.totalDuration = this.totalDuration;
        adSlotParam.linkedMode = this.linkedMode;
        adSlotParam.splashType = this.splashType;
        adSlotParam.splashStartMode = this.splashStartMode;
        adSlotParam.adsLocSwitch = this.adsLocSwitch;
        adSlotParam.gpsSwitch = this.gpsSwitch;
        adSlotParam.mediaGpsSwitch = this.mediaGpsSwitch;
        adSlotParam.brand = this.brand;
        adSlotParam.bannerRefFlag = this.bannerRefFlag;
        adSlotParam.detailedCreativeTypeList = this.detailedCreativeTypeList;
        adSlotParam.adType = this.adType;
        adSlotParam.requestType = this.requestType;
        adSlotParam.contentBundle = this.contentBundle;
        adSlotParam.agcAaid = this.agcAaid;
        adSlotParam.sdkType = this.sdkType;
        adSlotParam.uiEngineVer = this.uiEngineVer;
        adSlotParam.unsupportedTags = this.unsupportedTags;
        adSlotParam.supportTptAd = this.supportTptAd;
        return adSlotParam;
    }

    public final List<String> v() {
        return this.adIds;
    }

    public final void w() {
        this.orientation = 1;
    }

    public final void x(App app) {
        this.appInfo = app;
    }

    public final void y(Location location) {
        this.location = location;
    }

    public final void z(HashMap hashMap) {
        this.fcFlagMap = hashMap;
    }
}
