package com.huawei.openalliance.ad.inter.data;

import android.text.TextUtils;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p implements Serializable {
    public final int A;
    public final int B;
    public final int C;
    public Float D;

    /* renamed from: s, reason: collision with root package name */
    public String f22303s;

    /* renamed from: t, reason: collision with root package name */
    public final int f22304t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22305u;

    /* renamed from: v, reason: collision with root package name */
    public final String f22306v;

    /* renamed from: w, reason: collision with root package name */
    public final int f22307w;

    /* renamed from: x, reason: collision with root package name */
    public final int f22308x;

    /* renamed from: z, reason: collision with root package name */
    public String f22309z;
    public int y = 0;
    public boolean E = false;

    public p(VideoInfo videoInfo) {
        this.f22306v = "y";
        this.f22308x = 200;
        this.f22309z = "n";
        this.A = 1;
        this.B = 100;
        this.C = 90;
        if (videoInfo != null) {
            this.f22303s = videoInfo.q();
            this.f22304t = videoInfo.u();
            this.f22305u = videoInfo.x();
            if (!TextUtils.equals(videoInfo.k(), "y") && !TextUtils.equals(videoInfo.k(), "a")) {
                this.f22306v = "n";
            } else {
                this.f22306v = "y";
            }
            String p10 = videoInfo.p();
            this.f22308x = videoInfo.v();
            this.A = videoInfo.r();
            this.f22309z = p10;
            if (videoInfo.A() != null) {
                this.B = videoInfo.A().intValue();
            }
            if (videoInfo.C() != null) {
                this.C = videoInfo.C().intValue();
            }
            if (TextUtils.equals(videoInfo.k(), "a")) {
                this.f22307w = 1;
            } else {
                this.f22307w = 0;
            }
            "y".equalsIgnoreCase(videoInfo.F());
            Float E = videoInfo.E();
            if (E == null) {
                E = null;
            } else if (E.floatValue() <= gl.Code) {
                E = Float.valueOf(1.7777778f);
            }
            this.D = E;
        }
    }
}
