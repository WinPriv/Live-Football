package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class AdEvent {
    private String agVerifyCode;
    private Integer appDownloadRelatedActionSource;
    private String appSdkVersion;
    private String appVersionCode;
    private String clickSuccessDestination;
    private Integer clickX;
    private Integer clickY;
    private List<String> closeReason;
    private List<String> closeReasonType;
    private Integer contentDownMethod;
    private String creativeSize;
    private String customData;
    private Integer downloadDuration;
    private Integer downloadReason;
    private Long downloadSize;
    private Integer encodingMode;

    @a
    private String ext;
    private Integer fullDownload;
    private String hmsVersion;
    private Integer impSource;
    private Integer installRelatedActionSource;
    private String installType;
    private Integer intentDestination;
    private Integer intentFailReason;
    private Integer isAdContainerSizeMatched;
    private int landingPageType;
    private String lastFailReason;
    private String lastReportTime;
    private Integer maxShowRatio;
    private int opTimesInLandingPage;

    @a
    private ParamFromServer paramfromserver;
    private String playedProgress;
    private Integer playedTime;
    private Integer preCheckResult;
    private List<String> preContentSuccessList;
    private int rawX;
    private int rawY;
    private long repeatedCount;
    private Integer requestType;
    private String rewardAmount;
    private String rewardType;

    @a
    private String riskToken;
    private String seq;
    private Long showTimeDuration;
    private String showid;
    private String slotId;
    private String slotPosition;
    private Long startShowTime;
    private long time;
    private String type;
    private String userId;

    @a
    private String venusExt;
    private Integer videoPlayEndProgress;
    private Long videoPlayEndTime;
    private Integer videoPlayStartProgress;
    private Long videoPlayStartTime;

    public final void A(String str) {
        this.lastReportTime = str;
    }

    public final void B(Integer num) {
        this.appDownloadRelatedActionSource = num;
    }

    public final void C(String str) {
        this.lastFailReason = str;
    }

    public final void D(Integer num) {
        this.installRelatedActionSource = num;
    }

    public final void E(String str) {
        this.appVersionCode = str;
    }

    public final String F() {
        return this.type;
    }

    public final void G(Integer num) {
        this.preCheckResult = num;
    }

    public final void H(String str) {
        this.hmsVersion = str;
    }

    public final void I(Integer num) {
        this.impSource = num;
    }

    public final void J(String str) {
        this.appSdkVersion = str;
    }

    public final void K(Integer num) {
        this.downloadDuration = num;
    }

    public final void L(String str) {
        this.slotId = str;
    }

    public final void M(Integer num) {
        this.fullDownload = num;
    }

    public final void N(String str) {
        this.customData = str;
    }

    public final void O(Integer num) {
        this.downloadReason = num;
    }

    public final void P(String str) {
        this.userId = str;
    }

    public final void Q(Integer num) {
        this.requestType = num;
    }

    public final void R(String str) {
        this.rewardType = str;
    }

    public final void S(Integer num) {
        this.isAdContainerSizeMatched = num;
    }

    public final void T(String str) {
        this.rewardAmount = str;
    }

    public final void U(Integer num) {
        this.clickX = num;
    }

    public final void V(String str) {
        this.riskToken = str;
    }

    public final void W(Integer num) {
        this.clickY = num;
    }

    public final void X(String str) {
        this.agVerifyCode = str;
    }

    public final void Y(Integer num) {
        this.encodingMode = num;
    }

    public final void Z(String str) {
        this.installType = str;
    }

    public final void a(int i10) {
        this.rawX = i10;
    }

    public final void a0(Integer num) {
        this.playedTime = num;
    }

    public final void b(long j10) {
        this.time = j10;
    }

    public final void b0(String str) {
        this.creativeSize = str;
    }

    public final void c(ParamFromServer paramFromServer) {
        this.paramfromserver = paramFromServer;
    }

    public final void c0(String str) {
        this.venusExt = str;
    }

    public final void d(Integer num) {
        this.maxShowRatio = num;
    }

    public final void d0(String str) {
        this.playedProgress = str;
    }

    public final void e(Long l10) {
        this.showTimeDuration = l10;
    }

    public final void e0(String str) {
        this.slotPosition = str;
    }

    public final void f(String str) {
        this.clickSuccessDestination = str;
    }

    public final void g(List<String> list) {
        if (list != null && list.size() > 0) {
            this.closeReason = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.closeReason.add(y1.n(it.next()));
            }
        }
    }

    public final void h(int i10) {
        this.rawY = i10;
    }

    public final void i(long j10) {
        this.repeatedCount = j10;
    }

    public final void j(Integer num) {
        this.videoPlayStartProgress = num;
    }

    public final void k(Long l10) {
        this.videoPlayStartTime = l10;
    }

    public final void l(String str) {
        this.showid = str;
    }

    public final void m(List<String> list) {
        if (list != null && list.size() > 0) {
            this.closeReasonType = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.closeReasonType.add(y1.n(it.next()));
            }
        }
    }

    public final void n(int i10) {
        this.opTimesInLandingPage = i10;
    }

    public final void o(Integer num) {
        this.videoPlayEndProgress = num;
    }

    public final void p(Long l10) {
        this.videoPlayEndTime = l10;
    }

    public final void q(String str) {
        this.type = str;
    }

    public final void r(List<String> list) {
        this.preContentSuccessList = list;
    }

    public final void s(int i10) {
        this.landingPageType = i10;
    }

    public final void t(Integer num) {
        this.contentDownMethod = num;
    }

    public final void u(Long l10) {
        this.downloadSize = l10;
    }

    public final void v(String str) {
        this.seq = str;
    }

    public final void w(Integer num) {
        this.intentDestination = num;
    }

    public final void x(Long l10) {
        this.startShowTime = l10;
    }

    public final void y(String str) {
        this.ext = str;
    }

    public final void z(Integer num) {
        this.intentFailReason = num;
    }
}
