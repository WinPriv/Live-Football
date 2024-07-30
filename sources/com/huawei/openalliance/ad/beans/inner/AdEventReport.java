package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import java.util.List;
import y9.b;

@DataKeep
/* loaded from: classes2.dex */
public class AdEventReport {
    private String activityName;
    private int adType;
    private int apiVer;
    private Integer clickX;
    private Integer clickY;
    private String contentId;
    private String creativeSize;
    private String ctrlExt;

    @b
    private transient CtrlExt ctrlExtObj;
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
    private List<String> keyWords;
    private boolean mute;
    private boolean phyShow;
    private String requestId;
    private Integer screenOrientation;
    private Integer screenX;
    private Integer screenY;
    private Long showDuration;
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
    private int f21961x;
    private int y;
    private String showId = String.valueOf(System.currentTimeMillis());

    @b
    private boolean isFromExSplash = false;
    private int recallSource = 0;
    private boolean isSupportImpCtrl = true;

    public final void A(String str) {
        this.isAdContainerSizeMatched = str;
    }

    public final Long B() {
        return this.showDuration;
    }

    public final void C(Integer num) {
        this.clickX = num;
    }

    public final void D(String str) {
        this.customData = str;
    }

    public final void E(int i10) {
        this.f21961x = i10;
    }

    public final void F(Integer num) {
        this.source = num;
    }

    public final void G(Long l10) {
        this.startTime = l10;
    }

    public final void H(String str) {
        this.contentId = str;
    }

    public final void I(List<FeedbackInfo> list) {
        this.feedbackInfoList = list;
    }

    public final void J(boolean z10) {
        this.phyShow = z10;
    }

    public final void K(int i10) {
        this.apiVer = i10;
    }

    public final void L(Integer num) {
        this.endProgress = num;
    }

    public final void M(Long l10) {
        this.eventTime = l10;
    }

    public final void N(String str) {
        this.destination = str;
    }

    public final void O(boolean z10) {
        this.isFromExSplash = z10;
    }

    public final void P(Integer num) {
        this.screenOrientation = num;
    }

    public final void Q(String str) {
        this.creativeSize = str;
    }

    public final Long R() {
        return this.startTime;
    }

    public final void S(Integer num) {
        this.sld = num;
    }

    public final void T(String str) {
        this.templateId = str;
    }

    public final Long U() {
        return this.endTime;
    }

    public final void V(Integer num) {
        this.upX = num;
    }

    public final void W(String str) {
        this.slotId = str;
    }

    public final Integer X() {
        return this.startProgress;
    }

    public final void Y(Integer num) {
        this.upY = num;
    }

    public final void Z(String str) {
        this.slotPosition = str;
    }

    public final void a(int i10) {
        this.recallSource = i10;
    }

    public final Integer a0() {
        return this.endProgress;
    }

    public final void b(Integer num) {
        this.intentDest = num;
    }

    public final int b0() {
        return this.f21961x;
    }

    public final void c(String str) {
        this.showId = str;
    }

    public final int c0() {
        return this.y;
    }

    public final void d(Integer num) {
        this.intentFailReason = num;
    }

    public final String d0() {
        return this.destination;
    }

    public final void e(String str) {
        this.requestId = str;
    }

    public final List<String> e0() {
        return this.keyWords;
    }

    public final boolean f() {
        return this.phyShow;
    }

    public final String f0() {
        return this.customData;
    }

    public final void g(int i10) {
        this.adType = i10;
    }

    public final String g0() {
        return this.activityName;
    }

    public final void h(long j10) {
        this.startShowTime = j10;
    }

    public final boolean h0() {
        return this.isFromExSplash;
    }

    public final void i(Boolean bool) {
        this.isReportNow = bool;
    }

    public final void j(Float f) {
        this.density = f;
    }

    public final void k(Integer num) {
        this.showRatio = num;
    }

    public final void l(Long l10) {
        this.showDuration = l10;
    }

    public final void m(List<String> list) {
        this.keyWords = list;
    }

    public final void n(boolean z10) {
        this.isSupportImpCtrl = z10;
    }

    public final Integer o() {
        return this.source;
    }

    public final void p(Integer num) {
        this.screenX = num;
    }

    public final void q(String str) {
        this.activityName = str;
    }

    public final Integer r() {
        return this.showRatio;
    }

    public final void s(Integer num) {
        this.clickY = num;
    }

    public final void t(String str) {
        this.userId = str;
    }

    public final void u(int i10) {
        this.y = i10;
    }

    public final void v(Integer num) {
        this.startProgress = num;
    }

    public final void w(Long l10) {
        this.endTime = l10;
    }

    public final void x(String str) {
        this.eventType = str;
    }

    public final void y(boolean z10) {
        this.mute = z10;
    }

    public final void z(Integer num) {
        this.screenY = num;
    }
}
