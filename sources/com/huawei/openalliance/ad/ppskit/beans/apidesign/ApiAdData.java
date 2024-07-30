package com.huawei.openalliance.ad.ppskit.beans.apidesign;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ParamFromServer;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class ApiAdData {
    private int atp;
    private String cid;
    private String crid;
    private int crt;
    private String cts;
    private Long edt;
    private int ldt;
    private String lpwl;
    private List<ApiMonitor> mt;

    @a
    private ApiMetaData mtd;
    private String pkg;
    private ParamFromServer ps;
    private String stid;
    private String tkid;
    private String tkif;
    private Long tt;
    private String wcg;
    private String wxid;
    private String wxl;

    public final String a() {
        return this.cid;
    }

    public final String b() {
        return this.crid;
    }

    public final int c() {
        return this.atp;
    }

    public final int d() {
        return this.crt;
    }

    public final String e() {
        return this.stid;
    }

    public final Long f() {
        return this.edt;
    }

    public final ParamFromServer g() {
        return this.ps;
    }

    public final ApiMetaData h() {
        return this.mtd;
    }

    public final String i() {
        return this.tkid;
    }

    public final List<ApiMonitor> j() {
        return this.mt;
    }

    public final int k() {
        return this.ldt;
    }

    public final String l() {
        return this.wcg;
    }

    public final String m() {
        return this.cts;
    }

    public final String n() {
        return this.tkif;
    }

    public final String o() {
        return this.lpwl;
    }

    public final Long p() {
        return this.tt;
    }

    public final String q() {
        return this.pkg;
    }

    public final String r() {
        return this.wxl;
    }

    public final String s() {
        return this.wxid;
    }
}
