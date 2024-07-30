package ab;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.ii;

/* loaded from: classes2.dex */
public final class b extends ii {
    public b(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    @Override // ka.ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r12 = this;
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r12.f31308b
            android.content.Context r1 = r12.f31307a
            java.lang.String r2 = "handle AppDeepLinkAction"
            java.lang.String r3 = "AppDeepLinkAction"
            ka.n7.e(r3, r2)
            r2 = 3
            r4 = 1
            if (r0 == 0) goto Lb5
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r5 = r0.j0()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            if (r5 != 0) goto L17
            goto Lb5
        L17:
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r5 = r0.j0()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r6 = r5.K()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r7 = r5.O()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            android.content.Intent r6 = com.huawei.openalliance.ad.ppskit.utils.o2.a(r1, r6, r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            if (r6 == 0) goto Laf
            boolean r7 = r1 instanceof android.app.Activity     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            if (r7 != 0) goto L32
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
        L32:
            android.content.ClipData r7 = oa.a.f33785b     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r6.setClipData(r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r1.startActivity(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r6 = r5.getPackageName()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r7 = 0
            if (r6 != 0) goto La1
            ka.ke r6 = new ka.ke     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            int r8 = r0.z0()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            ka.gi r8 = ka.zh.a(r8, r1)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r6.<init>(r1, r8, r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r6.f31382b = r0     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask r8 = new com.huawei.openalliance.ad.ppskit.download.app.AppDownloadTask     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.<init>()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r9 = 0
            r8.r(r9)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.D(r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.r0(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.p0(r5)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.G(r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r6 = r5.getDownloadUrl()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.p(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r6 = r5.getSafeDownloadUrl()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.u(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r6 = r5.getSha256()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.A(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            boolean r6 = r5.isCheckSha256()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.H(r6)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            long r10 = r5.getFileSize()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.l(r10)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.F(r9)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r8.I0(r9)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            ra.l r6 = ra.l.a(r1)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            r6.c(r8, r5)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
        La1:
            java.lang.String r5 = "appmarket"
            r12.f31309c = r5     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            java.lang.String r5 = "intentSuccess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            androidx.activity.n.K(r1, r0, r5, r6, r7)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            return r4
        Laf:
            java.lang.String r5 = "cannot find target activity"
            ka.n7.g(r3, r5)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            goto Lc7
        Lb5:
            java.lang.String r5 = "getAppInfo is null"
            ka.n7.e(r3, r5)     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            boolean r0 = r12.c()     // Catch: java.lang.Exception -> Lbf android.content.ActivityNotFoundException -> Lc2
            return r0
        Lbf:
            java.lang.String r5 = "handle intent url fail"
            goto Lc4
        Lc2:
            java.lang.String r5 = "activity not exist"
        Lc4:
            ka.n7.g(r3, r5)
        Lc7:
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r3 = r0.j0()
            java.lang.String r3 = r3.O()
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.o2.c(r1, r3)
            if (r3 == 0) goto Ld6
            r4 = 2
        Ld6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "intentFail"
            androidx.activity.n.K(r1, r0, r4, r2, r3)
            boolean r0 = r12.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.b.a():boolean");
    }
}
