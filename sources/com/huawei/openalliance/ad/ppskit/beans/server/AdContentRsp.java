package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Ad30;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdTypeEvent;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Precontent;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SiteAd;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Template;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.parameter.RequestOptions;
import java.util.List;
import java.util.Map;
import ma.a;
import ma.d;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class AdContentRsp extends RspBean {

    @f
    private long adFilterDuration;
    private Integer apiVer;

    @f
    private String appCountry;

    @f
    private String appLanguage;
    private String cost;

    @Deprecated
    private int dsp1cost;

    @Deprecated
    private int dspcost;

    @f
    private Map<String, Integer> filterResultMap;
    private List<String> invalidSloganId;
    private List<String> invalidcontentid;
    private List<SiteAd> multiSiteAd;
    private List<Ad30> multiad;
    private List<AdTypeEvent> noReportAdTypeEventList;

    @a
    private String ppsStore;
    private List<Precontent> premulticontent;

    @f
    private String realAppPkgName;
    private String reason;

    @d(a = "clientAdRequestId")
    private String requestId;
    private List<Template> templates;
    private List<String> todayNoShowContentid;
    private int retcode = -1;
    private int totalCacheSize = 800;
    private int adPreloadInterval = 0;

    @f
    private int requestType = 0;

    public final List<Precontent> A() {
        return this.premulticontent;
    }

    public final List<AdTypeEvent> C() {
        return this.noReportAdTypeEventList;
    }

    public final int E() {
        return this.adPreloadInterval;
    }

    public final int F() {
        int i10 = this.dspcost;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    public final int G() {
        int i10 = this.dsp1cost;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    public final String H() {
        return this.realAppPkgName;
    }

    public final String K() {
        return this.appLanguage;
    }

    public final String O() {
        return this.appCountry;
    }

    public final String U() {
        return this.cost;
    }

    public final Map<String, Integer> W() {
        return this.filterResultMap;
    }

    public final long X() {
        return this.adFilterDuration;
    }

    public final int Y() {
        return this.requestType;
    }

    public final int b() {
        return this.retcode;
    }

    public final String c() {
        return this.reason;
    }

    public final String i() {
        return this.ppsStore;
    }

    public final AdContentRsp k() {
        AdContentRsp adContentRsp = new AdContentRsp();
        adContentRsp.retcode = this.retcode;
        adContentRsp.reason = this.reason;
        adContentRsp.multiad = this.multiad;
        adContentRsp.invalidcontentid = this.invalidcontentid;
        adContentRsp.invalidSloganId = this.invalidSloganId;
        adContentRsp.todayNoShowContentid = this.todayNoShowContentid;
        adContentRsp.premulticontent = this.premulticontent;
        adContentRsp.ppsStore = this.ppsStore;
        adContentRsp.templates = this.templates;
        adContentRsp.totalCacheSize = this.totalCacheSize;
        adContentRsp.noReportAdTypeEventList = this.noReportAdTypeEventList;
        adContentRsp.adPreloadInterval = this.adPreloadInterval;
        adContentRsp.requestId = this.requestId;
        adContentRsp.dspcost = this.dspcost;
        adContentRsp.dsp1cost = this.dsp1cost;
        adContentRsp.requestType = this.requestType;
        adContentRsp.cost = this.cost;
        adContentRsp.apiVer = this.apiVer;
        return adContentRsp;
    }

    public final void l(long j10) {
        this.adFilterDuration = j10;
    }

    public final void m(AdSlotParam adSlotParam) {
        RequestOptions V = adSlotParam.V();
        if (V != null) {
            this.appLanguage = V.h();
            this.appCountry = V.i();
        }
    }

    public final void n(List<Ad30> list) {
        this.multiad = list;
    }

    public final void o(Map<String, Integer> map) {
        this.filterResultMap = map;
    }

    public final void p(String str) {
        this.requestId = str;
    }

    public final List<Ad30> q() {
        return this.multiad;
    }

    public final void r(String str) {
        this.realAppPkgName = str;
    }

    public final List<String> u() {
        return this.invalidcontentid;
    }

    public final void v(int i10) {
        this.requestType = i10;
    }

    public final List<String> x() {
        return this.todayNoShowContentid;
    }

    public final List<Template> l() {
        return this.templates;
    }

    public final String n() {
        return this.requestId;
    }
}
