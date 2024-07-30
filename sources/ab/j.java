package ab;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.ii;

/* loaded from: classes2.dex */
public final class j extends ii {
    public j(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    @Override // ka.ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r8 = this;
            java.lang.String r0 = "SpecifiedAgdDownloadAction"
            java.lang.String r1 = "handle SpecifiedAgdDownloadAction"
            ka.n7.e(r0, r1)
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r8.f31308b
            if (r1 == 0) goto L101
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r2 = r1.j0()
            if (r2 != 0) goto L13
            goto L101
        L13:
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r2 = r1.j0()
            if (r2 == 0) goto L29
            android.content.Context r3 = r8.f31307a
            java.lang.String r4 = r2.getPackageName()
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.o2.c(r3, r4)
            if (r3 == 0) goto L29
            java.lang.String r1 = "app installed"
            goto L103
        L29:
            sa.b r3 = sa.b.q()
            com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask r3 = r3.t(r2)
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L7a
            r3.s(r5)
            r3.x(r5)
            java.lang.String r2 = r1.p2()
            r3.z(r2)
            java.lang.String r2 = r1.v0()
            r3.A(r2)
            java.lang.String r2 = r1.h()
            r3.E(r2)
            java.lang.String r2 = r1.j2()
            r3.w(r2)
            boolean r2 = r1.K0()
            r3.u(r2)
            java.lang.String r2 = r3.D()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto Le2
            java.lang.String r2 = r1.h1()
            r3.B(r2)
            java.lang.String r2 = r1.n1()
            r3.C(r2)
            goto Le2
        L7a:
            if (r2 != 0) goto L7f
            r2 = 0
            r3 = r2
            goto La6
        L7f:
            com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask r3 = new com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask
            r3.<init>()
            r6 = 0
            r3.setAllowedMobileNetowrk(r6)
            r3.r(r2)
            java.lang.String r6 = r2.getDownloadUrl()
            r3.h(r6)
            java.lang.String r6 = r2.getSha256()
            r3.i(r6)
            long r6 = r2.getFileSize()
            r3.a(r6)
            r3.d()
            com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask.q(r3, r2)
        La6:
            if (r3 == 0) goto Lf0
            r3.s(r5)
            r3.x(r5)
            r3.p(r1)
            java.lang.String r2 = r1.v0()
            r3.A(r2)
            java.lang.String r2 = r1.p2()
            r3.z(r2)
            java.lang.String r2 = r1.h()
            r3.E(r2)
            java.lang.String r2 = r1.j2()
            r3.w(r2)
            java.lang.String r2 = r1.h1()
            r3.B(r2)
            java.lang.String r2 = r1.n1()
            r3.C(r2)
            boolean r2 = r1.K0()
            r3.u(r2)
        Le2:
            java.lang.String r2 = r1.Z0()
            r3.H(r2)
            int r1 = r1.a1()
            r3.v(r1)
        Lf0:
            if (r3 != 0) goto Lf5
            java.lang.String r1 = "downloadTask is null"
            goto L103
        Lf5:
            java.lang.String r0 = "appmarket"
            r8.f31309c = r0
            sa.b r0 = sa.b.q()
            r0.r(r3)
            return r4
        L101:
            java.lang.String r1 = "getAppInfo is null"
        L103:
            ka.n7.e(r0, r1)
            boolean r0 = r8.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.j.a():boolean");
    }
}
