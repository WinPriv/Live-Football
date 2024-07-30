package com.huawei.openalliance.ad.ppskit.db.bean;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Om;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TextState;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ma.c;
import ma.e;
import ma.f;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class ContentRecord extends a implements Serializable {
    public static final String AD_TYPE = "adType";
    public static final String API_VER = "apiVer";
    public static final String APP_PKG_NAME = "appPkgName";
    public static final String CONTENT_DOWN_METHOD = "contentDownMethod";
    public static final String CONTENT_ID = "contentId";

    @e
    public static final String CREATIVE_TYPE = "creativeType";
    public static final String DISPLAY_COUNT = "displayCount";
    public static final String DISPLAY_DATE = "displayDate";
    public static final String DISP_TIME = "dispTime";
    public static final String END_TIME = "endTime";
    public static final String FC_CTRL_DATE = "fcCtrlDate";
    public static final String FILE_CACHE_PRIORITY = "fileCachePriority";
    public static final String FILTER_DUPLICATE = "filterduplicate";
    public static final String HEIGHT = "height";
    public static final String INVALID_TIME = "invalidtime";
    public static final String LAST_SHOW_TIME = "lastShowTime";
    public static final String PRIORITY = "priority";
    public static final String REQUEST_ID = "requestId";
    public static final String SLOT_ID = "slotId";
    public static final String SPLASH_AR = "arInfoList";
    public static final String SPLASH_MEDIA_PATH = "splashMediaPath";
    public static final String SPLASH_PRE_CONTENT_FLAG = "splashPreContentFlag";
    public static final String START_TIME = "startTime";
    public static final String TASK_ID = "taskId";
    public static final String TEMPLATE_ID = "templateId";
    public static final String UNIQUE_ID = "uniqueId";
    public static final String UPDATE_TIME = "updateTime";
    public static final String WIDTH = "width";
    public static final String XRINFOLIST = "xRInfoList";
    public static final String XRINFOLIST_NULL = "[]";
    private static final long serialVersionUID = 30414300;
    private String abilityDetailInfo;
    private String adChoiceIcon;
    private String adChoiceUrl;
    private int adType_;
    private int apiVer;
    private String appCountry;

    @e
    private AppInfo appInfo;
    private String appLanguage;
    private String appPkgName;
    private String appSdkVersion;

    @c
    private List<Asset> assets;

    @e
    private boolean autoDownloadApp;
    private List<Integer> clickActionList;
    private List<AdvertiserInfo> compliance;
    private String configMap;
    private String contentDownMethod;
    private List<ContentExt> contentExts;
    private String contentId_;
    private int creativeType_;
    private String ctrlExt;

    @e
    private CtrlExt ctrlExtObj;
    private String ctrlSwitchs;
    private String customData;
    private DefaultTemplate defaultTemplate;
    private String detailUrl_;
    private long dispTime;
    private int displayCount_;
    private String displayDate_;

    @e
    private boolean enablePermissionView;

    @e
    private boolean enablePrivacyPolicyView;
    private long endTime_;
    private List<ImpEX> ext;
    private String fcCtrlDate_;
    private List<FeedbackInfo> feedbackInfoList;
    private String fileCachePriority;
    private int filterduplicate;
    private int height_;
    private String hwChannelId;
    private String intentUri_;
    private InteractCfg interactCfg;
    private int interactiontype_;
    private long invalidtime_;

    @e
    private String isAdContainerSizeMatched;

    @e
    private boolean isInHmsTaskStack;

    @e
    private boolean isMobileDataNeedRemind;
    private int isPreload;

    @e
    private boolean isSpare;
    private int isVastAd;

    @f
    private EncryptionField<String> jssdkAllowListStr;
    private List<String> keyWords;
    private List<String> keyWordsType;

    @f
    private EncryptionField<String> landPageWhiteListStr;
    private int landingTitleFlag;
    private String landingType;
    private String landpgDlInteractionCfg;
    private long lastShowTime_;
    private String logo2Pos;
    private String logo2Text;

    @e
    private Map<String, String> mapConfigMap;
    private String metaData_;

    @f
    private EncryptionField<List<Monitor>> monitors;
    private List<String> noReportEventList;
    private List<Om> om;

    @f
    private EncryptionField<String> paramFromServer;
    private int priority_;
    private String privacyUrl;
    private String proDesc;
    private String realAppPkgName;
    private int recallSource;
    private String recordtaskinfo;
    private String requestId;
    private int requestType;
    private int rewardAmount;
    private String rewardType;
    private int sequence;
    private int showAppLogoFlag_;

    @e
    private String showId;
    private int skipTextHeight;
    private String skipTextPos;
    private int skipTextSize;
    private String skipText_;
    private String slotId_;
    private String splashMediaPath;
    private int splashPreContentFlag_;
    private int splashShowTime;
    private int splashSkipBtnDelayTime;
    private int splashType;
    private long startShowTime;
    private long startTime_;
    private String taskId_;

    @e
    private TemplateData templateData;
    private String templateId;

    @e
    private String templateStyle;
    private String templateUrl;
    private List<TextState> textStateList;
    private String uniqueId;
    private long updateTime_;
    private int useGaussianBlur;
    private String userId;

    @e
    private Float videoInitMaxVol;
    private String webConfig;
    private String wechatAppId;
    private String wechatAppLink;
    private String whyThisAd;
    private int width_;
    private List<XRInfo> xRInfoList;

    public ContentRecord() {
        HashMap hashMap = d0.f22830a;
        this.showId = String.valueOf(System.currentTimeMillis());
        this.showAppLogoFlag_ = 1;
        this.fcCtrlDate_ = "";
        this.creativeType_ = 2;
        this.adType_ = -1;
        this.xRInfoList = new ArrayList();
        this.autoDownloadApp = false;
        this.enablePermissionView = false;
        this.enablePrivacyPolicyView = true;
        this.requestType = 0;
        this.splashType = 0;
        this.isSpare = false;
        this.splashSkipBtnDelayTime = -111111;
        this.splashShowTime = -111111;
        this.isInHmsTaskStack = false;
        this.isMobileDataNeedRemind = true;
        this.isVastAd = 0;
        this.recallSource = 0;
    }

    public final EncryptionField<String> A() {
        return this.paramFromServer;
    }

    public final void A0(long j10) {
        this.lastShowTime_ = j10;
    }

    public final boolean A1() {
        return this.isSpare;
    }

    public final void A2(List<ImpEX> list) {
        this.ext = list;
    }

    public final void B(String str) {
        this.appSdkVersion = str;
    }

    public final void B0(DefaultTemplate defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public final int B1() {
        return this.splashSkipBtnDelayTime;
    }

    public final int B2() {
        return this.showAppLogoFlag_;
    }

    public final String C() {
        return this.intentUri_;
    }

    public final void C0(InteractCfg interactCfg) {
        this.interactCfg = interactCfg;
    }

    public final String C1() {
        return this.skipText_;
    }

    public final void C2(int i10) {
        this.creativeType_ = i10;
    }

    public final void D(String str) {
        this.requestId = str;
    }

    public final void D0(TemplateData templateData) {
        this.templateData = templateData;
    }

    public final String D1(Context context) {
        EncryptionField<String> encryptionField = this.paramFromServer;
        if (encryptionField != null) {
            return encryptionField.a(context);
        }
        return null;
    }

    public final void D2(String str) {
        this.detailUrl_ = str;
    }

    public final void E(String str) {
        this.rewardType = str;
    }

    public final void E0(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public final void E1(int i10) {
        this.splashPreContentFlag_ = i10;
    }

    public final void E2(List<ContentExt> list) {
        this.contentExts = list;
    }

    public final List<String> F() {
        return this.keyWords;
    }

    public final void F0(String str) {
        this.skipText_ = str;
    }

    public final void F1(long j10) {
        this.endTime_ = j10;
    }

    public final long F2() {
        return this.lastShowTime_;
    }

    public final void G(String str) {
        this.fileCachePriority = str;
    }

    public final void G0(List<String> list) {
        this.keyWords = list;
    }

    public final void G1(String str) {
        this.metaData_ = str;
    }

    public final void G2(int i10) {
        this.landingTitleFlag = i10;
    }

    public final List<String> H() {
        return this.keyWordsType;
    }

    public final int H0() {
        return this.splashShowTime;
    }

    public final void H1(ArrayList arrayList) {
        this.keyWordsType = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H2(String str) {
        if (this.paramFromServer == null) {
            this.paramFromServer = new EncryptionField<>();
        }
        this.paramFromServer.f22473u = str;
    }

    public final void I(String str) {
        this.realAppPkgName = str;
    }

    public final long I0() {
        return this.dispTime;
    }

    public final String I1() {
        return this.hwChannelId;
    }

    public final void I2(ArrayList arrayList) {
        this.feedbackInfoList = arrayList;
    }

    public final String J0() {
        MetaData X1 = X1();
        if (X1 == null) {
            return null;
        }
        VideoInfo K = X1.K();
        if (K != null) {
            return String.valueOf(K.m());
        }
        MediaFile o02 = X1.o0();
        if (o02 != null) {
            return String.valueOf(o02.k());
        }
        List<ImageInfo> h02 = X1.h0();
        if (!n.M(h02)) {
            for (ImageInfo imageInfo : h02) {
                if (imageInfo != null) {
                    return String.valueOf(imageInfo.n());
                }
            }
        }
        List<ImageInfo> U = X1.U();
        if (!n.M(U)) {
            for (ImageInfo imageInfo2 : U) {
                if (imageInfo2 != null) {
                    return String.valueOf(imageInfo2.n());
                }
            }
        }
        return null;
    }

    public final List<AdvertiserInfo> J1() {
        return this.compliance;
    }

    public final long J2() {
        return this.endTime_;
    }

    public final EncryptionField<List<Monitor>> K() {
        return this.monitors;
    }

    public final boolean K0() {
        return this.isInHmsTaskStack;
    }

    public final String K1() {
        return this.wechatAppLink;
    }

    public final void K2(int i10) {
        this.sequence = i10;
    }

    public final void L(String str) {
        this.isAdContainerSizeMatched = str;
    }

    public final boolean L0() {
        return this.isMobileDataNeedRemind;
    }

    public final String L1() {
        return this.wechatAppId;
    }

    public final void L2(String str) {
        this.intentUri_ = str;
    }

    public final String M() {
        return this.logo2Pos;
    }

    public final String M0() {
        return this.customData;
    }

    public final boolean M1() {
        return !TextUtils.isEmpty(this.wechatAppId);
    }

    public final void M2(List<Asset> list) {
        this.assets = list;
    }

    public final String N0() {
        return this.userId;
    }

    public final DefaultTemplate N1() {
        return this.defaultTemplate;
    }

    public final long N2() {
        return this.startTime_;
    }

    public final List<Om> O() {
        return this.om;
    }

    public final String O0() {
        return y1.p(this.proDesc);
    }

    public final int O1() {
        return this.recallSource;
    }

    public final void O2(int i10) {
        this.rewardAmount = i10;
    }

    public final void P(String str) {
        this.appLanguage = str;
    }

    public final EncryptionField<String> P0() {
        return this.jssdkAllowListStr;
    }

    public final String P1() {
        return this.ctrlExt;
    }

    public final void P2(String str) {
        this.skipTextPos = str;
    }

    public final List<ImpEX> Q0() {
        return this.ext;
    }

    public final CtrlExt Q1() {
        if (this.ctrlExtObj == null) {
            this.ctrlExtObj = (CtrlExt) y0.o(null, this.ctrlExt, CtrlExt.class, new Class[0]);
        }
        return this.ctrlExtObj;
    }

    public final void Q2(List<AdvertiserInfo> list) {
        this.compliance = list;
    }

    public final List<ContentExt> R0() {
        return this.contentExts;
    }

    public final String R1() {
        return this.templateUrl;
    }

    public final void R2(int i10) {
        this.skipTextSize = i10;
    }

    public final String S0() {
        return this.configMap;
    }

    public final List<Monitor> S1(Context context) {
        EncryptionField<List<Monitor>> encryptionField = this.monitors;
        if (encryptionField != null) {
            return encryptionField.a(context);
        }
        return null;
    }

    public final void S2(String str) {
        this.logo2Text = str;
    }

    public final Map<String, String> T0() {
        if (this.mapConfigMap == null) {
            this.mapConfigMap = (Map) y0.o(null, this.configMap, Map.class, new Class[0]);
        }
        return this.mapConfigMap;
    }

    public final void T1(int i10) {
        this.showAppLogoFlag_ = i10;
    }

    public final void T2(int i10) {
        this.skipTextHeight = i10;
    }

    public final String U() {
        return this.skipTextPos;
    }

    public final InteractCfg U0() {
        return this.interactCfg;
    }

    public final void U1(long j10) {
        this.startTime_ = j10;
    }

    public final void U2(String str) {
        this.logo2Pos = str;
    }

    public final void V(String str) {
        this.ctrlExt = str;
    }

    public final int V0() {
        return this.isPreload;
    }

    public final void V1(String str) {
        this.showId = str;
    }

    public final int V2() {
        return this.width_;
    }

    public final void W(String str) {
        this.appCountry = str;
    }

    public final long W0() {
        return this.startShowTime;
    }

    public final void W1(List<Om> list) {
        this.om = list;
    }

    public final void W2(int i10) {
        this.splashType = i10;
    }

    public final List<Integer> X() {
        return this.clickActionList;
    }

    public final List<FeedbackInfo> X0() {
        return this.feedbackInfoList;
    }

    public final MetaData X1() {
        String str = this.metaData_;
        if (str == null) {
            return null;
        }
        return (MetaData) y0.o(null, str, MetaData.class, new Class[0]);
    }

    public final void X2(String str) {
        this.contentDownMethod = str;
    }

    public final void Y(String str) {
        this.customData = str;
    }

    public final boolean Y0() {
        if (1 == this.isVastAd) {
            return true;
        }
        return false;
    }

    public final void Y1(int i10) {
        this.filterduplicate = i10;
    }

    public final int Y2() {
        return this.height_;
    }

    public final String Z0() {
        return this.templateId;
    }

    public final void Z1(long j10) {
        this.invalidtime_ = j10;
    }

    public final void Z2(int i10) {
        this.requestType = i10;
    }

    public final void a(int i10) {
        this.adType_ = i10;
    }

    public final String a0() {
        return this.logo2Text;
    }

    public final int a1() {
        return this.apiVer;
    }

    public final void a2(String str) {
        this.slotId_ = str;
    }

    public final void a3(String str) {
        this.webConfig = str;
    }

    public final void b() {
        this.enablePermissionView = true;
    }

    public final void b0(String str) {
        this.userId = str;
    }

    public final List<Asset> b1() {
        return this.assets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b2(List<Monitor> list) {
        EncryptionField<List<Monitor>> encryptionField = new EncryptionField<>(List.class, Monitor.class);
        encryptionField.f22473u = list;
        this.monitors = encryptionField;
    }

    public final long b3() {
        return this.updateTime_;
    }

    public final String c() {
        return this.metaData_;
    }

    public final int c0() {
        return this.landingTitleFlag;
    }

    public final TemplateData c1() {
        return this.templateData;
    }

    public final void c2(boolean z10) {
        this.isSpare = z10;
    }

    public final void c3(int i10) {
        this.useGaussianBlur = i10;
    }

    public final void d0(String str) {
        this.proDesc = str;
    }

    public final String d1() {
        return this.templateStyle;
    }

    public final int d2() {
        return this.splashPreContentFlag_;
    }

    public final void d3(String str) {
        this.ctrlSwitchs = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(String str) {
        if (this.jssdkAllowListStr == null) {
            this.jssdkAllowListStr = new EncryptionField<>();
        }
        this.jssdkAllowListStr.f22473u = str;
    }

    public final String e1() {
        return this.abilityDetailInfo;
    }

    public final void e2(int i10) {
        this.width_ = i10;
    }

    public final String e3() {
        return this.fcCtrlDate_;
    }

    public final ImageInfo f0() {
        List<ImageInfo> h02;
        MetaData metaData = (MetaData) y0.o(null, this.metaData_, MetaData.class, new Class[0]);
        if (metaData == null || (h02 = metaData.h0()) == null || h02.size() <= 0) {
            return null;
        }
        return h02.get(0);
    }

    public final String f1() {
        return this.landingType;
    }

    public final void f2(long j10) {
        this.updateTime_ = j10;
    }

    public final void f3(int i10) {
        this.splashSkipBtnDelayTime = i10;
    }

    public final void g0(String str) {
        this.landpgDlInteractionCfg = str;
    }

    public final String g1() {
        return this.privacyUrl;
    }

    public final void g2(String str) {
        this.contentId_ = str;
    }

    public final void g3(String str) {
        this.recordtaskinfo = str;
    }

    public final String h() {
        return this.contentId_;
    }

    public final VideoInfo h0() {
        MetaData metaData = (MetaData) y0.o(null, this.metaData_, MetaData.class, new Class[0]);
        if (metaData == null) {
            return null;
        }
        return metaData.K();
    }

    public final String h1() {
        return this.appPkgName;
    }

    public final void h2(List<Integer> list) {
        this.clickActionList = list;
    }

    public final void h3(int i10) {
        this.splashShowTime = i10;
    }

    public final String i() {
        return this.taskId_;
    }

    public final void i0(String str) {
        this.configMap = str;
    }

    public final String i1() {
        return this.whyThisAd;
    }

    public final void i2(boolean z10) {
        this.isInHmsTaskStack = z10;
    }

    public final void i3(String str) {
        this.uniqueId = str;
    }

    public final AppInfo j0() {
        ApkInfo k02;
        AppInfo appInfo = this.appInfo;
        if (appInfo != null) {
            appInfo.i0(this.appPkgName);
            this.appInfo.l(this.appSdkVersion);
            return this.appInfo;
        }
        MetaData metaData = (MetaData) y0.o(null, this.metaData_, MetaData.class, new Class[0]);
        if (metaData == null || (k02 = metaData.k0()) == null) {
            return null;
        }
        AppInfo appInfo2 = new AppInfo(k02);
        appInfo2.J(metaData.g0());
        appInfo2.c0(this.uniqueId);
        appInfo2.i0(this.appPkgName);
        appInfo2.l(this.appSdkVersion);
        appInfo2.q(this.appLanguage);
        appInfo2.s(this.appCountry);
        appInfo2.I(metaData.p());
        return appInfo2;
    }

    public final String j1() {
        return this.adChoiceUrl;
    }

    public final String j2() {
        return this.showId;
    }

    public final String j3() {
        return this.displayDate_;
    }

    @Override // pa.a
    public final String k() {
        return "materialId";
    }

    public final void k0(String str) {
        this.templateId = str;
    }

    public final String k1() {
        return this.adChoiceIcon;
    }

    public final void k2(int i10) {
        this.height_ = i10;
    }

    public final void k3(int i10) {
        this.isPreload = i10;
    }

    public final void l0(String str) {
        this.templateStyle = str;
    }

    public final boolean l1() {
        return this.enablePrivacyPolicyView;
    }

    public final void l2(long j10) {
        this.dispTime = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l3(String str) {
        if (this.landPageWhiteListStr == null) {
            this.landPageWhiteListStr = new EncryptionField<>();
        }
        this.landPageWhiteListStr.f22473u = str;
    }

    public final String m0() {
        return this.contentDownMethod;
    }

    public final int m1() {
        return this.sequence;
    }

    public final void m2(String str) {
        this.taskId_ = str;
    }

    public final String m3() {
        return this.splashMediaPath;
    }

    public final void n0(String str) {
        this.abilityDetailInfo = str;
    }

    public final String n1() {
        return this.appSdkVersion;
    }

    public final void n2(List<TextState> list) {
        this.textStateList = list;
    }

    public final void n3(int i10) {
        this.apiVer = i10;
    }

    public final String o0() {
        return this.webConfig;
    }

    public final String o1() {
        return this.requestId;
    }

    public final void o2(boolean z10) {
        this.isMobileDataNeedRemind = z10;
    }

    public final void o3(String str) {
        this.landingType = str;
    }

    public final void p0(String str) {
        this.hwChannelId = str;
    }

    public final String p1() {
        return this.rewardType;
    }

    public final String p2() {
        return this.slotId_;
    }

    public final String p3() {
        return this.detailUrl_;
    }

    public final String q0() {
        return this.ctrlSwitchs;
    }

    public final int q1() {
        return this.rewardAmount;
    }

    public final void q2() {
        this.isVastAd = 1;
    }

    public final void q3(int i10) {
        this.recallSource = i10;
    }

    public final void r0(String str) {
        this.wechatAppLink = str;
    }

    public final int r1() {
        return this.skipTextSize;
    }

    public final void r2(int i10) {
        this.displayCount_ = i10;
    }

    public final void r3(String str) {
        this.privacyUrl = str;
    }

    public final List<TextState> s0() {
        return this.textStateList;
    }

    public final int s1() {
        return this.skipTextHeight;
    }

    public final void s2(long j10) {
        this.startShowTime = j10;
    }

    public final int s3() {
        return this.interactiontype_;
    }

    public final int t() {
        return this.displayCount_;
    }

    public final void t0(String str) {
        this.wechatAppId = str;
    }

    public final int t1() {
        return this.splashType;
    }

    public final void t2(String str) {
        this.fcCtrlDate_ = str;
    }

    public final void t3(String str) {
        this.appPkgName = str;
    }

    public final List<String> u0() {
        return this.noReportEventList;
    }

    public final int u1() {
        return this.requestType;
    }

    public final void u2(List<String> list) {
        this.noReportEventList = list;
    }

    public final int u3() {
        return this.priority_;
    }

    public final String v0() {
        return this.recordtaskinfo;
    }

    public final String v1() {
        return this.fileCachePriority;
    }

    public final void v2(int i10) {
        this.interactiontype_ = i10;
    }

    public final void v3(String str) {
        this.whyThisAd = str;
    }

    public final void w0(String str) {
        this.templateUrl = str;
    }

    public final String w1() {
        return this.realAppPkgName;
    }

    public final void w2(String str) {
        this.displayDate_ = str;
    }

    public final void w3(String str) {
        this.adChoiceUrl = str;
    }

    public final String x0() {
        return this.uniqueId;
    }

    public final int x1() {
        return this.useGaussianBlur;
    }

    public final void x2(List<XRInfo> list) {
        this.xRInfoList = list;
    }

    public final EncryptionField<String> y0() {
        return this.landPageWhiteListStr;
    }

    public final String y1() {
        return this.isAdContainerSizeMatched;
    }

    public final void y2(int i10) {
        this.priority_ = i10;
    }

    public final void z(String str) {
        this.adChoiceIcon = str;
    }

    public final int z0() {
        return this.adType_;
    }

    public final List<XRInfo> z1() {
        return this.xRInfoList;
    }

    public final void z2(String str) {
        this.splashMediaPath = str;
    }

    public final void a(boolean z10) {
        this.autoDownloadApp = z10;
    }

    /* renamed from: c, reason: collision with other method in class */
    public final void m5c() {
        this.enablePrivacyPolicyView = true;
    }

    public final int z() {
        return this.creativeType_;
    }
}
