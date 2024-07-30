package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import java.util.HashMap;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AdEventReport {
    private String activityName;
    private int adType;
    private int apiVer;
    private String appPkgName;
    private String appSdkVersion;
    private Integer clickX;
    private Integer clickY;
    private String contentId;
    private String creativeSize;
    private String ctrlExt;
    private CtrlExt ctrlExtObj;
    private String customData;
    private Float density;
    private String destination;
    private Integer endProgress;
    private Long endTime;
    private Long eventTime;
    private String eventType;
    private List<FeedbackInfo> feedbackInfoList;
    private Integer intentDest;
    private Integer intentFailReason;
    private String isAdContainerSizeMatched;
    private Boolean isReportNow;
    private Boolean isSupportImpCtrl;
    private List<String> keyWords;
    private int landingPageType;
    private boolean mute;
    private Boolean onlySample;
    private int opTimes;
    private boolean phyShow;
    private Integer playedProgress;
    private Integer playedTime;
    private String requestId;
    private Integer screenOrientation;
    private Integer screenX;
    private Integer screenY;
    private Long showDuration;
    private String showId;
    private Integer showRatio;
    private Integer sld;
    private String slotId;
    private String slotPosition;
    private Integer source;
    private Integer startProgress;
    private long startShowTime;
    private Long startTime;
    private String templateId;
    private Integer upX;
    private Integer upY;
    private String userId;

    /* renamed from: x, reason: collision with root package name */
    private int f22454x;
    private int y;

    public AdEventReport() {
        HashMap hashMap = d0.f22830a;
        this.showId = String.valueOf(System.currentTimeMillis());
    }

    public final void A(Boolean bool) {
        this.isReportNow = bool;
    }

    public final void A0(String str) {
        this.slotId = str;
    }

    public final void B(Float f) {
        this.density = f;
    }

    public final String B0() {
        return this.destination;
    }

    public final void C(Integer num) {
        this.showRatio = num;
    }

    public final void C0(Integer num) {
        this.upX = num;
    }

    public final void D(Long l10) {
        this.showDuration = l10;
    }

    public final void D0(String str) {
        this.slotPosition = str;
    }

    public final void E(String str) {
        this.contentId = str;
    }

    public final List<String> E0() {
        return this.keyWords;
    }

    public final void F(boolean z10) {
        this.phyShow = z10;
    }

    public final void F0(Integer num) {
        this.upY = num;
    }

    public final int G() {
        return this.adType;
    }

    public final Integer G0() {
        return this.intentDest;
    }

    public final void H(int i10) {
        this.f22454x = i10;
    }

    public final Integer H0() {
        return this.intentFailReason;
    }

    public final void I(Boolean bool) {
        this.onlySample = bool;
    }

    public final String I0() {
        return this.showId;
    }

    public final void J(Integer num) {
        this.source = num;
    }

    public final String J0() {
        return this.appPkgName;
    }

    public final void K(Long l10) {
        this.startTime = l10;
    }

    public final String K0() {
        return this.appSdkVersion;
    }

    public final void L(String str) {
        this.eventType = str;
    }

    public final int L0() {
        return this.opTimes;
    }

    public final void M(boolean z10) {
        this.mute = z10;
    }

    public final String M0() {
        return this.requestId;
    }

    public final void N() {
        this.isSupportImpCtrl = Boolean.TRUE;
    }

    public final String N0() {
        return this.customData;
    }

    public final void O(int i10) {
        this.y = i10;
    }

    public final String O0() {
        return this.userId;
    }

    public final void P(Integer num) {
        this.startProgress = num;
    }

    public final String P0() {
        return this.activityName;
    }

    public final void Q(Long l10) {
        this.endTime = l10;
    }

    public final void R(String str) {
        this.destination = str;
    }

    public final boolean S() {
        return this.phyShow;
    }

    public final Long T() {
        return this.showDuration;
    }

    public final void U(int i10) {
        this.opTimes = i10;
    }

    public final void V(Integer num) {
        this.endProgress = num;
    }

    public final void W(String str) {
        this.showId = str;
    }

    public final Integer X() {
        return this.showRatio;
    }

    public final void Y(int i10) {
        this.landingPageType = i10;
    }

    public final void Z(Integer num) {
        this.intentDest = num;
    }

    public final String a() {
        return this.isAdContainerSizeMatched;
    }

    public final void a0(String str) {
        this.appPkgName = str;
    }

    public final Boolean b() {
        return this.isReportNow;
    }

    public final Integer b0() {
        return this.source;
    }

    public final Integer c() {
        return this.clickX;
    }

    public final void c0(int i10) {
        this.apiVer = i10;
    }

    public final Integer d() {
        return this.clickY;
    }

    public final void d0(Integer num) {
        this.intentFailReason = num;
    }

    public final String e() {
        return this.creativeSize;
    }

    public final void e0(String str) {
        this.appSdkVersion = str;
    }

    public final Long f() {
        return this.eventTime;
    }

    public final void f0(Integer num) {
        this.clickX = num;
    }

    public final Integer g() {
        return this.screenX;
    }

    public final void g0(String str) {
        this.requestId = str;
    }

    public final Integer h() {
        return this.screenY;
    }

    public final boolean h0() {
        return this.mute;
    }

    public final Integer i() {
        return this.screenOrientation;
    }

    public final String i0() {
        return this.eventType;
    }

    public final Boolean j() {
        return this.onlySample;
    }

    public final void j0(Integer num) {
        this.clickY = num;
    }

    public final long k() {
        return this.startShowTime;
    }

    public final void k0(String str) {
        this.customData = str;
    }

    public final List<FeedbackInfo> l() {
        return this.feedbackInfoList;
    }

    public final Long l0() {
        return this.startTime;
    }

    public final int m() {
        return this.apiVer;
    }

    public final void m0(Integer num) {
        this.screenX = num;
    }

    public final String n() {
        return this.templateId;
    }

    public final Long n0() {
        return this.endTime;
    }

    public final String o() {
        return this.slotId;
    }

    public final void o0(Integer num) {
        this.screenY = num;
    }

    public final Integer p() {
        return this.playedTime;
    }

    public final void p0(String str) {
        this.activityName = str;
    }

    public final Integer q() {
        return this.playedProgress;
    }

    public final Integer q0() {
        return this.startProgress;
    }

    public final Integer r() {
        return this.sld;
    }

    public final void r0(Integer num) {
        this.screenOrientation = num;
    }

    public final Integer s() {
        return this.upX;
    }

    public final Integer s0() {
        return this.endProgress;
    }

    public final Integer t() {
        return this.upY;
    }

    public final void t0(Integer num) {
        this.playedTime = num;
    }

    public final Float u() {
        return this.density;
    }

    public final void u0(String str) {
        this.creativeSize = str;
    }

    public final String v() {
        return this.slotPosition;
    }

    public final int v0() {
        return this.f22454x;
    }

    public final boolean w() {
        Boolean bool = this.isSupportImpCtrl;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final void w0(Integer num) {
        this.playedProgress = num;
    }

    public final String x() {
        return this.contentId;
    }

    public final void x0(String str) {
        this.templateId = str;
    }

    public final void y(int i10) {
        this.adType = i10;
    }

    public final int y0() {
        return this.y;
    }

    public final void z(long j10) {
        this.startShowTime = j10;
    }

    public final void z0(Integer num) {
        this.sld = num;
    }
}
