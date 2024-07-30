package com.huawei.openalliance.ad.ppskit.inter.data;

import android.text.TextUtils;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import java.io.Serializable;

@OuterVisible
/* loaded from: classes2.dex */
public class VideoInfo implements Serializable {
    public final String A;
    public int B;
    public String C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public int H;
    public Float I;
    public final boolean J;
    public boolean K;

    /* renamed from: s, reason: collision with root package name */
    public String f22645s;

    /* renamed from: t, reason: collision with root package name */
    public final String f22646t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22647u;

    /* renamed from: v, reason: collision with root package name */
    public final int f22648v;

    /* renamed from: w, reason: collision with root package name */
    public String f22649w;

    /* renamed from: x, reason: collision with root package name */
    public final int f22650x;
    public final String y;

    /* renamed from: z, reason: collision with root package name */
    public final int f22651z;

    @OuterVisible
    public VideoInfo() {
        this.f22649w = "y";
        this.y = "n";
        this.f22651z = 200;
        this.B = 0;
        this.C = "n";
        this.D = 1;
        this.F = 100;
        this.G = 90;
        this.H = 0;
        this.J = true;
        this.K = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r14) {
        /*
            r13 = this;
            r0 = 1
            r1 = 2
            int r2 = r13.D
            if (r1 == r2) goto L6c
            boolean r1 = r13.K
            if (r1 == 0) goto Lc
            goto L6c
        Lc:
            r1 = 0
            if (r0 != r2) goto L6b
            java.lang.String r2 = r13.f22645s
            r3 = 209715200(0xc800000, float:1.9721523E-31)
            long r3 = (long) r3
            int r5 = a0.a.f10g0
            boolean r5 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r2)
            java.lang.String r6 = "file path is empty"
            java.lang.String r7 = "a"
            java.lang.String r8 = "normal"
            if (r5 == 0) goto L26
            ka.n7.g(r7, r6)
            goto L47
        L26:
            java.io.File r2 = com.huawei.openalliance.ad.ppskit.utils.x.l(r14, r2, r8)
            if (r2 != 0) goto L2d
            goto L47
        L2d:
            boolean r5 = r2.exists()
            if (r5 == 0) goto L47
            long r9 = r2.length()
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L47
            long r9 = r2.length()
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 > 0) goto L47
            r2 = r0
            goto L48
        L47:
            r2 = r1
        L48:
            if (r2 == 0) goto L6b
            boolean r2 = r13.E
            if (r2 == 0) goto L6c
            java.lang.String r2 = r13.f22645s
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r2)
            if (r3 == 0) goto L5b
            ka.n7.g(r7, r6)
        L59:
            r14 = r1
            goto L68
        L5b:
            java.io.File r14 = com.huawei.openalliance.ad.ppskit.utils.x.l(r14, r2, r8)
            if (r14 != 0) goto L62
            goto L59
        L62:
            java.lang.String r2 = r13.A
            boolean r14 = com.huawei.openalliance.ad.ppskit.utils.x.j(r2, r14)
        L68:
            if (r14 == 0) goto L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo.a(android.content.Context):boolean");
    }

    @OuterVisible
    public int getAutoPlayAreaRatio() {
        return this.F;
    }

    @OuterVisible
    public int getAutoPlayNetwork() {
        return this.f22650x;
    }

    @OuterVisible
    public int getAutoStopPlayAreaRatio() {
        return this.G;
    }

    @OuterVisible
    public int getDownloadNetwork() {
        return this.H;
    }

    @OuterVisible
    public String getSha256() {
        return this.A;
    }

    @OuterVisible
    public String getSoundSwitch() {
        return this.C;
    }

    @OuterVisible
    public int getTimeBeforeVideoAutoPlay() {
        return this.f22651z;
    }

    @OuterVisible
    public String getVideoAutoPlay() {
        return this.f22649w;
    }

    @OuterVisible
    public String getVideoAutoPlayWithSound() {
        return this.y;
    }

    @OuterVisible
    public String getVideoDownloadUrl() {
        return this.f22645s;
    }

    @OuterVisible
    public int getVideoDuration() {
        return this.f22647u;
    }

    @OuterVisible
    public int getVideoFileSize() {
        return this.f22648v;
    }

    @OuterVisible
    public int getVideoPlayMode() {
        return this.D;
    }

    @OuterVisible
    public Float getVideoRatio() {
        return this.I;
    }

    @OuterVisible
    public boolean isBackFromFullScreen() {
        return false;
    }

    @OuterVisible
    public boolean isCheckSha256() {
        return this.E;
    }

    public VideoInfo(com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo videoInfo) {
        this.f22649w = "y";
        this.y = "n";
        this.f22651z = 200;
        this.B = 0;
        this.C = "n";
        this.D = 1;
        this.F = 100;
        this.G = 90;
        this.H = 0;
        this.J = true;
        this.K = false;
        if (videoInfo != null) {
            this.f22645s = videoInfo.a();
            this.f22646t = videoInfo.a();
            this.f22647u = videoInfo.j();
            this.f22648v = videoInfo.m();
            if (TextUtils.equals(videoInfo.p(), "y") || TextUtils.equals(videoInfo.p(), "a")) {
                this.f22649w = "y";
            } else {
                this.f22649w = "n";
            }
            String s10 = videoInfo.s();
            this.y = s10;
            this.f22651z = videoInfo.t();
            this.A = videoInfo.u();
            this.D = videoInfo.v();
            this.C = s10;
            this.E = videoInfo.w() == 0;
            if (videoInfo.x() != null) {
                this.F = videoInfo.x().intValue();
            }
            if (videoInfo.y() != null) {
                this.G = videoInfo.y().intValue();
            }
            if (videoInfo.z() == 1) {
                this.H = 1;
            } else {
                this.H = 0;
            }
            if (TextUtils.equals(videoInfo.p(), "a")) {
                this.f22650x = 1;
            } else {
                this.f22650x = 0;
            }
            Float A = videoInfo.A();
            if (A == null) {
                A = null;
            } else if (A.floatValue() <= gl.Code) {
                A = Float.valueOf(1.7777778f);
            }
            this.I = A;
            this.J = "y".equalsIgnoreCase(videoInfo.B());
        }
    }
}
