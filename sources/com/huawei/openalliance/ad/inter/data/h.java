package com.huawei.openalliance.ad.inter.data;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.constant.bw;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final String f22260s;

    /* renamed from: t, reason: collision with root package name */
    public final int f22261t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22262u;

    /* renamed from: v, reason: collision with root package name */
    public final String f22263v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f22264w;

    public h() {
        this.f22261t = 0;
        this.f22262u = 0;
    }

    public h(ImageInfo imageInfo) {
        this.f22261t = 0;
        this.f22262u = 0;
        if (imageInfo != null) {
            this.f22260s = imageInfo.u();
            String u2 = imageInfo.u();
            if (!TextUtils.isEmpty(u2) && !u2.startsWith(bw.HTTP.toString())) {
                u2.startsWith(bw.HTTPS.toString());
            }
            this.f22261t = imageInfo.A();
            this.f22262u = imageInfo.k();
            this.f22263v = imageInfo.q();
            this.f22264w = imageInfo.v() == 0;
        }
    }
}
