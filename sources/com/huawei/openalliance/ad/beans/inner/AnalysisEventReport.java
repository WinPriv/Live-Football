package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.inter.data.AdContentData;

@DataKeep
/* loaded from: classes2.dex */
public class AnalysisEventReport {
    private AdContentData adData;
    private String analysisType;
    private int apiVer;
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

    public final void a(String str) {
        this.extraStr3 = str;
    }

    public final void b(String str) {
        this.contentId = str;
    }

    public final void c(int i10) {
        this.errorCode = i10;
    }

    public final void d(long j10) {
        this.expireTime = j10;
    }

    public final void e(AdContentData adContentData) {
        this.adData = adContentData;
    }

    public final void f(String str) {
        this.url = str;
    }

    public final void g(String str) {
        this.slotId = str;
    }

    public final void h(int i10) {
        this.apiVer = i10;
    }

    public final void i(long j10) {
        this.extraTime1 = j10;
    }

    public final void j(String str) {
        this.extraStr1 = str;
    }

    public final void k(String str) {
        this.templateId = str;
    }

    public final void l(int i10) {
        this.extra = i10;
    }

    public final void m(long j10) {
        this.duration = j10;
    }

    public final void n(String str) {
        this.analysisType = str;
    }

    public final void o(String str) {
        this.extraStr2 = str;
    }
}
