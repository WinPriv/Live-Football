package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.ArrayList;
import java.util.List;
import ma.e;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class EventRecord extends a {
    public static final String AD_TYPE = "adType";
    public static final String LAST_FAIL_REASON = "lastFailReason";
    public static final String LAST_REPORT_TIME = "lastReportTime";
    public static final String REPEATED_COUNT = "repeatedCount";
    public static final String TIME = "time";

    @e
    private String _id;
    private int adType_;
    private String agVerifyCode;
    private String appDownloadRelatedActionSource;
    private String appSdkVersion;
    private String appVersionCode;
    private String clickSuccessDestination_;
    private String contentDownMethod;
    private String contentId;
    private String creativeSize;
    private String customData;
    private String downloadDuration;
    private String downloadReason;
    private String downloadSize;
    private EncryptionField<String> ext;
    private String fullDownload;
    private String hmsVersion;
    private String impSource;
    private String installRelatedActionSource;
    private String installType;
    private String intentDest;
    private String intentFailReason;
    private String isAdContainerSizeMatched;
    private List<String> keyWords;
    private List<String> keyWordsType;
    private int landingPageType;
    private String lastFailReason;
    private String lastReportTime;
    private int opTimesInLandingPage_;
    private String packageName;
    private EncryptionField<String> paramFromServer_;
    private String playedProgress;
    private String preCheckResult;
    private List<String> preContentSuccessList;
    private int rawX_;
    private int rawY_;
    private long repeatedCount;
    private String requestId;
    private String rewardAmount;
    private String rewardType;
    private String showid_;
    private String slotId;
    private String slotPosition;
    private long time_;
    private String type_;
    private String userId;
    private String venusExt;
    private long showTimeDuration_ = -111111;
    private int maxShowRatio_ = -111111;
    private long videoPlayStartTime_ = -111111;
    private long videoPlayEndTime_ = -111111;
    private int videoPlayStartProgress_ = -111111;
    private int videoPlayEndProgress_ = -111111;
    private int requestType = 0;
    private int clickX = -111111;
    private int clickY = -111111;

    @e
    private int sld = -111111;

    @e
    private float density = -111111.0f;

    @e
    private int upX = -111111;

    @e
    private int upY = -111111;
    private long startShowTime = -111111;
    private int encodingMode = -111111;
    private int playedTime = -111111;

    public final String A() {
        return this.appDownloadRelatedActionSource;
    }

    public final int A0() {
        return this.sld;
    }

    public final List<String> A1() {
        return this.keyWords;
    }

    public final float B0() {
        return this.density;
    }

    public final void B1(String str) {
        this.downloadReason = str;
    }

    public final String C() {
        return this.installRelatedActionSource;
    }

    public final int C0() {
        return this.upX;
    }

    public final List<String> C1() {
        return this.keyWordsType;
    }

    public final void D(String str) {
        this.isAdContainerSizeMatched = str;
    }

    public final int D0() {
        return this.upY;
    }

    public final void D1(String str) {
        this.downloadSize = str;
    }

    public final void E(String str) {
        this.contentId = str;
    }

    public final String E0() {
        return this.slotPosition;
    }

    public final String E1() {
        return this.lastReportTime;
    }

    public final String F() {
        return this.impSource;
    }

    public final String F0() {
        return this.clickSuccessDestination_;
    }

    public final void F1(String str) {
        this.downloadDuration = str;
    }

    public final void G(String str) {
        this.requestId = str;
    }

    public final void G0(int i10) {
        this.videoPlayEndProgress_ = i10;
    }

    public final String G1() {
        return this.lastFailReason;
    }

    public final String H() {
        return this.appVersionCode;
    }

    public final void H0(long j10) {
        this.videoPlayStartTime_ = j10;
    }

    public final void H1(String str) {
        this.fullDownload = str;
    }

    public final void I(String str) {
        this.agVerifyCode = str;
    }

    public final void I0(Integer num) {
        this.clickY = num.intValue();
    }

    public final long I1() {
        return this.repeatedCount;
    }

    public final void J0(ArrayList arrayList) {
        this.keyWordsType = arrayList;
    }

    public final void J1(String str) {
        this.appSdkVersion = str;
    }

    public final String K() {
        return this.packageName;
    }

    public final long K0() {
        return this.videoPlayStartTime_;
    }

    public final String K1() {
        return this.contentDownMethod;
    }

    public final void L(String str) {
        this.installType = str;
    }

    public final void L0(int i10) {
        this.maxShowRatio_ = i10;
    }

    public final void L1(String str) {
        this.hmsVersion = str;
    }

    public final String M() {
        return this.appSdkVersion;
    }

    public final void M0(long j10) {
        this.videoPlayEndTime_ = j10;
    }

    public final List<String> M1() {
        return this.preContentSuccessList;
    }

    public final String N() {
        return this.slotId;
    }

    public final void N0(String str) {
        this.type_ = str;
    }

    public final String N1() {
        return this.intentDest;
    }

    public final String O() {
        return this.downloadReason;
    }

    public final long O0() {
        return this.videoPlayEndTime_;
    }

    public final void O1(String str) {
        this.customData = str;
    }

    public final void P(String str) {
        this.creativeSize = str;
    }

    public final void P0(int i10) {
        this.adType_ = i10;
    }

    public final String P1() {
        return this.intentFailReason;
    }

    public final String Q() {
        return this.rewardType;
    }

    public final void Q0(long j10) {
        this.time_ = j10;
    }

    public final void Q1(String str) {
        this.userId = str;
    }

    public final void R0(String str) {
        this.showid_ = str;
    }

    public final int S0() {
        return this.videoPlayStartProgress_;
    }

    public final void T0(int i10) {
        this.rawX_ = i10;
    }

    public final String U() {
        return this.downloadSize;
    }

    public final void U0(long j10) {
        this.repeatedCount = j10;
    }

    public final int V0() {
        return this.videoPlayEndProgress_;
    }

    public final void W(String str) {
        this.venusExt = str;
    }

    public final void W0(int i10) {
        this.rawY_ = i10;
    }

    public final String X() {
        return this.downloadDuration;
    }

    public final void X0(long j10) {
        this.startShowTime = j10;
    }

    public final void Y(String str) {
        this.playedProgress = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(String str) {
        if (this.ext == null) {
            this.ext = new EncryptionField<>();
        }
        this.ext.f22473u = str;
    }

    public final int Z0() {
        return this.maxShowRatio_;
    }

    public final void a(int i10) {
        this.videoPlayStartProgress_ = i10;
    }

    public final String a0() {
        return this.fullDownload;
    }

    public final void a1(int i10) {
        this.opTimesInLandingPage_ = i10;
    }

    public final void b0(String str) {
        this.slotPosition = str;
    }

    public final void b1(String str) {
        this.lastReportTime = str;
    }

    public final String c0() {
        return this.customData;
    }

    public final void c1(int i10) {
        this.requestType = i10;
    }

    public final String d0() {
        return this.rewardAmount;
    }

    public final void d1(String str) {
        this.lastFailReason = str;
    }

    public final int e0() {
        return this.requestType;
    }

    public final void e1(int i10) {
        this.landingPageType = i10;
    }

    public final Integer f0() {
        try {
            return Integer.valueOf(Integer.parseInt(this.isAdContainerSizeMatched));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final void f1(String str) {
        this.contentDownMethod = str;
    }

    public final String g0() {
        return this.contentId;
    }

    public final long g1() {
        return this.time_;
    }

    public final String h() {
        return this._id;
    }

    public final String h0() {
        return this.requestId;
    }

    public final void h1(String str) {
        this.intentDest = str;
    }

    public final String i() {
        return this.type_;
    }

    public final String i0() {
        return this.agVerifyCode;
    }

    public final String i1() {
        return this.showid_;
    }

    public final String j0() {
        return this.installType;
    }

    public final void j1(int i10) {
        this.playedTime = i10;
    }

    public final int k0() {
        return this.clickX;
    }

    public final void k1(String str) {
        this.intentFailReason = str;
    }

    public final int l0() {
        return this.clickY;
    }

    public final int l1() {
        return this.adType_;
    }

    public final long m0() {
        return this.showTimeDuration_;
    }

    public final void m1(int i10) {
        this.sld = i10;
    }

    public final void n0(float f) {
        this.density = f;
    }

    public final void n1(String str) {
        this.appDownloadRelatedActionSource = str;
    }

    public final void o0(long j10) {
        this.showTimeDuration_ = j10;
    }

    public final EncryptionField<String> o1() {
        return this.paramFromServer_;
    }

    public final void p0(EncryptionField<String> encryptionField) {
        this.paramFromServer_ = encryptionField;
    }

    public final void p1(int i10) {
        this.upX = i10;
    }

    public final void q0(Integer num) {
        this.clickX = num.intValue();
    }

    public final void q1(String str) {
        this.installRelatedActionSource = str;
    }

    public final void r0(String str) {
        this.clickSuccessDestination_ = str;
    }

    public final int r1() {
        return this.rawX_;
    }

    public final void s0(List<String> list) {
        this.keyWords = list;
    }

    public final void s1(int i10) {
        this.upY = i10;
    }

    public final String t0() {
        return this.creativeSize;
    }

    public final void t1(String str) {
        this.preCheckResult = str;
    }

    public final String u0() {
        return this.venusExt;
    }

    public final int u1() {
        return this.rawY_;
    }

    public final long v0() {
        return this.startShowTime;
    }

    public final void v1(String str) {
        this.impSource = str;
    }

    public final int w0() {
        return this.landingPageType;
    }

    public final int w1() {
        return this.opTimesInLandingPage_;
    }

    public final int x0() {
        return this.encodingMode;
    }

    public final void x1(String str) {
        this.appVersionCode = str;
    }

    public final int y0() {
        return this.playedTime;
    }

    public final EncryptionField<String> y1() {
        return this.ext;
    }

    public final String z0() {
        return this.playedProgress;
    }

    public final void z1(String str) {
        this.packageName = str;
    }

    public final String D() {
        return this.preCheckResult;
    }

    public final String L() {
        return this.hmsVersion;
    }

    public final String P() {
        return this.userId;
    }
}
