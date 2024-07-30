package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class Options {
    private String adRating;
    private Integer coppa;
    private Integer tfua;

    public final void a(Integer num) {
        this.coppa = num;
    }

    public final void b(String str) {
        this.adRating = str;
    }

    public final void c(Integer num) {
        this.tfua = num;
    }

    public final boolean d() {
        if (this.coppa == null && this.tfua == null && this.adRating == null) {
            return false;
        }
        return true;
    }
}
