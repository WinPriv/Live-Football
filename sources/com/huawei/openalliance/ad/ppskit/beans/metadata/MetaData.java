package com.huawei.openalliance.ad.ppskit.beans.metadata;

import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class MetaData extends RspBean {
    private String adSign;
    private List<AdSource> adSources;
    private ApkInfo apkInfo;
    private String appPromotionChannel;

    @a
    private String clickUrl;
    private String cta;
    private String description;
    private String dwnParameter;
    private List<ImageInfo> icon;
    private List<ImageInfo> imageInfo;
    private int insreTemplate;

    @a
    private String intent;
    private int isPreload;
    private String label;
    private String landingPageStyle;
    private String landingPageType;
    private String marketAppId;
    private MediaFile mediaFile;
    private List<MediaFile> mediaFiles;
    private String privacyUrl;
    private PromoteInfo promoteInfo;
    private String rewardCriterion;
    private List<String> schemeInfo;
    private String screenOrientation;
    private ShareInfo shareInfo;
    private Integer showAppElement;
    private String templateId;
    private List<TextState> textStateList;
    private ImageInfo thumbNail;
    private String title;
    private String vastInfo;
    private VideoInfo videoInfo;
    private long minEffectiveShowTime = 500;
    private int minEffectiveShowRatio = 50;
    private long duration = 0;
    private List<XRInfo> xRInfo = new ArrayList();

    public final String A() {
        return this.vastInfo;
    }

    public final List<AdSource> C() {
        return this.adSources;
    }

    public final ArrayList E() {
        ArrayList arrayList = new ArrayList();
        VideoInfo videoInfo = this.videoInfo;
        if (videoInfo != null) {
            arrayList.add(videoInfo.f());
        }
        return arrayList;
    }

    public final ArrayList F() {
        ArrayList arrayList = new ArrayList();
        if (!n.M(this.imageInfo)) {
            Iterator<ImageInfo> it = this.imageInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().i());
            }
        }
        return arrayList;
    }

    public final void G(ApkInfo apkInfo) {
        this.apkInfo = apkInfo;
    }

    public final void H(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }

    public final void I(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public final void J(List<ImageInfo> list) {
        this.icon = list;
    }

    public final VideoInfo K() {
        return this.videoInfo;
    }

    public final void L(long j10) {
        this.duration = j10;
    }

    public final void M(String str) {
        this.title = str;
    }

    public final void N(List<ImageInfo> list) {
        this.imageInfo = list;
    }

    public final void O(String str) {
        this.description = str;
    }

    public final void P(String str) {
        this.clickUrl = str;
    }

    public final void Q(List<MediaFile> list) {
        this.mediaFiles = list;
    }

    public final List<ImageInfo> U() {
        return this.icon;
    }

    public final void W(String str) {
        this.label = str;
    }

    public final void X(List<XRInfo> list) {
        this.xRInfo = list;
    }

    public final String Y() {
        return this.clickUrl;
    }

    public final String a() {
        return this.cta;
    }

    public final void a0() {
        this.schemeInfo = null;
    }

    public final long b0() {
        return this.minEffectiveShowTime;
    }

    public final String c() {
        return this.title;
    }

    public final void c0(ArrayList arrayList) {
        this.adSources = arrayList;
    }

    public final String d() {
        return this.description;
    }

    public final int d0() {
        return this.minEffectiveShowRatio;
    }

    public final void e0(String str) {
        this.intent = str;
    }

    public final String f0() {
        return this.marketAppId;
    }

    public final String g0() {
        return this.intent;
    }

    public final List<ImageInfo> h0() {
        return this.imageInfo;
    }

    public final String i() {
        return this.label;
    }

    public final void i0(String str) {
        this.landingPageType = str;
    }

    public final String j() {
        return this.appPromotionChannel;
    }

    public final void j0(String str) {
        this.privacyUrl = str;
    }

    public final String k() {
        return this.landingPageStyle;
    }

    public final ApkInfo k0() {
        return this.apkInfo;
    }

    public final void l0(String str) {
        this.dwnParameter = str;
    }

    public final void m0() {
        this.vastInfo = null;
    }

    public final String n0() {
        return this.adSign;
    }

    public final MediaFile o0() {
        return this.mediaFile;
    }

    public final String p() {
        return this.privacyUrl;
    }

    public final List<TextState> p0() {
        return this.textStateList;
    }

    public final List<XRInfo> q() {
        return this.xRInfo;
    }

    public final List<MediaFile> q0() {
        return this.mediaFiles;
    }

    public final List<String> r() {
        return this.schemeInfo;
    }

    public final long r0() {
        return this.duration;
    }

    public final String s0() {
        return this.rewardCriterion;
    }

    public final String t0() {
        return this.screenOrientation;
    }

    public final int u() {
        return this.insreTemplate;
    }

    public final String u0() {
        return this.landingPageType;
    }

    public final int v() {
        return this.isPreload;
    }

    public final String x() {
        return this.dwnParameter;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m4a() {
        this.thumbNail = null;
    }
}
