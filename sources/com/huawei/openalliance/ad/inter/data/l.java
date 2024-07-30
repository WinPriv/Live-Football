package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.constant.bw;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class l implements Serializable {
    public final long A;
    public String B;

    /* renamed from: s, reason: collision with root package name */
    public final String f22282s;

    /* renamed from: t, reason: collision with root package name */
    public final String f22283t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22284u;

    /* renamed from: v, reason: collision with root package name */
    public final int f22285v;

    /* renamed from: w, reason: collision with root package name */
    public final String f22286w;

    /* renamed from: x, reason: collision with root package name */
    public String f22287x = "y";
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f22288z;

    public l(MediaFile mediaFile, long j10) {
        this.f22284u = 0;
        this.f22285v = 0;
        this.f22282s = mediaFile.q();
        this.f22283t = mediaFile.k();
        this.y = mediaFile.v();
        this.f22284u = mediaFile.x();
        this.f22285v = mediaFile.u();
        this.f22286w = mediaFile.p();
        this.f22288z = mediaFile.r();
        this.A = j10;
    }

    public final boolean k() {
        String str = this.f22283t;
        if (str != null && str.startsWith(bw.CONTENT.toString())) {
            return true;
        }
        String str2 = this.B;
        if (str2 != null && str2.startsWith(bw.CONTENT.toString())) {
            return true;
        }
        return false;
    }

    public final String p() {
        String str = this.f22283t;
        if (str != null && str.startsWith(bw.CONTENT.toString())) {
            return str;
        }
        return this.B;
    }
}
