package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class PoiInfo {
    private String admin;
    private String country;
    private String locality;

    public final void a(String str) {
        this.country = str;
    }

    public final void b(String str) {
        this.admin = str;
    }

    public final void c(String str) {
        this.locality = str;
    }
}
