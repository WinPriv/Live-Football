package com.huawei.openalliance.ad.ppskit.beans.openrtb;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class Image implements Serializable {
    private static final long serialVersionUID = -8414679420743760437L;

    @d(a = "Ext")
    private ImageExt ext;

    @d(a = "H")
    private int height;
    private String localPath;
    private String url;

    @d(a = "W")
    private int width;

    public final String a() {
        return this.url;
    }

    public final int b() {
        return this.width;
    }

    public final void c(int i10) {
        this.height = i10;
    }

    public final void d(String str) {
        this.localPath = str;
    }

    public final int k() {
        return this.height;
    }

    public final ImageExt p() {
        return this.ext;
    }

    public final void a(int i10) {
        this.width = i10;
    }
}
