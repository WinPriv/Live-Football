package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.beans.metadata.MetaData;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends c {
    public String A;
    public String E;
    public p G;
    public List<String> H;
    public List<String> J;
    public AppInfo K;
    public List<Integer> L;
    public String M;
    public String N;
    public String O;

    /* renamed from: s, reason: collision with root package name */
    public int f22265s;

    /* renamed from: t, reason: collision with root package name */
    public String f22266t;

    /* renamed from: u, reason: collision with root package name */
    public MetaData f22267u;

    /* renamed from: v, reason: collision with root package name */
    public String f22268v;

    /* renamed from: w, reason: collision with root package name */
    public String f22269w;

    /* renamed from: x, reason: collision with root package name */
    public String f22270x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public int f22271z;

    public i(AdContentData adContentData) {
        super(adContentData);
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final String A() {
        return this.M;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final String D() {
        return this.f22268v;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final void I(String str) {
        this.V = str;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final String L() {
        return this.f22266t;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final String O() {
        return this.V;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final int b() {
        return this.f22265s;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final String d() {
        return this.f22269w;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final MetaData h_() {
        return this.f22267u;
    }

    public final void l(AdContentData adContentData) {
        this.Code = adContentData;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final String n() {
        return this.N;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c
    public final String p() {
        return this.O;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final long s() {
        return this.y;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final int t() {
        return this.f22271z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.c, com.huawei.openalliance.ad.inter.data.d
    public final AppInfo w() {
        return this.K;
    }
}
