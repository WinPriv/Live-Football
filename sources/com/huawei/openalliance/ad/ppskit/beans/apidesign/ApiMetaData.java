package com.huawei.openalliance.ad.ppskit.beans.apidesign;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class ApiMetaData {
    private ApiApkInfo apif;
    private List<ApiAdSourceInfo> asif;

    @a
    private String cu;
    private String dpr;
    private List<ApiImageInfo> imif;

    @a
    private String itnt;
    private String lpt;
    private String pvu;
    private ApiVideoInfo vdif;

    public final String a() {
        return this.cu;
    }

    public final List<ApiImageInfo> b() {
        return this.imif;
    }

    public final ApiVideoInfo c() {
        return this.vdif;
    }

    public final ApiApkInfo d() {
        return this.apif;
    }

    public final String e() {
        return this.lpt;
    }

    public final String f() {
        return this.pvu;
    }

    public final String g() {
        return this.itnt;
    }

    public final List<ApiAdSourceInfo> h() {
        return this.asif;
    }

    public final String i() {
        return this.dpr;
    }
}
