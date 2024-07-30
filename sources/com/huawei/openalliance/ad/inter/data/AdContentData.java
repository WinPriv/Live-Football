package com.huawei.openalliance.ad.inter.data;

import com.huawei.hms.ads.AdvertiserInfo;
import com.huawei.hms.ads.DefaultTemplate;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AdContentData implements Serializable {
    private static final long serialVersionUID = 5884097865724973073L;
    private String abilityDetailInfoEncode;
    private String adChoiceIcon;
    private String adChoiceUrl;
    private int apiVer;
    private List<Asset> assets;
    private String bannerRefSetting;
    private List<Integer> clickActionList;
    private List<AdvertiserInfo> compliance;
    private String contentDownMethod;
    private List<ContentExt> contentExts;
    private String contentId;
    private String ctrlExt;

    @y9.b
    private transient CtrlExt ctrlExtObj;
    private String ctrlSwitchs;
    private String customData;
    private DefaultTemplate defaultTemplate;
    private DelayInfo delayInfo;
    private String detailUrl;
    private int displayCount;
    private long endTime;
    private List<ImpEX> ext;
    private List<FeedbackInfo> feedbackInfoList;
    private int height;
    private String hwChannelId;
    private String intentUri;
    private InteractCfg interactCfg;
    private int interactiontype;
    private String isAdContainerSizeMatched;
    private boolean isJssdkInWhiteList;
    private boolean isLast;
    private boolean isVastAd;
    private List<JSFeedbackInfo> jsFeedbackInfos;
    private List<String> keyWords;
    private List<String> keyWordsType;
    private int landingTitleFlag;
    private long lastShowTime;
    private String logo2Pos;
    private String logo2Text;
    private String metaData;

    @y9.b
    private MetaData metaDataObj;
    private boolean needAppDownload;
    private List<Om> om;
    private List<Om> omArgs;
    private int priority;
    private String proDesc;
    private String recordtaskinfo;
    private String requestId;
    private Integer requestType;
    private int rewardAmount;
    private String rewardType;
    private int sequence;
    private String skipText;
    private int skipTextHeight;
    private String skipTextPos;
    private int skipTextSize;
    private String slotId;
    private String splashMediaPath;
    private int splashPreContentFlag;
    private long startShowTime;
    private long startTime;
    private String taskId;
    private String templateContent;
    private TemplateData templateData;
    private int templateId;
    private String templateIdV3;
    private String templateStyle;
    private String templateUrl;
    private String uniqueId;
    private int useGaussianBlur;
    private String userId;
    private String webConfig;
    private String whyThisAd;
    private int width;
    private String showId = String.valueOf(System.currentTimeMillis());
    private int sdkVer = com.huawei.hms.ads.base.a.B;
    private int showAppLogoFlag = 1;
    private int creativeType = 2;
    private int adType = -1;
    private boolean autoDownloadApp = false;
    private boolean directReturnVideoAd = false;
    private int linkedVideoMode = 0;
    private boolean isFromExSplash = false;
    private boolean isSpare = false;
    private int splashSkipBtnDelayTime = -111111;
    private int splashShowTime = -111111;
    private int recallSource = 0;
    private boolean isSupportImpCtrl = true;

    public final boolean A() {
        return this.isSupportImpCtrl;
    }

    public final String A0() {
        return this.customData;
    }

    public final String B0() {
        return this.userId;
    }

    public final int C() {
        return this.sequence;
    }

    public final String C0() {
        return this.proDesc;
    }

    public final String D() {
        return this.slotId;
    }

    public final boolean D0() {
        return this.isJssdkInWhiteList;
    }

    public final String E() {
        return this.requestId;
    }

    public final List<ImpEX> E0() {
        return this.ext;
    }

    public final void F(String str) {
        this.whyThisAd = str;
    }

    public final List<ContentExt> F0() {
        return this.contentExts;
    }

    public final void G(List<FeedbackInfo> list) {
        if (androidx.transition.n.h(list)) {
            return;
        }
        this.jsFeedbackInfos = new ArrayList();
        for (FeedbackInfo feedbackInfo : list) {
            if (feedbackInfo != null) {
                this.jsFeedbackInfos.add(new JSFeedbackInfo(feedbackInfo));
            }
        }
    }

    public final InteractCfg G0() {
        return this.interactCfg;
    }

    public final int H() {
        return this.rewardAmount;
    }

    public final long H0() {
        return this.endTime;
    }

    public final void I0(String str) {
        this.isAdContainerSizeMatched = str;
    }

    public final long J0() {
        return this.startTime;
    }

    public final MetaData K() {
        if (this.metaDataObj == null) {
            this.metaDataObj = (MetaData) gb.b.o(MetaData.class, this.metaData, new Class[0]);
        }
        return this.metaDataObj;
    }

    public final void K0(int i10) {
        this.adType = i10;
    }

    public final String L() {
        return this.contentId;
    }

    public final String L0() {
        return this.splashMediaPath;
    }

    public final String M() {
        return this.rewardType;
    }

    public final int M0() {
        return this.interactiontype;
    }

    public final void N0(String str) {
        this.logo2Text = str;
    }

    public final void O() {
        this.isSpare = true;
    }

    public final int O0() {
        return this.creativeType;
    }

    public final void P(String str) {
        this.uniqueId = str;
    }

    public final String P0() {
        return this.intentUri;
    }

    public final void Q0() {
        this.displayCount++;
        this.priority = 1;
        this.lastShowTime = System.currentTimeMillis();
    }

    public final List<String> R0() {
        return this.keyWords;
    }

    public final String S0() {
        return this.skipTextPos;
    }

    public final List<Integer> T0() {
        return this.clickActionList;
    }

    public final List<String> U() {
        return this.keyWordsType;
    }

    public final String U0() {
        return this.logo2Text;
    }

    public final void V0(String str) {
        this.customData = gb.p.i(str);
    }

    public final CtrlExt W() {
        if (this.ctrlExtObj == null) {
            this.ctrlExtObj = (CtrlExt) gb.b.o(CtrlExt.class, this.ctrlExt, new Class[0]);
        }
        return this.ctrlExtObj;
    }

    public final String W0() {
        return this.logo2Pos;
    }

    public final void X(boolean z10) {
        this.autoDownloadApp = z10;
    }

    public final void X0(String str) {
        this.userId = gb.p.i(str);
    }

    public final String Y() {
        return this.uniqueId;
    }

    public final VideoInfo Y0() {
        MetaData K = K();
        if (K != null) {
            return K.x();
        }
        return null;
    }

    public final MediaFile Z0() {
        MetaData K = K();
        if (K != null) {
            return K.K();
        }
        return null;
    }

    public final String a() {
        return this.taskId;
    }

    public final int a0() {
        return this.adType;
    }

    public final String a1() {
        return this.ctrlSwitchs;
    }

    public final int b() {
        return this.showAppLogoFlag;
    }

    public final void b0(long j10) {
        this.startShowTime = j10;
    }

    public final String b1() {
        return this.recordtaskinfo;
    }

    public final long c0() {
        return this.startShowTime;
    }

    public final AppInfo c1() {
        ApkInfo F;
        MetaData K = K();
        if (K == null || (F = K.F()) == null) {
            return null;
        }
        AppInfo appInfo = new AppInfo(F);
        appInfo.V(this.uniqueId);
        appInfo.Code(K.C());
        appInfo.s(K.u());
        return appInfo;
    }

    public final List<FeedbackInfo> d0() {
        return this.feedbackInfoList;
    }

    public final boolean d1() {
        return this.needAppDownload;
    }

    public final String e0() {
        return this.templateIdV3;
    }

    public final int f0() {
        return this.apiVer;
    }

    public final String g0() {
        return gb.p.j(this.abilityDetailInfoEncode);
    }

    public final String h() {
        return this.detailUrl;
    }

    public final String h0() {
        return this.hwChannelId;
    }

    public final List<AdvertiserInfo> i0() {
        return this.compliance;
    }

    public final int j0() {
        return this.recallSource;
    }

    public final String k() {
        return this.skipText;
    }

    public final String k0() {
        return this.whyThisAd;
    }

    public final String l0() {
        return this.adChoiceUrl;
    }

    public final String m0() {
        return this.adChoiceIcon;
    }

    public final boolean n0() {
        return this.isLast;
    }

    public final int o0() {
        return this.skipTextSize;
    }

    public final void p() {
        this.isFromExSplash = true;
    }

    public final int p0() {
        return this.skipTextHeight;
    }

    public final void q(boolean z10) {
        this.isSupportImpCtrl = z10;
    }

    public final List<Om> q0() {
        return this.omArgs;
    }

    public final void r(String str) {
        this.requestId = str;
    }

    public final String r0() {
        return this.contentDownMethod;
    }

    public final void s(List<AdvertiserInfo> list) {
        this.compliance = list;
    }

    public final int s0() {
        return this.useGaussianBlur;
    }

    public final String t0() {
        return this.isAdContainerSizeMatched;
    }

    public final String u() {
        return this.showId;
    }

    public final DelayInfo u0() {
        return this.delayInfo;
    }

    public final boolean v() {
        return this.directReturnVideoAd;
    }

    public final String v0() {
        return this.bannerRefSetting;
    }

    public final boolean w0() {
        return this.isFromExSplash;
    }

    public final int x() {
        return this.linkedVideoMode;
    }

    public final boolean x0() {
        return this.isSpare;
    }

    public final void y(String str) {
        this.showId = str;
    }

    public final int y0() {
        return this.splashSkipBtnDelayTime;
    }

    public final void z(boolean z10) {
        this.needAppDownload = z10;
    }

    public final int z0() {
        return this.splashShowTime;
    }
}
