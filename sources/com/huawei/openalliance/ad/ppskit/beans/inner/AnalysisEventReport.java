package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class AnalysisEventReport {
    private AdContentData adData;
    private String analysisType;
    private int apiVer;
    private String appPkgName;
    private String appSdkVersion;
    private String contentId;
    private long duration;
    private int errorCode;
    private long expireTime;
    private int extra;
    private String extraStr1;
    private String extraStr2;
    private String extraStr3;
    private long extraTime1;
    private String slotId;
    private String templateId;
    private String url;

    public final String A() {
        return this.templateId;
    }

    public final String B() {
        return this.slotId;
    }

    public final int C() {
        return this.apiVer;
    }

    public final String a() {
        return this.url;
    }

    public final int b() {
        return this.errorCode;
    }

    public final void c(int i10) {
        this.extra = i10;
    }

    public final void d(long j10) {
        this.duration = j10;
    }

    public final int e() {
        return this.extra;
    }

    public final void f(int i10) {
        this.apiVer = i10;
    }

    public final void g(long j10) {
        this.extraTime1 = j10;
    }

    public final void h(String str) {
        this.extraStr1 = str;
    }

    public final AdContentData i() {
        return this.adData;
    }

    public final void j(String str) {
        this.extraStr2 = str;
    }

    public final String k() {
        return this.analysisType;
    }

    public final void l(String str) {
        this.extraStr3 = str;
    }

    public final long m() {
        return this.expireTime;
    }

    public final void n(String str) {
        this.contentId = str;
    }

    public final String o() {
        return this.extraStr1;
    }

    public final void p(String str) {
        this.appPkgName = str;
    }

    public final String q() {
        return this.extraStr2;
    }

    public final void r(String str) {
        this.appSdkVersion = str;
    }

    public final String s() {
        return this.extraStr3;
    }

    public final void t(String str) {
        this.templateId = str;
    }

    public final long u() {
        return this.duration;
    }

    public final void v(String str) {
        this.slotId = str;
    }

    public final long w() {
        return this.extraTime1;
    }

    public final String x() {
        return this.contentId;
    }

    public final String y() {
        return this.appPkgName;
    }

    public final String z() {
        return this.appSdkVersion;
    }
}
