package com.huawei.openalliance.ad.beans.parameter;

import com.huawei.hms.ads.App;
import com.huawei.hms.ads.RequestOptions;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.metadata.Video;
import com.huawei.openalliance.ad.constant.w;
import gb.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y9.b;

@DataKeep
/* loaded from: classes2.dex */
public class AdSlotParam {
    private static final String TAG = "AdSlotParam";
    private Integer adHeight;
    private List<String> adIds;
    private int adType;
    private Integer adWidth;
    private Integer adsLocSwitch;
    private String agcAaid;
    private Integer allowMobileTraffic;
    private App appInfo;
    private Integer bannerRefFlag;
    private String belongCountry;
    private Integer brand;
    private String contentBundle;

    @b
    private Map<String, String> contentBundleMap;
    private String contentUrl;
    private List<String> detailedCreativeTypeList;
    private int deviceType;
    private Integer endMode;
    private int gender;
    private Integer gpsSwitch;
    private int height;
    private Integer imageOrientation;
    private boolean isPreload;
    private boolean isRequestMultipleImages;
    private Integer isSmart;
    private Set<String> keyWordsSet;
    private Integer linkedMode;
    private Location location;
    private int maxCount;
    private Integer mediaGpsSwitch;
    private boolean needDownloadImage;
    private int orientation;
    private String requestAgent;
    private String requestId;
    private RequestOptions requestOptions;
    private String requestSequence;
    private Integer requestType;
    private Integer sdkType;
    private boolean sharePd;
    private Integer splashStartMode;
    private Integer splashType;
    private boolean supportTptAd;
    private boolean test;
    private String testDeviceId;
    private int totalDuration;
    private String uiEngineVer;
    private Map<String, Integer> unsupportedTags;
    private Video video;
    private int width;

    /* loaded from: classes2.dex */
    public static final class a {
        public ArrayList A;
        public Integer B;
        public String C;
        public Map<String, String> D;

        /* renamed from: g, reason: collision with root package name */
        public String f21969g;

        /* renamed from: i, reason: collision with root package name */
        public Video f21971i;

        /* renamed from: k, reason: collision with root package name */
        public android.location.Location f21973k;

        /* renamed from: l, reason: collision with root package name */
        public RequestOptions f21974l;

        /* renamed from: m, reason: collision with root package name */
        public int f21975m;

        /* renamed from: n, reason: collision with root package name */
        public String f21976n;
        public String o;

        /* renamed from: p, reason: collision with root package name */
        public Set<String> f21977p;

        /* renamed from: q, reason: collision with root package name */
        public int f21978q;

        /* renamed from: r, reason: collision with root package name */
        public Integer f21979r;

        /* renamed from: t, reason: collision with root package name */
        public String f21981t;

        /* renamed from: v, reason: collision with root package name */
        public Integer f21983v;

        /* renamed from: w, reason: collision with root package name */
        public Integer f21984w;

        /* renamed from: x, reason: collision with root package name */
        public App f21985x;
        public int y;

        /* renamed from: z, reason: collision with root package name */
        public Integer f21986z;

        /* renamed from: a, reason: collision with root package name */
        public List<String> f21964a = new ArrayList(0);

        /* renamed from: b, reason: collision with root package name */
        public int f21965b = 1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21966c = false;

        /* renamed from: d, reason: collision with root package name */
        public int f21967d = 4;

        /* renamed from: e, reason: collision with root package name */
        public int f21968e = 0;
        public int f = 0;

        /* renamed from: h, reason: collision with root package name */
        public boolean f21970h = false;

        /* renamed from: j, reason: collision with root package name */
        public int f21972j = 3;

        /* renamed from: s, reason: collision with root package name */
        public boolean f21980s = true;

        /* renamed from: u, reason: collision with root package name */
        public boolean f21982u = true;
        public boolean E = false;

