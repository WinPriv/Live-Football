package com.huawei.openalliance.ad.ppskit.beans.inner;

import android.content.Context;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.ppskit.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Om;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TextState;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.provider.InnerApiProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ma.a;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class AdContentData {
    private String abilityDetailInfoEncode;
    private String adChoiceIcon;
    private String adChoiceUrl;
    private int adType;
    private int apiVer;
    private List<Asset> assets;
    private boolean autoDownloadApp;
    private String bannerRefSetting;
    private List<Integer> clickActionList;
    private List<AdvertiserInfo> compliance;
    String configMap;
    private String contentDownMethod;
    private List<ContentExt> contentExts;
    private String contentId;
    private int creativeType;
    private String ctrlExt;

    @f
    private transient CtrlExt ctrlExtObj;
    private String ctrlSwitchs;
    private DefaultTemplate defaultTemplate;
    private DelayInfo delayInfo;
    private String detailUrl;
    private boolean directReturnVideoAd;
    private int displayCount;
    private String displayDate;
    private long endTime;
    private List<ImpEX> ext;
    private String fcCtrlDate;
    private List<FeedbackInfo> feedbackInfoList;
    private Integer fileCachePriority;
    private int height;
    private String hwChannelId;
    private String intentUri;
    private InteractCfg interactCfg;
    private int interactiontype;
    private boolean isJssdkInWhiteList;
    private boolean isLast;
    private boolean isSpare;
    private boolean isVastAd;
    private List<String> keyWords;
    private List<String> keyWordsType;
    private String landPageWhiteListStr;
    private int landingTitleFlag;
    private String landingType;
    private long lastShowTime;
    private int linkedVideoMode;
    private String logo2Pos;
    private String logo2Text;

    @a
    private String metaData;

    @f
    private MetaData metaDataObj;
    private boolean needAppDownload;
    private List<String> noReportEventList;

    @f
    private List<Om> om;
    private List<Om> omArgs;
    private int priority;
    private String proDesc;
    private int recallSource;
    private String recordtaskinfo;
    private String requestId;
    private Integer requestType;
    private int rewardAmount;
    private String rewardType;
    private int sequence;
    private int showAppLogoFlag;
    private String showId;
    private String skipText;
    private int skipTextHeight;
    private String skipTextPos;
    private int skipTextSize;
    private String slotId;
    private String splashMediaPath;
    private int splashPreContentFlag;
    private int splashShowTime;
    private int splashSkipBtnDelayTime;
    private long startShowTime;
    private long startTime;
    private String taskId;
    private String templateContent;
    private TemplateData templateData;
    private int templateId;
    private String templateIdV3;
    private String templateStyle;
    private String templateUrl;
    private List<TextState> textStateList;
    private String uniqueId;
    private long updateTime;
    private int useGaussianBlur;
    private String webConfig;
    private String whyThisAd;
    private int width;

    public AdContentData() {
        HashMap hashMap = d0.f22830a;
        this.showId = String.valueOf(System.currentTimeMillis());
        this.showAppLogoFlag = 1;
        this.fcCtrlDate = "";
        this.creativeType = 2;
        this.adType = -1;
        this.autoDownloadApp = false;
        this.directReturnVideoAd = false;
        this.linkedVideoMode = 10;
        this.isLast = false;
        this.isSpare = false;
        this.splashSkipBtnDelayTime = -111111;
        this.splashShowTime = -111111;
        this.recallSource = 0;
    }

    public static AdContentData f(Context context, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return null;
        }
        AdContentData adContentData = new AdContentData();
        adContentData.showId = contentRecord.j2();
        adContentData.slotId = contentRecord.p2();
        adContentData.contentId = contentRecord.h();
        adContentData.taskId = contentRecord.i();
        adContentData.showAppLogoFlag = contentRecord.B2();
        adContentData.lastShowTime = contentRecord.F2();
        adContentData.endTime = contentRecord.J2();
        adContentData.startTime = contentRecord.N2();
        adContentData.priority = contentRecord.u3();
        adContentData.width = contentRecord.V2();
        adContentData.height = contentRecord.Y2();
        adContentData.updateTime = contentRecord.b3();
        adContentData.fcCtrlDate = contentRecord.e3();
        adContentData.displayCount = contentRecord.t();
        adContentData.displayDate = contentRecord.j3();
        adContentData.creativeType = contentRecord.z();
        String m32 = contentRecord.m3();
        String[] strArr = InnerApiProvider.f22792v;
        adContentData.splashMediaPath = a.b.a(context, m32);
        adContentData.detailUrl = contentRecord.p3();
        adContentData.interactiontype = contentRecord.s3();
        adContentData.intentUri = contentRecord.C();
        adContentData.splashPreContentFlag = contentRecord.d2();
        adContentData.adType = contentRecord.z0();
        adContentData.skipText = contentRecord.C1();
        adContentData.skipTextPos = contentRecord.U();
        adContentData.u(contentRecord.c());
        adContentData.keyWords = contentRecord.F();
        adContentData.keyWordsType = contentRecord.H();
        adContentData.logo2Text = contentRecord.a0();
        adContentData.logo2Pos = contentRecord.M();
        adContentData.landingTitleFlag = contentRecord.c0();
        adContentData.clickActionList = contentRecord.X();
        adContentData.contentDownMethod = contentRecord.m0();
        adContentData.ctrlSwitchs = contentRecord.q0();
        adContentData.textStateList = contentRecord.s0();
        adContentData.uniqueId = contentRecord.x0();
        adContentData.landingType = contentRecord.f1();
        adContentData.requestId = contentRecord.o1();
        adContentData.rewardType = contentRecord.p1();
        adContentData.rewardAmount = contentRecord.q1();
        adContentData.whyThisAd = y1.p(contentRecord.i1());
        adContentData.adChoiceUrl = y1.p(contentRecord.j1());
        adContentData.adChoiceIcon = y1.p(contentRecord.k1());
        adContentData.skipTextHeight = contentRecord.s1();
        adContentData.skipTextSize = contentRecord.r1();
        adContentData.om = contentRecord.O();
        adContentData.omArgs = contentRecord.O();
        adContentData.fileCachePriority = y1.q(contentRecord.v1());
        adContentData.useGaussianBlur = contentRecord.x1();
        adContentData.sequence = contentRecord.m1();
        adContentData.splashShowTime = contentRecord.H0();
        adContentData.splashSkipBtnDelayTime = contentRecord.B1();
        adContentData.proDesc = contentRecord.O0();
        adContentData.requestType = Integer.valueOf(contentRecord.u1());
        adContentData.ext = contentRecord.Q0();
        adContentData.contentExts = contentRecord.R0();
        adContentData.configMap = contentRecord.S0();
        adContentData.interactCfg = contentRecord.U0();
        adContentData.startShowTime = contentRecord.W0();
        adContentData.feedbackInfoList = contentRecord.X0();
        adContentData.isVastAd = contentRecord.Y0();
        adContentData.apiVer = contentRecord.a1();
        adContentData.assets = contentRecord.b1();
        adContentData.templateIdV3 = contentRecord.Z0();
        adContentData.templateData = contentRecord.c1();
        adContentData.templateUrl = contentRecord.R1();
        adContentData.templateStyle = contentRecord.d1();
        adContentData.abilityDetailInfoEncode = y1.n(contentRecord.e1());
        adContentData.hwChannelId = contentRecord.I1();
        adContentData.compliance = contentRecord.J1();
        adContentData.defaultTemplate = contentRecord.N1();
        adContentData.recallSource = contentRecord.O1();
        adContentData.ctrlExt = contentRecord.P1();
        return adContentData;
    }

    public final String A() {
        return this.slotId;
    }

    public final String B() {
        return this.contentId;
    }

    public final void C() {
        this.creativeType = 99;
    }

    public final void D(ArrayList arrayList) {
        this.assets = arrayList;
    }

    public final void E(String str) {
        this.splashMediaPath = str;
    }

    public final void F(List<AdvertiserInfo> list) {
        this.compliance = list;
    }

    public final long G() {
        return this.lastShowTime;
    }

    public final void H() {
        this.linkedVideoMode = 10;
    }

    public final int I() {
        return this.displayCount;
    }

    public final void J(String str) {
        this.uniqueId = str;
    }

    public final String K() {
        return this.splashMediaPath;
    }

    public final String L() {
        return this.detailUrl;
    }

    public final int M() {
        return this.interactiontype;
    }

    public final int N() {
        return this.priority;
    }

    public final int O() {
        return this.creativeType;
    }

    public final void P(String str) {
        this.whyThisAd = str;
    }

    public final void a(String str) {
        this.bannerRefSetting = str;
    }

    public final String b() {
        return this.logo2Text;
    }

    public final String c() {
        return this.ctrlSwitchs;
    }

    public final String d() {
        return this.landingType;
    }

    public final String e() {
        return this.requestId;
    }

    public final void g(DelayInfo delayInfo) {
        this.delayInfo = delayInfo;
    }

    public final String h() {
        return this.whyThisAd;
    }

    public final String i() {
        return this.adChoiceUrl;
    }

    public final String j() {
        return this.adChoiceIcon;
    }

    public final List<Om> k() {
        return this.om;
    }

    public final Integer l() {
        return this.fileCachePriority;
    }

    public final boolean m() {
        return this.isSpare;
    }

    public final Integer n() {
        return this.requestType;
    }

    public final int o() {
        return this.apiVer;
    }

    public final String p() {
        return this.templateIdV3;
    }

    public final List<AdvertiserInfo> q() {
        return this.compliance;
    }

    public final CtrlExt r() {
        if (this.ctrlExtObj == null) {
            this.ctrlExtObj = (CtrlExt) y0.o(null, this.ctrlExt, CtrlExt.class, new Class[0]);
        }
        return this.ctrlExtObj;
    }

    public final int s() {
        return this.adType;
    }

    public final void t() {
        this.directReturnVideoAd = true;
    }

    public final void u(String str) {
        this.metaData = str;
        this.metaDataObj = null;
    }

    public final void v(String str) {
        this.showId = str;
    }

    public final void w(boolean z10) {
        this.isLast = z10;
    }

    public final MetaData x() {
        MetaData metaData = this.metaDataObj;
        if (metaData != null) {
            return metaData;
        }
        MetaData metaData2 = (MetaData) y0.o(null, this.metaData, MetaData.class, new Class[0]);
        this.metaDataObj = metaData2;
        if (metaData2 != null) {
            if (!n.M(metaData2.h0())) {
                for (ImageInfo imageInfo : this.metaDataObj.h0()) {
                    imageInfo.k(imageInfo.g());
                }
            }
            VideoInfo K = this.metaDataObj.K();
            if (K != null) {
                K.i(K.a());
            }
        }
        return this.metaDataObj;
    }

    public final void y(long j10) {
        this.startShowTime = j10;
    }

    public final void z(boolean z10) {
        this.isJssdkInWhiteList = z10;
    }
}
