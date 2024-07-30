package fb;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public final class j extends m {

    /* renamed from: e, reason: collision with root package name */
    public int f28345e;

    public j(Context context, AdContentData adContentData) {
        super(context, adContentData);
        this.f28345e = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    @Override // fb.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r6 = this;
            java.lang.String r0 = "OpenMiniPageAction"
            java.lang.String r1 = "handle OpenMiniPageAction"
            com.huawei.hms.ads.ex.V(r0, r1)
            com.huawei.openalliance.ad.inter.data.AdContentData r1 = r6.f28347b
            if (r1 == 0) goto Lea
            com.huawei.openalliance.ad.inter.data.AppInfo r2 = r1.c1()
            if (r2 != 0) goto L13
            goto Lea
        L13:
            com.huawei.openalliance.ad.inter.data.AppInfo r2 = r1.c1()
            if (r2 == 0) goto L2f
            android.content.Context r3 = r6.f28346a
            java.lang.String r4 = r2.q()
            boolean r3 = gb.b0.b(r3, r4)
            if (r3 == 0) goto L2f
            java.lang.String r1 = "app installed"
            com.huawei.hms.ads.ex.V(r0, r1)
            boolean r0 = r6.d()
            return r0
        L2f:
            com.huawei.openalliance.ad.download.app.a r3 = com.huawei.openalliance.ad.download.app.a.t()
            com.huawei.openalliance.ad.download.app.AppDownloadTask r3 = r3.p(r2)
            if (r3 == 0) goto L48
            java.lang.String r2 = r1.D()
            r3.G(r2)
            java.lang.String r2 = r1.b1()
            r3.r(r2)
            goto L90
        L48:
            if (r2 != 0) goto L4d
            r2 = 0
            r3 = r2
            goto L74
        L4d:
            com.huawei.openalliance.ad.download.app.AppDownloadTask r3 = new com.huawei.openalliance.ad.download.app.AppDownloadTask
            r3.<init>()
            r4 = 0
            r3.f(r4)
            r3.w(r2)
            java.lang.String r4 = r2.G()
            r3.e(r4)
            java.lang.String r4 = r2.p()
            r3.n(r4)
            long r4 = r2.k()
            r3.d(r4)
            r3.l()
            com.huawei.openalliance.ad.download.app.AppDownloadTask.u(r3, r2)
        L74:
            if (r3 == 0) goto Lac
            int r2 = r6.f28345e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.x(r2)
            r3.v(r1)
            java.lang.String r2 = r1.b1()
            r3.r(r2)
            java.lang.String r2 = r1.D()
            r3.G(r2)
        L90:
            java.lang.String r2 = r1.L()
            r3.t(r2)
            java.lang.String r2 = r1.u()
            r3.C(r2)
            java.lang.String r2 = r1.e0()
            r3.H(r2)
            int r2 = r1.f0()
            r3.s(r2)
        Lac:
            if (r3 != 0) goto Lb8
            java.lang.String r1 = "downloadTask is null"
            com.huawei.hms.ads.ex.V(r0, r1)
            boolean r0 = r6.d()
            return r0
        Lb8:
            java.lang.String r0 = r1.A0()
            r3.E(r0)
            java.lang.String r0 = r1.B0()
            r3.z(r0)
            int r0 = r6.f28345e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.x(r0)
            java.lang.String r0 = r1.E()
            r3.y(r0)
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.B(r1)
            java.lang.String r1 = "appminimarket"
            r6.f28348c = r1
            com.huawei.openalliance.ad.download.app.a r1 = com.huawei.openalliance.ad.download.app.a.t()
            r1.s(r3)
            return r0
        Lea:
            java.lang.String r1 = "getAppInfo is null"
            com.huawei.hms.ads.ex.V(r0, r1)
            boolean r0 = r6.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.j.a():boolean");
    }
}