        public final void a(String str) {
            Map<String, String> map = (Map) gb.b.o(Map.class, str, new Class[0]);
            if (!a0.a.r(map)) {
                String w10 = AdSlotParam.w(map);
                this.D = map;
                this.C = w10;
                return;
            }
            ex.I(AdSlotParam.TAG, "contentBundle info is empty or not json string");
        }

        public final AdSlotParam b() {
            return new AdSlotParam(this);
        }
    }

    public AdSlotParam() {
        this.isPreload = false;
        this.sharePd = true;
        this.adType = 3;
        this.needDownloadImage = false;
        this.isRequestMultipleImages = true;
        this.supportTptAd = false;
    }

    public static String w(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ImpEX(entry.getKey(), p.i(entry.getValue())));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("contentBundle", arrayList);
        return gb.b.p(hashMap);
    }

    public final void A(int i10) {
        this.width = i10;
    }

    public final void B(Integer num) {
        this.splashType = num;
    }

    public final void C(String str) {
        this.uiEngineVer = str;
    }

    public final void D(Integer num) {
        this.sdkType = num;
    }

    public final Integer E() {
        return this.endMode;
    }

    public final AdSlotParam F() {
        AdSlotParam adSlotParam = new AdSlotParam();
        adSlotParam.adIds = this.adIds;
        adSlotParam.orientation = this.orientation;
        adSlotParam.test = this.test;
        adSlotParam.deviceType = this.deviceType;
        adSlotParam.width = this.width;
        adSlotParam.height = this.height;
        adSlotParam.requestSequence = this.requestSequence;
        adSlotParam.video = this.video;
        adSlotParam.isPreload = this.isPreload;
        adSlotParam.sharePd = this.sharePd;
        adSlotParam.requestOptions = this.requestOptions;
        adSlotParam.location = this.location;
        adSlotParam.gender = this.gender;
        adSlotParam.contentUrl = this.contentUrl;
        adSlotParam.requestAgent = this.requestAgent;
        adSlotParam.keyWordsSet = this.keyWordsSet;
        adSlotParam.maxCount = this.maxCount;
        adSlotParam.belongCountry = this.belongCountry;
        adSlotParam.isSmart = this.isSmart;
        adSlotParam.needDownloadImage = this.needDownloadImage;
        adSlotParam.imageOrientation = this.imageOrientation;
        adSlotParam.isRequestMultipleImages = this.isRequestMultipleImages;
        adSlotParam.adWidth = this.adWidth;
        adSlotParam.adHeight = this.adHeight;
        adSlotParam.allowMobileTraffic = this.allowMobileTraffic;
        adSlotParam.totalDuration = this.totalDuration;
        adSlotParam.splashStartMode = this.splashStartMode;
        adSlotParam.splashType = this.splashType;
        adSlotParam.adsLocSwitch = this.adsLocSwitch;
        adSlotParam.gpsSwitch = this.gpsSwitch;
        adSlotParam.mediaGpsSwitch = this.mediaGpsSwitch;
        adSlotParam.brand = this.brand;
        adSlotParam.bannerRefFlag = this.bannerRefFlag;
        adSlotParam.detailedCreativeTypeList = this.detailedCreativeTypeList;
        adSlotParam.requestType = this.requestType;
        adSlotParam.contentBundle = this.contentBundle;
        adSlotParam.contentBundleMap = this.contentBundleMap;
        adSlotParam.agcAaid = this.agcAaid;
        adSlotParam.endMode = this.endMode;
        adSlotParam.unsupportedTags = this.unsupportedTags;
        adSlotParam.supportTptAd = this.supportTptAd;
        return adSlotParam;
    }

    public final RequestOptions a() {
        return this.requestOptions;
    }

    public final void b(int i10) {
        this.height = i10;
    }

    public final void c(Integer num) {
        this.splashStartMode = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str) {
        Map<String, String> map;
        Map map2 = (Map) gb.b.o(Map.class, str, new Class[0]);
        if (!a0.a.r(map2) && !a0.a.r(this.contentBundleMap)) {
            ex.V(TAG, "merge auto content Bundle");
            for (Map.Entry entry : map2.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!this.contentBundleMap.containsKey(str2) && !p.f(str3)) {
                    this.contentBundleMap.put(str2, map2.get(str2));
                }
            }
            if (this.contentBundleMap.containsKey("content") && this.contentBundleMap.containsKey(w.ch)) {
                this.contentBundleMap.remove(w.ch);
            }
            map = this.contentBundleMap;
        } else if (!a0.a.r(map2)) {
            ex.V(TAG, "set auto content Bundle");
            map = (Map) gb.b.o(Map.class, str, new Class[0]);
            if (a0.a.r(map)) {
                ex.I(TAG, "auto contentBundle info is empty or not json string");
                return;
            }
        } else {
            return;
        }
        this.contentBundle = w(map);
    }

    public final void e(Integer num) {
        this.adsLocSwitch = num;
    }

    public final List<String> f() {
        return this.adIds;
    }

    public final void g() {
        this.isPreload = true;
    }

    public final void h(int i10) {
        this.adType = i10;
    }

    public final void i(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public final void j(Location location) {
        this.location = location;
    }

    public final void k(String str) {
        this.belongCountry = str;
    }

    public final void l() {
        this.appInfo = null;
    }

    public final void m(Integer num) {
        this.brand = num;
    }

    public final Integer n() {
        return this.splashStartMode;
    }

    public final void o(Integer num) {
        this.mediaGpsSwitch = num;
    }

    public final int p() {
        return this.deviceType;
    }

    public final void q() {
        this.allowMobileTraffic = null;
    }

    public final void r(int i10) {
        this.deviceType = i10;
    }

    public final void s(String str) {
        this.agcAaid = str;
    }

    public final void t(Integer num) {
        this.linkedMode = num;
    }

    public final void u(Integer num) {
        this.gpsSwitch = num;
    }

    public final int v() {
        return this.orientation;
    }

    public final void x(String str) {
        this.requestId = str;
    }

    public final void y(boolean z10) {
        this.sharePd = z10;
    }

    public final Location z() {
        return this.location;
    }

    public AdSlotParam(a aVar) {
        this.isPreload = false;
        this.sharePd = true;
        this.adType = 3;
        this.needDownloadImage = false;
        this.isRequestMultipleImages = true;
        this.supportTptAd = false;
        this.adIds = aVar.f21964a;
        this.orientation = aVar.f21965b;
        this.test = aVar.f21966c;
        this.deviceType = aVar.f21967d;
        this.width = aVar.f21968e;
        this.height = aVar.f;
        this.requestSequence = aVar.f21969g;
        this.video = aVar.f21971i;
        this.isPreload = aVar.f21970h;
        this.adType = aVar.f21972j;
        this.requestOptions = aVar.f21974l;
        android.location.Location location = aVar.f21973k;
        this.location = location == null ? null : new Location(Double.valueOf(location.getLongitude()), Double.valueOf(aVar.f21973k.getLatitude()));
        this.gender = aVar.f21975m;
        this.contentUrl = aVar.f21976n;
        this.requestAgent = aVar.o;
        this.keyWordsSet = aVar.f21977p;
        this.maxCount = aVar.f21978q;
        this.isSmart = aVar.f21979r;
        this.needDownloadImage = aVar.f21980s;
        this.imageOrientation = null;
        this.testDeviceId = aVar.f21981t;
        this.isRequestMultipleImages = aVar.f21982u;
        this.adWidth = aVar.f21983v;
        this.adHeight = aVar.f21984w;
        this.allowMobileTraffic = null;
        this.appInfo = aVar.f21985x;
        this.totalDuration = aVar.y;
        this.brand = null;
        this.bannerRefFlag = aVar.f21986z;
        this.requestId = null;
        this.detailedCreativeTypeList = aVar.A;
        this.requestType = aVar.B;
        this.contentBundle = aVar.C;
        this.contentBundleMap = aVar.D;
        this.agcAaid = null;
        this.endMode = null;
        this.unsupportedTags = null;
        this.supportTptAd = aVar.E;
    }
}
